package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.vt2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.g;
/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489:;B\u0007¢\u0006\u0004\b7\u0010\rJ\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0004¢\u0006\u0004\b,\u0010\rR$\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u0010#¨\u0006<"}, d2 = {"Lzk3;", "Lal3;", "Lvt2;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "i1", "(Ljava/lang/Runnable;)Z", "f1", "()Ljava/lang/Runnable;", "", "e1", "()V", "Lzk3$c;", "y1", "(Lzk3$c;)Z", "", "now", "delayedTask", "", "t1", "(JLzk3$c;)I", "o1", "shutdown", "timeMillis", "Lfn0;", "continuation", Image.TYPE_MEDIUM, "(JLfn0;)V", "block", "Lf43;", "w1", "(JLjava/lang/Runnable;)Lf43;", "M0", "()J", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "x", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "g1", "(Ljava/lang/Runnable;)V", "s1", "(JLzk3$c;)V", "q1", "value", e.a, "()Z", "x1", "(Z)V", "isCompleted", "j1", "isEmpty", "z0", "nextTime", "<init>", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: zk3  reason: default package */
/* loaded from: classes3.dex */
public abstract class zk3 extends al3 implements vt2 {
    private static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(zk3.class, Object.class, "_queue");
    private static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(zk3.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lzk3$a;", "Lzk3$c;", "", "run", "", "toString", "Lfn0;", com.huawei.hms.opendevice.c.a, "Lfn0;", "cont", "", "nanoTime", "<init>", "(Lzk3;JLfn0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: zk3$a */
    /* loaded from: classes3.dex */
    private final class a extends c {
        private final fn0<Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j, fn0<? super Unit> fn0Var) {
            super(j);
            this.c = fn0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.W(zk3.this, Unit.a);
        }

        @Override // defpackage.zk3.c
        public String toString() {
            return super.toString() + this.c;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lzk3$b;", "Lzk3$c;", "", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", com.huawei.hms.opendevice.c.a, "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: zk3$b */
    /* loaded from: classes3.dex */
    private static final class b extends c {
        private final Runnable c;

        public b(long j, Runnable runnable) {
            super(j);
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.run();
        }

        @Override // defpackage.zk3.c
        public String toString() {
            return super.toString() + this.c;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"2\f\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lzk3$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lf43;", "Leeb;", "other", "", "k", "", "now", "", "p", "Lzk3$d;", "delayed", "Lzk3;", "eventLoop", "o", "", "a", "", "toString", "J", "nanoTime", "", "_heap", "Ljava/lang/Object;", "b", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Ldeb;", "value", "g", "()Ldeb;", "i", "(Ldeb;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: zk3$c */
    /* loaded from: classes3.dex */
    public static abstract class c implements Runnable, Comparable<c>, f43, eeb {
        private volatile Object _heap;
        public long a;
        private int b = -1;

        public c(long j) {
            this.a = j;
        }

        @Override // defpackage.f43
        public final synchronized void a() {
            r3b r3bVar;
            d dVar;
            r3b r3bVar2;
            try {
                Object obj = this._heap;
                r3bVar = cl3.a;
                if (obj == r3bVar) {
                    return;
                }
                if (obj instanceof d) {
                    dVar = (d) obj;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.g(this);
                }
                r3bVar2 = cl3.a;
                this._heap = r3bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // defpackage.eeb
        public deb<?> g() {
            Object obj = this._heap;
            if (obj instanceof deb) {
                return (deb) obj;
            }
            return null;
        }

        @Override // defpackage.eeb
        public int getIndex() {
            return this.b;
        }

        @Override // defpackage.eeb
        public void i(deb<?> debVar) {
            r3b r3bVar;
            Object obj = this._heap;
            r3bVar = cl3.a;
            if (obj != r3bVar) {
                this._heap = debVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // java.lang.Comparable
        /* renamed from: k */
        public int compareTo(c cVar) {
            int i = ((this.a - cVar.a) > 0L ? 1 : ((this.a - cVar.a) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            return 0;
        }

        public final synchronized int o(long j, d dVar, zk3 zk3Var) {
            r3b r3bVar;
            Object obj = this._heap;
            r3bVar = cl3.a;
            if (obj == r3bVar) {
                return 2;
            }
            synchronized (dVar) {
                c b = dVar.b();
                if (zk3Var.e()) {
                    return 1;
                }
                if (b == null) {
                    dVar.b = j;
                } else {
                    long j2 = b.a;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - dVar.b > 0) {
                        dVar.b = j;
                    }
                }
                long j3 = this.a;
                long j4 = dVar.b;
                if (j3 - j4 < 0) {
                    this.a = j4;
                }
                dVar.a(this);
                return 0;
            }
        }

        public final boolean p(long j) {
            if (j - this.a >= 0) {
                return true;
            }
            return false;
        }

        @Override // defpackage.eeb
        public void setIndex(int i) {
            this.b = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.a + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lzk3$d;", "Ldeb;", "Lzk3$c;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: zk3$d */
    /* loaded from: classes3.dex */
    public static final class d extends deb<c> {
        public long b;

        public d(long j) {
            this.b = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean e() {
        return this._isCompleted;
    }

    private final void e1() {
        r3b r3bVar;
        r3b r3bVar2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                r3bVar = cl3.b;
                if (d2.a(atomicReferenceFieldUpdater, this, null, r3bVar)) {
                    return;
                }
            } else if (!(obj instanceof ow5)) {
                r3bVar2 = cl3.b;
                if (obj == r3bVar2) {
                    return;
                }
                ow5 ow5Var = new ow5(8, true);
                ow5Var.a((Runnable) obj);
                if (d2.a(f, this, obj, ow5Var)) {
                    return;
                }
            } else {
                ((ow5) obj).d();
                return;
            }
        }
    }

    private final Runnable f1() {
        r3b r3bVar;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof ow5)) {
                r3bVar = cl3.b;
                if (obj == r3bVar) {
                    return null;
                }
                if (d2.a(f, this, obj, null)) {
                    return (Runnable) obj;
                }
            } else {
                ow5 ow5Var = (ow5) obj;
                Object j = ow5Var.j();
                if (j != ow5.h) {
                    return (Runnable) j;
                }
                d2.a(f, this, obj, ow5Var.i());
            }
        }
    }

    private final boolean i1(Runnable runnable) {
        r3b r3bVar;
        while (true) {
            Object obj = this._queue;
            if (e()) {
                return false;
            }
            if (obj == null) {
                if (d2.a(f, this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof ow5)) {
                r3bVar = cl3.b;
                if (obj == r3bVar) {
                    return false;
                }
                ow5 ow5Var = new ow5(8, true);
                ow5Var.a((Runnable) obj);
                ow5Var.a(runnable);
                if (d2.a(f, this, obj, ow5Var)) {
                    return true;
                }
            } else {
                ow5 ow5Var2 = (ow5) obj;
                int a2 = ow5Var2.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 != 1) {
                    if (a2 == 2) {
                        return false;
                    }
                } else {
                    d2.a(f, this, obj, ow5Var2.i());
                }
            }
        }
    }

    private final void o1() {
        c i;
        k2.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar != null && (i = dVar.i()) != null) {
                S0(nanoTime, i);
            } else {
                return;
            }
        }
    }

    private final int t1(long j, c cVar) {
        if (e()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            d2.a(g, this, null, new d(j));
            Object obj = this._delayed;
            z65.e(obj);
            dVar = (d) obj;
        }
        return cVar.o(j, dVar, this);
    }

    private final void x1(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    private final boolean y1(c cVar) {
        c cVar2;
        d dVar = (d) this._delayed;
        if (dVar != null) {
            cVar2 = dVar.e();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    @Override // defpackage.yk3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long M0() {
        /*
            r8 = this;
            boolean r0 = r8.N0()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r8._delayed
            zk3$d r0 = (defpackage.zk3.d) r0
            if (r0 == 0) goto L44
            boolean r3 = r0.d()
            if (r3 != 0) goto L44
            defpackage.k2.a()
            long r3 = java.lang.System.nanoTime()
        L1c:
            monitor-enter(r0)
            eeb r5 = r0.b()     // Catch: java.lang.Throwable -> L3a
            r6 = 0
            if (r5 != 0) goto L26
            monitor-exit(r0)
            goto L3d
        L26:
            zk3$c r5 = (defpackage.zk3.c) r5     // Catch: java.lang.Throwable -> L3a
            boolean r7 = r5.p(r3)     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L3c
            boolean r5 = r8.i1(r5)     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L3c
            r5 = 0
            eeb r6 = r0.h(r5)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r1 = move-exception
            goto L42
        L3c:
            monitor-exit(r0)
        L3d:
            zk3$c r6 = (defpackage.zk3.c) r6
            if (r6 != 0) goto L1c
            goto L44
        L42:
            monitor-exit(r0)
            throw r1
        L44:
            java.lang.Runnable r0 = r8.f1()
            if (r0 == 0) goto L4e
            r0.run()
            return r1
        L4e:
            long r0 = r8.z0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk3.M0():long");
    }

    public void g1(Runnable runnable) {
        if (i1(runnable)) {
            Y0();
        } else {
            qp2.h.g1(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean j1() {
        r3b r3bVar;
        if (!K0()) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof ow5)) {
                r3bVar = cl3.b;
                if (obj != r3bVar) {
                    return false;
                }
            } else {
                return ((ow5) obj).g();
            }
        }
        return true;
    }

    @Override // defpackage.vt2
    public void m(long j, fn0<? super Unit> fn0Var) {
        long c2 = cl3.c(j);
        if (c2 < 4611686018427387903L) {
            k2.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c2 + nanoTime, fn0Var);
            s1(nanoTime, aVar);
            in0.a(fn0Var, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q1() {
        this._queue = null;
        this._delayed = null;
    }

    public f43 s(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return vt2.a.a(this, j, runnable, coroutineContext);
    }

    public final void s1(long j, c cVar) {
        int t1 = t1(j, cVar);
        if (t1 != 0) {
            if (t1 != 1) {
                if (t1 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            S0(j, cVar);
        } else if (y1(cVar)) {
            Y0();
        }
    }

    @Override // defpackage.yk3
    public void shutdown() {
        zdb.a.c();
        x1(true);
        e1();
        do {
        } while (M0() <= 0);
        o1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f43 w1(long j, Runnable runnable) {
        long c2 = cl3.c(j);
        if (c2 < 4611686018427387903L) {
            k2.a();
            long nanoTime = System.nanoTime();
            b bVar = new b(c2 + nanoTime, runnable);
            s1(nanoTime, bVar);
            return bVar;
        }
        return yz6.a;
    }

    @Override // defpackage.kx1
    public final void x(CoroutineContext coroutineContext, Runnable runnable) {
        g1(runnable);
    }

    @Override // defpackage.yk3
    protected long z0() {
        c e;
        r3b r3bVar;
        if (super.z0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof ow5)) {
                r3bVar = cl3.b;
                if (obj != r3bVar) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            } else if (!((ow5) obj).g()) {
                return 0L;
            }
        }
        d dVar = (d) this._delayed;
        if (dVar == null || (e = dVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j = e.a;
        k2.a();
        return g.f(j - System.nanoTime(), 0L);
    }
}
