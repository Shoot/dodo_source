package defpackage;
/* renamed from: ed4  reason: default package */
/* loaded from: classes3.dex */
public abstract class ed4 implements nn3, sc6 {
    private final byte[] a;
    private int b;
    private long c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ed4() {
        this.a = new byte[4];
        this.b = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(ed4 ed4Var) {
        byte[] bArr = ed4Var.a;
        System.arraycopy(bArr, 0, this.a, 0, bArr.length);
        this.b = ed4Var.b;
        this.c = ed4Var.c;
    }

    public void e() {
        long j = this.c << 3;
        byte b = Byte.MIN_VALUE;
        while (true) {
            update(b);
            if (this.b != 0) {
                b = 0;
            } else {
                g(j);
                f();
                return;
            }
        }
    }

    protected abstract void f();

    protected abstract void g(long j);

    @Override // defpackage.nn3
    public int getByteLength() {
        return 64;
    }

    protected abstract void h(byte[] bArr, int i);

    @Override // defpackage.e23
    public void reset() {
        this.c = 0L;
        this.b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.e23
    public void update(byte b) {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            h(bArr, 0);
            this.b = 0;
        }
        this.c++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ed4(ed4 ed4Var) {
        this.a = new byte[4];
        d(ed4Var);
    }

    @Override // defpackage.e23
    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.a;
                int i5 = this.b;
                int i6 = i5 + 1;
                this.b = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    h(bArr2, 0);
                    this.b = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((max - i3) & (-4)) + i3;
        while (i3 < i8) {
            h(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.a;
            int i9 = this.b;
            this.b = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.c += max;
    }
}
