package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import org.bouncycastle.asn1.k;
/* loaded from: classes3.dex */
public class DSAUtil {
    public static final k[] dsaOids = {oac.m4, g47.j, oac.n4};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String generateKeyFingerprint(BigInteger bigInteger, DSAParams dSAParams) {
        return new gv3(tr.r(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray())).toString();
    }

    public static ux generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof DSAPrivateKey) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) privateKey;
            return new d82(dSAPrivateKey.getX(), new b82(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()));
        }
        throw new InvalidKeyException("can't identify DSA private key.");
    }

    public static ux generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCDSAPublicKey) {
            return ((BCDSAPublicKey) publicKey).engineGetKeyParameters();
        }
        if (publicKey instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) publicKey).engineGetKeyParameters();
        }
        try {
            return new BCDSAPublicKey(b1b.u(publicKey.getEncoded())).engineGetKeyParameters();
        } catch (Exception unused) {
            throw new InvalidKeyException("can't identify DSA public key: " + publicKey.getClass().getName());
        }
    }

    public static boolean isDsaOid(k kVar) {
        int i = 0;
        while (true) {
            k[] kVarArr = dsaOids;
            if (i == kVarArr.length) {
                return false;
            }
            if (kVar.x(kVarArr[i])) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b82 toDSAParameters(DSAParams dSAParams) {
        if (dSAParams != null) {
            return new b82(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }
}
