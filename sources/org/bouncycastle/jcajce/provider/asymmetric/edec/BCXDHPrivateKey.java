package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.q;
/* loaded from: classes3.dex */
public class BCXDHPrivateKey implements Key, PrivateKey {
    static final long serialVersionUID = 1;
    private final byte[] attributes;
    private final boolean hasPublicKey;
    transient ux xdhPrivateKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCXDHPrivateKey(ux uxVar) {
        this.hasPublicKey = true;
        this.attributes = null;
        this.xdhPrivateKey = uxVar;
    }

    private void populateFromPrivateKeyInfo(dk8 dk8Var) throws IOException {
        ux k9cVar;
        byte[] F = dk8Var.v().F();
        if (F.length != 32 && F.length != 56) {
            F = l.D(dk8Var.B()).F();
        }
        if (wc3.c.x(dk8Var.w().t())) {
            k9cVar = new r9c(F);
        } else {
            k9cVar = new k9c(F);
        }
        this.xdhPrivateKey = k9cVar;
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
        return this.xdhPrivateKey;
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
        if (this.xdhPrivateKey instanceof r9c) {
            return "X448";
        }
        return "X25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            q E = q.E(this.attributes);
            dk8 b = gk8.b(this.xdhPrivateKey, E);
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

    public uac getPublicKey() {
        ux uxVar = this.xdhPrivateKey;
        if (uxVar instanceof r9c) {
            return new BCXDHPublicKey(((r9c) uxVar).b());
        }
        return new BCXDHPublicKey(((k9c) uxVar).b());
    }

    public int hashCode() {
        return tr.F(getEncoded());
    }

    public String toString() {
        ux b;
        ux uxVar = this.xdhPrivateKey;
        if (uxVar instanceof r9c) {
            b = ((r9c) uxVar).b();
        } else {
            b = ((k9c) uxVar).b();
        }
        return Utils.keyToString("Private Key", getAlgorithm(), b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCXDHPrivateKey(dk8 dk8Var) throws IOException {
        this.hasPublicKey = dk8Var.A();
        this.attributes = dk8Var.t() != null ? dk8Var.t().getEncoded() : null;
        populateFromPrivateKeyInfo(dk8Var);
    }
}
