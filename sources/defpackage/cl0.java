package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
/* renamed from: cl0  reason: default package */
/* loaded from: classes3.dex */
public class cl0 implements x36 {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private int e;
    private xc0 f;
    private int g;
    private byte[] h;
    private byte[] i;

    public cl0(xc0 xc0Var) {
        this(xc0Var, xc0Var.a() * 8);
    }

    private byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = (-c(bArr, bArr2)) & 255;
        int length = bArr.length - 3;
        byte b = bArr2[length];
        byte[] bArr3 = this.a;
        bArr2[length] = (byte) (b ^ (bArr3[1] & i));
        int length2 = bArr.length - 2;
        bArr2[length2] = (byte) ((bArr3[2] & i) ^ bArr2[length2]);
        int length3 = bArr.length - 1;
        bArr2[length3] = (byte) ((i & bArr3[3]) ^ bArr2[length3]);
        return bArr2;
    }

    private static byte[] b(int i) {
        int i2 = i * 8;
        int i3 = 135;
        switch (i2) {
            case 64:
            case 320:
                i3 = 27;
                break;
            case 128:
            case 192:
                break;
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
                i3 = 45;
                break;
            case 224:
                i3 = 777;
                break;
            case 256:
                i3 = 1061;
                break;
            case 384:
                i3 = 4109;
                break;
            case 448:
                i3 = 2129;
                break;
            case 512:
                i3 = 293;
                break;
            case 768:
                i3 = 655377;
                break;
            case 1024:
                i3 = 524355;
                break;
            case 2048:
                i3 = 548865;
                break;
            default:
                throw new IllegalArgumentException("Unknown block size for CMAC: " + i2);
        }
        return mo7.h(i3);
    }

    private static int c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length >= 0) {
                int i2 = bArr[length] & 255;
                bArr2[length] = (byte) (i | (i2 << 1));
                i = (i2 >>> 7) & 1;
            } else {
                return i;
            }
        }
    }

    void d(v71 v71Var) {
        if (v71Var != null && !(v71Var instanceof lf5)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2;
        if (this.e == this.f.a()) {
            bArr2 = this.h;
        } else {
            new us4().c(this.d, this.e);
            bArr2 = this.i;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.c;
            if (i2 < bArr3.length) {
                byte[] bArr4 = this.d;
                bArr4[i2] = (byte) (bArr4[i2] ^ bArr2[i2]);
                i2++;
            } else {
                this.f.b(this.d, 0, bArr3, 0);
                System.arraycopy(this.c, 0, bArr, i, this.g);
                reset();
                return this.g;
            }
        }
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return this.f.getAlgorithmName();
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return this.g;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) {
        d(v71Var);
        this.f.init(true, v71Var);
        byte[] bArr = this.b;
        byte[] bArr2 = new byte[bArr.length];
        this.f.b(bArr, 0, bArr2, 0);
        byte[] a = a(bArr2);
        this.h = a;
        this.i = a(a);
        reset();
    }

    @Override // defpackage.x36
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.d;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.e = 0;
                this.f.reset();
                return;
            }
        }
    }

    @Override // defpackage.x36
    public void update(byte b) {
        int i = this.e;
        byte[] bArr = this.d;
        if (i == bArr.length) {
            this.f.b(bArr, 0, this.c, 0);
            this.e = 0;
        }
        byte[] bArr2 = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        bArr2[i2] = b;
    }

    public cl0(xc0 xc0Var, int i) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i > xc0Var.a() * 8) {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (xc0Var.a() * 8));
        }
        this.f = new tk0(xc0Var);
        this.g = i / 8;
        this.a = b(xc0Var.a());
        this.c = new byte[xc0Var.a()];
        this.d = new byte[xc0Var.a()];
        this.b = new byte[xc0Var.a()];
        this.e = 0;
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int a = this.f.a();
        int i3 = this.e;
        int i4 = a - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, this.d, i3, i4);
            this.f.b(this.d, 0, this.c, 0);
            this.e = 0;
            i2 -= i4;
            i += i4;
            while (i2 > a) {
                this.f.b(bArr, i, this.c, 0);
                i2 -= a;
                i += a;
            }
        }
        System.arraycopy(bArr, i, this.d, this.e, i2);
        this.e += i2;
    }
}
