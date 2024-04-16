package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: Uninterruptibles.java */
/* renamed from: pqb  reason: default package */
/* loaded from: classes2.dex */
public final class pqb {
    public static <V> V a(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }
}
