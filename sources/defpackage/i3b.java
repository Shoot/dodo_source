package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: SuspendLazy.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B6\u0012\u0006\u0010\t\u001a\u00020\b\u0012\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0003\u001a\u00028\u0000H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Li3b;", "T", "Lg3b;", "a", "(Lcv1;)Ljava/lang/Object;", "Lhs2;", "Lhs2;", "deferred", "Lqx1;", "coroutineScope", "Lkotlin/Function2;", "Lcv1;", "", "initializer", "<init>", "(Lqx1;Lkotlin/jvm/functions/Function2;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: i3b  reason: default package */
/* loaded from: classes.dex */
final class i3b<T> implements g3b<T> {
    private final hs2<T> a;

    public i3b(qx1 qx1Var, Function2<? super qx1, ? super cv1<? super T>, ? extends Object> function2) {
        hs2<T> b;
        z65.h(qx1Var, "coroutineScope");
        z65.h(function2, "initializer");
        b = sh0.b(qx1Var, null, ux1.LAZY, function2, 1, null);
        this.a = b;
    }

    @Override // defpackage.g3b
    public Object a(cv1<? super T> cv1Var) {
        return this.a.l0(cv1Var);
    }
}
