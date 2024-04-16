package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
/* loaded from: classes3.dex */
public final class AES {
    private static final Map<String, String> generalAesAttributes;

    /* loaded from: classes3.dex */
    public static class AESCCMMAC extends BaseMac {

        /* loaded from: classes3.dex */
        private static class CCMMac implements x36 {
            private final vk0 ccm;
            private int macLength;

            private CCMMac() {
                this.ccm = new vk0(new q());
                this.macLength = 8;
            }

            @Override // defpackage.x36
            public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
                try {
                    return this.ccm.doFinal(bArr, 0);
                } catch (InvalidCipherTextException e) {
                    throw new IllegalStateException("exception on doFinal(): " + e.toString());
                }
            }

            @Override // defpackage.x36
            public String getAlgorithmName() {
                return this.ccm.getAlgorithmName() + "Mac";
            }

            @Override // defpackage.x36
            public int getMacSize() {
                return this.macLength;
            }

            @Override // defpackage.x36
            public void init(v71 v71Var) throws IllegalArgumentException {
                this.ccm.init(true, v71Var);
                this.macLength = this.ccm.a().length;
            }

            @Override // defpackage.x36
            public void reset() {
                this.ccm.i();
            }

            @Override // defpackage.x36
            public void update(byte b) throws IllegalStateException {
                this.ccm.g(b);
            }

            @Override // defpackage.x36
            public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
                this.ccm.b(bArr, i, i2);
            }
        }

        public AESCCMMAC() {
            super(new CCMMac());
        }
    }

    /* loaded from: classes3.dex */
    public static class AESCMAC extends BaseMac {
        public AESCMAC() {
            super(new cl0(new q()));
        }
    }

    /* loaded from: classes3.dex */
    public static class AESGMAC extends BaseMac {
        public AESGMAC() {
            super(new ra4(new z94(new q())));
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = b32.b();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("AES");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamGenCCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("CCM");
                createParametersInstance.init(new wk0(bArr, 12).getEncoded());
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamGenGCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("GCM");
                createParametersInstance.init(new ca4(bArr, 16).getEncoded());
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "AES IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamsCCM extends BaseAlgorithmParameters {
        private wk0 ccmParams;

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() throws IOException {
            return this.ccmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.ccmParams = wk0.u(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else if (algorithmParameterSpec instanceof o) {
                o oVar = (o) algorithmParameterSpec;
                this.ccmParams = new wk0(oVar.c(), oVar.b() / 8);
            } else {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "CCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls != AlgorithmParameterSpec.class && !GcmSpecUtil.isGcmSpec(cls)) {
                if (cls == o.class) {
                    return new o(this.ccmParams.v(), this.ccmParams.t() * 8);
                }
                if (cls == IvParameterSpec.class) {
                    return new IvParameterSpec(this.ccmParams.v());
                }
                throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
            } else if (GcmSpecUtil.gcmSpecExists()) {
                return GcmSpecUtil.extractGcmSpec(this.ccmParams.f());
            } else {
                return new o(this.ccmParams.v(), this.ccmParams.t() * 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.ccmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws IOException {
            this.ccmParams = wk0.u(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.ccmParams = wk0.u(bArr);
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamsGCM extends BaseAlgorithmParameters {
        private ca4 gcmParams;

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() throws IOException {
            return this.gcmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.gcmParams = GcmSpecUtil.extractGcmParameters(algorithmParameterSpec);
            } else if (algorithmParameterSpec instanceof o) {
                o oVar = (o) algorithmParameterSpec;
                this.gcmParams = new ca4(oVar.c(), oVar.b() / 8);
            } else {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "GCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls != AlgorithmParameterSpec.class && !GcmSpecUtil.isGcmSpec(cls)) {
                if (cls == o.class) {
                    return new o(this.gcmParams.v(), this.gcmParams.t() * 8);
                }
                if (cls == IvParameterSpec.class) {
                    return new IvParameterSpec(this.gcmParams.v());
                }
                throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
            } else if (GcmSpecUtil.gcmSpecExists()) {
                return GcmSpecUtil.extractGcmSpec(this.gcmParams.f());
            } else {
                return new o(this.gcmParams.v(), this.gcmParams.t() * 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.gcmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws IOException {
            this.gcmParams = ca4.u(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.gcmParams = ca4.u(bArr);
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new tk0(new q()), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((m) new vk0(new q()), false, 12);
        }
    }

    /* loaded from: classes3.dex */
    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new ch0(new yk0(new q(), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public xc0 get() {
                    return new q();
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(new z94(new q()));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("AES", null);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(192);
        }

        public KeyGen(int i) {
            super("AES", i, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = AES.class.getName();
        private static final String wrongAES128 = "2.16.840.1.101.3.4.2";
        private static final String wrongAES192 = "2.16.840.1.101.3.4.22";
        private static final String wrongAES256 = "2.16.840.1.101.3.4.42";

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.AES", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.AlgorithmParameters.");
            k kVar = ms6.y;
            sb2.append(kVar);
            configurableProvider.addAlgorithm(sb2.toString(), "AES");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.AlgorithmParameters.");
            k kVar2 = ms6.G;
            sb3.append(kVar2);
            configurableProvider.addAlgorithm(sb3.toString(), "AES");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Alg.Alias.AlgorithmParameters.");
            k kVar3 = ms6.O;
            sb4.append(kVar3);
            configurableProvider.addAlgorithm(sb4.toString(), "AES");
            configurableProvider.addAlgorithm("AlgorithmParameters.GCM", str + "$AlgParamsGCM");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Alg.Alias.AlgorithmParameters.");
            k kVar4 = ms6.C;
            sb5.append(kVar4);
            configurableProvider.addAlgorithm(sb5.toString(), "GCM");
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Alg.Alias.AlgorithmParameters.");
            k kVar5 = ms6.K;
            sb6.append(kVar5);
            configurableProvider.addAlgorithm(sb6.toString(), "GCM");
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Alg.Alias.AlgorithmParameters.");
            k kVar6 = ms6.S;
            sb7.append(kVar6);
            configurableProvider.addAlgorithm(sb7.toString(), "GCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.CCM", str + "$AlgParamsCCM");
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Alg.Alias.AlgorithmParameters.");
            k kVar7 = ms6.D;
            sb8.append(kVar7);
            configurableProvider.addAlgorithm(sb8.toString(), "CCM");
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Alg.Alias.AlgorithmParameters.");
            k kVar8 = ms6.L;
            sb9.append(kVar8);
            configurableProvider.addAlgorithm(sb9.toString(), "CCM");
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Alg.Alias.AlgorithmParameters.");
            k kVar9 = ms6.T;
            sb10.append(kVar9);
            configurableProvider.addAlgorithm(sb10.toString(), "CCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.AES", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar, "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar2, "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar3, "AES");
            configurableProvider.addAttributes("Cipher.AES", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.AES", str + "$ECB");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            k kVar10 = ms6.x;
            configurableProvider.addAlgorithm("Cipher", kVar10, str + "$ECB");
            k kVar11 = ms6.F;
            configurableProvider.addAlgorithm("Cipher", kVar11, str + "$ECB");
            k kVar12 = ms6.N;
            configurableProvider.addAlgorithm("Cipher", kVar12, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", kVar, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", kVar2, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", kVar3, str + "$CBC");
            k kVar13 = ms6.z;
            configurableProvider.addAlgorithm("Cipher", kVar13, str + "$OFB");
            k kVar14 = ms6.H;
            configurableProvider.addAlgorithm("Cipher", kVar14, str + "$OFB");
            k kVar15 = ms6.P;
            configurableProvider.addAlgorithm("Cipher", kVar15, str + "$OFB");
            k kVar16 = ms6.A;
            configurableProvider.addAlgorithm("Cipher", kVar16, str + "$CFB");
            k kVar17 = ms6.I;
            configurableProvider.addAlgorithm("Cipher", kVar17, str + "$CFB");
            k kVar18 = ms6.Q;
            configurableProvider.addAlgorithm("Cipher", kVar18, str + "$CFB");
            configurableProvider.addAttributes("Cipher.AESWRAP", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.AESWRAP", str + "$Wrap");
            k kVar19 = ms6.B;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar19, "AESWRAP");
            k kVar20 = ms6.J;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar20, "AESWRAP");
            k kVar21 = ms6.R;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar21, "AESWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKW", "AESWRAP");
            configurableProvider.addAttributes("Cipher.AESWRAPPAD", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.AESWRAPPAD", str + "$WrapPad");
            k kVar22 = ms6.E;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar22, "AESWRAPPAD");
            k kVar23 = ms6.M;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar23, "AESWRAPPAD");
            k kVar24 = ms6.U;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar24, "AESWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD");
            configurableProvider.addAlgorithm("Cipher.AESRFC3211WRAP", str + "$RFC3211Wrap");
            configurableProvider.addAlgorithm("Cipher.AESRFC5649WRAP", str + "$RFC5649Wrap");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.CCM", str + "$AlgParamGenCCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar7, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar8, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar9, "CCM");
            configurableProvider.addAttributes("Cipher.CCM", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.CCM", str + "$CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar7, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar8, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar9, "CCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GCM", str + "$AlgParamGenGCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar4, "GCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar5, "GCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar6, "GCM");
            configurableProvider.addAttributes("Cipher.GCM", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.GCM", str + "$GCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar4, "GCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar5, "GCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar6, "GCM");
            configurableProvider.addAlgorithm("KeyGenerator.AES", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.2", str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.22", str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.42", str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar10, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar13, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar16, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar11, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar2, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar14, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar17, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar12, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar3, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar15, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar18, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator.AESWRAP", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", kVar19, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar20, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar21, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar4, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar5, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar6, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar7, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar8, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar9, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator.AESWRAPPAD", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", kVar22, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar23, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar24, str + "$KeyGen256");
            configurableProvider.addAlgorithm("Mac.AESCMAC", str + "$AESCMAC");
            configurableProvider.addAlgorithm("Mac.AESCCMMAC", str + "$AESCCMMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + kVar7.H(), "AESCCMMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + kVar8.H(), "AESCCMMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + kVar9.H(), "AESCCMMAC");
            k kVar25 = e50.l;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar25, "PBEWITHSHAAND128BITAES-CBC-BC");
            k kVar26 = e50.m;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar26, "PBEWITHSHAAND192BITAES-CBC-BC");
            k kVar27 = e50.n;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar27, "PBEWITHSHAAND256BITAES-CBC-BC");
            k kVar28 = e50.o;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            k kVar29 = e50.p;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            k kVar30 = e50.q;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar30, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", str + "$PBEWithSHA1AESCBC128");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", str + "$PBEWithSHA1AESCBC192");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", str + "$PBEWithSHA1AESCBC256");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", str + "$PBEWithSHA256AESCBC128");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", str + "$PBEWithSHA256AESCBC192");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", str + "$PBEWithSHA256AESCBC256");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", str + "$PBEWithAESCBC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", str + "$PBEWithAESCBC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", str + "$PBEWithAESCBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.AES", str + "$KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory", ms6.w, str + "$KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", str + "$PBEWithMD5And128BitAESCBCOpenSSL");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", str + "$PBEWithMD5And192BitAESCBCOpenSSL");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", str + "$PBEWithMD5And256BitAESCBCOpenSSL");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", str + "$PBEWithSHAAnd128BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", str + "$PBEWithSHAAnd192BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", str + "$PBEWithSHAAnd256BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", str + "$PBEWithSHA256And128BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", str + "$PBEWithSHA256And192BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", str + "$PBEWithSHA256And256BitAESBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar25, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar26, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar27, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar30, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar25.H(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar26.H(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar27.H(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar28.H(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar29.H(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar30.H(), "PKCS12PBE");
            addGMacAlgorithm(configurableProvider, "AES", str + "$AESGMAC", str + "$KeyGen128");
            addPoly1305Algorithm(configurableProvider, "AES", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes3.dex */
    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new ch0(new e47(new q(), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithAESCBC extends BaseBlockCipher {
        public PBEWithAESCBC() {
            super(new tk0(new q()));
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, 192, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, 256, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA1AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC128() {
            super(new tk0(new q()), 2, 1, 128, 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA1AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC192() {
            super(new tk0(new q()), 2, 1, 192, 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA1AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC256() {
            super(new tk0(new q()), 2, 1, 256, 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA256AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC128() {
            super(new tk0(new q()), 2, 4, 128, 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA256AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC192() {
            super(new tk0(new q()), 2, 4, 192, 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA256AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC256() {
            super(new tk0(new q()), 2, 4, 256, 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, 192, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, 256, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, 192, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, 256, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new pe8(new q()));
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-AES", 256, new re8());
        }
    }

    /* loaded from: classes3.dex */
    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new y29(new q()), 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class RFC5649Wrap extends BaseWrapCipher {
        public RFC5649Wrap() {
            super(new b39(new q()));
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new r());
        }
    }

    /* loaded from: classes3.dex */
    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new s());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        generalAesAttributes = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        hashMap.put("SupportedKeyFormats", "RAW");
    }

    private AES() {
    }
}
