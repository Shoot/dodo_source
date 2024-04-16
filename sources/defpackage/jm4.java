package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import defpackage.xv9;
import java.util.concurrent.TimeUnit;
/* compiled from: HandlerScheduler.java */
/* renamed from: jm4  reason: default package */
/* loaded from: classes3.dex */
final class jm4 extends xv9 {
    private final Handler c;
    private final boolean d;

    /* compiled from: HandlerScheduler.java */
    /* renamed from: jm4$a */
    /* loaded from: classes3.dex */
    private static final class a extends xv9.c {
        private final Handler a;
        private final boolean b;
        private volatile boolean c;

        a(Handler handler, boolean z) {
            this.a = handler;
            this.b = z;
        }

        @Override // defpackage.z33
        public void a() {
            this.c = true;
            this.a.removeCallbacksAndMessages(this);
        }

        @Override // defpackage.xv9.c
        @SuppressLint({"NewApi"})
        public z33 d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable != null) {
                if (timeUnit != null) {
                    if (this.c) {
                        return j43.a();
                    }
                    b bVar = new b(this.a, tp9.s(runnable));
                    Message obtain = Message.obtain(this.a, bVar);
                    obtain.obj = this;
                    if (this.b) {
                        obtain.setAsynchronous(true);
                    }
                    this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                    if (this.c) {
                        this.a.removeCallbacks(bVar);
                        return j43.a();
                    }
                    return bVar;
                }
                throw new NullPointerException("unit == null");
            }
            throw new NullPointerException("run == null");
        }

        @Override // defpackage.z33
        public boolean i() {
            return this.c;
        }
    }

    /* compiled from: HandlerScheduler.java */
    /* renamed from: jm4$b */
    /* loaded from: classes3.dex */
    private static final class b implements Runnable, z33 {
        private final Handler a;
        private final Runnable b;
        private volatile boolean c;

        b(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        @Override // defpackage.z33
        public void a() {
            this.a.removeCallbacks(this);
            this.c = true;
        }

        @Override // defpackage.z33
        public boolean i() {
            return this.c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
            } catch (Throwable th) {
                tp9.q(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public jm4(Handler handler, boolean z) {
        this.c = handler;
        this.d = z;
    }

    @Override // defpackage.xv9
    public xv9.c b() {
        return new a(this.c, this.d);
    }

    @Override // defpackage.xv9
    @SuppressLint({"NewApi"})
    public z33 e(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                b bVar = new b(this.c, tp9.s(runnable));
                Message obtain = Message.obtain(this.c, bVar);
                if (this.d) {
                    obtain.setAsynchronous(true);
                }
                this.c.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                return bVar;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}
