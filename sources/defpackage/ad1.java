package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ColorModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0014\b\u0000\u0012\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0007\u0088\u0001\r\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lad1;", "", "", Image.TYPE_HIGH, "(J)Ljava/lang/String;", "", "g", "(J)I", "f", "getComponentCount$annotations", "()V", "componentCount", "", "packedValue", DateTokenConverter.CONVERTER_KEY, "(J)J", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ad1  reason: default package */
/* loaded from: classes.dex */
public final class ad1 {
    public static final a a = new a(null);
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;

    /* compiled from: ColorModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lad1$a;", "", "Lad1;", "Rgb", "J", "b", "()J", "Xyz", c.a, "Lab", "a", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ad1$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return ad1.d;
        }

        public final long b() {
            return ad1.b;
        }

        public final long c() {
            return ad1.c;
        }
    }

    static {
        long j = 3;
        long j2 = j << 32;
        b = d((0 & 4294967295L) | j2);
        c = d((1 & 4294967295L) | j2);
        d = d(j2 | (2 & 4294967295L));
        e = d((j & 4294967295L) | (4 << 32));
    }

    public static final boolean e(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final int f(long j) {
        return (int) (j >> 32);
    }

    public static int g(long j) {
        return ax1.a(j);
    }

    public static String h(long j) {
        if (e(j, b)) {
            return "Rgb";
        }
        if (e(j, c)) {
            return "Xyz";
        }
        if (e(j, d)) {
            return "Lab";
        }
        if (e(j, e)) {
            return "Cmyk";
        }
        return "Unknown";
    }

    public static long d(long j) {
        return j;
    }
}
