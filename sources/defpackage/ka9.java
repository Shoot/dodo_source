package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReferralCodeApplyingInfo.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lka9;", "", "", "a", "I", "k", "()I", "id", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "i", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ka9  reason: default package */
/* loaded from: classes4.dex */
public final class ka9 {
    public static final a b;
    public static final ka9 c = new ka9(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
    public static final ka9 d = new ka9("ALREADY_ACTIVATED", 1, 1);
    public static final ka9 e = new ka9("INVALID_CODE", 2, 2);
    public static final ka9 f = new ka9("COUNTRY_MISMATCH", 3, 3);
    public static final ka9 g = new ka9("ALREADY_HAS_ORDERS", 4, 5);
    public static final ka9 h = new ka9("REFERRER_HAS_NO_ORDER", 5, 6);
    public static final ka9 i = new ka9("MAX_REFERRALS_REACHED", 6, 7);
    private static final /* synthetic */ ka9[] j;
    private static final /* synthetic */ kj3 k;
    private final int a;

    /* compiled from: ReferralCodeApplyingInfo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lka9$a;", "", "", MessageAttributes.TYPE, "Lka9;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ka9$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ka9 a(int i) {
            Object obj;
            Iterator<E> it = ka9.i().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ka9) obj).k() == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (ka9) mh5.c(obj, ka9.c);
        }
    }

    static {
        ka9[] a2 = a();
        j = a2;
        k = lj3.a(a2);
        b = new a(null);
    }

    private ka9(String str, int i2, int i3) {
        this.a = i3;
    }

    private static final /* synthetic */ ka9[] a() {
        return new ka9[]{c, d, e, f, g, h, i};
    }

    public static kj3<ka9> i() {
        return k;
    }

    public static ka9 valueOf(String str) {
        return (ka9) Enum.valueOf(ka9.class, str);
    }

    public static ka9[] values() {
        return (ka9[]) j.clone();
    }

    public final int k() {
        return this.a;
    }
}
