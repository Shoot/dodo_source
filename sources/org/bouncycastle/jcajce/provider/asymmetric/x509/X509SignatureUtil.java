package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.util.encoders.b;
/* loaded from: classes3.dex */
class X509SignatureUtil {
    private static final Map<k, String> algNames;
    private static final j derNull;

    static {
        HashMap hashMap = new HashMap();
        algNames = hashMap;
        hashMap.put(wc3.d, "Ed25519");
        hashMap.put(wc3.e, "Ed448");
        hashMap.put(g47.j, "SHA1withDSA");
        hashMap.put(oac.n4, "SHA1withDSA");
        derNull = q0.a;
    }

    X509SignatureUtil() {
    }

    private static String findAlgName(k kVar) {
        String lookupAlg;
        String lookupAlg2;
        Provider provider = Security.getProvider("BC");
        if (provider != null && (lookupAlg2 = lookupAlg(provider, kVar)) != null) {
            return lookupAlg2;
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            Provider provider2 = providers[i];
            if (provider != provider2 && (lookupAlg = lookupAlg(provider2, kVar)) != null) {
                return lookupAlg;
            }
        }
        return kVar.H();
    }

    private static String getDigestAlgName(k kVar) {
        String a = xh6.a(kVar);
        int indexOf = a.indexOf(45);
        if (indexOf > 0 && !a.startsWith("SHA3")) {
            return a.substring(0, indexOf) + a.substring(indexOf + 1);
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getSignatureName(eb ebVar) {
        h0 w = ebVar.w();
        if (w != null && !derNull.w(w)) {
            if (ebVar.t().x(co7.d0)) {
                r39 u = r39.u(w);
                return getDigestAlgName(u.t().t()) + "withRSAandMGF1";
            } else if (ebVar.t().x(oac.D3)) {
                p D = p.D(w);
                return getDigestAlgName((k) D.F(0)) + "withECDSA";
            }
        }
        String str = algNames.get(ebVar.t());
        if (str != null) {
            return str;
        }
        return findAlgName(ebVar.t());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isCompositeAlgorithm(eb ebVar) {
        return pl6.N.x(ebVar.t());
    }

    private static String lookupAlg(Provider provider, k kVar) {
        String property = provider.getProperty("Alg.Alias.Signature." + kVar);
        if (property != null) {
            return property;
        }
        String property2 = provider.getProperty("Alg.Alias.Signature.OID." + kVar);
        if (property2 != null) {
            return property2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void prettyPrintSignature(byte[] bArr, StringBuffer stringBuffer, String str) {
        String g;
        int length = bArr.length;
        stringBuffer.append("            Signature: ");
        if (length > 20) {
            stringBuffer.append(b.g(bArr, 0, 20));
            stringBuffer.append(str);
            for (int i = 20; i < bArr.length; i += 20) {
                int length2 = bArr.length - 20;
                stringBuffer.append("                       ");
                if (i < length2) {
                    g = b.g(bArr, i, 20);
                } else {
                    g = b.g(bArr, i, bArr.length - i);
                }
                stringBuffer.append(g);
                stringBuffer.append(str);
            }
            return;
        }
        stringBuffer.append(b.f(bArr));
        stringBuffer.append(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSignatureParameters(Signature signature, h0 h0Var) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (h0Var != null && !derNull.w(h0Var)) {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
            try {
                algorithmParameters.init(h0Var.f().getEncoded());
                if (signature.getAlgorithm().endsWith("MGF1")) {
                    try {
                        signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                    } catch (GeneralSecurityException e) {
                        throw new SignatureException("Exception extracting parameters: " + e.getMessage());
                    }
                }
            } catch (IOException e2) {
                throw new SignatureException("IOException decoding parameters: " + e2.getMessage());
            }
        }
    }
}
