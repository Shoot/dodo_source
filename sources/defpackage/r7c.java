package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
/* compiled from: WorkQueue.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, d2 = {"Lr7c;", "", "Lw6b;", "task", c.a, "(Lw6b;)Lw6b;", "victim", "", "blockingOnly", "", Image.TYPE_MEDIUM, "(Lr7c;Z)J", "Lkg4;", "queue", "j", "(Lkg4;)Z", "i", "()Lw6b;", "", DateTokenConverter.CONVERTER_KEY, "(Lw6b;)V", Image.TYPE_HIGH, "fair", "a", "(Lw6b;Z)Lw6b;", "l", "(Lr7c;)J", "k", "globalQueue", "g", "(Lkg4;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", e.a, "()I", "bufferSize", "f", "size", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: r7c  reason: default package */
/* loaded from: classes3.dex */
public final class r7c {
    private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(r7c.class, Object.class, "lastScheduledTask");
    private static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(r7c.class, "producerIndex");
    private static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(r7c.class, "consumerIndex");
    private static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(r7c.class, "blockingTasksInBuffer");
    private final AtomicReferenceArray<w6b> a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ w6b b(r7c r7cVar, w6b w6bVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return r7cVar.a(w6bVar, z);
    }

    private final w6b c(w6b w6bVar) {
        if (w6bVar.b.b() == 1) {
            e.incrementAndGet(this);
        }
        if (e() == 127) {
            return w6bVar;
        }
        int i = this.producerIndex & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, w6bVar);
        c.incrementAndGet(this);
        return null;
    }

    private final void d(w6b w6bVar) {
        if (w6bVar != null && w6bVar.b.b() == 1) {
            e.decrementAndGet(this);
        }
    }

    private final w6b i() {
        w6b andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (d.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(kg4 kg4Var) {
        w6b i = i();
        if (i == null) {
            return false;
        }
        kg4Var.a(i);
        return true;
    }

    private final long m(r7c r7cVar, boolean z) {
        w6b w6bVar;
        do {
            w6bVar = (w6b) r7cVar.lastScheduledTask;
            if (w6bVar == null) {
                return -2L;
            }
            if (z && w6bVar.b.b() != 1) {
                return -2L;
            }
            long a = r7b.e.a() - w6bVar.a;
            long j = r7b.a;
            if (a < j) {
                return j - a;
            }
        } while (!d2.a(b, r7cVar, w6bVar, null));
        b(this, w6bVar, false, 2, null);
        return -1L;
    }

    public final w6b a(w6b w6bVar, boolean z) {
        if (z) {
            return c(w6bVar);
        }
        w6b w6bVar2 = (w6b) b.getAndSet(this, w6bVar);
        if (w6bVar2 == null) {
            return null;
        }
        return c(w6bVar2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        if (this.lastScheduledTask != null) {
            return e() + 1;
        }
        return e();
    }

    public final void g(kg4 kg4Var) {
        w6b w6bVar = (w6b) b.getAndSet(this, null);
        if (w6bVar != null) {
            kg4Var.a(w6bVar);
        }
        do {
        } while (j(kg4Var));
    }

    public final w6b h() {
        w6b w6bVar = (w6b) b.getAndSet(this, null);
        if (w6bVar == null) {
            return i();
        }
        return w6bVar;
    }

    public final long k(r7c r7cVar) {
        int i = r7cVar.producerIndex;
        AtomicReferenceArray<w6b> atomicReferenceArray = r7cVar.a;
        for (int i2 = r7cVar.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (r7cVar.blockingTasksInBuffer == 0) {
                break;
            }
            w6b w6bVar = atomicReferenceArray.get(i3);
            if (w6bVar != null && w6bVar.b.b() == 1 && q7c.a(atomicReferenceArray, i3, w6bVar, null)) {
                e.decrementAndGet(r7cVar);
                b(this, w6bVar, false, 2, null);
                return -1L;
            }
        }
        return m(r7cVar, true);
    }

    public final long l(r7c r7cVar) {
        w6b i = r7cVar.i();
        if (i != null) {
            b(this, i, false, 2, null);
            return -1L;
        }
        return m(r7cVar, false);
    }
}
