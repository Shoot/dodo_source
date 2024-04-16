package defpackage;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SubscriptionHelper.java */
/* renamed from: n1b  reason: default package */
/* loaded from: classes3.dex */
public enum n1b implements k1b {
    CANCELLED;

    public static boolean a(AtomicReference<k1b> atomicReference) {
        k1b andSet;
        k1b k1bVar = atomicReference.get();
        n1b n1bVar = CANCELLED;
        if (k1bVar != n1bVar && (andSet = atomicReference.getAndSet(n1bVar)) != n1bVar) {
            if (andSet != null) {
                andSet.cancel();
                return true;
            }
            return true;
        }
        return false;
    }

    public static void i(AtomicReference<k1b> atomicReference, AtomicLong atomicLong, long j) {
        k1b k1bVar = atomicReference.get();
        if (k1bVar != null) {
            k1bVar.w(j);
        } else if (u(j)) {
            g60.a(atomicLong, j);
            k1b k1bVar2 = atomicReference.get();
            if (k1bVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    k1bVar2.w(andSet);
                }
            }
        }
    }

    public static boolean k(AtomicReference<k1b> atomicReference, AtomicLong atomicLong, k1b k1bVar) {
        if (s(atomicReference, k1bVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                k1bVar.w(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    public static void o(long j) {
        tp9.q(new ProtocolViolationException("More produced than requested: " + j));
    }

    public static void q() {
        tp9.q(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean s(AtomicReference<k1b> atomicReference, k1b k1bVar) {
        x47.e(k1bVar, "s is null");
        if (!ho1.a(atomicReference, null, k1bVar)) {
            k1bVar.cancel();
            if (atomicReference.get() != CANCELLED) {
                q();
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean u(long j) {
        if (j <= 0) {
            tp9.q(new IllegalArgumentException("n > 0 required but it was " + j));
            return false;
        }
        return true;
    }

    public static boolean x(k1b k1bVar, k1b k1bVar2) {
        if (k1bVar2 == null) {
            tp9.q(new NullPointerException("next is null"));
            return false;
        } else if (k1bVar != null) {
            k1bVar2.cancel();
            q();
            return false;
        } else {
            return true;
        }
    }

    @Override // defpackage.k1b
    public void cancel() {
    }

    @Override // defpackage.k1b
    public void w(long j) {
    }
}
