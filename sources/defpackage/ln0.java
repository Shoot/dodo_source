package defpackage;

import android.os.CancellationSignal;
/* compiled from: CancellationSignal.java */
/* renamed from: ln0  reason: default package */
/* loaded from: classes.dex */
public final class ln0 {
    private boolean a;
    private b b;
    private Object c;
    private boolean d;

    /* compiled from: CancellationSignal.java */
    /* renamed from: ln0$a */
    /* loaded from: classes.dex */
    static class a {
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* compiled from: CancellationSignal.java */
    /* renamed from: ln0$b */
    /* loaded from: classes.dex */
    public interface b {
        void onCancel();
    }

    private void c() {
        while (this.d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.d = true;
                b bVar = this.b;
                Object obj = this.c;
                if (bVar != null) {
                    try {
                        bVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    a.a(obj);
                }
                synchronized (this) {
                    this.d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(b bVar) {
        synchronized (this) {
            try {
                c();
                if (this.b == bVar) {
                    return;
                }
                this.b = bVar;
                if (this.a && bVar != null) {
                    bVar.onCancel();
                }
            } finally {
            }
        }
    }
}
