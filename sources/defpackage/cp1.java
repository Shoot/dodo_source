package defpackage;

import defpackage.xv9;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ComputationScheduler.java */
/* renamed from: cp1  reason: default package */
/* loaded from: classes3.dex */
public final class cp1 extends xv9 {
    static final b e;
    static final vp9 f;
    static final int g = g(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());
    static final c h;
    final ThreadFactory c;
    final AtomicReference<b> d;

    /* compiled from: ComputationScheduler.java */
    /* renamed from: cp1$a */
    /* loaded from: classes3.dex */
    static final class a extends xv9.c {
        private final zq5 a;
        private final wn1 b;
        private final zq5 c;
        private final c d;
        volatile boolean e;

        a(c cVar) {
            this.d = cVar;
            zq5 zq5Var = new zq5();
            this.a = zq5Var;
            wn1 wn1Var = new wn1();
            this.b = wn1Var;
            zq5 zq5Var2 = new zq5();
            this.c = zq5Var2;
            zq5Var2.b(zq5Var);
            zq5Var2.b(wn1Var);
        }

        @Override // defpackage.z33
        public void a() {
            if (!this.e) {
                this.e = true;
                this.c.a();
            }
        }

        @Override // defpackage.xv9.c
        public z33 c(Runnable runnable) {
            if (this.e) {
                return ig3.INSTANCE;
            }
            return this.d.f(runnable, 0L, TimeUnit.MILLISECONDS, this.a);
        }

        @Override // defpackage.xv9.c
        public z33 d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.e) {
                return ig3.INSTANCE;
            }
            return this.d.f(runnable, j, timeUnit, this.b);
        }

        @Override // defpackage.z33
        public boolean i() {
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComputationScheduler.java */
    /* renamed from: cp1$b */
    /* loaded from: classes3.dex */
    public static final class b {
        final int a;
        final c[] b;
        long c;

        b(int i, ThreadFactory threadFactory) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.a;
            if (i == 0) {
                return cp1.h;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % i)];
        }

        public void b() {
            for (c cVar : this.b) {
                cVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComputationScheduler.java */
    /* renamed from: cp1$c */
    /* loaded from: classes3.dex */
    public static final class c extends ux6 {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new vp9("RxComputationShutdown"));
        h = cVar;
        cVar.a();
        vp9 vp9Var = new vp9("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f = vp9Var;
        b bVar = new b(0, vp9Var);
        e = bVar;
        bVar.b();
    }

    public cp1() {
        this(f);
    }

    static int g(int i, int i2) {
        if (i2 > 0 && i2 <= i) {
            return i2;
        }
        return i;
    }

    @Override // defpackage.xv9
    public xv9.c b() {
        return new a(this.d.get().a());
    }

    @Override // defpackage.xv9
    public z33 e(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.d.get().a().g(runnable, j, timeUnit);
    }

    @Override // defpackage.xv9
    public z33 f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.d.get().a().h(runnable, j, j2, timeUnit);
    }

    public void h() {
        b bVar = new b(g, this.c);
        if (!ho1.a(this.d, e, bVar)) {
            bVar.b();
        }
    }

    public cp1(ThreadFactory threadFactory) {
        this.c = threadFactory;
        this.d = new AtomicReference<>(e);
        h();
    }
}
