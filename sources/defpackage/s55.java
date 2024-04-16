package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: IntOffset.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\b\u0087@\u0018\u0000 \u001c2\u00020\u0001:\u0001\u000fB\u0014\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0004J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0004\u0088\u0001\u0013\u0092\u0001\u00020\u000eø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Ls55;", "", "", c.a, "(J)I", DateTokenConverter.CONVERTER_KEY, "", "k", "(J)Ljava/lang/String;", "j", "other", "", "f", "(JLjava/lang/Object;)Z", "", "a", "J", "getPackedValue$annotations", "()V", "packedValue", Image.TYPE_HIGH, "getX$annotations", "x", "i", "getY$annotations", "y", e.a, "(J)J", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: s55  reason: default package */
/* loaded from: classes.dex */
public final class s55 {
    public static final a b = new a(null);
    private static final long c = t55.a(0, 0);
    private final long a;

    /* compiled from: IntOffset.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Ls55$a;", "", "Ls55;", "Zero", "J", "a", "()J", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: s55$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return s55.c;
        }
    }

    private /* synthetic */ s55(long j) {
        this.a = j;
    }

    public static final /* synthetic */ s55 b(long j) {
        return new s55(j);
    }

    public static final int c(long j) {
        return h(j);
    }

    public static final int d(long j) {
        return i(j);
    }

    public static boolean f(long j, Object obj) {
        if (!(obj instanceof s55) || j != ((s55) obj).l()) {
            return false;
        }
        return true;
    }

    public static final boolean g(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final int h(long j) {
        return (int) (j >> 32);
    }

    public static final int i(long j) {
        return (int) (j & 4294967295L);
    }

    public static int j(long j) {
        return ax1.a(j);
    }

    public static String k(long j) {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + h(j) + ", " + i(j) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ long l() {
        return this.a;
    }

    public String toString() {
        return k(this.a);
    }

    public static long e(long j) {
        return j;
    }
}
