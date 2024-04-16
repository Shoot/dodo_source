package defpackage;
/* renamed from: wy7  reason: default package */
/* loaded from: classes3.dex */
public class wy7 {
    private int[] a;

    public wy7(byte[] bArr) {
        if (bArr.length > 4) {
            int e = or5.e(bArr, 0);
            int a = d65.a(e - 1);
            if (bArr.length == (e * a) + 4) {
                this.a = new int[e];
                for (int i = 0; i < e; i++) {
                    this.a[i] = or5.f(bArr, (i * a) + 4, a);
                }
                if (b(this.a)) {
                    return;
                }
                throw new IllegalArgumentException("invalid encoding");
            }
            throw new IllegalArgumentException("invalid encoding");
        }
        throw new IllegalArgumentException("invalid encoding");
    }

    private boolean b(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i : iArr) {
            if (i < 0 || i >= length || zArr[i]) {
                return false;
            }
            zArr[i] = true;
        }
        return true;
    }

    public byte[] a() {
        int length = this.a.length;
        int a = d65.a(length - 1);
        byte[] bArr = new byte[(length * a) + 4];
        or5.a(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            or5.b(this.a[i], bArr, (i * a) + 4, a);
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wy7)) {
            return false;
        }
        return b65.b(this.a, ((wy7) obj).a);
    }

    public int hashCode() {
        return tr.I(this.a);
    }

    public String toString() {
        String str = "[" + this.a[0];
        for (int i = 1; i < this.a.length; i++) {
            str = str + ", " + this.a[i];
        }
        return str + "]";
    }
}
