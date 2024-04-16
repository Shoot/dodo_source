package defpackage;
/* renamed from: g77  reason: default package */
/* loaded from: classes3.dex */
public class g77 implements x36 {
    private e23 a;
    private int b;
    private byte[] c = new byte[64];
    private byte[] d = new byte[64];

    public g77(e23 e23Var) {
        this.a = e23Var;
        this.b = e23Var.getDigestSize();
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) {
        int i2 = this.b;
        byte[] bArr2 = new byte[i2];
        this.a.doFinal(bArr2, 0);
        e23 e23Var = this.a;
        byte[] bArr3 = this.d;
        e23Var.update(bArr3, 0, bArr3.length);
        this.a.update(bArr2, 0, i2);
        int doFinal = this.a.doFinal(bArr, i);
        reset();
        return doFinal;
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return this.a.getAlgorithmName() + "/HMAC";
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return this.b;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) {
        this.a.reset();
        byte[] a = ((lf5) v71Var).a();
        if (a.length > 64) {
            this.a.update(a, 0, a.length);
            this.a.doFinal(this.c, 0);
            int i = this.b;
            while (true) {
                byte[] bArr = this.c;
                if (i >= bArr.length) {
                    break;
                }
                bArr[i] = 0;
                i++;
            }
        } else {
            System.arraycopy(a, 0, this.c, 0, a.length);
            int length = a.length;
            while (true) {
                byte[] bArr2 = this.c;
                if (length >= bArr2.length) {
                    break;
                }
                bArr2[length] = 0;
                length++;
            }
        }
        byte[] bArr3 = this.c;
        byte[] bArr4 = new byte[bArr3.length];
        this.d = bArr4;
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        int i2 = 0;
        while (true) {
            byte[] bArr5 = this.c;
            if (i2 >= bArr5.length) {
                break;
            }
            bArr5[i2] = (byte) (bArr5[i2] ^ 54);
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr6 = this.d;
            if (i3 < bArr6.length) {
                bArr6[i3] = (byte) (bArr6[i3] ^ 92);
                i3++;
            } else {
                e23 e23Var = this.a;
                byte[] bArr7 = this.c;
                e23Var.update(bArr7, 0, bArr7.length);
                return;
            }
        }
    }

    @Override // defpackage.x36
    public void reset() {
        this.a.reset();
        e23 e23Var = this.a;
        byte[] bArr = this.c;
        e23Var.update(bArr, 0, bArr.length);
    }

    @Override // defpackage.x36
    public void update(byte b) {
        this.a.update(b);
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }
}
