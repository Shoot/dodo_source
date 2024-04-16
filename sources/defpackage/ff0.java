package defpackage;

import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
/* renamed from: ff0  reason: default package */
/* loaded from: classes3.dex */
public final class ff0 extends Provider implements ConfigurableProvider {
    private static String a = "BouncyCastle Security Provider v1.69";
    public static final ProviderConfiguration b = new gf0();
    private static final Map c = new HashMap();
    private static final Class d = ClassUtil.loadClass(ff0.class, "java.security.cert.PKIXRevocationChecker");
    private static final String[] e = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
    private static final String[] f = {"SipHash", "SipHash128", "Poly1305"};
    private static final String[] g = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};
    private static final String[] h = {"X509", "IES", "COMPOSITE"};
    private static final String[] i = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};
    private static final String[] j = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};
    private static final String[] k = {"BC", "BCFKS", "PKCS12"};
    private static final String[] l = {"DRBG"};

    /* renamed from: ff0$a */
    /* loaded from: classes3.dex */
    class a implements PrivilegedAction {
        a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            ff0.this.l();
            return null;
        }
    }

    public ff0() {
        super("BC", 1.69d, a);
        AccessController.doPrivileged(new a());
    }

    private static AsymmetricKeyInfoConverter c(k kVar) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        Map map = c;
        synchronized (map) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) map.get(kVar);
        }
        return asymmetricKeyInfoConverter;
    }

    public static PrivateKey d(dk8 dk8Var) throws IOException {
        AsymmetricKeyInfoConverter c2 = c(dk8Var.w().t());
        if (c2 == null) {
            return null;
        }
        return c2.generatePrivate(dk8Var);
    }

    public static PublicKey e(b1b b1bVar) throws IOException {
        AsymmetricKeyInfoConverter c2 = c(b1bVar.t().t());
        if (c2 == null) {
            return null;
        }
        return c2.generatePublic(b1bVar);
    }

    private void i(String str, String[] strArr) {
        for (int i2 = 0; i2 != strArr.length; i2++) {
            Class loadClass = ClassUtil.loadClass(ff0.class, str + strArr[i2] + "$Mappings");
            if (loadClass != null) {
                try {
                    ((AlgorithmProvider) loadClass.newInstance()).configure(this);
                } catch (Exception e2) {
                    throw new InternalError("cannot create instance of " + str + strArr[i2] + "$Mappings : " + e2);
                }
            }
        }
    }

    private void j() {
        addKeyInfoConverter(ko7.r, new vra());
        addKeyInfoConverter(ko7.v, new is6());
        addKeyInfoConverter(ko7.w, new zac());
        addKeyInfoConverter(s75.a, new zac());
        addKeyInfoConverter(ko7.F, new cbc());
        addKeyInfoConverter(s75.b, new cbc());
        addKeyInfoConverter(ko7.m, new eb6());
        addKeyInfoConverter(ko7.n, new ya6());
        addKeyInfoConverter(ko7.a, new u39());
        addKeyInfoConverter(ko7.X, new nu8());
        addKeyInfoConverter(ko7.Y, new nu8());
        addKeyInfoConverter(co7.B1, new ri5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        String str;
        String str2;
        i("org.bouncycastle.jcajce.provider.digest.", j);
        i("org.bouncycastle.jcajce.provider.symmetric.", e);
        i("org.bouncycastle.jcajce.provider.symmetric.", f);
        i("org.bouncycastle.jcajce.provider.symmetric.", g);
        i("org.bouncycastle.jcajce.provider.asymmetric.", h);
        i("org.bouncycastle.jcajce.provider.asymmetric.", i);
        i("org.bouncycastle.jcajce.provider.keystore.", k);
        i("org.bouncycastle.jcajce.provider.drbg.", l);
        j();
        put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        Class cls = d;
        put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        if (cls != null) {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
        } else {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
        }
        put("CertPathBuilder.RFC3280", str2);
        put("CertPathValidator.PKIX", str);
        put("CertPathBuilder.PKIX", str2);
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAttributes(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String str3 = str + " " + str2;
            if (!containsKey(str3)) {
                put(str3, map.get(str2));
            } else {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addKeyInfoConverter(k kVar, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        Map map = c;
        synchronized (map) {
            map.put(kVar, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public AsymmetricKeyInfoConverter getKeyInfoConverter(k kVar) {
        return (AsymmetricKeyInfoConverter) c.get(kVar);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public boolean hasAlgorithm(String str, String str2) {
        if (!containsKey(str + "." + str2)) {
            if (!containsKey("Alg.Alias." + str + "." + str2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void setParameter(String str, Object obj) {
        ProviderConfiguration providerConfiguration = b;
        synchronized (providerConfiguration) {
            ((gf0) providerConfiguration).a(str, obj);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, k kVar, String str2) {
        addAlgorithm(str + "." + kVar, str2);
        addAlgorithm(str + ".OID." + kVar, str2);
    }
}
