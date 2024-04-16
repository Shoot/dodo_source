package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import defpackage.o3b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ShakeListeners.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0015"}, d2 = {"Lsga;", "Lo3b;", "Landroid/view/View;", "view", "Landroid/animation/ObjectAnimator;", "f", "", "g", "", "progress", com.huawei.hms.opendevice.c.a, "", "isCompleted", "a", "b", "Landroid/animation/ObjectAnimator;", "animator", "F", "degree", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sga  reason: default package */
/* loaded from: classes2.dex */
public final class sga implements o3b {
    public static final a c = new a(null);
    public static final int d = 8;
    private ObjectAnimator a;
    private float b = 1.0f;

    /* compiled from: ShakeListeners.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lsga$a;", "", "", "AMPLITUDE", "F", "", "CHANGE_GAP", "D", "START_SHAKE_ANGLE", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sga$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sga$b */
    /* loaded from: classes2.dex */
    public static final class b implements Animator.AnimatorListener {
        final /* synthetic */ View a;

        public b(View view) {
            this.a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animator");
            this.a.setRotation(0.0f);
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
    /* renamed from: sga$c */
    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener {
        final /* synthetic */ View a;

        public c(View view) {
            this.a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animator");
            this.a.setRotation(0.0f);
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
    /* renamed from: sga$d */
    /* loaded from: classes2.dex */
    public static final class d implements Animator.AnimatorListener {
        final /* synthetic */ ObjectAnimator b;
        final /* synthetic */ ba9 c;

        public d(ObjectAnimator objectAnimator, ba9 ba9Var) {
            this.b = objectAnimator;
            this.c = ba9Var;
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
            if (sga.this.b == 0.0f) {
                this.b.end();
                return;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            if (Math.abs(this.c.a - sga.this.b) > 0.08d) {
                animator.end();
                objectAnimator.setFloatValues(-sga.this.b, sga.this.b);
                this.c.a = sga.this.b;
                animator.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animator");
        }
    }

    private final ObjectAnimator f(View view) {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        float f = this.b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", -f, f);
        ba9 ba9Var = new ba9();
        ba9Var.a = this.b;
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        z65.e(ofFloat);
        ofFloat.addListener(new d(ofFloat, ba9Var));
        ofFloat.addListener(new b(view));
        ofFloat.addListener(new c(view));
        this.a = ofFloat;
        return ofFloat;
    }

    private final void g() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.a = null;
        this.b = 1.0f;
    }

    @Override // defpackage.o3b
    public void a(boolean z) {
        g();
    }

    @Override // defpackage.o3b
    public void b() {
        g();
    }

    @Override // defpackage.o3b
    public void c(View view, float f) {
        ObjectAnimator f2;
        z65.h(view, "view");
        if (this.a == null && (f2 = f(view)) != null) {
            f2.start();
        }
        this.b = 1 + (f * 2.5f);
    }

    @Override // defpackage.o3b
    public void d(View view) {
        o3b.a.a(this, view);
    }
}
