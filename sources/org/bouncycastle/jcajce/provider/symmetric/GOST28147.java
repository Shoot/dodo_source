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
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
/* loaded from: classes3.dex */
public final class GOST28147 {
    private static Map<k, String> oidMappings = new HashMap();
    private static Map<String, k> nameMappings = new HashMap();

    /* loaded from: classes3.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        byte[] iv = new byte[8];
        byte[] sBox = ua4.h("E-A");

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            if (this.random == null) {
                this.random = b32.b();
            }
            this.random.nextBytes(this.iv);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("GOST28147");
                createParametersInstance.init(new wa4(this.sBox, this.iv));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof wa4) {
                this.sBox = ((wa4) algorithmParameterSpec).c();
                return;
            }
            throw new InvalidAlgorithmParameterException("parameter spec not supported");
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParams extends BaseAlgParams {
        private byte[] iv;
        private k sBox = y22.h;

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else if (algorithmParameterSpec instanceof wa4) {
                this.iv = ((wa4) algorithmParameterSpec).a();
                try {
                    this.sBox = BaseAlgParams.getSBoxOID(((wa4) algorithmParameterSpec).c());
                } catch (IllegalArgumentException e) {
                    throw new InvalidParameterSpecException(e.getMessage());
                }
            } else {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "GOST 28147 IV Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            if (cls != wa4.class && cls != AlgorithmParameterSpec.class) {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
            }
            return new wa4(this.sBox, this.iv);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        protected byte[] localGetEncoded() throws IOException {
            return new xa4(this.iv, this.sBox).getEncoded();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        protected void localInit(byte[] bArr) throws IOException {
            n z = n.z(bArr);
            if (z instanceof l) {
                this.iv = l.D(z).F();
            } else if (z instanceof p) {
                xa4 v = xa4.v(z);
                this.sBox = v.t();
                this.iv = v.u();
            } else {
                throw new IOException("Unable to recognize parameters");
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class BaseAlgParams extends BaseAlgorithmParameters {
        private byte[] iv;
        private k sBox = y22.h;

        protected static k getSBoxOID(String str) {
            k kVar = str != null ? (k) GOST28147.nameMappings.get(a0b.j(str)) : null;
            if (kVar != null) {
                return kVar;
            }
            throw new IllegalArgumentException("Unknown SBOX name: " + str);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final byte[] engineGetEncoded() throws IOException {
            return engineGetEncoded("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else if (!(algorithmParameterSpec instanceof wa4)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            } else {
                this.iv = ((wa4) algorithmParameterSpec).a();
                try {
                    this.sBox = getSBoxOID(((wa4) algorithmParameterSpec).c());
                } catch (IllegalArgumentException e) {
                    throw new InvalidParameterSpecException(e.getMessage());
                }
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            if (cls != wa4.class && cls != AlgorithmParameterSpec.class) {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
            }
            return new wa4(this.sBox, this.iv);
        }

        protected byte[] localGetEncoded() throws IOException {
            return new xa4(this.iv, this.sBox).getEncoded();
        }

        abstract void localInit(byte[] bArr) throws IOException;

        protected static k getSBoxOID(byte[] bArr) {
            return getSBoxOID(ua4.i(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return localGetEncoded();
            }
            throw new IOException("Unknown parameter format: " + str);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final void engineInit(byte[] bArr) throws IOException {
            engineInit(bArr, "ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final void engineInit(byte[] bArr, String str) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("Encoded parameters cannot be null");
            }
            if (!isASN1FormatString(str)) {
                throw new IOException("Unknown parameter format: " + str);
            }
            try {
                localInit(bArr);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException("Parameter parsing failed: " + e2.getMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new tk0(new ua4()), 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class CryptoProWrap extends BaseWrapCipher {
        public CryptoProWrap() {
            super(new z22());
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new ua4());
        }
    }

    /* loaded from: classes3.dex */
    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new ch0(new y94(new ua4())), 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class GostWrap extends BaseWrapCipher {
        public GostWrap() {
            super(new ya4());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("GOST28147", i, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mac extends BaseMac {
        public Mac() {
            super(new va4());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST28147.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.GOST28147", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST-28147", "GOST28147");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cipher.");
            k kVar = y22.f;
            sb2.append(kVar);
            configurableProvider.addAlgorithm(sb2.toString(), str + "$GCFB");
            configurableProvider.addAlgorithm("KeyGenerator.GOST28147", str + "$KeyGen");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + kVar, "GOST28147");
            configurableProvider.addAlgorithm("AlgorithmParameters.GOST28147", str + "$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GOST28147", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar, "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar, "GOST28147");
            configurableProvider.addAlgorithm("Cipher." + y22.e, str + "$CryptoProWrap");
            configurableProvider.addAlgorithm("Cipher." + y22.d, str + "$GostWrap");
            configurableProvider.addAlgorithm("Mac.GOST28147MAC", str + "$Mac");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        }
    }

    static {
        oidMappings.put(y22.g, "E-TEST");
        Map<k, String> map = oidMappings;
        k kVar = y22.h;
        map.put(kVar, "E-A");
        Map<k, String> map2 = oidMappings;
        k kVar2 = y22.i;
        map2.put(kVar2, "E-B");
        Map<k, String> map3 = oidMappings;
        k kVar3 = y22.j;
        map3.put(kVar3, "E-C");
        Map<k, String> map4 = oidMappings;
        k kVar4 = y22.k;
        map4.put(kVar4, "E-D");
        Map<k, String> map5 = oidMappings;
        k kVar5 = do9.t;
        map5.put(kVar5, "PARAM-Z");
        nameMappings.put("E-A", kVar);
        nameMappings.put("E-B", kVar2);
        nameMappings.put("E-C", kVar3);
        nameMappings.put("E-D", kVar4);
        nameMappings.put("PARAM-Z", kVar5);
    }

    private GOST28147() {
    }
}
