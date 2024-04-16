package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: TaskQueue.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b9\u0010:J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J&\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ0\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ'\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006J\u000f\u0010\u0015\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010)R$\u00100\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/R \u00106\u001a\b\u0012\u0004\u0012\u00020\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u00108\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b2\u0010\u0016\"\u0004\b7\u0010)¨\u0006;"}, d2 = {"Lj7b;", "", "Lx6b;", "task", "", "delayNanos", "", "k", "", Action.NAME_ATTRIBUTE, "Lkotlin/Function0;", "block", "l", "", "cancelable", c.a, "recurrence", "n", "(Lx6b;JZ)Z", "a", "q", "b", "()Z", "toString", "Lk7b;", "Lk7b;", "j", "()Lk7b;", "taskRunner", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", DateTokenConverter.CONVERTER_KEY, "Z", "i", "setShutdown$okhttp", "(Z)V", "shutdown", e.a, "Lx6b;", "()Lx6b;", "o", "(Lx6b;)V", "activeTask", "", "f", "Ljava/util/List;", "g", "()Ljava/util/List;", "futureTasks", "p", "cancelActiveTask", "<init>", "(Lk7b;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: j7b  reason: default package */
/* loaded from: classes3.dex */
public final class j7b {
    private final k7b a;
    private final String b;
    private final ReentrantLock c;
    private boolean d;
    private x6b e;
    private final List<x6b> f;
    private boolean g;

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"j7b$a", "Lx6b;", "", "f", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: j7b$a */
    /* loaded from: classes3.dex */
    public static final class a extends x6b {
        final /* synthetic */ Function0<Unit> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z, Function0<Unit> function0) {
            super(str, z);
            this.e = function0;
        }

        @Override // defpackage.x6b
        public long f() {
            this.e.invoke();
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"j7b$b", "Lx6b;", "", "f", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: j7b$b */
    /* loaded from: classes3.dex */
    public static final class b extends x6b {
        final /* synthetic */ Function0<Long> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Function0<Long> function0) {
            super(str, false, 2, null);
            this.e = function0;
        }

        @Override // defpackage.x6b
        public long f() {
            return this.e.invoke().longValue();
        }
    }

    public j7b(k7b k7bVar, String str) {
        z65.h(k7bVar, "taskRunner");
        z65.h(str, Action.NAME_ATTRIBUTE);
        this.a = k7bVar;
        this.b = str;
        this.c = new ReentrantLock();
        this.f = new ArrayList();
    }

    public static /* synthetic */ void d(j7b j7bVar, String str, long j, boolean z, Function0 function0, int i, Object obj) {
        boolean z2;
        if ((i & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        j7bVar.c(str, j2, z2, function0);
    }

    public static /* synthetic */ void m(j7b j7bVar, x6b x6bVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        j7bVar.k(x6bVar, j);
    }

    public final void a() {
        ReentrantLock reentrantLock = this.c;
        if (cec.e && reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + reentrantLock);
        }
        ReentrantLock h = this.a.h();
        h.lock();
        try {
            if (b()) {
                this.a.j(this);
            }
            Unit unit = Unit.a;
            h.unlock();
        } catch (Throwable th) {
            h.unlock();
            throw th;
        }
    }

    public final boolean b() {
        x6b x6bVar = this.e;
        if (x6bVar != null) {
            z65.e(x6bVar);
            if (x6bVar.a()) {
                this.g = true;
            }
        }
        boolean z = false;
        for (int size = this.f.size() - 1; -1 < size; size--) {
            if (this.f.get(size).a()) {
                Logger i = this.a.i();
                x6b x6bVar2 = this.f.get(size);
                if (i.isLoggable(Level.FINE)) {
                    i7b.c(i, x6bVar2, this, "canceled");
                }
                this.f.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(String str, long j, boolean z, Function0<Unit> function0) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(function0, "block");
        k(new a(str, z, function0), j);
    }

    public final x6b e() {
        return this.e;
    }

    public final boolean f() {
        return this.g;
    }

    public final List<x6b> g() {
        return this.f;
    }

    public final String h() {
        return this.b;
    }

    public final boolean i() {
        return this.d;
    }

    public final k7b j() {
        return this.a;
    }

    public final void k(x6b x6bVar, long j) {
        z65.h(x6bVar, "task");
        ReentrantLock h = this.a.h();
        h.lock();
        try {
            if (this.d) {
                if (x6bVar.a()) {
                    Logger i = this.a.i();
                    if (i.isLoggable(Level.FINE)) {
                        i7b.c(i, x6bVar, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                Logger i2 = this.a.i();
                if (i2.isLoggable(Level.FINE)) {
                    i7b.c(i2, x6bVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (n(x6bVar, j, false)) {
                this.a.j(this);
            }
            Unit unit = Unit.a;
        } finally {
            h.unlock();
        }
    }

    public final void l(String str, long j, Function0<Long> function0) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(function0, "block");
        k(new b(str, function0), j);
    }

    public final boolean n(x6b x6bVar, long j, boolean z) {
        String str;
        z65.h(x6bVar, "task");
        x6bVar.e(this);
        long a2 = this.a.f().a();
        long j2 = a2 + j;
        int indexOf = this.f.indexOf(x6bVar);
        if (indexOf != -1) {
            if (x6bVar.c() <= j2) {
                Logger i = this.a.i();
                if (i.isLoggable(Level.FINE)) {
                    i7b.c(i, x6bVar, this, "already scheduled");
                }
                return false;
            }
            this.f.remove(indexOf);
        }
        x6bVar.g(j2);
        Logger i2 = this.a.i();
        if (i2.isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after " + i7b.b(j2 - a2);
            } else {
                str = "scheduled after " + i7b.b(j2 - a2);
            }
            i7b.c(i2, x6bVar, this, str);
        }
        Iterator<x6b> it = this.f.iterator();
        int i3 = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().c() - a2 > j) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 == -1) {
            i3 = this.f.size();
        }
        this.f.add(i3, x6bVar);
        if (i3 != 0) {
            return false;
        }
        return true;
    }

    public final void o(x6b x6bVar) {
        this.e = x6bVar;
    }

    public final void p(boolean z) {
        this.g = z;
    }

    public final void q() {
        ReentrantLock reentrantLock = this.c;
        if (cec.e && reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + reentrantLock);
        }
        ReentrantLock h = this.a.h();
        h.lock();
        try {
            this.d = true;
            if (b()) {
                this.a.j(this);
            }
            Unit unit = Unit.a;
            h.unlock();
        } catch (Throwable th) {
            h.unlock();
            throw th;
        }
    }

    public String toString() {
        return this.b;
    }
}
