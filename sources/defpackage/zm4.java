package defpackage;

import java.util.Hashtable;
/* renamed from: zm4  reason: default package */
/* loaded from: classes3.dex */
public class zm4 implements wq9 {
    private static final byte[] h = {1};
    private static final Hashtable i;
    private e23 a;
    private byte[] b;
    private byte[] c;
    private long d;
    private hj3 e;
    private int f;
    private int g;

    static {
        Hashtable hashtable = new Hashtable();
        i = hashtable;
        hashtable.put("SHA-1", g65.d(440));
        hashtable.put("SHA-224", g65.d(440));
        hashtable.put("SHA-256", g65.d(440));
        hashtable.put("SHA-512/256", g65.d(440));
        hashtable.put("SHA-512/224", g65.d(440));
        hashtable.put("SHA-384", g65.d(888));
        hashtable.put("SHA-512", g65.d(888));
    }

    public zm4(e23 e23Var, int i2, hj3 hj3Var, byte[] bArr, byte[] bArr2) {
        if (i2 <= jvb.a(e23Var)) {
            if (hj3Var.entropySize() >= i2) {
                this.a = e23Var;
                this.e = hj3Var;
                this.f = i2;
                this.g = ((Integer) i.get(e23Var.getAlgorithmName())).intValue();
                byte[] c = jvb.c(this.a, tr.q(e(), bArr2, bArr), this.g);
                this.b = c;
                byte[] bArr3 = new byte[c.length + 1];
                System.arraycopy(c, 0, bArr3, 1, c.length);
                this.c = jvb.c(this.a, bArr3, this.g);
                this.d = 1L;
                return;
            }
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
    }

    private void c(byte[] bArr, byte[] bArr2) {
        int i2 = 0;
        for (int i3 = 1; i3 <= bArr2.length; i3++) {
            int i4 = (bArr[bArr.length - i3] & 255) + (bArr2[bArr2.length - i3] & 255) + i2;
            if (i4 > 255) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            bArr[bArr.length - i3] = (byte) i4;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i5 = (bArr[bArr.length - length] & 255) + i2;
            if (i5 > 255) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            bArr[bArr.length - length] = (byte) i5;
        }
    }

    private void d(byte[] bArr, byte[] bArr2) {
        this.a.update(bArr, 0, bArr.length);
        this.a.doFinal(bArr2, 0);
    }

    private byte[] e() {
        byte[] entropy = this.e.getEntropy();
        if (entropy.length >= (this.f + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private byte[] f(byte[] bArr) {
        byte[] bArr2 = new byte[this.a.getDigestSize()];
        d(bArr, bArr2);
        return bArr2;
    }

    private byte[] g(byte[] bArr, int i2) {
        int i3 = i2 / 8;
        int digestSize = i3 / this.a.getDigestSize();
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i3];
        int digestSize2 = this.a.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        for (int i4 = 0; i4 <= digestSize; i4++) {
            d(bArr2, bArr4);
            int i5 = i4 * digestSize2;
            int i6 = i3 - i5;
            if (i6 > digestSize2) {
                i6 = digestSize2;
            }
            System.arraycopy(bArr4, 0, bArr3, i5, i6);
            c(bArr2, h);
        }
        return bArr3;
    }

    @Override // defpackage.wq9
    public int a(byte[] bArr, byte[] bArr2, boolean z) {
        long j;
        int length = bArr.length * 8;
        if (length <= 262144) {
            if (this.d > 140737488355328L) {
                return -1;
            }
            if (z) {
                b(bArr2);
                bArr2 = null;
            }
            if (bArr2 != null) {
                byte[] bArr3 = this.b;
                byte[] bArr4 = new byte[bArr3.length + 1 + bArr2.length];
                bArr4[0] = 2;
                System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
                System.arraycopy(bArr2, 0, bArr4, this.b.length + 1, bArr2.length);
                c(this.b, f(bArr4));
            }
            byte[] g = g(this.b, length);
            byte[] bArr5 = this.b;
            byte[] bArr6 = new byte[bArr5.length + 1];
            System.arraycopy(bArr5, 0, bArr6, 1, bArr5.length);
            bArr6[0] = 3;
            c(this.b, f(bArr6));
            c(this.b, this.c);
            c(this.b, new byte[]{(byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) this.d});
            this.d++;
            System.arraycopy(g, 0, bArr, 0, bArr.length);
            return length;
        }
        throw new IllegalArgumentException("Number of bits per request limited to 262144");
    }

    @Override // defpackage.wq9
    public void b(byte[] bArr) {
        byte[] c = jvb.c(this.a, tr.r(h, this.b, e(), bArr), this.g);
        this.b = c;
        byte[] bArr2 = new byte[c.length + 1];
        bArr2[0] = 0;
        System.arraycopy(c, 0, bArr2, 1, c.length);
        this.c = jvb.c(this.a, bArr2, this.g);
        this.d = 1L;
    }
}
