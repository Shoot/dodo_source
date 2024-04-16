package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ObservableTimer.java */
/* renamed from: f67  reason: default package */
/* loaded from: classes3.dex */
public final class f67 extends r57<Long> {
    final xv9 a;
    final long b;
    final TimeUnit c;

    /* compiled from: ObservableTimer.java */
    /* renamed from: f67$a */
    /* loaded from: classes3.dex */
    static final class a extends AtomicReference<z33> implements z33, Runnable {
        final h67<? super Long> a;

        a(h67<? super Long> h67Var) {
            this.a = h67Var;
        }

        @Override // defpackage.z33
        public void a() {
            g43.k(this);
        }

        public void b(z33 z33Var) {
            g43.x(this, z33Var);
        }

        @Override // defpackage.z33
        public boolean i() {
            if (get() == g43.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!i()) {
                this.a.d(0L);
                lazySet(ig3.INSTANCE);
                this.a.b();
            }
        }
    }

    public f67(long j, TimeUnit timeUnit, xv9 xv9Var) {
        this.b = j;
        this.c = timeUnit;
        this.a = xv9Var;
    }

    @Override // defpackage.r57
    public void r(h67<? super Long> h67Var) {
        a aVar = new a(h67Var);
        h67Var.c(aVar);
        aVar.b(this.a.e(aVar, this.b, this.c));
    }
}
