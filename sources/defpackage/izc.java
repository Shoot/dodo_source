package defpackage;

import android.content.Context;
import defpackage.dzc;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: izc */
/* loaded from: classes2.dex */
public abstract class izc<T> {
    private static volatile d0d h;
    private final e0d a;
    private final String b;
    private final T c;
    private volatile int d;
    private volatile T e;
    private final boolean f;
    private static final Object g = new Object();
    private static final AtomicReference<Collection<izc<?>>> i = new AtomicReference<>();
    private static h0d j = new h0d(new k0d() { // from class: jzc
        @Override // defpackage.k0d
        public final boolean zza() {
            return izc.n();
        }
    });
    private static final AtomicInteger k = new AtomicInteger();

    private final T d(d0d d0dVar) {
        x84<Context, Boolean> x84Var;
        String e;
        e0d e0dVar = this.a;
        if (!e0dVar.e && ((x84Var = e0dVar.i) == null || x84Var.apply(d0dVar.a()).booleanValue())) {
            azc a = azc.a(d0dVar.a());
            e0d e0dVar2 = this.a;
            if (e0dVar2.e) {
                e = null;
            } else {
                e = e(e0dVar2.c);
            }
            Object k2 = a.k(e);
            if (k2 != null) {
                return c(k2);
            }
        }
        return null;
    }

    private final String e(String str) {
        if (str != null && str.isEmpty()) {
            return this.b;
        }
        String str2 = this.b;
        return str + str2;
    }

    public static /* synthetic */ izc f(e0d e0dVar, String str, Boolean bool, boolean z) {
        return new mzc(e0dVar, str, bool, true);
    }

    public static /* synthetic */ izc g(e0d e0dVar, String str, Double d, boolean z) {
        return new c0d(e0dVar, str, d, true);
    }

    public static /* synthetic */ izc h(e0d e0dVar, String str, Long l, boolean z) {
        return new nzc(e0dVar, str, l, true);
    }

    public static /* synthetic */ izc i(e0d e0dVar, String str, String str2, boolean z) {
        return new b0d(e0dVar, str, str2, true);
    }

    private final T j(d0d d0dVar) {
        uyc b;
        Object k2;
        if (this.a.b != null) {
            if (gzc.b(d0dVar.a(), this.a.b)) {
                if (this.a.h) {
                    b = qyc.b(d0dVar.a().getContentResolver(), fzc.a(fzc.b(d0dVar.a(), this.a.b.getLastPathSegment())), new Runnable() { // from class: hzc
                        @Override // java.lang.Runnable
                        public final void run() {
                            izc.m();
                        }
                    });
                } else {
                    b = qyc.b(d0dVar.a().getContentResolver(), this.a.b, new Runnable() { // from class: hzc
                        @Override // java.lang.Runnable
                        public final void run() {
                            izc.m();
                        }
                    });
                }
            } else {
                b = null;
            }
        } else {
            b = f0d.b(d0dVar.a(), this.a.a, new Runnable() { // from class: hzc
                @Override // java.lang.Runnable
                public final void run() {
                    izc.m();
                }
            });
        }
        if (b == null || (k2 = b.k(k())) == null) {
            return null;
        }
        return c(k2);
    }

    public static void l(final Context context) {
        if (h == null && context != null) {
            Object obj = g;
            synchronized (obj) {
                try {
                    if (h == null) {
                        synchronized (obj) {
                            d0d d0dVar = h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (d0dVar != null) {
                                if (d0dVar.a() != context) {
                                }
                            }
                            qyc.d();
                            f0d.c();
                            azc.b();
                            h = new myc(context, m2b.a(new l2b() { // from class: lzc
                                @Override // defpackage.l2b
                                public final Object get() {
                                    pb7 a;
                                    a = dzc.a.a(context);
                                    return a;
                                }
                            }));
                            k.incrementAndGet();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public static void m() {
        k.incrementAndGet();
    }

    public static /* synthetic */ boolean n() {
        return true;
    }

    public final T b() {
        boolean z;
        T j2;
        if (!this.f) {
            hh8.n(j.a(this.b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i2 = k.get();
        if (this.d < i2) {
            synchronized (this) {
                try {
                    if (this.d < i2) {
                        d0d d0dVar = h;
                        pb7<bzc> a = pb7.a();
                        String str = null;
                        if (d0dVar != null) {
                            a = d0dVar.b().get();
                            if (a.c()) {
                                e0d e0dVar = this.a;
                                str = a.b().a(e0dVar.b, e0dVar.a, e0dVar.d, this.b);
                            }
                        }
                        if (d0dVar != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        hh8.n(z, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (!this.a.f ? (j2 = j(d0dVar)) == null && (j2 = d(d0dVar)) == null : (j2 = d(d0dVar)) == null && (j2 = j(d0dVar)) == null) {
                            j2 = this.c;
                        }
                        if (a.c()) {
                            if (str == null) {
                                j2 = this.c;
                            } else {
                                j2 = c(str);
                            }
                        }
                        this.e = j2;
                        this.d = i2;
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    abstract T c(Object obj);

    public final String k() {
        return e(this.a.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public izc(e0d e0dVar, String str, T t, boolean z) {
        this.d = -1;
        String str2 = e0dVar.a;
        if (str2 == null && e0dVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && e0dVar.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.a = e0dVar;
        this.b = str;
        this.c = t;
        this.f = z;
    }
}
