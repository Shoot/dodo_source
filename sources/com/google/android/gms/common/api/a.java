package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.b;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class a<O extends d> {
    private final AbstractC0215a a;
    private final g b;
    private final String c;

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0215a<T extends f, O> extends e<T, O> {
        @NonNull
        public T a(@NonNull Context context, @NonNull Looper looper, @NonNull n91 n91Var, @NonNull O o, @NonNull pq1 pq1Var, @NonNull q77 q77Var) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        @NonNull
        @Deprecated
        public T b(@NonNull Context context, @NonNull Looper looper, @NonNull n91 n91Var, @NonNull O o, @NonNull c.b bVar, @NonNull c.InterfaceC0218c interfaceC0218c) {
            return a(context, looper, n91Var, o, bVar, interfaceC0218c);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public static class c<C extends b> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public interface d {
        @NonNull
        public static final c I4 = new c(null);

        /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC0216a extends d {
            @NonNull
            Account g();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
        /* loaded from: classes2.dex */
        public interface b extends d {
            GoogleSignInAccount f();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
        /* loaded from: classes2.dex */
        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(jic jicVar) {
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public static abstract class e<T extends b, O> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public interface f extends b {
        void b(@NonNull String str);

        @NonNull
        String c();

        void d(@NonNull b.c cVar);

        void disconnect();

        boolean e();

        boolean f();

        @NonNull
        Set<Scope> h();

        void i(com.google.android.gms.common.internal.e eVar, Set<Scope> set);

        boolean isConnected();

        boolean isConnecting();

        void j(@NonNull b.e eVar);

        int k();

        @NonNull
        Feature[] l();

        String m();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(@NonNull String str, @NonNull AbstractC0215a<C, O> abstractC0215a, @NonNull g<C> gVar) {
        gh8.k(abstractC0215a, "Cannot construct an Api with a null ClientBuilder");
        gh8.k(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = abstractC0215a;
        this.b = gVar;
    }

    @NonNull
    public final AbstractC0215a a() {
        return this.a;
    }

    @NonNull
    public final c b() {
        return this.b;
    }

    @NonNull
    public final String c() {
        return this.c;
    }
}
