package org.bouncycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
/* loaded from: classes3.dex */
public class BaseBlockCipher extends BaseWrapCipher implements PBE {
    private static final int BUF_SIZE = 512;
    private static final Class gcmSpecClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.spec.GCMParameterSpec");
    private p aeadParams;
    private Class[] availableSpecs;
    private xc0 baseEngine;
    private GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private pq7 ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        private n cipher;

        static {
            Constructor constructor;
            Class loadClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
            if (loadClass != null) {
                constructor = findExceptionConstructor(loadClass);
            } else {
                constructor = null;
            }
            aeadBadTagConstructor = constructor;
        }

        AEADGenericBlockCipher(n nVar) {
            this.cipher = nVar;
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(String.class);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            BadPaddingException badPaddingException;
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                Constructor constructor = aeadBadTagConstructor;
                if (constructor != null) {
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(e.getMessage());
                    } catch (Exception unused) {
                        badPaddingException = null;
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            n nVar = this.cipher;
            if (nVar instanceof m) {
                return ((m) nVar).getUnderlyingCipher().getAlgorithmName();
            }
            return nVar.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public xc0 getUnderlyingCipher() {
            n nVar = this.cipher;
            if (nVar instanceof m) {
                return ((m) nVar).getUnderlyingCipher();
            }
            return null;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
            this.cipher.init(z, v71Var);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            return this.cipher.processByte(b, bArr, i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            this.cipher.b(bArr, i, i2);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    private static class BufferedFPEBlockCipher implements GenericBlockCipher {
        private fo3 cipher;
        private BaseWrapCipher.ErasableOutputStream eOut = new BaseWrapCipher.ErasableOutputStream();

        BufferedFPEBlockCipher(fo3 fo3Var) {
            this.cipher = fo3Var;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            try {
                return this.cipher.e(this.eOut.getBuf(), 0, this.eOut.size(), bArr, i);
            } finally {
                this.eOut.erase();
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.c();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.eOut.size() + i;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public xc0 getUnderlyingCipher() {
            throw new IllegalStateException("not applicable for FPE");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
            this.cipher.d(z, v71Var);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            this.eOut.write(b);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            this.eOut.write(bArr, i, i2);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    private static class BufferedGenericBlockCipher implements GenericBlockCipher {
        private ch0 cipher;

        BufferedGenericBlockCipher(xc0 xc0Var) {
            this.cipher = new dp7(xc0Var);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            try {
                return this.cipher.a(bArr, i);
            } catch (InvalidCipherTextException e) {
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.d().getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.cipher.c(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public xc0 getUnderlyingCipher() {
            return this.cipher.d();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return this.cipher.e(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
            this.cipher.f(z, v71Var);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            return this.cipher.g(b, bArr, i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return this.cipher.h(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return !(this.cipher instanceof hl0);
        }

        BufferedGenericBlockCipher(xc0 xc0Var, yc0 yc0Var) {
            this.cipher = new dp7(xc0Var, yc0Var);
        }

        BufferedGenericBlockCipher(ch0 ch0Var) {
            this.cipher = ch0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException;

        String getAlgorithmName();

        int getOutputSize(int i);

        xc0 getUnderlyingCipher();

        int getUpdateOutputSize(int i);

        void init(boolean z, v71 v71Var) throws IllegalArgumentException;

        int processByte(byte b, byte[] bArr, int i) throws DataLengthException;

        int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException;

        void updateAAD(byte[] bArr, int i, int i2);

        boolean wrapOnNoPadding();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(m mVar) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, wa4.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = mVar.getUnderlyingCipher();
        this.ivLength = mVar.getAlgorithmName().indexOf("GCM") >= 0 ? 12 : this.baseEngine.a();
        this.cipher = new AEADGenericBlockCipher(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v71 adjustParameters(AlgorithmParameterSpec algorithmParameterSpec, v71 v71Var) {
        rq7 rq7Var;
        pq7 pq7Var;
        if (v71Var instanceof pq7) {
            v71 b = ((pq7) v71Var).b();
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                pq7Var = new pq7(b, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (algorithmParameterSpec instanceof wa4) {
                wa4 wa4Var = (wa4) algorithmParameterSpec;
                rq7 rq7Var2 = new rq7(v71Var, wa4Var.d());
                if (wa4Var.a() != null && this.ivLength != 0) {
                    pq7Var = new pq7(b, wa4Var.a());
                } else {
                    return rq7Var2;
                }
            } else {
                return v71Var;
            }
            this.ivParam = pq7Var;
            return pq7Var;
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            pq7 pq7Var2 = new pq7(v71Var, ((IvParameterSpec) algorithmParameterSpec).getIV());
            this.ivParam = pq7Var2;
            rq7Var = pq7Var2;
        } else if (algorithmParameterSpec instanceof wa4) {
            wa4 wa4Var2 = (wa4) algorithmParameterSpec;
            rq7 rq7Var3 = new rq7(v71Var, wa4Var2.d());
            rq7Var = rq7Var3;
            if (wa4Var2.a() != null) {
                rq7Var = rq7Var3;
                if (this.ivLength != 0) {
                    return new pq7(rq7Var3, wa4Var2.a());
                }
            }
        } else {
            return v71Var;
        }
        return rq7Var;
    }

    private boolean isAEADModeName(String str) {
        if (!"CCM".equals(str) && !"EAX".equals(str) && !"GCM".equals(str) && !"GCM-SIV".equals(str) && !"OCB".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        int processBytes;
        if (engineGetOutputSize(i2) + i3 <= bArr2.length) {
            if (i2 != 0) {
                try {
                    processBytes = this.cipher.processBytes(bArr, i, i2, bArr2, i3);
                } catch (OutputLengthException e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                } catch (DataLengthException e2) {
                    throw new IllegalBlockSizeException(e2.getMessage());
                }
            } else {
                processBytes = 0;
            }
            return processBytes + this.cipher.doFinal(bArr2, i3 + processBytes);
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        xc0 xc0Var = this.baseEngine;
        if (xc0Var == null) {
            return -1;
        }
        return xc0Var.a();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        p pVar = this.aeadParams;
        if (pVar != null) {
            return pVar.d();
        }
        pq7 pq7Var = this.ivParam;
        if (pq7Var != null) {
            return pq7Var.a();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return this.cipher.getOutputSize(i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    AlgorithmParameters createParametersInstance = createParametersInstance(this.pbeAlgorithm);
                    this.engineParams = createParametersInstance;
                    createParametersInstance.init(this.pbeSpec);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.aeadParams != null) {
                if (this.baseEngine == null) {
                    try {
                        AlgorithmParameters createParametersInstance2 = createParametersInstance(co7.C1.H());
                        this.engineParams = createParametersInstance2;
                        createParametersInstance2.init(new s0(this.aeadParams.d()).getEncoded());
                    } catch (Exception e) {
                        throw new RuntimeException(e.toString());
                    }
                } else {
                    try {
                        AlgorithmParameters createParametersInstance3 = createParametersInstance("GCM");
                        this.engineParams = createParametersInstance3;
                        createParametersInstance3.init(new ca4(this.aeadParams.d(), this.aeadParams.c() / 8).getEncoded());
                    } catch (Exception e2) {
                        throw new RuntimeException(e2.toString());
                    }
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    AlgorithmParameters createParametersInstance4 = createParametersInstance(algorithmName);
                    this.engineParams = createParametersInstance4;
                    createParametersInstance4.init(new IvParameterSpec(this.ivParam.a()));
                } catch (Exception e3) {
                    throw new RuntimeException(e3.toString());
                }
            }
        }
        return this.engineParams;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
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
        engineInit(i, key, algorithmParameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        GenericBlockCipher aEADGenericBlockCipher;
        BufferedGenericBlockCipher bufferedGenericBlockCipher;
        if (this.baseEngine != null) {
            String j = a0b.j(str);
            this.modeName = j;
            if (j.equals("ECB")) {
                this.ivLength = 0;
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(this.baseEngine);
            } else if (this.modeName.equals("CBC")) {
                this.ivLength = this.baseEngine.a();
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(new tk0(this.baseEngine));
            } else if (this.modeName.startsWith("OFB")) {
                this.ivLength = this.baseEngine.a();
                if (this.modeName.length() != 3) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new e47(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                    this.cipher = bufferedGenericBlockCipher;
                    return;
                }
                xc0 xc0Var = this.baseEngine;
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(new e47(xc0Var, xc0Var.a() * 8));
            } else if (this.modeName.startsWith("CFB")) {
                this.ivLength = this.baseEngine.a();
                if (this.modeName.length() != 3) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new yk0(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                    this.cipher = bufferedGenericBlockCipher;
                    return;
                }
                xc0 xc0Var2 = this.baseEngine;
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(new yk0(xc0Var2, xc0Var2.a() * 8));
            } else {
                if (this.modeName.startsWith("PGPCFB")) {
                    boolean equals = this.modeName.equals("PGPCFBWITHIV");
                    if (!equals && this.modeName.length() != 6) {
                        throw new NoSuchAlgorithmException("no mode support for " + this.modeName);
                    }
                    this.ivLength = this.baseEngine.a();
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new pn7(this.baseEngine, equals));
                } else if (this.modeName.equals("OPENPGPCFB")) {
                    this.ivLength = 0;
                    aEADGenericBlockCipher = new BufferedGenericBlockCipher(new la7(this.baseEngine));
                } else if (this.modeName.equals("FF1")) {
                    this.ivLength = 0;
                    aEADGenericBlockCipher = new BufferedFPEBlockCipher(new go3(this.baseEngine));
                } else if (this.modeName.equals("FF3-1")) {
                    this.ivLength = 0;
                    aEADGenericBlockCipher = new BufferedFPEBlockCipher(new ho3(this.baseEngine));
                } else if (this.modeName.equals("SIC")) {
                    int a = this.baseEngine.a();
                    this.ivLength = a;
                    if (a >= 16) {
                        this.fixedIv = false;
                        aEADGenericBlockCipher = new BufferedGenericBlockCipher(new ch0(new kq9(this.baseEngine)));
                    } else {
                        throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
                    }
                } else if (this.modeName.equals("CTR")) {
                    this.ivLength = this.baseEngine.a();
                    this.fixedIv = false;
                    xc0 xc0Var3 = this.baseEngine;
                    if (xc0Var3 instanceof s82) {
                        bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new ch0(new md5(xc0Var3)));
                    } else {
                        bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new ch0(new kq9(xc0Var3)));
                    }
                } else if (this.modeName.equals("GOFB")) {
                    this.ivLength = this.baseEngine.a();
                    aEADGenericBlockCipher = new BufferedGenericBlockCipher(new ch0(new ta4(this.baseEngine)));
                } else if (this.modeName.equals("GCFB")) {
                    this.ivLength = this.baseEngine.a();
                    aEADGenericBlockCipher = new BufferedGenericBlockCipher(new ch0(new y94(this.baseEngine)));
                } else if (this.modeName.equals("CTS")) {
                    this.ivLength = this.baseEngine.a();
                    aEADGenericBlockCipher = new BufferedGenericBlockCipher(new hl0(new tk0(this.baseEngine)));
                } else if (this.modeName.equals("CCM")) {
                    this.ivLength = 12;
                    if (this.baseEngine instanceof s82) {
                        aEADGenericBlockCipher = new AEADGenericBlockCipher(new ld5(this.baseEngine));
                    } else {
                        aEADGenericBlockCipher = new AEADGenericBlockCipher(new vk0(this.baseEngine));
                    }
                } else if (this.modeName.equals("OCB")) {
                    if (this.engineProvider != null) {
                        this.ivLength = 15;
                        aEADGenericBlockCipher = new AEADGenericBlockCipher(new d47(this.baseEngine, this.engineProvider.get()));
                    } else {
                        throw new NoSuchAlgorithmException("can't support mode " + str);
                    }
                } else if (this.modeName.equals("EAX")) {
                    this.ivLength = this.baseEngine.a();
                    aEADGenericBlockCipher = new AEADGenericBlockCipher(new ba3(this.baseEngine));
                } else if (this.modeName.equals("GCM-SIV")) {
                    this.ivLength = 12;
                    aEADGenericBlockCipher = new AEADGenericBlockCipher(new da4(this.baseEngine));
                } else if (this.modeName.equals("GCM")) {
                    xc0 xc0Var4 = this.baseEngine;
                    if (xc0Var4 instanceof s82) {
                        this.ivLength = xc0Var4.a();
                        aEADGenericBlockCipher = new AEADGenericBlockCipher(new ud5(this.baseEngine));
                    } else {
                        this.ivLength = 12;
                        aEADGenericBlockCipher = new AEADGenericBlockCipher(new z94(this.baseEngine));
                    }
                } else {
                    throw new NoSuchAlgorithmException("can't support mode " + str);
                }
                this.cipher = bufferedGenericBlockCipher;
                return;
            }
            this.cipher = aEADGenericBlockCipher;
            return;
        }
        throw new NoSuchAlgorithmException("no mode supported for this algorithm");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        BufferedGenericBlockCipher bufferedGenericBlockCipher;
        if (this.baseEngine != null) {
            String j = a0b.j(str);
            if (j.equals("NOPADDING")) {
                if (this.cipher.wrapOnNoPadding()) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new ch0(this.cipher.getUnderlyingCipher()));
                } else {
                    return;
                }
            } else if (!j.equals("WITHCTS") && !j.equals("CTSPADDING") && !j.equals("CS3PADDING")) {
                this.padded = true;
                if (!isAEADModeName(this.modeName)) {
                    if (!j.equals("PKCS5PADDING") && !j.equals("PKCS7PADDING")) {
                        if (j.equals("ZEROBYTEPADDING")) {
                            bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new qcc());
                        } else if (!j.equals("ISO10126PADDING") && !j.equals("ISO10126-2PADDING")) {
                            if (!j.equals("X9.23PADDING") && !j.equals("X923PADDING")) {
                                if (!j.equals("ISO7816-4PADDING") && !j.equals("ISO9797-1PADDING")) {
                                    if (j.equals("TBCPADDING")) {
                                        bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new h5b());
                                    } else {
                                        throw new NoSuchPaddingException("Padding " + str + " unknown.");
                                    }
                                } else {
                                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new us4());
                                }
                            } else {
                                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new dac());
                            }
                        } else {
                            bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ss4());
                        }
                    } else {
                        bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
                    }
                } else {
                    throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
                }
            } else {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new hl0(this.cipher.getUnderlyingCipher()));
            }
            this.cipher = bufferedGenericBlockCipher;
            return;
        }
        throw new NoSuchPaddingException("no padding supported for this algorithm");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (this.cipher.getUpdateOutputSize(i2) + i3 <= bArr2.length) {
            try {
                return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
            } catch (DataLengthException e) {
                throw new IllegalStateException(e.toString());
            }
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < 1) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), remaining);
            byteBuffer.position(byteBuffer.limit());
        } else if (remaining <= BUF_SIZE) {
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, remaining);
            tr.y(bArr, (byte) 0);
        } else {
            byte[] bArr2 = new byte[BUF_SIZE];
            do {
                int min = Math.min((int) BUF_SIZE, remaining);
                byteBuffer.get(bArr2, 0, min);
                engineUpdateAAD(bArr2, 0, min);
                remaining -= min;
            } while (remaining > 0);
            tr.y(bArr2, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(m mVar, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, wa4.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = mVar.getUnderlyingCipher();
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(mVar);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        int engineGetOutputSize = engineGetOutputSize(i2);
        byte[] bArr2 = new byte[engineGetOutputSize];
        int processBytes = i2 != 0 ? this.cipher.processBytes(bArr, i, i2, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.cipher.doFinal(bArr2, processBytes);
            if (doFinal == engineGetOutputSize) {
                return bArr2;
            }
            if (doFinal <= engineGetOutputSize) {
                byte[] bArr3 = new byte[doFinal];
                System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
                return bArr3;
            }
            throw new IllegalBlockSizeException("internal buffer overflow");
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i2);
        if (updateOutputSize <= 0) {
            this.cipher.processBytes(bArr, i, i2, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        int processBytes = this.cipher.processBytes(bArr, i, i2, bArr2, 0);
        if (processBytes == 0) {
            return null;
        }
        if (processBytes != updateOutputSize) {
            byte[] bArr3 = new byte[processBytes];
            System.arraycopy(bArr2, 0, bArr3, 0, processBytes);
            return bArr3;
        }
        return bArr2;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.cipher.updateAAD(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(n nVar, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, wa4.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = null;
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(nVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fa, code lost:
        if (r7 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
        if (r7 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
        r20.ivParam = (defpackage.pq7) r6;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
        if (r7 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0146, code lost:
        if (r7 != false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04e3 A[Catch: Exception -> 0x04cd, IllegalArgumentException -> 0x04cf, TryCatch #3 {IllegalArgumentException -> 0x04cf, Exception -> 0x04cd, blocks: (B:247:0x04b1, B:248:0x04cc, B:253:0x04d1, B:255:0x04dd, B:257:0x04e3, B:259:0x04e7, B:254:0x04d8), top: B:269:0x04a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v83, types: [pq7] */
    /* JADX WARN: Type inference failed for: r6v11, types: [v71] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [v71, v29] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22, types: [pq7] */
    /* JADX WARN: Type inference failed for: r6v24, types: [v71] */
    /* JADX WARN: Type inference failed for: r6v29, types: [p] */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void engineInit(int r21, java.security.Key r22, java.security.spec.AlgorithmParameterSpec r23, java.security.SecureRandom r24) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(xc0 xc0Var) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, wa4.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = xc0Var;
        this.cipher = new BufferedGenericBlockCipher(xc0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(xc0 xc0Var, int i) {
        this(xc0Var, true, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(xc0 xc0Var, int i, int i2, int i3, int i4) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, wa4.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = xc0Var;
        this.scheme = i;
        this.digest = i2;
        this.keySizeInBits = i3;
        this.ivLength = i4;
        this.cipher = new BufferedGenericBlockCipher(xc0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(xc0 xc0Var, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, wa4.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = xc0Var;
        this.fixedIv = z;
        this.cipher = new BufferedGenericBlockCipher(xc0Var);
        this.ivLength = i / 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(ch0 ch0Var, int i) {
        this(ch0Var, true, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(ch0 ch0Var, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, wa4.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = ch0Var.d();
        this.cipher = new BufferedGenericBlockCipher(ch0Var);
        this.fixedIv = z;
        this.ivLength = i / 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, wa4.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
    }
}
