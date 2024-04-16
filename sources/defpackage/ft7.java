package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.payment.CardEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: PaymentMethod.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010%\u0012\u0006\u0010,\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0014\u0010\u001fR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010(\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b\u0016\u0010'R\u0017\u0010,\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006/"}, d2 = {"Lft7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "id", "Ldu7;", "b", "Ldu7;", "g", "()Ldu7;", "paymentType", c.a, "acquirerName", DateTokenConverter.CONVERTER_KEY, "brandName", "Ldt7;", "Ldt7;", "f", "()Ldt7;", "integrationType", "Lcom/dodopizza/persistence/entity/payment/CardEntity;", "Lcom/dodopizza/persistence/entity/payment/CardEntity;", "()Lcom/dodopizza/persistence/entity/payment/CardEntity;", "card", "I", Image.TYPE_HIGH, "()I", "priority", "Lwg4;", "Lwg4;", "()Lwg4;", "googlePayInitData", "i", "Z", "()Z", "isRedirectSaveCardEnabled", "<init>", "(Ljava/lang/String;Ldu7;Ljava/lang/String;Ljava/lang/String;Ldt7;Lcom/dodopizza/persistence/entity/payment/CardEntity;ILwg4;Z)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ft7  reason: default package */
/* loaded from: classes2.dex */
public final class ft7 {
    private final String a;
    private final du7 b;
    private final String c;
    private final String d;
    private final dt7 e;
    private final CardEntity f;
    private final int g;
    private final wg4 h;
    private final boolean i;

    public ft7(String str, du7 du7Var, String str2, String str3, dt7 dt7Var, CardEntity cardEntity, int i, wg4 wg4Var, boolean z) {
        z65.h(str, "id");
        z65.h(du7Var, "paymentType");
        z65.h(dt7Var, "integrationType");
        this.a = str;
        this.b = du7Var;
        this.c = str2;
        this.d = str3;
        this.e = dt7Var;
        this.f = cardEntity;
        this.g = i;
        this.h = wg4Var;
        this.i = z;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final CardEntity c() {
        return this.f;
    }

    public final wg4 d() {
        return this.h;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft7)) {
            return false;
        }
        ft7 ft7Var = (ft7) obj;
        if (z65.c(this.a, ft7Var.a) && this.b == ft7Var.b && z65.c(this.c, ft7Var.c) && z65.c(this.d, ft7Var.d) && this.e == ft7Var.e && z65.c(this.f, ft7Var.f) && this.g == ft7Var.g && z65.c(this.h, ft7Var.h) && this.i == ft7Var.i) {
            return true;
        }
        return false;
    }

    public final dt7 f() {
        return this.e;
    }

    public final du7 g() {
        return this.b;
    }

    public final int h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode5 = (((i2 + hashCode2) * 31) + this.e.hashCode()) * 31;
        CardEntity cardEntity = this.f;
        if (cardEntity == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = cardEntity.hashCode();
        }
        int i3 = (((hashCode5 + hashCode3) * 31) + this.g) * 31;
        wg4 wg4Var = this.h;
        if (wg4Var != null) {
            i = wg4Var.hashCode();
        }
        return ((i3 + i) * 31) + a91.a(this.i);
    }

    public final boolean i() {
        return this.i;
    }

    public String toString() {
        String str = this.a;
        du7 du7Var = this.b;
        String str2 = this.c;
        String str3 = this.d;
        dt7 dt7Var = this.e;
        CardEntity cardEntity = this.f;
        int i = this.g;
        wg4 wg4Var = this.h;
        boolean z = this.i;
        return "PaymentMethod(id=" + str + ", paymentType=" + du7Var + ", acquirerName=" + str2 + ", brandName=" + str3 + ", integrationType=" + dt7Var + ", card=" + cardEntity + ", priority=" + i + ", googlePayInitData=" + wg4Var + ", isRedirectSaveCardEnabled=" + z + ")";
    }
}
