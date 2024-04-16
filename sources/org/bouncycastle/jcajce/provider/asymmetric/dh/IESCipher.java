package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
/* loaded from: classes3.dex */
public class IESCipher extends CipherSpi {
    private ByteArrayOutputStream buffer;
    private boolean dhaesMode;
    private nr4 engine;
    private AlgorithmParameters engineParam;
    private pr4 engineSpec;
    private final d95 helper;
    private final int ivLength;
    private ux key;
    private ux otherKeyParameter;
    private SecureRandom random;
    private int state;

    /* loaded from: classes3.dex */
    public static class IES extends IESCipher {
        public IES() {
            super(new nr4(new s62(), new qd5(f23.b()), new qj4(f23.b())));
        }
    }

    /* loaded from: classes3.dex */
    public static class IESwithAESCBC extends IESCipher {
        public IESwithAESCBC() {
            super(new nr4(new s62(), new qd5(f23.b()), new qj4(f23.b()), new dp7(new tk0(new q()))), 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class IESwithDESedeCBC extends IESCipher {
        public IESwithDESedeCBC() {
            super(new nr4(new s62(), new qd5(f23.b()), new qj4(f23.b()), new dp7(new tk0(new o62()))), 8);
        }
    }

    public IESCipher(nr4 nr4Var) {
        this.helper = new u40();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = nr4Var;
        this.ivLength = 0;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        if (this.engine.d() != null) {
            return this.engine.d().b();
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        pr4 pr4Var = this.engineSpec;
        if (pr4Var != null) {
            return pr4Var.e();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not a DH key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        int i2;
        int size;
        ch0 d;
        if (this.key != null) {
            int macSize = this.engine.f().getMacSize();
            if (this.otherKeyParameter == null) {
                i2 = (((((d72) this.key).b().f().bitLength() + 7) * 2) / 8) + 1;
            } else {
                i2 = 0;
            }
            if (this.engine.d() != null) {
                int i3 = this.state;
                if (i3 != 1 && i3 != 3) {
                    if (i3 != 2 && i3 != 4) {
                        throw new IllegalStateException("cipher not initialised");
                    }
                    d = this.engine.d();
                    i = (i - macSize) - i2;
                } else {
                    d = this.engine.d();
                }
                i = d.c(i);
            }
            int i4 = this.state;
            if (i4 != 1 && i4 != 3) {
                if (i4 != 2 && i4 != 4) {
                    throw new IllegalStateException("IESCipher not initialised");
                }
                size = (this.buffer.size() - macSize) - i2;
            } else {
                size = this.buffer.size() + macSize + i2;
            }
            return size + i;
        }
        throw new IllegalStateException("cipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParam == null && this.engineSpec != null) {
            try {
                AlgorithmParameters g = this.helper.g("IES");
                this.engineParam = g;
                g.init(this.engineSpec);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParam;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(pr4.class);
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e.toString());
            }
        } else {
            parameterSpec = null;
        }
        this.engineParam = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        boolean z;
        String j = a0b.j(str);
        if (j.equals("NONE")) {
            z = false;
        } else if (j.equals("DHAES")) {
            z = true;
        } else {
            throw new IllegalArgumentException("can't support mode " + str);
        }
        this.dhaesMode = z;
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String j = a0b.j(str);
        if (!j.equals("NOPADDING") && !j.equals("PKCS5PADDING") && !j.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.buffer.write(bArr, i, i2);
        return 0;
    }

    public IESCipher(nr4 nr4Var, int i) {
        this.helper = new u40();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = nr4Var;
        this.ivLength = i;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        if (i2 != 0) {
            this.buffer.write(bArr, i, i2);
        }
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        v71 rr4Var = new rr4(this.engineSpec.b(), this.engineSpec.c(), this.engineSpec.d(), this.engineSpec.a());
        if (this.engineSpec.e() != null) {
            rr4Var = new pq7(rr4Var, this.engineSpec.e());
        }
        h72 b = ((d72) this.key).b();
        ux uxVar = this.otherKeyParameter;
        if (uxVar != null) {
            try {
                int i3 = this.state;
                if (i3 != 1 && i3 != 3) {
                    this.engine.i(false, this.key, uxVar, rr4Var);
                    return this.engine.j(byteArray, 0, byteArray.length);
                }
                this.engine.i(true, uxVar, this.key, rr4Var);
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (Exception e) {
                throw new BadBlockException("unable to process block", e);
            }
        }
        int i4 = this.state;
        if (i4 == 1 || i4 == 3) {
            c72 c72Var = new c72();
            c72Var.b(new a72(this.random, b));
            try {
                this.engine.g(this.key, rr4Var, new ck3(c72Var, new af5() { // from class: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher.1
                    @Override // defpackage.af5
                    public byte[] getEncoded(ux uxVar2) {
                        int bitLength = (((d72) uxVar2).b().f().bitLength() + 7) / 8;
                        byte[] bArr2 = new byte[bitLength];
                        byte[] c = db0.c(((l72) uxVar2).c());
                        if (c.length <= bitLength) {
                            System.arraycopy(c, 0, bArr2, bitLength - c.length, c.length);
                            return bArr2;
                        }
                        throw new IllegalArgumentException("Senders's public key longer than expected.");
                    }
                }));
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (Exception e2) {
                throw new BadBlockException("unable to process block", e2);
            }
        } else if (i4 == 2 || i4 == 4) {
            try {
                nr4 nr4Var = this.engine;
                ux uxVar2 = this.key;
                nr4Var.h(uxVar2, rr4Var, new x62(((d72) uxVar2).b()));
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (InvalidCipherTextException e3) {
                throw new BadBlockException("unable to process block", e3);
            }
        } else {
            throw new IllegalStateException("IESCipher not initialised");
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException("cannot handle supplied parameter spec: " + e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.buffer.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
        pr4 pr4Var;
        ux generatePublicKeyParameter;
        PrivateKey V;
        byte[] bArr;
        if (algorithmParameterSpec == null) {
            int i2 = this.ivLength;
            if (i2 == 0 || i != 1) {
                bArr = null;
            } else {
                bArr = new byte[i2];
                secureRandom.nextBytes(bArr);
            }
            pr4Var = IESUtil.guessParameterSpec(this.engine.d(), bArr);
        } else if (!(algorithmParameterSpec instanceof pr4)) {
            throw new InvalidAlgorithmParameterException("must be passed IES parameters");
        } else {
            pr4Var = (pr4) algorithmParameterSpec;
        }
        this.engineSpec = pr4Var;
        byte[] e = this.engineSpec.e();
        int i3 = this.ivLength;
        if (i3 != 0 && (e == null || e.length != i3)) {
            throw new InvalidAlgorithmParameterException("NONCE in IES Parameters needs to be " + this.ivLength + " bytes long");
        }
        if (i == 1 || i == 3) {
            if (!(key instanceof DHPublicKey)) {
                if (!(key instanceof or4)) {
                    throw new InvalidKeyException("must be passed recipient's public DH key for encryption");
                }
                or4 or4Var = (or4) key;
                this.key = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter(or4Var.C0());
                this.otherKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePrivateKeyParameter(or4Var.V());
                this.random = secureRandom;
                this.state = i;
                this.buffer.reset();
            }
            generatePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter((PublicKey) key);
        } else if (i != 2 && i != 4) {
            throw new InvalidKeyException("must be passed EC key");
        } else {
            if (key instanceof DHPrivateKey) {
                V = (PrivateKey) key;
            } else if (!(key instanceof or4)) {
                throw new InvalidKeyException("must be passed recipient's private DH key for decryption");
            } else {
                or4 or4Var2 = (or4) key;
                this.otherKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter(or4Var2.C0());
                V = or4Var2.V();
            }
            generatePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePrivateKeyParameter(V);
        }
        this.key = generatePublicKeyParameter;
        this.random = secureRandom;
        this.state = i;
        this.buffer.reset();
    }
}
