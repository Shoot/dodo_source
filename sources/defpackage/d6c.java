package defpackage;

import android.os.Handler;
import android.view.View;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import defpackage.l95;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: WindowRecomposer.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Ld6c;", "", "Landroid/view/View;", "rootView", "Lh99;", "a", "(Landroid/view/View;)Lh99;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lc6c;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "factory", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: d6c  reason: default package */
/* loaded from: classes.dex */
public final class d6c {
    public static final d6c a = new d6c();
    private static final AtomicReference<c6c> b = new AtomicReference<>(c6c.a.a());
    public static final int c = 8;

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"d6c$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: d6c$a */
    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ l95 a;

        a(l95 l95Var) {
            this.a = l95Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            z65.h(view, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            z65.h(view, "v");
            view.removeOnAttachStateChangeListener(this);
            l95.a.a(this.a, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {233}, m = "invokeSuspend")
    /* renamed from: d6c$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ h99 b;
        final /* synthetic */ View c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h99 h99Var, View view, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.b = h99Var;
            this.c = view;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            View view;
            d = c75.d();
            int i = this.a;
            try {
                if (i != 0) {
                    if (i == 1) {
                        vk9.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    h99 h99Var = this.b;
                    this.a = 1;
                    if (h99Var.f0(this) == d) {
                        return d;
                    }
                }
                if (WindowRecomposer_androidKt.f(view) == this.b) {
                    WindowRecomposer_androidKt.i(this.c, null);
                }
                return Unit.a;
            } finally {
                if (WindowRecomposer_androidKt.f(this.c) == this.b) {
                    WindowRecomposer_androidKt.i(this.c, null);
                }
            }
        }
    }

    private d6c() {
    }

    public final h99 a(View view) {
        l95 d;
        z65.h(view, "rootView");
        h99 a2 = b.get().a(view);
        WindowRecomposer_androidKt.i(view, a2);
        lg4 lg4Var = lg4.a;
        Handler handler = view.getHandler();
        z65.g(handler, "rootView.handler");
        d = sh0.d(lg4Var, gm4.b(handler, "windowRecomposer cleanup").r0(), null, new b(a2, view, null), 2, null);
        view.addOnAttachStateChangeListener(new a(d));
        return a2;
    }
}
