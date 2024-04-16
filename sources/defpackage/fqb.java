package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: Unconfined.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, d2 = {"Lfqb;", "Lkx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "W", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "x", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: fqb  reason: default package */
/* loaded from: classes3.dex */
public final class fqb extends kx1 {
    public static final fqb c = new fqb();

    private fqb() {
    }

    @Override // defpackage.kx1
    public boolean W(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // defpackage.kx1
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // defpackage.kx1
    public void x(CoroutineContext coroutineContext, Runnable runnable) {
        ncc nccVar = (ncc) coroutineContext.c(ncc.c);
        if (nccVar != null) {
            nccVar.b = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
