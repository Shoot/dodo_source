package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: IntSize.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\b\u0087@\u0018\u0000 \u001a2\u00020\u0001:\u0001\rB\u0014\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u0007\u0088\u0001\u0011\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lw55;", "", "", "i", "(J)Ljava/lang/String;", "", Image.TYPE_HIGH, "(J)I", "other", "", DateTokenConverter.CONVERTER_KEY, "(JLjava/lang/Object;)Z", "", "a", "J", "getPackedValue$annotations", "()V", "packedValue", "g", "getWidth$annotations", "width", "f", "getHeight$annotations", "height", c.a, "(J)J", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: w55  reason: default package */
/* loaded from: classes.dex */
public final class w55 {
    public static final a b = new a(null);
    private static final long c = c(0);
    private final long a;

    /* compiled from: IntSize.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lw55$a;", "", "Lw55;", "Zero", "J", "a", "()J", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: w55$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return w55.c;
        }
    }

    private /* synthetic */ w55(long j) {
        this.a = j;
    }

    public static final /* synthetic */ w55 b(long j) {
        return new w55(j);
    }

    public static boolean d(long j, Object obj) {
        if (!(obj instanceof w55) || j != ((w55) obj).j()) {
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

    public static final int f(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int g(long j) {
        return (int) (j >> 32);
    }

    public static int h(long j) {
        return ax1.a(j);
    }

    public static String i(long j) {
        return g(j) + " x " + f(j);
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return h(this.a);
    }

    public final /* synthetic */ long j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }

    public static long c(long j) {
        return j;
    }
}
