package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
/* compiled from: ActualJvm.jvm.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lsy;", "", "", "amount", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "getDelegate", "()Ljava/util/concurrent/atomic/AtomicInteger;", "delegate", "value", "<init>", "(I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sy  reason: default package */
/* loaded from: classes.dex */
public final class sy {
    private final AtomicInteger a;

    public sy(int i) {
        this.a = new AtomicInteger(i);
    }

    public final int a(int i) {
        return this.a.addAndGet(i);
    }
}
