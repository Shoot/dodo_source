package defpackage;
/* compiled from: IOContext.java */
/* renamed from: ks4  reason: default package */
/* loaded from: classes2.dex */
public class ks4 {
    protected final zt1 a;
    @Deprecated
    protected final Object b;
    protected final boolean c;
    protected final ah0 d;
    protected byte[] e;
    protected char[] f;
    protected char[] g;

    public ks4(ah0 ah0Var, zt1 zt1Var, boolean z) {
        this.d = ah0Var;
        this.a = zt1Var;
        this.b = zt1Var.n();
        this.c = z;
    }

    private IllegalArgumentException j() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }

    protected final void a(Object obj) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException("Trying to call same allocXxx() method second time");
    }

    protected final void b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw j();
        }
    }

    protected final void c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw j();
        }
    }

    public byte[] d() {
        a(this.e);
        byte[] a = this.d.a(3);
        this.e = a;
        return a;
    }

    public char[] e() {
        a(this.f);
        char[] c = this.d.c(1);
        this.f = c;
        return c;
    }

    public boolean f() {
        return this.c;
    }

    public void g(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.e);
            this.e = null;
            this.d.i(3, bArr);
        }
    }

    public void h(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f);
            this.f = null;
            this.d.j(1, cArr);
        }
    }

    public void i(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.g);
            this.g = null;
            this.d.j(3, cArr);
        }
    }
}
