package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductCategory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkl8;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: kl8  reason: default package */
/* loaded from: classes.dex */
public final class kl8 {
    public static final kl8 b = new kl8("PIZZA", 0, "1");
    public static final kl8 c = new kl8("DRINKS", 1, "2");
    public static final kl8 d = new kl8("SNACKS", 2, "3");
    public static final kl8 e = new kl8("SAUCES", 3, "4");
    public static final kl8 f = new kl8("OTHER", 4, "5");
    public static final kl8 g = new kl8("DESSERTS", 5, "6");
    public static final kl8 h = new kl8("PIECES", 6, "7");
    public static final kl8 i = new kl8("COMBO", 7, "100");
    public static final kl8 j = new kl8(GrsBaseInfo.CountryCodeSource.UNKNOWN, 8, "");
    private static final /* synthetic */ kl8[] k;
    private static final /* synthetic */ kj3 l;
    private final String a;

    /* compiled from: ProductCategory.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¨\u0006\r"}, d2 = {"Lkl8$a;", "", "", "categoryId", "Lkl8;", "a", "b", "", DateTokenConverter.CONVERTER_KEY, "", c.a, "<init>", "()V", "common"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kl8$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public final kl8 a(String str) {
            kl8 kl8Var;
            z65.h(str, "categoryId");
            kl8[] values = kl8.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    kl8Var = values[i];
                    if (z65.c(kl8Var.getId(), str)) {
                        break;
                    }
                    i++;
                } else {
                    kl8Var = null;
                    break;
                }
            }
            if (kl8Var != null) {
                return kl8Var;
            }
            throw new IllegalArgumentException("Category with id " + str + " not found");
        }

        public final kl8 b(String str) {
            kl8 kl8Var;
            z65.h(str, "categoryId");
            kl8[] values = kl8.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    kl8Var = values[i];
                    if (z65.c(kl8Var.getId(), str)) {
                        break;
                    }
                    i++;
                } else {
                    kl8Var = null;
                    break;
                }
            }
            if (kl8Var == null) {
                return kl8.j;
            }
            return kl8Var;
        }

        public final Set<kl8> c() {
            Set<kl8> g;
            g = sfa.g(kl8.b, kl8.i, kl8.h, kl8.d, kl8.g, kl8.c, kl8.f, kl8.e);
            return g;
        }

        public final List<kl8> d() {
            List<kl8> o;
            o = kc1.o(kl8.b, kl8.i, kl8.h, kl8.d, kl8.g, kl8.c, kl8.f);
            return o;
        }
    }

    static {
        kl8[] a2 = a();
        k = a2;
        l = lj3.a(a2);
    }

    private kl8(String str, int i2, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ kl8[] a() {
        return new kl8[]{b, c, d, e, f, g, h, i, j};
    }

    public static kl8 valueOf(String str) {
        return (kl8) Enum.valueOf(kl8.class, str);
    }

    public static kl8[] values() {
        return (kl8[]) k.clone();
    }

    public final String getId() {
        return this.a;
    }
}
