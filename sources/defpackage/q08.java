package defpackage;

import kotlin.Metadata;
/* compiled from: DeepLinkData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lq08;", "Lvo2;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "personalOfferId", "Lh18;", "b", "Lh18;", "()Lh18;", "personalOffersSender", "<init>", "(Ljava/lang/String;Lh18;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: q08  reason: default package */
/* loaded from: classes3.dex */
public final class q08 extends vo2 {
    private final String a;
    private final h18 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q08(String str, h18 h18Var) {
        super(null);
        z65.h(h18Var, "personalOffersSender");
        this.a = str;
        this.b = h18Var;
    }

    public final String a() {
        return this.a;
    }

    public final h18 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q08)) {
            return false;
        }
        q08 q08Var = (q08) obj;
        if (z65.c(this.a, q08Var.a) && this.b == q08Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        h18 h18Var = this.b;
        return "PersonalOffersDeepLinkData(personalOfferId=" + str + ", personalOffersSender=" + h18Var + ")";
    }
}
