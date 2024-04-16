package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0017J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¨\u0006\f"}, d2 = {"Lxqb;", "Lkx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "L", "x", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: xqb  reason: default package */
/* loaded from: classes3.dex */
final class xqb extends kx1 {
    public static final xqb c = new xqb();

    private xqb() {
    }

    @Override // defpackage.kx1
    public void L(CoroutineContext coroutineContext, Runnable runnable) {
        pr2.i.q0(runnable, r7b.g, true);
    }

    @Override // defpackage.kx1
    public void x(CoroutineContext coroutineContext, Runnable runnable) {
        pr2.i.q0(runnable, r7b.g, false);
    }
}
