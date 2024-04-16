package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DomainEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lj63;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "l", Image.TYPE_MEDIUM, "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: j63  reason: default package */
/* loaded from: classes.dex */
public final class j63 {
    public static final j63 a = new j63("BASKET", 0);
    public static final j63 b = new j63("PROMOCODE", 1);
    public static final j63 c = new j63("AUTHORIZATION", 2);
    public static final j63 d = new j63("PIZZERIA_OPENING", 3);
    public static final j63 e = new j63("UPSALE", 4);
    public static final j63 f = new j63("BONUS_ACTIONS", 5);
    public static final j63 g = new j63("BONUS_APPLIED", 6);
    public static final j63 h = new j63("ACTIVE_ORDERS", 7);
    public static final j63 i = new j63("SELECTED_PIZZERIA", 8);
    public static final j63 j = new j63("SELECTED_CLIENT_DELIVERY_LOCATION", 9);
    public static final j63 k = new j63("USER_SUBSCRIBED", 10);
    public static final j63 l = new j63("PROFILE", 11);
    public static final j63 m = new j63("NAME", 12);
    private static final /* synthetic */ j63[] n;
    private static final /* synthetic */ kj3 o;

    static {
        j63[] a2 = a();
        n = a2;
        o = lj3.a(a2);
    }

    private j63(String str, int i2) {
    }

    private static final /* synthetic */ j63[] a() {
        return new j63[]{a, b, c, d, e, f, g, h, i, j, k, l, m};
    }

    public static j63 valueOf(String str) {
        return (j63) Enum.valueOf(j63.class, str);
    }

    public static j63[] values() {
        return (j63[]) n.clone();
    }
}
