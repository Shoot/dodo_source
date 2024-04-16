package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kk7;
import kotlin.Metadata;
/* compiled from: CheckoutDetails.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b=\u0010>J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0000J\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Jf\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010 \u001a\u00020\u001fHÖ\u0001J\t\u0010!\u001a\u00020\u0018HÖ\u0001J\u0013\u0010#\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b.\u00107R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b5\u0010<¨\u0006?"}, d2 = {"Lb41;", "", "Ld88;", "pizzeria", Image.TYPE_MEDIUM, "o", "Lw6;", "address", "l", "Le91;", "deliveryLocation", "n", "k", "", "deferredTime", "p", "(Ljava/lang/Long;)Lb41;", "Lzs7;", "payment", "Lkk7;", "orderType", "", "isWorkload", "isTakeaway", "", "expectedMinutesToReceiveForASAP", "tableNumber", "Lwo7;", "packageSelector", "a", "(Lzs7;Lkk7;Ljava/lang/Long;ZLjava/lang/Boolean;ILjava/lang/Integer;Lwo7;)Lb41;", "", "toString", "hashCode", "other", "equals", "Lzs7;", "g", "()Lzs7;", "b", "Lkk7;", e.a, "()Lkk7;", c.a, "Ljava/lang/Long;", "()Ljava/lang/Long;", DateTokenConverter.CONVERTER_KEY, "Z", "j", "()Z", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "f", "I", "()I", "Ljava/lang/Integer;", Image.TYPE_HIGH, "()Ljava/lang/Integer;", "Lwo7;", "()Lwo7;", "<init>", "(Lzs7;Lkk7;Ljava/lang/Long;ZLjava/lang/Boolean;ILjava/lang/Integer;Lwo7;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b41  reason: default package */
/* loaded from: classes4.dex */
public final class b41 {
    private final zs7 a;
    private final kk7 b;
    private final Long c;
    private final boolean d;
    private final Boolean e;
    private final int f;
    private final Integer g;
    private final wo7 h;

    public b41(zs7 zs7Var, kk7 kk7Var, Long l, boolean z, Boolean bool, int i, Integer num, wo7 wo7Var) {
        z65.h(zs7Var, "payment");
        z65.h(kk7Var, "orderType");
        z65.h(wo7Var, "packageSelector");
        this.a = zs7Var;
        this.b = kk7Var;
        this.c = l;
        this.d = z;
        this.e = bool;
        this.f = i;
        this.g = num;
        this.h = wo7Var;
    }

    public static /* synthetic */ b41 b(b41 b41Var, zs7 zs7Var, kk7 kk7Var, Long l, boolean z, Boolean bool, int i, Integer num, wo7 wo7Var, int i2, Object obj) {
        zs7 zs7Var2;
        kk7 kk7Var2;
        Long l2;
        boolean z2;
        Boolean bool2;
        int i3;
        Integer num2;
        wo7 wo7Var2;
        if ((i2 & 1) != 0) {
            zs7Var2 = b41Var.a;
        } else {
            zs7Var2 = zs7Var;
        }
        if ((i2 & 2) != 0) {
            kk7Var2 = b41Var.b;
        } else {
            kk7Var2 = kk7Var;
        }
        if ((i2 & 4) != 0) {
            l2 = b41Var.c;
        } else {
            l2 = l;
        }
        if ((i2 & 8) != 0) {
            z2 = b41Var.d;
        } else {
            z2 = z;
        }
        if ((i2 & 16) != 0) {
            bool2 = b41Var.e;
        } else {
            bool2 = bool;
        }
        if ((i2 & 32) != 0) {
            i3 = b41Var.f;
        } else {
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            num2 = b41Var.g;
        } else {
            num2 = num;
        }
        if ((i2 & 128) != 0) {
            wo7Var2 = b41Var.h;
        } else {
            wo7Var2 = wo7Var;
        }
        return b41Var.a(zs7Var2, kk7Var2, l2, z2, bool2, i3, num2, wo7Var2);
    }

    public final b41 a(zs7 zs7Var, kk7 kk7Var, Long l, boolean z, Boolean bool, int i, Integer num, wo7 wo7Var) {
        z65.h(zs7Var, "payment");
        z65.h(kk7Var, "orderType");
        z65.h(wo7Var, "packageSelector");
        return new b41(zs7Var, kk7Var, l, z, bool, i, num, wo7Var);
    }

    public final Long c() {
        return this.c;
    }

    public final int d() {
        return this.f;
    }

    public final kk7 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b41)) {
            return false;
        }
        b41 b41Var = (b41) obj;
        if (z65.c(this.a, b41Var.a) && z65.c(this.b, b41Var.b) && z65.c(this.c, b41Var.c) && this.d == b41Var.d && z65.c(this.e, b41Var.e) && this.f == b41Var.f && z65.c(this.g, b41Var.g) && z65.c(this.h, b41Var.h)) {
            return true;
        }
        return false;
    }

    public final wo7 f() {
        return this.h;
    }

    public final zs7 g() {
        return this.a;
    }

    public final Integer h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Long l = this.c;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int a = (((hashCode3 + hashCode) * 31) + a91.a(this.d)) * 31;
        Boolean bool = this.e;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i2 = (((a + hashCode2) * 31) + this.f) * 31;
        Integer num = this.g;
        if (num != null) {
            i = num.hashCode();
        }
        return ((i2 + i) * 31) + this.h.hashCode();
    }

    public final Boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.d;
    }

    public final b41 k() {
        return b(this, null, new kk7.b.C0408b(e91.e), null, false, null, 0, null, null, 253, null);
    }

    public final b41 l(w6 w6Var) {
        z65.h(w6Var, "address");
        return b(this, null, new kk7.b.a(w6Var.getId()), null, false, null, 0, null, null, 253, null);
    }

    public final b41 m(d88 d88Var) {
        z65.h(d88Var, "pizzeria");
        return b(this, null, new kk7.a(d88Var.getId()), null, false, null, 0, null, null, 253, null);
    }

    public final b41 n(e91 e91Var) {
        z65.h(e91Var, "deliveryLocation");
        return b(this, null, new kk7.b.C0408b(e91Var), null, false, null, 0, null, null, 253, null);
    }

    public final b41 o(d88 d88Var) {
        z65.h(d88Var, "pizzeria");
        return b(this, null, new kk7.c(d88Var.getId()), null, false, null, 0, null, null, 253, null);
    }

    public final b41 p(Long l) {
        return b(this, null, null, l, false, null, 0, null, null, 251, null);
    }

    public String toString() {
        zs7 zs7Var = this.a;
        kk7 kk7Var = this.b;
        Long l = this.c;
        boolean z = this.d;
        Boolean bool = this.e;
        int i = this.f;
        Integer num = this.g;
        wo7 wo7Var = this.h;
        return "CheckoutDetails(payment=" + zs7Var + ", orderType=" + kk7Var + ", deferredTime=" + l + ", isWorkload=" + z + ", isTakeaway=" + bool + ", expectedMinutesToReceiveForASAP=" + i + ", tableNumber=" + num + ", packageSelector=" + wo7Var + ")";
    }
}
