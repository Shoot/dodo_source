package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.t;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.n91;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public abstract class b<O extends a.d> {
    private final Context a;
    private final String b;
    private final com.google.android.gms.common.api.a c;
    private final a.d d;
    private final mm e;
    private final Looper f;
    private final int g;
    private final c h;
    private final rwa i;
    @NonNull
    protected final com.google.android.gms.common.api.internal.c j;

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public static class a {
        @NonNull
        public static final a c = new C0217a().a();
        @NonNull
        public final rwa a;
        @NonNull
        public final Looper b;

        /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
        /* renamed from: com.google.android.gms.common.api.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0217a {
            private rwa a;
            private Looper b;

            @NonNull
            public a a() {
                if (this.a == null) {
                    this.a = new im();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }

            @NonNull
            public C0217a b(@NonNull Looper looper) {
                gh8.k(looper, "Looper must not be null.");
                this.b = looper;
                return this;
            }

            @NonNull
            public C0217a c(@NonNull rwa rwaVar) {
                gh8.k(rwaVar, "StatusExceptionMapper must not be null.");
                this.a = rwaVar;
                return this;
            }
        }

        private a(rwa rwaVar, Account account, Looper looper) {
            this.a = rwaVar;
            this.b = looper;
        }
    }

    public b(@NonNull Activity activity, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o, @NonNull a aVar2) {
        this(activity, activity, aVar, o, aVar2);
    }

    private final com.google.android.gms.common.api.internal.b w(int i, @NonNull com.google.android.gms.common.api.internal.b bVar) {
        bVar.zak();
        this.j.C(this, i, bVar);
        return bVar;
    }

    private final y6b x(int i, @NonNull h hVar) {
        a7b a7bVar = new a7b();
        this.j.D(this, i, hVar, a7bVar, this.i);
        return a7bVar.a();
    }

    @NonNull
    public c f() {
        return this.h;
    }

    @NonNull
    protected n91.a g() {
        Account account;
        Set<Scope> emptySet;
        GoogleSignInAccount f;
        n91.a aVar = new n91.a();
        a.d dVar = this.d;
        if ((dVar instanceof a.d.b) && (f = ((a.d.b) dVar).f()) != null) {
            account = f.g();
        } else {
            a.d dVar2 = this.d;
            if (dVar2 instanceof a.d.InterfaceC0216a) {
                account = ((a.d.InterfaceC0216a) dVar2).g();
            } else {
                account = null;
            }
        }
        aVar.d(account);
        a.d dVar3 = this.d;
        if (dVar3 instanceof a.d.b) {
            GoogleSignInAccount f2 = ((a.d.b) dVar3).f();
            if (f2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = f2.x();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        aVar.c(emptySet);
        aVar.e(this.a.getClass().getName());
        aVar.b(this.a.getPackageName());
        return aVar;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> y6b<TResult> h(@NonNull h<A, TResult> hVar) {
        return x(2, hVar);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> y6b<TResult> i(@NonNull h<A, TResult> hVar) {
        return x(0, hVar);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <A extends a.b> y6b<Void> j(@NonNull g<A, ?> gVar) {
        gh8.j(gVar);
        gh8.k(gVar.a.b(), "Listener has already been released.");
        gh8.k(gVar.b.a(), "Listener has already been released.");
        return this.j.w(this, gVar.a, gVar.b, gVar.c);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public y6b<Boolean> k(@NonNull d.a<?> aVar) {
        return l(aVar, 0);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public y6b<Boolean> l(@NonNull d.a<?> aVar, int i) {
        gh8.k(aVar, "Listener key cannot be null.");
        return this.j.x(this, aVar, i);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> y6b<TResult> m(@NonNull h<A, TResult> hVar) {
        return x(1, hVar);
    }

    @NonNull
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.b<? extends tk9, A>> T n(@NonNull T t) {
        w(1, t);
        return t;
    }

    @NonNull
    public final mm<O> o() {
        return this.e;
    }

    @NonNull
    public O p() {
        return (O) this.d;
    }

    @NonNull
    public Context q() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String r() {
        return this.b;
    }

    @NonNull
    public Looper s() {
        return this.f;
    }

    public final int t() {
        return this.g;
    }

    public final a.f u(Looper looper, t tVar) {
        a.f b = ((a.AbstractC0215a) gh8.j(this.c.a())).b(this.a, looper, g().a(), this.d, tVar, tVar);
        String r = r();
        if (r != null && (b instanceof com.google.android.gms.common.internal.b)) {
            ((com.google.android.gms.common.internal.b) b).M(r);
        }
        if (r != null && (b instanceof a07)) {
            ((a07) b).o(r);
        }
        return b;
    }

    public final sjc v(Context context, Handler handler) {
        return new sjc(context, handler, g().a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.NonNull com.google.android.gms.common.api.a<O> r3, @androidx.annotation.NonNull O r4, @androidx.annotation.NonNull defpackage.rwa r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.b$a$a r0 = new com.google.android.gms.common.api.b$a$a
            r0.<init>()
            r0.c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.b(r5)
            com.google.android.gms.common.api.b$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.b.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, rwa):void");
    }

    private b(@NonNull Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        gh8.k(context, "Null context is not permitted.");
        gh8.k(aVar, "Api must not be null.");
        gh8.k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = (Context) gh8.k(context.getApplicationContext(), "The provided context did not have an application context.");
        String str = null;
        if (ad8.k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.b = str;
        this.c = aVar;
        this.d = dVar;
        this.f = aVar2.b;
        mm a2 = mm.a(aVar, dVar, str);
        this.e = a2;
        this.h = new zic(this);
        com.google.android.gms.common.api.internal.c u = com.google.android.gms.common.api.internal.c.u(this.a);
        this.j = u;
        this.g = u.l();
        this.i = aVar2.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            m.u(activity, u, a2);
        }
        u.H(this);
    }

    public b(@NonNull Context context, @NonNull com.google.android.gms.common.api.a<O> aVar, @NonNull O o, @NonNull a aVar2) {
        this(context, null, aVar, o, aVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.google.android.gms.common.api.a<O> r3, @androidx.annotation.NonNull O r4, @androidx.annotation.NonNull defpackage.rwa r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.b$a$a r0 = new com.google.android.gms.common.api.b$a$a
            r0.<init>()
            r0.c(r5)
            com.google.android.gms.common.api.b$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.b.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, rwa):void");
    }
}
