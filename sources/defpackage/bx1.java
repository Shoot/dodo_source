package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CornerRadius.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0014\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\n\u0088\u0001\u0012\u0092\u0001\u00020\u0011ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lbx1;", "", "", "g", "(J)Ljava/lang/String;", "", "f", "(J)I", "", DateTokenConverter.CONVERTER_KEY, "(J)F", "getX$annotations", "()V", "x", e.a, "getY$annotations", "y", "", "packedValue", "b", "(J)J", "a", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bx1  reason: default package */
/* loaded from: classes.dex */
public final class bx1 {
    public static final a a = new a(null);
    private static final long b = cx1.b(0.0f, 0.0f, 2, null);

    /* compiled from: CornerRadius.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lbx1$a;", "", "Lbx1;", "Zero", "J", "a", "()J", "getZero-kKHJgLs$annotations", "()V", "<init>", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: bx1$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return bx1.b;
        }
    }

    public static final boolean c(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float d(long j) {
        gz3 gz3Var = gz3.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float e(long j) {
        gz3 gz3Var = gz3.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int f(long j) {
        return ax1.a(j);
    }

    public static String g(long j) {
        if (d(j) == e(j)) {
            return "CornerRadius.circular(" + ve4.a(d(j), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "CornerRadius.elliptical(" + ve4.a(d(j), 1) + ", " + ve4.a(e(j), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public static long b(long j) {
        return j;
    }
}
