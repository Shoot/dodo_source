package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    t62 engine;
    boolean initialised;
    a72 param;
    SecureRandom random;
    int strength;
    private static Hashtable params = new Hashtable();
    private static Object lock = new Object();

    public KeyPairGeneratorSpi() {
        super("DH");
        this.engine = new t62();
        this.strength = 2048;
        this.random = b32.b();
        this.initialised = false;
    }

    private a72 convertParams(SecureRandom secureRandom, DHParameterSpec dHParameterSpec) {
        if (dHParameterSpec instanceof u62) {
            return new a72(secureRandom, ((u62) dHParameterSpec).a());
        }
        return new a72(secureRandom, new h72(dHParameterSpec.getP(), dHParameterSpec.getG(), null, dHParameterSpec.getL()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        a72 convertParams;
        if (!this.initialised) {
            Integer d = g65.d(this.strength);
            if (params.containsKey(d)) {
                convertParams = (a72) params.get(d);
            } else {
                DHParameterSpec dHDefaultParameters = ff0.b.getDHDefaultParameters(this.strength);
                if (dHDefaultParameters != null) {
                    convertParams = convertParams(this.random, dHDefaultParameters);
                } else {
                    synchronized (lock) {
                        try {
                            if (params.containsKey(d)) {
                                this.param = (a72) params.get(d);
                            } else {
                                i72 i72Var = new i72();
                                int i = this.strength;
                                i72Var.b(i, PrimeCertaintyCalculator.getDefaultCertainty(i), this.random);
                                a72 a72Var = new a72(this.random, i72Var.a());
                                this.param = a72Var;
                                params.put(d, a72Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.engine.b(this.param);
                    this.initialised = true;
                }
            }
            this.param = convertParams;
            this.engine.b(this.param);
            this.initialised = true;
        }
        sx a = this.engine.a();
        return new KeyPair(new BCDHPublicKey((l72) a.b()), new BCDHPrivateKey((k72) a.a()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
        }
        try {
            a72 convertParams = convertParams(secureRandom, (DHParameterSpec) algorithmParameterSpec);
            this.param = convertParams;
            this.engine.b(convertParams);
            this.initialised = true;
        } catch (IllegalArgumentException e) {
            throw new InvalidAlgorithmParameterException(e.getMessage(), e);
        }
    }
}
