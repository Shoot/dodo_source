package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BlendMode.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0003\u0088\u0001\r\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lpc0;", "", "", "I", "(I)Ljava/lang/String;", "", "H", "(I)I", "other", "", "F", "(ILjava/lang/Object;)Z", "a", "value", "E", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: pc0  reason: default package */
/* loaded from: classes.dex */
public final class pc0 {
    private final int a;
    public static final a b = new a(null);
    private static final int c = E(0);
    private static final int d = E(1);
    private static final int e = E(2);
    private static final int f = E(3);
    private static final int g = E(4);
    private static final int h = E(5);
    private static final int i = E(6);
    private static final int j = E(7);
    private static final int k = E(8);
    private static final int l = E(9);
    private static final int m = E(10);
    private static final int n = E(11);
    private static final int o = E(12);
    private static final int p = E(13);
    private static final int q = E(14);
    private static final int r = E(15);
    private static final int s = E(16);
    private static final int t = E(17);
    private static final int u = E(18);
    private static final int v = E(19);
    private static final int w = E(20);
    private static final int x = E(21);
    private static final int y = E(22);
    private static final int z = E(23);
    private static final int A = E(24);
    private static final int B = E(25);
    private static final int C = E(26);
    private static final int D = E(27);
    private static final int E = E(28);

    /* compiled from: BlendMode.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b?\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b?\u0010@R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R \u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R \u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R \u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R \u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R \u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R \u0010/\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R \u00103\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R \u00105\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R \u00109\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R \u0010;\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Lpc0$a;", "", "Lpc0;", "Clear", "I", "a", "()I", "Src", "x", "Dst", "g", "SrcOver", "B", "DstOver", "k", "SrcIn", "z", "DstIn", "i", "SrcOut", "A", "DstOut", "j", "SrcAtop", "y", "DstAtop", Image.TYPE_HIGH, "Xor", "C", "Plus", "t", "Modulate", "q", "Screen", "v", "Overlay", Image.TYPE_SMALL, "Darken", e.a, "Lighten", "o", "ColorDodge", DateTokenConverter.CONVERTER_KEY, "ColorBurn", c.a, "Hardlight", Image.TYPE_MEDIUM, "Softlight", "w", "Difference", "f", "Exclusion", "l", "Multiply", "r", "Hue", "n", "Saturation", "u", "Color", "b", "Luminosity", "p", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: pc0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int A() {
            return pc0.j;
        }

        public final int B() {
            return pc0.f;
        }

        public final int C() {
            return pc0.n;
        }

        public final int a() {
            return pc0.c;
        }

        public final int b() {
            return pc0.D;
        }

        public final int c() {
            return pc0.v;
        }

        public final int d() {
            return pc0.u;
        }

        public final int e() {
            return pc0.s;
        }

        public final int f() {
            return pc0.y;
        }

        public final int g() {
            return pc0.e;
        }

        public final int h() {
            return pc0.m;
        }

        public final int i() {
            return pc0.i;
        }

        public final int j() {
            return pc0.k;
        }

        public final int k() {
            return pc0.g;
        }

        public final int l() {
            return pc0.z;
        }

        public final int m() {
            return pc0.w;
        }

        public final int n() {
            return pc0.B;
        }

        public final int o() {
            return pc0.t;
        }

        public final int p() {
            return pc0.E;
        }

        public final int q() {
            return pc0.p;
        }

        public final int r() {
            return pc0.A;
        }

        public final int s() {
            return pc0.r;
        }

        public final int t() {
            return pc0.o;
        }

        public final int u() {
            return pc0.C;
        }

        public final int v() {
            return pc0.q;
        }

        public final int w() {
            return pc0.x;
        }

        public final int x() {
            return pc0.d;
        }

        public final int y() {
            return pc0.l;
        }

        public final int z() {
            return pc0.h;
        }
    }

    private /* synthetic */ pc0(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ pc0 D(int i2) {
        return new pc0(i2);
    }

    public static boolean F(int i2, Object obj) {
        if (!(obj instanceof pc0) || i2 != ((pc0) obj).J()) {
            return false;
        }
        return true;
    }

    public static final boolean G(int i2, int i3) {
        if (i2 == i3) {
            return true;
        }
        return false;
    }

    public static String I(int i2) {
        if (G(i2, c)) {
            return "Clear";
        }
        if (G(i2, d)) {
            return "Src";
        }
        if (G(i2, e)) {
            return "Dst";
        }
        if (G(i2, f)) {
            return "SrcOver";
        }
        if (G(i2, g)) {
            return "DstOver";
        }
        if (G(i2, h)) {
            return "SrcIn";
        }
        if (G(i2, i)) {
            return "DstIn";
        }
        if (G(i2, j)) {
            return "SrcOut";
        }
        if (G(i2, k)) {
            return "DstOut";
        }
        if (G(i2, l)) {
            return "SrcAtop";
        }
        if (G(i2, m)) {
            return "DstAtop";
        }
        if (G(i2, n)) {
            return "Xor";
        }
        if (G(i2, o)) {
            return "Plus";
        }
        if (G(i2, p)) {
            return "Modulate";
        }
        if (G(i2, q)) {
            return "Screen";
        }
        if (G(i2, r)) {
            return "Overlay";
        }
        if (G(i2, s)) {
            return "Darken";
        }
        if (G(i2, t)) {
            return "Lighten";
        }
        if (G(i2, u)) {
            return "ColorDodge";
        }
        if (G(i2, v)) {
            return "ColorBurn";
        }
        if (G(i2, w)) {
            return "HardLight";
        }
        if (G(i2, x)) {
            return "Softlight";
        }
        if (G(i2, y)) {
            return "Difference";
        }
        if (G(i2, z)) {
            return "Exclusion";
        }
        if (G(i2, A)) {
            return "Multiply";
        }
        if (G(i2, B)) {
            return "Hue";
        }
        if (G(i2, C)) {
            return "Saturation";
        }
        if (G(i2, D)) {
            return "Color";
        }
        if (G(i2, E)) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public final /* synthetic */ int J() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return F(this.a, obj);
    }

    public int hashCode() {
        return H(this.a);
    }

    public String toString() {
        return I(this.a);
    }

    public static int E(int i2) {
        return i2;
    }

    public static int H(int i2) {
        return i2;
    }
}
