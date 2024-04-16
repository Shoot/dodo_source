package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: mta  reason: default package */
/* loaded from: classes3.dex */
public class mta implements t72 {
    public static final mta a = new mta();

    @Override // defpackage.t72
    public BigInteger[] a(BigInteger bigInteger, byte[] bArr) throws IOException {
        p pVar = (p) n.z(bArr);
        if (pVar.size() == 2) {
            BigInteger d = d(bigInteger, pVar, 0);
            BigInteger d2 = d(bigInteger, pVar, 1);
            if (tr.c(b(bigInteger, d, d2), bArr)) {
                return new BigInteger[]{d, d2};
            }
        }
        throw new IllegalArgumentException("Malformed signature");
    }

    @Override // defpackage.t72
    public byte[] b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) throws IOException {
        d dVar = new d();
        e(bigInteger, dVar, bigInteger2);
        e(bigInteger, dVar, bigInteger3);
        return new w0(dVar).p("DER");
    }

    protected BigInteger c(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() >= 0 && (bigInteger == null || bigInteger2.compareTo(bigInteger) < 0)) {
            return bigInteger2;
        }
        throw new IllegalArgumentException("Value out of range");
    }

    protected BigInteger d(BigInteger bigInteger, p pVar, int i) {
        return c(bigInteger, ((i) pVar.F(i)).G());
    }

    protected void e(BigInteger bigInteger, d dVar, BigInteger bigInteger2) {
        dVar.a(new i(c(bigInteger, bigInteger2)));
    }
}
