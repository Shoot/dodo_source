package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Offset.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\b\u0087@\u0018\u0000 %2\u00020\u0001:\u0001\u001aB\u0014\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0019ø\u0001\u0002¢\u0006\u0004\b$\u0010\fJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010#\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0004\u0088\u0001\u001c\u0092\u0001\u00020\u0019ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Ls67;", "", "", e.a, "(J)F", "f", "", "o", "(J)Z", "j", "k", Image.TYPE_SMALL, "(J)J", "other", "p", "(JJ)J", "q", "", "r", "(J)Ljava/lang/String;", "", "n", "(J)I", Image.TYPE_HIGH, "(JLjava/lang/Object;)Z", "", "a", "J", "packedValue", "l", "getX$annotations", "()V", "x", Image.TYPE_MEDIUM, "getY$annotations", "y", "g", "b", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: s67  reason: default package */
/* loaded from: classes.dex */
public final class s67 {
    public static final a b = new a(null);
    private static final long c = x67.a(0.0f, 0.0f);
    private static final long d = x67.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final long e = x67.a(Float.NaN, Float.NaN);
    private final long a;

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R)\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Ls67$a;", "", "Ls67;", "Zero", "J", c.a, "()J", "getZero-F1C5BW0$annotations", "()V", "Infinite", "a", "getInfinite-F1C5BW0$annotations", "Unspecified", "b", "getUnspecified-F1C5BW0$annotations", "<init>", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: s67$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return s67.d;
        }

        public final long b() {
            return s67.e;
        }

        public final long c() {
            return s67.c;
        }
    }

    private /* synthetic */ s67(long j) {
        this.a = j;
    }

    public static final /* synthetic */ s67 d(long j) {
        return new s67(j);
    }

    public static final float e(long j) {
        return l(j);
    }

    public static final float f(long j) {
        return m(j);
    }

    public static boolean h(long j, Object obj) {
        if (!(obj instanceof s67) || j != ((s67) obj).t()) {
            return false;
        }
        return true;
    }

    public static final boolean i(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float j(long j) {
        return (float) Math.sqrt((l(j) * l(j)) + (m(j) * m(j)));
    }

    public static final float k(long j) {
        return (l(j) * l(j)) + (m(j) * m(j));
    }

    public static final float l(long j) {
        if (j != e) {
            gz3 gz3Var = gz3.a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final float m(long j) {
        if (j != e) {
            gz3 gz3Var = gz3.a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static int n(long j) {
        return ax1.a(j);
    }

    public static final boolean o(long j) {
        if (!Float.isNaN(l(j)) && !Float.isNaN(m(j))) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    public static final long p(long j, long j2) {
        return x67.a(l(j) - l(j2), m(j) - m(j2));
    }

    public static final long q(long j, long j2) {
        return x67.a(l(j) + l(j2), m(j) + m(j2));
    }

    public static String r(long j) {
        if (x67.c(j)) {
            return "Offset(" + ve4.a(l(j), 1) + ", " + ve4.a(m(j), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "Offset.Unspecified";
    }

    public static final long s(long j) {
        return x67.a(-l(j), -m(j));
    }

    public boolean equals(Object obj) {
        return h(this.a, obj);
    }

    public int hashCode() {
        return n(this.a);
    }

    public final /* synthetic */ long t() {
        return this.a;
    }

    public String toString() {
        return r(this.a);
    }

    public static long g(long j) {
        return j;
    }
}
