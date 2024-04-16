package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import defpackage.ea3;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
/* loaded from: classes3.dex */
public class BCDSTU4145PublicKey implements ECPublicKey, pb3 {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient n82 dstuParams;
    private transient qb3 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private boolean withCompression;

    public BCDSTU4145PublicKey(rb3 rb3Var, ProviderConfiguration providerConfiguration) {
        this.algorithm = "DSTU4145";
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

    private void populateFromPubKeyInfo(b1b b1bVar) {
        ib3 ib3Var;
        iac iacVar;
        ECParameterSpec convertToSpec;
        j0 v = b1bVar.v();
        this.algorithm = "DSTU4145";
        try {
            byte[] F = ((l) n.z(v.E())).F();
            k t = b1bVar.t().t();
            k kVar = hpb.b;
            if (t.x(kVar)) {
                reverseBytes(F);
            }
            p D = p.D(b1bVar.t().w());
            if (D.F(0) instanceof i) {
                iacVar = iac.w(D);
                ib3Var = new ib3(iacVar.t(), iacVar.u(), iacVar.x(), iacVar.v(), iacVar.z());
            } else {
                n82 w = n82.w(D);
                this.dstuParams = w;
                if (w.z()) {
                    k x = this.dstuParams.x();
                    la3 a = k82.a(x);
                    ib3Var = new eb3(x.H(), a.a(), a.b(), a.e(), a.c(), a.f());
                } else {
                    i82 v2 = this.dstuParams.v();
                    byte[] u = v2.u();
                    if (b1bVar.t().t().x(kVar)) {
                        reverseBytes(u);
                    }
                    h82 v3 = v2.v();
                    ea3.e eVar = new ea3.e(v3.x(), v3.u(), v3.v(), v3.w(), v2.t(), new BigInteger(1, u));
                    byte[] w2 = v2.w();
                    if (b1bVar.t().t().x(kVar)) {
                        reverseBytes(w2);
                    }
                    ib3Var = new ib3(eVar, o82.a(eVar, w2), v2.z());
                }
                iacVar = null;
            }
            ea3 a2 = ib3Var.a();
            EllipticCurve convertCurve = EC5Util.convertCurve(a2, ib3Var.e());
            if (this.dstuParams != null) {
                ECPoint convertPoint = EC5Util.convertPoint(ib3Var.b());
                if (this.dstuParams.z()) {
                    convertToSpec = new fb3(this.dstuParams.x().H(), convertCurve, convertPoint, ib3Var.d(), ib3Var.c());
                } else {
                    convertToSpec = new ECParameterSpec(convertCurve, convertPoint, ib3Var.d(), ib3Var.c().intValue());
                }
            } else {
                convertToSpec = EC5Util.convertToSpec(iacVar);
            }
            this.ecSpec = convertToSpec;
            this.ecPublicKey = new qb3(o82.a(a2, F), EC5Util.getDomainParameters(null, this.ecSpec));
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(b1b.u(n.z((byte[]) objectInputStream.readObject())));
    }

    private void reverseBytes(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
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
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        if (!this.ecPublicKey.c().e(bCDSTU4145PublicKey.ecPublicKey.c()) || !engineGetSpec().equals(bCDSTU4145PublicKey.engineGetSpec())) {
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
        i0 i0Var = this.dstuParams;
        if (i0Var == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof fb3) {
                i0Var = new n82(new k(((fb3) this.ecSpec).c()));
            } else {
                ea3 convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                i0Var = new gac(new iac(convertCurve, new kac(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
        }
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new b1b(new eb(hpb.c, i0Var), new s0(o82.b(this.ecPublicKey.c()))));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
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
        jb3 c = this.ecPublicKey.c();
        if (this.ecSpec == null) {
            return c.k();
        }
        return c;
    }

    public byte[] getSbox() {
        n82 n82Var = this.dstuParams;
        if (n82Var != null) {
            return n82Var.t();
        }
        return n82.u();
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
    public BCDSTU4145PublicKey(b1b b1bVar) {
        this.algorithm = "DSTU4145";
        populateFromPubKeyInfo(b1bVar);
    }

    public BCDSTU4145PublicKey(String str, qb3 qb3Var) {
        this.algorithm = str;
        this.ecPublicKey = qb3Var;
        this.ecSpec = null;
    }

    public BCDSTU4145PublicKey(String str, qb3 qb3Var, ib3 ib3Var) {
        this.algorithm = "DSTU4145";
        la3 b = qb3Var.b();
        this.algorithm = str;
        this.ecSpec = ib3Var == null ? createSpec(EC5Util.convertCurve(b.a(), b.f()), b) : EC5Util.convertSpec(EC5Util.convertCurve(ib3Var.a(), ib3Var.e()), ib3Var);
        this.ecPublicKey = qb3Var;
    }

    public BCDSTU4145PublicKey(String str, qb3 qb3Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        la3 b = qb3Var.b();
        this.algorithm = str;
        this.ecPublicKey = qb3Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(b.a(), b.f()), b);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "DSTU4145";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new qb3(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, this.ecSpec));
    }

    public BCDSTU4145PublicKey(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        this.algorithm = "DSTU4145";
        this.ecPublicKey = bCDSTU4145PublicKey.ecPublicKey;
        this.ecSpec = bCDSTU4145PublicKey.ecSpec;
        this.withCompression = bCDSTU4145PublicKey.withCompression;
        this.dstuParams = bCDSTU4145PublicKey.dstuParams;
    }
}
