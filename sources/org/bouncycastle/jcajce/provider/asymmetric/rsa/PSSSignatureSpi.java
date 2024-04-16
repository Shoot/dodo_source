package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import ch.qos.logback.core.joran.action.ActionConst;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
/* loaded from: classes3.dex */
public class PSSSignatureSpi extends SignatureSpi {
    private e23 contentDigest;
    private AlgorithmParameters engineParams;
    private final d95 helper;
    private boolean isInitState;
    private boolean isRaw;
    private n39 key;
    private e23 mgfDigest;
    private PSSParameterSpec originalSpec;
    private PSSParameterSpec paramSpec;
    private lo7 pss;
    private SecureRandom random;
    private int saltLength;
    private rx signer;
    private byte trailer;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class NullPssDigest implements e23 {
        private e23 baseDigest;
        private ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        private boolean oddTime = true;

        public NullPssDigest(e23 e23Var) {
            this.baseDigest = e23Var;
        }

        @Override // defpackage.e23
        public int doFinal(byte[] bArr, int i) {
            byte[] byteArray = this.bOut.toByteArray();
            if (this.oddTime) {
                System.arraycopy(byteArray, 0, bArr, i, byteArray.length);
            } else {
                this.baseDigest.update(byteArray, 0, byteArray.length);
                this.baseDigest.doFinal(bArr, i);
            }
            reset();
            this.oddTime = !this.oddTime;
            return byteArray.length;
        }

        @Override // defpackage.e23
        public String getAlgorithmName() {
            return ActionConst.NULL;
        }

        public int getByteLength() {
            return 0;
        }

        @Override // defpackage.e23
        public int getDigestSize() {
            return this.baseDigest.getDigestSize();
        }

        @Override // defpackage.e23
        public void reset() {
            this.bOut.reset();
            this.baseDigest.reset();
        }

        @Override // defpackage.e23
        public void update(byte b) {
            this.bOut.write(b);
        }

        @Override // defpackage.e23
        public void update(byte[] bArr, int i, int i2) {
            this.bOut.write(bArr, i, i2);
        }
    }

    /* loaded from: classes3.dex */
    public static class PSSwithRSA extends PSSSignatureSpi {
        public PSSwithRSA() {
            super(new g39(), null);
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA1withRSA extends PSSSignatureSpi {
        public SHA1withRSA() {
            super(new g39(), PSSParameterSpec.DEFAULT);
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA1withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA1withRSAandSHAKE128() {
            super(new g39(), new PSSParameterSpec("SHA1", "SHAKE128", null, 20, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA1withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA1withRSAandSHAKE256() {
            super(new g39(), new PSSParameterSpec("SHA1", "SHAKE256", null, 20, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA224withRSA extends PSSSignatureSpi {
        public SHA224withRSA() {
            super(new g39(), new PSSParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA224withRSAandSHAKE128() {
            super(new g39(), new PSSParameterSpec("SHA-224", "SHAKE128", null, 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA224withRSAandSHAKE256() {
            super(new g39(), new PSSParameterSpec("SHA-224", "SHAKE256", null, 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA256withRSA extends PSSSignatureSpi {
        public SHA256withRSA() {
            super(new g39(), new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA256withRSAandSHAKE128() {
            super(new g39(), new PSSParameterSpec("SHA-256", "SHAKE128", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA256withRSAandSHAKE256() {
            super(new g39(), new PSSParameterSpec("SHA-256", "SHAKE256", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA384withRSA extends PSSSignatureSpi {
        public SHA384withRSA() {
            super(new g39(), new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA384withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA384withRSAandSHAKE128() {
            super(new g39(), new PSSParameterSpec("SHA-384", "SHAKE128", null, 48, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA384withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA384withRSAandSHAKE256() {
            super(new g39(), new PSSParameterSpec("SHA-384", "SHAKE256", null, 48, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_224withRSA extends PSSSignatureSpi {
        public SHA3_224withRSA() {
            super(new g39(), new PSSParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_224withRSAandSHAKE128() {
            super(new g39(), new PSSParameterSpec("SHA3-224", "SHAKE128", null, 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_224withRSAandSHAKE256() {
            super(new g39(), new PSSParameterSpec("SHA3-224", "SHAKE256", null, 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_256withRSA extends PSSSignatureSpi {
        public SHA3_256withRSA() {
            super(new g39(), new PSSParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_256withRSAandSHAKE128() {
            super(new g39(), new PSSParameterSpec("SHA3-256", "SHAKE128", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_256withRSAandSHAKE256() {
            super(new g39(), new PSSParameterSpec("SHA3-256", "SHAKE256", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_384withRSA extends PSSSignatureSpi {
        public SHA3_384withRSA() {
            super(new g39(), new PSSParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), 48, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_384withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_384withRSAandSHAKE128() {
            super(new g39(), new PSSParameterSpec("SHA3-384", "SHAKE128", null, 48, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_384withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_384withRSAandSHAKE256() {
            super(new g39(), new PSSParameterSpec("SHA3-384", "SHAKE256", null, 48, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_512withRSA extends PSSSignatureSpi {
        public SHA3_512withRSA() {
            super(new g39(), new PSSParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_512withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_512withRSAandSHAKE128() {
            super(new g39(), new PSSParameterSpec("SHA3-512", "SHAKE128", null, 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_512withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_512withRSAandSHAKE256() {
            super(new g39(), new PSSParameterSpec("SHA3-512", "SHAKE256", null, 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_224withRSA extends PSSSignatureSpi {
        public SHA512_224withRSA() {
            super(new g39(), new PSSParameterSpec("SHA-512(224)", "MGF1", new MGF1ParameterSpec("SHA-512(224)"), 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512_224withRSAandSHAKE128() {
            super(new g39(), new PSSParameterSpec("SHA-512(224)", "SHAKE128", null, 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512_224withRSAandSHAKE256() {
            super(new g39(), new PSSParameterSpec("SHA-512(224)", "SHAKE256", null, 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_256withRSA extends PSSSignatureSpi {
        public SHA512_256withRSA() {
            super(new g39(), new PSSParameterSpec("SHA-512(256)", "MGF1", new MGF1ParameterSpec("SHA-512(256)"), 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512_256withRSAandSHAKE128() {
            super(new g39(), new PSSParameterSpec("SHA-512(256)", "SHAKE128", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512_256withRSAandSHAKE256() {
            super(new g39(), new PSSParameterSpec("SHA-512(256)", "SHAKE256", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512withRSA extends PSSSignatureSpi {
        public SHA512withRSA() {
            super(new g39(), new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512withRSAandSHAKE128() {
            super(new g39(), new PSSParameterSpec("SHA-512", "SHAKE128", null, 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512withRSAandSHAKE256() {
            super(new g39(), new PSSParameterSpec("SHA-512", "SHAKE256", null, 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHAKE128WithRSAPSS extends PSSSignatureSpi {
        public SHAKE128WithRSAPSS() {
            super(new g39(), new PSSParameterSpec("SHAKE128", "SHAKE128", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHAKE256WithRSAPSS extends PSSSignatureSpi {
        public SHAKE256WithRSAPSS() {
            super(new g39(), new PSSParameterSpec("SHAKE256", "SHAKE256", null, 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class nonePSS extends PSSSignatureSpi {
        public nonePSS() {
            super(new g39(), null, true);
        }
    }

    protected PSSSignatureSpi(rx rxVar, PSSParameterSpec pSSParameterSpec) {
        this(rxVar, pSSParameterSpec, false);
    }

    private byte getTrailer(int i) {
        if (i == 1) {
            return (byte) -68;
        }
        throw new IllegalArgumentException("unknown trailer field");
    }

    private void setupContentDigest() {
        e23 digest;
        if (this.isRaw) {
            digest = new NullPssDigest(this.mgfDigest);
        } else {
            digest = DigestFactory.getDigest(this.paramSpec.getDigestAlgorithm());
        }
        this.contentDigest = digest;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        PSSParameterSpec pSSParameterSpec;
        if (this.engineParams == null && (pSSParameterSpec = this.paramSpec) != null) {
            if (pSSParameterSpec.getDigestAlgorithm().equals(this.paramSpec.getMGFAlgorithm()) && this.paramSpec.getMGFParameters() == null) {
                return null;
            }
            try {
                AlgorithmParameters g = this.helper.g("PSS");
                this.engineParams = g;
                g.init(this.paramSpec);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        }
        this.key = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey);
        lo7 lo7Var = new lo7(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
        this.pss = lo7Var;
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            lo7Var.init(true, new qq7(this.key, secureRandom));
        } else {
            lo7Var.init(true, this.key);
        }
        this.isInitState = true;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof RSAPublicKey) {
            this.key = RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey);
            lo7 lo7Var = new lo7(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
            this.pss = lo7Var;
            lo7Var.init(false, this.key);
            this.isInitState = true;
            return;
        }
        throw new InvalidKeyException("Supplied key is not a RSAPublicKey instance");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        this.isInitState = true;
        try {
            return this.pss.b();
        } catch (CryptoException e) {
            throw new SignatureException(e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws SignatureException {
        this.pss.update(b);
        this.isInitState = false;
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        this.isInitState = true;
        return this.pss.a(bArr);
    }

    protected PSSSignatureSpi(rx rxVar, PSSParameterSpec pSSParameterSpec, boolean z) {
        this.helper = new u40();
        this.isInitState = true;
        this.signer = rxVar;
        this.originalSpec = pSSParameterSpec;
        if (pSSParameterSpec == null) {
            this.paramSpec = PSSParameterSpec.DEFAULT;
        } else {
            this.paramSpec = pSSParameterSpec;
        }
        this.mgfDigest = DigestFactory.getDigest("MGF1".equals(this.paramSpec.getMGFAlgorithm()) ? this.paramSpec.getDigestAlgorithm() : this.paramSpec.getMGFAlgorithm());
        this.saltLength = this.paramSpec.getSaltLength();
        this.trailer = getTrailer(this.paramSpec.getTrailerField());
        this.isRaw = z;
        setupContentDigest();
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        String digestAlgorithm;
        lo7 lo7Var;
        boolean z;
        if (algorithmParameterSpec == null && (algorithmParameterSpec = this.originalSpec) == null) {
            return;
        }
        if (!this.isInitState) {
            throw new ProviderException("cannot call setParameter in the middle of update");
        }
        if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
            throw new InvalidAlgorithmParameterException("Only PSSParameterSpec supported");
        }
        PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
        PSSParameterSpec pSSParameterSpec2 = this.originalSpec;
        if (pSSParameterSpec2 != null && !DigestFactory.isSameDigest(pSSParameterSpec2.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException("parameter must be using " + this.originalSpec.getDigestAlgorithm());
        }
        if (pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") || pSSParameterSpec.getMGFAlgorithm().equals(co7.b0.H())) {
            if (!(pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unknown MGF parameters");
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
            if (!DigestFactory.isSameDigest(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                throw new InvalidAlgorithmParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
            }
            digestAlgorithm = mGF1ParameterSpec.getDigestAlgorithm();
        } else if (!pSSParameterSpec.getMGFAlgorithm().equals("SHAKE128") && !pSSParameterSpec.getMGFAlgorithm().equals("SHAKE256")) {
            throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
        } else {
            digestAlgorithm = pSSParameterSpec.getMGFAlgorithm();
        }
        e23 digest = DigestFactory.getDigest(digestAlgorithm);
        if (digest == null) {
            throw new InvalidAlgorithmParameterException("no match on MGF algorithm: " + pSSParameterSpec.getMGFAlgorithm());
        }
        this.engineParams = null;
        this.paramSpec = pSSParameterSpec;
        this.mgfDigest = digest;
        this.saltLength = pSSParameterSpec.getSaltLength();
        this.trailer = getTrailer(this.paramSpec.getTrailerField());
        setupContentDigest();
        if (this.key != null) {
            this.pss = new lo7(this.signer, this.contentDigest, digest, this.saltLength, this.trailer);
            if (this.key.a()) {
                lo7Var = this.pss;
                z = true;
            } else {
                lo7Var = this.pss;
                z = false;
            }
            lo7Var.init(z, this.key);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.pss.update(bArr, i, i2);
        this.isInitState = false;
    }
}
