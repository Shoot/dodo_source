package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Liw7;", "", "", "a", "I", "getType", "()I", MessageAttributes.TYPE, "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: iw7  reason: default package */
/* loaded from: classes2.dex */
public final class iw7 {
    public static final a b;
    public static final iw7 c = new iw7("CASH", 0, 1);
    public static final iw7 d = new iw7("CARD", 1, 3);
    public static final iw7 e = new iw7("DODORUBLES", 2, 2);
    public static final iw7 f = new iw7("GOOGLE_PAY", 3, 3);
    public static final iw7 g = new iw7("TERMINAL", 4, 4);
    public static final iw7 h = new iw7("SBER_PAY", 5, 3);
    public static final iw7 i = new iw7("APP2APP", 6, 3);
    public static final iw7 j = new iw7("SBP", 7, 3);
    public static final iw7 k = new iw7("NOTHING", 8, 0);
    private static final /* synthetic */ iw7[] l;
    private static final /* synthetic */ kj3 m;
    private final int a;

    /* compiled from: PaymentType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Liw7$a;", "", "", MessageAttributes.TYPE, "Liw7;", "a", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iw7$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final iw7 a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return iw7.c;
                        }
                        return iw7.g;
                    }
                    return iw7.d;
                }
                return iw7.e;
            }
            return iw7.c;
        }
    }

    static {
        iw7[] a2 = a();
        l = a2;
        m = lj3.a(a2);
        b = new a(null);
    }

    private iw7(String str, int i2, int i3) {
        this.a = i3;
    }

    private static final /* synthetic */ iw7[] a() {
        return new iw7[]{c, d, e, f, g, h, i, j, k};
    }

    public static iw7 valueOf(String str) {
        return (iw7) Enum.valueOf(iw7.class, str);
    }

    public static iw7[] values() {
        return (iw7[]) l.clone();
    }
}
