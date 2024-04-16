package defpackage;
/* renamed from: sj4  reason: default package */
/* loaded from: classes3.dex */
public class sj4 implements wq9 {
    private byte[] a;
    private byte[] b;
    private long c;
    private hj3 d;
    private x36 e;
    private int f;

    public sj4(x36 x36Var, int i, hj3 hj3Var, byte[] bArr, byte[] bArr2) {
        if (i <= jvb.b(x36Var)) {
            if (hj3Var.entropySize() >= i) {
                this.f = i;
                this.d = hj3Var;
                this.e = x36Var;
                byte[] q = tr.q(c(), bArr2, bArr);
                byte[] bArr3 = new byte[x36Var.getMacSize()];
                this.a = bArr3;
                byte[] bArr4 = new byte[bArr3.length];
                this.b = bArr4;
                tr.y(bArr4, (byte) 1);
                d(q);
                this.c = 1L;
                return;
            }
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
    }

    private byte[] c() {
        byte[] entropy = this.d.getEntropy();
        if (entropy.length >= (this.f + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private void d(byte[] bArr) {
        e(bArr, (byte) 0);
        if (bArr != null) {
            e(bArr, (byte) 1);
        }
    }

    private void e(byte[] bArr, byte b) {
        this.e.init(new lf5(this.a));
        x36 x36Var = this.e;
        byte[] bArr2 = this.b;
        x36Var.update(bArr2, 0, bArr2.length);
        this.e.update(b);
        if (bArr != null) {
            this.e.update(bArr, 0, bArr.length);
        }
        this.e.doFinal(this.a, 0);
        this.e.init(new lf5(this.a));
        x36 x36Var2 = this.e;
        byte[] bArr3 = this.b;
        x36Var2.update(bArr3, 0, bArr3.length);
        this.e.doFinal(this.b, 0);
    }

    @Override // defpackage.wq9
    public int a(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length <= 262144) {
            if (this.c > 140737488355328L) {
                return -1;
            }
            if (z) {
                b(bArr2);
                bArr2 = null;
            }
            if (bArr2 != null) {
                d(bArr2);
            }
            int length2 = bArr.length;
            byte[] bArr3 = new byte[length2];
            int length3 = bArr.length / this.b.length;
            this.e.init(new lf5(this.a));
            for (int i = 0; i < length3; i++) {
                x36 x36Var = this.e;
                byte[] bArr4 = this.b;
                x36Var.update(bArr4, 0, bArr4.length);
                this.e.doFinal(this.b, 0);
                byte[] bArr5 = this.b;
                System.arraycopy(bArr5, 0, bArr3, bArr5.length * i, bArr5.length);
            }
            byte[] bArr6 = this.b;
            if (bArr6.length * length3 < length2) {
                this.e.update(bArr6, 0, bArr6.length);
                this.e.doFinal(this.b, 0);
                byte[] bArr7 = this.b;
                System.arraycopy(bArr7, 0, bArr3, bArr7.length * length3, length2 - (length3 * bArr7.length));
            }
            d(bArr2);
            this.c++;
            System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
            return length;
        }
        throw new IllegalArgumentException("Number of bits per request limited to 262144");
    }

    @Override // defpackage.wq9
    public void b(byte[] bArr) {
        d(tr.p(c(), bArr));
        this.c = 1L;
    }
}
