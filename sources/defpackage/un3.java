package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Handler;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import androidx.fragment.app.Fragment;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\t\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\f\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\f\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010\u001a\u0012\u0010\u0014\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0000\u001a\"\u0010\u0019\u001a\u00020\u0001\"\b\b\u0000\u0010\u0016*\u00020\u0015*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u001a\u0016\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000\u001a\u0018\u0010 \u001a\u00020\u0001*\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e\u001a\n\u0010!\u001a\u00020\u0010*\u00020\u0000¨\u0006\""}, d2 = {"Landroid/view/View;", "", "k", e.a, "", "revealDurationMillis", "i", "disappearDurationMillis", c.a, "", "isShouldBeVisible", "o", "Landroid/widget/ImageView;", "q", "p", "Landroid/widget/ViewAnimator;", "", "childResId", "l", "childView", Image.TYPE_MEDIUM, "Landroid/app/Activity;", "T", "Ljava/lang/Class;", "clazz", "n", "topElement", "bottomElement", "b", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function0;", "action", "g", "f", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: un3  reason: default package */
/* loaded from: classes.dex */
public final class un3 {

    /* compiled from: Extensions.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"un3$a", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: un3$a */
    /* loaded from: classes.dex */
    public static final class a implements Animator.AnimatorListener {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animation");
            animator.end();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animation");
            if (this.a.hasOnClickListeners()) {
                this.a.setClickable(true);
            }
            this.a.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            z65.h(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animation");
            if (this.a.hasOnClickListeners()) {
                this.a.setClickable(false);
            }
        }
    }

    /* compiled from: Extensions.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"un3$b", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: un3$b */
    /* loaded from: classes.dex */
    public static final class b implements Animator.AnimatorListener {
        final /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animation");
            animator.end();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animation");
            if (this.a.hasOnClickListeners()) {
                this.a.setClickable(true);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            z65.h(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animation");
            if (this.a.hasOnClickListeners()) {
                this.a.setClickable(false);
            }
            this.a.setVisibility(0);
        }
    }

    public static final int b(View view, View view2) {
        z65.h(view, "topElement");
        z65.h(view2, "bottomElement");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        return iArr2[1] - iArr[1];
    }

    public static final void c(View view, long j) {
        z65.h(view, "<this>");
        view.animate().cancel();
        if (view.getVisibility() == 8) {
            return;
        }
        view.setAlpha(1.0f);
        view.animate().alphaBy(1.0f).alpha(0.0f).setDuration(j).setListener(new a(view)).setInterpolator(new LinearInterpolator()).start();
    }

    public static /* synthetic */ void d(View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 400;
        }
        c(view, j);
    }

    public static final void e(View view) {
        z65.h(view, "<this>");
        o(view, false);
    }

    public static final int f(View view) {
        z65.h(view, "<this>");
        jx9 jx9Var = jx9.a;
        Context context = view.getContext();
        z65.g(context, "getContext(...)");
        view.measure(View.MeasureSpec.makeMeasureSpec(jx9Var.e(context), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static final void g(final Fragment fragment, final Function0<Unit> function0) {
        z65.h(fragment, "<this>");
        z65.h(function0, "action");
        new Handler().post(new Runnable() { // from class: sn3
            @Override // java.lang.Runnable
            public final void run() {
                un3.h(Fragment.this, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Fragment fragment, Function0 function0) {
        z65.h(fragment, "$this_postIfUiCorrect");
        z65.h(function0, "$action");
        if (fragment.getActivity() != null) {
            function0.invoke();
        }
    }

    public static final void i(View view, long j) {
        z65.h(view, "<this>");
        view.animate().cancel();
        if (view.getVisibility() == 0) {
            return;
        }
        view.setAlpha(0.0f);
        view.animate().alphaBy(0.0f).alpha(1.0f).setDuration(j).setListener(new b(view)).setInterpolator(new LinearInterpolator()).start();
    }

    public static /* synthetic */ void j(View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 400;
        }
        i(view, j);
    }

    public static final void k(View view) {
        z65.h(view, "<this>");
        o(view, true);
    }

    public static final void l(ViewAnimator viewAnimator, int i) {
        z65.h(viewAnimator, "<this>");
        View findViewById = viewAnimator.findViewById(i);
        z65.g(findViewById, "findViewById(...)");
        m(viewAnimator, findViewById);
    }

    public static final void m(ViewAnimator viewAnimator, View view) {
        z65.h(viewAnimator, "<this>");
        z65.h(view, "childView");
        for (View view2 : dzb.b(viewAnimator)) {
            e(view2);
        }
        if (viewAnimator.indexOfChild(view) != -1) {
            viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(view));
            return;
        }
        throw new IllegalStateException(("View not found " + view + " ").toString());
    }

    public static final <T extends Activity> void n(Activity activity, Class<T> cls) {
        z65.h(activity, "<this>");
        z65.h(cls, "clazz");
        activity.startActivity(new Intent((Context) activity, (Class<?>) cls));
        activity.finish();
    }

    public static final void o(View view, boolean z) {
        z65.h(view, "<this>");
        if (view.getVisibility() != 0 || !z) {
            int i = 8;
            if (view.getVisibility() == 8 && !z) {
                return;
            }
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public static final void p(ImageView imageView) {
        z65.h(imageView, "<this>");
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.0f);
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public static final void q(ImageView imageView) {
        z65.h(imageView, "<this>");
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }
}
