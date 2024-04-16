package defpackage;

import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Continuation.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aW\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001aQ\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lcv1;", "", "receiver", "completion", "", "a", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lcv1;)Lcv1;", "b", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lcv1;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
/* renamed from: fv1  reason: default package */
/* loaded from: classes3.dex */
public final class fv1 {
    public static final <R, T> cv1<Unit> a(Function2<? super R, ? super cv1<? super T>, ? extends Object> function2, R r, cv1<? super T> cv1Var) {
        cv1 b;
        cv1 c;
        Object d;
        z65.h(function2, "<this>");
        z65.h(cv1Var, "completion");
        b = b75.b(function2, r, cv1Var);
        c = b75.c(b);
        d = c75.d();
        return new ts9(c, d);
    }

    public static final <R, T> void b(Function2<? super R, ? super cv1<? super T>, ? extends Object> function2, R r, cv1<? super T> cv1Var) {
        cv1 b;
        cv1 c;
        z65.h(function2, "<this>");
        z65.h(cv1Var, "completion");
        b = b75.b(function2, r, cv1Var);
        c = b75.c(b);
        sk9.a aVar = sk9.b;
        c.resumeWith(sk9.b(Unit.a));
    }
}
