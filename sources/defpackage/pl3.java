package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ExceptionHelper.java */
/* renamed from: pl3  reason: default package */
/* loaded from: classes3.dex */
public final class pl3 {
    public static final Throwable a = new a();

    public static <T> boolean a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable compositeException;
        do {
            th2 = atomicReference.get();
            if (th2 == a) {
                return false;
            }
            if (th2 == null) {
                compositeException = th;
            } else {
                compositeException = new CompositeException(th2, th);
            }
        } while (!ho1.a(atomicReference, th2, compositeException));
        return true;
    }

    public static <T> Throwable b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = a;
        if (th != th2) {
            return atomicReference.getAndSet(th2);
        }
        return th;
    }

    public static <E extends Throwable> Exception c(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    public static RuntimeException d(Throwable th) {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                return (RuntimeException) th;
            }
            return new RuntimeException(th);
        }
        throw ((Error) th);
    }

    /* compiled from: ExceptionHelper.java */
    /* renamed from: pl3$a */
    /* loaded from: classes3.dex */
    static final class a extends Throwable {
        a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }
}
