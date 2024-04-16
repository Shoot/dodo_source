package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

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
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
/* loaded from: classes3.dex */
public class BCElGamalPrivateKey implements ke3, DHPrivateKey, rn7 {
    static final long serialVersionUID = 4819350091141529678L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient he3 elSpec;
    private BigInteger x;

    protected BCElGamalPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.elSpec = new he3((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
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
        return "ElGamal";
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
        try {
            return new dk8(new eb(g47.l, new ge3(this.elSpec.b(), this.elSpec.a())), new i(getX())).p("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // defpackage.be3
    public he3 getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // defpackage.ke3, javax.crypto.interfaces.DHPrivateKey
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPrivateKey(ke3 ke3Var) {
        this.x = ke3Var.getX();
        this.elSpec = ke3Var.getParameters();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPrivateKey(le3 le3Var) {
        this.x = le3Var.c();
        this.elSpec = new he3(le3Var.b().c(), le3Var.b().a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPrivateKey(me3 me3Var) {
        this.x = me3Var.b();
        this.elSpec = new he3(me3Var.a().b(), me3Var.a().a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPrivateKey(dk8 dk8Var) throws IOException {
        ge3 u = ge3.u(dk8Var.w().w());
        this.x = i.D(dk8Var.B()).G();
        this.elSpec = new he3(u.v(), u.t());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.x = dHPrivateKey.getX();
        this.elSpec = new he3(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.x = dHPrivateKeySpec.getX();
        this.elSpec = new he3(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }
}
