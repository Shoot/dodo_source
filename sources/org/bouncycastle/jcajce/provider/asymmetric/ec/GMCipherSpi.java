package org.bouncycastle.jcajce.provider.asymmetric.ec;

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
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
/* loaded from: classes3.dex */
public class GMCipherSpi extends CipherSpi {
    private lq9 engine;
    private ux key;
    private SecureRandom random;
    private final d95 helper = new u40();
    private int state = -1;
    private ErasableOutputStream buffer = new ErasableOutputStream();

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            tr.y(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2 extends GMCipherSpi {
        public SM2() {
            super(new lq9());
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withBlake2b extends GMCipherSpi {
        public SM2withBlake2b() {
            super(new lq9(new nc0(512)));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withBlake2s extends GMCipherSpi {
        public SM2withBlake2s() {
            super(new lq9(new oc0(256)));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withMD5 extends GMCipherSpi {
        public SM2withMD5() {
            super(new lq9(new q36()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withRMD extends GMCipherSpi {
        public SM2withRMD() {
            super(new lq9(new d39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withSha1 extends GMCipherSpi {
        public SM2withSha1() {
            super(new lq9(new bq9()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withSha224 extends GMCipherSpi {
        public SM2withSha224() {
            super(new lq9(new cq9()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withSha256 extends GMCipherSpi {
        public SM2withSha256() {
            super(new lq9(new dq9()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withSha384 extends GMCipherSpi {
        public SM2withSha384() {
            super(new lq9(new eq9()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withSha512 extends GMCipherSpi {
        public SM2withSha512() {
            super(new lq9(new gq9()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SM2withWhirlpool extends GMCipherSpi {
        public SM2withWhirlpool() {
            super(new lq9(new m4c()));
        }
    }

    public GMCipherSpi(lq9 lq9Var) {
        this.engine = lq9Var;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof ua3) {
            return ((ua3) key).getParameters().a().t();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        int i2 = this.state;
        if (i2 != 1 && i2 != 3 && i2 != 2 && i2 != 4) {
            throw new IllegalStateException("cipher not initialised");
        }
        return this.engine.e(i);
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + algorithmParameters.getClass().getName());
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        if (a0b.j(str).equals("NONE")) {
            return;
        }
        throw new IllegalArgumentException("can't support mode " + str);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (a0b.j(str).equals("NOPADDING")) {
            return;
        }
        throw new NoSuchPaddingException("padding not available with IESCipher");
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.buffer.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        byte[] j;
        if (i2 != 0) {
            this.buffer.write(bArr, i, i2);
        }
        try {
            int i3 = this.state;
            if (i3 == 1 || i3 == 3) {
                try {
                    this.engine.f(true, new qq7(this.key, this.random));
                    j = this.engine.j(this.buffer.getBuf(), 0, this.buffer.size());
                    return j;
                } catch (Exception e) {
                    throw new BadBlockException("unable to process block", e);
                }
            } else if (i3 == 2 || i3 == 4) {
                try {
                    this.engine.f(false, this.key);
                    j = this.engine.j(this.buffer.getBuf(), 0, this.buffer.size());
                    return j;
                } catch (Exception e2) {
                    throw new BadBlockException("unable to process block", e2);
                }
            } else {
                throw new IllegalStateException("cipher not initialised");
            }
        } finally {
            this.buffer.erase();
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
        ux generatePublicKeyParameter;
        if (i == 1 || i == 3) {
            if (!(key instanceof PublicKey)) {
                throw new InvalidKeyException("must be passed public EC key for encryption");
            }
            generatePublicKeyParameter = ECUtils.generatePublicKeyParameter((PublicKey) key);
        } else if (i != 2 && i != 4) {
            throw new InvalidKeyException("must be passed EC key");
        } else {
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException("must be passed private EC key for decryption");
            }
            generatePublicKeyParameter = ECUtil.generatePrivateKeyParameter((PrivateKey) key);
        }
        this.key = generatePublicKeyParameter;
        if (secureRandom != null) {
            this.random = secureRandom;
        } else {
            this.random = b32.b();
        }
        this.state = i;
        this.buffer.reset();
    }
}
