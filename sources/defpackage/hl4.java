package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: HalvesInfoVO.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\t\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b \u0010\fR\u0017\u0010%\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001b\u0010$¨\u0006("}, d2 = {"Lhl4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lm78;", "b", "Lm78;", c.a, "()Lm78;", "firstHalf", "g", "secondHalf", "Lhn6;", "Lhn6;", "f", "()Lhn6;", "price", e.a, "I", "()I", "doughId", "doughName", Image.TYPE_HIGH, "variationInfo", "Lb78;", "Lb78;", "()Lb78;", "pizzaConcept", "<init>", "(Ljava/lang/String;Lm78;Lm78;Lhn6;ILjava/lang/String;Ljava/lang/String;Lb78;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: hl4  reason: default package */
/* loaded from: classes4.dex */
public final class hl4 {
    private final String a;
    private final m78 b;
    private final m78 c;
    private final hn6 d;
    private final int e;
    private final String f;
    private final String g;
    private final b78 h;

    public hl4(String str, m78 m78Var, m78 m78Var2, hn6 hn6Var, int i, String str2, String str3, b78 b78Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(m78Var, "firstHalf");
        z65.h(m78Var2, "secondHalf");
        z65.h(hn6Var, "price");
        z65.h(str2, "doughName");
        z65.h(str3, "variationInfo");
        z65.h(b78Var, "pizzaConcept");
        this.a = str;
        this.b = m78Var;
        this.c = m78Var2;
        this.d = hn6Var;
        this.e = i;
        this.f = str2;
        this.g = str3;
        this.h = b78Var;
    }

    public final int a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    public final m78 c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final b78 e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl4)) {
            return false;
        }
        hl4 hl4Var = (hl4) obj;
        if (z65.c(this.a, hl4Var.a) && z65.c(this.b, hl4Var.b) && z65.c(this.c, hl4Var.c) && z65.c(this.d, hl4Var.d) && this.e == hl4Var.e && z65.c(this.f, hl4Var.f) && z65.c(this.g, hl4Var.g) && this.h == hl4Var.h) {
            return true;
        }
        return false;
    }

    public final hn6 f() {
        return this.d;
    }

    public final m78 g() {
        return this.c;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        String str = this.a;
        m78 m78Var = this.b;
        m78 m78Var2 = this.c;
        hn6 hn6Var = this.d;
        int i = this.e;
        String str2 = this.f;
        String str3 = this.g;
        b78 b78Var = this.h;
        return "HalvesInfoVO(name=" + str + ", firstHalf=" + m78Var + ", secondHalf=" + m78Var2 + ", price=" + hn6Var + ", doughId=" + i + ", doughName=" + str2 + ", variationInfo=" + str3 + ", pizzaConcept=" + b78Var + ")";
    }
}
