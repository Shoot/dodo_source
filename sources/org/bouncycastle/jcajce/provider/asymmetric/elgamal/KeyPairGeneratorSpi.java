package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    int certainty;
    de3 engine;
    boolean initialised;
    ce3 param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi() {
        super("ElGamal");
        this.engine = new de3();
        this.strength = 1024;
        this.certainty = 20;
        this.random = b32.b();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        ce3 ce3Var;
        if (!this.initialised) {
            DHParameterSpec dHDefaultParameters = ff0.b.getDHDefaultParameters(this.strength);
            if (dHDefaultParameters != null) {
                ce3Var = new ce3(this.random, new ie3(dHDefaultParameters.getP(), dHDefaultParameters.getG(), dHDefaultParameters.getL()));
            } else {
                je3 je3Var = new je3();
                je3Var.b(this.strength, this.certainty, this.random);
                ce3Var = new ce3(this.random, je3Var.a());
            }
            this.param = ce3Var;
            this.engine.b(this.param);
            this.initialised = true;
        }
        sx a = this.engine.a();
        return new KeyPair(new BCElGamalPublicKey((oe3) a.b()), new BCElGamalPrivateKey((le3) a.a()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        ce3 ce3Var;
        boolean z = algorithmParameterSpec instanceof he3;
        if (!z && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
        }
        if (z) {
            he3 he3Var = (he3) algorithmParameterSpec;
            ce3Var = new ce3(secureRandom, new ie3(he3Var.b(), he3Var.a()));
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            ce3Var = new ce3(secureRandom, new ie3(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
        }
        this.param = ce3Var;
        this.engine.b(this.param);
        this.initialised = true;
    }
}
