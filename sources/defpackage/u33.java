package defpackage;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.e;
/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lu33;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "execute", "", "toString", "Lkx1;", "a", "Lkx1;", "dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: u33  reason: default package */
/* loaded from: classes3.dex */
final class u33 implements Executor {
    public final kx1 a;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.x(e.a, runnable);
    }

    public String toString() {
        return this.a.toString();
    }
}
