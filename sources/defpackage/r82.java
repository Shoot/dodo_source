package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: r82  reason: default package */
/* loaded from: classes3.dex */
public class r82 implements x36 {
    private q82 a;
    private int b;
    private byte[] c = null;
    private byte[] d = null;
    private long e;

    public r82(int i) {
        this.a = new q82(i);
        this.b = i / 8;
    }

    private void a() {
        int byteLength = this.a.getByteLength() - ((int) (this.e % this.a.getByteLength()));
        if (byteLength < 13) {
            byteLength += this.a.getByteLength();
        }
        byte[] bArr = new byte[byteLength];
        bArr[0] = Byte.MIN_VALUE;
        mo7.v(this.e * 8, bArr, byteLength - 12);
        this.a.update(bArr, 0, byteLength);
    }

    private byte[] b(byte[] bArr) {
        int length = (((bArr.length + this.a.getByteLength()) - 1) / this.a.getByteLength()) * this.a.getByteLength();
        if (length - bArr.length < 13) {
            length += this.a.getByteLength();
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = Byte.MIN_VALUE;
        mo7.i(bArr.length * 8, bArr2, length - 12);
        return bArr2;
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        if (this.c != null) {
            if (bArr.length - i >= this.b) {
                a();
                q82 q82Var = this.a;
                byte[] bArr2 = this.d;
                q82Var.update(bArr2, 0, bArr2.length);
                this.e = 0L;
                int doFinal = this.a.doFinal(bArr, i);
                reset();
                return doFinal;
            }
            throw new OutputLengthException("Output buffer too short");
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return "DSTU7564Mac";
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return this.b;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) throws IllegalArgumentException {
        this.c = null;
        reset();
        if (v71Var instanceof lf5) {
            byte[] a = ((lf5) v71Var).a();
            this.d = new byte[a.length];
            this.c = b(a);
            int i = 0;
            while (true) {
                byte[] bArr = this.d;
                if (i < bArr.length) {
                    bArr[i] = (byte) (~a[i]);
                    i++;
                } else {
                    q82 q82Var = this.a;
                    byte[] bArr2 = this.c;
                    q82Var.update(bArr2, 0, bArr2.length);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Bad parameter passed");
        }
    }

    @Override // defpackage.x36
    public void reset() {
        this.e = 0L;
        this.a.reset();
        byte[] bArr = this.c;
        if (bArr != null) {
            this.a.update(bArr, 0, bArr.length);
        }
    }

    @Override // defpackage.x36
    public void update(byte b) throws IllegalStateException {
        this.a.update(b);
        this.e++;
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        if (bArr.length - i < i2) {
            throw new DataLengthException("Input buffer too short");
        }
        if (this.c != null) {
            this.a.update(bArr, i, i2);
            this.e += i2;
            return;
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}
