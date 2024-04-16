package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ycb;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextUnit.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u001d2\u00020\u0001:\u0001\rB\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00158Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0088\u0001\u000f\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lwcb;", "", "", "j", "(J)Ljava/lang/String;", "", "i", "(J)I", "other", "", DateTokenConverter.CONVERTER_KEY, "(JLjava/lang/Object;)Z", "", "a", "J", "packedValue", "f", "(J)J", "getRawType$annotations", "()V", "rawType", "Lycb;", "g", MessageAttributes.TYPE, "", Image.TYPE_HIGH, "(J)F", "value", c.a, "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wcb  reason: default package */
/* loaded from: classes.dex */
public final class wcb {
    public static final a b = new a(null);
    private static final ycb[] c;
    private static final long d;
    private final long a;

    /* compiled from: TextUnit.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lwcb$a;", "", "Lwcb;", "Unspecified", "J", "a", "()J", "getUnspecified-XSAIIZE$annotations", "()V", "<init>", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: wcb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return wcb.d;
        }
    }

    static {
        ycb.a aVar = ycb.b;
        c = new ycb[]{ycb.d(aVar.c()), ycb.d(aVar.b()), ycb.d(aVar.a())};
        d = xcb.g(0L, Float.NaN);
    }

    private /* synthetic */ wcb(long j) {
        this.a = j;
    }

    public static final /* synthetic */ wcb b(long j) {
        return new wcb(j);
    }

    public static boolean d(long j, Object obj) {
        if (!(obj instanceof wcb) || j != ((wcb) obj).k()) {
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

    public static final long f(long j) {
        return j & 1095216660480L;
    }

    public static final long g(long j) {
        return c[(int) (f(j) >>> 32)].j();
    }

    public static final float h(long j) {
        gz3 gz3Var = gz3.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int i(long j) {
        return ax1.a(j);
    }

    public static String j(long j) {
        long g = g(j);
        ycb.a aVar = ycb.b;
        if (ycb.g(g, aVar.c())) {
            return "Unspecified";
        }
        if (ycb.g(g, aVar.b())) {
            return h(j) + ".sp";
        } else if (ycb.g(g, aVar.a())) {
            return h(j) + ".em";
        } else {
            return "Invalid";
        }
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return i(this.a);
    }

    public final /* synthetic */ long k() {
        return this.a;
    }

    public String toString() {
        return j(this.a);
    }

    public static long c(long j) {
        return j;
    }
}
