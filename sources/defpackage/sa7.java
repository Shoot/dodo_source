package defpackage;
/* renamed from: sa7  reason: default package */
/* loaded from: classes3.dex */
public class sa7 extends ym7 {
    private final e23 d;

    public sa7() {
        this(f23.a());
    }

    private byte[] h(int i) {
        int i2;
        int digestSize = this.d.getDigestSize();
        byte[] bArr = new byte[digestSize];
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        while (true) {
            e23 e23Var = this.d;
            byte[] bArr3 = this.a;
            e23Var.update(bArr3, 0, bArr3.length);
            e23 e23Var2 = this.d;
            byte[] bArr4 = this.b;
            e23Var2.update(bArr4, 0, bArr4.length);
            this.d.doFinal(bArr, 0);
            if (i > digestSize) {
                i2 = digestSize;
            } else {
                i2 = i;
            }
            System.arraycopy(bArr, 0, bArr2, i3, i2);
            i3 += i2;
            i -= i2;
            if (i == 0) {
                return bArr2;
            }
            this.d.reset();
            this.d.update(bArr, 0, digestSize);
        }
    }

    @Override // defpackage.ym7
    public v71 d(int i) {
        return e(i);
    }

    @Override // defpackage.ym7
    public v71 e(int i) {
        int i2 = i / 8;
        return new lf5(h(i2), 0, i2);
    }

    @Override // defpackage.ym7
    public v71 f(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] h = h(i3 + i4);
        return new pq7(new lf5(h, 0, i3), h, i3, i4);
    }

    public void i(byte[] bArr, byte[] bArr2) {
        super.g(bArr, bArr2, 1);
    }

    public sa7(e23 e23Var) {
        this.d = e23Var;
    }
}
