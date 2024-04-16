package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import defpackage.ek9;
import defpackage.p34;
import defpackage.w34;
/* compiled from: TypefaceCompat.java */
/* renamed from: hob  reason: default package */
/* loaded from: classes.dex */
public class hob {
    private static final pob a;
    private static final j36<String, Typeface> b;

    /* compiled from: TypefaceCompat.java */
    /* renamed from: hob$a */
    /* loaded from: classes.dex */
    public static class a extends w34.c {
        private ek9.e a;

        public a(ek9.e eVar) {
            this.a = eVar;
        }

        @Override // defpackage.w34.c
        public void a(int i) {
            ek9.e eVar = this.a;
            if (eVar != null) {
                eVar.f(i);
            }
        }

        @Override // defpackage.w34.c
        public void b(@NonNull Typeface typeface) {
            ek9.e eVar = this.a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new oob();
        } else if (i >= 28) {
            a = new nob();
        } else if (i >= 26) {
            a = new mob();
        } else if (i >= 24 && job.i()) {
            a = new job();
        } else {
            a = new iob();
        }
        b = new j36<>(16);
    }

    @NonNull
    public static Typeface a(@NonNull Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(@NonNull Context context, CancellationSignal cancellationSignal, @NonNull w34.b[] bVarArr, int i) {
        return a.b(context, cancellationSignal, bVarArr, i);
    }

    public static Typeface c(@NonNull Context context, @NonNull p34.b bVar, @NonNull Resources resources, int i, String str, int i2, int i3, ek9.e eVar, Handler handler, boolean z) {
        Typeface a2;
        boolean z2;
        int i4;
        if (bVar instanceof p34.e) {
            p34.e eVar2 = (p34.e) bVar;
            Typeface g = g(eVar2.c());
            if (g != null) {
                if (eVar != null) {
                    eVar.d(g, handler);
                }
                return g;
            }
            if (!z ? eVar == null : eVar2.a() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                i4 = eVar2.d();
            } else {
                i4 = -1;
            }
            a2 = w34.c(context, eVar2.b(), i3, z2, i4, ek9.e.e(handler), new a(eVar));
        } else {
            a2 = a.a(context, (p34.c) bVar, resources, i3);
            if (eVar != null) {
                if (a2 != null) {
                    eVar.d(a2, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a2 != null) {
            b.e(e(resources, i, str, i2, i3), a2);
        }
        return a2;
    }

    public static Typeface d(@NonNull Context context, @NonNull Resources resources, int i, String str, int i2, int i3) {
        Typeface d = a.d(context, resources, i, str, i3);
        if (d != null) {
            b.e(e(resources, i, str, i2, i3), d);
        }
        return d;
    }

    private static String e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + CoreConstants.DASH_CHAR + str + CoreConstants.DASH_CHAR + i2 + CoreConstants.DASH_CHAR + i + CoreConstants.DASH_CHAR + i3;
    }

    public static Typeface f(@NonNull Resources resources, int i, String str, int i2, int i3) {
        return b.d(e(resources, i, str, i2, i3));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
