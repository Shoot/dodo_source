package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import org.bouncycastle.asn1.k;
/* renamed from: i50  reason: default package */
/* loaded from: classes3.dex */
public class i50 implements PublicKey, Key {
    private transient k a;
    private transient cr9 b;

    public i50(b1b b1bVar) throws IOException {
        a(b1bVar);
    }

    private void a(b1b b1bVar) throws IOException {
        this.a = zq9.t(b1bVar.t().w()).u().t();
        this.b = (cr9) hs8.a(b1bVar);
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
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        if (this.a.x(i50Var.a) && tr.c(this.b.c(), i50Var.b.c())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        b1b b1bVar;
        try {
            if (this.b.b() != null) {
                b1bVar = d1b.a(this.b);
            } else {
                b1bVar = new b1b(new eb(ko7.r, new zq9(new eb(this.a))), this.b.c());
            }
            return b1bVar.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.a.hashCode() + (tr.F(this.b.c()) * 37);
    }
}
