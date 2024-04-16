package defpackage;

import com.facebook.flipper.plugins.databases.DatabaseDriver;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lis2;", "T", "Le1;", "Lhs2;", "Ll4a;", "j", "()Ljava/lang/Object;", "l0", "(Lcv1;)Ljava/lang/Object;", "R", "Lv5a;", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "Lkotlin/Function2;", "Lcv1;", "", "block", "", "t", "(Lv5a;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: is2  reason: default package */
/* loaded from: classes3.dex */
public class is2<T> extends e1<T> implements hs2<T>, l4a<T> {
    public is2(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    static /* synthetic */ Object g1(is2 is2Var, cv1 cv1Var) {
        Object F = is2Var.F(cv1Var);
        c75.d();
        return F;
    }

    @Override // defpackage.hs2
    public T j() {
        return (T) h0();
    }

    @Override // defpackage.hs2
    public Object l0(cv1<? super T> cv1Var) {
        return g1(this, cv1Var);
    }

    @Override // defpackage.l4a
    public <R> void t(v5a<? super R> v5aVar, Function2<? super T, ? super cv1<? super R>, ? extends Object> function2) {
        O0(v5aVar, function2);
    }
}
