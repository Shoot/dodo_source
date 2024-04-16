package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.p34;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: TypefaceUtill.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a(\u0010\n\u001a\u00020\u0007*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a\u001a\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002\u001a(\u0010\u0011\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0001H\u0003\u001a\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0001H\u0002\u001a0\u0010\u001e\u001a\u00020\u001c*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001e\u0010 \u001a\u0004\u0018\u00010\u001c*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\"\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroid/content/Context;", "", "attr", "La03;", "density", "", "setTextColors", "Lrcb;", "j", "id", "l", CoreConstants.CONTEXT_SCOPE_VALUE, e.a, "Landroid/content/res/TypedArray;", "index", "Luc1;", "fallbackColor", "b", "(Landroid/content/res/TypedArray;IJ)J", "Lc34;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/res/Resources;", "resourceId", "Lw24;", "i", "weight", "Lv34;", "a", "Lwcb;", "fallback", "f", "(Landroid/content/res/TypedArray;ILa03;J)J", Image.TYPE_HIGH, "Ljava/lang/ThreadLocal;", "Landroid/util/TypedValue;", "Ljava/lang/ThreadLocal;", "tempTypedValue", "compose_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: zob  reason: default package */
/* loaded from: classes2.dex */
public final class zob {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    private static final v34 a(int i) {
        if (i >= 0 && i < 150) {
            return v34.b.g();
        }
        if (150 <= i && i < 250) {
            return v34.b.h();
        }
        if (250 <= i && i < 350) {
            return v34.b.i();
        }
        if (350 <= i && i < 450) {
            return v34.b.j();
        }
        if (450 <= i && i < 550) {
            return v34.b.k();
        }
        if (550 <= i && i < 650) {
            return v34.b.l();
        }
        if (650 <= i && i < 750) {
            return v34.b.m();
        }
        if (750 <= i && i < 850) {
            return v34.b.n();
        }
        if (850 <= i && i < 1000) {
            return v34.b.o();
        }
        return v34.b.j();
    }

    public static final long b(TypedArray typedArray, int i, long j) {
        z65.h(typedArray, "$this$getComposeColor");
        if (typedArray.hasValue(i)) {
            return yc1.b(eob.b(typedArray, i));
        }
        return j;
    }

    public static /* synthetic */ long c(TypedArray typedArray, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = uc1.b.e();
        }
        return b(typedArray, i, j);
    }

    public static final c34 d(TypedArray typedArray, int i) {
        boolean E0;
        c34 c34Var;
        boolean Q;
        z65.h(typedArray, "<this>");
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (!typedArray.getValue(i, typedValue2) || typedValue2.type != 3) {
            return null;
        }
        CharSequence charSequence = typedValue2.string;
        if (z65.c(charSequence, "sans-serif")) {
            c34Var = new c34(w24.b.d(), null, 2, null);
        } else if (z65.c(charSequence, "sans-serif-thin")) {
            return new c34(w24.b.d(), v34.b.f());
        } else {
            if (z65.c(charSequence, "sans-serif-light")) {
                return new c34(w24.b.d(), v34.b.c());
            }
            if (z65.c(charSequence, "sans-serif-medium")) {
                return new c34(w24.b.d(), v34.b.d());
            }
            if (z65.c(charSequence, "sans-serif-black")) {
                return new c34(w24.b.d(), v34.b.a());
            }
            if (z65.c(charSequence, "serif")) {
                c34Var = new c34(w24.b.e(), null, 2, null);
            } else if (z65.c(charSequence, "cursive")) {
                c34Var = new c34(w24.b.a(), null, 2, null);
            } else if (z65.c(charSequence, "monospace")) {
                c34Var = new c34(w24.b.c(), null, 2, null);
            } else if (typedValue2.resourceId == 0) {
                return null;
            } else {
                CharSequence charSequence2 = typedValue2.string;
                z65.g(charSequence2, "string");
                E0 = m0b.E0(charSequence2, "res/", false, 2, null);
                if (!E0) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    CharSequence charSequence3 = typedValue2.string;
                    z65.g(charSequence3, "string");
                    Q = m0b.Q(charSequence3, ".xml", false, 2, null);
                    if (Q) {
                        Resources resources = typedArray.getResources();
                        z65.g(resources, "getResources(...)");
                        w24 i2 = i(resources, typedValue2.resourceId);
                        if (i2 == null) {
                            return null;
                        }
                        return new c34(i2, null, 2, null);
                    }
                }
                c34Var = new c34(e34.c(e34.b(typedValue2.resourceId, null, 0, 0, 14, null)), null, 2, null);
            }
        }
        return c34Var;
    }

    private static final int e(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static final long f(TypedArray typedArray, int i, a03 a03Var, long j) {
        z65.h(typedArray, "$this$getTextUnit");
        z65.h(a03Var, "density");
        wcb h = h(typedArray, i, a03Var);
        if (h != null) {
            return h.k();
        }
        return j;
    }

    public static /* synthetic */ long g(TypedArray typedArray, int i, a03 a03Var, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = wcb.b.a();
        }
        return f(typedArray, i, a03Var, j);
    }

    public static final wcb h(TypedArray typedArray, int i, a03 a03Var) {
        int i2;
        z65.h(typedArray, "<this>");
        z65.h(a03Var, "density");
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (typedArray.getValue(i, typedValue2) && typedValue2.type == 5) {
            if (Build.VERSION.SDK_INT > 22) {
                i2 = typedValue2.getComplexUnit();
            } else {
                i2 = typedValue2.data & 15;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    return wcb.b(a03Var.z(typedArray.getDimension(i, 0.0f)));
                }
                return wcb.b(xcb.d(TypedValue.complexToFloat(typedValue2.data)));
            }
            return wcb.b(xcb.b(TypedValue.complexToFloat(typedValue2.data)));
        }
        return null;
    }

    @SuppressLint({"RestrictedApi"})
    private static final w24 i(Resources resources, int i) {
        int b;
        XmlResourceParser xml = resources.getXml(i);
        z65.g(xml, "getXml(...)");
        try {
            p34.b b2 = p34.b(xml, resources);
            if (b2 instanceof p34.c) {
                p34.d[] a2 = ((p34.c) b2).a();
                z65.g(a2, "getEntries(...)");
                ArrayList arrayList = new ArrayList(a2.length);
                for (p34.d dVar : a2) {
                    int b3 = dVar.b();
                    v34 a3 = a(dVar.e());
                    if (dVar.f()) {
                        b = q34.b.a();
                    } else {
                        b = q34.b.b();
                    }
                    arrayList.add(e34.b(b3, a3, b, 0, 8, null));
                }
                w24 a4 = y24.a(arrayList);
                xml.close();
                return a4;
            }
            xml.close();
            return null;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public static final rcb j(Context context, int i, a03 a03Var, boolean z) {
        z65.h(context, "<this>");
        z65.h(a03Var, "density");
        return l(context, e(context, i), a03Var, z);
    }

    public static /* synthetic */ rcb k(Context context, int i, a03 a03Var, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            a03Var = pg.a(context);
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return j(context, i, a03Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.rcb l(android.content.Context r49, int r50, defpackage.a03 r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zob.l(android.content.Context, int, a03, boolean):rcb");
    }

    public static /* synthetic */ rcb m(Context context, int i, a03 a03Var, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            a03Var = pg.a(context);
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return l(context, i, a03Var, z);
    }
}
