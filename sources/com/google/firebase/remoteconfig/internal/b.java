package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: ConfigCacheClient.java */
/* loaded from: classes2.dex */
public class b {
    private static final Map<String, b> d = new HashMap();
    private static final Executor e = new hc6();
    private final Executor a;
    private final h b;
    private y6b<c> c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConfigCacheClient.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0245b<TResult> implements a97<TResult>, a87, l77 {
        private final CountDownLatch a;

        private C0245b() {
            this.a = new CountDownLatch(1);
        }

        @Override // defpackage.l77
        public void a() {
            this.a.countDown();
        }

        public boolean b(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.a.await(j, timeUnit);
        }

        @Override // defpackage.a87
        public void onFailure(@NonNull Exception exc) {
            this.a.countDown();
        }

        @Override // defpackage.a97
        public void onSuccess(TResult tresult) {
            this.a.countDown();
        }
    }

    private b(Executor executor, h hVar) {
        this.a = executor;
        this.b = hVar;
    }

    private static <TResult> TResult c(y6b<TResult> y6bVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C0245b c0245b = new C0245b();
        Executor executor = e;
        y6bVar.h(executor, c0245b);
        y6bVar.f(executor, c0245b);
        y6bVar.b(executor, c0245b);
        if (c0245b.b(j, timeUnit)) {
            if (y6bVar.q()) {
                return y6bVar.m();
            }
            throw new ExecutionException(y6bVar.l());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public static synchronized b h(Executor executor, h hVar) {
        b bVar;
        synchronized (b.class) {
            try {
                String b = hVar.b();
                Map<String, b> map = d;
                if (!map.containsKey(b)) {
                    map.put(b, new b(executor, hVar));
                }
                bVar = map.get(b);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void i(c cVar) throws Exception {
        return this.b.e(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6b j(boolean z, c cVar, Void r3) throws Exception {
        if (z) {
            m(cVar);
        }
        return o7b.e(cVar);
    }

    private synchronized void m(c cVar) {
        this.c = o7b.e(cVar);
    }

    public void d() {
        synchronized (this) {
            this.c = o7b.e(null);
        }
        this.b.a();
    }

    public synchronized y6b<c> e() {
        try {
            y6b<c> y6bVar = this.c;
            if (y6bVar != null) {
                if (y6bVar.p() && !this.c.q()) {
                }
            }
            Executor executor = this.a;
            final h hVar = this.b;
            Objects.requireNonNull(hVar);
            this.c = o7b.c(executor, new Callable() { // from class: jp1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h.this.d();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public c f() {
        return g(5L);
    }

    c g(long j) {
        synchronized (this) {
            try {
                y6b<c> y6bVar = this.c;
                if (y6bVar != null && y6bVar.q()) {
                    return this.c.m();
                }
                try {
                    return (c) c(e(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public y6b<c> k(c cVar) {
        return l(cVar, true);
    }

    public y6b<c> l(final c cVar, final boolean z) {
        return o7b.c(this.a, new Callable() { // from class: kp1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void i;
                i = b.this.i(cVar);
                return i;
            }
        }).s(this.a, new r1b() { // from class: lp1
            @Override // defpackage.r1b
            public final y6b a(Object obj) {
                y6b j;
                j = b.this.j(z, cVar, (Void) obj);
                return j;
            }
        });
    }
}
