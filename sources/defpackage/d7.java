package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AddressComponentVO.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b5\u00106Jm\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010&\"\u0004\b'\u0010(R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b$\u0010&\"\u0004\b*\u0010(R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001f\u001a\u0004\b)\u0010!\"\u0004\b4\u0010#¨\u00067"}, d2 = {"Ld7;", "", "", "id", "title", "value", "", "isRequired", "", "maxLength", BonusActionEntity.ORDER, "Lc7;", "size", "isLast", "isEnabled", "showError", "a", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "b", Image.TYPE_HIGH, "t", "(Ljava/lang/String;)V", "i", "u", DateTokenConverter.CONVERTER_KEY, "Z", "l", "()Z", "q", "(Z)V", e.a, "I", "()I", "o", "(I)V", "f", "p", "g", "Lc7;", "()Lc7;", Image.TYPE_SMALL, "(Lc7;)V", "k", "n", "j", Image.TYPE_MEDIUM, "r", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILc7;ZZZ)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d7  reason: default package */
/* loaded from: classes2.dex */
public final class d7 {
    private final String a;
    private String b;
    private String c;
    private boolean d;
    private int e;
    private int f;
    private c7 g;
    private boolean h;
    private boolean i;
    private boolean j;

    public d7(String str, String str2, String str3, boolean z, int i, int i2, c7 c7Var, boolean z2, boolean z3, boolean z4) {
        z65.h(str, "id");
        z65.h(str2, "title");
        z65.h(str3, "value");
        z65.h(c7Var, "size");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = c7Var;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public final d7 a(String str, String str2, String str3, boolean z, int i, int i2, c7 c7Var, boolean z2, boolean z3, boolean z4) {
        z65.h(str, "id");
        z65.h(str2, "title");
        z65.h(str3, "value");
        z65.h(c7Var, "size");
        return new d7(str, str2, str3, z, i, i2, c7Var, z2, z3, z4);
    }

    public final String c() {
        return this.a;
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        if (z65.c(this.a, d7Var.a) && z65.c(this.b, d7Var.b) && z65.c(this.c, d7Var.c) && this.d == d7Var.d && this.e == d7Var.e && this.f == d7Var.f && this.g == d7Var.g && this.h == d7Var.h && this.i == d7Var.i && this.j == d7Var.j) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.j;
    }

    public final c7 g() {
        return this.g;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a91.a(this.d)) * 31) + this.e) * 31) + this.f) * 31) + this.g.hashCode()) * 31) + a91.a(this.h)) * 31) + a91.a(this.i)) * 31) + a91.a(this.j);
    }

    public final String i() {
        return this.c;
    }

    public final boolean j() {
        return this.i;
    }

    public final boolean k() {
        return this.h;
    }

    public final boolean l() {
        return this.d;
    }

    public final void m(boolean z) {
        this.i = z;
    }

    public final void n(boolean z) {
        this.h = z;
    }

    public final void o(int i) {
        this.e = i;
    }

    public final void p(int i) {
        this.f = i;
    }

    public final void q(boolean z) {
        this.d = z;
    }

    public final void r(boolean z) {
        this.j = z;
    }

    public final void s(c7 c7Var) {
        z65.h(c7Var, "<set-?>");
        this.g = c7Var;
    }

    public final void t(String str) {
        z65.h(str, "<set-?>");
        this.b = str;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        boolean z = this.d;
        int i = this.e;
        int i2 = this.f;
        c7 c7Var = this.g;
        boolean z2 = this.h;
        boolean z3 = this.i;
        boolean z4 = this.j;
        return "AddressComponentVO(id=" + str + ", title=" + str2 + ", value=" + str3 + ", isRequired=" + z + ", maxLength=" + i + ", order=" + i2 + ", size=" + c7Var + ", isLast=" + z2 + ", isEnabled=" + z3 + ", showError=" + z4 + ")";
    }

    public final void u(String str) {
        z65.h(str, "<set-?>");
        this.c = str;
    }

    public /* synthetic */ d7(String str, String str2, String str3, boolean z, int i, int i2, c7 c7Var, boolean z2, boolean z3, boolean z4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? "" : str3, z, i, i2, c7Var, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? true : z3, (i3 & 512) != 0 ? false : z4);
    }
}
