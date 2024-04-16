package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.q;
/* loaded from: classes3.dex */
public class BCEdDSAPrivateKey implements Key, PrivateKey {
    static final long serialVersionUID = 1;
    private final byte[] attributes;
    transient ux eddsaPrivateKey;
    private final boolean hasPublicKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCEdDSAPrivateKey(ux uxVar) {
        this.hasPublicKey = true;
        this.attributes = null;
        this.eddsaPrivateKey = uxVar;
    }

    private void populateFromPrivateKeyInfo(dk8 dk8Var) throws IOException {
        ux lc3Var;
        byte[] F = l.D(dk8Var.B()).F();
        if (wc3.e.x(dk8Var.w().t())) {
            lc3Var = new rc3(F);
        } else {
            lc3Var = new lc3(F);
        }
        this.eddsaPrivateKey = lc3Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPrivateKeyInfo(dk8.u((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ux engineGetKeyParameters() {
        return this.eddsaPrivateKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivateKey)) {
            return false;
        }
        return tr.c(((PrivateKey) obj).getEncoded(), getEncoded());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        if (this.eddsaPrivateKey instanceof rc3) {
            return "Ed448";
        }
        return "Ed25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            q E = q.E(this.attributes);
            dk8 b = gk8.b(this.eddsaPrivateKey, E);
            if (this.hasPublicKey && !pq8.c("org.bouncycastle.pkcs8.v1_info_only")) {
                return b.getEncoded();
            }
            return new dk8(b.w(), b.B(), E).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public vc3 getPublicKey() {
        ux uxVar = this.eddsaPrivateKey;
        if (uxVar instanceof rc3) {
            return new BCEdDSAPublicKey(((rc3) uxVar).b());
        }
        return new BCEdDSAPublicKey(((lc3) uxVar).b());
    }

    public int hashCode() {
        return tr.F(getEncoded());
    }

    public String toString() {
        ux b;
        ux uxVar = this.eddsaPrivateKey;
        if (uxVar instanceof rc3) {
            b = ((rc3) uxVar).b();
        } else {
            b = ((lc3) uxVar).b();
        }
        return Utils.keyToString("Private Key", getAlgorithm(), b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCEdDSAPrivateKey(dk8 dk8Var) throws IOException {
        this.hasPublicKey = dk8Var.A();
        this.attributes = dk8Var.t() != null ? dk8Var.t().getEncoded() : null;
        populateFromPrivateKeyInfo(dk8Var);
    }
}
