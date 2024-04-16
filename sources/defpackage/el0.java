package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
/* renamed from: el0  reason: default package */
/* loaded from: classes3.dex */
public class el0 extends i0 {
    private BigInteger a;

    public el0(BigInteger bigInteger) {
        if (db0.a.compareTo(bigInteger) <= 0) {
            this.a = bigInteger;
            return;
        }
        throw new IllegalArgumentException("Invalid CRL number : not in (0..MAX)");
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return new i(this.a);
    }

    public BigInteger t() {
        return this.a;
    }

    public String toString() {
        return "CRLNumber: " + t();
    }
}
