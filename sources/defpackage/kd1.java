package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ad1;
import defpackage.zq1;
import kotlin.Metadata;
/* compiled from: ColorSpace.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007\u001a8\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a8\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001aH\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001aH\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a8\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a8\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a\u0018\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0019H\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0000\u001a\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0000\u001a(\u0010#\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0000\u001a(\u0010$\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0000\u001a(\u0010%\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0000\u001a\u0018\u0010&\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0000\u001a \u0010\u0014\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"Ljd1;", "destination", "Lge9;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Lzq1;", Image.TYPE_HIGH, "(Ljd1;Ljd1;I)Lzq1;", "Ln4c;", "whitePoint", "Li6;", "adaptation", c.a, "", "x", "a", "b", DateTokenConverter.CONVERTER_KEY, "g", "q", Image.TYPE_SMALL, e.a, "f", "r", "t", "", "", Image.TYPE_MEDIUM, "j", "lhs", "rhs", "k", "", "r0", "r1", "r2", "n", "o", "p", "l", "matrix", "srcWhitePoint", "dstWhitePoint", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: kd1 */
/* loaded from: classes.dex */
public final class kd1 {
    public static final double a(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        if (d < 0.0d) {
            d7 = -d;
        } else {
            d7 = d;
        }
        return Math.copySign(q(d7, d2, d3, d4, d5, d6), d);
    }

    public static final double b(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        if (d < 0.0d) {
            d7 = -d;
        } else {
            d7 = d;
        }
        return Math.copySign(s(d7, d2, d3, d4, d5, d6), d);
    }

    public static final jd1 c(jd1 jd1Var, n4c n4cVar, i6 i6Var) {
        z65.h(jd1Var, "<this>");
        z65.h(n4cVar, "whitePoint");
        z65.h(i6Var, "adaptation");
        if (ad1.e(jd1Var.g(), ad1.a.b())) {
            om9 om9Var = (om9) jd1Var;
            if (f(om9Var.R(), n4cVar)) {
                return jd1Var;
            }
            return new om9(om9Var, k(e(i6Var.b(), om9Var.R().c(), n4cVar.c()), om9Var.Q()), n4cVar);
        }
        return jd1Var;
    }

    public static /* synthetic */ jd1 d(jd1 jd1Var, n4c n4cVar, i6 i6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            i6Var = i6.b.a();
        }
        return c(jd1Var, n4cVar, i6Var);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        z65.h(fArr, "matrix");
        z65.h(fArr2, "srcWhitePoint");
        z65.h(fArr3, "dstWhitePoint");
        float[] m = m(fArr, fArr2);
        float[] m2 = m(fArr, fArr3);
        return k(j(fArr), l(new float[]{m2[0] / m[0], m2[1] / m[1], m2[2] / m[2]}, fArr));
    }

    public static final boolean f(n4c n4cVar, n4c n4cVar2) {
        z65.h(n4cVar, "a");
        z65.h(n4cVar2, "b");
        if (n4cVar == n4cVar2) {
            return true;
        }
        if (Math.abs(n4cVar.a() - n4cVar2.a()) < 0.001f && Math.abs(n4cVar.b() - n4cVar2.b()) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        z65.h(fArr, "a");
        z65.h(fArr2, "b");
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final zq1 h(jd1 jd1Var, jd1 jd1Var2, int i) {
        z65.h(jd1Var, "$this$connect");
        z65.h(jd1Var2, "destination");
        lf1 lf1Var = lf1.a;
        if (jd1Var == lf1Var.w()) {
            if (jd1Var2 == lf1Var.w()) {
                return zq1.g.d();
            }
            if (jd1Var2 == lf1Var.t() && ge9.e(i, ge9.a.b())) {
                return zq1.g.e();
            }
        } else if (jd1Var == lf1Var.t() && jd1Var2 == lf1Var.w() && ge9.e(i, ge9.a.b())) {
            return zq1.g.c();
        }
        if (jd1Var == jd1Var2) {
            return zq1.g.f(jd1Var);
        }
        long g = jd1Var.g();
        ad1.a aVar = ad1.a;
        if (ad1.e(g, aVar.b()) && ad1.e(jd1Var2.g(), aVar.b())) {
            return new zq1.b((om9) jd1Var, (om9) jd1Var2, i, null);
        }
        return new zq1(jd1Var, jd1Var2, i, null);
    }

    public static /* synthetic */ zq1 i(jd1 jd1Var, jd1 jd1Var2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jd1Var2 = lf1.a.w();
        }
        if ((i2 & 2) != 0) {
            i = ge9.a.b();
        }
        return h(jd1Var, jd1Var2, i);
    }

    public static final float[] j(float[] fArr) {
        z65.h(fArr, Image.TYPE_MEDIUM);
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final float[] k(float[] fArr, float[] fArr2) {
        z65.h(fArr, "lhs");
        z65.h(fArr2, "rhs");
        float f = fArr[3];
        float f2 = fArr2[1];
        float f3 = fArr[6];
        float f4 = fArr2[2];
        float f5 = fArr[1];
        float f6 = fArr2[0];
        float f7 = fArr[4];
        float f8 = fArr[7];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = fArr[0];
        float f12 = fArr2[4];
        float f13 = (fArr2[3] * f11) + (f * f12);
        float f14 = fArr2[5];
        float f15 = fArr[1];
        float f16 = fArr2[3];
        float f17 = fArr[2];
        float f18 = f11 * fArr2[6];
        float f19 = fArr[3];
        float f20 = fArr2[7];
        float f21 = f18 + (f19 * f20);
        float f22 = fArr2[8];
        float f23 = fArr2[6];
        return new float[]{(fArr[0] * fArr2[0]) + (f * f2) + (f3 * f4), (f5 * f6) + (f2 * f7) + (f8 * f4), (fArr[2] * f6) + (fArr2[1] * f9) + (f4 * f10), f13 + (f3 * f14), (f15 * f16) + (f7 * f12) + (f8 * f14), (f16 * f17) + (f9 * fArr2[4]) + (f14 * f10), f21 + (f3 * f22), (f15 * f23) + (fArr[4] * f20) + (f8 * f22), (f17 * f23) + (fArr[5] * fArr2[7]) + (f10 * f22)};
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        z65.h(fArr, "lhs");
        z65.h(fArr2, "rhs");
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f, fArr2[4] * f2, fArr2[5] * f3, f * fArr2[6], f2 * fArr2[7], f3 * fArr2[8]};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        z65.h(fArr, "lhs");
        z65.h(fArr2, "rhs");
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }

    public static final float n(float[] fArr, float f, float f2, float f3) {
        z65.h(fArr, "lhs");
        return (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
    }

    public static final float o(float[] fArr, float f, float f2, float f3) {
        z65.h(fArr, "lhs");
        return (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
    }

    public static final float p(float[] fArr, float f, float f2, float f3) {
        z65.h(fArr, "lhs");
        return (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static final double q(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d >= d5 * d4) {
            return (Math.pow(d, 1.0d / d6) - d3) / d2;
        }
        return d / d4;
    }

    public static final double r(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if (d >= d5 * d4) {
            return (Math.pow(d - d6, 1.0d / d8) - d3) / d2;
        }
        return (d - d7) / d4;
    }

    public static final double s(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d >= d5) {
            return Math.pow((d2 * d) + d3, d6);
        }
        return d * d4;
    }

    public static final double t(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if (d >= d5) {
            return Math.pow((d2 * d) + d3, d8) + d6;
        }
        return (d4 * d) + d7;
    }
}
