package org.bouncycastle.jcajce.provider.symmetric.util;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
/* loaded from: classes3.dex */
public abstract class BaseWrapCipher extends CipherSpi implements PBE {
    private Class[] availableSpecs;
    protected AlgorithmParameters engineParams;
    private boolean forWrapping;
    private final d95 helper;
    private byte[] iv;
    private int ivSize;
    protected int pbeHash;
    protected int pbeIvSize;
    protected int pbeKeySize;
    protected int pbeType;
    protected l8c wrapEngine;
    private ErasableOutputStream wrapStream;

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

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class InvalidKeyOrParametersException extends InvalidKeyException {
        private final Throwable cause;

        /* JADX INFO: Access modifiers changed from: package-private */
        public InvalidKeyOrParametersException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseWrapCipher() {
        this.availableSpecs = new Class[]{za4.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new u40();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AlgorithmParameters createParametersInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.helper.g(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #2 {all -> 0x001f, blocks: (B:5:0x0007, B:8:0x000c, B:16:0x003e, B:18:0x0043, B:21:0x004e, B:22:0x0055, B:15:0x002c, B:13:0x0022, B:14:0x002b, B:24:0x0057, B:25:0x0060), top: B:34:0x0007, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[Catch: all -> 0x001f, TRY_ENTER, TryCatch #2 {all -> 0x001f, blocks: (B:5:0x0007, B:8:0x000c, B:16:0x003e, B:18:0x0043, B:21:0x004e, B:22:0x0055, B:15:0x002c, B:13:0x0022, B:14:0x002b, B:24:0x0057, B:25:0x0060), top: B:34:0x0007, inners: #0, #1 }] */
    @Override // javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected int engineDoFinal(byte[] r2, int r3, int r4, byte[] r5, int r6) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException {
        /*
            r1 = this;
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r0 = r1.wrapStream
            if (r0 == 0) goto L67
            r0.write(r2, r3, r4)
            boolean r2 = r1.forWrapping     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            if (r2 == 0) goto L2c
            l8c r2 = r1.wrapEngine     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r4 = r1.wrapStream     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            byte[] r4 = r4.getBuf()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r0 = r1.wrapStream     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            byte[] r2 = r2.a(r4, r3, r0)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            goto L3e
        L1f:
            r2 = move-exception
            goto L61
        L21:
            r2 = move-exception
            javax.crypto.IllegalBlockSizeException r3 = new javax.crypto.IllegalBlockSizeException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L1f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1f
        L2c:
            l8c r2 = r1.wrapEngine     // Catch: java.lang.Throwable -> L1f org.bouncycastle.crypto.InvalidCipherTextException -> L56
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r4 = r1.wrapStream     // Catch: java.lang.Throwable -> L1f org.bouncycastle.crypto.InvalidCipherTextException -> L56
            byte[] r4 = r4.getBuf()     // Catch: java.lang.Throwable -> L1f org.bouncycastle.crypto.InvalidCipherTextException -> L56
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r0 = r1.wrapStream     // Catch: java.lang.Throwable -> L1f org.bouncycastle.crypto.InvalidCipherTextException -> L56
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1f org.bouncycastle.crypto.InvalidCipherTextException -> L56
            byte[] r2 = r2.b(r4, r3, r0)     // Catch: java.lang.Throwable -> L1f org.bouncycastle.crypto.InvalidCipherTextException -> L56
        L3e:
            int r4 = r2.length     // Catch: java.lang.Throwable -> L1f
            int r4 = r4 + r6
            int r0 = r5.length     // Catch: java.lang.Throwable -> L1f
            if (r4 > r0) goto L4e
            int r4 = r2.length     // Catch: java.lang.Throwable -> L1f
            java.lang.System.arraycopy(r2, r3, r5, r6, r4)     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r3 = r1.wrapStream
            r3.erase()
            return r2
        L4e:
            javax.crypto.ShortBufferException r2 = new javax.crypto.ShortBufferException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "output buffer too short for input."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            throw r2     // Catch: java.lang.Throwable -> L1f
        L56:
            r2 = move-exception
            javax.crypto.BadPaddingException r3 = new javax.crypto.BadPaddingException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L1f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1f
        L61:
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r3 = r1.wrapStream
            r3.erase()
            throw r2
        L67:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "not supported in a wrapping mode"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.engineDoFinal(byte[], int, int, byte[], int):int");
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return tr.h(this.iv);
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.iv != null) {
            String algorithmName = this.wrapEngine.getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(algorithmName);
                this.engineParams = createParametersInstance;
                createParametersInstance.init(new IvParameterSpec(this.iv));
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpec = SpecUtil.extractSpec(algorithmParameters, this.availableSpecs);
            if (algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.engineParams = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException("can't support mode " + str);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException("Padding " + str + " unknown.");
    }

    @Override // javax.crypto.CipherSpi
    protected Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException, NoSuchAlgorithmException {
        byte[] b;
        try {
            l8c l8cVar = this.wrapEngine;
            if (l8cVar == null) {
                b = engineDoFinal(bArr, 0, bArr.length);
            } else {
                b = l8cVar.b(bArr, 0, bArr.length);
            }
            if (i == 3) {
                return new SecretKeySpec(b, str);
            }
            if (str.equals("") && i == 2) {
                try {
                    dk8 u = dk8.u(b);
                    PrivateKey d = ff0.d(u);
                    if (d != null) {
                        return d;
                    }
                    throw new InvalidKeyException("algorithm " + u.w().t() + " not supported");
                } catch (Exception unused) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
            try {
                KeyFactory d2 = this.helper.d(str);
                if (i == 1) {
                    return d2.generatePublic(new X509EncodedKeySpec(b));
                }
                if (i == 2) {
                    return d2.generatePrivate(new PKCS8EncodedKeySpec(b));
                }
                throw new InvalidKeyException("Unknown key type " + i);
            } catch (NoSuchProviderException e) {
                throw new InvalidKeyException("Unknown key type " + e.getMessage());
            } catch (InvalidKeySpecException e2) {
                throw new InvalidKeyException("Unknown key type " + e2.getMessage());
            }
        } catch (BadPaddingException e3) {
            throw new InvalidKeyException(e3.getMessage());
        } catch (IllegalBlockSizeException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (InvalidCipherTextException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i, i2);
            return 0;
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                l8c l8cVar = this.wrapEngine;
                if (l8cVar == null) {
                    return engineDoFinal(encoded, 0, encoded.length);
                }
                return l8cVar.a(encoded, 0, encoded.length);
            } catch (BadPaddingException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            }
        }
        throw new InvalidKeyException("Cannot wrap key, null encoding.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseWrapCipher(l8c l8cVar) {
        this(l8cVar, 0);
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        byte[] b;
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            if (bArr != null) {
                erasableOutputStream.write(bArr, i, i2);
            }
            try {
                if (this.forWrapping) {
                    try {
                        b = this.wrapEngine.a(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                        return b;
                    } catch (Exception e) {
                        throw new IllegalBlockSizeException(e.getMessage());
                    }
                }
                try {
                    b = this.wrapEngine.b(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                    return b;
                } catch (InvalidCipherTextException e2) {
                    throw new BadPaddingException(e2.getMessage());
                }
            } finally {
                this.wrapStream.erase();
            }
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyOrParametersException(e.getMessage(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i, i2);
            return null;
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseWrapCipher(l8c l8cVar, int i) {
        this.availableSpecs = new Class[]{za4.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new u40();
        this.wrapEngine = l8cVar;
        this.ivSize = i;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        pq7 lf5Var;
        int i2;
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                lf5Var = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.wrapEngine.getAlgorithmName());
            } else if (bCPBEKey.getParam() == null) {
                throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
            } else {
                lf5Var = bCPBEKey.getParam();
            }
        } else {
            lf5Var = new lf5(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            byte[] iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            this.iv = iv;
            lf5Var = new pq7(lf5Var, iv);
        }
        if (algorithmParameterSpec instanceof za4) {
            za4 za4Var = (za4) algorithmParameterSpec;
            byte[] a = za4Var.a();
            if (a != null) {
                lf5Var = new rq7(lf5Var, a);
            }
            lf5Var = new sq7(lf5Var, za4Var.b());
        }
        if ((lf5Var instanceof lf5) && (i2 = this.ivSize) != 0 && (i == 3 || i == 1)) {
            byte[] bArr = new byte[i2];
            this.iv = bArr;
            secureRandom.nextBytes(bArr);
            lf5Var = new pq7(lf5Var, this.iv);
        }
        if (secureRandom != null) {
            lf5Var = new qq7(lf5Var, secureRandom);
        }
        try {
            if (i != 1) {
                if (i == 2) {
                    this.wrapEngine.init(false, lf5Var);
                    this.wrapStream = new ErasableOutputStream();
                } else if (i == 3) {
                    this.wrapEngine.init(true, lf5Var);
                    this.wrapStream = null;
                } else if (i != 4) {
                    throw new InvalidParameterException("Unknown mode parameter passed to init.");
                } else {
                    this.wrapEngine.init(false, lf5Var);
                    this.wrapStream = null;
                }
                this.forWrapping = false;
                return;
            }
            this.wrapEngine.init(true, lf5Var);
            this.wrapStream = new ErasableOutputStream();
            this.forWrapping = true;
        } catch (Exception e) {
            throw new InvalidKeyOrParametersException(e.getMessage(), e);
        }
    }
}
