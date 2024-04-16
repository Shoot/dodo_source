package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: yk0  reason: default package */
/* loaded from: classes3.dex */
public class yk0 extends qya {
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private int f;
    private xc0 g;
    private boolean h;
    private int i;

    public yk0(xc0 xc0Var, int i) {
        super(xc0Var);
        this.g = null;
        if (i <= xc0Var.a() * 8 && i >= 8 && i % 8 == 0) {
            this.g = xc0Var;
            this.f = i / 8;
            this.b = new byte[xc0Var.a()];
            this.c = new byte[xc0Var.a()];
            this.d = new byte[xc0Var.a()];
            this.e = new byte[this.f];
            return;
        }
        throw new IllegalArgumentException("CFB" + i + " not supported");
    }

    private byte e(byte b) {
        if (this.i == 0) {
            this.g.b(this.c, 0, this.d, 0);
        }
        byte[] bArr = this.e;
        int i = this.i;
        bArr[i] = b;
        byte[] bArr2 = this.d;
        int i2 = i + 1;
        this.i = i2;
        byte b2 = (byte) (b ^ bArr2[i]);
        int i3 = this.f;
        if (i2 == i3) {
            this.i = 0;
            byte[] bArr3 = this.c;
            System.arraycopy(bArr3, i3, bArr3, 0, bArr3.length - i3);
            byte[] bArr4 = this.e;
            byte[] bArr5 = this.c;
            int length = bArr5.length;
            int i4 = this.f;
            System.arraycopy(bArr4, 0, bArr5, length - i4, i4);
        }
        return b2;
    }

    private byte f(byte b) {
        if (this.i == 0) {
            this.g.b(this.c, 0, this.d, 0);
        }
        byte[] bArr = this.d;
        int i = this.i;
        byte b2 = (byte) (b ^ bArr[i]);
        byte[] bArr2 = this.e;
        int i2 = i + 1;
        this.i = i2;
        bArr2[i] = b2;
        int i3 = this.f;
        if (i2 == i3) {
            this.i = 0;
            byte[] bArr3 = this.c;
            System.arraycopy(bArr3, i3, bArr3, 0, bArr3.length - i3);
            byte[] bArr4 = this.e;
            byte[] bArr5 = this.c;
            int length = bArr5.length;
            int i4 = this.f;
            System.arraycopy(bArr4, 0, bArr5, length - i4, i4);
        }
        return b2;
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qya
    public byte c(byte b) throws DataLengthException, IllegalStateException {
        if (this.h) {
            return f(b);
        }
        return e(b);
    }

    public byte[] g() {
        return tr.h(this.c);
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return this.g.getAlgorithmName() + "/CFB" + (this.f * 8);
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        xc0 xc0Var;
        this.h = z;
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
        byte[] bArr = this.b;
        System.arraycopy(bArr, 0, this.c, 0, bArr.length);
        tr.y(this.e, (byte) 0);
        this.i = 0;
        this.g.reset();
    }
}
