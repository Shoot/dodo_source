package defpackage;

import java.math.BigInteger;
/* renamed from: la3  reason: default package */
/* loaded from: classes3.dex */
public class la3 implements da3 {
    private final ea3 g;
    private final byte[] h;
    private final jb3 i;
    private final BigInteger j;
    private final BigInteger k;
    private BigInteger l;

    public la3(ea3 ea3Var, jb3 jb3Var, BigInteger bigInteger, BigInteger bigInteger2) {
        this(ea3Var, jb3Var, bigInteger, bigInteger2, null);
    }

    static jb3 h(ea3 ea3Var, jb3 jb3Var) {
        if (jb3Var != null) {
            jb3 A = ca3.k(ea3Var, jb3Var).A();
            if (!A.u()) {
                if (A.w()) {
                    return A;
                }
                throw new IllegalArgumentException("Point not on curve");
            }
            throw new IllegalArgumentException("Point at infinity");
        }
        throw new NullPointerException("Point cannot be null");
    }

    public ea3 a() {
        return this.g;
    }

    public jb3 b() {
        return this.i;
    }

    public BigInteger c() {
        return this.k;
    }

    public synchronized BigInteger d() {
        try {
            if (this.l == null) {
                this.l = db0.k(this.j, this.k);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public BigInteger e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la3)) {
            return false;
        }
        la3 la3Var = (la3) obj;
        if (this.g.l(la3Var.g) && this.i.e(la3Var.i) && this.j.equals(la3Var.j)) {
            return true;
        }
        return false;
    }

    public byte[] f() {
        return tr.h(this.h);
    }

    public BigInteger g(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.compareTo(da3.b) >= 0 && bigInteger.compareTo(e()) < 0) {
                return bigInteger;
            }
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        throw new NullPointerException("Scalar cannot be null");
    }

    public int hashCode() {
        return ((((this.g.hashCode() ^ 1028) * 257) ^ this.i.hashCode()) * 257) ^ this.j.hashCode();
    }

    public jb3 i(jb3 jb3Var) {
        return h(a(), jb3Var);
    }

    public la3(ea3 ea3Var, jb3 jb3Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.l = null;
        if (ea3Var == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.g = ea3Var;
        this.i = h(ea3Var, jb3Var);
        this.j = bigInteger;
        this.k = bigInteger2;
        this.h = tr.h(bArr);
    }

    public la3(iac iacVar) {
        this(iacVar.t(), iacVar.u(), iacVar.x(), iacVar.v(), iacVar.z());
    }
}
