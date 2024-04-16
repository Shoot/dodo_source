package defpackage;
/* renamed from: ys4  reason: default package */
/* loaded from: classes3.dex */
public class ys4 implements x36 {
    private byte[] a;
    private byte[] b;
    private int c;
    private xc0 d;
    private yc0 e;
    private int f;
    private lf5 g;
    private lf5 h;

    public ys4(xc0 xc0Var) {
        this(xc0Var, xc0Var.a() * 8, null);
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
        l62 l62Var = new l62();
        l62Var.init(false, this.g);
        byte[] bArr2 = this.a;
        l62Var.b(bArr2, 0, bArr2, 0);
        l62Var.init(true, this.h);
        byte[] bArr3 = this.a;
        l62Var.b(bArr3, 0, bArr3, 0);
        System.arraycopy(this.a, 0, bArr, i, this.f);
        reset();
        return this.f;
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return "ISO9797Alg3";
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return this.f;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) {
        lf5 lf5Var;
        lf5 lf5Var2;
        reset();
        boolean z = v71Var instanceof lf5;
        if (!z && !(v71Var instanceof pq7)) {
            throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
        if (z) {
            lf5Var = (lf5) v71Var;
        } else {
            lf5Var = (lf5) ((pq7) v71Var).b();
        }
        byte[] a = lf5Var.a();
        if (a.length == 16) {
            lf5Var2 = new lf5(a, 0, 8);
            this.g = new lf5(a, 8, 8);
            this.h = lf5Var2;
        } else if (a.length == 24) {
            lf5Var2 = new lf5(a, 0, 8);
            this.g = new lf5(a, 8, 8);
            this.h = new lf5(a, 16, 8);
        } else {
            throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
        }
        if (v71Var instanceof pq7) {
            this.d.init(true, new pq7(lf5Var2, ((pq7) v71Var).a()));
        } else {
            this.d.init(true, lf5Var2);
        }
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

    public ys4(xc0 xc0Var, int i, yc0 yc0Var) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (!(xc0Var instanceof l62)) {
            throw new IllegalArgumentException("cipher must be instance of DESEngine");
        }
        this.d = new tk0(xc0Var);
        this.e = yc0Var;
        this.f = i / 8;
        this.a = new byte[xc0Var.a()];
        this.b = new byte[xc0Var.a()];
        this.c = 0;
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

    public ys4(xc0 xc0Var, yc0 yc0Var) {
        this(xc0Var, xc0Var.a() * 8, yc0Var);
    }
}
