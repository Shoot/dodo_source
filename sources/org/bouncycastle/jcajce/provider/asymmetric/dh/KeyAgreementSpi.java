package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
/* loaded from: classes3.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private m72 dheParameters;
    private BigInteger g;
    private final x80 mqvAgreement;
    private s36 mqvParameters;
    private BigInteger p;
    private byte[] result;
    private final p72 unifiedAgreement;
    private BigInteger x;

    /* loaded from: classes3.dex */
    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("DHUwithSHA1CKDF", new p72(), new dp1(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("DHUwithSHA1KDF", new p72(), new qd5(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("DHUwithSHA224CKDF", new p72(), new dp1(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("DHUwithSHA224KDF", new p72(), new qd5(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("DHUwithSHA256CKDF", new p72(), new dp1(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("DHUwithSHA256KDF", new p72(), new qd5(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("DHUwithSHA384CKDF", new p72(), new dp1(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("DHUwithSHA384KDF", new p72(), new qd5(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("DHUwithSHA512CKDF", new p72(), new dp1(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("DHUwithSHA512KDF", new p72(), new qd5(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithRFC2631KDF extends KeyAgreementSpi {
        public DHwithRFC2631KDF() {
            super("DHwithRFC2631KDF", new z62(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("DHwithSHA1CKDF", new dp1(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("DHwithSHA1CKDF", new qd5(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA224CKDF extends KeyAgreementSpi {
        public DHwithSHA224CKDF() {
            super("DHwithSHA224CKDF", new dp1(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA224KDF extends KeyAgreementSpi {
        public DHwithSHA224KDF() {
            super("DHwithSHA224CKDF", new qd5(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("DHwithSHA256CKDF", new dp1(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA256KDF extends KeyAgreementSpi {
        public DHwithSHA256KDF() {
            super("DHwithSHA256CKDF", new qd5(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("DHwithSHA384CKDF", new dp1(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA384KDF extends KeyAgreementSpi {
        public DHwithSHA384KDF() {
            super("DHwithSHA384KDF", new qd5(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("DHwithSHA512CKDF", new dp1(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA512KDF extends KeyAgreementSpi {
        public DHwithSHA512KDF() {
            super("DHwithSHA512KDF", new qd5(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("MQVwithSHA1CKDF", new r36(), new dp1(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("MQVwithSHA1KDF", new r36(), new qd5(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("MQVwithSHA224CKDF", new r36(), new dp1(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("MQVwithSHA224KDF", new r36(), new qd5(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("MQVwithSHA256CKDF", new r36(), new dp1(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("MQVwithSHA256KDF", new r36(), new qd5(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("MQVwithSHA384CKDF", new r36(), new dp1(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("MQVwithSHA384KDF", new r36(), new qd5(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("MQVwithSHA512CKDF", new r36(), new dp1(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("MQVwithSHA512KDF", new r36(), new qd5(f23.j()));
        }
    }

    public KeyAgreementSpi() {
        this("Diffie-Hellman", null);
    }

    private k72 generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof DHPrivateKey) {
            if (privateKey instanceof BCDHPrivateKey) {
                return ((BCDHPrivateKey) privateKey).engineGetKeyParameters();
            }
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            DHParameterSpec params = dHPrivateKey.getParams();
            return new k72(dHPrivateKey.getX(), new h72(params.getP(), params.getG(), null, params.getL()));
        }
        throw new InvalidKeyException("private key not a DHPrivateKey");
    }

    private l72 generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof DHPublicKey) {
            if (publicKey instanceof BCDHPublicKey) {
                return ((BCDHPublicKey) publicKey).engineGetKeyParameters();
            }
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            DHParameterSpec params = dHPublicKey.getParams();
            if (params instanceof u62) {
                return new l72(dHPublicKey.getY(), ((u62) params).a());
            }
            return new l72(dHPublicKey.getY(), new h72(params.getP(), params.getG(), null, params.getL()));
        }
        throw new InvalidKeyException("public key not a DHPublicKey");
    }

    protected byte[] bigIntToBytes(BigInteger bigInteger) {
        int bitLength = (this.p.bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == bitLength) {
            return byteArray;
        }
        if (byteArray[0] == 0 && byteArray.length == bitLength + 1) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(byteArray, 0, bArr2, bitLength - byteArray.length, byteArray.length);
        return bArr2;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] calcSecret() {
        return this.result;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (this.x != null) {
            if (key instanceof DHPublicKey) {
                DHPublicKey dHPublicKey = (DHPublicKey) key;
                if (dHPublicKey.getParams().getG().equals(this.g) && dHPublicKey.getParams().getP().equals(this.p)) {
                    BigInteger y = dHPublicKey.getY();
                    if (y != null && y.compareTo(TWO) >= 0) {
                        BigInteger bigInteger = this.p;
                        BigInteger bigInteger2 = ONE;
                        if (y.compareTo(bigInteger.subtract(bigInteger2)) < 0) {
                            if (this.unifiedAgreement != null) {
                                if (z) {
                                    this.result = this.unifiedAgreement.a(new o72(generatePublicKeyParameter((PublicKey) key), generatePublicKeyParameter(this.dheParameters.c())));
                                    return null;
                                }
                                throw new IllegalStateException("unified Diffie-Hellman can use only two key pairs");
                            } else if (this.mqvAgreement != null) {
                                if (z) {
                                    this.result = bigIntToBytes(this.mqvAgreement.b(new f72(generatePublicKeyParameter((PublicKey) key), generatePublicKeyParameter(this.mqvParameters.c()))));
                                    return null;
                                }
                                throw new IllegalStateException("MQV Diffie-Hellman can use only two key pairs");
                            } else {
                                BigInteger modPow = y.modPow(this.x, this.p);
                                if (modPow.compareTo(bigInteger2) != 0) {
                                    this.result = bigIntToBytes(modPow);
                                    if (z) {
                                        return null;
                                    }
                                    return new BCDHPublicKey(modPow, dHPublicKey.getParams());
                                }
                                throw new InvalidKeyException("Shared key can't be 1");
                            }
                        }
                    }
                    throw new InvalidKeyException("Invalid DH PublicKey");
                }
                throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
            }
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        if (this.x != null) {
            return super.engineGenerateSecret(bArr, i);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(key instanceof DHPrivateKey)) {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        this.p = dHPrivateKey.getParams().getP();
        this.g = dHPrivateKey.getParams().getG();
        BigInteger x = dHPrivateKey.getX();
        this.x = x;
        this.result = bigIntToBytes(x);
    }

    public KeyAgreementSpi(String str, x80 x80Var, q03 q03Var) {
        super(str, q03Var);
        this.unifiedAgreement = null;
        this.mqvAgreement = x80Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        if (this.x != null) {
            return str.equals("TlsPremasterSecret") ? new SecretKeySpec(BaseAgreementSpi.trimZeroes(this.result), str) : super.engineGenerateSecret(str);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        x80 x80Var;
        e72 e72Var;
        p72 p72Var;
        n72 n72Var;
        if (!(key instanceof DHPrivateKey)) {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        if (algorithmParameterSpec == null) {
            this.p = dHPrivateKey.getParams().getP();
            this.g = dHPrivateKey.getParams().getG();
        } else if (algorithmParameterSpec instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.p = dHParameterSpec.getP();
            this.g = dHParameterSpec.getG();
            this.dheParameters = null;
            this.ukmParameters = null;
        } else if (algorithmParameterSpec instanceof m72) {
            if (this.unifiedAgreement == null) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            }
            this.p = dHPrivateKey.getParams().getP();
            this.g = dHPrivateKey.getParams().getG();
            m72 m72Var = (m72) algorithmParameterSpec;
            this.dheParameters = m72Var;
            this.ukmParameters = m72Var.d();
            if (this.dheParameters.b() != null) {
                p72Var = this.unifiedAgreement;
                n72Var = new n72(generatePrivateKeyParameter(dHPrivateKey), generatePrivateKeyParameter(this.dheParameters.a()), generatePublicKeyParameter(this.dheParameters.b()));
            } else {
                p72Var = this.unifiedAgreement;
                n72Var = new n72(generatePrivateKeyParameter(dHPrivateKey), generatePrivateKeyParameter(this.dheParameters.a()));
            }
            p72Var.c(n72Var);
        } else if (algorithmParameterSpec instanceof s36) {
            if (this.mqvAgreement == null) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not MQV based");
            }
            this.p = dHPrivateKey.getParams().getP();
            this.g = dHPrivateKey.getParams().getG();
            s36 s36Var = (s36) algorithmParameterSpec;
            this.mqvParameters = s36Var;
            this.ukmParameters = s36Var.d();
            if (this.mqvParameters.b() != null) {
                x80Var = this.mqvAgreement;
                e72Var = new e72(generatePrivateKeyParameter(dHPrivateKey), generatePrivateKeyParameter(this.mqvParameters.a()), generatePublicKeyParameter(this.mqvParameters.b()));
            } else {
                x80Var = this.mqvAgreement;
                e72Var = new e72(generatePrivateKeyParameter(dHPrivateKey), generatePrivateKeyParameter(this.mqvParameters.a()));
            }
            x80Var.init(e72Var);
        } else if (!(algorithmParameterSpec instanceof iub)) {
            throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
        } else {
            if (this.kdf == null) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            this.p = dHPrivateKey.getParams().getP();
            this.g = dHPrivateKey.getParams().getG();
            this.dheParameters = null;
            this.ukmParameters = ((iub) algorithmParameterSpec).a();
        }
        BigInteger x = dHPrivateKey.getX();
        this.x = x;
        this.result = bigIntToBytes(x);
    }

    public KeyAgreementSpi(String str, p72 p72Var, q03 q03Var) {
        super(str, q03Var);
        this.unifiedAgreement = p72Var;
        this.mqvAgreement = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.x != null) {
            return super.engineGenerateSecret();
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    public KeyAgreementSpi(String str, q03 q03Var) {
        super(str, q03Var);
        this.unifiedAgreement = null;
        this.mqvAgreement = null;
    }
}
