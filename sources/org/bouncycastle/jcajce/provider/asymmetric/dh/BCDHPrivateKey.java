package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
/* loaded from: classes3.dex */
public class BCDHPrivateKey implements DHPrivateKey, rn7 {
    static final long serialVersionUID = 311058815616901812L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient k72 dhPrivateKey;
    private transient DHParameterSpec dhSpec;
    private transient dk8 info;
    private BigInteger x;

    protected BCDHPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k72 engineGetKeyParameters() {
        k72 k72Var = this.dhPrivateKey;
        if (k72Var != null) {
            return k72Var;
        }
        DHParameterSpec dHParameterSpec = this.dhSpec;
        if (dHParameterSpec instanceof u62) {
            return new k72(this.x, ((u62) dHParameterSpec).a());
        }
        return new k72(this.x, new h72(dHParameterSpec.getP(), this.dhSpec.getG(), null, this.dhSpec.getL()));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        if (!getX().equals(dHPrivateKey.getX()) || !getParams().getG().equals(dHPrivateKey.getParams().getG()) || !getParams().getP().equals(dHPrivateKey.getParams().getP()) || getParams().getL() != dHPrivateKey.getParams().getL()) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // defpackage.rn7
    public h0 getBagAttribute(k kVar) {
        return this.attrCarrier.getBagAttribute(kVar);
    }

    @Override // defpackage.rn7
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        dk8 dk8Var;
        wvb wvbVar;
        try {
            dk8 dk8Var2 = this.info;
            if (dk8Var2 != null) {
                return dk8Var2.p("DER");
            }
            DHParameterSpec dHParameterSpec = this.dhSpec;
            if ((dHParameterSpec instanceof u62) && ((u62) dHParameterSpec).b() != null) {
                h72 a = ((u62) this.dhSpec).a();
                q72 h = a.h();
                if (h != null) {
                    wvbVar = new wvb(h.b(), h.a());
                } else {
                    wvbVar = null;
                }
                dk8Var = new dk8(new eb(oac.t4, new n63(a.f(), a.b(), a.g(), a.c(), wvbVar).f()), new i(getX()));
            } else {
                dk8Var = new dk8(new eb(co7.l0, new g72(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).f()), new i(getX()));
            }
            return dk8Var.p("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // defpackage.rn7
    public void setBagAttribute(k kVar, h0 h0Var) {
        this.attrCarrier.setBagAttribute(kVar, h0Var);
    }

    public String toString() {
        return DHUtil.privateKeyToString("DH", this.x, new h72(this.dhSpec.getP(), this.dhSpec.getG()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPrivateKey(k72 k72Var) {
        this.x = k72Var.c();
        this.dhSpec = new u62(k72Var.b());
    }

    public BCDHPrivateKey(dk8 dk8Var) throws IOException {
        k72 k72Var;
        p D = p.D(dk8Var.w().w());
        k t = dk8Var.w().t();
        this.info = dk8Var;
        this.x = ((i) dk8Var.B()).G();
        if (t.x(co7.l0)) {
            g72 u = g72.u(D);
            if (u.v() != null) {
                this.dhSpec = new DHParameterSpec(u.w(), u.t(), u.v().intValue());
                k72Var = new k72(this.x, new h72(u.w(), u.t(), null, u.v().intValue()));
            } else {
                this.dhSpec = new DHParameterSpec(u.w(), u.t());
                k72Var = new k72(this.x, new h72(u.w(), u.t()));
            }
        } else if (!t.x(oac.t4)) {
            throw new IllegalArgumentException("unknown algorithm type: " + t);
        } else {
            n63 u2 = n63.u(D);
            this.dhSpec = new u62(u2.x(), u2.z(), u2.t(), u2.v(), 0);
            k72Var = new k72(this.x, new h72(u2.x(), u2.t(), u2.z(), u2.v(), null));
        }
        this.dhPrivateKey = k72Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        if (dHPrivateKeySpec instanceof v62) {
            this.dhSpec = ((v62) dHPrivateKeySpec).a();
        } else {
            this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
        }
    }
}
