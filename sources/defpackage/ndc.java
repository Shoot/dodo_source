package defpackage;
/* renamed from: ndc  reason: default package */
/* loaded from: classes3.dex */
public final class ndc implements x36 {
    private final a a;
    private final int b;
    private final int[] c;
    private final int[] d;
    private ldc e;
    private int f;
    private int g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ndc$a */
    /* loaded from: classes3.dex */
    public static class a extends ldc {
        public a(int i) {
            super(i);
        }

        int v() {
            return super.q();
        }
    }

    public ndc(int i) {
        this.a = new a(i);
        this.b = i;
        int i2 = i / 32;
        this.c = new int[i2];
        this.d = new int[i2 + 1];
    }

    private int a(int i, int i2) {
        int[] iArr = this.d;
        int i3 = this.f;
        int i4 = iArr[(i3 + i) % iArr.length];
        if (i2 == 0) {
            return i4;
        }
        int i5 = iArr[((i3 + i) + 1) % iArr.length];
        return (i5 >>> (32 - i2)) | (i4 << i2);
    }

    private void b() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = this.a.v();
            i2++;
        }
        while (true) {
            int[] iArr2 = this.d;
            if (i < iArr2.length - 1) {
                iArr2[i] = this.a.v();
                i++;
            } else {
                this.f = iArr2.length - 1;
                this.g = 3;
                return;
            }
        }
    }

    private void c() {
        int i = (this.g + 1) % 4;
        this.g = i;
        if (i == 0) {
            this.f = (this.f + 1) % this.d.length;
        }
    }

    private void d() {
        int i = (this.g + 1) % 4;
        this.g = i;
        if (i == 0) {
            this.d[this.f] = this.a.v();
            this.f = (this.f + 1) % this.d.length;
        }
    }

    private void e(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i2 < iArr.length) {
                iArr[i2] = iArr[i2] ^ a(i2, i);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) {
        c();
        e(this.g * 8);
        int i2 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i2 < iArr.length) {
                idc.n(iArr[i2], bArr, (i2 * 4) + i);
                i2++;
            } else {
                reset();
                return getMacSize();
            }
        }
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return "Zuc256Mac-" + this.b;
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return this.b / 8;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) {
        this.a.init(true, v71Var);
        this.e = (ldc) this.a.a();
        b();
    }

    @Override // defpackage.x36
    public void reset() {
        ldc ldcVar = this.e;
        if (ldcVar != null) {
            this.a.b(ldcVar);
        }
        b();
    }

    @Override // defpackage.x36
    public void update(byte b) {
        d();
        int i = this.g * 8;
        int i2 = 128;
        int i3 = 0;
        while (i2 > 0) {
            if ((b & i2) != 0) {
                e(i + i3);
            }
            i2 >>= 1;
            i3++;
        }
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }
}
