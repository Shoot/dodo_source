package defpackage;

import java.security.PublicKey;
import org.bouncycastle.asn1.q0;
/* renamed from: g50  reason: default package */
/* loaded from: classes3.dex */
public class g50 implements PublicKey {
    private short[][] a;
    private short[][] b;
    private short[] c;
    private int d;

    public g50(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.d = i;
        this.a = sArr;
        this.b = sArr2;
        this.c = sArr3;
    }

    public short[][] a() {
        return this.a;
    }

    public short[] b() {
        return tr.n(this.c);
    }

    public short[][] c() {
        short[][] sArr = new short[this.b.length];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.b;
            if (i != sArr2.length) {
                sArr[i] = tr.n(sArr2[i]);
                i++;
            } else {
                return sArr;
            }
        }
    }

    public int d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof g50)) {
            return false;
        }
        g50 g50Var = (g50) obj;
        if (this.d != g50Var.d() || !z39.j(this.a, g50Var.a()) || !z39.j(this.b, g50Var.c()) || !z39.i(this.c, g50Var.b())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return ag5.a(new eb(ko7.a, q0.a), new x39(this.d, this.a, this.b, this.c));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.d * 37) + tr.M(this.a)) * 37) + tr.M(this.b)) * 37) + tr.L(this.c);
    }

    public g50(y39 y39Var) {
        this(y39Var.d(), y39Var.a(), y39Var.c(), y39Var.b());
    }
}
