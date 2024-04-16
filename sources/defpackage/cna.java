package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Size.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0087@\u0018\u0000 !2\u00020\u0001:\u0001\u000fB\u0014\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001c\u0010\u0016\u0088\u0001\u0013\u0092\u0001\u00020\u000eø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcna;", "", "", "k", "(J)Z", "", "l", "(J)Ljava/lang/String;", "", "j", "(J)I", "other", e.a, "(JLjava/lang/Object;)Z", "", "a", "J", "getPackedValue$annotations", "()V", "packedValue", "", "i", "(J)F", "getWidth$annotations", "width", "g", "getHeight$annotations", "height", Image.TYPE_HIGH, "getMinDimension$annotations", "minDimension", DateTokenConverter.CONVERTER_KEY, "(J)J", "b", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cna  reason: default package */
/* loaded from: classes.dex */
public final class cna {
    public static final a b = new a(null);
    private static final long c = ina.a(0.0f, 0.0f);
    private static final long d = ina.a(Float.NaN, Float.NaN);
    private final long a;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcna$a;", "", "Lcna;", "Zero", "J", "b", "()J", "getZero-NH-jbRc$annotations", "()V", "Unspecified", "a", "getUnspecified-NH-jbRc$annotations", "<init>", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: cna$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return cna.d;
        }

        public final long b() {
            return cna.c;
        }
    }

    private /* synthetic */ cna(long j) {
        this.a = j;
    }

    public static final /* synthetic */ cna c(long j) {
        return new cna(j);
    }

    public static boolean e(long j, Object obj) {
        if (!(obj instanceof cna) || j != ((cna) obj).m()) {
            return false;
        }
        return true;
    }

    public static final boolean f(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float g(long j) {
        if (j != d) {
            gz3 gz3Var = gz3.a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final float h(long j) {
        return Math.min(Math.abs(i(j)), Math.abs(g(j)));
    }

    public static final float i(long j) {
        if (j != d) {
            gz3 gz3Var = gz3.a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static int j(long j) {
        return ax1.a(j);
    }

    public static final boolean k(long j) {
        if (i(j) > 0.0f && g(j) > 0.0f) {
            return false;
        }
        return true;
    }

    public static String l(long j) {
        if (j != b.a()) {
            return "Size(" + ve4.a(i(j), 1) + ", " + ve4.a(g(j), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "Size.Unspecified";
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ long m() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }

    public static long d(long j) {
        return j;
    }
}
