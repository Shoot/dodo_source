package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: ta4  reason: default package */
/* loaded from: classes3.dex */
public class ta4 extends qya {
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private int e;
    private final int f;
    private final xc0 g;
    boolean h;
    int i;
    int j;

    public ta4(xc0 xc0Var) {
        super(xc0Var);
        this.h = true;
        this.g = xc0Var;
        int a = xc0Var.a();
        this.f = a;
        if (a == 8) {
            this.b = new byte[xc0Var.a()];
            this.c = new byte[xc0Var.a()];
            this.d = new byte[xc0Var.a()];
            return;
        }
        throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
    }

    private int e(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    private void f(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
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
    protected byte c(byte b) {
        if (this.e == 0) {
            if (this.h) {
                this.h = false;
                this.g.b(this.c, 0, this.d, 0);
                this.i = e(this.d, 0);
                this.j = e(this.d, 4);
            }
            int i = this.i + 16843009;
            this.i = i;
            int i2 = this.j;
            int i3 = i2 + 16843012;
            this.j = i3;
            if (i3 < 16843012 && i3 > 0) {
                this.j = i2 + 16843013;
            }
            f(i, this.c, 0);
            f(this.j, this.c, 4);
            this.g.b(this.c, 0, this.d, 0);
        }
        byte[] bArr = this.d;
        int i4 = this.e;
        int i5 = i4 + 1;
        this.e = i5;
        byte b2 = (byte) (b ^ bArr[i4]);
        int i6 = this.f;
        if (i5 == i6) {
            this.e = 0;
            byte[] bArr2 = this.c;
            System.arraycopy(bArr2, i6, bArr2, 0, bArr2.length - i6);
            byte[] bArr3 = this.d;
            byte[] bArr4 = this.c;
            int length = bArr4.length;
            int i7 = this.f;
            System.arraycopy(bArr3, 0, bArr4, length - i7, i7);
        }
        return b2;
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/GCTR";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        xc0 xc0Var;
        this.h = true;
        this.i = 0;
        this.j = 0;
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a = pq7Var.a();
            int length = a.length;
            byte[] bArr = this.b;
            if (length < bArr.length) {
                System.arraycopy(a, 0, bArr, bArr.length - a.length, a.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.b;
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
        this.h = true;
        this.i = 0;
        this.j = 0;
        byte[] bArr = this.b;
        System.arraycopy(bArr, 0, this.c, 0, bArr.length);
        this.e = 0;
        this.g.reset();
    }
}
