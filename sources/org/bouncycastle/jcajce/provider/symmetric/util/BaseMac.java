package org.bouncycastle.jcajce.provider.symmetric.util;

import ch.qos.logback.core.net.SyslogConstants;
import defpackage.pna;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
/* loaded from: classes3.dex */
public class BaseMac extends MacSpi implements PBE {
    private static final Class gcmSpecClass = ClassUtil.loadClass(BaseMac.class, "javax.crypto.spec.GCMParameterSpec");
    private int keySize;
    private x36 macEngine;
    private int pbeHash;
    private int scheme;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseMac(x36 x36Var) {
        this.scheme = 2;
        this.pbeHash = 1;
        this.keySize = SyslogConstants.LOG_LOCAL4;
        this.macEngine = x36Var;
    }

    private static Hashtable copyMap(Map map) {
        Hashtable hashtable = new Hashtable();
        for (Object obj : map.keySet()) {
            hashtable.put(obj, map.get(obj));
        }
        return hashtable;
    }

    @Override // javax.crypto.MacSpi
    protected byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.macEngine.doFinal(bArr, 0);
        return bArr;
    }

    @Override // javax.crypto.MacSpi
    protected int engineGetMacLength() {
        return this.macEngine.getMacSize();
    }

    @Override // javax.crypto.MacSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i;
        v71 makePBEMacParameters;
        lf5 lf5Var;
        if (key != null) {
            if (key instanceof sn7) {
                try {
                    SecretKey secretKey = (SecretKey) key;
                    try {
                        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                        if ((secretKey instanceof PBEKey) && pBEParameterSpec == null) {
                            PBEKey pBEKey = (PBEKey) secretKey;
                            pBEParameterSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                        }
                        int i2 = 256;
                        if (this.macEngine.getAlgorithmName().startsWith("GOST")) {
                            i = 6;
                        } else {
                            x36 x36Var = this.macEngine;
                            if ((x36Var instanceof qj4) && !x36Var.getAlgorithmName().startsWith("SHA-1")) {
                                if (this.macEngine.getAlgorithmName().startsWith("SHA-224")) {
                                    i = 7;
                                    i2 = 224;
                                } else if (this.macEngine.getAlgorithmName().startsWith("SHA-256")) {
                                    i = 4;
                                } else if (this.macEngine.getAlgorithmName().startsWith("SHA-384")) {
                                    i = 8;
                                    i2 = 384;
                                } else if (this.macEngine.getAlgorithmName().startsWith("SHA-512")) {
                                    i = 9;
                                    i2 = 512;
                                } else if (this.macEngine.getAlgorithmName().startsWith("RIPEMD160")) {
                                    i = 2;
                                } else {
                                    throw new InvalidAlgorithmParameterException("no PKCS12 mapping for HMAC: " + this.macEngine.getAlgorithmName());
                                }
                            } else {
                                i = 1;
                            }
                            i2 = SyslogConstants.LOG_LOCAL4;
                        }
                        makePBEMacParameters = PBE.Util.makePBEMacParameters(secretKey, 2, i, i2, pBEParameterSpec);
                    } catch (Exception unused) {
                        throw new InvalidAlgorithmParameterException("PKCS12 requires a PBEParameterSpec");
                    }
                } catch (Exception unused2) {
                    throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
                }
            } else if (key instanceof BCPBEKey) {
                BCPBEKey bCPBEKey = (BCPBEKey) key;
                if (bCPBEKey.getParam() != null) {
                    makePBEMacParameters = bCPBEKey.getParam();
                } else if (algorithmParameterSpec instanceof PBEParameterSpec) {
                    makePBEMacParameters = PBE.Util.makePBEMacParameters(bCPBEKey, algorithmParameterSpec);
                } else {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                makePBEMacParameters = new lf5(key.getEncoded());
            } else {
                throw new InvalidAlgorithmParameterException("inappropriate parameter type: " + algorithmParameterSpec.getClass().getName());
            }
            if (makePBEMacParameters instanceof pq7) {
                lf5Var = (lf5) makePBEMacParameters.b();
            } else {
                lf5Var = makePBEMacParameters;
            }
            if (algorithmParameterSpec instanceof o) {
                o oVar = (o) algorithmParameterSpec;
                makePBEMacParameters = new p(lf5Var, oVar.b(), oVar.c(), oVar.a());
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                makePBEMacParameters = new pq7(lf5Var, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                makePBEMacParameters = new pq7(new q29(lf5Var.a(), rC2ParameterSpec.getEffectiveKeyBits()), rC2ParameterSpec.getIV());
            } else if (algorithmParameterSpec instanceof ona) {
                makePBEMacParameters = new pna.b(copyMap(((ona) algorithmParameterSpec).a())).c(lf5Var.a()).a();
            } else if (algorithmParameterSpec == null) {
                makePBEMacParameters = new lf5(key.getEncoded());
            } else {
                Class cls = gcmSpecClass;
                if (cls != null && cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
                    makePBEMacParameters = GcmSpecUtil.extractAeadParameters(lf5Var, algorithmParameterSpec);
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("unknown parameter type: " + algorithmParameterSpec.getClass().getName());
                }
            }
            try {
                this.macEngine.init(makePBEMacParameters);
                return;
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException("cannot initialize MAC: " + e.getMessage());
            }
        }
        throw new InvalidKeyException("key is null");
    }

    @Override // javax.crypto.MacSpi
    protected void engineReset() {
        this.macEngine.reset();
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte b) {
        this.macEngine.update(b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseMac(x36 x36Var, int i, int i2, int i3) {
        this.macEngine = x36Var;
        this.scheme = i;
        this.pbeHash = i2;
        this.keySize = i3;
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.macEngine.update(bArr, i, i2);
    }
}
