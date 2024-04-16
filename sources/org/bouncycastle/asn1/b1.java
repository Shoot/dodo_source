package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class b1 extends n implements defpackage.m0 {
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final byte[] a;

    public b1(byte[] bArr) {
        this.a = tr.h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return false;
    }

    @Override // defpackage.m0
    public String g() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i = 0; i != encoded.length; i++) {
                char[] cArr = b;
                stringBuffer.append(cArr[(encoded[i] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new ASN1ParsingException("internal error encoding UniversalString");
        }
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        return tr.F(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof b1)) {
            return false;
        }
        return tr.c(this.a, ((b1) nVar).a);
    }

    public String toString() {
        return g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.n(z, 28, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() {
        return v1.a(this.a.length) + 1 + this.a.length;
    }
}
