package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ5\u0010\b\u001a\u00020\u0006\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t\u0088\u0001\u000b\u0092\u0001\u00020\nø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lsrb;", "T", "", "V", "value", "Lkotlin/Function2;", "", "block", "b", "(Lqn1;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lqn1;", "composer", "a", "(Lqn1;)Lqn1;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: srb  reason: default package */
/* loaded from: classes.dex */
public final class srb<T> {
    public static <T> qn1 a(qn1 qn1Var) {
        z65.h(qn1Var, "composer");
        return qn1Var;
    }

    public static final <V> void b(qn1 qn1Var, V v, Function2<? super T, ? super V, Unit> function2) {
        z65.h(function2, "block");
        if (qn1Var.e() || !z65.c(qn1Var.x(), v)) {
            qn1Var.p(v);
            qn1Var.l(v, function2);
        }
    }
}
