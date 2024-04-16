package org.bouncycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class e extends n {
    private static e[] c = new e[12];
    private final byte[] a;
    private final int b;

    public e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.a = BigInteger.valueOf(i).toByteArray();
        this.b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e D(byte[] bArr) {
        if (bArr.length > 1) {
            return new e(bArr);
        }
        if (bArr.length != 0) {
            int i = bArr[0] & 255;
            e[] eVarArr = c;
            if (i >= eVarArr.length) {
                return new e(bArr);
            }
            e eVar = eVarArr[i];
            if (eVar == null) {
                e eVar2 = new e(bArr);
                eVarArr[i] = eVar2;
                return eVar2;
            }
            return eVar;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    public static e E(Object obj) {
        if (obj != null && !(obj instanceof e)) {
            if (obj instanceof byte[]) {
                try {
                    return (e) n.z((byte[]) obj);
                } catch (Exception e) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (e) obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return false;
    }

    public BigInteger F() {
        return new BigInteger(this.a);
    }

    public int G() {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i = this.b;
        if (length - i <= 4) {
            return i.O(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Enumerated out of int range");
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        return tr.F(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof e)) {
            return false;
        }
        return tr.c(this.a, ((e) nVar).a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.n(z, 10, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() {
        return v1.a(this.a.length) + 1 + this.a.length;
    }

    public e(byte[] bArr) {
        if (i.Q(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.a = tr.h(bArr);
        this.b = i.U(bArr);
    }
}
