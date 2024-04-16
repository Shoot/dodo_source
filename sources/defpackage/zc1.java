package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: ColorLightTokens.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\bA\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R \u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b \u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b\"\u0010\u0006R \u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0004\u001a\u0004\b&\u0010\u0006R \u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010\u0004\u001a\u0004\b(\u0010\u0006R \u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010/\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\b,\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b.\u0010\u0006R \u00103\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00105\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\u0004\u001a\u0004\b2\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b4\u0010\u0006R \u0010:\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R \u0010<\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b6\u0010\u0006R \u0010>\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b8\u0010\u0006R \u0010@\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b;\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Lzc1;", "", "Luc1;", "b", "J", "a", "()J", "Background", c.a, "Error", DateTokenConverter.CONVERTER_KEY, "ErrorContainer", e.a, "InverseOnSurface", "f", "InversePrimary", "g", "InverseSurface", Image.TYPE_HIGH, "OnBackground", "i", "OnError", "j", "OnErrorContainer", "k", "OnPrimary", "l", "OnPrimaryContainer", Image.TYPE_MEDIUM, "OnSecondary", "n", "OnSecondaryContainer", "o", "OnSurface", "p", "OnSurfaceVariant", "q", "OnTertiary", "r", "OnTertiaryContainer", Image.TYPE_SMALL, "Outline", "t", "OutlineVariant", "u", "Primary", "v", "PrimaryContainer", "w", "Scrim", "x", "Secondary", "y", "SecondaryContainer", "z", "Surface", "A", "getSurfaceTint-0d7_KjU", "SurfaceTint", "B", "SurfaceVariant", "C", "Tertiary", "D", "TertiaryContainer", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zc1  reason: default package */
/* loaded from: classes.dex */
public final class zc1 {
    private static final long A;
    private static final long B;
    private static final long C;
    private static final long D;
    public static final zc1 a = new zc1();
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    private static final long f;
    private static final long g;
    private static final long h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final long v;
    private static final long w;
    private static final long x;
    private static final long y;
    private static final long z;

    static {
        yp7 yp7Var = yp7.a;
        b = yp7Var.i();
        c = yp7Var.c();
        d = yp7Var.d();
        e = yp7Var.h();
        f = yp7Var.q();
        g = yp7Var.g();
        h = yp7Var.f();
        i = yp7Var.b();
        j = yp7Var.a();
        k = yp7Var.o();
        l = yp7Var.n();
        m = yp7Var.t();
        n = yp7Var.s();
        o = yp7Var.f();
        p = yp7Var.j();
        q = yp7Var.x();
        r = yp7Var.w();
        s = yp7Var.k();
        t = yp7Var.l();
        long p2 = yp7Var.p();
        u = p2;
        v = yp7Var.r();
        w = yp7Var.e();
        x = yp7Var.u();
        y = yp7Var.v();
        z = yp7Var.i();
        A = p2;
        B = yp7Var.m();
        C = yp7Var.y();
        D = yp7Var.z();
    }

    private zc1() {
    }

    public final long A() {
        return C;
    }

    public final long B() {
        return D;
    }

    public final long a() {
        return b;
    }

    public final long b() {
        return c;
    }

    public final long c() {
        return d;
    }

    public final long d() {
        return e;
    }

    public final long e() {
        return f;
    }

    public final long f() {
        return g;
    }

    public final long g() {
        return h;
    }

    public final long h() {
        return i;
    }

    public final long i() {
        return j;
    }

    public final long j() {
        return k;
    }

    public final long k() {
        return l;
    }

    public final long l() {
        return m;
    }

    public final long m() {
        return n;
    }

    public final long n() {
        return o;
    }

    public final long o() {
        return p;
    }

    public final long p() {
        return q;
    }

    public final long q() {
        return r;
    }

    public final long r() {
        return s;
    }

    public final long s() {
        return t;
    }

    public final long t() {
        return u;
    }

    public final long u() {
        return v;
    }

    public final long v() {
        return w;
    }

    public final long w() {
        return x;
    }

    public final long x() {
        return y;
    }

    public final long y() {
        return z;
    }

    public final long z() {
        return B;
    }
}
