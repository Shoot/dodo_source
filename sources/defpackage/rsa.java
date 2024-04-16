package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lrsa;", "T", "Lcv1;", "Ltx1;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lsk9;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "a", "Lcv1;", "uCont", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "getCallerFrame", "()Ltx1;", "callerFrame", "<init>", "(Lcv1;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: rsa  reason: default package */
/* loaded from: classes3.dex */
final class rsa<T> implements cv1<T>, tx1 {
    private final cv1<T> a;
    private final CoroutineContext b;

    /* JADX WARN: Multi-variable type inference failed */
    public rsa(cv1<? super T> cv1Var, CoroutineContext coroutineContext) {
        this.a = cv1Var;
        this.b = coroutineContext;
    }

    @Override // defpackage.tx1
    public tx1 getCallerFrame() {
        cv1<T> cv1Var = this.a;
        if (cv1Var instanceof tx1) {
            return (tx1) cv1Var;
        }
        return null;
    }

    @Override // defpackage.cv1
    public CoroutineContext getContext() {
        return this.b;
    }

    @Override // defpackage.cv1
    public void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
