package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q;
/* renamed from: k50  reason: default package */
/* loaded from: classes3.dex */
public class k50 implements PrivateKey {
    private transient k a;
    private transient hbc b;
    private transient q c;

    public k50(dk8 dk8Var) throws IOException {
        a(dk8Var);
    }

    private void a(dk8 dk8Var) throws IOException {
        this.c = dk8Var.t();
        this.a = ebc.u(dk8Var.w().w()).w().t();
        this.b = (hbc) ck8.b(dk8Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        a(dk8.u((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k50)) {
            return false;
        }
        k50 k50Var = (k50) obj;
        if (this.a.x(k50Var.a) && tr.c(this.b.d(), k50Var.b.d())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return fk8.a(this.b, this.c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.a.hashCode() + (tr.F(this.b.d()) * 37);
    }
}
