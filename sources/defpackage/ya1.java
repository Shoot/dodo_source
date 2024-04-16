package defpackage;

import kotlin.Metadata;
/* compiled from: CoinsExpirationsFAQDialogFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lya1;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "baseExpirationsTimeInDays", "b", "extraExpirationPeriodInDays", "<init>", "(II)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ya1  reason: default package */
/* loaded from: classes2.dex */
public final class ya1 {
    private final int a;
    private final int b;

    public ya1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya1)) {
            return false;
        }
        ya1 ya1Var = (ya1) obj;
        if (this.a == ya1Var.a && this.b == ya1Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        return "CoinsExpirationsFAQData(baseExpirationsTimeInDays=" + i + ", extraExpirationPeriodInDays=" + i2 + ")";
    }
}
