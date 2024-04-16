package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CoinsExpirationsVO.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0017"}, d2 = {"Ldb1;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "coinsExpirationPeriodInDays", "b", c.a, "extraCoinsExpirationPeriodInDays", "", "Lxa1;", "Ljava/util/List;", "()Ljava/util/List;", "coinsExpirations", "<init>", "(IILjava/util/List;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: db1  reason: default package */
/* loaded from: classes2.dex */
public final class db1 {
    private final int a;
    private final int b;
    private final List<xa1> c;

    public db1(int i, int i2, List<xa1> list) {
        z65.h(list, "coinsExpirations");
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public final int a() {
        return this.a;
    }

    public final List<xa1> b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db1)) {
            return false;
        }
        db1 db1Var = (db1) obj;
        if (this.a == db1Var.a && this.b == db1Var.b && z65.c(this.c, db1Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        List<xa1> list = this.c;
        return "CoinsExpirationsVO(coinsExpirationPeriodInDays=" + i + ", extraCoinsExpirationPeriodInDays=" + i2 + ", coinsExpirations=" + list + ")";
    }
}
