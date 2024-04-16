package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
/* compiled from: SnackbarManager.java */
/* loaded from: classes2.dex */
class a {
    private static a e;
    @NonNull
    private final Object a = new Object();
    @NonNull
    private final Handler b = new Handler(Looper.getMainLooper(), new C0233a());
    private c c;
    private c d;

    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0233a implements Handler.Callback {
        C0233a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarManager.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(int i);

        void c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnackbarManager.java */
    /* loaded from: classes2.dex */
    public static class c {
        @NonNull
        final WeakReference<b> a;
        int b;
        boolean c;

        c(int i, b bVar) {
            this.a = new WeakReference<>(bVar);
            this.b = i;
        }

        boolean a(b bVar) {
            if (bVar != null && this.a.get() == bVar) {
                return true;
            }
            return false;
        }
    }

    private a() {
    }

    private boolean a(@NonNull c cVar, int i) {
        b bVar = cVar.a.get();
        if (bVar != null) {
            this.b.removeCallbacksAndMessages(cVar);
            bVar.a(i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a c() {
        if (e == null) {
            e = new a();
        }
        return e;
    }

    private boolean f(b bVar) {
        c cVar = this.c;
        if (cVar != null && cVar.a(bVar)) {
            return true;
        }
        return false;
    }

    private boolean g(b bVar) {
        c cVar = this.d;
        if (cVar != null && cVar.a(bVar)) {
            return true;
        }
        return false;
    }

    private void l(@NonNull c cVar) {
        int i = cVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            if (i == -1) {
                i = 1500;
            } else {
                i = 2750;
            }
        }
        this.b.removeCallbacksAndMessages(cVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    private void n() {
        c cVar = this.d;
        if (cVar != null) {
            this.c = cVar;
            this.d = null;
            b bVar = cVar.a.get();
            if (bVar != null) {
                bVar.c();
            } else {
                this.c = null;
            }
        }
    }

    public void b(b bVar, int i) {
        synchronized (this.a) {
            try {
                if (f(bVar)) {
                    a(this.c, i);
                } else if (g(bVar)) {
                    a(this.d, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(@NonNull c cVar) {
        synchronized (this.a) {
            try {
                if (this.c != cVar) {
                    if (this.d == cVar) {
                    }
                }
                a(cVar, 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z;
        synchronized (this.a) {
            try {
                if (!f(bVar) && !g(bVar)) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    public void h(b bVar) {
        synchronized (this.a) {
            try {
                if (f(bVar)) {
                    this.c = null;
                    if (this.d != null) {
                        n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.a) {
            try {
                if (f(bVar)) {
                    l(this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.a) {
            try {
                if (f(bVar)) {
                    c cVar = this.c;
                    if (!cVar.c) {
                        cVar.c = true;
                        this.b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.a) {
            try {
                if (f(bVar)) {
                    c cVar = this.c;
                    if (cVar.c) {
                        cVar.c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(int i, b bVar) {
        synchronized (this.a) {
            try {
                if (f(bVar)) {
                    c cVar = this.c;
                    cVar.b = i;
                    this.b.removeCallbacksAndMessages(cVar);
                    l(this.c);
                    return;
                }
                if (g(bVar)) {
                    this.d.b = i;
                } else {
                    this.d = new c(i, bVar);
                }
                c cVar2 = this.c;
                if (cVar2 != null && a(cVar2, 4)) {
                    return;
                }
                this.c = null;
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
