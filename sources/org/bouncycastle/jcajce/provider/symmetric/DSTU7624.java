package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
/* loaded from: classes3.dex */
public class DSTU7624 {

    /* loaded from: classes3.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        private final int ivLength;

        public AlgParamGen(int i) {
            this.ivLength = i / 8;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[this.ivLength];
            if (this.random == null) {
                this.random = b32.b();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("DSTU7624");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSTU7624 parameter generation.");
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamGen128 extends AlgParamGen {
        public AlgParamGen128() {
            super(128);
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamGen256 extends AlgParamGen {
        public AlgParamGen256() {
            super(256);
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamGen512 extends AlgParamGen {
        public AlgParamGen512() {
            super(512);
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "DSTU7624 IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(new tk0(new s82(128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(new tk0(new s82(256)), 256);
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC512 extends BaseBlockCipher {
        public CBC512() {
            super(new tk0(new s82(512)), 512);
        }
    }

    /* loaded from: classes3.dex */
    public static class CCM128 extends BaseBlockCipher {
        public CCM128() {
            super(new ld5(new s82(128)));
        }
    }

    /* loaded from: classes3.dex */
    public static class CCM256 extends BaseBlockCipher {
        public CCM256() {
            super(new ld5(new s82(256)));
        }
    }

    /* loaded from: classes3.dex */
    public static class CCM512 extends BaseBlockCipher {
        public CCM512() {
            super(new ld5(new s82(512)));
        }
    }

    /* loaded from: classes3.dex */
    public static class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(new ch0(new yk0(new s82(128), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(new ch0(new yk0(new s82(256), 256)), 256);
        }
    }

    /* loaded from: classes3.dex */
    public static class CFB512 extends BaseBlockCipher {
        public CFB512() {
            super(new ch0(new yk0(new s82(512), 512)), 512);
        }
    }

    /* loaded from: classes3.dex */
    public static class CTR128 extends BaseBlockCipher {
        public CTR128() {
            super(new ch0(new md5(new s82(128))), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class CTR256 extends BaseBlockCipher {
        public CTR256() {
            super(new ch0(new md5(new s82(256))), 256);
        }
    }

    /* loaded from: classes3.dex */
    public static class CTR512 extends BaseBlockCipher {
        public CTR512() {
            super(new ch0(new md5(new s82(512))), 512);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.DSTU7624.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public xc0 get() {
                    return new s82(128);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(new s82(128));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(new s82(256));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB512 extends BaseBlockCipher {
        public ECB512() {
            super(new s82(512));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB_128 extends BaseBlockCipher {
        public ECB_128() {
            super(new s82(128));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new s82(256));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new s82(512));
        }
    }

    /* loaded from: classes3.dex */
    public static class GCM128 extends BaseBlockCipher {
        public GCM128() {
            super(new ud5(new s82(128)));
        }
    }

    /* loaded from: classes3.dex */
    public static class GCM256 extends BaseBlockCipher {
        public GCM256() {
            super(new ud5(new s82(256)));
        }
    }

    /* loaded from: classes3.dex */
    public static class GCM512 extends BaseBlockCipher {
        public GCM512() {
            super(new ud5(new s82(512)));
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new zd5(new ud5(new s82(128)), 128));
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC128 extends BaseMac {
        public GMAC128() {
            super(new zd5(new ud5(new s82(128)), 128));
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC256 extends BaseMac {
        public GMAC256() {
            super(new zd5(new ud5(new s82(256)), 256));
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC512 extends BaseMac {
        public GMAC512() {
            super(new zd5(new ud5(new s82(512)), 512));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("DSTU7624", i, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen512 extends KeyGen {
        public KeyGen512() {
            super(512);
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = DSTU7624.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.DSTU7624", sb.toString());
            k kVar = hpb.v;
            configurableProvider.addAlgorithm("AlgorithmParameters", kVar, str + "$AlgParams");
            k kVar2 = hpb.w;
            configurableProvider.addAlgorithm("AlgorithmParameters", kVar2, str + "$AlgParams");
            k kVar3 = hpb.x;
            configurableProvider.addAlgorithm("AlgorithmParameters", kVar3, str + "$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.DSTU7624", str + "$AlgParamGen128");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator", kVar, str + "$AlgParamGen128");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator", kVar2, str + "$AlgParamGen256");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator", kVar3, str + "$AlgParamGen512");
            configurableProvider.addAlgorithm("Cipher.DSTU7624", str + "$ECB_128");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-128", str + "$ECB_128");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-256", str + "$ECB_256");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-512", str + "$ECB_512");
            k kVar4 = hpb.j;
            configurableProvider.addAlgorithm("Cipher", kVar4, str + "$ECB128");
            k kVar5 = hpb.k;
            configurableProvider.addAlgorithm("Cipher", kVar5, str + "$ECB256");
            k kVar6 = hpb.l;
            configurableProvider.addAlgorithm("Cipher", kVar6, str + "$ECB512");
            configurableProvider.addAlgorithm("Cipher", kVar, str + "$CBC128");
            configurableProvider.addAlgorithm("Cipher", kVar2, str + "$CBC256");
            configurableProvider.addAlgorithm("Cipher", kVar3, str + "$CBC512");
            k kVar7 = hpb.y;
            configurableProvider.addAlgorithm("Cipher", kVar7, str + "$OFB128");
            k kVar8 = hpb.z;
            configurableProvider.addAlgorithm("Cipher", kVar8, str + "$OFB256");
            k kVar9 = hpb.A;
            configurableProvider.addAlgorithm("Cipher", kVar9, str + "$OFB512");
            k kVar10 = hpb.p;
            configurableProvider.addAlgorithm("Cipher", kVar10, str + "$CFB128");
            k kVar11 = hpb.q;
            configurableProvider.addAlgorithm("Cipher", kVar11, str + "$CFB256");
            k kVar12 = hpb.r;
            configurableProvider.addAlgorithm("Cipher", kVar12, str + "$CFB512");
            k kVar13 = hpb.m;
            configurableProvider.addAlgorithm("Cipher", kVar13, str + "$CTR128");
            k kVar14 = hpb.n;
            configurableProvider.addAlgorithm("Cipher", kVar14, str + "$CTR256");
            k kVar15 = hpb.o;
            configurableProvider.addAlgorithm("Cipher", kVar15, str + "$CTR512");
            k kVar16 = hpb.E;
            configurableProvider.addAlgorithm("Cipher", kVar16, str + "$CCM128");
            k kVar17 = hpb.F;
            configurableProvider.addAlgorithm("Cipher", kVar17, str + "$CCM256");
            k kVar18 = hpb.G;
            configurableProvider.addAlgorithm("Cipher", kVar18, str + "$CCM512");
            configurableProvider.addAlgorithm("Cipher.DSTU7624KW", str + "$Wrap");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624WRAP", "DSTU7624KW");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-128KW", str + "$Wrap128");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.Cipher.");
            k kVar19 = hpb.K;
            sb2.append(kVar19.H());
            configurableProvider.addAlgorithm(sb2.toString(), "DSTU7624-128KW");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624-128WRAP", "DSTU7624-128KW");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-256KW", str + "$Wrap256");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.Cipher.");
            k kVar20 = hpb.L;
            sb3.append(kVar20.H());
            configurableProvider.addAlgorithm(sb3.toString(), "DSTU7624-256KW");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624-256WRAP", "DSTU7624-256KW");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-512KW", str + "$Wrap512");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Alg.Alias.Cipher.");
            k kVar21 = hpb.M;
            sb4.append(kVar21.H());
            configurableProvider.addAlgorithm(sb4.toString(), "DSTU7624-512KW");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624-512WRAP", "DSTU7624-512KW");
            configurableProvider.addAlgorithm("Mac.DSTU7624GMAC", str + "$GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624-128GMAC", str + "$GMAC128");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Alg.Alias.Mac.");
            k kVar22 = hpb.B;
            sb5.append(kVar22.H());
            configurableProvider.addAlgorithm(sb5.toString(), "DSTU7624-128GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624-256GMAC", str + "$GMAC256");
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Alg.Alias.Mac.");
            k kVar23 = hpb.C;
            sb6.append(kVar23.H());
            configurableProvider.addAlgorithm(sb6.toString(), "DSTU7624-256GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624-512GMAC", str + "$GMAC512");
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Alg.Alias.Mac.");
            k kVar24 = hpb.D;
            sb7.append(kVar24.H());
            configurableProvider.addAlgorithm(sb7.toString(), "DSTU7624-512GMAC");
            configurableProvider.addAlgorithm("KeyGenerator.DSTU7624", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", kVar19, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar20, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar21, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", kVar4, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar5, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar6, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", kVar, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar2, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar3, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", kVar7, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar8, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar9, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", kVar10, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar11, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar12, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", kVar13, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar14, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar15, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", kVar16, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar17, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar18, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", kVar22, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar23, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar24, str + "$KeyGen512");
        }
    }

    /* loaded from: classes3.dex */
    public static class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(new ch0(new e47(new s82(128), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(new ch0(new e47(new s82(256), 256)), 256);
        }
    }

    /* loaded from: classes3.dex */
    public static class OFB512 extends BaseBlockCipher {
        public OFB512() {
            super(new ch0(new e47(new s82(512), 512)), 512);
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new t82(128));
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(new t82(128));
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(new t82(256));
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap512 extends BaseWrapCipher {
        public Wrap512() {
            super(new t82(512));
        }
    }

    private DSTU7624() {
    }
}
