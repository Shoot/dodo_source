package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextRange.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\b\u0087@\u0018\u0000 \u001d2\u00020\u0001:\u0001\rB\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u000f\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Ljcb;", "", "", "l", "(J)Ljava/lang/String;", "", "k", "(J)I", "other", "", DateTokenConverter.CONVERTER_KEY, "(JLjava/lang/Object;)Z", "", "a", "J", "packedValue", "j", "start", "g", "end", "i", "min", Image.TYPE_HIGH, "max", "f", "(J)Z", "collapsed", c.a, "(J)J", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jcb  reason: default package */
/* loaded from: classes.dex */
public final class jcb {
    public static final a b = new a(null);
    private static final long c = kcb.a(0);
    private final long a;

    /* compiled from: TextRange.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Ljcb$a;", "", "Ljcb;", "Zero", "J", "a", "()J", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: jcb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return jcb.c;
        }
    }

    private /* synthetic */ jcb(long j) {
        this.a = j;
    }

    public static final /* synthetic */ jcb b(long j) {
        return new jcb(j);
    }

    public static boolean d(long j, Object obj) {
        if (!(obj instanceof jcb) || j != ((jcb) obj).m()) {
            return false;
        }
        return true;
    }

    public static final boolean e(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final boolean f(long j) {
        if (j(j) == g(j)) {
            return true;
        }
        return false;
    }

    public static final int g(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int h(long j) {
        if (j(j) > g(j)) {
            return j(j);
        }
        return g(j);
    }

    public static final int i(long j) {
        if (j(j) > g(j)) {
            return g(j);
        }
        return j(j);
    }

    public static final int j(long j) {
        return (int) (j >> 32);
    }

    public static int k(long j) {
        return ax1.a(j);
    }

    public static String l(long j) {
        return "TextRange(" + j(j) + ", " + g(j) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return k(this.a);
    }

    public final /* synthetic */ long m() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }

    public static long c(long j) {
        return j;
    }
}
