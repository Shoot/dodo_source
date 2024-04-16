package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import ch.qos.logback.core.joran.action.Action;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;
import org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil;
/* loaded from: classes3.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements co7, aac {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 51200;
    static final int NULL = 0;
    static final String PKCS12_MAX_IT_COUNT_PROPERTY = "org.bouncycastle.pkcs12.max_it_count";
    private static final int SALT_SIZE = 20;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final DefaultSecretKeyProvider keySizeProvider = new DefaultSecretKeyProvider();
    private k certAlgorithm;
    private CertificateFactory certFact;
    private k keyAlgorithm;
    private final d95 helper = new u40();
    private IgnoresCaseHashtable keys = new IgnoresCaseHashtable();
    private IgnoresCaseHashtable localIds = new IgnoresCaseHashtable();
    private IgnoresCaseHashtable certs = new IgnoresCaseHashtable();
    private Hashtable chainCerts = new Hashtable();
    private Hashtable keyCerts = new Hashtable();
    protected SecureRandom random = b32.b();
    private eb macAlgorithm = new eb(g47.i, q0.a);
    private int itCount = 102400;
    private int saltLength = 20;

    /* loaded from: classes3.dex */
    public static class BCPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new u40(), new PKCS12KeyStoreSpi(new u40(), co7.G2, co7.J2));
        }
    }

    /* loaded from: classes3.dex */
    public static class BCPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public BCPKCS12KeyStore3DES() {
            /*
                r4 = this;
                u40 r0 = new u40
                r0.<init>()
                org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi r1 = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi
                u40 r2 = new u40
                r2.<init>()
                org.bouncycastle.asn1.k r3 = defpackage.co7.G2
                r1.<init>(r2, r3, r3)
                r4.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.BCPKCS12KeyStore3DES.<init>():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class CertId {
        byte[] id;

        CertId(PublicKey publicKey) {
            this.id = PKCS12KeyStoreSpi.this.createSubjectKeyId(publicKey).t();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CertId)) {
                return false;
            }
            return tr.c(this.id, ((CertId) obj).id);
        }

        public int hashCode() {
            return tr.F(this.id);
        }

        CertId(byte[] bArr) {
            this.id = bArr;
        }
    }

    /* loaded from: classes3.dex */
    public static class DefPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(new nq2(), new PKCS12KeyStoreSpi(new nq2(), co7.G2, co7.J2));
        }
    }

    /* loaded from: classes3.dex */
    public static class DefPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public DefPKCS12KeyStore3DES() {
            /*
                r4 = this;
                nq2 r0 = new nq2
                r0.<init>()
                org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi r1 = new org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi
                nq2 r2 = new nq2
                r2.<init>()
                org.bouncycastle.asn1.k r3 = defpackage.co7.G2
                r1.<init>(r2, r3, r3)
                r4.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.DefPKCS12KeyStore3DES.<init>():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class DefaultSecretKeyProvider {
        private final Map KEY_SIZES;

        DefaultSecretKeyProvider() {
            HashMap hashMap = new HashMap();
            hashMap.put(new k("1.2.840.113533.7.66.10"), g65.d(128));
            hashMap.put(co7.w0, g65.d(192));
            hashMap.put(ms6.y, g65.d(128));
            hashMap.put(ms6.G, g65.d(192));
            hashMap.put(ms6.O, g65.d(256));
            hashMap.put(os6.a, g65.d(128));
            hashMap.put(os6.b, g65.d(192));
            hashMap.put(os6.c, g65.d(256));
            hashMap.put(y22.f, g65.d(256));
            this.KEY_SIZES = Collections.unmodifiableMap(hashMap);
        }

        public int getKeySize(eb ebVar) {
            Integer num = (Integer) this.KEY_SIZES.get(ebVar.t());
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class IgnoresCaseHashtable {
        private Hashtable keys;
        private Hashtable orig;

        private IgnoresCaseHashtable() {
            this.orig = new Hashtable();
            this.keys = new Hashtable();
        }

        public Enumeration elements() {
            return this.orig.elements();
        }

        public Object get(String str) {
            String f;
            Hashtable hashtable = this.keys;
            if (str == null) {
                f = null;
            } else {
                f = a0b.f(str);
            }
            String str2 = (String) hashtable.get(f);
            if (str2 == null) {
                return null;
            }
            return this.orig.get(str2);
        }

        public Enumeration keys() {
            return this.orig.keys();
        }

        public void put(String str, Object obj) {
            String f;
            if (str == null) {
                f = null;
            } else {
                f = a0b.f(str);
            }
            String str2 = (String) this.keys.get(f);
            if (str2 != null) {
                this.orig.remove(str2);
            }
            this.keys.put(f, str);
            this.orig.put(str, obj);
        }

        public Object remove(String str) {
            String f;
            Hashtable hashtable = this.keys;
            if (str == null) {
                f = null;
            } else {
                f = a0b.f(str);
            }
            String str2 = (String) hashtable.remove(f);
            if (str2 == null) {
                return null;
            }
            return this.orig.remove(str2);
        }

        public int size() {
            return this.orig.size();
        }
    }

    public PKCS12KeyStoreSpi(d95 d95Var, k kVar, k kVar2) {
        this.keyAlgorithm = kVar;
        this.certAlgorithm = kVar2;
        try {
            this.certFact = d95Var.b("X.509");
        } catch (Exception e) {
            throw new IllegalArgumentException("can't create cert factory - " + e.toString());
        }
    }

    private byte[] calculatePbeMac(k kVar, byte[] bArr, int i, char[] cArr, boolean z, byte[] bArr2) throws Exception {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i);
        Mac f = this.helper.f(kVar.H());
        f.init(new sn7(cArr, z), pBEParameterSpec);
        f.update(bArr2);
        return f.doFinal();
    }

    private Cipher createCipher(int i, char[] cArr, eb ebVar) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, NoSuchProviderException {
        SecretKey generateSecret;
        AlgorithmParameterSpec wa4Var;
        zm7 u = zm7.u(ebVar.w());
        gn7 t = gn7.t(u.v().v());
        eb u2 = eb.u(u.t());
        SecretKeyFactory c = this.helper.c(u.v().t().H());
        if (t.z()) {
            generateSecret = c.generateSecret(new PBEKeySpec(cArr, t.x(), validateIterationCount(t.u()), keySizeProvider.getKeySize(u2)));
        } else {
            generateSecret = c.generateSecret(new fn7(cArr, t.x(), validateIterationCount(t.u()), keySizeProvider.getKeySize(u2), t.w()));
        }
        Cipher cipher = Cipher.getInstance(u.t().t().H());
        h0 v = u.t().v();
        if (v instanceof l) {
            wa4Var = new IvParameterSpec(l.D(v).F());
        } else {
            xa4 v2 = xa4.v(v);
            wa4Var = new wa4(v2.t(), v2.u());
        }
        cipher.init(i, generateSecret, wa4Var);
        return cipher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (r3 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private defpackage.ps9 createSafeBag(java.lang.String r7, java.security.cert.Certificate r8) throws java.security.cert.CertificateEncodingException {
        /*
            r6 = this;
            zt0 r0 = new zt0
            org.bouncycastle.asn1.k r1 = defpackage.co7.k1
            org.bouncycastle.asn1.s0 r2 = new org.bouncycastle.asn1.s0
            byte[] r3 = r8.getEncoded()
            r2.<init>(r3)
            r0.<init>(r1, r2)
            org.bouncycastle.asn1.d r1 = new org.bouncycastle.asn1.d
            r1.<init>()
            boolean r2 = r8 instanceof defpackage.rn7
            if (r2 == 0) goto L73
            rn7 r8 = (defpackage.rn7) r8
            org.bouncycastle.asn1.k r2 = defpackage.co7.g1
            h0 r3 = r8.getBagAttribute(r2)
            org.bouncycastle.asn1.i0 r3 = (org.bouncycastle.asn1.i0) r3
            if (r3 == 0) goto L2f
            java.lang.String r3 = r3.g()
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L39
        L2f:
            if (r7 == 0) goto L39
            org.bouncycastle.asn1.i0 r3 = new org.bouncycastle.asn1.i0
            r3.<init>(r7)
            r8.setBagAttribute(r2, r3)
        L39:
            java.util.Enumeration r2 = r8.getBagAttributeKeys()
            r3 = 0
        L3e:
            boolean r4 = r2.hasMoreElements()
            if (r4 == 0) goto L71
            java.lang.Object r4 = r2.nextElement()
            org.bouncycastle.asn1.k r4 = (org.bouncycastle.asn1.k) r4
            org.bouncycastle.asn1.k r5 = defpackage.co7.h1
            boolean r5 = r4.x(r5)
            if (r5 == 0) goto L53
            goto L3e
        L53:
            org.bouncycastle.asn1.d r3 = new org.bouncycastle.asn1.d
            r3.<init>()
            r3.a(r4)
            org.bouncycastle.asn1.x0 r5 = new org.bouncycastle.asn1.x0
            h0 r4 = r8.getBagAttribute(r4)
            r5.<init>(r4)
            r3.a(r5)
            org.bouncycastle.asn1.w0 r4 = new org.bouncycastle.asn1.w0
            r4.<init>(r3)
            r1.a(r4)
            r3 = 1
            goto L3e
        L71:
            if (r3 != 0) goto L92
        L73:
            org.bouncycastle.asn1.d r8 = new org.bouncycastle.asn1.d
            r8.<init>()
            org.bouncycastle.asn1.k r2 = defpackage.co7.g1
            r8.a(r2)
            org.bouncycastle.asn1.x0 r2 = new org.bouncycastle.asn1.x0
            org.bouncycastle.asn1.i0 r3 = new org.bouncycastle.asn1.i0
            r3.<init>(r7)
            r2.<init>(r3)
            r8.a(r2)
            org.bouncycastle.asn1.w0 r7 = new org.bouncycastle.asn1.w0
            r7.<init>(r8)
            r1.a(r7)
        L92:
            ps9 r7 = new ps9
            org.bouncycastle.asn1.k r8 = defpackage.co7.z2
            org.bouncycastle.asn1.n r0 = r0.f()
            org.bouncycastle.asn1.x0 r2 = new org.bouncycastle.asn1.x0
            r2.<init>(r1)
            r7.<init>(r8, r0, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.createSafeBag(java.lang.String, java.security.cert.Certificate):ps9");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a1b createSubjectKeyId(PublicKey publicKey) {
        try {
            return new a1b(getDigest(b1b.u(publicKey.getEncoded())));
        } catch (Exception unused) {
            throw new RuntimeException("error creating key");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0258 A[Catch: CertificateEncodingException -> 0x0245, TryCatch #0 {CertificateEncodingException -> 0x0245, blocks: (B:42:0x0208, B:44:0x022d, B:46:0x023a, B:52:0x0250, B:54:0x0258, B:55:0x0263, B:56:0x0268, B:58:0x026e, B:63:0x02a1, B:64:0x02e2, B:51:0x0248), top: B:120:0x0208 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026e A[Catch: CertificateEncodingException -> 0x0245, LOOP:4: B:56:0x0268->B:58:0x026e, LOOP_END, TryCatch #0 {CertificateEncodingException -> 0x0245, blocks: (B:42:0x0208, B:44:0x022d, B:46:0x023a, B:52:0x0250, B:54:0x0258, B:55:0x0263, B:56:0x0268, B:58:0x026e, B:63:0x02a1, B:64:0x02e2, B:51:0x0248), top: B:120:0x0208 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void doStore(java.io.OutputStream r20, char[] r21, boolean r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.doStore(java.io.OutputStream, char[], boolean):void");
    }

    private static byte[] getDigest(b1b b1bVar) {
        e23 b = f23.b();
        byte[] bArr = new byte[b.getDigestSize()];
        byte[] E = b1bVar.v().E();
        b.update(E, 0, E.length);
        b.doFinal(bArr, 0);
        return bArr;
    }

    private Set getUsedCertificateSet() {
        HashSet hashSet = new HashSet();
        Enumeration keys = this.keys.keys();
        while (keys.hasMoreElements()) {
            Certificate[] engineGetCertificateChain = engineGetCertificateChain((String) keys.nextElement());
            for (int i = 0; i != engineGetCertificateChain.length; i++) {
                hashSet.add(engineGetCertificateChain[i]);
            }
        }
        Enumeration keys2 = this.certs.keys();
        while (keys2.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) keys2.nextElement()));
        }
        return hashSet;
    }

    private int validateIterationCount(BigInteger bigInteger) {
        int intValue = bigInteger.intValue();
        if (intValue >= 0) {
            BigInteger a = pq8.a(PKCS12_MAX_IT_COUNT_PROPERTY);
            if (a != null && a.intValue() < intValue) {
                throw new IllegalStateException("iteration count " + intValue + " greater than " + a.intValue());
            }
            return intValue;
        }
        throw new IllegalStateException("negative iteration count found");
    }

    protected byte[] cryptData(boolean z, eb ebVar, char[] cArr, boolean z2, byte[] bArr) throws IOException {
        int i;
        k t = ebVar.t();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        if (t.R(co7.D2)) {
            un7 u = un7.u(ebVar.w());
            try {
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(u.t(), u.v().intValue());
                sn7 sn7Var = new sn7(cArr, z2);
                Cipher a = this.helper.a(t.H());
                a.init(i, sn7Var, pBEParameterSpec);
                return a.doFinal(bArr);
            } catch (Exception e) {
                throw new IOException("exception decrypting data - " + e.toString());
            }
        } else if (t.x(co7.t0)) {
            try {
                return createCipher(i, cArr, ebVar).doFinal(bArr);
            } catch (Exception e2) {
                throw new IOException("exception decrypting data - " + e2.toString());
            }
        } else {
            throw new IOException("unknown PBE algorithm: " + t);
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration keys = this.certs.keys();
        while (keys.hasMoreElements()) {
            hashtable.put(keys.nextElement(), "cert");
        }
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            String str = (String) keys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, Action.KEY_ATTRIBUTE);
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        if (this.certs.get(str) == null && this.keys.get(str) == null) {
            return false;
        }
        return true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        Key key = (Key) this.keys.remove(str);
        Certificate certificate = (Certificate) this.certs.remove(str);
        if (certificate != null) {
            this.chainCerts.remove(new CertId(certificate.getPublicKey()));
        }
        if (key != null) {
            String str2 = (String) this.localIds.remove(str);
            if (str2 != null) {
                certificate = (Certificate) this.keyCerts.remove(str2);
            }
            if (certificate != null) {
                this.chainCerts.remove(new CertId(certificate.getPublicKey()));
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        Object obj;
        if (str != null) {
            Certificate certificate = (Certificate) this.certs.get(str);
            if (certificate == null) {
                String str2 = (String) this.localIds.get(str);
                if (str2 != null) {
                    obj = this.keyCerts.get(str2);
                } else {
                    obj = this.keyCerts.get(str);
                }
                return (Certificate) obj;
            }
            return certificate;
        }
        throw new IllegalArgumentException("null alias passed to getCertificate.");
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration elements = this.certs.elements();
        Enumeration keys = this.certs.keys();
        while (elements.hasMoreElements()) {
            String str = (String) keys.nextElement();
            if (((Certificate) elements.nextElement()).equals(certificate)) {
                return str;
            }
        }
        Enumeration elements2 = this.keyCerts.elements();
        Enumeration keys2 = this.keyCerts.keys();
        while (elements2.hasMoreElements()) {
            String str2 = (String) keys2.nextElement();
            if (((Certificate) elements2.nextElement()).equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        X509Certificate x509Certificate;
        byte[] u;
        if (str != null) {
            Certificate[] certificateArr = null;
            if (!engineIsKeyEntry(str)) {
                return null;
            }
            Certificate engineGetCertificate = engineGetCertificate(str);
            if (engineGetCertificate != null) {
                Vector vector = new Vector();
                while (engineGetCertificate != null) {
                    X509Certificate x509Certificate2 = (X509Certificate) engineGetCertificate;
                    byte[] extensionValue = x509Certificate2.getExtensionValue(on3.v.H());
                    if (extensionValue != null && (u = qz.t(l.D(extensionValue).F()).u()) != null) {
                        x509Certificate = (Certificate) this.chainCerts.get(new CertId(u));
                    } else {
                        x509Certificate = null;
                    }
                    if (x509Certificate == null) {
                        Principal issuerDN = x509Certificate2.getIssuerDN();
                        if (!issuerDN.equals(x509Certificate2.getSubjectDN())) {
                            Enumeration keys = this.chainCerts.keys();
                            while (true) {
                                if (!keys.hasMoreElements()) {
                                    break;
                                }
                                X509Certificate x509Certificate3 = (X509Certificate) this.chainCerts.get(keys.nextElement());
                                if (x509Certificate3.getSubjectDN().equals(issuerDN)) {
                                    try {
                                        x509Certificate2.verify(x509Certificate3.getPublicKey());
                                        x509Certificate = x509Certificate3;
                                        break;
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                    if (!vector.contains(engineGetCertificate)) {
                        vector.addElement(engineGetCertificate);
                        if (x509Certificate != engineGetCertificate) {
                            engineGetCertificate = x509Certificate;
                        }
                    }
                    engineGetCertificate = null;
                }
                int size = vector.size();
                certificateArr = new Certificate[size];
                for (int i = 0; i != size; i++) {
                    certificateArr[i] = (Certificate) vector.elementAt(i);
                }
            }
            return certificateArr;
        }
        throw new IllegalArgumentException("null alias passed to getCertificateChain.");
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        if (str != null) {
            if (this.keys.get(str) == null && this.certs.get(str) == null) {
                return null;
            }
            return new Date();
        }
        throw new NullPointerException("alias == null");
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        if (str != null) {
            return (Key) this.keys.get(str);
        }
        throw new IllegalArgumentException("null alias passed to getKey.");
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        if (this.certs.get(str) != null && this.keys.get(str) == null) {
            return true;
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        if (this.keys.get(str) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Type inference failed for: r17v15 */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void engineLoad(java.io.InputStream r23, char[] r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.engineLoad(java.io.InputStream, char[]):void");
    }

    public boolean engineProbe(InputStream inputStream) throws IOException {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        if (this.keys.get(str) == null) {
            this.certs.put(str, certificate);
            this.chainCerts.put(new CertId(certificate.getPublicKey()), certificate);
            return;
        }
        throw new KeyStoreException("There is a key entry with the name " + str + ".");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        boolean z = key instanceof PrivateKey;
        if (!z) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        }
        if (z && certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (this.keys.get(str) != null) {
            engineDeleteEntry(str);
        }
        this.keys.put(str, key);
        if (certificateArr != null) {
            this.certs.put(str, certificateArr[0]);
            for (int i = 0; i != certificateArr.length; i++) {
                this.chainCerts.put(new CertId(certificateArr[i].getPublicKey()), certificateArr[i]);
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration keys = this.certs.keys();
        while (keys.hasMoreElements()) {
            hashtable.put(keys.nextElement(), "cert");
        }
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            String str = (String) keys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, Action.KEY_ATTRIBUTE);
            }
        }
        return hashtable.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        doStore(outputStream, cArr, false);
    }

    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    protected PrivateKey unwrapKey(eb ebVar, byte[] bArr, char[] cArr, boolean z) throws IOException {
        k t = ebVar.t();
        try {
            if (t.R(co7.D2)) {
                un7 u = un7.u(ebVar.w());
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(u.t(), validateIterationCount(u.v()));
                Cipher a = this.helper.a(t.H());
                a.init(4, new sn7(cArr, z), pBEParameterSpec);
                return (PrivateKey) a.unwrap(bArr, "", 2);
            } else if (t.x(co7.t0)) {
                return (PrivateKey) createCipher(4, cArr, ebVar).unwrap(bArr, "", 2);
            } else {
                throw new IOException("exception unwrapping private key - cannot recognise: " + t);
            }
        } catch (Exception e) {
            throw new IOException("exception unwrapping private key - " + e.toString());
        }
    }

    protected byte[] wrapKey(String str, Key key, un7 un7Var, char[] cArr) throws IOException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory c = this.helper.c(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(un7Var.t(), un7Var.v().intValue());
            Cipher a = this.helper.a(str);
            a.init(3, c.generateSecret(pBEKeySpec), pBEParameterSpec);
            return a.wrap(key);
        } catch (Exception e) {
            throw new IOException("exception encrypting data - " + e.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException, NoSuchAlgorithmException, CertificateException {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else if (loadStoreParameter instanceof x40) {
            engineLoad(((x40) loadStoreParameter).a(), ParameterUtil.extractPassword(loadStoreParameter));
        } else {
            throw new IllegalArgumentException("no support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new RuntimeException("operation not supported");
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException, NoSuchAlgorithmException, CertificateException {
        wn7 wn7Var;
        char[] password;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'param' arg cannot be null");
        }
        boolean z = loadStoreParameter instanceof wn7;
        if (!z && !(loadStoreParameter instanceof i85)) {
            throw new IllegalArgumentException("No support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
        if (z) {
            wn7Var = (wn7) loadStoreParameter;
        } else {
            i85 i85Var = (i85) loadStoreParameter;
            wn7Var = new wn7(i85Var.a(), loadStoreParameter.getProtectionParameter(), i85Var.b());
        }
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            password = null;
        } else if (!(protectionParameter instanceof KeyStore.PasswordProtection)) {
            throw new IllegalArgumentException("No support for protection parameter of type " + protectionParameter.getClass().getName());
        } else {
            password = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        doStore(wn7Var.getOutputStream(), password, wn7Var.isForDEREncoding());
    }
}
