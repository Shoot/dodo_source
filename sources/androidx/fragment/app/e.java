package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
class e {
    private static int a(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(@NonNull Context context, @NonNull Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int a2 = a(fragment, z, z2);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i = sy8.c;
            if (viewGroup.getTag(i) != null) {
                fragment.mContainer.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, a2);
        if (onCreateAnimation != null) {
            return new a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, a2);
        if (onCreateAnimator != null) {
            return new a(onCreateAnimator);
        }
        if (a2 == 0 && nextTransition != 0) {
            a2 = d(context, nextTransition, z);
        }
        if (a2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a2);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, a2);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e2) {
                if (!equals) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a2);
                    if (loadAnimation2 != null) {
                        return new a(loadAnimation2);
                    }
                } else {
                    throw e2;
                }
            }
        }
        return null;
    }

    private static int c(@NonNull Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(@NonNull Context context, int i, boolean z) {
        if (i != 4097) {
            if (i != 8194) {
                if (i != 8197) {
                    if (i != 4099) {
                        if (i != 4100) {
                            return -1;
                        }
                        if (z) {
                            return c(context, 16842936);
                        }
                        return c(context, 16842937);
                    } else if (z) {
                        return nv8.c;
                    } else {
                        return nv8.d;
                    }
                } else if (z) {
                    return c(context, 16842938);
                } else {
                    return c(context, 16842939);
                }
            } else if (z) {
                return nv8.a;
            } else {
                return nv8.b;
            }
        } else if (z) {
            return nv8.e;
        } else {
            return nv8.f;
        }
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    static class a {
        public final Animation a;
        public final Animator b;

        a(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    static class b extends AnimationSet implements Runnable {
        private final ViewGroup a;
        private final View b;
        private boolean c;
        private boolean d;
        private boolean e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.e = true;
            this.a = viewGroup;
            this.b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, @NonNull Transformation transformation) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.c = true;
                z97.a(this.a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.c && this.e) {
                this.e = false;
                this.a.post(this);
                return;
            }
            this.a.endViewTransition(this.b);
            this.d = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, @NonNull Transformation transformation, float f) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.c = true;
                z97.a(this.a, this);
            }
            return true;
        }
    }
}
