package defpackage;
/* renamed from: zn7  reason: default package */
/* loaded from: classes3.dex */
public class zn7 extends ym7 {
    private x36 d;
    private byte[] e;

    public zn7(e23 e23Var) {
        qj4 qj4Var = new qj4(e23Var);
        this.d = qj4Var;
        this.e = new byte[qj4Var.getMacSize()];
    }

    private void h(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2) {
        if (i != 0) {
            if (bArr != null) {
                this.d.update(bArr, 0, bArr.length);
            }
            this.d.update(bArr2, 0, bArr2.length);
            this.d.doFinal(this.e, 0);
            byte[] bArr4 = this.e;
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            for (int i3 = 1; i3 < i; i3++) {
                x36 x36Var = this.d;
                byte[] bArr5 = this.e;
                x36Var.update(bArr5, 0, bArr5.length);
                this.d.doFinal(this.e, 0);
                int i4 = 0;
                while (true) {
                    byte[] bArr6 = this.e;
                    if (i4 != bArr6.length) {
                        int i5 = i2 + i4;
                        bArr3[i5] = (byte) (bArr6[i4] ^ bArr3[i5]);
                        i4++;
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("iteration count must be at least 1.");
    }

    private byte[] i(int i) {
        int i2;
        int macSize = this.d.getMacSize();
        int i3 = ((i + macSize) - 1) / macSize;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i3 * macSize];
        this.d.init(new lf5(this.a));
        int i4 = 0;
        for (int i5 = 1; i5 <= i3; i5++) {
            while (true) {
                byte b = (byte) (bArr[i2] + 1);
                bArr[i2] = b;
                i2 = b == 0 ? i2 - 1 : 3;
            }
            h(this.b, this.c, bArr, bArr2, i4);
            i4 += macSize;
        }
        return bArr2;
    }

    @Override // defpackage.ym7
    public v71 d(int i) {
        return e(i);
    }

    @Override // defpackage.ym7
    public v71 e(int i) {
        int i2 = i / 8;
        return new lf5(i(i2), 0, i2);
    }

    @Override // defpackage.ym7
    public v71 f(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] i5 = i(i3 + i4);
        return new pq7(new lf5(i5, 0, i3), i5, i3, i4);
    }
}
