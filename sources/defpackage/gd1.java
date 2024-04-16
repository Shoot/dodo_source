package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ColorScheme.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b^\b\u0007\u0018\u00002\u00020\u0001Bò\u0001\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\u0006\u00101\u001a\u00020\u0004\u0012\u0006\u00104\u001a\u00020\u0004\u0012\u0006\u00107\u001a\u00020\u0004\u0012\u0006\u0010:\u001a\u00020\u0004\u0012\u0006\u0010=\u001a\u00020\u0004\u0012\u0006\u0010@\u001a\u00020\u0004\u0012\u0006\u0010B\u001a\u00020\u0004\u0012\u0006\u0010F\u001a\u00020\u0004\u0012\u0006\u0010I\u001a\u00020\u0004\u0012\u0006\u0010L\u001a\u00020\u0004\u0012\u0006\u0010N\u001a\u00020\u0004\u0012\u0006\u0010Q\u001a\u00020\u0004\u0012\u0006\u0010S\u001a\u00020\u0004\u0012\u0006\u0010U\u001a\u00020\u0004\u0012\u0006\u0010W\u001a\u00020\u0004\u0012\u0006\u0010Y\u001a\u00020\u0004\u0012\u0006\u0010[\u001a\u00020\u0004\u0012\u0006\u0010]\u001a\u00020\u0004\u0012\u0006\u0010_\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R4\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR4\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR4\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR4\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR4\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR4\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR4\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u000bR4\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0007\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR4\u0010+\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0007\u001a\u0004\b)\u0010\t\"\u0004\b*\u0010\u000bR4\u0010.\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b,\u0010\t\"\u0004\b-\u0010\u000bR4\u00101\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b/\u0010\t\"\u0004\b0\u0010\u000bR4\u00104\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0007\u001a\u0004\b2\u0010\t\"\u0004\b3\u0010\u000bR4\u00107\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0007\u001a\u0004\b5\u0010\t\"\u0004\b6\u0010\u000bR4\u0010:\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0007\u001a\u0004\b\u0006\u0010\t\"\u0004\b9\u0010\u000bR4\u0010=\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b;\u0010\u0007\u001a\u0004\b \u0010\t\"\u0004\b<\u0010\u000bR4\u0010@\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0007\u001a\u0004\b>\u0010\t\"\u0004\b?\u0010\u000bR4\u0010B\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0007\u001a\u0004\b8\u0010\t\"\u0004\bA\u0010\u000bR4\u0010F\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bC\u0010\u0007\u001a\u0004\bD\u0010\t\"\u0004\bE\u0010\u000bR4\u0010I\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bG\u0010\u0007\u001a\u0004\b;\u0010\t\"\u0004\bH\u0010\u000bR4\u0010L\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u001a\u0004\bJ\u0010\t\"\u0004\bK\u0010\u000bR4\u0010N\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u001c\u0010\t\"\u0004\bM\u0010\u000bR4\u0010Q\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bO\u0010\u0007\u001a\u0004\b\u0015\u0010\t\"\u0004\bP\u0010\u000bR4\u0010S\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\bR\u0010\u000bR4\u0010U\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0007\u001a\u0004\b$\u0010\t\"\u0004\bT\u0010\u000bR4\u0010W\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b>\u0010\u0007\u001a\u0004\b\u0011\u0010\t\"\u0004\bV\u0010\u000bR4\u0010Y\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bJ\u0010\u0007\u001a\u0004\b(\u0010\t\"\u0004\bX\u0010\u000bR4\u0010[\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bD\u0010\u0007\u001a\u0004\bC\u0010\t\"\u0004\bZ\u0010\u000bR4\u0010]\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0007\u001a\u0004\bG\u0010\t\"\u0004\b\\\u0010\u000bR4\u0010_\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0007\u001a\u0004\bO\u0010\t\"\u0004\b^\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, d2 = {"Lgd1;", "", "", "toString", "Luc1;", "<set-?>", "a", "Ler6;", "t", "()J", "setPrimary-8_81llA$material3_release", "(J)V", "primary", "b", "j", "setOnPrimary-8_81llA$material3_release", "onPrimary", c.a, "u", "setPrimaryContainer-8_81llA$material3_release", "primaryContainer", DateTokenConverter.CONVERTER_KEY, "k", "setOnPrimaryContainer-8_81llA$material3_release", "onPrimaryContainer", e.a, "setInversePrimary-8_81llA$material3_release", "inversePrimary", "f", "w", "setSecondary-8_81llA$material3_release", "secondary", "g", "l", "setOnSecondary-8_81llA$material3_release", "onSecondary", Image.TYPE_HIGH, "x", "setSecondaryContainer-8_81llA$material3_release", "secondaryContainer", "i", Image.TYPE_MEDIUM, "setOnSecondaryContainer-8_81llA$material3_release", "onSecondaryContainer", "B", "setTertiary-8_81llA$material3_release", "tertiary", "p", "setOnTertiary-8_81llA$material3_release", "onTertiary", "C", "setTertiaryContainer-8_81llA$material3_release", "tertiaryContainer", "q", "setOnTertiaryContainer-8_81llA$material3_release", "onTertiaryContainer", "n", "setBackground-8_81llA$material3_release", "background", "o", "setOnBackground-8_81llA$material3_release", "onBackground", "y", "setSurface-8_81llA$material3_release", "surface", "setOnSurface-8_81llA$material3_release", "onSurface", "r", "A", "setSurfaceVariant-8_81llA$material3_release", "surfaceVariant", Image.TYPE_SMALL, "setOnSurfaceVariant-8_81llA$material3_release", "onSurfaceVariant", "z", "setSurfaceTint-8_81llA$material3_release", "surfaceTint", "setInverseSurface-8_81llA$material3_release", "inverseSurface", "v", "setInverseOnSurface-8_81llA$material3_release", "inverseOnSurface", "setError-8_81llA$material3_release", "error", "setOnError-8_81llA$material3_release", "onError", "setErrorContainer-8_81llA$material3_release", "errorContainer", "setOnErrorContainer-8_81llA$material3_release", "onErrorContainer", "setOutline-8_81llA$material3_release", "outline", "setOutlineVariant-8_81llA$material3_release", "outlineVariant", "setScrim-8_81llA$material3_release", "scrim", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gd1  reason: default package */
/* loaded from: classes.dex */
public final class gd1 {
    private final er6 A;
    private final er6 B;
    private final er6 C;
    private final er6 a;
    private final er6 b;
    private final er6 c;
    private final er6 d;
    private final er6 e;
    private final er6 f;
    private final er6 g;
    private final er6 h;
    private final er6 i;
    private final er6 j;
    private final er6 k;
    private final er6 l;
    private final er6 m;
    private final er6 n;
    private final er6 o;
    private final er6 p;
    private final er6 q;
    private final er6 r;
    private final er6 s;
    private final er6 t;
    private final er6 u;
    private final er6 v;
    private final er6 w;
    private final er6 x;
    private final er6 y;
    private final er6 z;

    public /* synthetic */ gd1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29);
    }

    public final long A() {
        return ((uc1) this.r.getValue()).t();
    }

    public final long B() {
        return ((uc1) this.j.getValue()).t();
    }

    public final long C() {
        return ((uc1) this.l.getValue()).t();
    }

    public final long a() {
        return ((uc1) this.n.getValue()).t();
    }

    public final long b() {
        return ((uc1) this.w.getValue()).t();
    }

    public final long c() {
        return ((uc1) this.y.getValue()).t();
    }

    public final long d() {
        return ((uc1) this.v.getValue()).t();
    }

    public final long e() {
        return ((uc1) this.e.getValue()).t();
    }

    public final long f() {
        return ((uc1) this.u.getValue()).t();
    }

    public final long g() {
        return ((uc1) this.o.getValue()).t();
    }

    public final long h() {
        return ((uc1) this.x.getValue()).t();
    }

    public final long i() {
        return ((uc1) this.z.getValue()).t();
    }

    public final long j() {
        return ((uc1) this.b.getValue()).t();
    }

    public final long k() {
        return ((uc1) this.d.getValue()).t();
    }

    public final long l() {
        return ((uc1) this.g.getValue()).t();
    }

    public final long m() {
        return ((uc1) this.i.getValue()).t();
    }

    public final long n() {
        return ((uc1) this.q.getValue()).t();
    }

    public final long o() {
        return ((uc1) this.s.getValue()).t();
    }

    public final long p() {
        return ((uc1) this.k.getValue()).t();
    }

    public final long q() {
        return ((uc1) this.m.getValue()).t();
    }

    public final long r() {
        return ((uc1) this.A.getValue()).t();
    }

    public final long s() {
        return ((uc1) this.B.getValue()).t();
    }

    public final long t() {
        return ((uc1) this.a.getValue()).t();
    }

    public String toString() {
        return "ColorScheme(primary=" + ((Object) uc1.s(t())) + "onPrimary=" + ((Object) uc1.s(j())) + "primaryContainer=" + ((Object) uc1.s(u())) + "onPrimaryContainer=" + ((Object) uc1.s(k())) + "inversePrimary=" + ((Object) uc1.s(e())) + "secondary=" + ((Object) uc1.s(w())) + "onSecondary=" + ((Object) uc1.s(l())) + "secondaryContainer=" + ((Object) uc1.s(x())) + "onSecondaryContainer=" + ((Object) uc1.s(m())) + "tertiary=" + ((Object) uc1.s(B())) + "onTertiary=" + ((Object) uc1.s(p())) + "tertiaryContainer=" + ((Object) uc1.s(C())) + "onTertiaryContainer=" + ((Object) uc1.s(q())) + "background=" + ((Object) uc1.s(a())) + "onBackground=" + ((Object) uc1.s(g())) + "surface=" + ((Object) uc1.s(y())) + "onSurface=" + ((Object) uc1.s(n())) + "surfaceVariant=" + ((Object) uc1.s(A())) + "onSurfaceVariant=" + ((Object) uc1.s(o())) + "surfaceTint=" + ((Object) uc1.s(z())) + "inverseSurface=" + ((Object) uc1.s(f())) + "inverseOnSurface=" + ((Object) uc1.s(d())) + "error=" + ((Object) uc1.s(b())) + "onError=" + ((Object) uc1.s(h())) + "errorContainer=" + ((Object) uc1.s(c())) + "onErrorContainer=" + ((Object) uc1.s(i())) + "outline=" + ((Object) uc1.s(r())) + "outlineVariant=" + ((Object) uc1.s(s())) + "scrim=" + ((Object) uc1.s(v())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final long u() {
        return ((uc1) this.c.getValue()).t();
    }

    public final long v() {
        return ((uc1) this.C.getValue()).t();
    }

    public final long w() {
        return ((uc1) this.f.getValue()).t();
    }

    public final long x() {
        return ((uc1) this.h.getValue()).t();
    }

    public final long y() {
        return ((uc1) this.p.getValue()).t();
    }

    public final long z() {
        return ((uc1) this.t.getValue()).t();
    }

    private gd1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        this.a = qpa.d(uc1.f(j), qpa.h());
        this.b = qpa.d(uc1.f(j2), qpa.h());
        this.c = qpa.d(uc1.f(j3), qpa.h());
        this.d = qpa.d(uc1.f(j4), qpa.h());
        this.e = qpa.d(uc1.f(j5), qpa.h());
        this.f = qpa.d(uc1.f(j6), qpa.h());
        this.g = qpa.d(uc1.f(j7), qpa.h());
        this.h = qpa.d(uc1.f(j8), qpa.h());
        this.i = qpa.d(uc1.f(j9), qpa.h());
        this.j = qpa.d(uc1.f(j10), qpa.h());
        this.k = qpa.d(uc1.f(j11), qpa.h());
        this.l = qpa.d(uc1.f(j12), qpa.h());
        this.m = qpa.d(uc1.f(j13), qpa.h());
        this.n = qpa.d(uc1.f(j14), qpa.h());
        this.o = qpa.d(uc1.f(j15), qpa.h());
        this.p = qpa.d(uc1.f(j16), qpa.h());
        this.q = qpa.d(uc1.f(j17), qpa.h());
        this.r = qpa.d(uc1.f(j18), qpa.h());
        this.s = qpa.d(uc1.f(j19), qpa.h());
        this.t = qpa.d(uc1.f(j20), qpa.h());
        this.u = qpa.d(uc1.f(j21), qpa.h());
        this.v = qpa.d(uc1.f(j22), qpa.h());
        this.w = qpa.d(uc1.f(j23), qpa.h());
        this.x = qpa.d(uc1.f(j24), qpa.h());
        this.y = qpa.d(uc1.f(j25), qpa.h());
        this.z = qpa.d(uc1.f(j26), qpa.h());
        this.A = qpa.d(uc1.f(j27), qpa.h());
        this.B = qpa.d(uc1.f(j28), qpa.h());
        this.C = qpa.d(uc1.f(j29), qpa.h());
    }
}
