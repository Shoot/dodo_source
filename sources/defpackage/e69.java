package defpackage;

import kotlin.Metadata;
/* compiled from: DeepLinkData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Le69;", "Lvo2;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "orderId", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "ratingValue", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: e69  reason: default package */
/* loaded from: classes3.dex */
public final class e69 extends vo2 {
    private final String a;
    private final Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e69(String str, Integer num) {
        super(null);
        z65.h(str, "orderId");
        this.a = str;
        this.b = num;
    }

    public final String a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e69)) {
            return false;
        }
        e69 e69Var = (e69) obj;
        if (z65.c(this.a, e69Var.a) && z65.c(this.b, e69Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.a;
        Integer num = this.b;
        return "RatingDeepLinkData(orderId=" + str + ", ratingValue=" + num + ")";
    }
}
