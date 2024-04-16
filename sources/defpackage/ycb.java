package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextUnit.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\rB\u0012\u0012\u0006\u0010\u000f\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lycb;", "", "", "i", "(J)Ljava/lang/String;", "", Image.TYPE_HIGH, "(J)I", "other", "", "f", "(JLjava/lang/Object;)Z", "", "a", "J", MessageAttributes.TYPE, e.a, "(J)J", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ycb  reason: default package */
/* loaded from: classes.dex */
public final class ycb {
    public static final a b = new a(null);
    private static final long c = e(0);
    private static final long d = e(4294967296L);
    private static final long e = e(8589934592L);
    private final long a;

    /* compiled from: TextUnit.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lycb$a;", "", "Lycb;", "Unspecified", "J", c.a, "()J", "Sp", "b", "Em", "a", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ycb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return ycb.e;
        }

        public final long b() {
            return ycb.d;
        }

        public final long c() {
            return ycb.c;
        }
    }

    private /* synthetic */ ycb(long j) {
        this.a = j;
    }

    public static final /* synthetic */ ycb d(long j) {
        return new ycb(j);
    }

    public static boolean f(long j, Object obj) {
        if (!(obj instanceof ycb) || j != ((ycb) obj).j()) {
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

    public static int h(long j) {
        return ax1.a(j);
    }

    public static String i(long j) {
        if (g(j, c)) {
            return "Unspecified";
        }
        if (g(j, d)) {
            return "Sp";
        }
        if (g(j, e)) {
            return "Em";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
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

    public static long e(long j) {
        return j;
    }
}
