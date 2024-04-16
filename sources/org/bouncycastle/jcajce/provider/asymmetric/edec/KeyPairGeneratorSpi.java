package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private static final int Ed25519 = 1;
    private static final int Ed448 = 2;
    private static final int EdDSA = -1;
    private static final int X25519 = 3;
    private static final int X448 = 4;
    private static final int XDH = -2;
    private final int algorithmDeclared;
    private int algorithmInitialized;
    private tx generator;
    private SecureRandom secureRandom;

    /* loaded from: classes3.dex */
    public static final class Ed25519 extends KeyPairGeneratorSpi {
        public Ed25519() {
            super(1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Ed448 extends KeyPairGeneratorSpi {
        public Ed448() {
            super(2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class EdDSA extends KeyPairGeneratorSpi {
        public EdDSA() {
            super(-1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class X25519 extends KeyPairGeneratorSpi {
        public X25519() {
            super(3);
        }
    }

    /* loaded from: classes3.dex */
    public static final class X448 extends KeyPairGeneratorSpi {
        public X448() {
            super(4);
        }
    }

    /* loaded from: classes3.dex */
    public static final class XDH extends KeyPairGeneratorSpi {
        public XDH() {
            super(-2);
        }
    }

    KeyPairGeneratorSpi(int i) {
        this.algorithmDeclared = i;
        if (getAlgorithmFamily(i) != i) {
            this.algorithmInitialized = i;
        }
    }

    private static int getAlgorithmFamily(int i) {
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return i;
            }
            return -2;
        }
        return -1;
    }

    private static int getAlgorithmForName(String str) throws InvalidAlgorithmParameterException {
        if (!str.equalsIgnoreCase("X25519") && !str.equals(wc3.b.H())) {
            if (!str.equalsIgnoreCase("Ed25519") && !str.equals(wc3.d.H())) {
                if (!str.equalsIgnoreCase("X448") && !str.equals(wc3.c.H())) {
                    if (!str.equalsIgnoreCase("Ed448") && !str.equals(wc3.e.H())) {
                        throw new InvalidAlgorithmParameterException("invalid parameterSpec name: " + str);
                    }
                    return 2;
                }
                return 4;
            }
            return 1;
        }
        return 3;
    }

    private int getAlgorithmForStrength(int i) {
        if (i != 255 && i != 256) {
            if (i == 448) {
                int i2 = this.algorithmDeclared;
                if (i2 != -2) {
                    if (i2 == -1 || i2 == 2) {
                        return 2;
                    }
                    if (i2 != 4) {
                        throw new InvalidParameterException("key size not configurable");
                    }
                }
                return 4;
            }
            throw new InvalidParameterException("unknown key size");
        }
        int i3 = this.algorithmDeclared;
        if (i3 != -2) {
            if (i3 == -1 || i3 == 1) {
                return 1;
            }
            if (i3 != 3) {
                throw new InvalidParameterException("key size not configurable");
            }
        }
        return 3;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            return ((ECGenParameterSpec) algorithmParameterSpec).getName();
        }
        if (algorithmParameterSpec instanceof db3) {
            return ((db3) algorithmParameterSpec).a();
        }
        if (algorithmParameterSpec instanceof uc3) {
            return ((uc3) algorithmParameterSpec).a();
        }
        if (algorithmParameterSpec instanceof tac) {
            return ((tac) algorithmParameterSpec).a();
        }
        return ECUtil.getNameFrom(algorithmParameterSpec);
    }

    private tx setupGenerator() {
        if (this.secureRandom == null) {
            this.secureRandom = b32.b();
        }
        int i = this.algorithmInitialized;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        q9c q9cVar = new q9c();
                        q9cVar.b(new p9c(this.secureRandom));
                        return q9cVar;
                    }
                    throw new IllegalStateException("generator not correctly initialized");
                }
                j9c j9cVar = new j9c();
                j9cVar.b(new i9c(this.secureRandom));
                return j9cVar;
            }
            qc3 qc3Var = new qc3();
            qc3Var.b(new pc3(this.secureRandom));
            return qc3Var;
        }
        kc3 kc3Var = new kc3();
        kc3Var.b(new jc3(this.secureRandom));
        return kc3Var;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.algorithmInitialized != 0) {
            if (this.generator == null) {
                this.generator = setupGenerator();
            }
            sx a = this.generator.a();
            int i = this.algorithmInitialized;
            if (i != 1 && i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("generator not correctly initialized");
                }
                return new KeyPair(new BCXDHPublicKey(a.b()), new BCXDHPrivateKey(a.a()));
            }
            return new KeyPair(new BCEdDSAPublicKey(a.b()), new BCEdDSAPrivateKey(a.a()));
        }
        throw new IllegalStateException("generator not correctly initialized");
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.algorithmInitialized = getAlgorithmForStrength(i);
        this.secureRandom = secureRandom;
        this.generator = null;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec);
        }
        int algorithmForName = getAlgorithmForName(nameFromParams);
        int i = this.algorithmDeclared;
        if (i != algorithmForName && i != getAlgorithmFamily(algorithmForName)) {
            throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
        }
        this.algorithmInitialized = algorithmForName;
        this.secureRandom = secureRandom;
        this.generator = null;
    }
}
