package defpackage;

import java.math.BigInteger;
/* renamed from: b82  reason: default package */
/* loaded from: classes3.dex */
public class b82 implements v71 {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private g82 d;

    public b82(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
    }

    public BigInteger a() {
        return this.a;
    }

    public BigInteger b() {
        return this.c;
    }

    public BigInteger c() {
        return this.b;
    }

    public g82 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b82)) {
            return false;
        }
        b82 b82Var = (b82) obj;
        if (!b82Var.b().equals(this.c) || !b82Var.c().equals(this.b) || !b82Var.a().equals(this.a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (b().hashCode() ^ c().hashCode()) ^ a().hashCode();
    }

    public b82(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, g82 g82Var) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = g82Var;
    }
}
