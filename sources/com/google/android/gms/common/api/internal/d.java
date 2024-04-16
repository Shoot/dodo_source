package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class d<L> {
    private final Executor a;
    private volatile Object b;
    private volatile a c;

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public static final class a<L> {
        private final Object a;
        private final String b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(L l, String str) {
            this.a = l;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b.equals(aVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public interface b<L> {
        void a(@NonNull L l);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.a = new hm4(looper);
        this.b = gh8.k(l, "Listener must not be null");
        this.c = new a(l, gh8.f(str));
    }

    public void a() {
        this.b = null;
        this.c = null;
    }

    public a<L> b() {
        return this.c;
    }

    public void c(@NonNull final b<? super L> bVar) {
        gh8.k(bVar, "Notifier must not be null");
        this.a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.x
            @Override // java.lang.Runnable
            public final void run() {
                d.this.d(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(b bVar) {
        Object obj = this.b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e) {
            bVar.b();
            throw e;
        }
    }
}
