package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: CoroutineScheduler.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0003\u00064AB+\u0012\u0006\u0010=\u001a\u00020\f\u0012\u0006\u0010>\u001a\u00020\f\u0012\b\b\u0002\u0010@\u001a\u00020\u0013\u0012\b\b\u0002\u0010C\u001a\u000207¢\u0006\u0004\bN\u0010OJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\nJ)\u0010!\u001a\u00020\u00102\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\u00102\n\u0010'\u001a\u00060%j\u0002`&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J-\u00102\u001a\u00020\u00102\n\u0010/\u001a\u00060%j\u0002`&2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020\u00032\n\u0010/\u001a\u00060%j\u0002`&2\u0006\u00101\u001a\u000200¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0010¢\u0006\u0004\b6\u0010+J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010>\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010<R\u0014\u0010@\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010?R\u0014\u0010C\u001a\u0002078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010ER\u0014\u0010H\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u001e\u0010L\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0011\u0010M\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bM\u0010\u0018¨\u0006Q"}, d2 = {"Lpx1;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lw6b;", "task", "", "a", "(Lw6b;)Z", "Lpx1$c;", Image.TYPE_MEDIUM, "()Lpx1$c;", "worker", "", "l", "(Lpx1$c;)I", "skipUnpark", "", Image.TYPE_SMALL, "(Z)V", "", "state", "E", "(J)Z", "K", "()Z", "b", "()I", "tailDispatch", "y", "(Lpx1$c;Lw6b;Z)Lw6b;", e.a, "oldIndex", "newIndex", "o", "(Lpx1$c;II)V", "n", "(Lpx1$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "r", "(J)V", "block", "Lb7b;", "taskContext", "j", "(Ljava/lang/Runnable;Lb7b;Z)V", com.huawei.hms.opendevice.c.a, "(Ljava/lang/Runnable;Lb7b;)Lw6b;", "x", "", "toString", "()Ljava/lang/String;", "q", "(Lw6b;)V", "I", "corePoolSize", "maxPoolSize", "J", "idleWorkerKeepAliveNs", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "schedulerName", "Lkg4;", "Lkg4;", "globalCpuQueue", "f", "globalBlockingQueue", "Lej9;", "g", "Lej9;", "workers", "isTerminated", "<init>", "(IIJLjava/lang/String;)V", Image.TYPE_HIGH, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: px1  reason: default package */
/* loaded from: classes3.dex */
public final class px1 implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    public final int a;
    public final int b;
    public final long c;
    volatile /* synthetic */ long controlState;
    public final String d;
    public final kg4 e;
    public final kg4 f;
    public final ej9<c> g;
    private volatile /* synthetic */ long parkedWorkersStack;
    public static final a h = new a(null);
    public static final r3b l = new r3b("NOT_IN_STACK");
    private static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(px1.class, "parkedWorkersStack");
    static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(px1.class, "controlState");
    private static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(px1.class, "_isTerminated");

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lpx1$a;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lr3b;", "NOT_IN_STACK", "Lr3b;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: px1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: px1$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lpx1$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, e.a, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: px1$d */
    /* loaded from: classes3.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public px1(int i2, int i3, long j2, String str) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = str;
        if (i2 >= 1) {
            if (i3 >= i2) {
                if (i3 <= 2097150) {
                    if (j2 > 0) {
                        this.e = new kg4();
                        this.f = new kg4();
                        this.parkedWorkersStack = 0L;
                        this.g = new ej9<>(i2 + 1);
                        this.controlState = i2 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
    }

    private final boolean E(long j2) {
        int e;
        e = i.e(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0);
        if (e < this.a) {
            int b2 = b();
            if (b2 == 1 && this.a > 1) {
                b();
            }
            if (b2 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean H(px1 px1Var, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = px1Var.controlState;
        }
        return px1Var.E(j2);
    }

    private final boolean K() {
        c m;
        do {
            m = m();
            if (m == null) {
                return false;
            }
        } while (!c.h.compareAndSet(m, -1, 0));
        LockSupport.unpark(m);
        return true;
    }

    private final boolean a(w6b w6bVar) {
        if (w6bVar.b.b() == 1) {
            return this.f.a(w6bVar);
        }
        return this.e.a(w6bVar);
    }

    private final int b() {
        int e;
        synchronized (this.g) {
            if (isTerminated()) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            e = i.e(i2 - ((int) ((j2 & 4398044413952L) >> 21)), 0);
            if (e >= this.a) {
                return 0;
            }
            if (i2 >= this.b) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 > 0 && this.g.b(i3) == null) {
                c cVar = new c(this, i3);
                this.g.c(i3, cVar);
                if (i3 == ((int) (2097151 & j.incrementAndGet(this)))) {
                    cVar.start();
                    return e + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final c e() {
        c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof c) {
            cVar = (c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !z65.c(px1.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void k(px1 px1Var, Runnable runnable, b7b b7bVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            b7bVar = r7b.f;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        px1Var.j(runnable, b7bVar, z);
    }

    private final int l(c cVar) {
        Object h2 = cVar.h();
        while (h2 != l) {
            if (h2 == null) {
                return 0;
            }
            c cVar2 = (c) h2;
            int g = cVar2.g();
            if (g != 0) {
                return g;
            }
            h2 = cVar2.h();
        }
        return -1;
    }

    private final c m() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            c b2 = this.g.b((int) (2097151 & j2));
            if (b2 == null) {
                return null;
            }
            long j3 = (2097152 + j2) & (-2097152);
            int l2 = l(b2);
            if (l2 >= 0 && i.compareAndSet(this, j2, l2 | j3)) {
                b2.p(l);
                return b2;
            }
        }
    }

    private final void s(boolean z) {
        long addAndGet = j.addAndGet(this, 2097152L);
        if (z || K() || E(addAndGet)) {
            return;
        }
        K();
    }

    private final w6b y(c cVar, w6b w6bVar, boolean z) {
        if (cVar == null) {
            return w6bVar;
        }
        if (cVar.b == d.TERMINATED) {
            return w6bVar;
        }
        if (w6bVar.b.b() == 0 && cVar.b == d.BLOCKING) {
            return w6bVar;
        }
        cVar.f = true;
        return cVar.a.a(w6bVar, z);
    }

    public final w6b c(Runnable runnable, b7b b7bVar) {
        long a2 = r7b.e.a();
        if (runnable instanceof w6b) {
            w6b w6bVar = (w6b) runnable;
            w6bVar.a = a2;
            w6bVar.b = b7bVar;
            return w6bVar;
        }
        return new h7b(runnable, a2, b7bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r(AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        k(this, runnable, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void j(Runnable runnable, b7b b7bVar, boolean z) {
        boolean z2;
        k2.a();
        w6b c2 = c(runnable, b7bVar);
        c e = e();
        w6b y = y(e, c2, z);
        if (y != null && !a(y)) {
            throw new RejectedExecutionException(this.d + " was terminated");
        }
        if (z && e != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c2.b.b() == 0) {
            if (z2) {
                return;
            }
            x();
            return;
        }
        s(z2);
    }

    public final boolean n(c cVar) {
        long j2;
        int g;
        if (cVar.h() != l) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            g = cVar.g();
            cVar.p(this.g.b((int) (2097151 & j2)));
        } while (!i.compareAndSet(this, j2, ((2097152 + j2) & (-2097152)) | g));
        return true;
    }

    public final void o(c cVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    i4 = l(cVar);
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0 && i.compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    public final void q(w6b w6bVar) {
        try {
            w6bVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void r(long j2) {
        int i2;
        w6b d2;
        if (!k.compareAndSet(this, 0, 1)) {
            return;
        }
        c e = e();
        synchronized (this.g) {
            i2 = (int) (this.controlState & 2097151);
        }
        if (1 <= i2) {
            int i3 = 1;
            while (true) {
                c b2 = this.g.b(i3);
                z65.e(b2);
                c cVar = b2;
                if (cVar != e) {
                    while (cVar.isAlive()) {
                        LockSupport.unpark(cVar);
                        cVar.join(j2);
                    }
                    cVar.a.g(this.f);
                }
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        this.f.b();
        this.e.b();
        while (true) {
            if (e != null) {
                d2 = e.f(true);
                if (d2 != null) {
                    continue;
                    q(d2);
                }
            }
            d2 = this.e.d();
            if (d2 == null && (d2 = this.f.d()) == null) {
                break;
            }
            q(d2);
        }
        if (e != null) {
            e.s(d.TERMINATED);
        }
        this.parkedWorkersStack = 0L;
        this.controlState = 0L;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a2 = this.g.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            c b2 = this.g.b(i7);
            if (b2 != null) {
                int f = b2.a.f();
                int i8 = b.$EnumSwitchMapping$0[b2.b.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                if (i8 == 5) {
                                    i6++;
                                }
                            } else {
                                i5++;
                                if (f > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(f);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i2++;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f);
                            sb2.append('c');
                            arrayList.add(sb2.toString());
                        }
                    } else {
                        i3++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i4++;
                }
            }
        }
        long j2 = this.controlState;
        return this.d + '@' + jo2.b(this) + "[Pool Size {core = " + this.a + ", max = " + this.b + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i5 + ", terminated = " + i6 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.e.c() + ", global blocking queue size = " + this.f.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.a - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    public final void x() {
        if (K() || H(this, 0L, 1, null)) {
            return;
        }
        K();
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\bA\u0010CJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0019R*\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0011R\u0014\u00100\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00104R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010=\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00104R\u0016\u0010>\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0016\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010?¨\u0006D"}, d2 = {"Lpx1$c;", "Ljava/lang/Thread;", "", "q", "()Z", "", "n", "()V", "r", "j", "Lw6b;", "task", DateTokenConverter.CONVERTER_KEY, "(Lw6b;)V", "", "taskMode", com.huawei.hms.opendevice.c.a, "(I)V", "b", "l", "u", "mode", "i", "scanLocalQueue", e.a, "(Z)Lw6b;", Image.TYPE_MEDIUM, "()Lw6b;", "blockingOnly", "t", "Lpx1$d;", "newState", Image.TYPE_SMALL, "(Lpx1$d;)Z", "run", "upperBound", "k", "(I)I", "f", "index", "indexInArray", "I", "g", "()I", "o", "Lr7c;", "a", "Lr7c;", "localQueue", "Lpx1$d;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", Image.TYPE_HIGH, "()Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "mayHaveLocalTasks", "<init>", "(Lpx1;)V", "(Lpx1;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: px1$c */
    /* loaded from: classes3.dex */
    public final class c extends Thread {
        static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        public final r7c a;
        public d b;
        private long c;
        private long d;
        private int e;
        public boolean f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.a = new r7c();
            this.b = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = px1.l;
            this.e = b49.a.c();
        }

        private final void b(int i) {
            if (i == 0) {
                return;
            }
            px1.j.addAndGet(px1.this, -2097152L);
            if (this.b != d.TERMINATED) {
                this.b = d.DORMANT;
            }
        }

        private final void c(int i) {
            if (i != 0 && s(d.BLOCKING)) {
                px1.this.x();
            }
        }

        private final void d(w6b w6bVar) {
            int b = w6bVar.b.b();
            i(b);
            c(b);
            px1.this.q(w6bVar);
            b(b);
        }

        private final w6b e(boolean z) {
            boolean z2;
            w6b m;
            w6b m2;
            if (z) {
                if (k(px1.this.a * 2) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (m2 = m()) != null) {
                    return m2;
                }
                w6b h2 = this.a.h();
                if (h2 != null) {
                    return h2;
                }
                if (!z2 && (m = m()) != null) {
                    return m;
                }
            } else {
                w6b m3 = m();
                if (m3 != null) {
                    return m3;
                }
            }
            return t(false);
        }

        private final void i(int i) {
            this.c = 0L;
            if (this.b == d.PARKING) {
                this.b = d.BLOCKING;
            }
        }

        private final boolean j() {
            if (this.nextParkedWorker != px1.l) {
                return true;
            }
            return false;
        }

        private final void l() {
            if (this.c == 0) {
                this.c = System.nanoTime() + px1.this.c;
            }
            LockSupport.parkNanos(px1.this.c);
            if (System.nanoTime() - this.c >= 0) {
                this.c = 0L;
                u();
            }
        }

        private final w6b m() {
            if (k(2) == 0) {
                w6b d = px1.this.e.d();
                if (d != null) {
                    return d;
                }
                return px1.this.f.d();
            }
            w6b d2 = px1.this.f.d();
            if (d2 != null) {
                return d2;
            }
            return px1.this.e.d();
        }

        private final void n() {
            loop0: while (true) {
                boolean z = false;
                while (!px1.this.isTerminated() && this.b != d.TERMINATED) {
                    w6b f = f(this.f);
                    if (f != null) {
                        this.d = 0L;
                        d(f);
                    } else {
                        this.f = false;
                        if (this.d != 0) {
                            if (!z) {
                                z = true;
                            } else {
                                s(d.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.d);
                                this.d = 0L;
                            }
                        } else {
                            r();
                        }
                    }
                }
            }
            s(d.TERMINATED);
        }

        private final boolean q() {
            long j;
            if (this.b == d.CPU_ACQUIRED) {
                return true;
            }
            px1 px1Var = px1.this;
            do {
                j = px1Var.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!px1.j.compareAndSet(px1Var, j, j - 4398046511104L));
            this.b = d.CPU_ACQUIRED;
            return true;
        }

        private final void r() {
            if (!j()) {
                px1.this.n(this);
                return;
            }
            this.workerCtl = -1;
            while (j() && this.workerCtl == -1 && !px1.this.isTerminated() && this.b != d.TERMINATED) {
                s(d.PARKING);
                Thread.interrupted();
                l();
            }
        }

        private final w6b t(boolean z) {
            long l;
            int i = (int) (px1.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int k = k(i);
            px1 px1Var = px1.this;
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                k++;
                if (k > i) {
                    k = 1;
                }
                c b = px1Var.g.b(k);
                if (b != null && b != this) {
                    if (z) {
                        l = this.a.k(b.a);
                    } else {
                        l = this.a.l(b.a);
                    }
                    if (l == -1) {
                        return this.a.h();
                    }
                    if (l > 0) {
                        j = Math.min(j, l);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.d = j;
            return null;
        }

        private final void u() {
            px1 px1Var = px1.this;
            synchronized (px1Var.g) {
                try {
                    if (px1Var.isTerminated()) {
                        return;
                    }
                    if (((int) (px1Var.controlState & 2097151)) <= px1Var.a) {
                        return;
                    }
                    if (!h.compareAndSet(this, -1, 1)) {
                        return;
                    }
                    int i = this.indexInArray;
                    o(0);
                    px1Var.o(this, i, 0);
                    int andDecrement = (int) (px1.j.getAndDecrement(px1Var) & 2097151);
                    if (andDecrement != i) {
                        c b = px1Var.g.b(andDecrement);
                        z65.e(b);
                        c cVar = b;
                        px1Var.g.c(i, cVar);
                        cVar.o(i);
                        px1Var.o(cVar, andDecrement, i);
                    }
                    px1Var.g.c(andDecrement, null);
                    Unit unit = Unit.a;
                    this.b = d.TERMINATED;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final w6b f(boolean z) {
            w6b d;
            if (q()) {
                return e(z);
            }
            if (z) {
                d = this.a.h();
                if (d == null) {
                    d = px1.this.f.d();
                }
            } else {
                d = px1.this.f.d();
            }
            if (d == null) {
                return t(true);
            }
            return d;
        }

        public final int g() {
            return this.indexInArray;
        }

        public final Object h() {
            return this.nextParkedWorker;
        }

        public final int k(int i) {
            int i2 = this.e;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.e = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        public final void o(int i) {
            String valueOf;
            StringBuilder sb = new StringBuilder();
            sb.append(px1.this.d);
            sb.append("-worker-");
            if (i == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i);
            }
            sb.append(valueOf);
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void p(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public final boolean s(d dVar) {
            boolean z;
            d dVar2 = this.b;
            if (dVar2 == d.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                px1.j.addAndGet(px1.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.b = dVar;
            }
            return z;
        }

        public c(px1 px1Var, int i) {
            this();
            o(i);
        }
    }
}
