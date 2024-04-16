package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
/* loaded from: classes3.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private x69 agreement;
    private m72 dhuSpec;
    private byte[] result;

    /* loaded from: classes3.dex */
    public static final class X25519 extends KeyAgreementSpi {
        public X25519() {
            super("X25519");
        }
    }

    /* loaded from: classes3.dex */
    public static class X25519UwithSHA256CKDF extends KeyAgreementSpi {
        public X25519UwithSHA256CKDF() {
            super("X25519UwithSHA256CKDF", new dp1(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class X25519UwithSHA256KDF extends KeyAgreementSpi {
        public X25519UwithSHA256KDF() {
            super("X25519UwithSHA256KDF", new qd5(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class X25519withSHA256CKDF extends KeyAgreementSpi {
        public X25519withSHA256CKDF() {
            super("X25519withSHA256CKDF", new dp1(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class X25519withSHA256KDF extends KeyAgreementSpi {
        public X25519withSHA256KDF() {
            super("X25519withSHA256KDF", new qd5(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class X25519withSHA384CKDF extends KeyAgreementSpi {
        public X25519withSHA384CKDF() {
            super("X25519withSHA384CKDF", new dp1(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class X25519withSHA512CKDF extends KeyAgreementSpi {
        public X25519withSHA512CKDF() {
            super("X25519withSHA512CKDF", new dp1(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class X448 extends KeyAgreementSpi {
        public X448() {
            super("X448");
        }
    }

    /* loaded from: classes3.dex */
    public static class X448UwithSHA512CKDF extends KeyAgreementSpi {
        public X448UwithSHA512CKDF() {
            super("X448UwithSHA512CKDF", new dp1(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class X448UwithSHA512KDF extends KeyAgreementSpi {
        public X448UwithSHA512KDF() {
            super("X448UwithSHA512KDF", new qd5(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class X448withSHA256CKDF extends KeyAgreementSpi {
        public X448withSHA256CKDF() {
            super("X448withSHA256CKDF", new dp1(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class X448withSHA384CKDF extends KeyAgreementSpi {
        public X448withSHA384CKDF() {
            super("X448withSHA384CKDF", new dp1(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class X448withSHA512CKDF extends KeyAgreementSpi {
        public X448withSHA512CKDF() {
            super("X448withSHA512CKDF", new dp1(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class X448withSHA512KDF extends KeyAgreementSpi {
        public X448withSHA512KDF() {
            super("X448withSHA512KDF", new qd5(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class XDH extends KeyAgreementSpi {
        public XDH() {
            super("XDH");
        }
    }

    KeyAgreementSpi(String str) {
        super(str, null);
    }

    private x69 getAgreement(String str) throws InvalidKeyException {
        if (!this.kaAlgorithm.equals("XDH") && !this.kaAlgorithm.startsWith(str)) {
            throw new InvalidKeyException("inappropriate key for " + this.kaAlgorithm);
        }
        int indexOf = this.kaAlgorithm.indexOf(85);
        boolean startsWith = str.startsWith("X448");
        if (indexOf > 0) {
            if (startsWith) {
                return new xac(new n9c());
            }
            return new xac(new g9c());
        } else if (startsWith) {
            return new n9c();
        } else {
            return new g9c();
        }
    }

    private static ux getLwXDHKeyPrivate(Key key) throws InvalidKeyException {
        if (key instanceof BCXDHPrivateKey) {
            return ((BCXDHPrivateKey) key).engineGetKeyParameters();
        }
        throw new InvalidKeyException("cannot identify XDH private key");
    }

    private ux getLwXDHKeyPublic(Key key) throws InvalidKeyException {
        if (key instanceof BCXDHPublicKey) {
            return ((BCXDHPublicKey) key).engineGetKeyParameters();
        }
        throw new InvalidKeyException("cannot identify XDH public key");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] calcSecret() {
        return this.result;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (this.agreement != null) {
            if (z) {
                ux lwXDHKeyPublic = getLwXDHKeyPublic(key);
                byte[] bArr = new byte[this.agreement.b()];
                this.result = bArr;
                m72 m72Var = this.dhuSpec;
                if (m72Var != null) {
                    this.agreement.a(new wac(lwXDHKeyPublic, ((BCXDHPublicKey) m72Var.c()).engineGetKeyParameters()), this.result, 0);
                    return null;
                }
                this.agreement.a(lwXDHKeyPublic, bArr, 0);
                return null;
            }
            throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties.");
        }
        throw new IllegalStateException(this.kaAlgorithm + " not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        String str;
        ux lwXDHKeyPrivate = getLwXDHKeyPrivate(key);
        if (lwXDHKeyPrivate instanceof k9c) {
            str = "X25519";
        } else if (!(lwXDHKeyPrivate instanceof r9c)) {
            throw new IllegalStateException("unsupported private key type");
        } else {
            str = "X448";
        }
        this.agreement = getAgreement(str);
        this.agreement.init(lwXDHKeyPrivate);
        if (this.kdf != null) {
            this.ukmParameters = new byte[0];
        } else {
            this.ukmParameters = null;
        }
    }

    KeyAgreementSpi(String str, q03 q03Var) {
        super(str, q03Var);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        ux lwXDHKeyPrivate = getLwXDHKeyPrivate(key);
        if (lwXDHKeyPrivate instanceof k9c) {
            str = "X25519";
        } else if (!(lwXDHKeyPrivate instanceof r9c)) {
            throw new IllegalStateException("unsupported private key type");
        } else {
            str = "X448";
        }
        this.agreement = getAgreement(str);
        this.ukmParameters = null;
        if (!(algorithmParameterSpec instanceof m72)) {
            this.agreement.init(lwXDHKeyPrivate);
            if (!(algorithmParameterSpec instanceof iub)) {
                throw new InvalidAlgorithmParameterException("unknown ParameterSpec");
            }
            if (this.kdf == null) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            this.ukmParameters = ((iub) algorithmParameterSpec).a();
        } else if (this.kaAlgorithm.indexOf(85) < 0) {
            throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
        } else {
            m72 m72Var = (m72) algorithmParameterSpec;
            this.dhuSpec = m72Var;
            this.ukmParameters = m72Var.d();
            this.agreement.init(new vac(lwXDHKeyPrivate, ((BCXDHPrivateKey) this.dhuSpec.a()).engineGetKeyParameters(), ((BCXDHPublicKey) this.dhuSpec.b()).engineGetKeyParameters()));
        }
        if (this.kdf == null || this.ukmParameters != null) {
            return;
        }
        this.ukmParameters = new byte[0];
    }
}
