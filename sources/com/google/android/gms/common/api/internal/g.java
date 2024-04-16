package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.d;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public class g<A extends a.b, L> {
    @NonNull
    public final f<A, L> a;
    @NonNull
    public final i b;
    @NonNull
    public final Runnable c;

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public static class a<A extends a.b, L> {
        private yc9 a;
        private yc9 b;
        private d d;
        private Feature[] e;
        private int g;
        private Runnable c = new Runnable() { // from class: mjc
            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        private boolean f = true;

        /* synthetic */ a(njc njcVar) {
        }

        @NonNull
        public g<A, L> a() {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (this.a != null) {
                z = true;
            } else {
                z = false;
            }
            gh8.b(z, "Must set register function");
            if (this.b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            gh8.b(z2, "Must set unregister function");
            if (this.d != null) {
                z3 = true;
            }
            gh8.b(z3, "Must set holder");
            return new g<>(new a0(this, this.d, this.e, this.f, this.g), new b0(this, (d.a) gh8.k(this.d.b(), "Key must not be null")), this.c, null);
        }

        @NonNull
        public a<A, L> b(@NonNull yc9<A, a7b<Void>> yc9Var) {
            this.a = yc9Var;
            return this;
        }

        @NonNull
        public a<A, L> c(int i) {
            this.g = i;
            return this;
        }

        @NonNull
        public a<A, L> d(@NonNull yc9<A, a7b<Boolean>> yc9Var) {
            this.b = yc9Var;
            return this;
        }

        @NonNull
        public a<A, L> e(@NonNull d<L> dVar) {
            this.d = dVar;
            return this;
        }
    }

    /* synthetic */ g(f fVar, i iVar, Runnable runnable, ojc ojcVar) {
        this.a = fVar;
        this.b = iVar;
        this.c = runnable;
    }

    @NonNull
    public static <A extends a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
