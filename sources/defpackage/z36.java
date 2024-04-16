package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: z36  reason: default package */
/* loaded from: classes3.dex */
class z36 {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int d;
    private xc0 e;

    public z36(xc0 xc0Var, int i) {
        this.e = xc0Var;
        this.d = i / 8;
        this.a = new byte[xc0Var.a()];
        this.b = new byte[xc0Var.a()];
        this.c = new byte[xc0Var.a()];
    }

    public String a() {
        return this.e.getAlgorithmName() + "/CFB" + (this.d * 8);
    }

    public int b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(byte[] bArr) {
        this.e.b(this.b, 0, bArr, 0);
    }

    public void d(v71 v71Var) throws IllegalArgumentException {
        xc0 xc0Var;
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a = pq7Var.a();
            int length = a.length;
            byte[] bArr = this.a;
            if (length < bArr.length) {
                System.arraycopy(a, 0, bArr, bArr.length - a.length, a.length);
            } else {
                System.arraycopy(a, 0, bArr, 0, bArr.length);
            }
            f();
            xc0Var = this.e;
            v71Var = pq7Var.b();
        } else {
            f();
            xc0Var = this.e;
        }
        xc0Var.init(true, v71Var);
    }

    public int e(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3 = this.d;
        if (i + i3 <= bArr.length) {
            if (i3 + i2 <= bArr2.length) {
                this.e.b(this.b, 0, this.c, 0);
                int i4 = 0;
                while (true) {
                    int i5 = this.d;
                    if (i4 < i5) {
                        bArr2[i2 + i4] = (byte) (this.c[i4] ^ bArr[i + i4]);
                        i4++;
                    } else {
                        byte[] bArr3 = this.b;
                        System.arraycopy(bArr3, i5, bArr3, 0, bArr3.length - i5);
                        byte[] bArr4 = this.b;
                        int length = bArr4.length;
                        int i6 = this.d;
                        System.arraycopy(bArr2, i2, bArr4, length - i6, i6);
                        return this.d;
                    }
                }
            } else {
                throw new OutputLengthException("output buffer too short");
            }
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    public void f() {
        byte[] bArr = this.a;
        System.arraycopy(bArr, 0, this.b, 0, bArr.length);
        this.e.reset();
    }
}
