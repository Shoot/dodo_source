package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
/* renamed from: d50  reason: default package */
/* loaded from: classes3.dex */
public class d50 implements Key, PublicKey {
    private transient ks6 a;

    public d50(b1b b1bVar) throws IOException {
        a(b1bVar);
    }

    private void a(b1b b1bVar) throws IOException {
        this.a = (ks6) hs8.a(b1bVar);
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
        if (obj != null && (obj instanceof d50)) {
            return tr.c(this.a.b(), ((d50) obj).a.b());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
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
        return tr.F(this.a.b());
    }
}
