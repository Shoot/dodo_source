package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class t1 extends p {
    private byte[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t1(byte[] bArr) throws IOException {
        this.b = bArr;
    }

    private void I() {
        if (this.b != null) {
            d dVar = new d();
            s1 s1Var = new s1(this.b);
            while (s1Var.hasMoreElements()) {
                dVar.a((n) s1Var.nextElement());
            }
            this.a = dVar.g();
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.n
    public synchronized n B() {
        I();
        return super.B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.n
    public synchronized n C() {
        I();
        return super.C();
    }

    @Override // org.bouncycastle.asn1.p
    public synchronized defpackage.h0 F(int i) {
        I();
        return super.F(i);
    }

    @Override // org.bouncycastle.asn1.p
    public synchronized Enumeration G() {
        byte[] bArr = this.b;
        if (bArr != null) {
            return new s1(bArr);
        }
        return super.G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.p
    public defpackage.h0[] H() {
        I();
        return super.H();
    }

    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.n, defpackage.i0
    public synchronized int hashCode() {
        I();
        return super.hashCode();
    }

    @Override // org.bouncycastle.asn1.p, java.lang.Iterable
    public synchronized Iterator<defpackage.h0> iterator() {
        I();
        return super.iterator();
    }

    @Override // org.bouncycastle.asn1.p
    public synchronized int size() {
        I();
        return super.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public synchronized void u(m mVar, boolean z) throws IOException {
        try {
            byte[] bArr = this.b;
            if (bArr != null) {
                mVar.n(z, 48, bArr);
            } else {
                super.C().u(mVar, z);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public synchronized int v() throws IOException {
        byte[] bArr = this.b;
        if (bArr != null) {
            return v1.a(bArr.length) + 1 + this.b.length;
        }
        return super.C().v();
    }
}
