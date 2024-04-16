package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ECUtils {
    ECUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ux generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCECPublicKey) {
            return ((BCECPublicKey) publicKey).engineGetKeyParameters();
        }
        return ECUtil.generatePublicKeyParameter(publicKey);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static iac getDomainParametersFromGenSpec(ECGenParameterSpec eCGenParameterSpec, ProviderConfiguration providerConfiguration) {
        return getDomainParametersFromName(eCGenParameterSpec.getName(), providerConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gac getDomainParametersFromName(ECParameterSpec eCParameterSpec, boolean z) {
        if (!(eCParameterSpec instanceof fb3)) {
            if (eCParameterSpec == null) {
                return new gac((j) q0.a);
            }
            ea3 convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new gac(new iac(convertCurve, new kac(EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), z), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
        fb3 fb3Var = (fb3) eCParameterSpec;
        k namedCurveOid = ECUtil.getNamedCurveOid(fb3Var.c());
        if (namedCurveOid == null) {
            namedCurveOid = new k(fb3Var.c());
        }
        return new gac(namedCurveOid);
    }

    private static k getOID(String str) {
        char charAt = str.charAt(0);
        if (charAt >= '0' && charAt <= '2') {
            try {
                return new k(str);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static iac getDomainParametersFromName(String str, ProviderConfiguration providerConfiguration) {
        if (str == null || str.length() < 1) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        k oid = getOID(str);
        if (oid == null) {
            return ECUtil.getNamedCurveByName(str);
        }
        iac namedCurveByOid = ECUtil.getNamedCurveByOid(oid);
        return (namedCurveByOid != null || providerConfiguration == null) ? namedCurveByOid : (iac) providerConfiguration.getAdditionalECParameters().get(oid);
    }
}
