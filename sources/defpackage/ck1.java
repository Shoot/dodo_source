package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.PaymentEntity;
import com.dodopizza.persistence.entity.menu.MenuItemEntity;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonSender.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b-\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/¨\u00060"}, d2 = {"Lck1;", "", "Lqd;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "l", Image.TYPE_MEDIUM, "n", "o", "p", "q", "r", Image.TYPE_SMALL, "t", "u", "v", "w", "x", "y", "z", "A", "B", "I", "X", "Y", "Z", "S4", "T4", "U4", "V4", "W4", "X4", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ck1  reason: default package */
/* loaded from: classes4.dex */
public final class ck1 implements qd {
    private static final /* synthetic */ ck1[] Y4;
    private static final /* synthetic */ kj3 Z4;
    private final String a;
    public static final ck1 b = new ck1("ASSISTANT", 0, MenuItemEntity.TYPE_ASSISTANT);
    public static final ck1 c = new ck1("DEVICE", 1, "device");
    public static final ck1 d = new ck1("CONTACTS", 2, "contacts");
    public static final ck1 e = new ck1("MENU", 3, "menu");
    public static final ck1 f = new ck1("PRODUCT_CARD", 4, "product card");
    public static final ck1 g = new ck1("POPULAR", 5, "popular");
    public static final ck1 h = new ck1("PERSONAL", 6, "personal");
    public static final ck1 i = new ck1("CART", 7, "cart");
    public static final ck1 j = new ck1("PUSH", 8, "push");
    public static final ck1 k = new ck1("UPSELL", 9, "upsell");
    public static final ck1 l = new ck1("FAVORITES", 10, "favorites");
    public static final ck1 m = new ck1("BANNER", 11, "banner");
    public static final ck1 n = new ck1("CHAT", 12, "chat");
    public static final ck1 o = new ck1("CHECKOUT", 13, "checkout");
    public static final ck1 p = new ck1(GrsBaseInfo.CountryCodeSource.UNKNOWN, 14, "unknown");
    public static final ck1 q = new ck1("PROFILE", 15, "profile");
    public static final ck1 r = new ck1("LOGIN", 16, "login");
    public static final ck1 s = new ck1("DELIVERY_ADDRESS_LIST", 17, "delivery address list");
    public static final ck1 t = new ck1("ADDRESS_LIST", 18, "address list");
    public static final ck1 u = new ck1("ADDRESS_CATCH", 19, "address catch");
    public static final ck1 v = new ck1("ONBOARDING", 20, StatisticManager.ONBOARDING);
    public static final ck1 w = new ck1("ORDER_TRACKING", 21, "order_tracking");
    public static final ck1 x = new ck1("ORDER", 22, BonusActionEntity.ORDER);
    public static final ck1 y = new ck1("ORDER_COMPLETED", 23, "order_completed");
    public static final ck1 z = new ck1("ORDER_RATING", 24, "rate_order");
    public static final ck1 A = new ck1("ORDER_RATING_APPLIED", 25, "rate_order_offboarding");
    public static final ck1 B = new ck1("ORDER_TYPE_SWITCHER", 26, "order type switcher");
    public static final ck1 I = new ck1("PROMOCODE", 27, "promocode");
    public static final ck1 X = new ck1("STORIES", 28, "stories");
    public static final ck1 Y = new ck1("SEARCH", 29, "search");
    public static final ck1 Z = new ck1("GEO_SUGGESTION", 30, "geoSuggestion");
    public static final ck1 S4 = new ck1("WEB_VIEW", 31, PaymentEntity.SCENARIO_WEB_VIEW);
    public static final ck1 T4 = new ck1("FAB", 32, "floating_button");
    public static final ck1 U4 = new ck1("ADDRESS_CATCHER_START_SCREEN", 33, "address_catcher_start_screen");
    public static final ck1 V4 = new ck1("ADDRESS_CATCHER_SUCCESS_SCREEN", 34, "address_catcher_success_screen");
    public static final ck1 W4 = new ck1("PIZZA_HALVES_BUILDER", 35, "pizza_halves_builder");
    public static final ck1 X4 = new ck1("PIZZA_HALVES_INGREDIENTS_BOTTOM_SHEET", 36, "pizza_half_ingredients_bottom_sheet");

    static {
        ck1[] a = a();
        Y4 = a;
        Z4 = lj3.a(a);
    }

    private ck1(String str, int i2, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ ck1[] a() {
        return new ck1[]{b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, I, X, Y, Z, S4, T4, U4, V4, W4, X4};
    }

    public static ck1 valueOf(String str) {
        return (ck1) Enum.valueOf(ck1.class, str);
    }

    public static ck1[] values() {
        return (ck1[]) Y4.clone();
    }

    @Override // defpackage.qd
    public String getValue() {
        return this.a;
    }
}
