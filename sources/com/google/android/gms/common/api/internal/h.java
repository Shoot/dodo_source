package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public abstract class h<A extends a.b, ResultT> {
    private final Feature[] a;
    private final boolean b;
    private final int c;

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public static class a<A extends a.b, ResultT> {
        private yc9 a;
        private Feature[] c;
        private boolean b = true;
        private int d = 0;

        /* synthetic */ a(ujc ujcVar) {
        }

        @NonNull
        public h<A, ResultT> a() {
            boolean z;
            if (this.a != null) {
                z = true;
            } else {
                z = false;
            }
            gh8.b(z, "execute parameter required");
            return new c0(this, this.c, this.b, this.d);
        }

        @NonNull
        @Deprecated
        public a<A, ResultT> b(@NonNull final xa0<A, a7b<ResultT>> xa0Var) {
            this.a = new yc9() { // from class: tjc
                @Override // defpackage.yc9
                public final void a(Object obj, Object obj2) {
                    xa0.this.a((a.b) obj, (a7b) obj2);
                }
            };
            return this;
        }

        @NonNull
        public a<A, ResultT> c(@NonNull yc9<A, a7b<ResultT>> yc9Var) {
            this.a = yc9Var;
            return this;
        }

        @NonNull
        public a<A, ResultT> d(boolean z) {
            this.b = z;
            return this;
        }

        @NonNull
        public a<A, ResultT> e(@NonNull Feature... featureArr) {
            this.c = featureArr;
            return this;
        }

        @NonNull
        public a<A, ResultT> f(int i) {
            this.d = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h(Feature[] featureArr, boolean z, int i) {
        this.a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    @NonNull
    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(@NonNull A a2, @NonNull a7b<ResultT> a7bVar) throws RemoteException;

    public boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final Feature[] e() {
        return this.a;
    }
}
