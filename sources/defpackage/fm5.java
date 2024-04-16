package defpackage;
/* renamed from: fm5  reason: default package */
/* loaded from: classes3.dex */
public class fm5 {
    private int a;
    private int b;
    private int c;
    private short[][][] d;
    private short[][][] e;
    private short[][] f;
    private short[] g;

    public fm5(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i = b & 255;
        this.a = i;
        int i2 = b2 & 255;
        this.b = i2;
        this.c = i2 - i;
        this.d = sArr;
        this.e = sArr2;
        this.f = sArr3;
        this.g = sArr4;
    }

    public short[][][] a() {
        return this.d;
    }

    public short[][][] b() {
        return this.e;
    }

    public short[] c() {
        return this.g;
    }

    public short[][] d() {
        return this.f;
    }

    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fm5)) {
            return false;
        }
        fm5 fm5Var = (fm5) obj;
        if (this.a != fm5Var.f() || this.b != fm5Var.g() || this.c != fm5Var.e() || !z39.k(this.d, fm5Var.a()) || !z39.k(this.e, fm5Var.b()) || !z39.j(this.f, fm5Var.d()) || !z39.i(this.g, fm5Var.c())) {
            return false;
        }
        return true;
    }

    public int f() {
        return this.a;
    }

    public int g() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((this.a * 37) + this.b) * 37) + this.c) * 37) + tr.N(this.d)) * 37) + tr.N(this.e)) * 37) + tr.M(this.f)) * 37) + tr.L(this.g);
    }
}
