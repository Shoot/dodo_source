package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
/* compiled from: ContinuationImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lqk9;", "Le70;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcv1;", "", "completion", "<init>", "(Lcv1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: qk9  reason: default package */
/* loaded from: classes3.dex */
public abstract class qk9 extends e70 {
    public qk9(cv1<Object> cv1Var) {
        super(cv1Var);
        if (cv1Var != null && cv1Var.getContext() != e.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // defpackage.cv1
    public CoroutineContext getContext() {
        return e.a;
    }
}
