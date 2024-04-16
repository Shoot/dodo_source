package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: eda  reason: default package */
/* loaded from: classes3.dex */
public abstract class eda implements xc0 {
    protected boolean a;
    protected int[] b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;

    /* JADX INFO: Access modifiers changed from: protected */
    public static int p(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    protected static int q(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    @Override // defpackage.xc0
    public int a() {
        return 16;
    }

    @Override // defpackage.xc0
    public final int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.b != null) {
            if (i + 16 <= bArr.length) {
                if (i2 + 16 <= bArr2.length) {
                    if (this.a) {
                        e(bArr, i, bArr2, i2);
                        return 16;
                    }
                    d(bArr, i, bArr2, i2);
                    return 16;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        int p = p(this.c, 13);
        int p2 = p(this.e, 3);
        this.d = p((this.d ^ p) ^ p2, 1);
        int p3 = p((this.f ^ p2) ^ (p << 3), 7);
        this.f = p3;
        this.c = p((p ^ this.d) ^ p3, 5);
        this.e = p((this.f ^ p2) ^ (this.d << 7), 22);
    }

    protected abstract void d(byte[] bArr, int i, byte[] bArr2, int i2);

    protected abstract void e(byte[] bArr, int i, byte[] bArr2, int i2);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i2 ^ i;
        int i7 = (i5 | i6) ^ i4;
        int i8 = i3 ^ i7;
        int i9 = i6 ^ i8;
        this.e = i9;
        int i10 = (i6 & i4) ^ i5;
        int i11 = (i9 & i10) ^ i7;
        this.d = i11;
        int i12 = (i & i7) ^ (i11 | i8);
        this.f = i12;
        this.c = i12 ^ (i10 ^ i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(int i, int i2, int i3, int i4) {
        int i5 = i4 ^ i2;
        int i6 = i ^ (i2 & i5);
        int i7 = i5 ^ i6;
        int i8 = i3 ^ i7;
        this.f = i8;
        int i9 = i2 ^ (i5 & i6);
        int i10 = i6 ^ (i8 | i9);
        this.d = i10;
        int i11 = ~i10;
        int i12 = i9 ^ i8;
        this.c = i11 ^ i12;
        this.e = (i11 | i12) ^ i7;
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "Serpent";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i4;
        int i6 = ~i5;
        int i7 = i ^ i3;
        int i8 = i3 ^ i5;
        int i9 = (i2 & i8) ^ i7;
        this.c = i9;
        int i10 = (((i | i6) ^ i4) | i7) ^ i5;
        this.f = i10;
        int i11 = ~i8;
        int i12 = i10 | i9;
        this.d = i11 ^ i12;
        this.e = (i12 ^ i7) ^ (i4 & i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i, int i2, int i3, int i4) {
        int i5 = i | i2;
        int i6 = i2 ^ i3;
        int i7 = i ^ (i2 & i6);
        int i8 = i3 ^ i7;
        int i9 = i4 | i7;
        int i10 = i6 ^ i9;
        this.c = i10;
        int i11 = (i9 | i6) ^ i4;
        this.e = i8 ^ i11;
        int i12 = i5 ^ i11;
        int i13 = i7 ^ (i10 & i12);
        this.f = i13;
        this.d = i13 ^ (i12 ^ i10);
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof lf5) {
            this.a = z;
            this.b = o(((lf5) v71Var).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + v71Var.getClass().getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ ((i3 | i4) & i);
        int i6 = i3 ^ (i & i5);
        int i7 = i4 ^ i6;
        this.d = i7;
        int i8 = ~i;
        int i9 = (i6 & i7) ^ i5;
        this.f = i9;
        int i10 = i4 ^ (i7 | i8);
        this.c = i9 ^ i10;
        this.e = (i8 ^ i7) ^ (i5 & i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i, int i2, int i3, int i4) {
        int i5 = ~i3;
        int i6 = (i2 & i5) ^ i4;
        int i7 = i & i6;
        int i8 = (i2 ^ i5) ^ i7;
        this.f = i8;
        int i9 = i8 | i2;
        this.d = i6 ^ (i & i9);
        int i10 = i4 | i;
        this.c = (i5 ^ i9) ^ i10;
        this.e = ((i ^ i3) | i7) ^ (i2 & i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i3 ^ i6;
        int i8 = (i3 | i5) ^ i4;
        this.d = i7 ^ i8;
        int i9 = i6 ^ (i7 & i8);
        int i10 = i8 ^ (i2 | i9);
        this.f = i10;
        int i11 = i2 | i10;
        this.c = i9 ^ i11;
        this.e = (i4 & i5) ^ (i11 ^ i7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(int i, int i2, int i3, int i4) {
        int i5 = (i & i2) | i3;
        int i6 = (i | i2) & i4;
        int i7 = i5 ^ i6;
        this.f = i7;
        int i8 = i2 ^ i6;
        int i9 = ((i7 ^ (~i4)) | i8) ^ i;
        this.d = i9;
        int i10 = (i8 ^ i3) ^ (i4 | i9);
        this.c = i10;
        this.e = ((i & i7) ^ i10) ^ (i5 ^ i9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n() {
        int q = (q(this.e, 22) ^ this.f) ^ (this.d << 7);
        int q2 = q(this.c, 5) ^ this.d;
        int i = this.f;
        int i2 = q2 ^ i;
        int q3 = q(i, 7);
        int q4 = q(this.d, 1);
        this.f = (q3 ^ q) ^ (i2 << 3);
        this.d = (q4 ^ i2) ^ q;
        this.e = q(q, 3);
        this.c = q(i2, 13);
    }

    protected abstract int[] o(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ i5;
        int i7 = i2 ^ i6;
        int i8 = (i4 & i) ^ i7;
        this.f = i8;
        int i9 = i ^ (i2 & i5);
        this.e = (i3 | i9) ^ i7;
        int i10 = (i6 ^ i9) & i8;
        this.d = (~i6) ^ i10;
        this.c = (~i9) ^ i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(int i, int i2, int i3, int i4) {
        int i5 = (~i) ^ i2;
        int i6 = (i | i5) ^ i3;
        int i7 = i4 ^ i6;
        this.e = i7;
        int i8 = i2 ^ (i4 | i5);
        int i9 = i7 ^ i5;
        int i10 = (i6 & i8) ^ i9;
        this.f = i10;
        int i11 = i8 ^ i6;
        this.d = i10 ^ i11;
        this.c = i6 ^ (i11 & i9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i2 ^ i4;
        int i7 = (i3 & i5) ^ i6;
        this.c = i7;
        int i8 = i3 ^ i5;
        int i9 = i2 & (i3 ^ i7);
        int i10 = i8 ^ i9;
        this.f = i10;
        int i11 = i ^ ((i9 | i4) & (i7 | i8));
        this.e = i11;
        this.d = (i11 ^ (i4 | i5)) ^ (i6 ^ i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(int i, int i2, int i3, int i4) {
        int i5 = i ^ i2;
        int i6 = i & i3;
        int i7 = i | i4;
        int i8 = i3 ^ i4;
        int i9 = i6 | (i5 & i7);
        int i10 = i8 ^ i9;
        this.e = i10;
        int i11 = (i7 ^ i2) ^ i9;
        int i12 = i5 ^ (i8 & i11);
        this.c = i12;
        int i13 = i12 & i10;
        this.d = i11 ^ i13;
        this.f = (i2 | i4) ^ (i8 ^ i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ (i4 & i5);
        int i7 = i2 | i6;
        this.f = i5 ^ i7;
        int i8 = ~i2;
        int i9 = (i5 | i8) ^ i6;
        this.c = i9;
        int i10 = i8 ^ i5;
        int i11 = (i7 & i10) ^ (i9 & i);
        this.e = i11;
        this.d = (i ^ i6) ^ (i10 & i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i ^ i4;
        int i8 = (i3 ^ i5) ^ (i6 | i7);
        this.c = i8;
        int i9 = i4 & i8;
        int i10 = (i6 ^ i8) ^ i9;
        this.d = i10;
        int i11 = i7 ^ (i8 | i5);
        this.e = (i6 | i9) ^ i11;
        this.f = (i11 & i10) ^ (i2 ^ i9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(int i, int i2, int i3, int i4) {
        int i5 = ~i;
        int i6 = i ^ i4;
        int i7 = i2 ^ i6;
        int i8 = i3 ^ (i5 | i6);
        int i9 = i2 ^ i8;
        this.d = i9;
        int i10 = (i6 | i9) ^ i4;
        int i11 = (i8 & i10) ^ i7;
        this.e = i11;
        int i12 = i10 ^ i8;
        this.c = i11 ^ i12;
        this.f = (i12 & i7) ^ (~i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i3;
        int i6 = (i3 & i5) ^ i4;
        int i7 = i ^ i6;
        int i8 = i2 ^ ((i4 | i5) & i7);
        this.d = i8;
        int i9 = (i & i7) ^ i5;
        this.f = i9;
        int i10 = (i8 | i6) ^ i7;
        int i11 = i6 ^ (i9 & i10);
        this.e = i11;
        this.c = (i9 & i11) ^ (~i10);
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
