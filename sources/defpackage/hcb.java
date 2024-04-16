package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ecb;
import defpackage.uc1;
import defpackage.ycb;
import kotlin.Metadata;
/* compiled from: TextPaintExtensions.android.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aS\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000\u001a9\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0016\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000\u001a\f\u0010\u001b\u001a\u00020\f*\u00020\u0001H\u0000\u001a\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lwi;", "Lvqa;", "style", "Lkotlin/Function4;", "Lw24;", "Lv34;", "Lq34;", "Lr34;", "Landroid/graphics/Typeface;", "resolveTypeface", "La03;", "density", "", "requiresLetterSpacing", "a", "Lwcb;", "letterSpacing", "Luc1;", "background", "Lv80;", "baselineShift", c.a, "(JZJLv80;)Lvqa;", "Lecb;", "textMotion", "", e.a, DateTokenConverter.CONVERTER_KEY, "", "blurRadius", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: hcb  reason: default package */
/* loaded from: classes.dex */
public final class hcb {
    public static final vqa a(wi wiVar, vqa vqaVar, a94<? super w24, ? super v34, ? super q34, ? super r34, ? extends Typeface> a94Var, a03 a03Var, boolean z) {
        is5 g;
        int b;
        int a;
        z65.h(wiVar, "<this>");
        z65.h(vqaVar, "style");
        z65.h(a94Var, "resolveTypeface");
        z65.h(a03Var, "density");
        long g2 = wcb.g(vqaVar.k());
        ycb.a aVar = ycb.b;
        if (ycb.g(g2, aVar.b())) {
            wiVar.setTextSize(a03Var.S(vqaVar.k()));
        } else if (ycb.g(g2, aVar.a())) {
            wiVar.setTextSize(wiVar.getTextSize() * wcb.h(vqaVar.k()));
        }
        if (d(vqaVar)) {
            w24 i = vqaVar.i();
            v34 n = vqaVar.n();
            if (n == null) {
                n = v34.b.e();
            }
            q34 l = vqaVar.l();
            if (l != null) {
                b = l.i();
            } else {
                b = q34.b.b();
            }
            q34 c = q34.c(b);
            r34 m = vqaVar.m();
            if (m != null) {
                a = m.j();
            } else {
                a = r34.b.a();
            }
            wiVar.setTypeface(a94Var.q(i, n, c, r34.b(a)));
        }
        if (vqaVar.p() != null && !z65.c(vqaVar.p(), ns5.c.a())) {
            if (Build.VERSION.SDK_INT >= 24) {
                ts5.a.b(wiVar, vqaVar.p());
            } else {
                if (vqaVar.p().isEmpty()) {
                    g = is5.b.a();
                } else {
                    g = vqaVar.p().g(0);
                }
                wiVar.setTextLocale(ms5.a(g));
            }
        }
        if (vqaVar.j() != null && !z65.c(vqaVar.j(), "")) {
            wiVar.setFontFeatureSettings(vqaVar.j());
        }
        if (vqaVar.u() != null && !z65.c(vqaVar.u(), gbb.c.a())) {
            wiVar.setTextScaleX(wiVar.getTextScaleX() * vqaVar.u().b());
            wiVar.setTextSkewX(wiVar.getTextSkewX() + vqaVar.u().c());
        }
        wiVar.d(vqaVar.g());
        wiVar.c(vqaVar.f(), cna.b.a(), vqaVar.c());
        wiVar.f(vqaVar.r());
        wiVar.g(vqaVar.s());
        wiVar.e(vqaVar.h());
        if (ycb.g(wcb.g(vqaVar.o()), aVar.b()) && wcb.h(vqaVar.o()) != 0.0f) {
            float textSize = wiVar.getTextSize() * wiVar.getTextScaleX();
            float S = a03Var.S(vqaVar.o());
            if (textSize != 0.0f) {
                wiVar.setLetterSpacing(S / textSize);
            }
        } else if (ycb.g(wcb.g(vqaVar.o()), aVar.a())) {
            wiVar.setLetterSpacing(wcb.h(vqaVar.o()));
        }
        return c(vqaVar.o(), z, vqaVar.d(), vqaVar.e());
    }

    public static final float b(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    private static final vqa c(long j, boolean z, long j2, v80 v80Var) {
        boolean z2;
        boolean z3;
        long a;
        v80 v80Var2;
        long j3 = j2;
        boolean z4 = false;
        if (z && ycb.g(wcb.g(j), ycb.b.b()) && wcb.h(j) != 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        uc1.a aVar = uc1.b;
        if (!uc1.l(j3, aVar.e()) && !uc1.l(j3, aVar.d())) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (v80Var != null) {
            if (!v80.e(v80Var.h(), v80.b.a())) {
                z4 = true;
            }
        }
        if (!z2 && !z3 && !z4) {
            return null;
        }
        if (z2) {
            a = j;
        } else {
            a = wcb.b.a();
        }
        if (!z3) {
            j3 = aVar.e();
        }
        long j4 = j3;
        if (z4) {
            v80Var2 = v80Var;
        } else {
            v80Var2 = null;
        }
        return new vqa(0L, 0L, null, null, null, null, null, a, v80Var2, null, null, j4, null, null, null, null, 63103, null);
    }

    public static final boolean d(vqa vqaVar) {
        z65.h(vqaVar, "<this>");
        if (vqaVar.i() == null && vqaVar.l() == null && vqaVar.n() == null) {
            return false;
        }
        return true;
    }

    public static final void e(wi wiVar, ecb ecbVar) {
        int flags;
        z65.h(wiVar, "<this>");
        if (ecbVar == null) {
            ecbVar = ecb.c.a();
        }
        if (ecbVar.c()) {
            flags = wiVar.getFlags() | 128;
        } else {
            flags = wiVar.getFlags() & (-129);
        }
        wiVar.setFlags(flags);
        int b = ecbVar.b();
        ecb.b.a aVar = ecb.b.a;
        if (ecb.b.e(b, aVar.b())) {
            wiVar.setFlags(wiVar.getFlags() | 64);
            wiVar.setHinting(0);
        } else if (ecb.b.e(b, aVar.a())) {
            wiVar.getFlags();
            wiVar.setHinting(1);
        } else if (ecb.b.e(b, aVar.c())) {
            wiVar.getFlags();
            wiVar.setHinting(0);
        } else {
            wiVar.getFlags();
        }
    }
}
