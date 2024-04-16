package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.k;
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
/* loaded from: classes3.dex */
public final class ARIA {

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
                AlgorithmParameters createParametersInstance = createParametersInstance("ARIA");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for ARIA parameter generation.");
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "ARIA IV";
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
            super(new tk0(new c0()), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((m) new vk0(new c0()), false, 12);
        }
    }

    /* loaded from: classes3.dex */
    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new ch0(new yk0(new c0(), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.ARIA.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public xc0 get() {
                    return new c0();
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(new z94(new c0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new ra4(new z94(new c0())));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("ARIA", null);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("ARIA", i, new t71());
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
        private static final String PREFIX = ARIA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.ARIA", sb.toString());
            k kVar = ns6.h;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", kVar, "ARIA");
            k kVar2 = ns6.m;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", kVar2, "ARIA");
            k kVar3 = ns6.r;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", kVar3, "ARIA");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIA", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar2, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar3, "ARIA");
            k kVar4 = ns6.j;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar4, "ARIA");
            k kVar5 = ns6.o;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar5, "ARIA");
            k kVar6 = ns6.t;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar6, "ARIA");
            k kVar7 = ns6.i;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar7, "ARIA");
            k kVar8 = ns6.n;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar8, "ARIA");
            k kVar9 = ns6.s;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar9, "ARIA");
            configurableProvider.addAlgorithm("Cipher.ARIA", str + "$ECB");
            k kVar10 = ns6.g;
            configurableProvider.addAlgorithm("Cipher", kVar10, str + "$ECB");
            k kVar11 = ns6.l;
            configurableProvider.addAlgorithm("Cipher", kVar11, str + "$ECB");
            k kVar12 = ns6.q;
            configurableProvider.addAlgorithm("Cipher", kVar12, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", kVar, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", kVar2, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", kVar3, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", kVar7, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", kVar8, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", kVar9, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", kVar4, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher", kVar5, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher", kVar6, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher.ARIARFC3211WRAP", str + "$RFC3211Wrap");
            configurableProvider.addAlgorithm("Cipher.ARIAWRAP", str + "$Wrap");
            k kVar13 = ns6.H;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar13, "ARIAWRAP");
            k kVar14 = ns6.I;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar14, "ARIAWRAP");
            k kVar15 = ns6.J;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar15, "ARIAWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.ARIAKW", "ARIAWRAP");
            configurableProvider.addAlgorithm("Cipher.ARIAWRAPPAD", str + "$WrapPad");
            k kVar16 = ns6.K;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar16, "ARIAWRAPPAD");
            k kVar17 = ns6.L;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar17, "ARIAWRAPPAD");
            k kVar18 = ns6.M;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar18, "ARIAWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.ARIAKWP", "ARIAWRAPPAD");
            configurableProvider.addAlgorithm("KeyGenerator.ARIA", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", kVar13, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar14, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar15, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar16, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar17, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar18, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar10, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar11, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar12, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar2, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar3, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar7, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar8, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar9, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar4, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar5, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar6, str + "$KeyGen256");
            k kVar19 = ns6.E;
            configurableProvider.addAlgorithm("KeyGenerator", kVar19, str + "$KeyGen128");
            k kVar20 = ns6.F;
            configurableProvider.addAlgorithm("KeyGenerator", kVar20, str + "$KeyGen192");
            k kVar21 = ns6.G;
            configurableProvider.addAlgorithm("KeyGenerator", kVar21, str + "$KeyGen256");
            k kVar22 = ns6.B;
            configurableProvider.addAlgorithm("KeyGenerator", kVar22, str + "$KeyGen128");
            k kVar23 = ns6.C;
            configurableProvider.addAlgorithm("KeyGenerator", kVar23, str + "$KeyGen192");
            k kVar24 = ns6.D;
            configurableProvider.addAlgorithm("KeyGenerator", kVar24, str + "$KeyGen256");
            configurableProvider.addAlgorithm("SecretKeyFactory.ARIA", str + "$KeyFactory");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar2, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar3, "ARIA");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIACCM", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar19, "ARIACCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar20, "ARIACCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar21, "ARIACCM");
            configurableProvider.addAlgorithm("Cipher.ARIACCM", str + "$CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar19, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar20, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar21, "CCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIAGCM", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar22, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar23, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar24, "ARIAGCM");
            configurableProvider.addAlgorithm("Cipher.ARIAGCM", str + "$GCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar22, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar23, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar24, "ARIAGCM");
            addGMacAlgorithm(configurableProvider, "ARIA", str + "$GMAC", str + "$KeyGen");
            addPoly1305Algorithm(configurableProvider, "ARIA", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes3.dex */
    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new ch0(new e47(new c0(), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new pe8(new c0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-ARIA", 256, new re8());
        }
    }

    /* loaded from: classes3.dex */
    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new y29(new c0()), 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new d0());
        }
    }

    /* loaded from: classes3.dex */
    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new e0());
        }
    }

    private ARIA() {
    }
}
