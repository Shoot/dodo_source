package org.bouncycastle.asn1;

import ch.qos.logback.core.CoreConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes3.dex */
public class k extends n {
    private static final ConcurrentMap<a, k> c = new ConcurrentHashMap();
    private final String a;
    private byte[] b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {
        private final int a;
        private final byte[] b;

        a(byte[] bArr) {
            this.a = tr.F(bArr);
            this.b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return tr.c(this.b, ((a) obj).b);
            }
            return false;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public k(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (Q(str)) {
            this.a = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }

    private void E(ByteArrayOutputStream byteArrayOutputStream) {
        f47 f47Var = new f47(this.a);
        int parseInt = Integer.parseInt(f47Var.b()) * 40;
        String b = f47Var.b();
        if (b.length() <= 18) {
            T(byteArrayOutputStream, parseInt + Long.parseLong(b));
        } else {
            U(byteArrayOutputStream, new BigInteger(b).add(BigInteger.valueOf(parseInt)));
        }
        while (f47Var.a()) {
            String b2 = f47Var.b();
            if (b2.length() <= 18) {
                T(byteArrayOutputStream, Long.parseLong(b2));
            } else {
                U(byteArrayOutputStream, new BigInteger(b2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k F(byte[] bArr) {
        k kVar = c.get(new a(bArr));
        if (kVar == null) {
            return new k(bArr);
        }
        return kVar;
    }

    private synchronized byte[] G() {
        try {
            if (this.b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                E(byteArrayOutputStream);
                this.b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public static k I(Object obj) {
        if (obj != null && !(obj instanceof k)) {
            if (obj instanceof defpackage.h0) {
                n f = ((defpackage.h0) obj).f();
                if (f instanceof k) {
                    return (k) f;
                }
            }
            if (obj instanceof byte[]) {
                try {
                    return (k) n.z((byte[]) obj);
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e.getMessage());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (k) obj;
    }

    public static k J(s sVar, boolean z) {
        n F = sVar.F();
        if (!z && !(F instanceof k)) {
            return F(l.D(F).F());
        }
        return I(F);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean P(java.lang.String r8, int r9) {
        /*
            int r0 = r8.length()
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0 + (-1)
            r4 = 48
            r5 = 1
            if (r3 < r9) goto L2e
            char r6 = r8.charAt(r3)
            r7 = 46
            if (r6 != r7) goto L23
            if (r2 == 0) goto L22
            if (r2 <= r5) goto L20
            char r0 = r8.charAt(r0)
            if (r0 != r4) goto L20
            goto L22
        L20:
            r2 = 0
            goto L2b
        L22:
            return r1
        L23:
            if (r4 > r6) goto L2d
            r0 = 57
            if (r6 > r0) goto L2d
            int r2 = r2 + 1
        L2b:
            r0 = r3
            goto L6
        L2d:
            return r1
        L2e:
            if (r2 == 0) goto L3a
            if (r2 <= r5) goto L39
            char r8 = r8.charAt(r0)
            if (r8 != r4) goto L39
            goto L3a
        L39:
            return r5
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.k.P(java.lang.String, int):boolean");
    }

    private static boolean Q(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return P(str, 2);
    }

    private void T(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    private void U(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // org.bouncycastle.asn1.n
    boolean A() {
        return false;
    }

    public k D(String str) {
        return new k(this, str);
    }

    public String H() {
        return this.a;
    }

    public k O() {
        a aVar = new a(G());
        ConcurrentMap<a, k> concurrentMap = c;
        k kVar = concurrentMap.get(aVar);
        if (kVar == null) {
            k putIfAbsent = concurrentMap.putIfAbsent(aVar, this);
            if (putIfAbsent == null) {
                return this;
            }
            return putIfAbsent;
        }
        return kVar;
    }

    public boolean R(k kVar) {
        String H = H();
        String H2 = kVar.H();
        if (H.length() > H2.length() && H.charAt(H2.length()) == '.' && H.startsWith(H2)) {
            return true;
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // org.bouncycastle.asn1.n
    boolean t(n nVar) {
        if (nVar == this) {
            return true;
        }
        if (!(nVar instanceof k)) {
            return false;
        }
        return this.a.equals(((k) nVar).a);
    }

    public String toString() {
        return H();
    }

    @Override // org.bouncycastle.asn1.n
    void u(m mVar, boolean z) throws IOException {
        mVar.n(z, 6, G());
    }

    @Override // org.bouncycastle.asn1.n
    int v() throws IOException {
        int length = G().length;
        return v1.a(length) + 1 + length;
    }

    k(k kVar, String str) {
        if (!P(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.a = kVar.H() + "." + str;
    }

    k(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        BigInteger bigInteger = null;
        long j = 0;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                long j2 = j + (b & Byte.MAX_VALUE);
                if ((b & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append(CoreConstants.DOT);
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    stringBuffer.append(CoreConstants.DOT);
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.a = stringBuffer.toString();
        this.b = tr.h(bArr);
    }
}
