package defpackage;

import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lxm0;", "Lym0;", "", "cause", "", "a", "", "toString", "Ljava/util/concurrent/Future;", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: xm0  reason: default package */
/* loaded from: classes3.dex */
final class xm0 extends ym0 {
    private final Future<?> a;

    public xm0(Future<?> future) {
        this.a = future;
    }

    @Override // defpackage.zm0
    public void a(Throwable th) {
        if (th != null) {
            this.a.cancel(false);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        a(th);
        return Unit.a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.a + ']';
    }
}
