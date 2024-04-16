package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
/* loaded from: classes3.dex */
public class BCECGOST3410_2012PublicKey implements ECPublicKey, pb3 {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient qb3 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private transient pb4 gostParams;
    private boolean withCompression;

    public BCECGOST3410_2012PublicKey(rb3 rb3Var, ProviderConfiguration providerConfiguration) {
        this.algorithm = "ECGOST3410-2012";
        if (rb3Var.a() == null) {
            this.ecPublicKey = new qb3(providerConfiguration.getEcImplicitlyCa().a().g(rb3Var.b().f().t(), rb3Var.b().g().t()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.ecSpec = null;
            return;
        }
        EllipticCurve convertCurve = EC5Util.convertCurve(rb3Var.a().a(), rb3Var.a().e());
        this.ecPublicKey = new qb3(rb3Var.b(), ECUtil.getDomainParameters(providerConfiguration, rb3Var.a()));
        this.ecSpec = EC5Util.convertSpec(convertCurve, rb3Var.a());
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, la3 la3Var) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(la3Var.b()), la3Var.e(), la3Var.c().intValue());
    }

    private void extractBytes(byte[] bArr, int i, int i2, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = byteArray[(byteArray.length - 1) - i3];
        }
    }

    private void populateFromPubKeyInfo(b1b b1bVar) {
        int i;
        k t = b1bVar.t().t();
        j0 v = b1bVar.v();
        this.algorithm = "ECGOST3410-2012";
        try {
            byte[] F = ((l) n.z(v.E())).F();
            if (t.x(do9.h)) {
                i = 64;
            } else {
                i = 32;
            }
            int i2 = i * 2;
            byte[] bArr = new byte[i2 + 1];
            bArr[0] = 4;
            for (int i3 = 1; i3 <= i; i3++) {
                bArr[i3] = F[i - i3];
                bArr[i3 + i] = F[i2 - i3];
            }
            pb4 v2 = pb4.v(b1bVar.t().w());
            this.gostParams = v2;
            eb3 a = oa3.a(pa3.f(v2.w()));
            ea3 a2 = a.a();
            EllipticCurve convertCurve = EC5Util.convertCurve(a2, a.e());
            this.ecPublicKey = new qb3(a2.j(bArr), ECUtil.getDomainParameters((ProviderConfiguration) null, a));
            this.ecSpec = new fb3(pa3.f(this.gostParams.w()), convertCurve, EC5Util.convertPoint(a.b()), a.d(), a.c());
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(b1b.u(n.z((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public qb3 engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    ib3 engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec != null) {
            return EC5Util.convertSpec(eCParameterSpec);
        }
        return ff0.b.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PublicKey)) {
            return false;
        }
        BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = (BCECGOST3410_2012PublicKey) obj;
        if (!this.ecPublicKey.c().e(bCECGOST3410_2012PublicKey.ecPublicKey.c()) || !engineGetSpec().equals(bCECGOST3410_2012PublicKey.engineGetSpec())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        boolean z;
        k kVar;
        int i;
        i0 gacVar;
        BigInteger t = this.ecPublicKey.c().f().t();
        BigInteger t2 = this.ecPublicKey.c().g().t();
        if (t.bitLength() > 256) {
            z = true;
        } else {
            z = false;
        }
        i0 gostParams = getGostParams();
        if (gostParams == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof fb3) {
                k h = pa3.h(((fb3) eCParameterSpec).c());
                if (z) {
                    gacVar = new pb4(h, do9.d);
                } else {
                    gacVar = new pb4(h, do9.c);
                }
            } else {
                ea3 convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                gacVar = new gac(new iac(convertCurve, new kac(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            gostParams = gacVar;
        }
        int i2 = 64;
        if (z) {
            kVar = do9.h;
            i2 = 128;
            i = 64;
        } else {
            kVar = do9.g;
            i = 32;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2 / 2;
        extractBytes(bArr, i3, 0, t);
        extractBytes(bArr, i3, i, t2);
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new b1b(new eb(kVar, gostParams), new s0(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public pb4 getGostParams() {
        pb4 pb4Var;
        if (this.gostParams == null && (this.ecSpec instanceof fb3)) {
            if (this.ecPublicKey.c().f().t().bitLength() > 256) {
                pb4Var = new pb4(pa3.h(((fb3) this.ecSpec).c()), do9.d);
            } else {
                pb4Var = new pb4(pa3.h(((fb3) this.ecSpec).c()), do9.c);
            }
            this.gostParams = pb4Var;
        }
        return this.gostParams;
    }

    @Override // defpackage.ua3
    public ib3 getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // defpackage.pb3
    public jb3 getQ() {
        if (this.ecSpec == null) {
            return this.ecPublicKey.c().k();
        }
        return this.ecPublicKey.c();
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.convertPoint(this.ecPublicKey.c());
    }

    public int hashCode() {
        return this.ecPublicKey.c().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.publicKeyToString(this.algorithm, this.ecPublicKey.c(), engineGetSpec());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCECGOST3410_2012PublicKey(b1b b1bVar) {
        this.algorithm = "ECGOST3410-2012";
        populateFromPubKeyInfo(b1bVar);
    }

    public BCECGOST3410_2012PublicKey(String str, qb3 qb3Var) {
        this.algorithm = str;
        this.ecPublicKey = qb3Var;
        this.ecSpec = null;
    }

    public BCECGOST3410_2012PublicKey(String str, qb3 qb3Var, ib3 ib3Var) {
        this.algorithm = "ECGOST3410-2012";
        la3 b = qb3Var.b();
        this.algorithm = str;
        this.ecPublicKey = qb3Var;
        this.ecSpec = ib3Var == null ? createSpec(EC5Util.convertCurve(b.a(), b.f()), b) : EC5Util.convertSpec(EC5Util.convertCurve(ib3Var.a(), ib3Var.e()), ib3Var);
    }

    public BCECGOST3410_2012PublicKey(String str, qb3 qb3Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410-2012";
        la3 b = qb3Var.b();
        this.algorithm = str;
        this.ecPublicKey = qb3Var;
        if (b instanceof qa3) {
            qa3 qa3Var = (qa3) b;
            this.gostParams = new pb4(qa3Var.m(), qa3Var.k(), qa3Var.l());
        }
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(b.a(), b.f()), b);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCECGOST3410_2012PublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "ECGOST3410-2012";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new qb3(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(null, eCPublicKey.getParams()));
    }

    public BCECGOST3410_2012PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "ECGOST3410-2012";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new qb3(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410_2012PublicKey(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        this.algorithm = "ECGOST3410-2012";
        this.ecPublicKey = bCECGOST3410_2012PublicKey.ecPublicKey;
        this.ecSpec = bCECGOST3410_2012PublicKey.ecSpec;
        this.withCompression = bCECGOST3410_2012PublicKey.withCompression;
        this.gostParams = bCECGOST3410_2012PublicKey.gostParams;
    }
}
