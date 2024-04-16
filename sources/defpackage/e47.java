package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: e47  reason: default package */
/* loaded from: classes3.dex */
public class e47 extends qya {
    private int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private final int f;
    private final xc0 g;

    public e47(xc0 xc0Var, int i) {
        super(xc0Var);
        if (i <= xc0Var.a() * 8 && i >= 8 && i % 8 == 0) {
            this.g = xc0Var;
            this.f = i / 8;
            this.c = new byte[xc0Var.a()];
            this.d = new byte[xc0Var.a()];
            this.e = new byte[xc0Var.a()];
            return;
        }
        throw new IllegalArgumentException("0FB" + i + " not supported");
    }

    @Override // defpackage.xc0
    public int a() {
        return this.f;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i, this.f, bArr2, i2);
        return this.f;
    }

    @Override // defpackage.qya
    protected byte c(byte b) throws DataLengthException, IllegalStateException {
        if (this.b == 0) {
            this.g.b(this.d, 0, this.e, 0);
        }
        byte[] bArr = this.e;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b2 = (byte) (b ^ bArr[i]);
        int i3 = this.f;
        if (i2 == i3) {
            this.b = 0;
            byte[] bArr2 = this.d;
            System.arraycopy(bArr2, i3, bArr2, 0, bArr2.length - i3);
            byte[] bArr3 = this.e;
            byte[] bArr4 = this.d;
            int length = bArr4.length;
            int i4 = this.f;
            System.arraycopy(bArr3, 0, bArr4, length - i4, i4);
        }
        return b2;
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/OFB" + (this.f * 8);
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        xc0 xc0Var;
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a = pq7Var.a();
            int length = a.length;
            byte[] bArr = this.c;
            if (length < bArr.length) {
                System.arraycopy(a, 0, bArr, bArr.length - a.length, a.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.c;
                    if (i >= bArr2.length - a.length) {
                        break;
                    }
                    bArr2[i] = 0;
                    i++;
                }
            } else {
                System.arraycopy(a, 0, bArr, 0, bArr.length);
            }
            reset();
            if (pq7Var.b() != null) {
                xc0Var = this.g;
                v71Var = pq7Var.b();
            } else {
                return;
            }
        } else {
            reset();
            if (v71Var != null) {
                xc0Var = this.g;
            } else {
                return;
            }
        }
        xc0Var.init(true, v71Var);
    }

    @Override // defpackage.xc0
    public void reset() {
        byte[] bArr = this.c;
        System.arraycopy(bArr, 0, this.d, 0, bArr.length);
        this.b = 0;
        this.g.reset();
    }
}
