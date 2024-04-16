package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.Currency;
import kotlin.Metadata;
/* compiled from: AnalyticsEvent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Li2b;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "D", "()D", "amount", "Ljava/util/Currency;", "b", "Ljava/util/Currency;", "()Ljava/util/Currency;", "currency", "<init>", "(DLjava/util/Currency;)V", "analytics-core"}, k = 1, mv = {1, 7, 1})
/* renamed from: i2b  reason: default package */
/* loaded from: classes.dex */
public final class i2b {
    private final double a;
    private final Currency b;

    public i2b(double d, Currency currency) {
        z65.h(currency, "currency");
        this.a = d;
        this.b = currency;
    }

    public final double a() {
        return this.a;
    }

    public final Currency b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2b)) {
            return false;
        }
        i2b i2bVar = (i2b) obj;
        if (Double.compare(this.a, i2bVar.a) == 0 && z65.c(this.b, i2bVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (nkb.a(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Sum(amount=" + this.a + ", currency=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
