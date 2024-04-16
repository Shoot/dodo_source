package defpackage;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* renamed from: c22  reason: default package */
/* loaded from: classes2.dex */
class c22 implements Thread.UncaughtExceptionHandler {
    private final a a;
    private final gga b;
    private final Thread.UncaughtExceptionHandler c;
    private final c12 d;
    private final AtomicBoolean e = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    /* renamed from: c22$a */
    /* loaded from: classes2.dex */
    interface a {
        void a(gga ggaVar, Thread thread, Throwable th);
    }

    public c22(a aVar, gga ggaVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, c12 c12Var) {
        this.a = aVar;
        this.b = ggaVar;
        this.c = uncaughtExceptionHandler;
        this.d = c12Var;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            rx5.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            rx5.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.d.b()) {
            rx5.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.a.a(this.b, thread, th);
                } else {
                    rx5.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e) {
                rx5.f().e("An error occurred in the uncaught exception handler", e);
            }
            rx5.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.e.set(false);
        } catch (Throwable th2) {
            rx5.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.e.set(false);
            throw th2;
        }
    }
}
