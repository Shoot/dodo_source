package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.bouncycastle.asn1.k;
/* loaded from: classes3.dex */
public class RSAUtil {
    public static final k[] rsaOids = {co7.R, aac.f3, co7.a0, co7.d0};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String generateExponentFingerprint(BigInteger bigInteger) {
        return new gv3(bigInteger.toByteArray(), 32).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String generateKeyFingerprint(BigInteger bigInteger) {
        return new gv3(bigInteger.toByteArray()).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n39 generatePrivateKeyParameter(RSAPrivateKey rSAPrivateKey) {
        if (rSAPrivateKey instanceof BCRSAPrivateKey) {
            return ((BCRSAPrivateKey) rSAPrivateKey).engineGetKeyParameters();
        }
        if (rSAPrivateKey instanceof RSAPrivateCrtKey) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) rSAPrivateKey;
            return new o39(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        }
        return new n39(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n39 generatePublicKeyParameter(RSAPublicKey rSAPublicKey) {
        if (rSAPublicKey instanceof BCRSAPublicKey) {
            return ((BCRSAPublicKey) rSAPublicKey).engineGetKeyParameters();
        }
        return new n39(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
    }

    public static boolean isRsaOid(k kVar) {
        int i = 0;
        while (true) {
            k[] kVarArr = rsaOids;
            if (i == kVarArr.length) {
                return false;
            }
            if (kVar.x(kVarArr[i])) {
                return true;
            }
            i++;
        }
    }
}
