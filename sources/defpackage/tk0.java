package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: tk0  reason: default package */
/* loaded from: classes3.dex */
public class tk0 implements xc0 {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int d;
    private xc0 e;
    private boolean f;

    public tk0(xc0 xc0Var) {
        this.e = xc0Var;
        int a = xc0Var.a();
        this.d = a;
        this.a = new byte[a];
        this.b = new byte[a];
        this.c = new byte[a];
    }

    private int c(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3 = this.d;
        if (i + i3 <= bArr.length) {
            System.arraycopy(bArr, i, this.c, 0, i3);
            int b = this.e.b(bArr, i, bArr2, i2);
            for (int i4 = 0; i4 < this.d; i4++) {
                int i5 = i2 + i4;
                bArr2[i5] = (byte) (bArr2[i5] ^ this.b[i4]);
            }
            byte[] bArr3 = this.b;
            this.b = this.c;
            this.c = bArr3;
            return b;
        }
        throw new DataLengthException("input buffer too short");
    }

    private int d(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.d + i <= bArr.length) {
            for (int i3 = 0; i3 < this.d; i3++) {
                byte[] bArr3 = this.b;
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
            }
            int b = this.e.b(this.b, 0, bArr2, i2);
            byte[] bArr4 = this.b;
            System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
            return b;
        }
        throw new DataLengthException("input buffer too short");
    }

    @Override // defpackage.xc0
    public int a() {
        return this.e.a();
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.f) {
            return d(bArr, i, bArr2, i2);
        }
        return c(bArr, i, bArr2, i2);
    }

    public xc0 e() {
        return this.e;
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return this.e.getAlgorithmName() + "/CBC";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        xc0 xc0Var;
        boolean z2 = this.f;
        this.f = z;
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a = pq7Var.a();
            if (a.length == this.d) {
                System.arraycopy(a, 0, this.a, 0, a.length);
                reset();
                if (pq7Var.b() != null) {
                    xc0Var = this.e;
                    v71Var = pq7Var.b();
                } else if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                } else {
                    return;
                }
            } else {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
        } else {
            reset();
            if (v71Var != null) {
                xc0Var = this.e;
            } else if (z2 == z) {
                return;
            } else {
                throw new IllegalArgumentException("cannot change encrypting state without providing key.");
            }
        }
        xc0Var.init(z, v71Var);
    }

    @Override // defpackage.xc0
    public void reset() {
        byte[] bArr = this.a;
        System.arraycopy(bArr, 0, this.b, 0, bArr.length);
        tr.y(this.c, (byte) 0);
        this.e.reset();
    }
}
