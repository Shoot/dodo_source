package defpackage;
/* renamed from: ka4  reason: default package */
/* loaded from: classes3.dex */
public class ka4 {
    private int a;
    private int b;

    public ka4(byte[] bArr) {
        this.a = 0;
        if (bArr.length == 4) {
            int d = or5.d(bArr);
            this.b = d;
            if (xe8.c(d)) {
                this.a = xe8.a(this.b);
                return;
            }
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        throw new IllegalArgumentException("byte array is not an encoded finite field");
    }

    private static String i(int i) {
        String str;
        if (i == 0) {
            return "0";
        }
        if (((byte) (i & 1)) == 1) {
            str = "1";
        } else {
            str = "";
        }
        int i2 = i >>> 1;
        int i3 = 1;
        while (i2 != 0) {
            if (((byte) (i2 & 1)) == 1) {
                str = str + "+x^" + i3;
            }
            i2 >>>= 1;
            i3++;
        }
        return str;
    }

    public int a(int i, int i2) {
        return i ^ i2;
    }

    public String b(int i) {
        StringBuilder sb;
        String str;
        String str2 = "";
        for (int i2 = 0; i2 < this.a; i2++) {
            if ((((byte) i) & 1) == 0) {
                sb = new StringBuilder();
                str = "0";
            } else {
                sb = new StringBuilder();
                str = "1";
            }
            sb.append(str);
            sb.append(str2);
            str2 = sb.toString();
            i >>>= 1;
        }
        return str2;
    }

    public int c(int i, int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = f(i);
            i2 = -i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 = h(i3, i);
            }
            i = h(i, i);
            i2 >>>= 1;
        }
        return i3;
    }

    public int d() {
        return this.a;
    }

    public byte[] e() {
        return or5.c(this.b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ka4)) {
            ka4 ka4Var = (ka4) obj;
            if (this.a == ka4Var.a && this.b == ka4Var.b) {
                return true;
            }
        }
        return false;
    }

    public int f(int i) {
        return c(i, (1 << this.a) - 2);
    }

    public boolean g(int i) {
        int i2 = this.a;
        if (i2 == 31) {
            if (i < 0) {
                return false;
            }
            return true;
        } else if (i < 0 || i >= (1 << i2)) {
            return false;
        } else {
            return true;
        }
    }

    public int h(int i, int i2) {
        return xe8.d(i, i2, this.b);
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.a + ") = GF(2)[X]/<" + i(this.b) + "> ";
    }
}
