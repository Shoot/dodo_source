package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LoyaltyProductCategory.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006!"}, d2 = {"La26;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "b", c.a, Action.NAME_ATTRIBUTE, "Ltl8;", "Ltl8;", "()Ltl8;", ElementGenerator.TYPE_IMAGE, "", DateTokenConverter.CONVERTER_KEY, "D", "()D", "price", "", "Ly16;", e.a, "Ljava/util/List;", "()Ljava/util/List;", "products", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ltl8;DLjava/util/List;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: a26  reason: default package */
/* loaded from: classes4.dex */
public final class a26 {
    private final String a;
    private final String b;
    private final tl8 c;
    private final double d;
    private final List<y16> e;

    public a26(String str, String str2, tl8 tl8Var, double d, List<y16> list) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(tl8Var, ElementGenerator.TYPE_IMAGE);
        z65.h(list, "products");
        this.a = str;
        this.b = str2;
        this.c = tl8Var;
        this.d = d;
        this.e = list;
    }

    public final String a() {
        return this.a;
    }

    public final tl8 b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final double d() {
        return this.d;
    }

    public final List<y16> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a26)) {
            return false;
        }
        a26 a26Var = (a26) obj;
        if (z65.c(this.a, a26Var.a) && z65.c(this.b, a26Var.b) && z65.c(this.c, a26Var.c) && Double.compare(this.d, a26Var.d) == 0 && z65.c(this.e, a26Var.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + nkb.a(this.d)) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        tl8 tl8Var = this.c;
        double d = this.d;
        List<y16> list = this.e;
        return "LoyaltyProductCategory(id=" + str + ", name=" + str2 + ", image=" + tl8Var + ", price=" + d + ", products=" + list + ")";
    }
}
