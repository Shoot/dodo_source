package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.i;
/* loaded from: classes3.dex */
public class BCElGamalPublicKey implements ne3, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private transient he3 elSpec;
    private BigInteger y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPublicKey(ne3 ne3Var) {
        this.y = ne3Var.getY();
        this.elSpec = ne3Var.getParameters();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.elSpec = new he3((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        if (!getY().equals(dHPublicKey.getY()) || !getParams().getG().equals(dHPublicKey.getParams().getG()) || !getParams().getP().equals(dHPublicKey.getParams().getP()) || getParams().getL() != dHPublicKey.getParams().getL()) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new b1b(new eb(g47.l, new ge3(this.elSpec.b(), this.elSpec.a())), new i(this.y)).p("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // defpackage.be3
    public he3 getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // defpackage.ne3, javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPublicKey(oe3 oe3Var) {
        this.y = oe3Var.c();
        this.elSpec = new he3(oe3Var.b().c(), oe3Var.b().a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPublicKey(pe3 pe3Var) {
        this.y = pe3Var.b();
        this.elSpec = new he3(pe3Var.a().b(), pe3Var.a().a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPublicKey(b1b b1bVar) {
        ge3 u = ge3.u(b1bVar.t().w());
        try {
            this.y = ((i) b1bVar.w()).G();
            this.elSpec = new he3(u.v(), u.t());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    BCElGamalPublicKey(BigInteger bigInteger, he3 he3Var) {
        this.y = bigInteger;
        this.elSpec = he3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.y = dHPublicKey.getY();
        this.elSpec = new he3(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.y = dHPublicKeySpec.getY();
        this.elSpec = new he3(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }
}
