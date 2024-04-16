package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: PausingDispatcher.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Ljs7;", "Lkx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "W", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "x", "Lm33;", c.a, "Lm33;", "dispatchQueue", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* renamed from: js7  reason: default package */
/* loaded from: classes.dex */
public final class js7 extends kx1 {
    public final m33 c = new m33();

    @Override // defpackage.kx1
    public boolean W(CoroutineContext coroutineContext) {
        z65.h(coroutineContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (v33.c().p0().W(coroutineContext)) {
            return true;
        }
        return !this.c.b();
    }

    @Override // defpackage.kx1
    public void x(CoroutineContext coroutineContext, Runnable runnable) {
        z65.h(coroutineContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(runnable, "block");
        this.c.c(coroutineContext, runnable);
    }
}
