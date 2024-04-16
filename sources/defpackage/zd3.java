package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Effects.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\n\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a@\u0010\u0010\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00050\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlin/Function0;", "", "effect", c.a, "(Lkotlin/jvm/functions/Function0;Lqn1;I)V", "", "key1", "Lkotlin/Function1;", "Ld43;", "Lc43;", "a", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lqn1;I)V", "Lkotlin/Function2;", "Lqx1;", "Lcv1;", "block", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lqn1;I)V", "Ld43;", "InternalDisposableEffectScope", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: zd3  reason: default package */
/* loaded from: classes.dex */
public final class zd3 {
    private static final d43 a = new d43();

    public static final void a(Object obj, Function1<? super d43, ? extends c43> function1, qn1 qn1Var, int i) {
        z65.h(function1, "effect");
        qn1Var.w(-1371986847);
        if (tn1.K()) {
            tn1.V(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:151)");
        }
        qn1Var.w(1157296644);
        boolean K = qn1Var.K(obj);
        Object x = qn1Var.x();
        if (K || x == qn1.a.a()) {
            qn1Var.p(new b43(function1));
        }
        qn1Var.J();
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
    }

    public static final void b(Object obj, Function2<? super qx1, ? super cv1<? super Unit>, ? extends Object> function2, qn1 qn1Var, int i) {
        z65.h(function2, "block");
        qn1Var.w(1179185413);
        if (tn1.K()) {
            tn1.V(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:333)");
        }
        CoroutineContext m = qn1Var.m();
        qn1Var.w(1157296644);
        boolean K = qn1Var.K(obj);
        Object x = qn1Var.x();
        if (K || x == qn1.a.a()) {
            qn1Var.p(new dm5(m, function2));
        }
        qn1Var.J();
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
    }

    public static final void c(Function0<Unit> function0, qn1 qn1Var, int i) {
        z65.h(function0, "effect");
        qn1Var.w(-1288466761);
        if (tn1.K()) {
            tn1.V(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:45)");
        }
        qn1Var.t(function0);
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
    }
}
