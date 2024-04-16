package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: dp1  reason: default package */
/* loaded from: classes3.dex */
public class dp1 implements q03 {
    private e23 a;
    private byte[] b;
    private byte[] c;
    private int d;

    public dp1(e23 e23Var) {
        this.a = e23Var;
        this.d = e23Var.getDigestSize();
    }

    private void c(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    @Override // defpackage.q03
    public void a(r03 r03Var) {
        if (r03Var instanceof rd5) {
            rd5 rd5Var = (rd5) r03Var;
            this.b = rd5Var.b();
            this.c = rd5Var.a();
            return;
        }
        throw new IllegalArgumentException("KDF parameters required for generator");
    }

    @Override // defpackage.q03
    public int b(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3;
        int i4;
        if (bArr.length - i2 >= i) {
            byte[] bArr2 = new byte[this.d];
            byte[] bArr3 = new byte[4];
            this.a.reset();
            int i5 = 1;
            if (i2 > this.d) {
                i3 = 0;
                while (true) {
                    c(i5, bArr3);
                    this.a.update(bArr3, 0, 4);
                    e23 e23Var = this.a;
                    byte[] bArr4 = this.b;
                    e23Var.update(bArr4, 0, bArr4.length);
                    e23 e23Var2 = this.a;
                    byte[] bArr5 = this.c;
                    e23Var2.update(bArr5, 0, bArr5.length);
                    this.a.doFinal(bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i + i3, this.d);
                    int i6 = this.d;
                    i3 += i6;
                    i4 = i5 + 1;
                    if (i5 >= i2 / i6) {
                        break;
                    }
                    i5 = i4;
                }
                i5 = i4;
            } else {
                i3 = 0;
            }
            if (i3 < i2) {
                c(i5, bArr3);
                this.a.update(bArr3, 0, 4);
                e23 e23Var3 = this.a;
                byte[] bArr6 = this.b;
                e23Var3.update(bArr6, 0, bArr6.length);
                e23 e23Var4 = this.a;
                byte[] bArr7 = this.c;
                e23Var4.update(bArr7, 0, bArr7.length);
                this.a.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i + i3, i2 - i3);
            }
            return i2;
        }
        throw new OutputLengthException("output buffer too small");
    }
}
