package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: md5  reason: default package */
/* loaded from: classes3.dex */
public class md5 extends qya {
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private int e;
    private boolean f;
    private xc0 g;

    public md5(xc0 xc0Var) {
        super(xc0Var);
        this.g = xc0Var;
        this.b = new byte[xc0Var.a()];
        this.c = new byte[xc0Var.a()];
        this.d = new byte[xc0Var.a()];
    }

    private void f(int i) {
        while (true) {
            byte[] bArr = this.c;
            if (i < bArr.length) {
                int i2 = i + 1;
                byte b = (byte) (bArr[i] + 1);
                bArr[i] = b;
                if (b == 0) {
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.xc0
    public int a() {
        return this.g.a();
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (bArr.length - i >= a()) {
            if (bArr2.length - i2 >= a()) {
                processBytes(bArr, i, a(), bArr2, i2);
                return a();
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    @Override // defpackage.qya
    protected byte c(byte b) {
        int i = this.e;
        if (i == 0) {
            f(0);
            e();
            this.g.b(this.c, 0, this.d, 0);
            byte[] bArr = this.d;
            int i2 = this.e;
            this.e = i2 + 1;
            return (byte) (b ^ bArr[i2]);
        }
        byte[] bArr2 = this.d;
        int i3 = i + 1;
        this.e = i3;
        byte b2 = (byte) (b ^ bArr2[i]);
        if (i3 == this.c.length) {
            this.e = 0;
        }
        return b2;
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/KCTR";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        this.f = true;
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a = pq7Var.a();
            byte[] bArr = this.b;
            tr.y(bArr, (byte) 0);
            System.arraycopy(a, 0, this.b, bArr.length - a.length, a.length);
            v71 b = pq7Var.b();
            if (b != null) {
                this.g.init(true, b);
            }
            reset();
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed");
    }

    @Override // defpackage.xc0
    public void reset() {
        if (this.f) {
            this.g.b(this.b, 0, this.c, 0);
        }
        this.g.reset();
        this.e = 0;
    }

    private void e() {
    }
}
