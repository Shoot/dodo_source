package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import org.bouncycastle.asn1.q;
/* renamed from: c50  reason: default package */
/* loaded from: classes3.dex */
public class c50 implements Key, PrivateKey {
    private transient js6 a;
    private transient q b;

    public c50(dk8 dk8Var) throws IOException {
        a(dk8Var);
    }

    private void a(dk8 dk8Var) throws IOException {
        this.b = dk8Var.t();
        this.a = (js6) ck8.b(dk8Var);
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
        if (!(obj instanceof c50)) {
            return false;
        }
        return tr.f(this.a.b(), ((c50) obj).a.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return fk8.a(this.a, this.b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return tr.L(this.a.b());
    }
}
