package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q;
/* renamed from: m50  reason: default package */
/* loaded from: classes3.dex */
public class m50 implements PrivateKey {
    private transient pbc a;
    private transient k b;
    private transient q c;

    public m50(dk8 dk8Var) throws IOException {
        a(dk8Var);
    }

    private void a(dk8 dk8Var) throws IOException {
        this.c = dk8Var.t();
        this.b = bbc.u(dk8Var.w().w()).v().t();
        this.a = (pbc) ck8.b(dk8Var);
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
        if (!(obj instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj;
        if (this.b.x(m50Var.b) && tr.c(this.a.d(), m50Var.a.d())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return fk8.a(this.a, this.c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.b.hashCode() + (tr.F(this.a.d()) * 37);
    }
}
