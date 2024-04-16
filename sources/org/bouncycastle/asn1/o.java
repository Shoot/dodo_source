package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public abstract class o extends n {
    protected final boolean a;
    protected final int b;
    protected final byte[] c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(boolean z, int i, byte[] bArr) {
        this.a = z;
        this.b = i;
        this.c = tr.h(bArr);
    }

    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return this.a;
    }

    public int D() {
        return this.b;
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        boolean z = this.a;
        return ((z ? 1 : 0) ^ this.b) ^ tr.F(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof o)) {
            return false;
        }
        o oVar = (o) nVar;
        if (this.a != oVar.a || this.b != oVar.b || !tr.c(this.c, oVar.c)) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (A()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("PRIVATE ");
        stringBuffer.append(Integer.toString(D()));
        stringBuffer.append("]");
        if (this.c != null) {
            stringBuffer.append(" #");
            str = org.bouncycastle.util.encoders.b.f(this.c);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        int i;
        if (this.a) {
            i = 224;
        } else {
            i = 192;
        }
        mVar.m(z, i, this.b, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        return v1.b(this.b) + v1.a(this.c.length) + this.c.length;
    }
}
