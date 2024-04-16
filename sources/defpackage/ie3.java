package defpackage;

import java.math.BigInteger;
/* renamed from: ie3  reason: default package */
/* loaded from: classes3.dex */
public class ie3 implements v71 {
    private BigInteger a;
    private BigInteger b;
    private int c;

    public ie3(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public BigInteger a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public BigInteger c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ie3)) {
            return false;
        }
        ie3 ie3Var = (ie3) obj;
        if (!ie3Var.c().equals(this.b) || !ie3Var.a().equals(this.a) || ie3Var.b() != this.c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (c().hashCode() ^ a().hashCode()) + this.c;
    }

    public ie3(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.a = bigInteger2;
        this.b = bigInteger;
        this.c = i;
    }
}
