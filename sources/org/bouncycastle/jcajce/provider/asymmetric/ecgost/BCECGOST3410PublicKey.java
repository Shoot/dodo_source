package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

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
public class BCECGOST3410PublicKey implements ECPublicKey, pb3 {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient qb3 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private transient h0 gostParams;
    private boolean withCompression;

    public BCECGOST3410PublicKey(rb3 rb3Var, ProviderConfiguration providerConfiguration) {
        this.algorithm = "ECGOST3410";
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

    private void extractBytes(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    private void populateFromPubKeyInfo(b1b b1bVar) {
        k w;
        j0 v = b1bVar.v();
        this.algorithm = "ECGOST3410";
        try {
            byte[] F = ((l) n.z(v.E())).F();
            byte[] bArr = new byte[65];
            bArr[0] = 4;
            for (int i = 1; i <= 32; i++) {
                bArr[i] = F[32 - i];
                bArr[i + 32] = F[64 - i];
            }
            boolean z = b1bVar.t().w() instanceof k;
            h0 w2 = b1bVar.t().w();
            if (z) {
                w = k.I(w2);
                this.gostParams = w;
            } else {
                pb4 v2 = pb4.v(w2);
                this.gostParams = v2;
                w = v2.w();
            }
            eb3 a = oa3.a(pa3.f(w));
            ea3 a2 = a.a();
            EllipticCurve convertCurve = EC5Util.convertCurve(a2, a.e());
            this.ecPublicKey = new qb3(a2.j(bArr), ECUtil.getDomainParameters((ProviderConfiguration) null, a));
            this.ecSpec = new fb3(pa3.f(w), convertCurve, EC5Util.convertPoint(a.b()), a.d(), a.c());
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
        if (!(obj instanceof BCECGOST3410PublicKey)) {
            return false;
        }
        BCECGOST3410PublicKey bCECGOST3410PublicKey = (BCECGOST3410PublicKey) obj;
        if (!this.ecPublicKey.c().e(bCECGOST3410PublicKey.ecPublicKey.c()) || !engineGetSpec().equals(bCECGOST3410PublicKey.engineGetSpec())) {
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
        h0 gacVar;
        h0 gostParams = getGostParams();
        if (gostParams == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof fb3) {
                gacVar = new pb4(pa3.h(((fb3) eCParameterSpec).c()), y22.p);
            } else {
                ea3 convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                gacVar = new gac(new iac(convertCurve, new kac(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            gostParams = gacVar;
        }
        BigInteger t = this.ecPublicKey.c().f().t();
        BigInteger t2 = this.ecPublicKey.c().g().t();
        byte[] bArr = new byte[64];
        extractBytes(bArr, 0, t);
        extractBytes(bArr, 32, t2);
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new b1b(new eb(y22.m, gostParams), new s0(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0 getGostParams() {
        if (this.gostParams == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof fb3) {
                this.gostParams = new pb4(pa3.h(((fb3) eCParameterSpec).c()), y22.p);
            }
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
    public BCECGOST3410PublicKey(b1b b1bVar) {
        this.algorithm = "ECGOST3410";
        populateFromPubKeyInfo(b1bVar);
    }

    public BCECGOST3410PublicKey(String str, qb3 qb3Var) {
        this.algorithm = str;
        this.ecPublicKey = qb3Var;
        this.ecSpec = null;
    }

    public BCECGOST3410PublicKey(String str, qb3 qb3Var, ib3 ib3Var) {
        this.algorithm = "ECGOST3410";
        la3 b = qb3Var.b();
        this.algorithm = str;
        this.ecPublicKey = qb3Var;
        this.ecSpec = ib3Var == null ? createSpec(EC5Util.convertCurve(b.a(), b.f()), b) : EC5Util.convertSpec(EC5Util.convertCurve(ib3Var.a(), ib3Var.e()), ib3Var);
    }

    public BCECGOST3410PublicKey(String str, qb3 qb3Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410";
        la3 b = qb3Var.b();
        if (b instanceof qa3) {
            qa3 qa3Var = (qa3) b;
            this.gostParams = new pb4(qa3Var.m(), qa3Var.k(), qa3Var.l());
        }
        this.algorithm = str;
        this.ecPublicKey = qb3Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(b.a(), b.f()), b);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCECGOST3410PublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "ECGOST3410";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new qb3(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(null, eCPublicKey.getParams()));
    }

    public BCECGOST3410PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "ECGOST3410";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new qb3(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410PublicKey(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        this.algorithm = "ECGOST3410";
        this.ecPublicKey = bCECGOST3410PublicKey.ecPublicKey;
        this.ecSpec = bCECGOST3410PublicKey.ecSpec;
        this.withCompression = bCECGOST3410PublicKey.withCompression;
        this.gostParams = bCECGOST3410PublicKey.gostParams;
    }
}
