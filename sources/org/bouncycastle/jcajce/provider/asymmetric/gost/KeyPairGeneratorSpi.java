package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    cb4 engine;
    gb4 gost3410Params;
    boolean initialised;
    bb4 param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi() {
        super("GOST3410");
        this.engine = new cb4();
        this.strength = 1024;
        this.random = null;
        this.initialised = false;
    }

    private void init(gb4 gb4Var, SecureRandom secureRandom) {
        qb4 a = gb4Var.a();
        bb4 bb4Var = new bb4(secureRandom, new ib4(a.b(), a.c(), a.a()));
        this.param = bb4Var;
        this.engine.b(bb4Var);
        this.initialised = true;
        this.gost3410Params = gb4Var;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            init(new gb4(y22.q.H()), b32.b());
        }
        sx a = this.engine.a();
        return new KeyPair(new BCGOST3410PublicKey((rb4) a.b(), this.gost3410Params), new BCGOST3410PrivateKey((mb4) a.a(), this.gost3410Params));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof gb4)) {
            throw new InvalidAlgorithmParameterException("parameter object not a GOST3410ParameterSpec");
        }
        init((gb4) algorithmParameterSpec, secureRandom);
    }
}
