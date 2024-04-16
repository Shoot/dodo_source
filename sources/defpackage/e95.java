package defpackage;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.bouncycastle.openssl.PEMException;
/* renamed from: e95  reason: default package */
/* loaded from: classes3.dex */
public class e95 {
    private static final Map b;
    private d95 a = new nq2();

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(oac.C3, "ECDSA");
        hashMap.put(co7.R, "RSA");
        hashMap.put(oac.m4, "DSA");
    }

    private KeyFactory a(eb ebVar) throws NoSuchAlgorithmException, NoSuchProviderException {
        k t = ebVar.t();
        String str = (String) b.get(t);
        if (str == null) {
            str = t.H();
        }
        try {
            return this.a.d(str);
        } catch (NoSuchAlgorithmException e) {
            if (str.equals("ECDSA")) {
                return this.a.d("EC");
            }
            throw e;
        }
    }

    public KeyPair b(ln7 ln7Var) throws PEMException {
        try {
            KeyFactory a = a(ln7Var.a().w());
            return new KeyPair(a.generatePublic(new X509EncodedKeySpec(ln7Var.b().getEncoded())), a.generatePrivate(new PKCS8EncodedKeySpec(ln7Var.a().getEncoded())));
        } catch (Exception e) {
            throw new PEMException("unable to convert key pair: " + e.getMessage(), e);
        }
    }

    public e95 c(Provider provider) {
        this.a = new cs8(provider);
        return this;
    }
}
