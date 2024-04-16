package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: DeepLinkData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0017"}, d2 = {"Lsp8;", "Lvo2;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcq8;", "a", "Lcq8;", c.a, "()Lcq8;", "sender", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "promoCodeValue", "promoCodeMessage", "<init>", "(Lcq8;Ljava/lang/String;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: sp8  reason: default package */
/* loaded from: classes3.dex */
public final class sp8 extends vo2 {
    private final cq8 a;
    private final String b;
    private final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp8(cq8 cq8Var, String str, String str2) {
        super(null);
        z65.h(cq8Var, "sender");
        z65.h(str, "promoCodeValue");
        z65.h(str2, "promoCodeMessage");
        this.a = cq8Var;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final cq8 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp8)) {
            return false;
        }
        sp8 sp8Var = (sp8) obj;
        if (this.a == sp8Var.a && z65.c(this.b, sp8Var.b) && z65.c(this.c, sp8Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        cq8 cq8Var = this.a;
        String str = this.b;
        String str2 = this.c;
        return "PromoCodeDeepLinkData(sender=" + cq8Var + ", promoCodeValue=" + str + ", promoCodeMessage=" + str2 + ")";
    }
}
