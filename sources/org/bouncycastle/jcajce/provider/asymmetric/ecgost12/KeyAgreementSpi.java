package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
/* loaded from: classes3.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final nac converter = new nac();
    private sb3 agreement;
    private String kaAlgorithm;
    private la3 parameters;
    private byte[] result;

    /* loaded from: classes3.dex */
    public static class ECVKO256 extends KeyAgreementSpi {
        public ECVKO256() {
            super("ECGOST3410-2012-256", new sb3(new xb4()), null);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECVKO512 extends KeyAgreementSpi {
        public ECVKO512() {
            super("ECGOST3410-2012-512", new sb3(new xb4()), null);
        }
    }

    protected KeyAgreementSpi(String str, sb3 sb3Var, q03 q03Var) {
        super(str, q03Var);
        this.kaAlgorithm = str;
        this.agreement = sb3Var;
    }

    static ux generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCECGOST3410_2012PublicKey) {
            return ((BCECGOST3410_2012PublicKey) publicKey).engineGetKeyParameters();
        }
        return ECUtil.generatePublicKeyParameter(publicKey);
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void initFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException {
        byte[] bArr;
        if (key instanceof PrivateKey) {
            nb3 nb3Var = (nb3) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
            this.parameters = nb3Var.b();
            if (algorithmParameterSpec instanceof iub) {
                bArr = ((iub) algorithmParameterSpec).a();
            } else {
                bArr = null;
            }
            this.ukmParameters = bArr;
            this.agreement.c(new sq7(nb3Var, bArr));
            return;
        }
        throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(lb3.class) + " for initialisation");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] calcSecret() {
        return this.result;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (this.parameters != null) {
            if (z) {
                if (key instanceof PublicKey) {
                    try {
                        this.result = this.agreement.a(generatePublicKeyParameter((PublicKey) key));
                        return null;
                    } catch (Exception e) {
                        throw new InvalidKeyException("calculation failed: " + e.getMessage()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi.1
                            @Override // java.lang.Throwable
                            public Throwable getCause() {
                                return e;
                            }
                        };
                    }
                }
                throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(pb3.class) + " for doPhase");
            }
            throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties.");
        }
        throw new IllegalStateException(this.kaAlgorithm + " not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        initFromKey(key, null);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof iub)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        initFromKey(key, algorithmParameterSpec);
    }
}
