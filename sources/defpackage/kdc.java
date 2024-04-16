package defpackage;
/* renamed from: kdc  reason: default package */
/* loaded from: classes3.dex */
public final class kdc implements x36 {
    private int b;
    private idc d;
    private int e;
    private int f;
    private final b a = new b();
    private final int[] c = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kdc$b */
    /* loaded from: classes3.dex */
    public static class b extends idc {
        private b() {
        }

        int u() {
            return super.q();
        }
    }

    private int a() {
        if (this.f != 0) {
            return this.a.u();
        }
        int[] iArr = this.c;
        int length = (this.e + 1) % iArr.length;
        this.e = length;
        return iArr[length];
    }

    private int b(int i) {
        int[] iArr = this.c;
        int i2 = this.e;
        int i3 = iArr[i2];
        if (i == 0) {
            return i3;
        }
        int i4 = iArr[(i2 + 1) % iArr.length];
        return (i4 >>> (32 - i)) | (i3 << i);
    }

    private void c() {
        int i = 0;
        this.b = 0;
        while (true) {
            int[] iArr = this.c;
            if (i < iArr.length - 1) {
                iArr[i] = this.a.u();
                i++;
            } else {
                this.e = iArr.length - 1;
                this.f = 3;
                return;
            }
        }
    }

    private void d() {
        int i = (this.f + 1) % 4;
        this.f = i;
        if (i == 0) {
            this.c[this.e] = this.a.u();
            this.e = (this.e + 1) % this.c.length;
        }
    }

    private void e(int i) {
        this.b = b(i) ^ this.b;
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) {
        d();
        int b2 = this.b ^ b(this.f * 8);
        this.b = b2;
        int a2 = b2 ^ a();
        this.b = a2;
        idc.n(a2, bArr, i);
        reset();
        return getMacSize();
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return "Zuc128Mac";
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return 4;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) {
        this.a.init(true, v71Var);
        this.d = (idc) this.a.a();
        c();
    }

    @Override // defpackage.x36
    public void reset() {
        idc idcVar = this.d;
        if (idcVar != null) {
            this.a.b(idcVar);
        }
        c();
    }

    @Override // defpackage.x36
    public void update(byte b2) {
        d();
        int i = this.f * 8;
        int i2 = 128;
        int i3 = 0;
        while (i2 > 0) {
            if ((b2 & i2) != 0) {
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
