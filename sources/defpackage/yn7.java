package defpackage;
/* renamed from: yn7  reason: default package */
/* loaded from: classes3.dex */
public class yn7 extends ym7 {
    private e23 d;

    public yn7(e23 e23Var) {
        this.d = e23Var;
    }

    private byte[] h() {
        int digestSize = this.d.getDigestSize();
        byte[] bArr = new byte[digestSize];
        e23 e23Var = this.d;
        byte[] bArr2 = this.a;
        e23Var.update(bArr2, 0, bArr2.length);
        e23 e23Var2 = this.d;
        byte[] bArr3 = this.b;
        e23Var2.update(bArr3, 0, bArr3.length);
        this.d.doFinal(bArr, 0);
        for (int i = 1; i < this.c; i++) {
            this.d.update(bArr, 0, digestSize);
            this.d.doFinal(bArr, 0);
        }
        return bArr;
    }

    @Override // defpackage.ym7
    public v71 d(int i) {
        return e(i);
    }

    @Override // defpackage.ym7
    public v71 e(int i) {
        int i2 = i / 8;
        if (i2 <= this.d.getDigestSize()) {
            return new lf5(h(), 0, i2);
        }
        throw new IllegalArgumentException("Can't generate a derived key " + i2 + " bytes long.");
    }

    @Override // defpackage.ym7
    public v71 f(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        if (i5 <= this.d.getDigestSize()) {
            byte[] h = h();
            return new pq7(new lf5(h, 0, i3), h, i3, i4);
        }
        throw new IllegalArgumentException("Can't generate a derived key " + i5 + " bytes long.");
    }
}
