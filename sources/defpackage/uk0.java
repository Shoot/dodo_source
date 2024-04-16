package defpackage;
/* renamed from: uk0  reason: default package */
/* loaded from: classes3.dex */
public class uk0 implements x36 {
    private byte[] a;
    private byte[] b;
    private int c;
    private xc0 d;
    private yc0 e;
    private int f;

    public uk0(xc0 xc0Var) {
        this(xc0Var, (xc0Var.a() * 8) / 2, null);
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) {
        int a = this.d.a();
        if (this.e == null) {
            while (true) {
                int i2 = this.c;
                if (i2 >= a) {
                    break;
                }
                this.b[i2] = 0;
                this.c = i2 + 1;
            }
        } else {
            if (this.c == a) {
                this.d.b(this.b, 0, this.a, 0);
                this.c = 0;
            }
            this.e.c(this.b, this.c);
        }
        this.d.b(this.b, 0, this.a, 0);
        System.arraycopy(this.a, 0, bArr, i, this.f);
        reset();
        return this.f;
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return this.d.getAlgorithmName();
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return this.f;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) {
        reset();
        this.d.init(true, v71Var);
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
                this.d.reset();
                return;
            }
        }
    }

    @Override // defpackage.x36
    public void update(byte b) {
        int i = this.c;
        byte[] bArr = this.b;
        if (i == bArr.length) {
            this.d.b(bArr, 0, this.a, 0);
            this.c = 0;
        }
        byte[] bArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr2[i2] = b;
    }

    public uk0(xc0 xc0Var, int i) {
        this(xc0Var, i, null);
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int a = this.d.a();
        int i3 = this.c;
        int i4 = a - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, this.b, i3, i4);
            this.d.b(this.b, 0, this.a, 0);
            this.c = 0;
            i2 -= i4;
            i += i4;
            while (i2 > a) {
                this.d.b(bArr, i, this.a, 0);
                i2 -= a;
                i += a;
            }
        }
        System.arraycopy(bArr, i, this.b, this.c, i2);
        this.c += i2;
    }

    public uk0(xc0 xc0Var, int i, yc0 yc0Var) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.d = new tk0(xc0Var);
        this.e = yc0Var;
        this.f = i / 8;
        this.a = new byte[xc0Var.a()];
        this.b = new byte[xc0Var.a()];
        this.c = 0;
    }
}
