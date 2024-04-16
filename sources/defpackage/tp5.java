package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* compiled from: LimitedDispatcher.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\b\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0002J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001J\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096\u0001J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u0015\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0017R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001e\u0010!\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010&\u001a\u00060\"j\u0002`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Ltp5;", "Lkx1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lvt2;", "", "q0", "block", "p0", "", "timeMillis", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf43;", Image.TYPE_SMALL, "Lfn0;", "", "continuation", Image.TYPE_MEDIUM, "run", "x", "L", c.a, "Lkx1;", "dispatcher", "", DateTokenConverter.CONVERTER_KEY, "I", "parallelism", "runningWorkers", "Lnw5;", "f", "Lnw5;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "g", "Ljava/lang/Object;", "workerAllocationLock", "<init>", "(Lkx1;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: tp5  reason: default package */
/* loaded from: classes3.dex */
public final class tp5 extends kx1 implements Runnable, vt2 {
    private final kx1 c;
    private final int d;
    private final /* synthetic */ vt2 e;
    private final nw5<Runnable> f;
    private final Object g;
    private volatile int runningWorkers;

    public tp5(kx1 kx1Var, int i) {
        vt2 vt2Var;
        this.c = kx1Var;
        this.d = i;
        if (kx1Var instanceof vt2) {
            vt2Var = (vt2) kx1Var;
        } else {
            vt2Var = null;
        }
        this.e = vt2Var == null ? rp2.a() : vt2Var;
        this.f = new nw5<>(false);
        this.g = new Object();
    }

    private final boolean p0(Runnable runnable) {
        this.f.a(runnable);
        if (this.runningWorkers >= this.d) {
            return true;
        }
        return false;
    }

    private final boolean q0() {
        synchronized (this.g) {
            if (this.runningWorkers >= this.d) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // defpackage.kx1
    public void L(CoroutineContext coroutineContext, Runnable runnable) {
        if (!p0(runnable) && q0()) {
            this.c.L(this, this);
        }
    }

    @Override // defpackage.vt2
    public void m(long j, fn0<? super Unit> fn0Var) {
        this.e.m(j, fn0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.f.c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
        r2 = kotlin.Unit.a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            nw5<java.lang.Runnable> r2 = r4.f
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            kotlin.coroutines.e r3 = kotlin.coroutines.e.a
            defpackage.nx1.a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kx1 r2 = r4.c
            boolean r2 = r2.W(r4)
            if (r2 == 0) goto L2
            kx1 r0 = r4.c
            r0.x(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.g
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            nw5<java.lang.Runnable> r2 = r4.f     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlin.Unit r2 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp5.run():void");
    }

    @Override // defpackage.vt2
    public f43 s(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.e.s(j, runnable, coroutineContext);
    }

    @Override // defpackage.kx1
    public void x(CoroutineContext coroutineContext, Runnable runnable) {
        if (!p0(runnable) && q0()) {
            this.c.x(this, this);
        }
    }
}
