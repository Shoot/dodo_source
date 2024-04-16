package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    String algorithm;
    Object ecParams;
    wa3 engine;
    boolean initialised;
    va3 param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi() {
        super("ECGOST3410-2012");
        this.ecParams = null;
        this.engine = new wa3();
        this.algorithm = "ECGOST3410-2012";
        this.strength = 239;
        this.random = null;
        this.initialised = false;
    }

    private void init(hb4 hb4Var, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        iac e = pa3.e(hb4Var.e());
        if (e != null) {
            this.ecParams = new fb3(pa3.f(hb4Var.e()), e.t(), e.u(), e.x(), e.v(), e.z());
            va3 va3Var = new va3(new qa3(new hb3(hb4Var.e(), e), hb4Var.e(), hb4Var.b(), hb4Var.c()), secureRandom);
            this.param = va3Var;
            this.engine.c(va3Var);
            this.initialised = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("unknown curve: " + hb4Var.e());
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.initialised) {
            sx a = this.engine.a();
            qb3 qb3Var = (qb3) a.b();
            nb3 nb3Var = (nb3) a.a();
            Object obj = this.ecParams;
            if (obj instanceof ib3) {
                ib3 ib3Var = (ib3) obj;
                BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = new BCECGOST3410_2012PublicKey(this.algorithm, qb3Var, ib3Var);
                return new KeyPair(bCECGOST3410_2012PublicKey, new BCECGOST3410_2012PrivateKey(this.algorithm, nb3Var, bCECGOST3410_2012PublicKey, ib3Var));
            } else if (obj == null) {
                return new KeyPair(new BCECGOST3410_2012PublicKey(this.algorithm, qb3Var), new BCECGOST3410_2012PrivateKey(this.algorithm, nb3Var));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey2 = new BCECGOST3410_2012PublicKey(this.algorithm, qb3Var, eCParameterSpec);
                return new KeyPair(bCECGOST3410_2012PublicKey2, new BCECGOST3410_2012PrivateKey(this.algorithm, nb3Var, bCECGOST3410_2012PublicKey2, eCParameterSpec));
            }
        }
        throw new IllegalStateException("EC Key Pair Generator not initialised");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
        Object obj = this.ecParams;
        if (obj == null) {
            throw new InvalidParameterException("unknown key size.");
        }
        try {
            initialize((ECGenParameterSpec) obj, secureRandom);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException("key size not configurable.");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        va3 va3Var;
        if (algorithmParameterSpec instanceof hb4) {
            init((hb4) algorithmParameterSpec, secureRandom);
            return;
        }
        if (!(algorithmParameterSpec instanceof ib3)) {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                this.ecParams = algorithmParameterSpec;
                ea3 convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                va3 va3Var2 = new va3(new la3(convertCurve, EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
                this.param = va3Var2;
                this.engine.c(va3Var2);
                this.initialised = true;
            }
            boolean z = algorithmParameterSpec instanceof ECGenParameterSpec;
            if (z || (algorithmParameterSpec instanceof db3)) {
                init(new hb4(z ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((db3) algorithmParameterSpec).a()), secureRandom);
                return;
            }
            if (algorithmParameterSpec == null) {
                ProviderConfiguration providerConfiguration = ff0.b;
                if (providerConfiguration.getEcImplicitlyCa() != null) {
                    ib3 ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
                    this.ecParams = algorithmParameterSpec;
                    va3Var = new va3(new la3(ecImplicitlyCa.a(), ecImplicitlyCa.b(), ecImplicitlyCa.d(), ecImplicitlyCa.c()), secureRandom);
                }
            }
            if (algorithmParameterSpec == null && ff0.b.getEcImplicitlyCa() == null) {
                throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
            }
            throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec: " + algorithmParameterSpec.getClass().getName());
        }
        ib3 ib3Var = (ib3) algorithmParameterSpec;
        this.ecParams = algorithmParameterSpec;
        va3Var = new va3(new la3(ib3Var.a(), ib3Var.b(), ib3Var.d(), ib3Var.c()), secureRandom);
        this.param = va3Var;
        this.engine.c(va3Var);
        this.initialised = true;
    }
}
