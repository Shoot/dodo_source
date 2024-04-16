package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: ColorSpaces.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u0017\u0010#\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010%\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010(\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u0017R\u0017\u0010*\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b)\u0010\u0017R\u0017\u0010,\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b)\u0010\u0015\u001a\u0004\b+\u0010\u0017R\u0017\u0010.\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b-\u0010\u0017R\u0017\u0010/\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u00101\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b0\u0010\u0017R\u0017\u00102\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\b\u0011\u0010\u0017R\u0017\u00103\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b$\u00107R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b\"\u00107R\u001a\u0010;\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010\u0015\u001a\u0004\b:\u0010\u0017R\u0017\u0010<\u001a\u0002048\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b5\u00107R \u0010@\u001a\b\u0012\u0004\u0012\u0002040=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b&\u0010?¨\u0006C"}, d2 = {"Llf1;", "", "", "b", "[F", "x", "()[F", "SrgbPrimaries", c.a, Image.TYPE_SMALL, "Ntsc1953Primaries", "Lokb;", DateTokenConverter.CONVERTER_KEY, "Lokb;", "getSrgbTransferParameters$ui_graphics_release", "()Lokb;", "SrgbTransferParameters", e.a, "NoneTransferParameters", "Lom9;", "f", "Lom9;", "w", "()Lom9;", "Srgb", "g", "q", "LinearSrgb", Image.TYPE_HIGH, "o", "ExtendedSrgb", "i", "p", "LinearExtendedSrgb", "j", "Bt709", "k", "Bt2020", "l", Image.TYPE_MEDIUM, "DciP3", "n", "DisplayP3", "r", "Ntsc1953", "v", "SmpteC", "AdobeRgb", "u", "ProPhotoRgb", "Aces", "Acescg", "Ljd1;", "t", "Ljd1;", "()Ljd1;", "CieXyz", "CieLab", "y", "Unspecified", "Oklab", "", "[Ljd1;", "()[Ljd1;", "ColorSpacesArray", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: lf1  reason: default package */
/* loaded from: classes.dex */
public final class lf1 {
    public static final lf1 a = new lf1();
    private static final float[] b;
    private static final float[] c;
    private static final okb d;
    private static final okb e;
    private static final om9 f;
    private static final om9 g;
    private static final om9 h;
    private static final om9 i;
    private static final om9 j;
    private static final om9 k;
    private static final om9 l;
    private static final om9 m;
    private static final om9 n;
    private static final om9 o;
    private static final om9 p;
    private static final om9 q;
    private static final om9 r;
    private static final om9 s;
    private static final jd1 t;
    private static final jd1 u;
    private static final om9 v;
    private static final jd1 w;
    private static final jd1[] x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        c = fArr2;
        okb okbVar = new okb(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        d = okbVar;
        okb okbVar2 = new okb(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        e = okbVar2;
        au4 au4Var = au4.a;
        om9 om9Var = new om9("sRGB IEC61966-2.1", fArr, au4Var.e(), okbVar, 0);
        f = om9Var;
        om9 om9Var2 = new om9("sRGB IEC61966-2.1 (Linear)", fArr, au4Var.e(), 1.0d, 0.0f, 1.0f, 1);
        g = om9Var2;
        om9 om9Var3 = new om9("scRGB-nl IEC 61966-2-2:2003", fArr, au4Var.e(), null, new s63() { // from class: jf1
            @Override // defpackage.s63
            public final double a(double d2) {
                double c2;
                c2 = lf1.c(d2);
                return c2;
            }
        }, new s63() { // from class: kf1
            @Override // defpackage.s63
            public final double a(double d2) {
                double d3;
                d3 = lf1.d(d2);
                return d3;
            }
        }, -0.799f, 2.399f, okbVar, 2);
        h = om9Var3;
        om9 om9Var4 = new om9("scRGB IEC 61966-2-2:2003", fArr, au4Var.e(), 1.0d, -0.5f, 7.499f, 3);
        i = om9Var4;
        om9 om9Var5 = new om9("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, au4Var.e(), new okb(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        j = om9Var5;
        om9 om9Var6 = new om9("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, au4Var.e(), new okb(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        k = om9Var6;
        om9 om9Var7 = new om9("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new n4c(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        l = om9Var7;
        om9 om9Var8 = new om9("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, au4Var.e(), okbVar, 7);
        m = om9Var8;
        om9 om9Var9 = new om9("NTSC (1953)", fArr2, au4Var.a(), new okb(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        n = om9Var9;
        om9 om9Var10 = new om9("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, au4Var.e(), new okb(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        o = om9Var10;
        om9 om9Var11 = new om9("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, au4Var.e(), 2.2d, 0.0f, 1.0f, 10);
        p = om9Var11;
        om9 om9Var12 = new om9("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, au4Var.b(), new okb(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        q = om9Var12;
        om9 om9Var13 = new om9("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, au4Var.d(), 1.0d, -65504.0f, 65504.0f, 12);
        r = om9Var13;
        om9 om9Var14 = new om9("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, au4Var.d(), 1.0d, -65504.0f, 65504.0f, 13);
        s = om9Var14;
        ccc cccVar = new ccc("Generic XYZ", 14);
        t = cccVar;
        bj5 bj5Var = new bj5("Generic L*a*b*", 15);
        u = bj5Var;
        om9 om9Var15 = new om9("None", fArr, au4Var.e(), okbVar2, 16);
        v = om9Var15;
        f77 f77Var = new f77("Oklab", 17);
        w = f77Var;
        x = new jd1[]{om9Var, om9Var2, om9Var3, om9Var4, om9Var5, om9Var6, om9Var7, om9Var8, om9Var9, om9Var10, om9Var11, om9Var12, om9Var13, om9Var14, cccVar, bj5Var, om9Var15, f77Var};
    }

    private lf1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double c(double d2) {
        return kd1.a(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d(double d2) {
        return kd1.b(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final om9 e() {
        return r;
    }

    public final om9 f() {
        return s;
    }

    public final om9 g() {
        return p;
    }

    public final om9 h() {
        return k;
    }

    public final om9 i() {
        return j;
    }

    public final jd1 j() {
        return u;
    }

    public final jd1 k() {
        return t;
    }

    public final jd1[] l() {
        return x;
    }

    public final om9 m() {
        return l;
    }

    public final om9 n() {
        return m;
    }

    public final om9 o() {
        return h;
    }

    public final om9 p() {
        return i;
    }

    public final om9 q() {
        return g;
    }

    public final om9 r() {
        return n;
    }

    public final float[] s() {
        return c;
    }

    public final jd1 t() {
        return w;
    }

    public final om9 u() {
        return q;
    }

    public final om9 v() {
        return o;
    }

    public final om9 w() {
        return f;
    }

    public final float[] x() {
        return b;
    }

    public final om9 y() {
        return v;
    }
}
