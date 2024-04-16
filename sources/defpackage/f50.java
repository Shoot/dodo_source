package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import org.bouncycastle.asn1.q0;
/* renamed from: f50  reason: default package */
/* loaded from: classes3.dex */
public class f50 implements PrivateKey {
    private short[][] a;
    private short[] b;
    private short[][] c;
    private short[] d;
    private fm5[] e;
    private int[] f;

    public f50(w39 w39Var) {
        this(w39Var.c(), w39Var.a(), w39Var.d(), w39Var.b(), w39Var.f(), w39Var.e());
    }

    public short[] a() {
        return this.b;
    }

    public short[] b() {
        return this.d;
    }

    public short[][] c() {
        return this.a;
    }

    public short[][] d() {
        return this.c;
    }

    public fm5[] e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (obj == null || !(obj instanceof f50)) {
            return false;
        }
        f50 f50Var = (f50) obj;
        if (z39.j(this.a, f50Var.c()) && z39.j(this.c, f50Var.d()) && z39.i(this.b, f50Var.a()) && z39.i(this.d, f50Var.b()) && Arrays.equals(this.f, f50Var.f())) {
            z = true;
        } else {
            z = false;
        }
        if (this.e.length != f50Var.e().length) {
            return false;
        }
        for (int length = this.e.length - 1; length >= 0; length--) {
            z &= this.e[length].equals(f50Var.e()[length]);
        }
        return z;
    }

    public int[] f() {
        return this.f;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new dk8(new eb(ko7.a, q0.a), new v39(this.a, this.b, this.c, this.d, this.f, this.e)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int length = (((((((((this.e.length * 37) + tr.M(this.a)) * 37) + tr.L(this.b)) * 37) + tr.M(this.c)) * 37) + tr.L(this.d)) * 37) + tr.I(this.f);
        for (int length2 = this.e.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.e[length2].hashCode();
        }
        return length;
    }

    public f50(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, fm5[] fm5VarArr) {
        this.a = sArr;
        this.b = sArr2;
        this.c = sArr3;
        this.d = sArr4;
        this.f = iArr;
        this.e = fm5VarArr;
    }
}
