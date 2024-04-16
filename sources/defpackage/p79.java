package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096Aø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lp79;", "T", "Lkua;", "", "Lq94;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lzg0;", "onBufferOverflow", "Loz3;", "b", "Ll95;", "a", "Ll95;", "job", "getValue", "()Ljava/lang/Object;", "value", "flow", "<init>", "(Lkua;Ll95;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: p79  reason: default package */
/* loaded from: classes3.dex */
public final class p79<T> implements kua<T>, oz3, q94<T> {
    private final l95 a;
    private final /* synthetic */ kua<T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public p79(kua<? extends T> kuaVar, l95 l95Var) {
        this.a = l95Var;
        this.b = kuaVar;
    }

    @Override // defpackage.q94
    public oz3<T> b(CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        return mua.d(this, coroutineContext, i, zg0Var);
    }

    @Override // defpackage.sha, defpackage.oz3
    public Object collect(pz3<? super T> pz3Var, cv1<?> cv1Var) {
        return this.b.collect(pz3Var, cv1Var);
    }

    @Override // defpackage.kua
    public T getValue() {
        return this.b.getValue();
    }
}
