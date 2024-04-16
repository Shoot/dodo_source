package defpackage;
/* renamed from: p  reason: default package */
/* loaded from: classes3.dex */
public class p implements v71 {
    private byte[] a;
    private byte[] b;
    private lf5 c;
    private int d;

    public p(lf5 lf5Var, int i, byte[] bArr) {
        this(lf5Var, i, bArr, null);
    }

    public byte[] a() {
        return tr.h(this.a);
    }

    public lf5 b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public byte[] d() {
        return tr.h(this.b);
    }

    public p(lf5 lf5Var, int i, byte[] bArr, byte[] bArr2) {
        this.c = lf5Var;
        this.b = tr.h(bArr);
        this.d = i;
        this.a = tr.h(bArr2);
    }
}
