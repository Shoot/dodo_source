package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
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
    private Object agreement;
    private m72 dheParameters;
    private String kaAlgorithm;
    private s36 mqvParameters;
    private la3 parameters;
    private byte[] result;

    /* loaded from: classes3.dex */
    public static class CDHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA1KDFAndSharedInfo() {
            super("ECCDHwithSHA1KDF", new ga3(), new qd5(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class CDHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA224KDFAndSharedInfo() {
            super("ECCDHwithSHA224KDF", new ga3(), new qd5(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class CDHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA256KDFAndSharedInfo() {
            super("ECCDHwithSHA256KDF", new ga3(), new qd5(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class CDHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA384KDFAndSharedInfo() {
            super("ECCDHwithSHA384KDF", new ga3(), new qd5(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class CDHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA512KDFAndSharedInfo() {
            super("ECCDHwithSHA512KDF", new ga3(), new qd5(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DH extends KeyAgreementSpi {
        public DH() {
            super("ECDH", new fa3(), (q03) null);
        }
    }

    /* loaded from: classes3.dex */
    public static class DHC extends KeyAgreementSpi {
        public DHC() {
            super("ECDHC", new ga3(), (q03) null);
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUC extends KeyAgreementSpi {
        public DHUC() {
            super("ECCDHU", new ha3(), (q03) null);
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("ECCDHUwithSHA1CKDF", new ha3(), new dp1(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("ECCDHUwithSHA1KDF", new ha3(), new qd5(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("ECCDHUwithSHA224CKDF", new ha3(), new dp1(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("ECCDHUwithSHA224KDF", new ha3(), new qd5(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("ECCDHUwithSHA256CKDF", new ha3(), new dp1(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("ECCDHUwithSHA256KDF", new ha3(), new qd5(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("ECCDHUwithSHA384CKDF", new ha3(), new dp1(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("ECCDHUwithSHA384KDF", new ha3(), new qd5(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("ECCDHUwithSHA512CKDF", new ha3(), new dp1(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("ECCDHUwithSHA512KDF", new ha3(), new qd5(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("ECDHwithSHA1CKDF", new ga3(), new dp1(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("ECDHwithSHA1KDF", new fa3(), new qd5(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA1KDFAndSharedInfo() {
            super("ECDHwithSHA1KDF", new fa3(), new qd5(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA224KDFAndSharedInfo() {
            super("ECDHwithSHA224KDF", new fa3(), new qd5(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("ECDHwithSHA256CKDF", new ga3(), new dp1(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA256KDFAndSharedInfo() {
            super("ECDHwithSHA256KDF", new fa3(), new qd5(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("ECDHwithSHA384CKDF", new ga3(), new dp1(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA384KDFAndSharedInfo() {
            super("ECDHwithSHA384KDF", new fa3(), new qd5(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("ECDHwithSHA512CKDF", new ga3(), new dp1(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA512KDFAndSharedInfo() {
            super("ECDHwithSHA512KDF", new fa3(), new qd5(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECKAEGwithRIPEMD160KDF extends KeyAgreementSpi {
        public ECKAEGwithRIPEMD160KDF() {
            super("ECKAEGwithRIPEMD160KDF", new fa3(), new qd5(new d39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECKAEGwithSHA1KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA1KDF() {
            super("ECKAEGwithSHA1KDF", new fa3(), new qd5(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECKAEGwithSHA224KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA224KDF() {
            super("ECKAEGwithSHA224KDF", new fa3(), new qd5(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECKAEGwithSHA256KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA256KDF() {
            super("ECKAEGwithSHA256KDF", new fa3(), new qd5(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECKAEGwithSHA384KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA384KDF() {
            super("ECKAEGwithSHA384KDF", new fa3(), new qd5(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECKAEGwithSHA512KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA512KDF() {
            super("ECKAEGwithSHA512KDF", new fa3(), new qd5(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQV extends KeyAgreementSpi {
        public MQV() {
            super("ECMQV", new ab3(), (q03) null);
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("ECMQVwithSHA1CKDF", new ab3(), new dp1(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("ECMQVwithSHA1KDF", new ab3(), new qd5(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA1KDFAndSharedInfo() {
            super("ECMQVwithSHA1KDF", new ab3(), new qd5(f23.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("ECMQVwithSHA224CKDF", new ab3(), new dp1(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("ECMQVwithSHA224KDF", new ab3(), new qd5(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA224KDFAndSharedInfo() {
            super("ECMQVwithSHA224KDF", new ab3(), new qd5(f23.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("ECMQVwithSHA256CKDF", new ab3(), new dp1(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("ECMQVwithSHA256KDF", new ab3(), new qd5(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA256KDFAndSharedInfo() {
            super("ECMQVwithSHA256KDF", new ab3(), new qd5(f23.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("ECMQVwithSHA384CKDF", new ab3(), new dp1(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("ECMQVwithSHA384KDF", new ab3(), new qd5(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA384KDFAndSharedInfo() {
            super("ECMQVwithSHA384KDF", new ab3(), new qd5(f23.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("ECMQVwithSHA512CKDF", new ab3(), new dp1(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("ECMQVwithSHA512KDF", new ab3(), new qd5(f23.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA512KDFAndSharedInfo() {
            super("ECMQVwithSHA512KDF", new ab3(), new qd5(f23.j()));
        }
    }

    protected KeyAgreementSpi(String str, x80 x80Var, q03 q03Var) {
        super(str, q03Var);
        this.kaAlgorithm = str;
        this.agreement = x80Var;
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void initFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        nb3 nb3Var;
        nb3 nb3Var2;
        Object obj = this.agreement;
        byte[] bArr = null;
        r4 = null;
        qb3 qb3Var = null;
        qb3 qb3Var2 = null;
        if (obj instanceof ab3) {
            this.mqvParameters = null;
            boolean z = key instanceof t36;
            if (!z && !(algorithmParameterSpec instanceof s36)) {
                throw new InvalidAlgorithmParameterException(this.kaAlgorithm + " key agreement requires " + getSimpleName(s36.class) + " for initialisation");
            }
            if (z) {
                t36 t36Var = (t36) key;
                nb3Var2 = (nb3) ECUtil.generatePrivateKeyParameter(t36Var.A());
                nb3Var = (nb3) ECUtil.generatePrivateKeyParameter(t36Var.D());
                if (t36Var.D0() != null) {
                    qb3Var = (qb3) ECUtils.generatePublicKeyParameter(t36Var.D0());
                }
            } else {
                s36 s36Var = (s36) algorithmParameterSpec;
                nb3 nb3Var3 = (nb3) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
                nb3Var = (nb3) ECUtil.generatePrivateKeyParameter(s36Var.a());
                if (s36Var.b() != null) {
                    qb3Var = (qb3) ECUtils.generatePublicKeyParameter(s36Var.b());
                }
                this.mqvParameters = s36Var;
                this.ukmParameters = s36Var.d();
                nb3Var2 = nb3Var3;
            }
            u36 u36Var = new u36(nb3Var2, nb3Var, qb3Var);
            this.parameters = nb3Var2.b();
            ((ab3) this.agreement).init(u36Var);
        } else if (algorithmParameterSpec instanceof m72) {
            if (obj instanceof ha3) {
                m72 m72Var = (m72) algorithmParameterSpec;
                nb3 nb3Var4 = (nb3) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
                nb3 nb3Var5 = (nb3) ECUtil.generatePrivateKeyParameter(m72Var.a());
                if (m72Var.b() != null) {
                    qb3Var2 = (qb3) ECUtils.generatePublicKeyParameter(m72Var.b());
                }
                this.dheParameters = m72Var;
                this.ukmParameters = m72Var.d();
                ia3 ia3Var = new ia3(nb3Var4, nb3Var5, qb3Var2);
                this.parameters = nb3Var4.b();
                ((ha3) this.agreement).c(ia3Var);
                return;
            }
            throw new InvalidAlgorithmParameterException(this.kaAlgorithm + " key agreement cannot be used with " + getSimpleName(m72.class));
        } else if (key instanceof PrivateKey) {
            if (this.kdf == null && (algorithmParameterSpec instanceof iub)) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            nb3 nb3Var6 = (nb3) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
            this.parameters = nb3Var6.b();
            if (algorithmParameterSpec instanceof iub) {
                bArr = ((iub) algorithmParameterSpec).a();
            }
            this.ukmParameters = bArr;
            ((x80) this.agreement).init(nb3Var6);
        } else {
            throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(lb3.class) + " for initialisation");
        }
    }

    protected byte[] bigIntToBytes(BigInteger bigInteger) {
        nac nacVar = converter;
        return nacVar.c(bigInteger, nacVar.a(this.parameters.a()));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] calcSecret() {
        return tr.h(this.result);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        v71 generatePublicKeyParameter;
        if (this.parameters != null) {
            if (z) {
                Object obj = this.agreement;
                if (obj instanceof ab3) {
                    if (!(key instanceof v36)) {
                        generatePublicKeyParameter = new w36((qb3) ECUtils.generatePublicKeyParameter((PublicKey) key), (qb3) ECUtils.generatePublicKeyParameter(this.mqvParameters.c()));
                    } else {
                        v36 v36Var = (v36) key;
                        generatePublicKeyParameter = new w36((qb3) ECUtils.generatePublicKeyParameter(v36Var.y0()), (qb3) ECUtils.generatePublicKeyParameter(v36Var.H0()));
                    }
                } else if (obj instanceof ha3) {
                    generatePublicKeyParameter = new ja3((qb3) ECUtils.generatePublicKeyParameter((PublicKey) key), (qb3) ECUtils.generatePublicKeyParameter(this.dheParameters.c()));
                } else if (key instanceof PublicKey) {
                    generatePublicKeyParameter = ECUtils.generatePublicKeyParameter((PublicKey) key);
                } else {
                    throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(pb3.class) + " for doPhase");
                }
                try {
                    Object obj2 = this.agreement;
                    if (obj2 instanceof x80) {
                        this.result = bigIntToBytes(((x80) obj2).b(generatePublicKeyParameter));
                        return null;
                    }
                    this.result = ((ha3) obj2).a(generatePublicKeyParameter);
                    return null;
                } catch (Exception e) {
                    throw new InvalidKeyException("calculation failed: " + e.getMessage()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi.1
                        @Override // java.lang.Throwable
                        public Throwable getCause() {
                            return e;
                        }
                    };
                }
            }
            throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties.");
        }
        throw new IllegalStateException(this.kaAlgorithm + " not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            initFromKey(key, null);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    protected KeyAgreementSpi(String str, ha3 ha3Var, q03 q03Var) {
        super(str, q03Var);
        this.kaAlgorithm = str;
        this.agreement = ha3Var;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof s36) && !(algorithmParameterSpec instanceof iub) && !(algorithmParameterSpec instanceof m72)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        initFromKey(key, algorithmParameterSpec);
    }
}
