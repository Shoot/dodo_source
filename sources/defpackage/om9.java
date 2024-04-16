package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: Rgb.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 _2\u00020\u0001:\u0001\u0015B]\b\u0000\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u00103\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020 \u0012\b\u00105\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010C\u001a\u000209\u0012\u0006\u0010K\u001a\u000209\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010)\u0012\u0006\u0010W\u001a\u00020\u0002¢\u0006\u0004\bX\u0010YB1\b\u0010\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u00103\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020 \u0012\u0006\u0010Z\u001a\u00020)\u0012\u0006\u0010W\u001a\u00020\u0002¢\u0006\u0004\bX\u0010[BA\b\u0010\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u00103\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020 \u0012\u0006\u0010\\\u001a\u00020?\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010W\u001a\u00020\u0002¢\u0006\u0004\bX\u0010]B!\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0000\u0012\u0006\u00105\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020 ¢\u0006\u0004\bX\u0010^J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0019\u0010.\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00103\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00105\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b4\u00102R\u001a\u00108\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00102R\u001a\u0010=\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010<R#\u0010C\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?0>8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010E\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\bD\u0010<R\u001a\u0010H\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010:\u001a\u0004\bG\u0010<R#\u0010K\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?0>8\u0006¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bJ\u0010BR\u001a\u0010N\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010:\u001a\u0004\bM\u0010<R\u001a\u0010Q\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\b/\u0010R\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006`"}, d2 = {"Lom9;", "Ljd1;", "", "component", "", "f", e.a, "", "v", "l", "v0", "v1", "v2", "", "j", "(FFF)J", Image.TYPE_MEDIUM, "(FFF)F", "x", "y", "z", "a", "colorSpace", "Luc1;", "n", "(FFFFLjd1;)J", "b", "", "other", "", "equals", "hashCode", "Ln4c;", "Ln4c;", "R", "()Ln4c;", "whitePoint", "F", "min", "g", "max", "Lokb;", Image.TYPE_HIGH, "Lokb;", "P", "()Lokb;", "transferParameters", "i", "[F", "O", "()[F", "primaries", "Q", "transform", "k", "K", "inverseTransform", "Ls63;", "Ls63;", "N", "()Ls63;", "oetfOrig", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "L", "()Lkotlin/jvm/functions/Function1;", "oetf", "M", "oetfFunc", "o", "J", "eotfOrig", "p", "H", "eotf", "q", "I", "eotfFunc", "r", "Z", "isWideGamut", "()Z", Image.TYPE_SMALL, "isSrgb", "", Action.NAME_ATTRIBUTE, "id", "<init>", "(Ljava/lang/String;[FLn4c;[FLs63;Ls63;FFLokb;I)V", "function", "(Ljava/lang/String;[FLn4c;Lokb;I)V", "gamma", "(Ljava/lang/String;[FLn4c;DFFI)V", "(Lom9;[FLn4c;)V", "t", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: om9  reason: default package */
/* loaded from: classes.dex */
public final class om9 extends jd1 {
    public static final a t = new a(null);
    private static final s63 u = new s63() { // from class: hm9
        @Override // defpackage.s63
        public final double a(double d) {
            double x;
            x = om9.x(d);
            return x;
        }
    };
    private final n4c e;
    private final float f;
    private final float g;
    private final okb h;
    private final float[] i;
    private final float[] j;
    private final float[] k;
    private final s63 l;
    private final Function1<Double, Double> m;
    private final s63 n;
    private final s63 o;
    private final Function1<Double, Double> p;
    private final s63 q;
    private final boolean r;
    private final boolean s;

    /* compiled from: Rgb.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J@\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J \u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lom9$a;", "", "", "primaries", "Ln4c;", "whitePoint", "Ls63;", "OETF", "EOTF", "", "min", "max", "", "id", "", "j", "", "point", "a", "b", "f", "k", e.a, "ax", "ay", "bx", "by", "i", "p1", "p2", Image.TYPE_HIGH, "l", "g", "DoubleIdentity", "Ls63;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: om9$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float e(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            if (f7 < 0.0f) {
                return -f7;
            }
            return f7;
        }

        private final boolean f(double d, s63 s63Var, s63 s63Var2) {
            if (Math.abs(s63Var.a(d) - s63Var2.a(d)) <= 0.001d) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] g(float[] fArr, n4c n4cVar) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float a = n4cVar.a();
            float b = n4cVar.b();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = f / f2;
            float f10 = (f3 / f4) - f9;
            float f11 = (a / b) - f9;
            float f12 = ((f7 - f3) / f4) - f8;
            float f13 = (f5 / f6) - f9;
            float f14 = (((((f7 - a) / b) - f8) * f10) - (f11 * f12)) / (((((f7 - f5) / f6) - f8) * f10) - (f12 * f13));
            float f15 = (f11 - (f13 * f14)) / f10;
            float f16 = (1.0f - f15) - f14;
            float f17 = f16 / f2;
            float f18 = f15 / f4;
            float f19 = f14 / f6;
            return new float[]{f17 * f, f16, f17 * ((1.0f - f) - f2), f18 * f3, f15, f18 * ((1.0f - f3) - f4), f19 * f5, f14, f19 * ((1.0f - f5) - f6)};
        }

        private final boolean h(float[] fArr, float[] fArr2) {
            float f = fArr[0] - fArr2[0];
            float f2 = fArr[1] - fArr2[1];
            float[] fArr3 = {f, f2, fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            if (i(f, f2, fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) < 0.0f || i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f || i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < 0.0f || i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f || i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < 0.0f || i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < 0.0f) {
                return false;
            }
            return true;
        }

        private final float i(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float[] fArr, n4c n4cVar, s63 s63Var, s63 s63Var2, float f, float f2, int i) {
            if (i == 0) {
                return true;
            }
            lf1 lf1Var = lf1.a;
            if (!kd1.g(fArr, lf1Var.x()) || !kd1.f(n4cVar, au4.a.e()) || f != 0.0f || f2 != 1.0f) {
                return false;
            }
            om9 w = lf1Var.w();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!f(d, s63Var, w.N()) || !f(d, s63Var2, w.J())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(float[] fArr, float f, float f2) {
            float e = e(fArr);
            lf1 lf1Var = lf1.a;
            if ((e / e(lf1Var.s()) > 0.9f && h(fArr, lf1Var.x())) || (f < 0.0f && f2 > 1.0f)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                xr.j(fArr, fArr2, 0, 0, 6, 6, null);
            } else {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = f + f2 + fArr[2];
                fArr2[0] = f / f3;
                fArr2[1] = f2 / f3;
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = f4 + f5 + fArr[5];
                fArr2[2] = f4 / f6;
                fArr2[3] = f5 / f6;
                float f7 = fArr[6];
                float f8 = fArr[7];
                float f9 = f7 + f8 + fArr[8];
                fArr2[4] = f7 / f9;
                fArr2[5] = f8 / f9;
            }
            return fArr2;
        }
    }

    /* compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: om9$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<Double, Double> {
        b() {
            super(1);
        }

        public final Double a(double d) {
            double j;
            s63 J = om9.this.J();
            j = i.j(d, om9.this.f, om9.this.g);
            return Double.valueOf(J.a(j));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return a(d.doubleValue());
        }
    }

    /* compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: om9$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<Double, Double> {
        c() {
            super(1);
        }

        public final Double a(double d) {
            double j;
            j = i.j(om9.this.N().a(d), om9.this.f, om9.this.g);
            return Double.valueOf(j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return a(d.doubleValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om9(String str, float[] fArr, n4c n4cVar, float[] fArr2, s63 s63Var, s63 s63Var2, float f, float f2, okb okbVar, int i) {
        super(str, ad1.a.b(), i, null);
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(fArr, "primaries");
        z65.h(n4cVar, "whitePoint");
        z65.h(s63Var, "oetf");
        z65.h(s63Var2, "eotf");
        this.e = n4cVar;
        this.f = f;
        this.g = f2;
        this.h = okbVar;
        this.l = s63Var;
        this.m = new c();
        this.n = new s63() { // from class: fm9
            @Override // defpackage.s63
            public final double a(double d) {
                double S;
                S = om9.S(om9.this, d);
                return S;
            }
        };
        this.o = s63Var2;
        this.p = new b();
        this.q = new s63() { // from class: gm9
            @Override // defpackage.s63
            public final double a(double d) {
                double G;
                G = om9.G(om9.this, d);
                return G;
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f < f2) {
            a aVar = t;
            float[] l = aVar.l(fArr);
            this.i = l;
            if (fArr2 == null) {
                this.j = aVar.g(l, n4cVar);
            } else if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            } else {
                this.j = fArr2;
            }
            this.k = kd1.j(this.j);
            this.r = aVar.k(l, f, f2);
            this.s = aVar.j(l, n4cVar, s63Var, s63Var2, f, f2, i);
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double A(okb okbVar, double d) {
        z65.h(okbVar, "$function");
        return kd1.q(d, okbVar.a(), okbVar.b(), okbVar.c(), okbVar.d(), okbVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double B(okb okbVar, double d) {
        z65.h(okbVar, "$function");
        return kd1.r(d, okbVar.a(), okbVar.b(), okbVar.c(), okbVar.d(), okbVar.e(), okbVar.f(), okbVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double C(okb okbVar, double d) {
        z65.h(okbVar, "$function");
        return kd1.s(d, okbVar.a(), okbVar.b(), okbVar.c(), okbVar.d(), okbVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double D(okb okbVar, double d) {
        z65.h(okbVar, "$function");
        return kd1.t(d, okbVar.a(), okbVar.b(), okbVar.c(), okbVar.d(), okbVar.e(), okbVar.f(), okbVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double G(om9 om9Var, double d) {
        double j;
        z65.h(om9Var, "this$0");
        s63 s63Var = om9Var.o;
        j = i.j(d, om9Var.f, om9Var.g);
        return s63Var.a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double S(om9 om9Var, double d) {
        double j;
        z65.h(om9Var, "this$0");
        j = i.j(om9Var.l.a(d), om9Var.f, om9Var.g);
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double z(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    public final Function1<Double, Double> H() {
        return this.p;
    }

    public final s63 I() {
        return this.q;
    }

    public final s63 J() {
        return this.o;
    }

    public final float[] K() {
        return this.k;
    }

    public final Function1<Double, Double> L() {
        return this.m;
    }

    public final s63 M() {
        return this.n;
    }

    public final s63 N() {
        return this.l;
    }

    public final float[] O() {
        return this.i;
    }

    public final okb P() {
        return this.h;
    }

    public final float[] Q() {
        return this.j;
    }

    public final n4c R() {
        return this.e;
    }

    @Override // defpackage.jd1
    public float[] b(float[] fArr) {
        z65.h(fArr, "v");
        kd1.m(this.k, fArr);
        fArr[0] = (float) this.n.a(fArr[0]);
        fArr[1] = (float) this.n.a(fArr[1]);
        fArr[2] = (float) this.n.a(fArr[2]);
        return fArr;
    }

    @Override // defpackage.jd1
    public float e(int i) {
        return this.g;
    }

    @Override // defpackage.jd1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || om9.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        om9 om9Var = (om9) obj;
        if (Float.compare(om9Var.f, this.f) != 0 || Float.compare(om9Var.g, this.g) != 0 || !z65.c(this.e, om9Var.e) || !Arrays.equals(this.i, om9Var.i)) {
            return false;
        }
        okb okbVar = this.h;
        if (okbVar != null) {
            return z65.c(okbVar, om9Var.h);
        }
        if (om9Var.h == null) {
            return true;
        }
        if (!z65.c(this.l, om9Var.l)) {
            return false;
        }
        return z65.c(this.o, om9Var.o);
    }

    @Override // defpackage.jd1
    public float f(int i) {
        return this.f;
    }

    @Override // defpackage.jd1
    public int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = ((((super.hashCode() * 31) + this.e.hashCode()) * 31) + Arrays.hashCode(this.i)) * 31;
        float f = this.f;
        int i = 0;
        if (f == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = (hashCode + floatToIntBits) * 31;
        float f2 = this.g;
        if (f2 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        okb okbVar = this.h;
        if (okbVar != null) {
            i = okbVar.hashCode();
        }
        int i4 = i3 + i;
        if (this.h == null) {
            return (((i4 * 31) + this.l.hashCode()) * 31) + this.o.hashCode();
        }
        return i4;
    }

    @Override // defpackage.jd1
    public boolean i() {
        return this.s;
    }

    @Override // defpackage.jd1
    public long j(float f, float f2, float f3) {
        float a2 = (float) this.q.a(f);
        float a3 = (float) this.q.a(f2);
        float a4 = (float) this.q.a(f3);
        return (Float.floatToIntBits(kd1.n(this.j, a2, a3, a4)) << 32) | (Float.floatToIntBits(kd1.o(this.j, a2, a3, a4)) & 4294967295L);
    }

    @Override // defpackage.jd1
    public float[] l(float[] fArr) {
        z65.h(fArr, "v");
        fArr[0] = (float) this.q.a(fArr[0]);
        fArr[1] = (float) this.q.a(fArr[1]);
        fArr[2] = (float) this.q.a(fArr[2]);
        return kd1.m(this.j, fArr);
    }

    @Override // defpackage.jd1
    public float m(float f, float f2, float f3) {
        return kd1.p(this.j, (float) this.q.a(f), (float) this.q.a(f2), (float) this.q.a(f3));
    }

    @Override // defpackage.jd1
    public long n(float f, float f2, float f3, float f4, jd1 jd1Var) {
        z65.h(jd1Var, "colorSpace");
        return yc1.a((float) this.n.a(kd1.n(this.k, f, f2, f3)), (float) this.n.a(kd1.o(this.k, f, f2, f3)), (float) this.n.a(kd1.p(this.k, f, f2, f3)), f4, jd1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double x(double d) {
        return d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public om9(String str, float[] fArr, n4c n4cVar, final okb okbVar, int i) {
        this(str, fArr, n4cVar, null, (okbVar.e() == 0.0d && okbVar.f() == 0.0d) ? new s63() { // from class: im9
            @Override // defpackage.s63
            public final double a(double d) {
                double A;
                A = om9.A(okb.this, d);
                return A;
            }
        } : new s63() { // from class: jm9
            @Override // defpackage.s63
            public final double a(double d) {
                double B;
                B = om9.B(okb.this, d);
                return B;
            }
        }, (okbVar.e() == 0.0d && okbVar.f() == 0.0d) ? new s63() { // from class: km9
            @Override // defpackage.s63
            public final double a(double d) {
                double C;
                C = om9.C(okb.this, d);
                return C;
            }
        } : new s63() { // from class: lm9
            @Override // defpackage.s63
            public final double a(double d) {
                double D;
                D = om9.D(okb.this, d);
                return D;
            }
        }, 0.0f, 1.0f, okbVar, i);
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(fArr, "primaries");
        z65.h(n4cVar, "whitePoint");
        z65.h(okbVar, "function");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public om9(java.lang.String r24, float[] r25, defpackage.n4c r26, final double r27, float r29, float r30, int r31) {
        /*
            r23 = this;
            r1 = r27
            java.lang.String r0 = "name"
            r15 = r24
            defpackage.z65.h(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r25
            defpackage.z65.h(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r26
            defpackage.z65.h(r14, r0)
            r17 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L24
            s63 r3 = defpackage.om9.u
        L21:
            r18 = r3
            goto L2a
        L24:
            mm9 r3 = new mm9
            r3.<init>()
            goto L21
        L2a:
            if (r0 != 0) goto L31
            s63 r0 = defpackage.om9.u
        L2e:
            r19 = r0
            goto L37
        L31:
            nm9 r0 = new nm9
            r0.<init>()
            goto L2e
        L37:
            okb r20 = new okb
            r0 = r20
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r21 = 0
            r13 = r21
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r27
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r29
            r9 = r30
            r10 = r20
            r11 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om9.<init>(java.lang.String, float[], n4c, double, float, float, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public om9(om9 om9Var, float[] fArr, n4c n4cVar) {
        this(om9Var.h(), om9Var.i, n4cVar, fArr, om9Var.l, om9Var.o, om9Var.f, om9Var.g, om9Var.h, -1);
        z65.h(om9Var, "colorSpace");
        z65.h(fArr, "transform");
        z65.h(n4cVar, "whitePoint");
    }
}
