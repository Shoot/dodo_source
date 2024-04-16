package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.k;
/* renamed from: l50  reason: default package */
/* loaded from: classes3.dex */
public class l50 implements PublicKey {
    private transient k a;
    private transient jbc b;

    public l50(b1b b1bVar) throws IOException {
        a(b1bVar);
    }

    private void a(b1b b1bVar) throws IOException {
        jbc jbcVar = (jbc) hs8.a(b1bVar);
        this.b = jbcVar;
        this.a = k23.a(jbcVar.b());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        a(b1b.u((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l50)) {
            return false;
        }
        l50 l50Var = (l50) obj;
        if (this.a.x(l50Var.a) && tr.c(this.b.f(), l50Var.b.f())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d1b.a(this.b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.a.hashCode() + (tr.F(this.b.f()) * 37);
    }
}
