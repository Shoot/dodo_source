package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
/* compiled from: FlowCoroutine.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lrz3;", "T", "Ltw9;", "", "cause", "", "Y", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcv1;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcv1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: rz3  reason: default package */
/* loaded from: classes3.dex */
final class rz3<T> extends tw9<T> {
    public rz3(CoroutineContext coroutineContext, cv1<? super T> cv1Var) {
        super(coroutineContext, cv1Var);
    }

    @Override // defpackage.v95
    public boolean Y(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return O(th);
    }
}
