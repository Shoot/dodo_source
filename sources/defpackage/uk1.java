package defpackage;

import com.facebook.flipper.plugins.databases.DatabaseDriver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u00148PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Luk1;", "T", "Lv95;", "Ltk1;", "Ll4a;", "j", "()Ljava/lang/Object;", "l0", "(Lcv1;)Ljava/lang/Object;", "R", "Lv5a;", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "Lkotlin/Function2;", "Lcv1;", "", "block", "", "t", "(Lv5a;Lkotlin/jvm/functions/Function2;)V", "value", "", "K", "(Ljava/lang/Object;)Z", "", "exception", "H", "q0", "()Z", "onCancelComplete", "Ll95;", "parent", "<init>", "(Ll95;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: uk1  reason: default package */
/* loaded from: classes3.dex */
final class uk1<T> extends v95 implements tk1<T>, l4a<T> {
    public uk1(l95 l95Var) {
        super(true);
        w0(l95Var);
    }

    @Override // defpackage.tk1
    public boolean H(Throwable th) {
        return C0(new il1(th, false, 2, null));
    }

    @Override // defpackage.tk1
    public boolean K(T t) {
        return C0(t);
    }

    @Override // defpackage.hs2
    public T j() {
        return (T) h0();
    }

    @Override // defpackage.hs2
    public Object l0(cv1<? super T> cv1Var) {
        Object F = F(cv1Var);
        c75.d();
        return F;
    }

    @Override // defpackage.v95
    public boolean q0() {
        return true;
    }

    @Override // defpackage.l4a
    public <R> void t(v5a<? super R> v5aVar, Function2<? super T, ? super cv1<? super R>, ? extends Object> function2) {
        O0(v5aVar, function2);
    }
}
