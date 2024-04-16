package androidx.compose.ui.graphics;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TransformOrigin.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\n\u0088\u0001\u000f\u0092\u0001\u00020\u000eø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/f;", "", "", "g", "(J)Ljava/lang/String;", "", "f", "(J)I", "", DateTokenConverter.CONVERTER_KEY, "(J)F", "pivotFractionX", com.huawei.hms.push.e.a, "pivotFractionY", "", "packedValue", "b", "(J)J", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class f {
    public static final a a = new a(null);
    private static final long b = rkb.a(0.5f, 0.5f);

    /* compiled from: TransformOrigin.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/f$a;", "", "Landroidx/compose/ui/graphics/f;", "Center", "J", "a", "()J", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return f.b;
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
        return "TransformOrigin(packedValue=" + j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public static long b(long j) {
        return j;
    }
}
