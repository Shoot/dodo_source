package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import ch.qos.logback.core.net.SyslogConstants;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    x72 engine;
    boolean initialised;
    w72 param;
    SecureRandom random;
    int strength;
    private static Hashtable params = new Hashtable();
    private static Object lock = new Object();

    public KeyPairGeneratorSpi() {
        super("DSA");
        this.engine = new x72();
        this.strength = 2048;
        this.random = b32.b();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        c82 c82Var;
        int i;
        SecureRandom secureRandom;
        if (!this.initialised) {
            Integer d = g65.d(this.strength);
            if (params.containsKey(d)) {
                this.param = (w72) params.get(d);
            } else {
                synchronized (lock) {
                    try {
                        if (params.containsKey(d)) {
                            this.param = (w72) params.get(d);
                        } else {
                            int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
                            int i2 = this.strength;
                            if (i2 == 1024) {
                                c82Var = new c82();
                                if (pq8.c("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                    i = this.strength;
                                    secureRandom = this.random;
                                    c82Var.k(i, defaultCertainty, secureRandom);
                                    w72 w72Var = new w72(this.random, c82Var.d());
                                    this.param = w72Var;
                                    params.put(d, w72Var);
                                } else {
                                    c82Var.l(new a82(1024, SyslogConstants.LOG_LOCAL4, defaultCertainty, this.random));
                                    w72 w72Var2 = new w72(this.random, c82Var.d());
                                    this.param = w72Var2;
                                    params.put(d, w72Var2);
                                }
                            } else if (i2 > 1024) {
                                a82 a82Var = new a82(i2, 256, defaultCertainty, this.random);
                                c82Var = new c82(new dq9());
                                c82Var.l(a82Var);
                                w72 w72Var22 = new w72(this.random, c82Var.d());
                                this.param = w72Var22;
                                params.put(d, w72Var22);
                            } else {
                                c82Var = new c82();
                                i = this.strength;
                                secureRandom = this.random;
                                c82Var.k(i, defaultCertainty, secureRandom);
                                w72 w72Var222 = new w72(this.random, c82Var.d());
                                this.param = w72Var222;
                                params.put(d, w72Var222);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.engine.d(this.param);
            this.initialised = true;
        }
        sx a = this.engine.a();
        return new KeyPair(new BCDSAPublicKey((e82) a.b()), new BCDSAPrivateKey((d82) a.a()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        boolean z;
        if (i < 512 || i > 4096 || ((i < 1024 && i % 64 != 0) || (i >= 1024 && i % 1024 != 0))) {
            throw new InvalidParameterException("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
        }
        DSAParameterSpec dSADefaultParameters = ff0.b.getDSADefaultParameters(i);
        if (dSADefaultParameters != null) {
            w72 w72Var = new w72(secureRandom, new b82(dSADefaultParameters.getP(), dSADefaultParameters.getQ(), dSADefaultParameters.getG()));
            this.param = w72Var;
            this.engine.d(w72Var);
            z = true;
        } else {
            this.strength = i;
            this.random = secureRandom;
            z = false;
        }
        this.initialised = z;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
        }
        DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
        w72 w72Var = new w72(secureRandom, new b82(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
        this.param = w72Var;
        this.engine.d(w72Var);
        this.initialised = true;
    }
}
