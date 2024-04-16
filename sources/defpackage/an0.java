package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lan0;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: an0  reason: default package */
/* loaded from: classes.dex */
final class an0 extends CancellationException {
    public static final an0 a = new an0();

    private an0() {
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
