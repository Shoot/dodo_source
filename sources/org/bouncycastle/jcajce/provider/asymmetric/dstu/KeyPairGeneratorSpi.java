package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.asn1.k;
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

    public KeyPairGeneratorSpi() {
        super("DSTU4145");
        this.ecParams = null;
        this.engine = new j82();
        this.algorithm = "DSTU4145";
        this.random = null;
        this.initialised = false;
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
                BCDSTU4145PublicKey bCDSTU4145PublicKey = new BCDSTU4145PublicKey(this.algorithm, qb3Var, ib3Var);
                return new KeyPair(bCDSTU4145PublicKey, new BCDSTU4145PrivateKey(this.algorithm, nb3Var, bCDSTU4145PublicKey, ib3Var));
            } else if (obj == null) {
                return new KeyPair(new BCDSTU4145PublicKey(this.algorithm, qb3Var), new BCDSTU4145PrivateKey(this.algorithm, nb3Var));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCDSTU4145PublicKey bCDSTU4145PublicKey2 = new BCDSTU4145PublicKey(this.algorithm, qb3Var, eCParameterSpec);
                return new KeyPair(bCDSTU4145PublicKey2, new BCDSTU4145PrivateKey(this.algorithm, nb3Var, bCDSTU4145PublicKey2, eCParameterSpec));
            }
        }
        throw new IllegalStateException("DSTU Key Pair Generator not initialised");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
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
        if (!(algorithmParameterSpec instanceof ib3)) {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                this.ecParams = algorithmParameterSpec;
                ea3 convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                jb3 convertPoint = EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator());
                if (eCParameterSpec instanceof l82) {
                    this.param = new va3(new m82(new la3(convertCurve, convertPoint, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), ((l82) eCParameterSpec).a()), secureRandom);
                } else {
                    this.param = new va3(new la3(convertCurve, convertPoint, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
                }
                this.engine.c(this.param);
            } else {
                boolean z = algorithmParameterSpec instanceof ECGenParameterSpec;
                if (!z && !(algorithmParameterSpec instanceof db3)) {
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
                String name = z ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((db3) algorithmParameterSpec).a();
                la3 a = k82.a(new k(name));
                if (a == null) {
                    throw new InvalidAlgorithmParameterException("unknown curve name: " + name);
                }
                fb3 fb3Var = new fb3(name, a.a(), a.b(), a.e(), a.c(), a.f());
                this.ecParams = fb3Var;
                fb3 fb3Var2 = fb3Var;
                ea3 convertCurve2 = EC5Util.convertCurve(fb3Var2.getCurve());
                va3 va3Var2 = new va3(new la3(convertCurve2, EC5Util.convertPoint(convertCurve2, fb3Var2.getGenerator()), fb3Var2.getOrder(), BigInteger.valueOf(fb3Var2.getCofactor())), secureRandom);
                this.param = va3Var2;
                this.engine.c(va3Var2);
            }
            this.initialised = true;
        }
        ib3 ib3Var = (ib3) algorithmParameterSpec;
        this.ecParams = algorithmParameterSpec;
        va3Var = new va3(new la3(ib3Var.a(), ib3Var.b(), ib3Var.d(), ib3Var.c()), secureRandom);
        this.param = va3Var;
        this.engine.c(va3Var);
        this.initialised = true;
    }
}
