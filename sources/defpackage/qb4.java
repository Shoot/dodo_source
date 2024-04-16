package defpackage;

import java.math.BigInteger;
/* renamed from: qb4  reason: default package */
/* loaded from: classes3.dex */
public class qb4 {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;

    public qb4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.a = bigInteger;
        this.b = bigInteger2;
        this.c = bigInteger3;
    }

    public BigInteger a() {
        return this.c;
    }

    public BigInteger b() {
        return this.a;
    }

    public BigInteger c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qb4)) {
            return false;
        }
        qb4 qb4Var = (qb4) obj;
        if (!this.c.equals(qb4Var.c) || !this.a.equals(qb4Var.a) || !this.b.equals(qb4Var.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.c.hashCode() ^ this.a.hashCode()) ^ this.b.hashCode();
    }
}
