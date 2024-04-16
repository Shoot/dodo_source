package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static final eb PKCS_ALGID = new eb(co7.R, q0.a);
    private static final eb PSS_ALGID = new eb(co7.d0);
    static final BigInteger defaultPublicExponent = BigInteger.valueOf(65537);
    eb algId;
    m39 engine;
    l39 param;

    /* loaded from: classes3.dex */
    public static class PSS extends KeyPairGeneratorSpi {
        public PSS() {
            super("RSASSA-PSS", KeyPairGeneratorSpi.PSS_ALGID);
        }
    }

    public KeyPairGeneratorSpi() {
        this("RSA", PKCS_ALGID);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        sx a = this.engine.a();
        return new KeyPair(new BCRSAPublicKey(this.algId, (n39) a.b()), new BCRSAPrivateCrtKey(this.algId, (o39) a.a()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        l39 l39Var = new l39(defaultPublicExponent, secureRandom, i, PrimeCertaintyCalculator.getDefaultCertainty(i));
        this.param = l39Var;
        this.engine.d(l39Var);
    }

    public KeyPairGeneratorSpi(String str, eb ebVar) {
        super(str);
        this.algId = ebVar;
        this.engine = new m39();
        l39 l39Var = new l39(defaultPublicExponent, b32.b(), 2048, PrimeCertaintyCalculator.getDefaultCertainty(2048));
        this.param = l39Var;
        this.engine.d(l39Var);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof RSAKeyGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
        }
        RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
        l39 l39Var = new l39(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), PrimeCertaintyCalculator.getDefaultCertainty(2048));
        this.param = l39Var;
        this.engine.d(l39Var);
    }
}
