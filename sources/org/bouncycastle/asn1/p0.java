package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class p0 extends n implements defpackage.m0 {
    private final byte[] a;

    public p0(String str) {
        this(str, false);
    }

    public static p0 D(Object obj) {
        if (obj != null && !(obj instanceof p0)) {
            if (obj instanceof byte[]) {
                try {
                    return (p0) n.z((byte[]) obj);
                } catch (Exception e) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (p0) obj;
    }

    public static p0 E(s sVar, boolean z) {
        n F = sVar.F();
        if (!z && !(F instanceof p0)) {
            return new p0(l.D(F).F());
        }
        return D(F);
    }

    public static boolean F(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return false;
    }

    @Override // defpackage.m0
    public String g() {
        return a0b.b(this.a);
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        return tr.F(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof p0)) {
            return false;
        }
        return tr.c(this.a, ((p0) nVar).a);
    }

    public String toString() {
        return g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.n(z, 22, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() {
        return v1.a(this.a.length) + 1 + this.a.length;
    }

    public p0(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        if (z && !F(str)) {
            throw new IllegalArgumentException("'string' contains illegal characters");
        }
        this.a = a0b.e(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(byte[] bArr) {
        this.a = bArr;
    }
}
