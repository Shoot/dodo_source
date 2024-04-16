package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: CompositionLocal.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0011¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\u000e"}, d2 = {"Lx93;", "T", "Lxr8;", "value", "Lcua;", "b", "(Ljava/lang/Object;Lqn1;I)Lcua;", "Lppa;", "Lppa;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lppa;Lkotlin/jvm/functions/Function0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: x93  reason: default package */
/* loaded from: classes.dex */
public final class x93<T> extends xr8<T> {
    private final ppa<T> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x93(ppa<T> ppaVar, Function0<? extends T> function0) {
        super(function0);
        z65.h(ppaVar, "policy");
        z65.h(function0, "defaultFactory");
        this.b = ppaVar;
    }

    @Override // defpackage.lo1
    public cua<T> b(T t, qn1 qn1Var, int i) {
        qn1Var.w(-84026900);
        if (tn1.K()) {
            tn1.V(-84026900, i, -1, "androidx.compose.runtime.DynamicProvidableCompositionLocal.provided (CompositionLocal.kt:125)");
        }
        qn1Var.w(-492369756);
        Object x = qn1Var.x();
        if (x == qn1.a.a()) {
            x = qpa.d(t, this.b);
            qn1Var.p(x);
        }
        qn1Var.J();
        er6 er6Var = (er6) x;
        er6Var.setValue(t);
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
        return er6Var;
    }
}
