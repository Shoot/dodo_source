package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: DeepLinkData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0017"}, d2 = {"Lpl8;", "Lvo2;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lv27;", "a", "Lv27;", c.a, "()Lv27;", "sender", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "menuItemId", "selectedProducts", "<init>", "(Lv27;Ljava/lang/String;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: pl8  reason: default package */
/* loaded from: classes3.dex */
public final class pl8 extends vo2 {
    private final v27 a;
    private final String b;
    private final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl8(v27 v27Var, String str, String str2) {
        super(null);
        z65.h(v27Var, "sender");
        z65.h(str, "menuItemId");
        z65.h(str2, "selectedProducts");
        this.a = v27Var;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final v27 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl8)) {
            return false;
        }
        pl8 pl8Var = (pl8) obj;
        if (this.a == pl8Var.a && z65.c(this.b, pl8Var.b) && z65.c(this.c, pl8Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        v27 v27Var = this.a;
        String str = this.b;
        String str2 = this.c;
        return "ProductDeepLinkData(sender=" + v27Var + ", menuItemId=" + str + ", selectedProducts=" + str2 + ")";
    }
}
