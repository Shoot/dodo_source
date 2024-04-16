package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PaymentData.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010(\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00105\u001a\u000201\u0012\b\u00106\u001a\u0004\u0018\u00010\u0005\u0012\b\u00107\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010<\u001a\u000208¢\u0006\u0004\b=\u0010>J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b!\u0010\u000eR\u0019\u0010$\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b#\u0010\u000eR\u0019\u0010%\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010'\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b&\u0010\u000eR%\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u00100\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b \u0010/R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b3\u00104R\u0019\u00106\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b\u001e\u0010\u000eR\u0019\u00107\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010<\u001a\u0002088\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lys7;", "", "", "o", "n", "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "paymentId", "Liw7;", "b", "Liw7;", "i", "()Liw7;", "paymentType", "Ldu7;", c.a, "Ldu7;", Image.TYPE_HIGH, "()Ldu7;", "paymentMethodType", DateTokenConverter.CONVERTER_KEY, "acquirerName", e.a, "authorizeUrl", "f", "l", "redirectUrl", Image.TYPE_MEDIUM, "successUrl", "failureUrl", "k", "publicKey", "", "j", "Ljava/util/Map;", "()Ljava/util/Map;", "providerData", "", "J", "()J", "lifetime", "Loh3;", "Loh3;", "getEncryptionData", "()Loh3;", "encryptionData", "googlePayRequestData", "googlePayEnvironment", "Ldt7;", "Ldt7;", "getPaymentIntegrationType", "()Ldt7;", "paymentIntegrationType", "<init>", "(Ljava/lang/String;Liw7;Ldu7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JLoh3;Ljava/lang/String;Ljava/lang/String;Ldt7;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ys7  reason: default package */
/* loaded from: classes2.dex */
public final class ys7 {
    private final String a;
    private final iw7 b;
    private final du7 c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final Map<String, String> j;
    private final long k;
    private final oh3 l;
    private final String m;
    private final String n;
    private final dt7 o;

    /* compiled from: PaymentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys7$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[dt7.values().length];
            try {
                iArr[dt7.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ys7(String str, iw7 iw7Var, du7 du7Var, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map, long j, oh3 oh3Var, String str8, String str9, dt7 dt7Var) {
        z65.h(str, "paymentId");
        z65.h(iw7Var, "paymentType");
        z65.h(du7Var, "paymentMethodType");
        z65.h(str2, "acquirerName");
        z65.h(oh3Var, "encryptionData");
        z65.h(dt7Var, "paymentIntegrationType");
        this.a = str;
        this.b = iw7Var;
        this.c = du7Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = map;
        this.k = j;
        this.l = oh3Var;
        this.m = str8;
        this.n = str9;
        this.o = dt7Var;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.n;
    }

    public final String e() {
        return this.m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys7)) {
            return false;
        }
        ys7 ys7Var = (ys7) obj;
        if (z65.c(this.a, ys7Var.a) && this.b == ys7Var.b && this.c == ys7Var.c && z65.c(this.d, ys7Var.d) && z65.c(this.e, ys7Var.e) && z65.c(this.f, ys7Var.f) && z65.c(this.g, ys7Var.g) && z65.c(this.h, ys7Var.h) && z65.c(this.i, ys7Var.i) && z65.c(this.j, ys7Var.j) && this.k == ys7Var.k && z65.c(this.l, ys7Var.l) && z65.c(this.m, ys7Var.m) && z65.c(this.n, ys7Var.n) && this.o == ys7Var.o) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.k;
    }

    public final String g() {
        return this.a;
    }

    public final du7 h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode8 + hashCode) * 31;
        String str2 = this.f;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.g;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.h;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.i;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Map<String, String> map = this.j;
        if (map == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = map.hashCode();
        }
        int a2 = (((((i6 + hashCode6) * 31) + ax1.a(this.k)) * 31) + this.l.hashCode()) * 31;
        String str6 = this.m;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i7 = (a2 + hashCode7) * 31;
        String str7 = this.n;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return ((i7 + i) * 31) + this.o.hashCode();
    }

    public final iw7 i() {
        return this.b;
    }

    public final Map<String, String> j() {
        return this.j;
    }

    public final String k() {
        return this.i;
    }

    public final String l() {
        return this.f;
    }

    public final String m() {
        return this.g;
    }

    public final boolean n() {
        return p4.a().contains(this.d);
    }

    public final boolean o() {
        if (a.$EnumSwitchMapping$0[this.o.ordinal()] == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.a;
        iw7 iw7Var = this.b;
        du7 du7Var = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        String str6 = this.h;
        String str7 = this.i;
        Map<String, String> map = this.j;
        long j = this.k;
        oh3 oh3Var = this.l;
        String str8 = this.m;
        String str9 = this.n;
        dt7 dt7Var = this.o;
        return "PaymentData(paymentId=" + str + ", paymentType=" + iw7Var + ", paymentMethodType=" + du7Var + ", acquirerName=" + str2 + ", authorizeUrl=" + str3 + ", redirectUrl=" + str4 + ", successUrl=" + str5 + ", failureUrl=" + str6 + ", publicKey=" + str7 + ", providerData=" + map + ", lifetime=" + j + ", encryptionData=" + oh3Var + ", googlePayRequestData=" + str8 + ", googlePayEnvironment=" + str9 + ", paymentIntegrationType=" + dt7Var + ")";
    }
}
