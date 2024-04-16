package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.k;
/* renamed from: n50  reason: default package */
/* loaded from: classes3.dex */
public class n50 implements PublicKey {
    private transient rbc a;
    private transient k b;

    public n50(b1b b1bVar) throws IOException {
        a(b1bVar);
    }

    private void a(b1b b1bVar) throws IOException {
        rbc rbcVar = (rbc) hs8.a(b1bVar);
        this.a = rbcVar;
        this.b = k23.a(rbcVar.b());
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
        if (obj instanceof n50) {
            n50 n50Var = (n50) obj;
            try {
                if (this.b.x(n50Var.b)) {
                    if (tr.c(this.a.getEncoded(), n50Var.a.getEncoded())) {
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d1b.a(this.a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return this.b.hashCode() + (tr.F(this.a.getEncoded()) * 37);
        } catch (IOException unused) {
            return this.b.hashCode();
        }
    }
}
