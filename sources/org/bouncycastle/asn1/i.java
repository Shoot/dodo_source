package org.bouncycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class i extends n {
    private final byte[] a;
    private final int b;

    public i(long j) {
        this.a = BigInteger.valueOf(j).toByteArray();
        this.b = 0;
    }

    public static i D(Object obj) {
        if (obj != null && !(obj instanceof i)) {
            if (obj instanceof byte[]) {
                try {
                    return (i) n.z((byte[]) obj);
                } catch (Exception e) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (i) obj;
    }

    public static i E(s sVar, boolean z) {
        n F = sVar.F();
        if (!z && !(F instanceof i)) {
            return new i(l.D(F).F());
        }
        return D(F);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        int i3 = i2 & bArr[max];
        while (true) {
            max++;
            if (max < length) {
                i3 = (i3 << 8) | (bArr[max] & 255);
            } else {
                return i3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean Q(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length != 1 && bArr[0] == (bArr[1] >> 7) && !pq8.c("org.bouncycastle.asn1.allow_unsafe_integer")) {
            return true;
        }
        return false;
    }

    static long R(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = Math.max(i, length - 8);
        long j = i2 & bArr[max];
        while (true) {
            max++;
            if (max < length) {
                j = (j << 8) | (bArr[max] & 255);
            } else {
                return j;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int U(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        return false;
    }

    public BigInteger F() {
        return new BigInteger(1, this.a);
    }

    public BigInteger G() {
        return new BigInteger(this.a);
    }

    public boolean H(int i) {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i2 = this.b;
        if (length - i2 <= 4 && O(bArr, i2, -1) == i) {
            return true;
        }
        return false;
    }

    public boolean I(BigInteger bigInteger) {
        if (bigInteger != null && O(this.a, this.b, -1) == bigInteger.intValue() && G().equals(bigInteger)) {
            return true;
        }
        return false;
    }

    public int J() {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i = this.b;
        int i2 = length - i;
        if (i2 <= 4 && (i2 != 4 || (bArr[i] & 128) == 0)) {
            return O(bArr, i, 255);
        }
        throw new ArithmeticException("ASN.1 Integer out of positive int range");
    }

    public int P() {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i = this.b;
        if (length - i <= 4) {
            return O(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long T() {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i = this.b;
        if (length - i <= 8) {
            return R(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        return tr.F(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof i)) {
            return false;
        }
        return tr.c(this.a, ((i) nVar).a);
    }

    public String toString() {
        return G().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        mVar.n(z, 2, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() {
        return v1.a(this.a.length) + 1 + this.a.length;
    }

    public i(BigInteger bigInteger) {
        this.a = bigInteger.toByteArray();
        this.b = 0;
    }

    public i(byte[] bArr) {
        this(bArr, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(byte[] bArr, boolean z) {
        if (Q(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.a = z ? tr.h(bArr) : bArr;
        this.b = U(bArr);
    }
}
