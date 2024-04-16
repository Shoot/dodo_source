package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import defpackage.x00;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: btc  reason: default package */
/* loaded from: classes2.dex */
public final class btc<TResult extends x00> implements n77<TResult>, Runnable {
    static final Handler d = new zzc(Looper.getMainLooper());
    static final SparseArray<btc<?>> e = new SparseArray<>(2);
    private static final AtomicInteger f = new AtomicInteger();
    int a;
    private suc b;
    private y6b<TResult> c;

    btc() {
    }

    public static <TResult extends x00> btc<TResult> b(y6b<TResult> y6bVar) {
        long j;
        btc<TResult> btcVar = new btc<>();
        int incrementAndGet = f.incrementAndGet();
        btcVar.a = incrementAndGet;
        e.put(incrementAndGet, btcVar);
        Handler handler = d;
        j = y00.a;
        handler.postDelayed(btcVar, j);
        y6bVar.c(btcVar);
        return btcVar;
    }

    private final void e() {
        if (this.c != null && this.b != null) {
            e.delete(this.a);
            d.removeCallbacks(this);
            suc sucVar = this.b;
            if (sucVar != null) {
                sucVar.b(this.c);
            }
        }
    }

    @Override // defpackage.n77
    public final void a(@NonNull y6b<TResult> y6bVar) {
        this.c = y6bVar;
        e();
    }

    public final void c(suc sucVar) {
        if (this.b == sucVar) {
            this.b = null;
        }
    }

    public final void d(suc sucVar) {
        this.b = sucVar;
        e();
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.delete(this.a);
    }
}
