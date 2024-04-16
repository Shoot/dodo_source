package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: DelegatingScheduledFuture.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
class p<V> extends c2<V> implements ScheduledFuture<V> {
    private final ScheduledFuture<?> h;

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes2.dex */
    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.B(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v) {
            p.this.A(v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes2.dex */
    public interface b<T> {
        void a(Throwable th);

        void set(T t);
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes2.dex */
    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(c<V> cVar) {
        this.h = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: G */
    public int compareTo(Delayed delayed) {
        return this.h.compareTo(delayed);
    }

    @Override // defpackage.c2
    protected void g() {
        this.h.cancel(D());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.h.getDelay(timeUnit);
    }
}
