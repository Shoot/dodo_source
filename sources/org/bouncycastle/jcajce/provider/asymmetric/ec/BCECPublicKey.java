package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
/* loaded from: classes3.dex */
public class BCECPublicKey implements ECPublicKey, pb3 {
    static final long serialVersionUID = 2422789860422731812L;
    private String algorithm;
    private transient ProviderConfiguration configuration;
    private transient qb3 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private boolean withCompression;

    public BCECPublicKey(String str, qb3 qb3Var, ib3 ib3Var, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        la3 b = qb3Var.b();
        this.algorithm = str;
        this.ecSpec = ib3Var == null ? createSpec(EC5Util.convertCurve(b.a(), b.f()), b) : EC5Util.convertSpec(EC5Util.convertCurve(ib3Var.a(), ib3Var.e()), ib3Var);
        this.ecPublicKey = qb3Var;
        this.configuration = providerConfiguration;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, la3 la3Var) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(la3Var.b()), la3Var.e(), la3Var.c().intValue());
    }

    private void populateFromPubKeyInfo(b1b b1bVar) {
        byte b;
        gac t = gac.t(b1bVar.t().w());
        ea3 curve = EC5Util.getCurve(this.configuration, t);
        this.ecSpec = EC5Util.convertToSpec(t, curve);
        byte[] E = b1bVar.v().E();
        l s0Var = new s0(E);
        if (E[0] == 4 && E[1] == E.length - 2 && (((b = E[2]) == 2 || b == 3) && new nac().a(curve) >= E.length - 3)) {
            try {
                s0Var = (l) n.z(E);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        this.ecPublicKey = new qb3(new kac(curve, s0Var).t(), ECUtil.getDomainParameters(this.configuration, t));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.configuration = ff0.b;
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
        return this.configuration.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        if (!this.ecPublicKey.c().e(bCECPublicKey.ecPublicKey.c()) || !engineGetSpec().equals(bCECPublicKey.engineGetSpec())) {
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
        if (!this.withCompression && !pq8.c("org.bouncycastle.ec.enable_pc")) {
            z = false;
        } else {
            z = true;
        }
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new eb(oac.C3, ECUtils.getDomainParametersFromName(this.ecSpec, z)), this.ecPublicKey.c().l(z));
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
        return ECUtil.publicKeyToString("EC", this.ecPublicKey.c(), engineGetSpec());
    }

    public BCECPublicKey(String str, qb3 qb3Var, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        la3 b = qb3Var.b();
        this.algorithm = str;
        this.ecPublicKey = qb3Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(b.a(), b.f()), b);
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, qb3 qb3Var, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.ecPublicKey = qb3Var;
        this.ecSpec = null;
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, rb3 rb3Var, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        if (rb3Var.a() != null) {
            EllipticCurve convertCurve = EC5Util.convertCurve(rb3Var.a().a(), rb3Var.a().e());
            this.ecPublicKey = new qb3(rb3Var.b(), ECUtil.getDomainParameters(providerConfiguration, rb3Var.a()));
            this.ecSpec = EC5Util.convertSpec(convertCurve, rb3Var.a());
        } else {
            this.ecPublicKey = new qb3(providerConfiguration.getEcImplicitlyCa().a().g(rb3Var.b().f().t(), rb3Var.b().g().t()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.ecSpec = null;
        }
        this.configuration = providerConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCECPublicKey(String str, b1b b1bVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.configuration = providerConfiguration;
        populateFromPubKeyInfo(b1bVar);
    }

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new qb3(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, BCECPublicKey bCECPublicKey) {
        this.algorithm = str;
        this.ecPublicKey = bCECPublicKey.ecPublicKey;
        this.ecSpec = bCECPublicKey.ecSpec;
        this.withCompression = bCECPublicKey.withCompression;
        this.configuration = bCECPublicKey.configuration;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new qb3(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(providerConfiguration, eCPublicKey.getParams()));
        this.configuration = providerConfiguration;
    }
}
