package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromoCodeSender.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcq8;", "", "Lqd;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cq8  reason: default package */
/* loaded from: classes4.dex */
public final class cq8 implements qd, Serializable {
    public static final a b;
    public static final cq8 c = new cq8("PUSH", 0, "push");
    public static final cq8 d = new cq8("DEEPLINK", 1, "deeplink");
    public static final cq8 e = new cq8("BANNER", 2, "banner");
    public static final cq8 f = new cq8("CART", 3, "cart");
    public static final cq8 g = new cq8("PERSONAL_BONUSES", 4, "personalBonuses");
    public static final cq8 h = new cq8("PERSONAL_BONUSES_IN_CART", 5, "personalBonusesInCart");
    public static final cq8 i = new cq8("STORIES", 6, "stories");
    public static final cq8 j = new cq8("REFERRAL", 7, "referral_screen");
    public static final cq8 k = new cq8("PROFILE", 8, "profile");
    private static final /* synthetic */ cq8[] l;
    private static final /* synthetic */ kj3 m;
    private final String a;

    /* compiled from: PromoCodeSender.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcq8$a;", "", "", "value", "Lcq8;", "default", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cq8$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cq8 a(String str, cq8 cq8Var) {
            cq8 cq8Var2;
            z65.h(str, "value");
            z65.h(cq8Var, "default");
            cq8[] values = cq8.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    cq8Var2 = values[i];
                    if (z65.c(cq8Var2.getValue(), str)) {
                        break;
                    }
                    i++;
                } else {
                    cq8Var2 = null;
                    break;
                }
            }
            return (cq8) mh5.c(cq8Var2, cq8Var);
        }
    }

    static {
        cq8[] a2 = a();
        l = a2;
        m = lj3.a(a2);
        b = new a(null);
    }

    private cq8(String str, int i2, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ cq8[] a() {
        return new cq8[]{c, d, e, f, g, h, i, j, k};
    }

    public static cq8 valueOf(String str) {
        return (cq8) Enum.valueOf(cq8.class, str);
    }

    public static cq8[] values() {
        return (cq8[]) l.clone();
    }

    @Override // defpackage.qd
    public String getValue() {
        return this.a;
    }
}
