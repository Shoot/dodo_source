package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.util.Enumeration;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
/* loaded from: classes3.dex */
public class BCGOST3410PrivateKey implements lb4, rn7 {
    static final long serialVersionUID = 8581661527592305464L;
    private transient rn7 attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient kb4 gost3410Spec;
    private BigInteger x;

    protected BCGOST3410PrivateKey() {
    }

    private boolean compareObj(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new gb4(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        } else {
            this.gost3410Spec = new gb4(new qb4((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
            objectInputStream.readObject();
            objectInputStream.readObject();
        }
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object a;
        objectOutputStream.defaultWriteObject();
        if (this.gost3410Spec.c() != null) {
            a = this.gost3410Spec.c();
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(this.gost3410Spec.a().b());
            objectOutputStream.writeObject(this.gost3410Spec.a().c());
            a = this.gost3410Spec.a().a();
        }
        objectOutputStream.writeObject(a);
        objectOutputStream.writeObject(this.gost3410Spec.d());
        objectOutputStream.writeObject(this.gost3410Spec.b());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof lb4)) {
            return false;
        }
        lb4 lb4Var = (lb4) obj;
        if (!getX().equals(lb4Var.getX()) || !getParameters().a().equals(lb4Var.getParameters().a()) || !getParameters().d().equals(lb4Var.getParameters().d()) || !compareObj(getParameters().b(), lb4Var.getParameters().b())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
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
        byte[] byteArray = getX().toByteArray();
        byte[] bArr = new byte[byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            if (this.gost3410Spec instanceof gb4) {
                dk8Var = new dk8(new eb(y22.l, new pb4(new k(this.gost3410Spec.c()), new k(this.gost3410Spec.d()))), new s0(bArr));
            } else {
                dk8Var = new dk8(new eb(y22.l), new s0(bArr));
            }
            return dk8Var.p("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // defpackage.ab4
    public kb4 getParameters() {
        return this.gost3410Spec;
    }

    @Override // defpackage.lb4
    public BigInteger getX() {
        return this.x;
    }

    public int hashCode() {
        return getX().hashCode() ^ this.gost3410Spec.hashCode();
    }

    @Override // defpackage.rn7
    public void setBagAttribute(k kVar, h0 h0Var) {
        this.attrCarrier.setBagAttribute(kVar, h0Var);
    }

    public String toString() {
        try {
            return GOSTUtil.privateKeyToString("GOST3410", this.x, ((mb4) GOST3410Util.generatePrivateKeyParameter(this)).b());
        } catch (InvalidKeyException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PrivateKey(lb4 lb4Var) {
        this.x = lb4Var.getX();
        this.gost3410Spec = lb4Var.getParameters();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PrivateKey(mb4 mb4Var, gb4 gb4Var) {
        this.x = mb4Var.c();
        this.gost3410Spec = gb4Var;
        if (gb4Var == null) {
            throw new IllegalArgumentException("spec is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PrivateKey(nb4 nb4Var) {
        this.x = nb4Var.d();
        this.gost3410Spec = new gb4(new qb4(nb4Var.b(), nb4Var.c(), nb4Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PrivateKey(dk8 dk8Var) throws IOException {
        BigInteger bigInteger;
        pb4 v = pb4.v(dk8Var.w().w());
        h0 B = dk8Var.B();
        if (B instanceof i) {
            bigInteger = i.D(B).F();
        } else {
            byte[] F = l.D(dk8Var.B()).F();
            byte[] bArr = new byte[F.length];
            for (int i = 0; i != F.length; i++) {
                bArr[i] = F[(F.length - 1) - i];
            }
            bigInteger = new BigInteger(1, bArr);
        }
        this.x = bigInteger;
        this.gost3410Spec = gb4.e(v);
    }
}
