package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BuyMoreAnalytics.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lhi0;", "", "Lqd;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hi0  reason: default package */
/* loaded from: classes4.dex */
public final class hi0 implements qd {
    public static final hi0 b = new hi0("UPSELL", 0, "product_upsell");
    public static final hi0 c = new hi0("TAP_OUTSIDE", 1, "tap_outside");
    public static final hi0 d = new hi0("SWIPE", 2, "swipe");
    public static final hi0 e = new hi0("BACK", 3, StatisticManager.BACK);
    public static final hi0 f = new hi0("BUTTON", 4, "button");
    private static final /* synthetic */ hi0[] g;
    private static final /* synthetic */ kj3 h;
    private final String a;

    static {
        hi0[] a = a();
        g = a;
        h = lj3.a(a);
    }

    private hi0(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ hi0[] a() {
        return new hi0[]{b, c, d, e, f};
    }

    public static hi0 valueOf(String str) {
        return (hi0) Enum.valueOf(hi0.class, str);
    }

    public static hi0[] values() {
        return (hi0[]) g.clone();
    }

    @Override // defpackage.qd
    public String getValue() {
        return this.a;
    }
}
