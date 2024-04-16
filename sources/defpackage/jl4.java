package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: HalvesPizzaCartProductVO.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\b\u0012\b\u0010.\u001a\u0004\u0018\u00010+\u0012\u0006\u00103\u001a\u00020/\u0012\u0006\u00104\u001a\u00020/\u0012\u0006\u00109\u001a\u000205¢\u0006\u0004\b:\u0010;J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\"\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u000f\u0010!R\u001a\u0010&\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u0013\u0010%R\u001a\u0010'\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010*\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010!R\u001c\u0010.\u001a\u0004\u0018\u00010+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b\u0018\u0010-R\u0017\u00103\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u001f\u00102R\u0017\u00104\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b0\u00102R\u0017\u00109\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b(\u00108¨\u0006<"}, d2 = {"Ljl4;", "La78;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", "getImageUrl", "imageUrl", "Lhn6;", c.a, "Lhn6;", "j", "()Lhn6;", "price", DateTokenConverter.CONVERTER_KEY, "I", "()I", "count", e.a, "g", "maxCount", "f", "Z", "()Z", "isInStop", "Lnq0;", "Lnq0;", "()Lnq0;", "cartItem", "doughDescription", "i", "l", "isGift", "Lv23;", "Lv23;", "()Lv23;", "discount", "Lmr0;", "k", "Lmr0;", "()Lmr0;", "leftHalf", "rightHalf", "Lb78;", Image.TYPE_MEDIUM, "Lb78;", "()Lb78;", "pizzaConcept", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhn6;IIZLnq0;Ljava/lang/String;ZLv23;Lmr0;Lmr0;Lb78;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jl4  reason: default package */
/* loaded from: classes2.dex */
public final class jl4 extends a78 {
    private final String a;
    private final String b;
    private final hn6 c;
    private final int d;
    private final int e;
    private final boolean f;
    private final nq0 g;
    private final String h;
    private final boolean i;
    private final v23 j;
    private final mr0 k;
    private final mr0 l;
    private final b78 m;

    public jl4(String str, String str2, hn6 hn6Var, int i, int i2, boolean z, nq0 nq0Var, String str3, boolean z2, v23 v23Var, mr0 mr0Var, mr0 mr0Var2, b78 b78Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(nq0Var, "cartItem");
        z65.h(str3, "doughDescription");
        z65.h(mr0Var, "leftHalf");
        z65.h(mr0Var2, "rightHalf");
        z65.h(b78Var, "pizzaConcept");
        this.a = str;
        this.b = str2;
        this.c = hn6Var;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = nq0Var;
        this.h = str3;
        this.i = z2;
        this.j = v23Var;
        this.k = mr0Var;
        this.l = mr0Var2;
        this.m = b78Var;
    }

    @Override // defpackage.or0
    public int a() {
        return this.d;
    }

    @Override // defpackage.or0
    public boolean b() {
        return this.f;
    }

    public nq0 c() {
        return this.g;
    }

    public v23 d() {
        return this.j;
    }

    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl4)) {
            return false;
        }
        jl4 jl4Var = (jl4) obj;
        if (z65.c(this.a, jl4Var.a) && z65.c(this.b, jl4Var.b) && z65.c(this.c, jl4Var.c) && this.d == jl4Var.d && this.e == jl4Var.e && this.f == jl4Var.f && z65.c(this.g, jl4Var.g) && z65.c(this.h, jl4Var.h) && this.i == jl4Var.i && z65.c(this.j, jl4Var.j) && z65.c(this.k, jl4Var.k) && z65.c(this.l, jl4Var.l) && this.m == jl4Var.m) {
            return true;
        }
        return false;
    }

    public final mr0 f() {
        return this.k;
    }

    public int g() {
        return this.e;
    }

    public String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + a91.a(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + a91.a(this.i)) * 31;
        v23 v23Var = this.j;
        if (v23Var == null) {
            hashCode = 0;
        } else {
            hashCode = v23Var.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
    }

    public final b78 i() {
        return this.m;
    }

    public hn6 j() {
        return this.c;
    }

    public final mr0 k() {
        return this.l;
    }

    public boolean l() {
        return this.i;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        hn6 hn6Var = this.c;
        int i = this.d;
        int i2 = this.e;
        boolean z = this.f;
        nq0 nq0Var = this.g;
        String str3 = this.h;
        boolean z2 = this.i;
        v23 v23Var = this.j;
        mr0 mr0Var = this.k;
        mr0 mr0Var2 = this.l;
        b78 b78Var = this.m;
        return "HalvesPizzaCartProductVO(name=" + str + ", imageUrl=" + str2 + ", price=" + hn6Var + ", count=" + i + ", maxCount=" + i2 + ", isInStop=" + z + ", cartItem=" + nq0Var + ", doughDescription=" + str3 + ", isGift=" + z2 + ", discount=" + v23Var + ", leftHalf=" + mr0Var + ", rightHalf=" + mr0Var2 + ", pizzaConcept=" + b78Var + ")";
    }
}
