package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: c49  reason: default package */
/* loaded from: classes3.dex */
public class c49 implements v72 {
    private static final BigInteger c = BigInteger.valueOf(0);
    private BigInteger a;
    private SecureRandom b;

    @Override // defpackage.v72
    public void a(BigInteger bigInteger, SecureRandom secureRandom) {
        this.a = bigInteger;
        this.b = secureRandom;
    }

    @Override // defpackage.v72
    public BigInteger b() {
        int bitLength = this.a.bitLength();
        while (true) {
            BigInteger e = db0.e(bitLength, this.b);
            if (!e.equals(c) && e.compareTo(this.a) < 0) {
                return e;
            }
        }
    }

    @Override // defpackage.v72
    public boolean c() {
        return false;
    }

    @Override // defpackage.v72
    public void d(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }
}
