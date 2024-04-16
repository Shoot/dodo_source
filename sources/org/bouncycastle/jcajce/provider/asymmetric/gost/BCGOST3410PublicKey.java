package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
/* loaded from: classes3.dex */
public class BCGOST3410PublicKey implements ob4 {
    static final long serialVersionUID = -6251023343619275990L;
    private transient kb4 gost3410Spec;
    private BigInteger y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PublicKey(ob4 ob4Var) {
        this.y = ob4Var.getY();
        this.gost3410Spec = ob4Var.getParameters();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new gb4(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
            return;
        }
        this.gost3410Spec = new gb4(new qb4((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
        objectInputStream.readObject();
        objectInputStream.readObject();
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
        if (!(obj instanceof BCGOST3410PublicKey)) {
            return false;
        }
        BCGOST3410PublicKey bCGOST3410PublicKey = (BCGOST3410PublicKey) obj;
        if (!this.y.equals(bCGOST3410PublicKey.y) || !this.gost3410Spec.equals(bCGOST3410PublicKey.gost3410Spec)) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        b1b b1bVar;
        byte[] byteArray = getY().toByteArray();
        byte[] bArr = new byte[byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            kb4 kb4Var = this.gost3410Spec;
            if (kb4Var instanceof gb4) {
                if (kb4Var.b() != null) {
                    b1bVar = new b1b(new eb(y22.l, new pb4(new k(this.gost3410Spec.c()), new k(this.gost3410Spec.d()), new k(this.gost3410Spec.b()))), new s0(bArr));
                } else {
                    b1bVar = new b1b(new eb(y22.l, new pb4(new k(this.gost3410Spec.c()), new k(this.gost3410Spec.d()))), new s0(bArr));
                }
            } else {
                b1bVar = new b1b(new eb(y22.l), new s0(bArr));
            }
            return KeyUtil.getEncodedSubjectPublicKeyInfo(b1bVar);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // defpackage.ab4
    public kb4 getParameters() {
        return this.gost3410Spec;
    }

    @Override // defpackage.ob4
    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return this.y.hashCode() ^ this.gost3410Spec.hashCode();
    }

    public String toString() {
        try {
            return GOSTUtil.publicKeyToString("GOST3410", this.y, ((rb4) GOST3410Util.generatePublicKeyParameter(this)).b());
        } catch (InvalidKeyException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PublicKey(rb4 rb4Var, gb4 gb4Var) {
        this.y = rb4Var.c();
        this.gost3410Spec = gb4Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PublicKey(sb4 sb4Var) {
        this.y = sb4Var.d();
        this.gost3410Spec = new gb4(new qb4(sb4Var.b(), sb4Var.c(), sb4Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PublicKey(b1b b1bVar) {
        pb4 v = pb4.v(b1bVar.t().w());
        try {
            byte[] F = ((s0) b1bVar.w()).F();
            byte[] bArr = new byte[F.length];
            for (int i = 0; i != F.length; i++) {
                bArr[i] = F[(F.length - 1) - i];
            }
            this.y = new BigInteger(1, bArr);
            this.gost3410Spec = gb4.e(v);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }

    BCGOST3410PublicKey(BigInteger bigInteger, gb4 gb4Var) {
        this.y = bigInteger;
        this.gost3410Spec = gb4Var;
    }
}
