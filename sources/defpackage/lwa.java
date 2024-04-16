package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: CompositionLocal.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0011¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Llwa;", "T", "Lxr8;", "value", "Lcua;", "b", "(Ljava/lang/Object;Lqn1;I)Lcua;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: lwa  reason: default package */
/* loaded from: classes.dex */
public final class lwa<T> extends xr8<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwa(Function0<? extends T> function0) {
        super(function0);
        z65.h(function0, "defaultFactory");
    }

    @Override // defpackage.lo1
    public cua<T> b(T t, qn1 qn1Var, int i) {
        qn1Var.w(-1121811719);
        if (tn1.K()) {
            tn1.V(-1121811719, i, -1, "androidx.compose.runtime.StaticProvidableCompositionLocal.provided (CompositionLocal.kt:139)");
        }
        owa owaVar = new owa(t);
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
        return owaVar;
    }
}
