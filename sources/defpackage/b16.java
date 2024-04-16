package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: LoyaltyMissionDetailsDataVO.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b,\u0010-J[\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b \u0010+¨\u0006."}, d2 = {"Lb16;", "Ljava/io/Serializable;", "", "id", "imageUrl", "", "rewardAmount", "title", "description", "Lxl6;", MessageAttributes.TYPE, "Lwl6;", "status", "Lvl6;", "expiringData", "a", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", e.a, c.a, "J", "f", "()J", DateTokenConverter.CONVERTER_KEY, "j", "Lxl6;", "k", "()Lxl6;", "g", "Lwl6;", "i", "()Lwl6;", Image.TYPE_HIGH, "Lvl6;", "()Lvl6;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lxl6;Lwl6;Lvl6;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b16  reason: default package */
/* loaded from: classes2.dex */
public final class b16 implements Serializable {
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final xl6 f;
    private final wl6 g;
    private final vl6 h;

    public b16(String str, String str2, long j, String str3, String str4, xl6 xl6Var, wl6 wl6Var, vl6 vl6Var) {
        z65.h(str, "id");
        z65.h(str2, "imageUrl");
        z65.h(str3, "title");
        z65.h(str4, "description");
        z65.h(xl6Var, MessageAttributes.TYPE);
        z65.h(wl6Var, "status");
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = xl6Var;
        this.g = wl6Var;
        this.h = vl6Var;
    }

    public static /* synthetic */ b16 b(b16 b16Var, String str, String str2, long j, String str3, String str4, xl6 xl6Var, wl6 wl6Var, vl6 vl6Var, int i, Object obj) {
        String str5;
        String str6;
        long j2;
        String str7;
        String str8;
        xl6 xl6Var2;
        wl6 wl6Var2;
        vl6 vl6Var2;
        if ((i & 1) != 0) {
            str5 = b16Var.a;
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            str6 = b16Var.b;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            j2 = b16Var.c;
        } else {
            j2 = j;
        }
        if ((i & 8) != 0) {
            str7 = b16Var.d;
        } else {
            str7 = str3;
        }
        if ((i & 16) != 0) {
            str8 = b16Var.e;
        } else {
            str8 = str4;
        }
        if ((i & 32) != 0) {
            xl6Var2 = b16Var.f;
        } else {
            xl6Var2 = xl6Var;
        }
        if ((i & 64) != 0) {
            wl6Var2 = b16Var.g;
        } else {
            wl6Var2 = wl6Var;
        }
        if ((i & 128) != 0) {
            vl6Var2 = b16Var.h;
        } else {
            vl6Var2 = vl6Var;
        }
        return b16Var.a(str5, str6, j2, str7, str8, xl6Var2, wl6Var2, vl6Var2);
    }

    public final b16 a(String str, String str2, long j, String str3, String str4, xl6 xl6Var, wl6 wl6Var, vl6 vl6Var) {
        z65.h(str, "id");
        z65.h(str2, "imageUrl");
        z65.h(str3, "title");
        z65.h(str4, "description");
        z65.h(xl6Var, MessageAttributes.TYPE);
        z65.h(wl6Var, "status");
        return new b16(str, str2, j, str3, str4, xl6Var, wl6Var, vl6Var);
    }

    public final String c() {
        return this.e;
    }

    public final vl6 d() {
        return this.h;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b16)) {
            return false;
        }
        b16 b16Var = (b16) obj;
        if (z65.c(this.a, b16Var.a) && z65.c(this.b, b16Var.b) && this.c == b16Var.c && z65.c(this.d, b16Var.d) && z65.c(this.e, b16Var.e) && z65.c(this.f, b16Var.f) && z65.c(this.g, b16Var.g) && z65.c(this.h, b16Var.h)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.c;
    }

    public final String getId() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + ax1.a(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        vl6 vl6Var = this.h;
        if (vl6Var == null) {
            hashCode = 0;
        } else {
            hashCode = vl6Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final wl6 i() {
        return this.g;
    }

    public final String j() {
        return this.d;
    }

    public final xl6 k() {
        return this.f;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        long j = this.c;
        String str3 = this.d;
        String str4 = this.e;
        xl6 xl6Var = this.f;
        wl6 wl6Var = this.g;
        vl6 vl6Var = this.h;
        return "LoyaltyMissionDetailsDataVO(id=" + str + ", imageUrl=" + str2 + ", rewardAmount=" + j + ", title=" + str3 + ", description=" + str4 + ", type=" + xl6Var + ", status=" + wl6Var + ", expiringData=" + vl6Var + ")";
    }
}
