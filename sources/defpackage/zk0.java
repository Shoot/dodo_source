package defpackage;
/* renamed from: zk0  reason: default package */
/* loaded from: classes3.dex */
public class zk0 implements x36 {
    private byte[] a;
    private byte[] b;
    private int c;
    private z36 d;
    private yc0 e;
    private int f;

    public zk0(xc0 xc0Var) {
        this(xc0Var, 8, (xc0Var.a() * 8) / 2, null);
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) {
        int b = this.d.b();
        yc0 yc0Var = this.e;
        if (yc0Var == null) {
            while (true) {
                int i2 = this.c;
                if (i2 >= b) {
                    break;
                }
                this.b[i2] = 0;
                this.c = i2 + 1;
            }
        } else {
            yc0Var.c(this.b, this.c);
        }
        this.d.e(this.b, 0, this.a, 0);
        this.d.c(this.a);
        System.arraycopy(this.a, 0, bArr, i, this.f);
        reset();
        return this.f;
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return this.d.a();
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return this.f;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) {
        reset();
        this.d.d(v71Var);
    }

    @Override // defpackage.x36
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.c = 0;
                this.d.f();
                return;
            }
        }
    }

    @Override // defpackage.x36
    public void update(byte b) {
        int i = this.c;
        byte[] bArr = this.b;
        if (i == bArr.length) {
            this.d.e(bArr, 0, this.a, 0);
            this.c = 0;
        }
        byte[] bArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr2[i2] = b;
    }

    public zk0(xc0 xc0Var, int i, int i2, yc0 yc0Var) {
        this.e = null;
        if (i2 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.a = new byte[xc0Var.a()];
        z36 z36Var = new z36(xc0Var, i);
        this.d = z36Var;
        this.e = yc0Var;
        this.f = i2 / 8;
        this.b = new byte[z36Var.b()];
        this.c = 0;
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int b = this.d.b();
        int i3 = this.c;
        int i4 = b - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, this.b, i3, i4);
            this.d.e(this.b, 0, this.a, 0);
            this.c = 0;
            i2 -= i4;
            i += i4;
            while (i2 > b) {
                this.d.e(bArr, i, this.a, 0);
                i2 -= b;
                i += b;
            }
        }
        System.arraycopy(bArr, i, this.b, this.c, i2);
        this.c += i2;
    }
}
