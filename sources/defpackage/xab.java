package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextFieldValueChanger.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b7\u00108J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u000bR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b \u0010&\"\u0004\b'\u0010(R.\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R.\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010,\u001a\u0004\b+\u0010.\"\u0004\b2\u00100R.\u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000b0*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010,\u001a\u0004\b$\u0010.\"\u0004\b5\u00100¨\u00069"}, d2 = {"Lxab;", "", "", "iterationValue", "Lkotlin/Pair;", "", "", c.a, "startValue", "endValue", "textWithPosition", "", Image.TYPE_MEDIUM, Image.TYPE_HIGH, "p", "", "a", "Z", "withAnimation", "", "b", "J", "getDuration", "()J", "duration", "I", "getHighlightEndColor", "()I", "k", "(I)V", "highlightEndColor", "Landroid/animation/ValueAnimator;", DateTokenConverter.CONVERTER_KEY, "Landroid/animation/ValueAnimator;", "moneyChangedAnimator", "Lkotlin/Function0;", e.a, "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "j", "(Lkotlin/jvm/functions/Function0;)V", "getTextFieldFun", "Lkotlin/Function1;", "f", "Lkotlin/jvm/functions/Function1;", "g", "()Lkotlin/jvm/functions/Function1;", "o", "(Lkotlin/jvm/functions/Function1;)V", "updateValueFun", "n", "updateTextFieldFun", "Landroid/text/Spannable;", "l", "setTextFieldFun", "<init>", "(ZJI)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xab  reason: default package */
/* loaded from: classes.dex */
public final class xab {
    private final boolean a;
    private final long b;
    private int c;
    private ValueAnimator d;
    public Function0<String> e;
    public Function1<? super Double, String> f;
    public Function1<? super String, String> g;
    public Function1<? super Spannable, Unit> h;

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xab$a */
    /* loaded from: classes.dex */
    public static final class a implements Animator.AnimatorListener {
        final /* synthetic */ double b;
        final /* synthetic */ double c;
        final /* synthetic */ ea9 d;

        public a(double d, double d2, ea9 ea9Var) {
            this.b = d;
            this.c = d2;
            this.d = ea9Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animator");
            xab.this.m(this.b, this.c, (Pair) this.d.a);
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
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xab$b */
    /* loaded from: classes.dex */
    public static final class b implements Animator.AnimatorListener {
        final /* synthetic */ double b;
        final /* synthetic */ double c;
        final /* synthetic */ ea9 d;

        public b(double d, double d2, ea9 ea9Var) {
            this.b = d;
            this.c = d2;
            this.d = ea9Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animator");
            xab.this.m(this.b, this.c, (Pair) this.d.a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animator");
        }
    }

    public xab(boolean z, long j, int i) {
        this.a = z;
        this.b = j;
        this.c = i;
    }

    private final Pair<Integer, String> c(double d) {
        int Z;
        String invoke = g().invoke(Double.valueOf(d));
        String invoke2 = f().invoke(invoke);
        Z = m0b.Z(invoke2, invoke, 0, false, 6, null);
        e().invoke(new SpannableString(invoke2));
        return new Pair<>(Integer.valueOf(Z), invoke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, kotlin.Pair] */
    public static final void i(ea9 ea9Var, xab xabVar, ValueAnimator valueAnimator) {
        z65.h(ea9Var, "$textWithPosition");
        z65.h(xabVar, "this$0");
        z65.h(valueAnimator, "value");
        Object animatedValue = valueAnimator.getAnimatedValue();
        z65.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ea9Var.a = xabVar.c(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(double d, double d2, Pair<Integer, String> pair) {
        if (d > d2) {
            String invoke = d().invoke();
            SpannableString spannableString = new SpannableString(invoke);
            if (invoke.length() > pair.c().intValue()) {
                spannableString.setSpan(new ForegroundColorSpan(this.c), pair.c().intValue(), pair.c().intValue() + pair.d().length(), 33);
                e().invoke(spannableString);
            }
        }
    }

    public final Function0<String> d() {
        Function0<String> function0 = this.e;
        if (function0 != null) {
            return function0;
        }
        z65.z("getTextFieldFun");
        return null;
    }

    public final Function1<Spannable, Unit> e() {
        Function1 function1 = this.h;
        if (function1 != null) {
            return function1;
        }
        z65.z("setTextFieldFun");
        return null;
    }

    public final Function1<String, String> f() {
        Function1 function1 = this.g;
        if (function1 != null) {
            return function1;
        }
        z65.z("updateTextFieldFun");
        return null;
    }

    public final Function1<Double, String> g() {
        Function1 function1 = this.f;
        if (function1 != null) {
            return function1;
        }
        z65.z("updateValueFun");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, kotlin.Pair] */
    public final void h(double d, double d2) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.d) != null) {
            valueAnimator.cancel();
        }
        final ea9 ea9Var = new ea9();
        ea9Var.a = new Pair(0, "");
        if (this.a && d2 != d) {
            ValueAnimator ofInt = ValueAnimator.ofInt((int) d, (int) d2);
            ofInt.setDuration(this.b);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wab
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    xab.i(ea9.this, this, valueAnimator3);
                }
            });
            z65.e(ofInt);
            ofInt.addListener(new b(d, d2, ea9Var));
            ofInt.addListener(new a(d, d2, ea9Var));
            this.d = ofInt;
            ofInt.start();
            return;
        }
        ?? c = c(d2);
        ea9Var.a = c;
        m(d, d2, c);
    }

    public final void j(Function0<String> function0) {
        z65.h(function0, "<set-?>");
        this.e = function0;
    }

    public final void k(int i) {
        this.c = i;
    }

    public final void l(Function1<? super Spannable, Unit> function1) {
        z65.h(function1, "<set-?>");
        this.h = function1;
    }

    public final void n(Function1<? super String, String> function1) {
        z65.h(function1, "<set-?>");
        this.g = function1;
    }

    public final void o(Function1<? super Double, String> function1) {
        z65.h(function1, "<set-?>");
        this.f = function1;
    }

    public final void p() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public /* synthetic */ xab(boolean z, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 1500L : j, i);
    }
}
