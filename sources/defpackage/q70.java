package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: q70  reason: default package */
/* loaded from: classes3.dex */
public class q70 implements q03 {
    private int a;
    private e23 b;
    private byte[] c;
    private byte[] d;

    /* JADX INFO: Access modifiers changed from: protected */
    public q70(int i, e23 e23Var) {
        this.a = i;
        this.b = e23Var;
    }

    @Override // defpackage.q03
    public void a(r03 r03Var) {
        if (r03Var instanceof rd5) {
            rd5 rd5Var = (rd5) r03Var;
            this.c = rd5Var.b();
            this.d = rd5Var.a();
        } else if (r03Var instanceof ts4) {
            this.c = ((ts4) r03Var).a();
            this.d = null;
        } else {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
    }

    @Override // defpackage.q03
    public int b(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = i2;
        int i4 = i;
        if (bArr.length - i3 >= i4) {
            long j = i3;
            int digestSize = this.b.getDigestSize();
            if (j <= 8589934591L) {
                long j2 = digestSize;
                int i5 = (int) (((j + j2) - 1) / j2);
                byte[] bArr2 = new byte[this.b.getDigestSize()];
                byte[] bArr3 = new byte[4];
                mo7.f(this.a, bArr3, 0);
                int i6 = this.a & (-256);
                for (int i7 = 0; i7 < i5; i7++) {
                    e23 e23Var = this.b;
                    byte[] bArr4 = this.c;
                    e23Var.update(bArr4, 0, bArr4.length);
                    this.b.update(bArr3, 0, 4);
                    byte[] bArr5 = this.d;
                    if (bArr5 != null) {
                        this.b.update(bArr5, 0, bArr5.length);
                    }
                    this.b.doFinal(bArr2, 0);
                    if (i3 > digestSize) {
                        System.arraycopy(bArr2, 0, bArr, i4, digestSize);
                        i4 += digestSize;
                        i3 -= digestSize;
                    } else {
                        System.arraycopy(bArr2, 0, bArr, i4, i3);
                    }
                    byte b = (byte) (bArr3[3] + 1);
                    bArr3[3] = b;
                    if (b == 0) {
                        i6 += 256;
                        mo7.f(i6, bArr3, 0);
                    }
                }
                this.b.reset();
                return (int) j;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new OutputLengthException("output buffer too small");
    }
}
