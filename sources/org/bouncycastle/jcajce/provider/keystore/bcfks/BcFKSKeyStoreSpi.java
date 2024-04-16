package org.bouncycastle.jcajce.provider.keystore.bcfks;

import defpackage.s40;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;
import org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class BcFKSKeyStoreSpi extends KeyStoreSpi {
    private static final BigInteger CERTIFICATE;
    private static final BigInteger PRIVATE_KEY;
    private static final BigInteger PROTECTED_PRIVATE_KEY;
    private static final BigInteger PROTECTED_SECRET_KEY;
    private static final BigInteger SECRET_KEY;
    private static final Map<String, k> oidMap;
    private static final Map<k, String> publicAlgMap;
    private Date creationDate;
    private final d95 helper;
    private eb hmacAlgorithm;
    private xe5 hmacPkbdAlgorithm;
    private Date lastModifiedDate;
    private eb signatureAlgorithm;
    private s40.a validator;
    private PublicKey verificationKey;
    private final Map<String, s47> entries = new HashMap();
    private final Map<String, PrivateKey> privateKeyCache = new HashMap();
    private k storeEncryptionAlgorithm = ms6.T;

    /* loaded from: classes3.dex */
    public static class Def extends BcFKSKeyStoreSpi {
        public Def() {
            super(new nq2());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineStore(loadStoreParameter);
        }
    }

    /* loaded from: classes3.dex */
    public static class DefCompat extends AdaptingKeyStoreSpi {
        public DefCompat() {
            super(new nq2(), new BcFKSKeyStoreSpi(new nq2()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DefShared extends SharedKeyStoreSpi {
        public DefShared() {
            super(new nq2());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineStore(loadStoreParameter);
        }
    }

    /* loaded from: classes3.dex */
    public static class DefSharedCompat extends AdaptingKeyStoreSpi {
        public DefSharedCompat() {
            super(new nq2(), new BcFKSKeyStoreSpi(new nq2()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ExtKeyStoreException extends KeyStoreException {
        private final Throwable cause;

        ExtKeyStoreException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* loaded from: classes3.dex */
    private static class SharedKeyStoreSpi extends BcFKSKeyStoreSpi implements co7, aac {
        private final Map<String, byte[]> cache;
        private final byte[] seedKey;

        public SharedKeyStoreSpi(d95 d95Var) {
            super(d95Var);
            try {
                byte[] bArr = new byte[32];
                this.seedKey = bArr;
                d95Var.e("DEFAULT").nextBytes(bArr);
                this.cache = new HashMap();
            } catch (GeneralSecurityException e) {
                throw new IllegalArgumentException("can't create random - " + e.toString());
            }
        }

        private byte[] calculateMac(String str, char[] cArr) throws NoSuchAlgorithmException, InvalidKeyException {
            byte[] p;
            if (cArr != null) {
                p = tr.p(a0b.i(cArr), a0b.h(str));
            } else {
                p = tr.p(this.seedKey, a0b.h(str));
            }
            return wp9.i(p, this.seedKey, 16384, 8, 1, 32);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineDeleteEntry(String str) throws KeyStoreException {
            throw new KeyStoreException("delete operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            try {
                byte[] calculateMac = calculateMac(str, cArr);
                if (this.cache.containsKey(str) && !tr.u(this.cache.get(str), calculateMac)) {
                    throw new UnrecoverableKeyException("unable to recover key (" + str + ")");
                }
                Key engineGetKey = super.engineGetKey(str, cArr);
                if (engineGetKey != null && !this.cache.containsKey(str)) {
                    this.cache.put(str, calculateMac);
                }
                return engineGetKey;
            } catch (InvalidKeyException e) {
                throw new UnrecoverableKeyException("unable to recover key (" + str + "): " + e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }
    }

    /* loaded from: classes3.dex */
    public static class Std extends BcFKSKeyStoreSpi {
        public Std() {
            super(new u40());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineStore(loadStoreParameter);
        }
    }

    /* loaded from: classes3.dex */
    public static class StdCompat extends AdaptingKeyStoreSpi {
        public StdCompat() {
            super(new nq2(), new BcFKSKeyStoreSpi(new u40()));
        }
    }

    /* loaded from: classes3.dex */
    public static class StdShared extends SharedKeyStoreSpi {
        public StdShared() {
            super(new u40());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineStore(loadStoreParameter);
        }
    }

    /* loaded from: classes3.dex */
    public static class StdSharedCompat extends AdaptingKeyStoreSpi {
        public StdSharedCompat() {
            super(new u40(), new BcFKSKeyStoreSpi(new u40()));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        oidMap = hashMap;
        HashMap hashMap2 = new HashMap();
        publicAlgMap = hashMap2;
        k kVar = g47.h;
        hashMap.put("DESEDE", kVar);
        hashMap.put("TRIPLEDES", kVar);
        hashMap.put("TDEA", kVar);
        hashMap.put("HMACSHA1", co7.D0);
        hashMap.put("HMACSHA224", co7.E0);
        hashMap.put("HMACSHA256", co7.F0);
        hashMap.put("HMACSHA384", co7.G0);
        hashMap.put("HMACSHA512", co7.H0);
        hashMap.put("SEED", ae5.a);
        hashMap.put("CAMELLIA.128", os6.a);
        hashMap.put("CAMELLIA.192", os6.b);
        hashMap.put("CAMELLIA.256", os6.c);
        hashMap.put("ARIA.128", ns6.h);
        hashMap.put("ARIA.192", ns6.m);
        hashMap.put("ARIA.256", ns6.r);
        hashMap2.put(co7.R, "RSA");
        hashMap2.put(oac.C3, "EC");
        hashMap2.put(g47.l, "DH");
        hashMap2.put(co7.l0, "DH");
        hashMap2.put(oac.m4, "DSA");
        CERTIFICATE = BigInteger.valueOf(0L);
        PRIVATE_KEY = BigInteger.valueOf(1L);
        SECRET_KEY = BigInteger.valueOf(2L);
        PROTECTED_PRIVATE_KEY = BigInteger.valueOf(3L);
        PROTECTED_SECRET_KEY = BigInteger.valueOf(4L);
    }

    BcFKSKeyStoreSpi(d95 d95Var) {
        this.helper = d95Var;
    }

    private byte[] calculateMac(byte[] bArr, eb ebVar, xe5 xe5Var, char[] cArr) throws NoSuchAlgorithmException, IOException, NoSuchProviderException {
        String H = ebVar.t().H();
        Mac f = this.helper.f(H);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            f.init(new SecretKeySpec(generateKey(xe5Var, "INTEGRITY_CHECK", cArr, -1), H));
            return f.doFinal(bArr);
        } catch (InvalidKeyException e) {
            throw new IOException("Cannot set up MAC calculation: " + e.getMessage());
        }
    }

    private Cipher createCipher(String str, byte[] bArr) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, NoSuchProviderException {
        Cipher a = this.helper.a(str);
        a.init(1, new SecretKeySpec(bArr, "AES"));
        return a;
    }

    private lh3 createPrivateKeySequence(mh3 mh3Var, Certificate[] certificateArr) throws CertificateEncodingException {
        bu0[] bu0VarArr = new bu0[certificateArr.length];
        for (int i = 0; i != certificateArr.length; i++) {
            bu0VarArr[i] = bu0.u(certificateArr[i].getEncoded());
        }
        return new lh3(mh3Var, bu0VarArr);
    }

    private Certificate decodeCertificate(Object obj) {
        d95 d95Var = this.helper;
        if (d95Var != null) {
            try {
                return d95Var.b("X.509").generateCertificate(new ByteArrayInputStream(bu0.u(obj).getEncoded()));
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bu0.u(obj).getEncoded()));
        } catch (Exception unused2) {
            return null;
        }
    }

    private byte[] decryptData(String str, eb ebVar, char[] cArr, byte[] bArr) throws IOException {
        Cipher a;
        AlgorithmParameters algorithmParameters;
        if (ebVar.t().x(co7.t0)) {
            zm7 u = zm7.u(ebVar.w());
            uh3 t = u.t();
            try {
                if (t.t().x(ms6.T)) {
                    a = this.helper.a("AES/CCM/NoPadding");
                    algorithmParameters = this.helper.g("CCM");
                    algorithmParameters.init(wk0.u(t.v()).getEncoded());
                } else if (t.t().x(ms6.U)) {
                    a = this.helper.a("AESKWP");
                    algorithmParameters = null;
                } else {
                    throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
                }
                xe5 v = u.v();
                if (cArr == null) {
                    cArr = new char[0];
                }
                a.init(2, new SecretKeySpec(generateKey(v, str, cArr, 32), "AES"), algorithmParameters);
                return a.doFinal(bArr);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2.toString());
            }
        }
        throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
    }

    private Date extractCreationDate(s47 s47Var, Date date) {
        try {
            return s47Var.t().G();
        } catch (ParseException unused) {
            return date;
        }
    }

    private byte[] generateKey(xe5 xe5Var, String str, char[] cArr, int i) throws IOException {
        byte[] a = ym7.a(cArr);
        byte[] a2 = ym7.a(str.toCharArray());
        if (pl6.M.x(xe5Var.t())) {
            vx9 v = vx9.v(xe5Var.v());
            if (v.w() != null) {
                i = v.w().intValue();
            } else if (i == -1) {
                throw new IOException("no keyLength found in ScryptParams");
            }
            return wp9.i(tr.p(a, a2), v.z(), v.u().intValue(), v.t().intValue(), v.t().intValue(), i);
        } else if (xe5Var.t().x(co7.u0)) {
            gn7 t = gn7.t(xe5Var.v());
            if (t.v() != null) {
                i = t.v().intValue();
            } else if (i == -1) {
                throw new IOException("no keyLength found in PBKDF2Params");
            }
            if (t.w().t().x(co7.H0)) {
                zn7 zn7Var = new zn7(new gq9());
                zn7Var.g(tr.p(a, a2), t.x(), t.u().intValue());
                return ((lf5) zn7Var.e(i * 8)).a();
            } else if (t.w().t().x(ms6.r)) {
                zn7 zn7Var2 = new zn7(new fq9(512));
                zn7Var2.g(tr.p(a, a2), t.x(), t.u().intValue());
                return ((lf5) zn7Var2.e(i * 8)).a();
            } else {
                throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD PRF: " + t.w().t());
            }
        } else {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        }
    }

    private xe5 generatePkbdAlgorithmIdentifier(xe5 xe5Var, int i) {
        k kVar = pl6.M;
        boolean x = kVar.x(xe5Var.t());
        h0 v = xe5Var.v();
        if (x) {
            vx9 v2 = vx9.v(v);
            byte[] bArr = new byte[v2.z().length];
            getDefaultSecureRandom().nextBytes(bArr);
            return new xe5(kVar, new vx9(bArr, v2.u(), v2.t(), v2.x(), BigInteger.valueOf(i)));
        }
        gn7 t = gn7.t(v);
        byte[] bArr2 = new byte[t.x().length];
        getDefaultSecureRandom().nextBytes(bArr2);
        return new xe5(co7.u0, new gn7(bArr2, t.u().intValue(), i, t.w()));
    }

    private eb generateSignatureAlgId(Key key, s40.d dVar) throws IOException {
        if (key == null) {
            return null;
        }
        if (key instanceof ua3) {
            if (dVar == s40.d.SHA512withECDSA) {
                return new eb(oac.H3);
            }
            if (dVar == s40.d.SHA3_512withECDSA) {
                return new eb(ms6.i0);
            }
        }
        if (key instanceof DSAKey) {
            if (dVar == s40.d.SHA512withDSA) {
                return new eb(ms6.a0);
            }
            if (dVar == s40.d.SHA3_512withDSA) {
                return new eb(ms6.e0);
            }
        }
        if (key instanceof RSAKey) {
            if (dVar == s40.d.SHA512withRSA) {
                return new eb(co7.g0, q0.a);
            }
            if (dVar == s40.d.SHA3_512withRSA) {
                return new eb(ms6.m0, q0.a);
            }
        }
        throw new IOException("unknown signature algorithm");
    }

    private SecureRandom getDefaultSecureRandom() {
        return b32.b();
    }

    private kh3 getEncryptedObjectStoreData(eb ebVar, char[] cArr) throws IOException, NoSuchAlgorithmException {
        s47[] s47VarArr = (s47[]) this.entries.values().toArray(new s47[this.entries.size()]);
        xe5 generatePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(this.hmacPkbdAlgorithm, 32);
        if (cArr == null) {
            cArr = new char[0];
        }
        byte[] generateKey = generateKey(generatePkbdAlgorithmIdentifier, "STORE_ENCRYPTION", cArr, 32);
        i57 i57Var = new i57(ebVar, this.creationDate, this.lastModifiedDate, new t47(s47VarArr), null);
        try {
            k kVar = this.storeEncryptionAlgorithm;
            k kVar2 = ms6.T;
            if (kVar.x(kVar2)) {
                Cipher createCipher = createCipher("AES/CCM/NoPadding", generateKey);
                return new kh3(new eb(co7.t0, new zm7(generatePkbdAlgorithmIdentifier, new uh3(kVar2, wk0.u(createCipher.getParameters().getEncoded())))), createCipher.doFinal(i57Var.getEncoded()));
            }
            return new kh3(new eb(co7.t0, new zm7(generatePkbdAlgorithmIdentifier, new uh3(ms6.U))), createCipher("AESKWP", generateKey).doFinal(i57Var.getEncoded()));
        } catch (InvalidKeyException e) {
            throw new IOException(e.toString());
        } catch (NoSuchProviderException e2) {
            throw new IOException(e2.toString());
        } catch (BadPaddingException e3) {
            throw new IOException(e3.toString());
        } catch (IllegalBlockSizeException e4) {
            throw new IOException(e4.toString());
        } catch (NoSuchPaddingException e5) {
            throw new NoSuchAlgorithmException(e5.toString());
        }
    }

    private static String getPublicKeyAlg(k kVar) {
        String str = publicAlgMap.get(kVar);
        if (str != null) {
            return str;
        }
        return kVar.H();
    }

    private boolean isSimilarHmacPbkd(hn7 hn7Var, xe5 xe5Var) {
        if (!hn7Var.a().x(xe5Var.t())) {
            return false;
        }
        if (pl6.M.x(xe5Var.t())) {
            if (!(hn7Var instanceof tx9)) {
                return false;
            }
            tx9 tx9Var = (tx9) hn7Var;
            vx9 v = vx9.v(xe5Var.v());
            if (tx9Var.e() != v.z().length || tx9Var.b() != v.t().intValue() || tx9Var.c() != v.u().intValue() || tx9Var.d() != v.x().intValue()) {
                return false;
            }
            return true;
        } else if (!(hn7Var instanceof dn7)) {
            return false;
        } else {
            dn7 dn7Var = (dn7) hn7Var;
            gn7 t = gn7.t(xe5Var.v());
            if (dn7Var.d() != t.x().length || dn7Var.b() != t.u().intValue()) {
                return false;
            }
            return true;
        }
    }

    private void verifyMac(byte[] bArr, ix7 ix7Var, char[] cArr) throws NoSuchAlgorithmException, IOException, NoSuchProviderException {
        if (tr.u(calculateMac(bArr, ix7Var.v(), ix7Var.w(), cArr), ix7Var.u())) {
            return;
        }
        throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed");
    }

    private void verifySig(h0 h0Var, kka kkaVar, PublicKey publicKey) throws GeneralSecurityException, IOException {
        Signature createSignature = this.helper.createSignature(kkaVar.w().t().H());
        createSignature.initVerify(publicKey);
        createSignature.update(h0Var.f().p("DER"));
        if (createSignature.verify(kkaVar.v().F())) {
            return;
        }
        throw new IOException("BCFKS KeyStore corrupted: signature calculation failed");
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        final Iterator it = new HashSet(this.entries.keySet()).iterator();
        return new Enumeration() { // from class: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.1
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return it.next();
            }
        };
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        if (str != null) {
            return this.entries.containsKey(str);
        }
        throw new NullPointerException("alias value is null");
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        if (this.entries.get(str) == null) {
            return;
        }
        this.privateKeyCache.remove(str);
        this.entries.remove(str);
        this.lastModifiedDate = new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        s47 s47Var = this.entries.get(str);
        if (s47Var != null) {
            if (!s47Var.z().equals(PRIVATE_KEY) && !s47Var.z().equals(PROTECTED_PRIVATE_KEY)) {
                if (s47Var.z().equals(CERTIFICATE)) {
                    return decodeCertificate(s47Var.u());
                }
                return null;
            }
            return decodeCertificate(lh3.v(s47Var.u()).t()[0]);
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        if (certificate == null) {
            return null;
        }
        try {
            byte[] encoded = certificate.getEncoded();
            for (String str : this.entries.keySet()) {
                s47 s47Var = this.entries.get(str);
                if (s47Var.z().equals(CERTIFICATE)) {
                    if (tr.c(s47Var.u(), encoded)) {
                        return str;
                    }
                } else if (s47Var.z().equals(PRIVATE_KEY) || s47Var.z().equals(PROTECTED_PRIVATE_KEY)) {
                    try {
                        if (tr.c(lh3.v(s47Var.u()).t()[0].f().getEncoded(), encoded)) {
                            return str;
                        }
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (CertificateEncodingException unused2) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        s47 s47Var = this.entries.get(str);
        if (s47Var != null) {
            if (s47Var.z().equals(PRIVATE_KEY) || s47Var.z().equals(PROTECTED_PRIVATE_KEY)) {
                bu0[] t = lh3.v(s47Var.u()).t();
                int length = t.length;
                X509Certificate[] x509CertificateArr = new X509Certificate[length];
                for (int i = 0; i != length; i++) {
                    x509CertificateArr[i] = decodeCertificate(t[i]);
                }
                return x509CertificateArr;
            }
            return null;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        s47 s47Var = this.entries.get(str);
        if (s47Var != null) {
            try {
                return s47Var.x().G();
            } catch (ParseException unused) {
                return new Date();
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        s47 s47Var = this.entries.get(str);
        if (s47Var != null) {
            if (!s47Var.z().equals(PRIVATE_KEY) && !s47Var.z().equals(PROTECTED_PRIVATE_KEY)) {
                if (!s47Var.z().equals(SECRET_KEY) && !s47Var.z().equals(PROTECTED_SECRET_KEY)) {
                    throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): type not recognized");
                }
                nh3 u = nh3.u(s47Var.u());
                try {
                    r2a t = r2a.t(decryptData("SECRET_KEY_ENCRYPTION", u.v(), cArr, u.t()));
                    return this.helper.c(t.u().H()).generateSecret(new SecretKeySpec(t.v(), t.u().H()));
                } catch (Exception e) {
                    throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): " + e.getMessage());
                }
            }
            PrivateKey privateKey = this.privateKeyCache.get(str);
            if (privateKey != null) {
                return privateKey;
            }
            mh3 v = mh3.v(lh3.v(s47Var.u()).u());
            try {
                dk8 u2 = dk8.u(decryptData("PRIVATE_KEY_ENCRYPTION", v.u(), cArr, v.t()));
                PrivateKey generatePrivate = this.helper.d(getPublicKeyAlg(u2.w().t())).generatePrivate(new PKCS8EncodedKeySpec(u2.getEncoded()));
                this.privateKeyCache.put(str, generatePrivate);
                return generatePrivate;
            } catch (Exception e2) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover private key (" + str + "): " + e2.getMessage());
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        s47 s47Var = this.entries.get(str);
        if (s47Var != null) {
            return s47Var.z().equals(CERTIFICATE);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        s47 s47Var = this.entries.get(str);
        if (s47Var == null) {
            return false;
        }
        BigInteger z = s47Var.z();
        if (!z.equals(PRIVATE_KEY) && !z.equals(SECRET_KEY) && !z.equals(PROTECTED_PRIVATE_KEY) && !z.equals(PROTECTED_SECRET_KEY)) {
            return false;
        }
        return true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        eb w;
        i57 u;
        this.entries.clear();
        this.privateKeyCache.clear();
        this.creationDate = null;
        this.lastModifiedDate = null;
        this.hmacAlgorithm = null;
        if (inputStream == null) {
            Date date = new Date();
            this.creationDate = date;
            this.lastModifiedDate = date;
            this.verificationKey = null;
            this.hmacAlgorithm = new eb(co7.H0, q0.a);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(co7.u0, 64);
            return;
        }
        try {
            h57 t = h57.t(new h(inputStream).l());
            j57 u2 = t.u();
            if (u2.v() == 0) {
                ix7 t2 = ix7.t(u2.u());
                this.hmacAlgorithm = t2.v();
                this.hmacPkbdAlgorithm = t2.w();
                w = this.hmacAlgorithm;
                try {
                    verifyMac(t.v().f().getEncoded(), t2, cArr);
                } catch (NoSuchProviderException e) {
                    throw new IOException(e.getMessage());
                }
            } else if (u2.v() != 1) {
                throw new IOException("BCFKS KeyStore unable to recognize integrity check.");
            } else {
                kka u3 = kka.u(u2.u());
                w = u3.w();
                try {
                    u3.t();
                    verifySig(t.v(), u3, this.verificationKey);
                } catch (GeneralSecurityException e2) {
                    throw new IOException("error verifying signature: " + e2.getMessage(), e2);
                }
            }
            h0 v = t.v();
            if (v instanceof kh3) {
                kh3 kh3Var = (kh3) v;
                u = i57.u(decryptData("STORE_ENCRYPTION", kh3Var.u(), cArr, kh3Var.t().F()));
            } else {
                u = i57.u(v);
            }
            try {
                this.creationDate = u.t().G();
                this.lastModifiedDate = u.w().G();
                if (!u.v().equals(w)) {
                    throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
                }
                Iterator<h0> it = u.x().iterator();
                while (it.hasNext()) {
                    s47 w2 = s47.w(it.next());
                    this.entries.put(w2.v(), w2);
                }
            } catch (ParseException unused) {
                throw new IOException("BCFKS KeyStore unable to parse store data information.");
            }
        } catch (Exception e3) {
            throw new IOException(e3.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        Date date;
        s47 s47Var = this.entries.get(str);
        Date date2 = new Date();
        if (s47Var != null) {
            if (s47Var.z().equals(CERTIFICATE)) {
                date = extractCreationDate(s47Var, date2);
            } else {
                throw new KeyStoreException("BCFKS KeyStore already has a key entry with alias " + str);
            }
        } else {
            date = date2;
        }
        try {
            this.entries.put(str, new s47(CERTIFICATE, str, date, date2, certificate.getEncoded(), null));
            this.lastModifiedDate = date2;
        } catch (CertificateEncodingException e) {
            throw new ExtKeyStoreException("BCFKS KeyStore unable to handle certificate: " + e.getMessage(), e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        r2a r2aVar;
        nh3 nh3Var;
        mh3 mh3Var;
        Date date = new Date();
        s47 s47Var = this.entries.get(str);
        Date extractCreationDate = s47Var != null ? extractCreationDate(s47Var, date) : date;
        this.privateKeyCache.remove(str);
        if (key instanceof PrivateKey) {
            if (certificateArr == null) {
                throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
            }
            try {
                byte[] encoded = key.getEncoded();
                xe5 generatePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(co7.u0, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] generateKey = generateKey(generatePkbdAlgorithmIdentifier, "PRIVATE_KEY_ENCRYPTION", cArr, 32);
                k kVar = this.storeEncryptionAlgorithm;
                k kVar2 = ms6.T;
                if (kVar.x(kVar2)) {
                    Cipher createCipher = createCipher("AES/CCM/NoPadding", generateKey);
                    mh3Var = new mh3(new eb(co7.t0, new zm7(generatePkbdAlgorithmIdentifier, new uh3(kVar2, wk0.u(createCipher.getParameters().getEncoded())))), createCipher.doFinal(encoded));
                } else {
                    mh3Var = new mh3(new eb(co7.t0, new zm7(generatePkbdAlgorithmIdentifier, new uh3(ms6.U))), createCipher("AESKWP", generateKey).doFinal(encoded));
                }
                this.entries.put(str, new s47(PRIVATE_KEY, str, extractCreationDate, date, createPrivateKeySequence(mh3Var, certificateArr).getEncoded(), null));
            } catch (Exception e) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e.toString(), e);
            }
        } else if (!(key instanceof SecretKey)) {
            throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
        } else {
            if (certificateArr != null) {
                throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
            }
            try {
                byte[] encoded2 = key.getEncoded();
                xe5 generatePkbdAlgorithmIdentifier2 = generatePkbdAlgorithmIdentifier(co7.u0, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] generateKey2 = generateKey(generatePkbdAlgorithmIdentifier2, "SECRET_KEY_ENCRYPTION", cArr, 32);
                String j = a0b.j(key.getAlgorithm());
                if (j.indexOf("AES") > -1) {
                    r2aVar = new r2a(ms6.w, encoded2);
                } else {
                    Map<String, k> map = oidMap;
                    k kVar3 = map.get(j);
                    if (kVar3 != null) {
                        r2aVar = new r2a(kVar3, encoded2);
                    } else {
                        k kVar4 = map.get(j + "." + (encoded2.length * 8));
                        if (kVar4 == null) {
                            throw new KeyStoreException("BCFKS KeyStore cannot recognize secret key (" + j + ") for storage.");
                        }
                        r2aVar = new r2a(kVar4, encoded2);
                    }
                }
                k kVar5 = this.storeEncryptionAlgorithm;
                k kVar6 = ms6.T;
                if (kVar5.x(kVar6)) {
                    Cipher createCipher2 = createCipher("AES/CCM/NoPadding", generateKey2);
                    nh3Var = new nh3(new eb(co7.t0, new zm7(generatePkbdAlgorithmIdentifier2, new uh3(kVar6, wk0.u(createCipher2.getParameters().getEncoded())))), createCipher2.doFinal(r2aVar.getEncoded()));
                } else {
                    nh3Var = new nh3(new eb(co7.t0, new zm7(generatePkbdAlgorithmIdentifier2, new uh3(ms6.U))), createCipher("AESKWP", generateKey2).doFinal(r2aVar.getEncoded()));
                }
                this.entries.put(str, new s47(SECRET_KEY, str, extractCreationDate, date, nh3Var.getEncoded(), null));
            } catch (Exception e2) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e2.toString(), e2);
            }
        }
        this.lastModifiedDate = date;
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.entries.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        xe5 xe5Var;
        BigInteger v;
        if (this.creationDate == null) {
            throw new IOException("KeyStore not initialized");
        }
        kh3 encryptedObjectStoreData = getEncryptedObjectStoreData(this.hmacAlgorithm, cArr);
        if (pl6.M.x(this.hmacPkbdAlgorithm.t())) {
            vx9 v2 = vx9.v(this.hmacPkbdAlgorithm.v());
            xe5Var = this.hmacPkbdAlgorithm;
            v = v2.w();
        } else {
            gn7 t = gn7.t(this.hmacPkbdAlgorithm.v());
            xe5Var = this.hmacPkbdAlgorithm;
            v = t.v();
        }
        this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(xe5Var, v.intValue());
        try {
            outputStream.write(new h57(encryptedObjectStoreData, new j57(new ix7(this.hmacAlgorithm, this.hmacPkbdAlgorithm, calculateMac(encryptedObjectStoreData.getEncoded(), this.hmacAlgorithm, this.hmacPkbdAlgorithm, cArr)))).getEncoded());
            outputStream.flush();
        } catch (NoSuchProviderException e) {
            throw new IOException("cannot calculate mac: " + e.getMessage());
        }
    }

    private xe5 generatePkbdAlgorithmIdentifier(hn7 hn7Var, int i) {
        k kVar = pl6.M;
        if (kVar.x(hn7Var.a())) {
            tx9 tx9Var = (tx9) hn7Var;
            byte[] bArr = new byte[tx9Var.e()];
            getDefaultSecureRandom().nextBytes(bArr);
            return new xe5(kVar, new vx9(bArr, tx9Var.c(), tx9Var.b(), tx9Var.d(), i));
        }
        dn7 dn7Var = (dn7) hn7Var;
        byte[] bArr2 = new byte[dn7Var.d()];
        getDefaultSecureRandom().nextBytes(bArr2);
        return new xe5(co7.u0, new gn7(bArr2, dn7Var.b(), i, dn7Var.c()));
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else if (!(loadStoreParameter instanceof s40)) {
            if (loadStoreParameter instanceof x40) {
                engineLoad(((x40) loadStoreParameter).a(), ParameterUtil.extractPassword(loadStoreParameter));
                return;
            }
            throw new IllegalArgumentException("no support for 'parameter' of type " + loadStoreParameter.getClass().getName());
        } else {
            s40 s40Var = (s40) loadStoreParameter;
            char[] extractPassword = ParameterUtil.extractPassword(s40Var);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(s40Var.g(), 64);
            this.storeEncryptionAlgorithm = s40Var.e() == s40.b.AES256_CCM ? ms6.T : ms6.U;
            this.hmacAlgorithm = s40Var.f() == s40.c.HmacSHA512 ? new eb(co7.H0, q0.a) : new eb(ms6.r, q0.a);
            this.verificationKey = (PublicKey) s40Var.i();
            s40Var.c();
            this.signatureAlgorithm = generateSignatureAlgId(this.verificationKey, s40Var.h());
            k kVar = this.storeEncryptionAlgorithm;
            InputStream a = s40Var.a();
            engineLoad(a, extractPassword);
            if (a != null) {
                if (!isSimilarHmacPbkd(s40Var.g(), this.hmacPkbdAlgorithm) || !kVar.x(this.storeEncryptionAlgorithm)) {
                    throw new IOException("configuration parameters do not match existing store");
                }
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        Date date = new Date();
        s47 s47Var = this.entries.get(str);
        Date extractCreationDate = s47Var != null ? extractCreationDate(s47Var, date) : date;
        if (certificateArr != null) {
            try {
                mh3 v = mh3.v(bArr);
                try {
                    this.privateKeyCache.remove(str);
                    this.entries.put(str, new s47(PROTECTED_PRIVATE_KEY, str, extractCreationDate, date, createPrivateKeySequence(v, certificateArr).getEncoded(), null));
                } catch (Exception e) {
                    throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e.toString(), e);
                }
            } catch (Exception e2) {
                throw new ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e2);
            }
        } else {
            try {
                this.entries.put(str, new s47(PROTECTED_SECRET_KEY, str, extractCreationDate, date, bArr, null));
            } catch (Exception e3) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e3.toString(), e3);
            }
        }
        this.lastModifiedDate = date;
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
        kka kkaVar;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'parameter' arg cannot be null");
        }
        if (loadStoreParameter instanceof t40) {
            t40 t40Var = (t40) loadStoreParameter;
            char[] extractPassword = ParameterUtil.extractPassword(loadStoreParameter);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(t40Var.b(), 64);
            engineStore(t40Var.a(), extractPassword);
        } else if (!(loadStoreParameter instanceof s40)) {
            if (loadStoreParameter instanceof x40) {
                engineStore(((x40) loadStoreParameter).b(), ParameterUtil.extractPassword(loadStoreParameter));
                return;
            }
            throw new IllegalArgumentException("no support for 'parameter' of type " + loadStoreParameter.getClass().getName());
        } else {
            s40 s40Var = (s40) loadStoreParameter;
            if (s40Var.i() == null) {
                char[] extractPassword2 = ParameterUtil.extractPassword(s40Var);
                this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(s40Var.g(), 64);
                this.storeEncryptionAlgorithm = s40Var.e() == s40.b.AES256_CCM ? ms6.T : ms6.U;
                this.hmacAlgorithm = s40Var.f() == s40.c.HmacSHA512 ? new eb(co7.H0, q0.a) : new eb(ms6.r, q0.a);
                engineStore(s40Var.b(), extractPassword2);
                return;
            }
            this.signatureAlgorithm = generateSignatureAlgId(s40Var.i(), s40Var.h());
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(s40Var.g(), 64);
            this.storeEncryptionAlgorithm = s40Var.e() == s40.b.AES256_CCM ? ms6.T : ms6.U;
            this.hmacAlgorithm = s40Var.f() == s40.c.HmacSHA512 ? new eb(co7.H0, q0.a) : new eb(ms6.r, q0.a);
            kh3 encryptedObjectStoreData = getEncryptedObjectStoreData(this.signatureAlgorithm, ParameterUtil.extractPassword(s40Var));
            try {
                Signature createSignature = this.helper.createSignature(this.signatureAlgorithm.t().H());
                createSignature.initSign((PrivateKey) s40Var.i());
                createSignature.update(encryptedObjectStoreData.getEncoded());
                X509Certificate[] d = s40Var.d();
                if (d != null) {
                    int length = d.length;
                    bu0[] bu0VarArr = new bu0[length];
                    for (int i = 0; i != length; i++) {
                        bu0VarArr[i] = bu0.u(d[i].getEncoded());
                    }
                    kkaVar = new kka(this.signatureAlgorithm, bu0VarArr, createSignature.sign());
                } else {
                    kkaVar = new kka(this.signatureAlgorithm, createSignature.sign());
                }
                s40Var.b().write(new h57(encryptedObjectStoreData, new j57(kkaVar)).getEncoded());
                s40Var.b().flush();
            } catch (GeneralSecurityException e) {
                throw new IOException("error creating signature: " + e.getMessage(), e);
            }
        }
    }

    private xe5 generatePkbdAlgorithmIdentifier(k kVar, int i) {
        byte[] bArr = new byte[64];
        getDefaultSecureRandom().nextBytes(bArr);
        k kVar2 = co7.u0;
        if (kVar2.x(kVar)) {
            return new xe5(kVar2, new gn7(bArr, 51200, i, new eb(co7.H0, q0.a)));
        }
        throw new IllegalStateException("unknown derivation algorithm: " + kVar);
    }
}
