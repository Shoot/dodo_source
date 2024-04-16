package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
/* loaded from: classes3.dex */
public class BCEdDSAPublicKey implements vc3 {
    static final long serialVersionUID = 1;
    transient ux eddsaPublicKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCEdDSAPublicKey(ux uxVar) {
        this.eddsaPublicKey = uxVar;
    }

    private void populateFromPubKeyInfo(b1b b1bVar) {
        ux mc3Var;
        byte[] F = b1bVar.v().F();
        if (wc3.e.x(b1bVar.t().t())) {
            mc3Var = new sc3(F);
        } else {
            mc3Var = new mc3(F);
        }
        this.eddsaPublicKey = mc3Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(b1b.u((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ux engineGetKeyParameters() {
        return this.eddsaPublicKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PublicKey)) {
            return false;
        }
        return tr.c(((PublicKey) obj).getEncoded(), getEncoded());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        if (this.eddsaPublicKey instanceof sc3) {
            return "Ed448";
        }
        return "Ed25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.eddsaPublicKey instanceof sc3) {
            byte[] bArr = KeyFactorySpi.Ed448Prefix;
            byte[] bArr2 = new byte[bArr.length + 57];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            ((sc3) this.eddsaPublicKey).b(bArr2, bArr.length);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.Ed25519Prefix;
        byte[] bArr4 = new byte[bArr3.length + 32];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        ((mc3) this.eddsaPublicKey).b(bArr4, bArr3.length);
        return bArr4;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // defpackage.vc3
    public byte[] getPointEncoding() {
        ux uxVar = this.eddsaPublicKey;
        if (uxVar instanceof sc3) {
            return ((sc3) uxVar).getEncoded();
        }
        return ((mc3) uxVar).getEncoded();
    }

    public int hashCode() {
        return tr.F(getEncoded());
    }

    public String toString() {
        return Utils.keyToString("Public Key", getAlgorithm(), this.eddsaPublicKey);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCEdDSAPublicKey(b1b b1bVar) {
        populateFromPubKeyInfo(b1bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCEdDSAPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        ux mc3Var;
        int length = bArr.length;
        if (!Utils.isValidPrefix(bArr, bArr2)) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        if (bArr2.length - length == 57) {
            mc3Var = new sc3(bArr2, length);
        } else if (bArr2.length - length != 32) {
            throw new InvalidKeySpecException("raw key data not recognised");
        } else {
            mc3Var = new mc3(bArr2, length);
        }
        this.eddsaPublicKey = mc3Var;
    }
}
