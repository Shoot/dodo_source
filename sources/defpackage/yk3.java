package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tJ\u0010\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006$"}, d2 = {"Lyk3;", "Lkx1;", "", "unconfined", "", "r0", "M0", "N0", "O0", "Lq33;", "task", "", "x0", "E0", "p0", "shutdown", c.a, "J", "useCount", DateTokenConverter.CONVERTER_KEY, "Z", "shared", "Lnr;", e.a, "Lnr;", "unconfinedQueue", "z0", "()J", "nextTime", "I0", "()Z", "isUnconfinedLoopActive", "K0", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: yk3  reason: default package */
/* loaded from: classes3.dex */
public abstract class yk3 extends kx1 {
    private long c;
    private boolean d;
    private nr<q33<?>> e;

    public static /* synthetic */ void F0(yk3 yk3Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            yk3Var.E0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public static /* synthetic */ void q0(yk3 yk3Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            yk3Var.p0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long r0(boolean z) {
        if (z) {
            return 4294967296L;
        }
        return 1L;
    }

    public final void E0(boolean z) {
        this.c += r0(z);
        if (!z) {
            this.d = true;
        }
    }

    public final boolean I0() {
        if (this.c >= r0(true)) {
            return true;
        }
        return false;
    }

    public final boolean K0() {
        nr<q33<?>> nrVar = this.e;
        if (nrVar != null) {
            return nrVar.c();
        }
        return true;
    }

    public long M0() {
        if (!N0()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean N0() {
        q33<?> d;
        nr<q33<?>> nrVar = this.e;
        if (nrVar == null || (d = nrVar.d()) == null) {
            return false;
        }
        d.run();
        return true;
    }

    public boolean O0() {
        return false;
    }

    public final void p0(boolean z) {
        long r0 = this.c - r0(z);
        this.c = r0;
        if (r0 <= 0 && this.d) {
            shutdown();
        }
    }

    public final void x0(q33<?> q33Var) {
        nr<q33<?>> nrVar = this.e;
        if (nrVar == null) {
            nrVar = new nr<>();
            this.e = nrVar;
        }
        nrVar.a(q33Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long z0() {
        nr<q33<?>> nrVar = this.e;
        if (nrVar == null || nrVar.c()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public void shutdown() {
    }
}
