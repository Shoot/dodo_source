package defpackage;

import android.graphics.ColorSpace;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidColorSpace.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0003H\u0007¨\u0006\b"}, d2 = {"Lif1;", "", "Ljd1;", "Landroid/graphics/ColorSpace;", e.a, Image.TYPE_HIGH, "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: if1  reason: default package */
/* loaded from: classes.dex */
public final class if1 {
    public static final if1 a = new if1();

    private if1() {
    }

    public static final ColorSpace e(jd1 jd1Var) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb a2;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace.Named named3;
        ColorSpace colorSpace3;
        ColorSpace.Named named4;
        ColorSpace colorSpace4;
        ColorSpace.Named named5;
        ColorSpace colorSpace5;
        ColorSpace.Named named6;
        ColorSpace colorSpace6;
        ColorSpace.Named named7;
        ColorSpace colorSpace7;
        ColorSpace.Named named8;
        ColorSpace colorSpace8;
        ColorSpace.Named named9;
        ColorSpace colorSpace9;
        ColorSpace.Named named10;
        ColorSpace colorSpace10;
        ColorSpace.Named named11;
        ColorSpace colorSpace11;
        ColorSpace.Named named12;
        ColorSpace colorSpace12;
        ColorSpace.Named named13;
        ColorSpace colorSpace13;
        ColorSpace.Named named14;
        ColorSpace colorSpace14;
        ColorSpace.Named named15;
        ColorSpace colorSpace15;
        ColorSpace.Named named16;
        ColorSpace colorSpace16;
        ColorSpace.Named named17;
        ColorSpace colorSpace17;
        z65.h(jd1Var, "<this>");
        lf1 lf1Var = lf1.a;
        if (z65.c(jd1Var, lf1Var.w())) {
            named17 = ColorSpace.Named.SRGB;
            colorSpace17 = ColorSpace.get(named17);
            z65.g(colorSpace17, "get(android.graphics.ColorSpace.Named.SRGB)");
            return colorSpace17;
        } else if (z65.c(jd1Var, lf1Var.e())) {
            named16 = ColorSpace.Named.ACES;
            colorSpace16 = ColorSpace.get(named16);
            z65.g(colorSpace16, "get(android.graphics.ColorSpace.Named.ACES)");
            return colorSpace16;
        } else if (z65.c(jd1Var, lf1Var.f())) {
            named15 = ColorSpace.Named.ACESCG;
            colorSpace15 = ColorSpace.get(named15);
            z65.g(colorSpace15, "get(android.graphics.ColorSpace.Named.ACESCG)");
            return colorSpace15;
        } else if (z65.c(jd1Var, lf1Var.g())) {
            named14 = ColorSpace.Named.ADOBE_RGB;
            colorSpace14 = ColorSpace.get(named14);
            z65.g(colorSpace14, "get(android.graphics.ColorSpace.Named.ADOBE_RGB)");
            return colorSpace14;
        } else if (z65.c(jd1Var, lf1Var.h())) {
            named13 = ColorSpace.Named.BT2020;
            colorSpace13 = ColorSpace.get(named13);
            z65.g(colorSpace13, "get(android.graphics.ColorSpace.Named.BT2020)");
            return colorSpace13;
        } else if (z65.c(jd1Var, lf1Var.i())) {
            named12 = ColorSpace.Named.BT709;
            colorSpace12 = ColorSpace.get(named12);
            z65.g(colorSpace12, "get(android.graphics.ColorSpace.Named.BT709)");
            return colorSpace12;
        } else if (z65.c(jd1Var, lf1Var.j())) {
            named11 = ColorSpace.Named.CIE_LAB;
            colorSpace11 = ColorSpace.get(named11);
            z65.g(colorSpace11, "get(android.graphics.ColorSpace.Named.CIE_LAB)");
            return colorSpace11;
        } else if (z65.c(jd1Var, lf1Var.k())) {
            named10 = ColorSpace.Named.CIE_XYZ;
            colorSpace10 = ColorSpace.get(named10);
            z65.g(colorSpace10, "get(android.graphics.ColorSpace.Named.CIE_XYZ)");
            return colorSpace10;
        } else if (z65.c(jd1Var, lf1Var.m())) {
            named9 = ColorSpace.Named.DCI_P3;
            colorSpace9 = ColorSpace.get(named9);
            z65.g(colorSpace9, "get(android.graphics.ColorSpace.Named.DCI_P3)");
            return colorSpace9;
        } else if (z65.c(jd1Var, lf1Var.n())) {
            named8 = ColorSpace.Named.DISPLAY_P3;
            colorSpace8 = ColorSpace.get(named8);
            z65.g(colorSpace8, "get(android.graphics.ColorSpace.Named.DISPLAY_P3)");
            return colorSpace8;
        } else if (z65.c(jd1Var, lf1Var.o())) {
            named7 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace7 = ColorSpace.get(named7);
            z65.g(colorSpace7, "get(android.graphics.Col…pace.Named.EXTENDED_SRGB)");
            return colorSpace7;
        } else if (z65.c(jd1Var, lf1Var.p())) {
            named6 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace6 = ColorSpace.get(named6);
            z65.g(colorSpace6, "get(android.graphics.Col…med.LINEAR_EXTENDED_SRGB)");
            return colorSpace6;
        } else if (z65.c(jd1Var, lf1Var.q())) {
            named5 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace5 = ColorSpace.get(named5);
            z65.g(colorSpace5, "get(android.graphics.ColorSpace.Named.LINEAR_SRGB)");
            return colorSpace5;
        } else if (z65.c(jd1Var, lf1Var.r())) {
            named4 = ColorSpace.Named.NTSC_1953;
            colorSpace4 = ColorSpace.get(named4);
            z65.g(colorSpace4, "get(android.graphics.ColorSpace.Named.NTSC_1953)");
            return colorSpace4;
        } else if (z65.c(jd1Var, lf1Var.u())) {
            named3 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace3 = ColorSpace.get(named3);
            z65.g(colorSpace3, "get(android.graphics.Col…pace.Named.PRO_PHOTO_RGB)");
            return colorSpace3;
        } else if (z65.c(jd1Var, lf1Var.v())) {
            named2 = ColorSpace.Named.SMPTE_C;
            colorSpace2 = ColorSpace.get(named2);
            z65.g(colorSpace2, "get(android.graphics.ColorSpace.Named.SMPTE_C)");
            return colorSpace2;
        } else {
            if (!(jd1Var instanceof om9)) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
            } else {
                om9 om9Var = (om9) jd1Var;
                float[] c = om9Var.R().c();
                okb P = om9Var.P();
                if (P != null) {
                    se1.a();
                    transferParameters = ld1.a(P.a(), P.b(), P.c(), P.d(), P.e(), P.f(), P.g());
                } else {
                    transferParameters = null;
                }
                if (transferParameters != null) {
                    ye1.a();
                    a2 = wd1.a(jd1Var.h(), ((om9) jd1Var).O(), c, transferParameters);
                } else {
                    ye1.a();
                    String h = jd1Var.h();
                    om9 om9Var2 = (om9) jd1Var;
                    float[] O = om9Var2.O();
                    final Function1<Double, Double> L = om9Var2.L();
                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: ef1
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d) {
                            double f;
                            f = if1.f(Function1.this, d);
                            return f;
                        }
                    };
                    final Function1<Double, Double> H = om9Var2.H();
                    a2 = he1.a(h, O, c, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: ff1
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d) {
                            double g;
                            g = if1.g(Function1.this, d);
                            return g;
                        }
                    }, jd1Var.f(0), jd1Var.e(0));
                }
                colorSpace = vd1.a(a2);
            }
            z65.g(colorSpace, "{\n                if (th…          }\n            }");
            return colorSpace;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double f(Function1 function1, double d) {
        z65.h(function1, "$tmp0");
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(Function1 function1, double d) {
        z65.h(function1, "$tmp0");
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    public static final jd1 h(final ColorSpace colorSpace) {
        int id;
        ColorSpace.Named named;
        int ordinal;
        ColorSpace.Named named2;
        int ordinal2;
        ColorSpace.Named named3;
        int ordinal3;
        ColorSpace.Named named4;
        int ordinal4;
        ColorSpace.Named named5;
        int ordinal5;
        ColorSpace.Named named6;
        int ordinal6;
        ColorSpace.Named named7;
        int ordinal7;
        ColorSpace.Named named8;
        int ordinal8;
        ColorSpace.Named named9;
        int ordinal9;
        ColorSpace.Named named10;
        int ordinal10;
        ColorSpace.Named named11;
        int ordinal11;
        ColorSpace.Named named12;
        int ordinal12;
        ColorSpace.Named named13;
        int ordinal13;
        ColorSpace.Named named14;
        int ordinal14;
        ColorSpace.Named named15;
        int ordinal15;
        ColorSpace.Named named16;
        int ordinal16;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] whitePoint;
        n4c n4cVar;
        float[] whitePoint2;
        float[] whitePoint3;
        okb okbVar;
        String name;
        float[] primaries;
        float[] transform;
        float minValue;
        float maxValue;
        int id2;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        float[] whitePoint4;
        float[] whitePoint5;
        float[] whitePoint6;
        z65.h(colorSpace, "<this>");
        id = colorSpace.getId();
        named = ColorSpace.Named.SRGB;
        ordinal = named.ordinal();
        if (id != ordinal) {
            named2 = ColorSpace.Named.ACES;
            ordinal2 = named2.ordinal();
            if (id != ordinal2) {
                named3 = ColorSpace.Named.ACESCG;
                ordinal3 = named3.ordinal();
                if (id != ordinal3) {
                    named4 = ColorSpace.Named.ADOBE_RGB;
                    ordinal4 = named4.ordinal();
                    if (id != ordinal4) {
                        named5 = ColorSpace.Named.BT2020;
                        ordinal5 = named5.ordinal();
                        if (id != ordinal5) {
                            named6 = ColorSpace.Named.BT709;
                            ordinal6 = named6.ordinal();
                            if (id != ordinal6) {
                                named7 = ColorSpace.Named.CIE_LAB;
                                ordinal7 = named7.ordinal();
                                if (id != ordinal7) {
                                    named8 = ColorSpace.Named.CIE_XYZ;
                                    ordinal8 = named8.ordinal();
                                    if (id != ordinal8) {
                                        named9 = ColorSpace.Named.DCI_P3;
                                        ordinal9 = named9.ordinal();
                                        if (id != ordinal9) {
                                            named10 = ColorSpace.Named.DISPLAY_P3;
                                            ordinal10 = named10.ordinal();
                                            if (id != ordinal10) {
                                                named11 = ColorSpace.Named.EXTENDED_SRGB;
                                                ordinal11 = named11.ordinal();
                                                if (id != ordinal11) {
                                                    named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
                                                    ordinal12 = named12.ordinal();
                                                    if (id != ordinal12) {
                                                        named13 = ColorSpace.Named.LINEAR_SRGB;
                                                        ordinal13 = named13.ordinal();
                                                        if (id != ordinal13) {
                                                            named14 = ColorSpace.Named.NTSC_1953;
                                                            ordinal14 = named14.ordinal();
                                                            if (id != ordinal14) {
                                                                named15 = ColorSpace.Named.PRO_PHOTO_RGB;
                                                                ordinal15 = named15.ordinal();
                                                                if (id != ordinal15) {
                                                                    named16 = ColorSpace.Named.SMPTE_C;
                                                                    ordinal16 = named16.ordinal();
                                                                    if (id == ordinal16) {
                                                                        return lf1.a.v();
                                                                    }
                                                                    if (ce1.a(colorSpace)) {
                                                                        transferParameters = de1.a(colorSpace).getTransferParameters();
                                                                        whitePoint = de1.a(colorSpace).getWhitePoint();
                                                                        if (whitePoint.length == 3) {
                                                                            whitePoint4 = de1.a(colorSpace).getWhitePoint();
                                                                            float f = whitePoint4[0];
                                                                            whitePoint5 = de1.a(colorSpace).getWhitePoint();
                                                                            float f2 = whitePoint5[1];
                                                                            whitePoint6 = de1.a(colorSpace).getWhitePoint();
                                                                            n4cVar = new n4c(f, f2, whitePoint6[2]);
                                                                        } else {
                                                                            whitePoint2 = de1.a(colorSpace).getWhitePoint();
                                                                            float f3 = whitePoint2[0];
                                                                            whitePoint3 = de1.a(colorSpace).getWhitePoint();
                                                                            n4cVar = new n4c(f3, whitePoint3[1]);
                                                                        }
                                                                        n4c n4cVar2 = n4cVar;
                                                                        if (transferParameters != null) {
                                                                            d = transferParameters.g;
                                                                            d2 = transferParameters.a;
                                                                            d3 = transferParameters.b;
                                                                            d4 = transferParameters.c;
                                                                            d5 = transferParameters.d;
                                                                            d6 = transferParameters.e;
                                                                            d7 = transferParameters.f;
                                                                            okbVar = new okb(d, d2, d3, d4, d5, d6, d7);
                                                                        } else {
                                                                            okbVar = null;
                                                                        }
                                                                        name = de1.a(colorSpace).getName();
                                                                        z65.g(name, "this.name");
                                                                        primaries = de1.a(colorSpace).getPrimaries();
                                                                        z65.g(primaries, "this.primaries");
                                                                        transform = de1.a(colorSpace).getTransform();
                                                                        s63 s63Var = new s63() { // from class: gf1
                                                                            @Override // defpackage.s63
                                                                            public final double a(double d8) {
                                                                                double i;
                                                                                i = if1.i(colorSpace, d8);
                                                                                return i;
                                                                            }
                                                                        };
                                                                        s63 s63Var2 = new s63() { // from class: hf1
                                                                            @Override // defpackage.s63
                                                                            public final double a(double d8) {
                                                                                double j;
                                                                                j = if1.j(colorSpace, d8);
                                                                                return j;
                                                                            }
                                                                        };
                                                                        minValue = colorSpace.getMinValue(0);
                                                                        maxValue = colorSpace.getMaxValue(0);
                                                                        id2 = de1.a(colorSpace).getId();
                                                                        return new om9(name, primaries, n4cVar2, transform, s63Var, s63Var2, minValue, maxValue, okbVar, id2);
                                                                    }
                                                                    return lf1.a.w();
                                                                }
                                                                return lf1.a.u();
                                                            }
                                                            return lf1.a.r();
                                                        }
                                                        return lf1.a.q();
                                                    }
                                                    return lf1.a.p();
                                                }
                                                return lf1.a.o();
                                            }
                                            return lf1.a.n();
                                        }
                                        return lf1.a.m();
                                    }
                                    return lf1.a.k();
                                }
                                return lf1.a.j();
                            }
                            return lf1.a.i();
                        }
                        return lf1.a.h();
                    }
                    return lf1.a.g();
                }
                return lf1.a.f();
            }
            return lf1.a.e();
        }
        return lf1.a.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(ColorSpace colorSpace, double d) {
        DoubleUnaryOperator oetf;
        double applyAsDouble;
        z65.h(colorSpace, "$this_composeColorSpace");
        oetf = de1.a(colorSpace).getOetf();
        applyAsDouble = oetf.applyAsDouble(d);
        return applyAsDouble;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(ColorSpace colorSpace, double d) {
        DoubleUnaryOperator eotf;
        double applyAsDouble;
        z65.h(colorSpace, "$this_composeColorSpace");
        eotf = de1.a(colorSpace).getEotf();
        applyAsDouble = eotf.applyAsDouble(d);
        return applyAsDouble;
    }
}
