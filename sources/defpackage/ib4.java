package defpackage;

import java.math.BigInteger;
/* renamed from: ib4  reason: default package */
/* loaded from: classes3.dex */
public class ib4 implements v71 {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private ub4 d;

    public ib4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
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
        if (!(obj instanceof ib4)) {
            return false;
        }
        ib4 ib4Var = (ib4) obj;
        if (!ib4Var.b().equals(this.a) || !ib4Var.c().equals(this.b) || !ib4Var.a().equals(this.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ this.c.hashCode();
    }

    public ib4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, ub4 ub4Var) {
        this.c = bigInteger3;
        this.a = bigInteger;
        this.b = bigInteger2;
        this.d = ub4Var;
    }
}
