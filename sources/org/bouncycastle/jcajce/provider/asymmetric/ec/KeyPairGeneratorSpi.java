package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
/* loaded from: classes3.dex */
public abstract class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* loaded from: classes3.dex */
    public static class EC extends KeyPairGeneratorSpi {
        private static Hashtable ecParameters;
        String algorithm;
        ProviderConfiguration configuration;
        Object ecParams;
        wa3 engine;
        boolean initialised;
        va3 param;
        SecureRandom random;
        int strength;

        static {
            Hashtable hashtable = new Hashtable();
            ecParameters = hashtable;
            hashtable.put(g65.d(192), new ECGenParameterSpec("prime192v1"));
            ecParameters.put(g65.d(239), new ECGenParameterSpec("prime239v1"));
            ecParameters.put(g65.d(256), new ECGenParameterSpec("prime256v1"));
            ecParameters.put(g65.d(224), new ECGenParameterSpec("P-224"));
            ecParameters.put(g65.d(384), new ECGenParameterSpec("P-384"));
            ecParameters.put(g65.d(521), new ECGenParameterSpec("P-521"));
        }

        public EC() {
            super("EC");
            this.engine = new wa3();
            this.ecParams = null;
            this.strength = 239;
            this.random = b32.b();
            this.initialised = false;
            this.algorithm = "EC";
            this.configuration = ff0.b;
        }

        protected va3 createKeyGenParamsBC(ib3 ib3Var, SecureRandom secureRandom) {
            return new va3(new la3(ib3Var.a(), ib3Var.b(), ib3Var.d(), ib3Var.c()), secureRandom);
        }

        protected va3 createKeyGenParamsJCE(iac iacVar, SecureRandom secureRandom) {
            return new va3(new la3(iacVar.t(), iacVar.u(), iacVar.x(), iacVar.v()), secureRandom);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            if (!this.initialised) {
                initialize(this.strength, new SecureRandom());
            }
            sx a = this.engine.a();
            qb3 qb3Var = (qb3) a.b();
            nb3 nb3Var = (nb3) a.a();
            Object obj = this.ecParams;
            if (obj instanceof ib3) {
                ib3 ib3Var = (ib3) obj;
                BCECPublicKey bCECPublicKey = new BCECPublicKey(this.algorithm, qb3Var, ib3Var, this.configuration);
                return new KeyPair(bCECPublicKey, new BCECPrivateKey(this.algorithm, nb3Var, bCECPublicKey, ib3Var, this.configuration));
            } else if (obj == null) {
                return new KeyPair(new BCECPublicKey(this.algorithm, qb3Var, this.configuration), new BCECPrivateKey(this.algorithm, nb3Var, this.configuration));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECPublicKey bCECPublicKey2 = new BCECPublicKey(this.algorithm, qb3Var, eCParameterSpec, this.configuration);
                return new KeyPair(bCECPublicKey2, new BCECPrivateKey(this.algorithm, nb3Var, bCECPublicKey2, eCParameterSpec, this.configuration));
            }
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i, SecureRandom secureRandom) {
            this.strength = i;
            this.random = secureRandom;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) ecParameters.get(g65.d(i));
            if (eCGenParameterSpec == null) {
                throw new InvalidParameterException("unknown key size.");
            }
            try {
                initialize(eCGenParameterSpec, secureRandom);
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException("key size not configurable.");
            }
        }

        protected void initializeNamedCurve(String str, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            iac domainParametersFromName = ECUtils.getDomainParametersFromName(str, this.configuration);
            if (domainParametersFromName != null) {
                this.ecParams = new fb3(str, domainParametersFromName.t(), domainParametersFromName.u(), domainParametersFromName.x(), domainParametersFromName.v(), null);
                this.param = createKeyGenParamsJCE(domainParametersFromName, secureRandom);
                return;
            }
            throw new InvalidAlgorithmParameterException("unknown curve name: " + str);
        }

        public EC(String str, ProviderConfiguration providerConfiguration) {
            super(str);
            this.engine = new wa3();
            this.ecParams = null;
            this.strength = 239;
            this.random = b32.b();
            this.initialised = false;
            this.algorithm = str;
            this.configuration = providerConfiguration;
        }

        protected va3 createKeyGenParamsJCE(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            iac domainParametersFromName;
            if (!(eCParameterSpec instanceof fb3) || (domainParametersFromName = ECUtils.getDomainParametersFromName(((fb3) eCParameterSpec).c(), this.configuration)) == null) {
                ea3 convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                return new va3(new la3(convertCurve, EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
            }
            return createKeyGenParamsJCE(domainParametersFromName, secureRandom);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            String a;
            va3 createKeyGenParamsJCE;
            ib3 ib3Var;
            if (algorithmParameterSpec == null) {
                ib3Var = this.configuration.getEcImplicitlyCa();
                if (ib3Var == null) {
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                }
                this.ecParams = null;
            } else if (!(algorithmParameterSpec instanceof ib3)) {
                if (algorithmParameterSpec instanceof ECParameterSpec) {
                    this.ecParams = algorithmParameterSpec;
                    createKeyGenParamsJCE = createKeyGenParamsJCE((ECParameterSpec) algorithmParameterSpec, secureRandom);
                    this.param = createKeyGenParamsJCE;
                    this.engine.c(this.param);
                    this.initialised = true;
                }
                if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                    a = ((ECGenParameterSpec) algorithmParameterSpec).getName();
                } else if (!(algorithmParameterSpec instanceof db3)) {
                    String nameFrom = ECUtil.getNameFrom(algorithmParameterSpec);
                    if (nameFrom != null) {
                        initializeNamedCurve(nameFrom, secureRandom);
                        this.engine.c(this.param);
                        this.initialised = true;
                    }
                    throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec);
                } else {
                    a = ((db3) algorithmParameterSpec).a();
                }
                initializeNamedCurve(a, secureRandom);
                this.engine.c(this.param);
                this.initialised = true;
            } else {
                this.ecParams = algorithmParameterSpec;
                ib3Var = (ib3) algorithmParameterSpec;
            }
            createKeyGenParamsJCE = createKeyGenParamsBC(ib3Var, secureRandom);
            this.param = createKeyGenParamsJCE;
            this.engine.c(this.param);
            this.initialised = true;
        }
    }

    /* loaded from: classes3.dex */
    public static class ECDH extends EC {
        public ECDH() {
            super("ECDH", ff0.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECDHC extends EC {
        public ECDHC() {
            super("ECDHC", ff0.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECDSA extends EC {
        public ECDSA() {
            super("ECDSA", ff0.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECMQV extends EC {
        public ECMQV() {
            super("ECMQV", ff0.b);
        }
    }

    public KeyPairGeneratorSpi(String str) {
        super(str);
    }
}
