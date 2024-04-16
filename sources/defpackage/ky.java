package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AsyncTimeout.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u0000  2\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0005H\u0014J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lky;", "Lxgb;", "", "now", "y", "", "v", "", "w", "B", "Lzma;", "sink", "z", "Lpqa;", KustoStorage.KustoTable.COLUMN_SOURCE, "A", "Ljava/io/IOException;", "cause", "p", "x", "", "f", "I", "state", "g", "Lky;", StatisticManager.NEXT, Image.TYPE_HIGH, "J", "timeoutAt", "<init>", "()V", "i", "a", "b", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: ky  reason: default package */
/* loaded from: classes3.dex */
public class ky extends xgb {
    private static final a i = new a(null);
    private static final ReentrantLock j;
    private static final Condition k;
    private static final long l;
    private static final long m;
    private static ky n;
    private int f;
    private ky g;
    private long h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lky$a;", "", "Lky;", "node", "", "timeoutNanos", "", "hasDeadline", "", "f", "g", com.huawei.hms.opendevice.c.a, "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", e.a, "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/concurrent/locks/Condition;", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "STATE_CANCELED", "I", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "TIMEOUT_WRITE_SIZE", "head", "Lky;", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ky$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(ky kyVar, long j, boolean z) {
            if (ky.n == null) {
                ky.n = new ky();
                new b().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i != 0 && z) {
                kyVar.h = Math.min(j, kyVar.c() - nanoTime) + nanoTime;
            } else if (i != 0) {
                kyVar.h = j + nanoTime;
            } else if (z) {
                kyVar.h = kyVar.c();
            } else {
                throw new AssertionError();
            }
            long y = kyVar.y(nanoTime);
            ky kyVar2 = ky.n;
            z65.e(kyVar2);
            while (kyVar2.g != null) {
                ky kyVar3 = kyVar2.g;
                z65.e(kyVar3);
                if (y < kyVar3.y(nanoTime)) {
                    break;
                }
                kyVar2 = kyVar2.g;
                z65.e(kyVar2);
            }
            kyVar.g = kyVar2.g;
            kyVar2.g = kyVar;
            if (kyVar2 == ky.n) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(ky kyVar) {
            for (ky kyVar2 = ky.n; kyVar2 != null; kyVar2 = kyVar2.g) {
                if (kyVar2.g == kyVar) {
                    kyVar2.g = kyVar.g;
                    kyVar.g = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue".toString());
        }

        public final ky c() throws InterruptedException {
            ky kyVar = ky.n;
            z65.e(kyVar);
            ky kyVar2 = kyVar.g;
            if (kyVar2 != null) {
                long y = kyVar2.y(System.nanoTime());
                if (y <= 0) {
                    ky kyVar3 = ky.n;
                    z65.e(kyVar3);
                    kyVar3.g = kyVar2.g;
                    kyVar2.g = null;
                    kyVar2.f = 2;
                    return kyVar2;
                }
                d().await(y, TimeUnit.NANOSECONDS);
                return null;
            }
            long nanoTime = System.nanoTime();
            d().await(ky.l, TimeUnit.MILLISECONDS);
            ky kyVar4 = ky.n;
            z65.e(kyVar4);
            if (kyVar4.g == null && System.nanoTime() - nanoTime >= ky.m) {
                return ky.n;
            }
            return null;
        }

        public final Condition d() {
            return ky.k;
        }

        public final ReentrantLock e() {
            return ky.j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lky$b;", "Ljava/lang/Thread;", "", "run", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ky$b */
    /* loaded from: classes3.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock e;
            ky c;
            while (true) {
                try {
                    e = ky.i.e();
                    e.lock();
                    c = ky.i.c();
                } catch (InterruptedException unused) {
                }
                if (c == ky.n) {
                    a unused2 = ky.i;
                    ky.n = null;
                    e.unlock();
                    return;
                }
                Unit unit = Unit.a;
                e.unlock();
                if (c != null) {
                    c.B();
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"ky$c", "Lzma;", "Lyg0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "byteCount", "", "r1", "flush", "close", "Lky;", "a", "", "toString", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ky$c */
    /* loaded from: classes3.dex */
    public static final class c implements zma {
        final /* synthetic */ zma b;

        c(zma zmaVar) {
            this.b = zmaVar;
        }

        @Override // defpackage.zma
        /* renamed from: a */
        public ky timeout() {
            return ky.this;
        }

        @Override // defpackage.zma, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ky kyVar = ky.this;
            zma zmaVar = this.b;
            kyVar.v();
            try {
                zmaVar.close();
                Unit unit = Unit.a;
                if (!kyVar.w()) {
                    return;
                }
                throw kyVar.p(null);
            } catch (IOException e) {
                if (!kyVar.w()) {
                    throw e;
                }
                throw kyVar.p(e);
            } finally {
                kyVar.w();
            }
        }

        @Override // defpackage.zma, java.io.Flushable
        public void flush() {
            ky kyVar = ky.this;
            zma zmaVar = this.b;
            kyVar.v();
            try {
                zmaVar.flush();
                Unit unit = Unit.a;
                if (!kyVar.w()) {
                    return;
                }
                throw kyVar.p(null);
            } catch (IOException e) {
                if (!kyVar.w()) {
                    throw e;
                }
                throw kyVar.p(e);
            } finally {
                kyVar.w();
            }
        }

        @Override // defpackage.zma
        public void r1(yg0 yg0Var, long j) {
            z65.h(yg0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            i.b(yg0Var.P(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    r3a r3aVar = yg0Var.a;
                    z65.e(r3aVar);
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += r3aVar.c - r3aVar.b;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            r3aVar = r3aVar.f;
                            z65.e(r3aVar);
                        }
                    }
                    ky kyVar = ky.this;
                    zma zmaVar = this.b;
                    kyVar.v();
                    try {
                        zmaVar.r1(yg0Var, j2);
                        Unit unit = Unit.a;
                        if (!kyVar.w()) {
                            j -= j2;
                        } else {
                            throw kyVar.p(null);
                        }
                    } catch (IOException e) {
                        if (!kyVar.w()) {
                            throw e;
                        }
                        throw kyVar.p(e);
                    } finally {
                        kyVar.w();
                    }
                } else {
                    return;
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"ky$d", "Lpqa;", "Lyg0;", "sink", "", "byteCount", "read", "", "close", "Lky;", "a", "", "toString", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ky$d */
    /* loaded from: classes3.dex */
    public static final class d implements pqa {
        final /* synthetic */ pqa b;

        d(pqa pqaVar) {
            this.b = pqaVar;
        }

        @Override // defpackage.pqa
        /* renamed from: a */
        public ky timeout() {
            return ky.this;
        }

        @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ky kyVar = ky.this;
            pqa pqaVar = this.b;
            kyVar.v();
            try {
                pqaVar.close();
                Unit unit = Unit.a;
                if (!kyVar.w()) {
                    return;
                }
                throw kyVar.p(null);
            } catch (IOException e) {
                if (!kyVar.w()) {
                    throw e;
                }
                throw kyVar.p(e);
            } finally {
                kyVar.w();
            }
        }

        @Override // defpackage.pqa
        public long read(yg0 yg0Var, long j) {
            z65.h(yg0Var, "sink");
            ky kyVar = ky.this;
            pqa pqaVar = this.b;
            kyVar.v();
            try {
                long read = pqaVar.read(yg0Var, j);
                if (!kyVar.w()) {
                    return read;
                }
                throw kyVar.p(null);
            } catch (IOException e) {
                if (!kyVar.w()) {
                    throw e;
                }
                throw kyVar.p(e);
            } finally {
                kyVar.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        z65.g(newCondition, "newCondition(...)");
        k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        l = millis;
        m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j2) {
        return this.h - j2;
    }

    public final pqa A(pqa pqaVar) {
        z65.h(pqaVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        return new d(pqaVar);
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long h = h();
        boolean e = e();
        if (h == 0 && !e) {
            return;
        }
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            if (this.f == 0) {
                this.f = 1;
                i.f(this, h, e);
                Unit unit = Unit.a;
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean w() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            int i2 = this.f;
            boolean z = false;
            this.f = 0;
            if (i2 == 1) {
                i.g(this);
                return false;
            }
            if (i2 == 2) {
                z = true;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final zma z(zma zmaVar) {
        z65.h(zmaVar, "sink");
        return new c(zmaVar);
    }

    protected void B() {
    }
}
