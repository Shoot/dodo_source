package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.vo9;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: FastFallbackExchangeFinder.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 ¨\u0006$"}, d2 = {"Lxo3;", "Lyl3;", "Lvo9$a;", "g", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", e.a, "", "f", "Lu79;", "a", "Lvo9;", "Lvo9;", "b", "()Lvo9;", "routePlanner", "Lk7b;", "Lk7b;", "taskRunner", c.a, "J", "connectDelayNanos", DateTokenConverter.CONVERTER_KEY, "nextTcpConnectAtNanos", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lvo9$b;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "tcpConnectsInFlight", "Ljava/util/concurrent/BlockingQueue;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/BlockingQueue;", "connectResults", "<init>", "(Lvo9;Lk7b;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: xo3  reason: default package */
/* loaded from: classes3.dex */
public final class xo3 implements yl3 {
    private final vo9 a;
    private final k7b b;
    private final long c;
    private long d;
    private final CopyOnWriteArrayList<vo9.b> e;
    private final BlockingQueue<vo9.a> f;

    /* compiled from: FastFallbackExchangeFinder.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"xo3$a", "Lx6b;", "", "f", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xo3$a */
    /* loaded from: classes3.dex */
    public static final class a extends x6b {
        final /* synthetic */ vo9.b e;
        final /* synthetic */ xo3 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, vo9.b bVar, xo3 xo3Var) {
            super(str, false, 2, null);
            this.e = bVar;
            this.f = xo3Var;
        }

        @Override // defpackage.x6b
        public long f() {
            vo9.a aVar;
            try {
                aVar = this.e.h();
            } catch (Throwable th) {
                aVar = new vo9.a(this.e, null, th, 2, null);
            }
            if (this.f.e.contains(this.e)) {
                this.f.f.put(aVar);
                return -1L;
            }
            return -1L;
        }
    }

    public xo3(vo9 vo9Var, k7b k7bVar) {
        z65.h(vo9Var, "routePlanner");
        z65.h(k7bVar, "taskRunner");
        this.a = vo9Var;
        this.b = k7bVar;
        this.c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.d = Long.MIN_VALUE;
        this.e = new CopyOnWriteArrayList<>();
        this.f = k7bVar.f().b(new LinkedBlockingDeque());
    }

    private final vo9.a e(long j, TimeUnit timeUnit) {
        vo9.a poll;
        if (this.e.isEmpty() || (poll = this.f.poll(j, timeUnit)) == null) {
            return null;
        }
        this.e.remove(poll.d());
        return poll;
    }

    private final void f() {
        Iterator<vo9.b> it = this.e.iterator();
        while (it.hasNext()) {
            vo9.b next = it.next();
            next.cancel();
            vo9.b f = next.f();
            if (f != null) {
                b().c().x(f);
            }
        }
        this.e.clear();
    }

    private final vo9.a g() {
        so3 so3Var;
        if (uo9.a(b(), null, 1, null)) {
            try {
                so3Var = b().d();
            } catch (Throwable th) {
                so3Var = new so3(th);
            }
            if (so3Var.g()) {
                return new vo9.a(so3Var, null, null, 6, null);
            }
            if (so3Var instanceof so3) {
                return ((so3) so3Var).c();
            }
            this.e.add(so3Var);
            j7b.m(this.b.k(), new a(cec.f + " connect " + b().b().l().u(), so3Var, this), 0L, 2, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:12:0x0021, B:14:0x002b, B:22:0x0055, B:25:0x005e, B:27:0x0064, B:29:0x0071, B:30:0x0079, B:32:0x007f, B:35:0x008b, B:37:0x0091, B:40:0x0097, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:45:0x00a6, B:20:0x004a, B:46:0x00b3, B:47:0x00ba), top: B:50:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:12:0x0021, B:14:0x002b, B:22:0x0055, B:25:0x005e, B:27:0x0064, B:29:0x0071, B:30:0x0079, B:32:0x007f, B:35:0x008b, B:37:0x0091, B:40:0x0097, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:45:0x00a6, B:20:0x004a, B:46:0x00b3, B:47:0x00ba), top: B:50:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0002 A[SYNTHETIC] */
    @Override // defpackage.yl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.u79 a() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.concurrent.CopyOnWriteArrayList<vo9$b> r2 = r9.e     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            r2 = r2 ^ r3
            if (r2 != 0) goto L21
            vo9 r2 = r9.b()     // Catch: java.lang.Throwable -> L1e
            boolean r2 = defpackage.uo9.a(r2, r0, r3, r0)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L17
            goto L21
        L17:
            r9.f()
            defpackage.z65.e(r1)
            throw r1
        L1e:
            r0 = move-exception
            goto Lbb
        L21:
            vo9 r2 = r9.b()     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.isCanceled()     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto Lb3
            k7b r2 = r9.b     // Catch: java.lang.Throwable -> L1e
            k7b$a r2 = r2.f()     // Catch: java.lang.Throwable -> L1e
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L1e
            long r4 = r9.d     // Catch: java.lang.Throwable -> L1e
            long r4 = r4 - r2
            java.util.concurrent.CopyOnWriteArrayList<vo9$b> r6 = r9.e     // Catch: java.lang.Throwable -> L1e
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L1e
            if (r6 != 0) goto L4a
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L47
            goto L4a
        L47:
            r5 = r4
            r4 = r0
            goto L53
        L4a:
            vo9$a r4 = r9.g()     // Catch: java.lang.Throwable -> L1e
            long r5 = r9.c     // Catch: java.lang.Throwable -> L1e
            long r2 = r2 + r5
            r9.d = r2     // Catch: java.lang.Throwable -> L1e
        L53:
            if (r4 != 0) goto L5e
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1e
            vo9$a r4 = r9.e(r5, r2)     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L5e
            goto L2
        L5e:
            boolean r2 = r4.f()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L8b
            r9.f()     // Catch: java.lang.Throwable -> L1e
            vo9$b r2 = r4.d()     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L79
            vo9$b r2 = r4.d()     // Catch: java.lang.Throwable -> L1e
            vo9$a r4 = r2.d()     // Catch: java.lang.Throwable -> L1e
        L79:
            boolean r2 = r4.f()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L8b
            vo9$b r0 = r4.d()     // Catch: java.lang.Throwable -> L1e
            u79 r0 = r0.a()     // Catch: java.lang.Throwable -> L1e
            r9.f()
            return r0
        L8b:
            java.lang.Throwable r2 = r4.e()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto La0
            boolean r3 = r2 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L9f
            if (r1 != 0) goto L9b
            java.io.IOException r2 = (java.io.IOException) r2     // Catch: java.lang.Throwable -> L1e
            r1 = r2
            goto La0
        L9b:
            defpackage.ul3.a(r1, r2)     // Catch: java.lang.Throwable -> L1e
            goto La0
        L9f:
            throw r2     // Catch: java.lang.Throwable -> L1e
        La0:
            vo9$b r2 = r4.c()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L2
            vo9 r3 = r9.b()     // Catch: java.lang.Throwable -> L1e
            gr r3 = r3.c()     // Catch: java.lang.Throwable -> L1e
            r3.u(r2)     // Catch: java.lang.Throwable -> L1e
            goto L2
        Lb3:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        Lbb:
            r9.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo3.a():u79");
    }

    @Override // defpackage.yl3
    public vo9 b() {
        return this.a;
    }
}
