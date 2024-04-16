package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.qr0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CartQueueServiceImpl.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lbs0;", "Las0;", "", DateTokenConverter.CONVERTER_KEY, "", "Lqr0;", e.a, "cartQueueItem", "a", "clear", "b", "", "notify", c.a, "Lpr0;", "Lpr0;", "cartQueue", "Lrr0;", "Lrr0;", "cartQueueItemRepository", "Lk63;", "Lk63;", "domainEvents", "Lorg/slf4j/Logger;", "Lorg/slf4j/Logger;", "logger", "Ljava/util/concurrent/locks/Lock;", "Ljava/util/concurrent/locks/Lock;", "readWriteLock", "f", "Z", "isReady", "<init>", "(Lpr0;Lrr0;Lk63;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: bs0  reason: default package */
/* loaded from: classes.dex */
public final class bs0 implements as0 {
    private final pr0 a;
    private final rr0 b;
    private final k63 c;
    private final Logger d;
    private final Lock e;
    private volatile boolean f;

    public bs0(pr0 pr0Var, rr0 rr0Var, k63 k63Var) {
        z65.h(pr0Var, "cartQueue");
        z65.h(rr0Var, "cartQueueItemRepository");
        z65.h(k63Var, "domainEvents");
        this.a = pr0Var;
        this.b = rr0Var;
        this.c = k63Var;
        Logger logger = LoggerFactory.getLogger("CartQueueService");
        z65.g(logger, "getLogger(...)");
        this.d = logger;
        this.e = new ReentrantLock();
    }

    private final void d() {
        this.e.lock();
        try {
            if (this.f) {
                return;
            }
            e();
            this.f = true;
        } finally {
            this.e.unlock();
        }
    }

    private final List<qr0> e() {
        int w;
        Collection<qr0> b = this.b.b();
        if (!b.isEmpty()) {
            this.d.debug("Restore {} queue items", Integer.valueOf(b.size()));
        } else {
            this.d.debug("No items to restore");
        }
        Collection<qr0> collection = b;
        pr0 pr0Var = this.a;
        w = lc1.w(collection, 10);
        ArrayList arrayList = new ArrayList(w);
        for (qr0 qr0Var : collection) {
            arrayList.add(pr0Var.b(qr0Var));
        }
        return arrayList;
    }

    @Override // defpackage.as0
    public void a(qr0 qr0Var) {
        z65.h(qr0Var, "cartQueueItem");
        d();
        this.e.lock();
        try {
            qr0 b = this.a.b(qr0Var);
            if (b.b() <= 0 && !(b instanceof qr0.c)) {
                Logger logger = this.d;
                String id = qr0Var.getId();
                logger.debug("Remove queueItem from repository id = " + id + ", reason count = 0");
                this.b.s(b);
                this.c.b(j63.a);
                this.e.unlock();
            }
            Logger logger2 = this.d;
            String id2 = qr0Var.getId();
            logger2.debug("Save queueItem to repository id = " + id2);
            this.b.t(b);
            this.c.b(j63.a);
            this.e.unlock();
        } catch (Throwable th) {
            this.e.unlock();
            throw th;
        }
    }

    @Override // defpackage.as0
    public qr0 b() {
        qr0 a = this.a.a();
        d();
        return a;
    }

    @Override // defpackage.as0
    public void c(qr0 qr0Var, boolean z) {
        z65.h(qr0Var, "cartQueueItem");
        this.e.lock();
        try {
            this.d.debug("Remove queueItem from repository {}, reason item finished", qr0Var);
            this.b.s(qr0Var);
            if (z) {
                this.c.b(j63.a);
            }
        } finally {
            this.e.unlock();
        }
    }

    @Override // defpackage.as0
    public void clear() {
        d();
        this.e.lock();
        try {
            this.a.d();
            this.b.r();
        } finally {
            this.e.unlock();
        }
    }
}
