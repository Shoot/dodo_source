package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: Scopes.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lxu1;", "Lqx1;", "", "toString", "Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: xu1  reason: default package */
/* loaded from: classes3.dex */
public final class xu1 implements qx1 {
    private final CoroutineContext a;

    public xu1(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    @Override // defpackage.qx1
    public CoroutineContext getCoroutineContext() {
        return this.a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
