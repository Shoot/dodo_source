package defpackage;

import kotlin.Metadata;
/* compiled from: CoinExpiration.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lwa1;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "expirationDateTimeUtc", "", "D", "()D", "expirationAmount", "<init>", "(Ljava/lang/String;D)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wa1  reason: default package */
/* loaded from: classes4.dex */
public final class wa1 {
    private final String a;
    private final double b;

    public wa1(String str, double d) {
        z65.h(str, "expirationDateTimeUtc");
        this.a = str;
        this.b = d;
    }

    public final double a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa1)) {
            return false;
        }
        wa1 wa1Var = (wa1) obj;
        if (z65.c(this.a, wa1Var.a) && Double.compare(this.b, wa1Var.b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + nkb.a(this.b);
    }

    public String toString() {
        String str = this.a;
        double d = this.b;
        return "CoinExpiration(expirationDateTimeUtc=" + str + ", expirationAmount=" + d + ")";
    }
}
