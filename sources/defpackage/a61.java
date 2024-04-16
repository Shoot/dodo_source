package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CheckoutSharedTransition.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\t\b\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\n \n*\u0004\u0018\u00010\r0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J(\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0016¨\u0006$"}, d2 = {"La61;", "Landroid/transition/Transition;", "Landroid/view/View;", "view", "Landroid/animation/Animator;", Image.TYPE_HIGH, "", "startHeight", "endHeight", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "i", "g", "Landroid/view/Display;", DateTokenConverter.CONVERTER_KEY, e.a, "f", "", "message", "", com.huawei.hms.opendevice.c.a, "", "getTransitionProperties", "()[Ljava/lang/String;", "Landroid/transition/TransitionValues;", "transitionValues", "captureStartValues", "captureEndValues", "Landroid/view/ViewGroup;", "sceneRoot", "startValues", "endValues", "createAnimator", "<init>", "()V", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
@TargetApi(21)
/* renamed from: a61  reason: default package */
/* loaded from: classes4.dex */
public final class a61 extends Transition {
    public static final a a = new a(null);
    private static final Logger b = LoggerFactory.getLogger("CheckoutTransition");
    private static final String[] c = {"heightTransition:height", "heightTransition:viewType"};

    /* compiled from: CheckoutSharedTransition.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"La61$a;", "", "", "ANIMATION_DURATION", "J", "", "DEBUG", "Z", "", "PROP_HEIGHT", "Ljava/lang/String;", "PROP_VIEW_TYPE", "", "TransitionProperties", "[Ljava/lang/String;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: a61$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: a61$b */
    /* loaded from: classes4.dex */
    public static final class b implements Animator.AnimatorListener {
        final /* synthetic */ TransitionValues a;

        public b(TransitionValues transitionValues) {
            this.a = transitionValues;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animator");
            this.a.view.setAlpha(0.0f);
        }
    }

    /* compiled from: CheckoutSharedTransition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"a61$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: a61$c */
    /* loaded from: classes4.dex */
    public static final class c extends AnimatorListenerAdapter {
        final /* synthetic */ View a;
        final /* synthetic */ a61 b;

        c(View view, a61 a61Var) {
            this.a = view;
            this.b = a61Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view;
            z65.h(animator, "animation");
            ViewParent parent = this.a.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
            if (view != null && view.getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    view.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
    }

    private final Display d(View view) {
        Object systemService = view.getContext().getSystemService("window");
        z65.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return ((WindowManager) systemService).getDefaultDisplay();
    }

    private final int e(View view) {
        Point point = new Point();
        d(view).getSize(point);
        int i = point.y;
        jx9 jx9Var = jx9.a;
        Context context = view.getContext();
        z65.g(context, "getContext(...)");
        return i - jx9Var.f(context);
    }

    private final int f(View view) {
        Point point = new Point();
        d(view).getSize(point);
        return point.x;
    }

    private final int g(View view) {
        int h;
        view.measure(View.MeasureSpec.makeMeasureSpec(f(view), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        h = i.h(view.getMeasuredHeight(), e(view));
        return h;
    }

    private final Animator h(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        z65.g(ofFloat, "apply(...)");
        return ofFloat;
    }

    private final ValueAnimator i(int i, int i2, final View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(400L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z51
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                a61.j(view, this, valueAnimator);
            }
        });
        ofInt.addListener(new c(view, this));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(View view, a61 a61Var, ValueAnimator valueAnimator) {
        View view2;
        z65.h(view, "$view");
        z65.h(a61Var, "this$0");
        z65.h(valueAnimator, "animation");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null && view2.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                z65.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Integer) animatedValue).intValue();
                view2.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        z65.h(transitionValues, "transitionValues");
        Map map = transitionValues.values;
        z65.g(map, "values");
        ViewParent parent = transitionValues.view.getParent();
        z65.f(parent, "null cannot be cast to non-null type android.view.View");
        map.put("heightTransition:height", Integer.valueOf(g((View) parent)));
        Map map2 = transitionValues.values;
        z65.g(map2, "values");
        map2.put("heightTransition:viewType", "end");
        c("captureEndValues; " + transitionValues);
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        View view;
        z65.h(transitionValues, "transitionValues");
        Map map = transitionValues.values;
        z65.g(map, "values");
        map.put("heightTransition:height", Integer.valueOf(transitionValues.view.getHeight()));
        Map map2 = transitionValues.values;
        z65.g(map2, "values");
        map2.put("heightTransition:viewType", "start");
        ViewParent parent = transitionValues.view.getParent();
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = view.getHeight();
                view.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        c("captureStartValues; " + transitionValues);
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            ArrayList arrayList = new ArrayList();
            Object obj = transitionValues.values.get("heightTransition:height");
            z65.f(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = transitionValues2.values.get("heightTransition:height");
            z65.f(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) obj2).intValue();
            View view = transitionValues2.view;
            z65.g(view, "view");
            ValueAnimator i = i(intValue, intValue2, view);
            z65.g(i, "prepareHeightAnimator(...)");
            arrayList.add(i);
            View view2 = transitionValues2.view;
            z65.g(view2, "view");
            arrayList.add(h(view2));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new b(transitionValues));
            return animatorSet;
        }
        return null;
    }

    @Override // android.transition.Transition
    public String[] getTransitionProperties() {
        return c;
    }

    private final void c(String str) {
    }
}
