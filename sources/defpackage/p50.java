package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
/* renamed from: p50  reason: default package */
/* loaded from: classes3.dex */
public class p50 implements PublicKey {
    private transient pu8 a;

    public p50(b1b b1bVar) throws IOException {
        a(b1bVar);
    }

    private void a(b1b b1bVar) throws IOException {
        this.a = (pu8) hs8.a(b1bVar);
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
        if (!(obj instanceof p50)) {
            return false;
        }
        p50 p50Var = (p50) obj;
        if (this.a.c() == p50Var.a.c() && tr.c(this.a.b(), p50Var.a.b())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return qu8.a(this.a.c());
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
        return this.a.c() + (tr.F(this.a.b()) * 37);
    }
}
