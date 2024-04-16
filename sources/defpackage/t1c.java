package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import defpackage.clb;
/* compiled from: Visibility.java */
/* renamed from: t1c  reason: default package */
/* loaded from: classes.dex */
public abstract class t1c extends clb {
    private static final String[] W4 = {"android:visibility:visibility", "android:visibility:parent"};
    private int V4 = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Visibility.java */
    /* renamed from: t1c$a */
    /* loaded from: classes.dex */
    public class a extends glb {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ View c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        @Override // defpackage.clb.f
        public void b(@NonNull clb clbVar) {
            this.c.setTag(rx8.save_overlay_view, null);
            hzb.a(this.a).d(this.b);
            clbVar.T(this);
        }

        @Override // defpackage.glb, defpackage.clb.f
        public void d(@NonNull clb clbVar) {
            if (this.b.getParent() == null) {
                hzb.a(this.a).c(this.b);
            } else {
                t1c.this.cancel();
            }
        }

        @Override // defpackage.glb, defpackage.clb.f
        public void e(@NonNull clb clbVar) {
            hzb.a(this.a).d(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* renamed from: t1c$c */
    /* loaded from: classes.dex */
    public static class c {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        c() {
        }
    }

    private void h0(mlb mlbVar) {
        mlbVar.a.put("android:visibility:visibility", Integer.valueOf(mlbVar.b.getVisibility()));
        mlbVar.a.put("android:visibility:parent", mlbVar.b.getParent());
        int[] iArr = new int[2];
        mlbVar.b.getLocationOnScreen(iArr);
        mlbVar.a.put("android:visibility:screenLocation", iArr);
    }

    private c i0(mlb mlbVar, mlb mlbVar2) {
        c cVar = new c();
        cVar.a = false;
        cVar.b = false;
        if (mlbVar != null && mlbVar.a.containsKey("android:visibility:visibility")) {
            cVar.c = ((Integer) mlbVar.a.get("android:visibility:visibility")).intValue();
            cVar.e = (ViewGroup) mlbVar.a.get("android:visibility:parent");
        } else {
            cVar.c = -1;
            cVar.e = null;
        }
        if (mlbVar2 != null && mlbVar2.a.containsKey("android:visibility:visibility")) {
            cVar.d = ((Integer) mlbVar2.a.get("android:visibility:visibility")).intValue();
            cVar.f = (ViewGroup) mlbVar2.a.get("android:visibility:parent");
        } else {
            cVar.d = -1;
            cVar.f = null;
        }
        if (mlbVar != null && mlbVar2 != null) {
            int i = cVar.c;
            int i2 = cVar.d;
            if (i == i2 && cVar.e == cVar.f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.b = false;
                    cVar.a = true;
                } else if (i2 == 0) {
                    cVar.b = true;
                    cVar.a = true;
                }
            } else if (cVar.f == null) {
                cVar.b = false;
                cVar.a = true;
            } else if (cVar.e == null) {
                cVar.b = true;
                cVar.a = true;
            }
        } else if (mlbVar == null && cVar.d == 0) {
            cVar.b = true;
            cVar.a = true;
        } else if (mlbVar2 == null && cVar.c == 0) {
            cVar.b = false;
            cVar.a = true;
        }
        return cVar;
    }

    @Override // defpackage.clb
    public String[] H() {
        return W4;
    }

    @Override // defpackage.clb
    public boolean J(mlb mlbVar, mlb mlbVar2) {
        if (mlbVar == null && mlbVar2 == null) {
            return false;
        }
        if (mlbVar != null && mlbVar2 != null && mlbVar2.a.containsKey("android:visibility:visibility") != mlbVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c i0 = i0(mlbVar, mlbVar2);
        if (!i0.a) {
            return false;
        }
        if (i0.c != 0 && i0.d != 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.clb
    public void g(@NonNull mlb mlbVar) {
        h0(mlbVar);
    }

    @Override // defpackage.clb
    public void j(@NonNull mlb mlbVar) {
        h0(mlbVar);
    }

    public Animator j0(ViewGroup viewGroup, mlb mlbVar, int i, mlb mlbVar2, int i2) {
        if ((this.V4 & 1) != 1 || mlbVar2 == null) {
            return null;
        }
        if (mlbVar == null) {
            View view = (View) mlbVar2.b.getParent();
            if (i0(v(view, false), I(view, false)).a) {
                return null;
            }
        }
        return k0(viewGroup, mlbVar2.b, mlbVar, mlbVar2);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, mlb mlbVar, mlb mlbVar2);

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
        if (r17.w != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator l0(android.view.ViewGroup r18, defpackage.mlb r19, int r20, defpackage.mlb r21, int r22) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t1c.l0(android.view.ViewGroup, mlb, int, mlb, int):android.animation.Animator");
    }

    public abstract Animator m0(ViewGroup viewGroup, View view, mlb mlbVar, mlb mlbVar2);

    @Override // defpackage.clb
    public Animator o(@NonNull ViewGroup viewGroup, mlb mlbVar, mlb mlbVar2) {
        c i0 = i0(mlbVar, mlbVar2);
        if (i0.a) {
            if (i0.e != null || i0.f != null) {
                if (i0.b) {
                    return j0(viewGroup, mlbVar, i0.c, mlbVar2, i0.d);
                }
                return l0(viewGroup, mlbVar, i0.c, mlbVar2, i0.d);
            }
            return null;
        }
        return null;
    }

    public void o0(int i) {
        if ((i & (-4)) == 0) {
            this.V4 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* renamed from: t1c$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements clb.f {
        private final View a;
        private final int b;
        private final ViewGroup c;
        private final boolean d;
        private boolean e;
        boolean f = false;

        b(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            g(true);
        }

        private void f() {
            if (!this.f) {
                a1c.h(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) {
            ViewGroup viewGroup;
            if (this.d && this.e != z && (viewGroup = this.c) != null) {
                this.e = z;
                hzb.c(viewGroup, z);
            }
        }

        @Override // defpackage.clb.f
        public void b(@NonNull clb clbVar) {
            f();
            clbVar.T(this);
        }

        @Override // defpackage.clb.f
        public void d(@NonNull clb clbVar) {
            g(true);
        }

        @Override // defpackage.clb.f
        public void e(@NonNull clb clbVar) {
            g(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (!this.f) {
                a1c.h(this.a, this.b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (!this.f) {
                a1c.h(this.a, 0);
            }
        }

        @Override // defpackage.clb.f
        public void a(@NonNull clb clbVar) {
        }

        @Override // defpackage.clb.f
        public void c(@NonNull clb clbVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
