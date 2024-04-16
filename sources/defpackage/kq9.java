package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: kq9  reason: default package */
/* loaded from: classes3.dex */
public class kq9 extends qya implements rya {
    private final xc0 b;
    private final int c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private int g;

    public kq9(xc0 xc0Var) {
        super(xc0Var);
        this.b = xc0Var;
        int a = xc0Var.a();
        this.c = a;
        this.d = new byte[a];
        this.e = new byte[a];
        this.f = new byte[a];
        this.g = 0;
    }

    private void e() {
        byte b;
        int length = this.e.length;
        do {
            length--;
            if (length < 0) {
                break;
            }
            byte[] bArr = this.e;
            b = (byte) (bArr[length] + 1);
            bArr[length] = b;
        } while (b == 0);
        byte[] bArr2 = this.d;
        if (length < bArr2.length && bArr2.length < this.c) {
            throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
        }
    }

    @Override // defpackage.xc0
    public int a() {
        return this.b.a();
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.g != 0) {
            processBytes(bArr, i, this.c, bArr2, i2);
        } else {
            int i3 = this.c;
            if (i + i3 <= bArr.length) {
                if (i3 + i2 <= bArr2.length) {
                    this.b.b(this.e, 0, this.f, 0);
                    for (int i4 = 0; i4 < this.c; i4++) {
                        bArr2[i2 + i4] = (byte) (bArr[i + i4] ^ this.f[i4]);
                    }
                    e();
                } else {
                    throw new OutputLengthException("output buffer too short");
                }
            } else {
                throw new DataLengthException("input buffer too small");
            }
        }
        return this.c;
    }

    @Override // defpackage.qya
    protected byte c(byte b) throws DataLengthException, IllegalStateException {
        int i = this.g;
        if (i == 0) {
            this.b.b(this.e, 0, this.f, 0);
            byte[] bArr = this.f;
            int i2 = this.g;
            this.g = i2 + 1;
            return (byte) (b ^ bArr[i2]);
        }
        byte[] bArr2 = this.f;
        int i3 = i + 1;
        this.g = i3;
        byte b2 = (byte) (b ^ bArr2[i]);
        if (i3 == this.e.length) {
            this.g = 0;
            e();
        }
        return b2;
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return this.b.getAlgorithmName() + "/SIC";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] h = tr.h(pq7Var.a());
            this.d = h;
            int i = this.c;
            if (i >= h.length) {
                int i2 = 8;
                if (8 > i / 2) {
                    i2 = i / 2;
                }
                if (i - h.length <= i2) {
                    if (pq7Var.b() != null) {
                        this.b.init(true, pq7Var.b());
                    }
                    reset();
                    return;
                }
                throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.c - i2) + " bytes.");
            }
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.c + " bytes.");
        }
        throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
    }

    @Override // defpackage.qya, defpackage.rya
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        byte b;
        int i4 = this.c;
        if (i + i4 <= bArr.length) {
            if (i4 + i3 <= bArr2.length) {
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = this.g;
                    if (i6 == 0) {
                        this.b.b(this.e, 0, this.f, 0);
                        byte b2 = bArr[i + i5];
                        byte[] bArr3 = this.f;
                        int i7 = this.g;
                        this.g = i7 + 1;
                        b = (byte) (b2 ^ bArr3[i7]);
                    } else {
                        byte b3 = bArr[i + i5];
                        byte[] bArr4 = this.f;
                        int i8 = i6 + 1;
                        this.g = i8;
                        b = (byte) (bArr4[i6] ^ b3);
                        if (i8 == this.e.length) {
                            this.g = 0;
                            e();
                        }
                    }
                    bArr2[i3 + i5] = b;
                }
                return i2;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too small");
    }

    @Override // defpackage.xc0
    public void reset() {
        tr.y(this.e, (byte) 0);
        byte[] bArr = this.d;
        System.arraycopy(bArr, 0, this.e, 0, bArr.length);
        this.b.reset();
        this.g = 0;
    }
}
