package defpackage;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: DisposableHelper.java */
/* renamed from: g43  reason: default package */
/* loaded from: classes3.dex */
public enum g43 implements z33 {
    DISPOSED;

    public static boolean E(z33 z33Var, z33 z33Var2) {
        if (z33Var2 == null) {
            tp9.q(new NullPointerException("next is null"));
            return false;
        } else if (z33Var != null) {
            z33Var2.a();
            s();
            return false;
        } else {
            return true;
        }
    }

    public static boolean k(AtomicReference<z33> atomicReference) {
        z33 andSet;
        z33 z33Var = atomicReference.get();
        g43 g43Var = DISPOSED;
        if (z33Var != g43Var && (andSet = atomicReference.getAndSet(g43Var)) != g43Var) {
            if (andSet != null) {
                andSet.a();
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean o(z33 z33Var) {
        if (z33Var == DISPOSED) {
            return true;
        }
        return false;
    }

    public static boolean q(AtomicReference<z33> atomicReference, z33 z33Var) {
        z33 z33Var2;
        do {
            z33Var2 = atomicReference.get();
            if (z33Var2 == DISPOSED) {
                if (z33Var != null) {
                    z33Var.a();
                    return false;
                }
                return false;
            }
        } while (!ho1.a(atomicReference, z33Var2, z33Var));
        return true;
    }

    public static void s() {
        tp9.q(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean u(AtomicReference<z33> atomicReference, z33 z33Var) {
        z33 z33Var2;
        do {
            z33Var2 = atomicReference.get();
            if (z33Var2 == DISPOSED) {
                if (z33Var != null) {
                    z33Var.a();
                    return false;
                }
                return false;
            }
        } while (!ho1.a(atomicReference, z33Var2, z33Var));
        if (z33Var2 != null) {
            z33Var2.a();
            return true;
        }
        return true;
    }

    public static boolean w(AtomicReference<z33> atomicReference, z33 z33Var) {
        x47.e(z33Var, "d is null");
        if (!ho1.a(atomicReference, null, z33Var)) {
            z33Var.a();
            if (atomicReference.get() != DISPOSED) {
                s();
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean x(AtomicReference<z33> atomicReference, z33 z33Var) {
        if (!ho1.a(atomicReference, null, z33Var)) {
            if (atomicReference.get() == DISPOSED) {
                z33Var.a();
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.z33
    public boolean i() {
        return true;
    }

    @Override // defpackage.z33
    public void a() {
    }
}
