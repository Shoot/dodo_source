package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoyaltyHistoryOperationSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Leb7;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eb7  reason: default package */
/* loaded from: classes4.dex */
public final class eb7 {
    public static final eb7 a = new eb7(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
    public static final eb7 b = new eb7("ORDER_CALCULATION", 1);
    public static final eb7 c = new eb7("ADMIN", 2);
    public static final eb7 d = new eb7("MINDBOX", 3);
    public static final eb7 e = new eb7("CONTROLLING", 4);
    private static final /* synthetic */ eb7[] f;
    private static final /* synthetic */ kj3 g;

    static {
        eb7[] a2 = a();
        f = a2;
        g = lj3.a(a2);
    }

    private eb7(String str, int i) {
    }

    private static final /* synthetic */ eb7[] a() {
        return new eb7[]{a, b, c, d, e};
    }

    public static eb7 valueOf(String str) {
        return (eb7) Enum.valueOf(eb7.class, str);
    }

    public static eb7[] values() {
        return (eb7[]) f.clone();
    }
}
