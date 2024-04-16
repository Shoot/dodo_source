package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSABase;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
/* loaded from: classes3.dex */
public class SignatureSpi extends DSABase {

    /* loaded from: classes3.dex */
    public static class ecCVCDSA extends SignatureSpi {
        public ecCVCDSA() {
            super(f23.b(), new ka3(), pb8.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA224 extends SignatureSpi {
        public ecCVCDSA224() {
            super(f23.c(), new ka3(), pb8.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA256 extends SignatureSpi {
        public ecCVCDSA256() {
            super(f23.d(), new ka3(), pb8.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA384 extends SignatureSpi {
        public ecCVCDSA384() {
            super(f23.e(), new ka3(), pb8.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA3_224 extends SignatureSpi {
        public ecCVCDSA3_224() {
            super(f23.f(), new ka3(), pb8.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA3_256 extends SignatureSpi {
        public ecCVCDSA3_256() {
            super(f23.g(), new ka3(), pb8.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA3_384 extends SignatureSpi {
        public ecCVCDSA3_384() {
            super(f23.h(), new ka3(), pb8.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA3_512 extends SignatureSpi {
        public ecCVCDSA3_512() {
            super(f23.i(), new ka3(), pb8.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA512 extends SignatureSpi {
        public ecCVCDSA512() {
            super(f23.j(), new ka3(), pb8.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSA extends SignatureSpi {
        public ecDSA() {
            super(f23.b(), new ka3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSA224 extends SignatureSpi {
        public ecDSA224() {
            super(f23.c(), new ka3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSA256 extends SignatureSpi {
        public ecDSA256() {
            super(f23.d(), new ka3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSA384 extends SignatureSpi {
        public ecDSA384() {
            super(f23.e(), new ka3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSA512 extends SignatureSpi {
        public ecDSA512() {
            super(f23.j(), new ka3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSARipeMD160 extends SignatureSpi {
        public ecDSARipeMD160() {
            super(new d39(), new ka3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSASha3_224 extends SignatureSpi {
        public ecDSASha3_224() {
            super(f23.f(), new ka3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSASha3_256 extends SignatureSpi {
        public ecDSASha3_256() {
            super(f23.g(), new ka3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSASha3_384 extends SignatureSpi {
        public ecDSASha3_384() {
            super(f23.h(), new ka3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSASha3_512 extends SignatureSpi {
        public ecDSASha3_512() {
            super(f23.i(), new ka3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSAShake128 extends SignatureSpi {
        public ecDSAShake128() {
            super(new jq9(128), new ka3(new rj4(new jq9(128))), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSAShake256 extends SignatureSpi {
        public ecDSAShake256() {
            super(new jq9(256), new ka3(new rj4(new jq9(256))), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSAnone extends SignatureSpi {
        public ecDSAnone() {
            super(new p37(), new ka3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSA extends SignatureSpi {
        public ecDetDSA() {
            super(f23.b(), new ka3(new rj4(f23.b())), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSA224 extends SignatureSpi {
        public ecDetDSA224() {
            super(f23.c(), new ka3(new rj4(f23.c())), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSA256 extends SignatureSpi {
        public ecDetDSA256() {
            super(f23.d(), new ka3(new rj4(f23.d())), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSA384 extends SignatureSpi {
        public ecDetDSA384() {
            super(f23.e(), new ka3(new rj4(f23.e())), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSA512 extends SignatureSpi {
        public ecDetDSA512() {
            super(f23.j(), new ka3(new rj4(f23.j())), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSASha3_224 extends SignatureSpi {
        public ecDetDSASha3_224() {
            super(f23.f(), new ka3(new rj4(f23.f())), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSASha3_256 extends SignatureSpi {
        public ecDetDSASha3_256() {
            super(f23.g(), new ka3(new rj4(f23.g())), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSASha3_384 extends SignatureSpi {
        public ecDetDSASha3_384() {
            super(f23.h(), new ka3(new rj4(f23.h())), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSASha3_512 extends SignatureSpi {
        public ecDetDSASha3_512() {
            super(f23.i(), new ka3(new rj4(f23.i())), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecNR extends SignatureSpi {
        public ecNR() {
            super(f23.b(), new cb3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecNR224 extends SignatureSpi {
        public ecNR224() {
            super(f23.c(), new cb3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecNR256 extends SignatureSpi {
        public ecNR256() {
            super(f23.d(), new cb3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecNR384 extends SignatureSpi {
        public ecNR384() {
            super(f23.e(), new cb3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecNR512 extends SignatureSpi {
        public ecNR512() {
            super(f23.j(), new cb3(), mta.a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecPlainDSARP160 extends SignatureSpi {
        public ecPlainDSARP160() {
            super(new d39(), new ka3(), pb8.a);
        }
    }

    SignatureSpi(e23 e23Var, u72 u72Var, t72 t72Var) {
        super(e23Var, u72Var, t72Var);
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        ux generatePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
        this.digest.reset();
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        if (secureRandom != null) {
            this.signer.init(true, new qq7(generatePrivateKeyParameter, secureRandom));
        } else {
            this.signer.init(true, generatePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        ux generatePublicKeyParameter = ECUtils.generatePublicKeyParameter(publicKey);
        this.digest.reset();
        this.signer.init(false, generatePublicKeyParameter);
    }
}
