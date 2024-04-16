package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Color.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087@\u0018\u0000 ,2\u00020\u0001:\u0001\u0018B\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0017ø\u0001\u0002¢\u0006\u0004\b*\u0010+J\u001e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J@\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001c\u001a\u00020\u00178\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\n\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010 \u001a\u0004\b&\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010 \u001a\u0004\b(\u0010\"\u0088\u0001\u001c\u0092\u0001\u00020\u0017ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Luc1;", "", "Ljd1;", "colorSpace", Image.TYPE_HIGH, "(JLjd1;)J", "", "alpha", "red", "green", "blue", "i", "(JFFFF)J", "", Image.TYPE_SMALL, "(J)Ljava/lang/String;", "", "r", "(J)I", "other", "", "k", "(JLjava/lang/Object;)Z", "Lopb;", "a", "J", "getValue-s-VKNKU", "()J", "value", "o", "(J)Ljd1;", "getColorSpace$annotations", "()V", "q", "(J)F", "getRed$annotations", "p", "getGreen$annotations", "n", "getBlue$annotations", Image.TYPE_MEDIUM, "getAlpha$annotations", "g", "(J)J", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: uc1  reason: default package */
/* loaded from: classes.dex */
public final class uc1 {
    public static final a b = new a(null);
    private static final long c = yc1.d(4278190080L);
    private static final long d = yc1.d(4282664004L);
    private static final long e = yc1.d(4287137928L);
    private static final long f = yc1.d(4291611852L);
    private static final long g = yc1.d(4294967295L);
    private static final long h = yc1.d(4294901760L);
    private static final long i = yc1.d(4278255360L);
    private static final long j = yc1.d(4278190335L);
    private static final long k = yc1.d(4294967040L);
    private static final long l = yc1.d(4278255615L);
    private static final long m = yc1.d(4294902015L);
    private static final long n = yc1.b(0);
    private static final long o = yc1.a(0.0f, 0.0f, 0.0f, 0.0f, lf1.a.y());
    private final long a;

    /* compiled from: Color.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R)\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R)\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R)\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Luc1$a;", "", "Luc1;", "Black", "J", "a", "()J", "getBlack-0d7_KjU$annotations", "()V", "Red", c.a, "getRed-0d7_KjU$annotations", "Blue", "b", "getBlue-0d7_KjU$annotations", "Transparent", DateTokenConverter.CONVERTER_KEY, "getTransparent-0d7_KjU$annotations", "Unspecified", e.a, "getUnspecified-0d7_KjU$annotations", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: uc1$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return uc1.c;
        }

        public final long b() {
            return uc1.j;
        }

        public final long c() {
            return uc1.h;
        }

        public final long d() {
            return uc1.n;
        }

        public final long e() {
            return uc1.o;
        }
    }

    private /* synthetic */ uc1(long j2) {
        this.a = j2;
    }

    public static final /* synthetic */ uc1 f(long j2) {
        return new uc1(j2);
    }

    public static final long h(long j2, jd1 jd1Var) {
        z65.h(jd1Var, "colorSpace");
        jd1 o2 = o(j2);
        if (z65.c(jd1Var, o2)) {
            return j2;
        }
        return kd1.i(o2, jd1Var, 0, 2, null).e(q(j2), p(j2), n(j2), m(j2));
    }

    public static final long i(long j2, float f2, float f3, float f4, float f5) {
        return yc1.a(f3, f4, f5, f2, o(j2));
    }

    public static /* synthetic */ long j(long j2, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = m(j2);
        }
        float f6 = f2;
        if ((i2 & 2) != 0) {
            f3 = q(j2);
        }
        float f7 = f3;
        if ((i2 & 4) != 0) {
            f4 = p(j2);
        }
        float f8 = f4;
        if ((i2 & 8) != 0) {
            f5 = n(j2);
        }
        return i(j2, f6, f7, f8, f5);
    }

    public static boolean k(long j2, Object obj) {
        if (!(obj instanceof uc1) || j2 != ((uc1) obj).t()) {
            return false;
        }
        return true;
    }

    public static final boolean l(long j2, long j3) {
        return opb.i(j2, j3);
    }

    public static final float m(long j2) {
        float b2;
        float f2;
        if (opb.g(63 & j2) == 0) {
            b2 = (float) krb.b(opb.g(opb.g(j2 >>> 56) & 255));
            f2 = 255.0f;
        } else {
            b2 = (float) krb.b(opb.g(opb.g(j2 >>> 6) & 1023));
            f2 = 1023.0f;
        }
        return b2 / f2;
    }

    public static final float n(long j2) {
        if (opb.g(63 & j2) == 0) {
            return ((float) krb.b(opb.g(opb.g(j2 >>> 32) & 255))) / 255.0f;
        }
        return fz3.h(fz3.g((short) opb.g(opb.g(j2 >>> 16) & 65535)));
    }

    public static final jd1 o(long j2) {
        lf1 lf1Var = lf1.a;
        return lf1Var.l()[(int) opb.g(j2 & 63)];
    }

    public static final float p(long j2) {
        if (opb.g(63 & j2) == 0) {
            return ((float) krb.b(opb.g(opb.g(j2 >>> 40) & 255))) / 255.0f;
        }
        return fz3.h(fz3.g((short) opb.g(opb.g(j2 >>> 32) & 65535)));
    }

    public static final float q(long j2) {
        if (opb.g(63 & j2) == 0) {
            return ((float) krb.b(opb.g(opb.g(j2 >>> 48) & 255))) / 255.0f;
        }
        return fz3.h(fz3.g((short) opb.g(opb.g(j2 >>> 48) & 65535)));
    }

    public static int r(long j2) {
        return opb.k(j2);
    }

    public static String s(long j2) {
        return "Color(" + q(j2) + ", " + p(j2) + ", " + n(j2) + ", " + m(j2) + ", " + o(j2).h() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return k(this.a, obj);
    }

    public int hashCode() {
        return r(this.a);
    }

    public final /* synthetic */ long t() {
        return this.a;
    }

    public String toString() {
        return s(this.a);
    }

    public static long g(long j2) {
        return j2;
    }
}
