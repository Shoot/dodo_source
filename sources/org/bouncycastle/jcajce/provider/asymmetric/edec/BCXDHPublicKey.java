package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
/* loaded from: classes3.dex */
public class BCXDHPublicKey implements uac {
    static final long serialVersionUID = 1;
    transient ux xdhPublicKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCXDHPublicKey(ux uxVar) {
        this.xdhPublicKey = uxVar;
    }

    private void populateFromPubKeyInfo(b1b b1bVar) {
        ux l9cVar;
        byte[] F = b1bVar.v().F();
        if (wc3.c.x(b1bVar.t().t())) {
            l9cVar = new s9c(F);
        } else {
            l9cVar = new l9c(F);
        }
        this.xdhPublicKey = l9cVar;
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
        return this.xdhPublicKey;
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
        if (this.xdhPublicKey instanceof s9c) {
            return "X448";
        }
        return "X25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.xdhPublicKey instanceof s9c) {
            byte[] bArr = KeyFactorySpi.x448Prefix;
            byte[] bArr2 = new byte[bArr.length + 56];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            ((s9c) this.xdhPublicKey).b(bArr2, bArr.length);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.x25519Prefix;
        byte[] bArr4 = new byte[bArr3.length + 32];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        ((l9c) this.xdhPublicKey).b(bArr4, bArr3.length);
        return bArr4;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public BigInteger getU() {
        byte[] uEncoding = getUEncoding();
        tr.Q(uEncoding);
        return new BigInteger(1, uEncoding);
    }

    @Override // defpackage.uac
    public byte[] getUEncoding() {
        ux uxVar = this.xdhPublicKey;
        if (uxVar instanceof s9c) {
            return ((s9c) uxVar).getEncoded();
        }
        return ((l9c) uxVar).getEncoded();
    }

    public int hashCode() {
        return tr.F(getEncoded());
    }

    public String toString() {
        return Utils.keyToString("Public Key", getAlgorithm(), this.xdhPublicKey);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCXDHPublicKey(b1b b1bVar) {
        populateFromPubKeyInfo(b1bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCXDHPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        ux l9cVar;
        int length = bArr.length;
        if (!Utils.isValidPrefix(bArr, bArr2)) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        if (bArr2.length - length == 56) {
            l9cVar = new s9c(bArr2, length);
        } else if (bArr2.length - length != 32) {
            throw new InvalidKeySpecException("raw key data not recognised");
        } else {
            l9cVar = new l9c(bArr2, length);
        }
        this.xdhPublicKey = l9cVar;
    }
}
