package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0005j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lmi7;", "", "", "a", "I", "i", "()I", "state", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "j", "k", "l", Image.TYPE_MEDIUM, "n", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mi7  reason: default package */
/* loaded from: classes4.dex */
public final class mi7 {
    public static final a b;
    public static final mi7 c = new mi7(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
    public static final mi7 d = new mi7("ACCEPTED", 1, 1);
    public static final mi7 e = new mi7("DEFERRED_DELIVERY", 2, 2);
    public static final mi7 f = new mi7("DEFERRED_CARRYOUT_WITH_COOKING", 3, 3);
    public static final mi7 g = new mi7("DEFERRED_CARRYOUT_WITHOUT_COOKING", 4, 4);
    public static final mi7 h = new mi7("COOKING", 5, 5);
    public static final mi7 i = new mi7("READY_FOR_DELIVERY", 6, 6);
    public static final mi7 j = new mi7("READY_FOR_CARRYOUT", 7, 7);
    public static final mi7 k = new mi7("ON_DELIVERY", 8, 8);
    public static final mi7 l = new mi7("COMPLETED", 9, 9);
    public static final mi7 m = new mi7("CANCELLED", 10, 10);
    public static final mi7 n = new mi7("COURIER_IS_LATE", 11, 11);
    private static final /* synthetic */ mi7[] o;
    private static final /* synthetic */ kj3 p;
    private final int a;

    /* compiled from: OrderState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lmi7$a;", "", "", "value", "Lmi7;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mi7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mi7 a(int i) {
            mi7 mi7Var;
            mi7[] values = mi7.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    mi7Var = values[i2];
                    if (mi7Var.i() == i) {
                        break;
                    }
                    i2++;
                } else {
                    mi7Var = null;
                    break;
                }
            }
            if (mi7Var == null) {
                return mi7.c;
            }
            return mi7Var;
        }
    }

    static {
        mi7[] a2 = a();
        o = a2;
        p = lj3.a(a2);
        b = new a(null);
    }

    private mi7(String str, int i2, int i3) {
        this.a = i3;
    }

    private static final /* synthetic */ mi7[] a() {
        return new mi7[]{c, d, e, f, g, h, i, j, k, l, m, n};
    }

    public static mi7 valueOf(String str) {
        return (mi7) Enum.valueOf(mi7.class, str);
    }

    public static mi7[] values() {
        return (mi7[]) o.clone();
    }

    public final int i() {
        return this.a;
    }
}
