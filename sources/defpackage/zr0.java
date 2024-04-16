package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.qr0;
import defpackage.uq0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CartQueueProcessService.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\tB!\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lzr0;", "Lxr0;", "", c.a, "Lqr0;", "cartQueueItem", "b", "start", "Ljava/util/concurrent/ExecutorService;", "a", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lur0;", "Lur0;", "cartQueueItemSender", "Las0;", "Las0;", "cartQueueService", "Lorg/slf4j/Logger;", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", "logger", "Ljava/util/concurrent/locks/Lock;", e.a, "Ljava/util/concurrent/locks/Lock;", "startStopLock", "", "f", "Z", "isRunning", "<init>", "(Ljava/util/concurrent/ExecutorService;Lur0;Las0;)V", "g", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: zr0  reason: default package */
/* loaded from: classes.dex */
public final class zr0 implements xr0 {
    public static final a g = new a(null);
    private final ExecutorService a;
    private final ur0 b;
    private final as0 c;
    private final Logger d;
    private final Lock e;
    private volatile boolean f;

    /* compiled from: CartQueueProcessService.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lzr0$a;", "", "", "DELAY_MULTIPLIER", "J", "", "MAX_RETRY_COUNT", "I", "<init>", "()V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zr0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public zr0(ExecutorService executorService, ur0 ur0Var, as0 as0Var) {
        z65.h(executorService, "executorService");
        z65.h(ur0Var, "cartQueueItemSender");
        z65.h(as0Var, "cartQueueService");
        this.a = executorService;
        this.b = ur0Var;
        this.c = as0Var;
        Logger logger = LoggerFactory.getLogger("CartQueueProcess");
        z65.g(logger, "getLogger(...)");
        this.d = logger;
        this.e = new ReentrantLock();
    }

    private final void b(qr0 qr0Var) {
        this.d.debug("Process queue item {}", qr0Var);
        if ((qr0Var instanceof qr0.d) && (qr0Var.a() instanceof uq0.b)) {
            this.c.c(qr0Var, true);
            this.d.debug("Removing cart item not persisted on server");
            return;
        }
        this.d.debug("Send request to persist cart item on server");
        this.b.a(qr0Var);
    }

    private final void c() {
        this.a.submit(new Runnable() { // from class: yr0
            @Override // java.lang.Runnable
            public final void run() {
                zr0.d(zr0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(zr0 zr0Var) {
        qr0.a f;
        z65.h(zr0Var, "this$0");
        while (zr0Var.f) {
            qr0 b = zr0Var.c.b();
            try {
                zr0Var.b(b);
            } catch (Throwable th) {
                zr0Var.d.error("Error while processing item", th);
                if (b.c() <= 10) {
                    Thread.sleep(b.c() * 250);
                    if (b instanceof qr0.a) {
                        as0 as0Var = zr0Var.c;
                        f = r5.f((r36 & 1) != 0 ? r5.g : null, (r36 & 2) != 0 ? r5.h : null, (r36 & 4) != 0 ? r5.i : null, (r36 & 8) != 0 ? r5.j : 0, (r36 & 16) != 0 ? r5.k : false, (r36 & 32) != 0 ? r5.l : null, (r36 & 64) != 0 ? r5.m : null, (r36 & 128) != 0 ? r5.n : 0, (r36 & 256) != 0 ? r5.o : null, (r36 & 512) != 0 ? r5.p : 0, (r36 & 1024) != 0 ? r5.q : null, (r36 & 2048) != 0 ? r5.r : null, (r36 & 4096) != 0 ? r5.s : null, (r36 & 8192) != 0 ? r5.t : null, (r36 & 16384) != 0 ? r5.u : null, (r36 & 32768) != 0 ? r5.v : null, (r36 & 65536) != 0 ? r5.w : null, (r36 & 131072) != 0 ? ((qr0.a) b).x : b.c() + 1);
                        as0Var.a(f);
                    } else if (b instanceof qr0.d) {
                        zr0Var.c.a(qr0.d.i((qr0.d) b, null, null, 0, b.c() + 1, 7, null));
                    } else if (b instanceof qr0.c) {
                        zr0Var.c.a(qr0.c.i((qr0.c) b, null, null, 0, null, null, null, b.c() + 1, 63, null));
                    }
                } else {
                    zr0Var.d.debug("Finish retrying, remove from repository {}", b);
                    zr0Var.c.c(b, true);
                }
            }
        }
        zr0Var.d.debug("Stop service");
    }

    @Override // defpackage.xr0
    public void start() {
        this.d.debug("Try to start service");
        this.e.lock();
        try {
            if (this.f) {
                this.d.debug("Service already running");
                return;
            }
            this.f = true;
            this.d.debug("Service successful started");
            this.e.unlock();
            c();
        } finally {
            this.e.unlock();
        }
    }
}
