package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.qr0;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CartQueue.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0014"}, d2 = {"Lpr0;", "", "Lqr0;", "item", c.a, "b", "a", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/BlockingQueue;", "Ljava/util/concurrent/BlockingQueue;", "queue", "Ljava/util/concurrent/locks/Lock;", "Ljava/util/concurrent/locks/Lock;", "queueLock", "Lorg/slf4j/Logger;", "Lorg/slf4j/Logger;", "logger", "<init>", "(Ljava/util/concurrent/BlockingQueue;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: pr0  reason: default package */
/* loaded from: classes.dex */
public final class pr0 {
    private final BlockingQueue<qr0> a;
    private final Lock b;
    private final Logger c;

    public pr0(BlockingQueue<qr0> blockingQueue) {
        z65.h(blockingQueue, "queue");
        this.a = blockingQueue;
        this.b = new ReentrantLock();
        Logger logger = LoggerFactory.getLogger("CartQueue");
        z65.g(logger, "getLogger(...)");
        this.c = logger;
    }

    private final qr0 c(qr0 qr0Var) {
        Object obj;
        Iterator<T> it = this.a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c((qr0) obj, qr0Var)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (qr0) obj;
    }

    public final qr0 a() {
        this.c.trace("Dequeue: waiting to enqueue queue item");
        qr0 take = this.a.take();
        qr0 qr0Var = take;
        this.c.debug("Dequeue: dequeue new queue item {}", qr0Var);
        z65.g(take, "also(...)");
        return qr0Var;
    }

    public final qr0 b(qr0 qr0Var) {
        z65.h(qr0Var, "item");
        this.c.debug("Enqueue: Try to enqueue queue item {}", qr0Var);
        this.b.lock();
        this.c.trace("Enqueue: Take lock, queue size = {}", Integer.valueOf(this.a.size()));
        try {
            qr0 c = c(qr0Var);
            if (c != null) {
                this.c.debug("Enqueue: Will merge item {} with similar item {}", qr0Var, c);
                qr0Var = c.d();
                this.c.debug("Enqueue: Did merge item {}", qr0Var);
                if (qr0Var.b() == 0 && !(qr0Var instanceof qr0.c)) {
                    this.c.trace("Enqueue: remove merged item {} from queue", qr0Var);
                    this.a.remove(qr0Var);
                }
            } else {
                this.c.debug("Enqueue: Enqueue queue item {}", qr0Var);
                this.a.add(qr0Var);
            }
            return qr0Var;
        } finally {
            this.b.unlock();
            this.c.trace("Enqueue: Enqueue release lock, queue size = {}", Integer.valueOf(this.a.size()));
        }
    }

    public final void d() {
        this.b.lock();
        try {
            this.a.clear();
        } finally {
            this.b.unlock();
        }
    }

    public /* synthetic */ pr0(BlockingQueue blockingQueue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedBlockingQueue() : blockingQueue);
    }
}
