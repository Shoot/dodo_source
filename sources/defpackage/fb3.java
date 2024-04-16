package defpackage;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
/* renamed from: fb3  reason: default package */
/* loaded from: classes3.dex */
public class fb3 extends ECParameterSpec {
    private String a;

    public fb3(String str, ea3 ea3Var, jb3 jb3Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(a(ea3Var, bArr), EC5Util.convertPoint(jb3Var), bigInteger, bigInteger2.intValue());
        this.a = str;
    }

    private static EllipticCurve a(ea3 ea3Var, byte[] bArr) {
        return new EllipticCurve(b(ea3Var.s()), ea3Var.n().t(), ea3Var.o().t(), bArr);
    }

    private static ECField b(iv3 iv3Var) {
        if (ca3.o(iv3Var)) {
            return new ECFieldFp(iv3Var.b());
        }
        te8 c = ((ve8) iv3Var).c();
        int[] a = c.a();
        return new ECFieldF2m(c.b(), tr.R(tr.x(a, 1, a.length - 1)));
    }

    public String c() {
        return this.a;
    }

    public fb3(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.a = str;
    }
}
