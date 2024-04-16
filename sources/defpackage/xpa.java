package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: ActualJvm.jvm.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0012"}, d2 = {"Lxpa;", "T", "", "a", "()Ljava/lang/Object;", "value", "", "b", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Laeb;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "map", "Ljava/lang/Object;", "writeMutex", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xpa  reason: default package */
/* loaded from: classes.dex */
public final class xpa<T> {
    private final AtomicReference<aeb> a = new AtomicReference<>(beb.a());
    private final Object b = new Object();

    public final T a() {
        return (T) this.a.get().b(Thread.currentThread().getId());
    }

    public final void b(T t) {
        long id = Thread.currentThread().getId();
        synchronized (this.b) {
            aeb aebVar = this.a.get();
            if (aebVar.d(id, t)) {
                return;
            }
            this.a.set(aebVar.c(id, t));
            Unit unit = Unit.a;
        }
    }
}
