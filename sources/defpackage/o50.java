package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.q;
/* renamed from: o50  reason: default package */
/* loaded from: classes3.dex */
public class o50 implements PrivateKey {
    private transient ou8 a;
    private transient q b;

    public o50(dk8 dk8Var) throws IOException {
        a(dk8Var);
    }

    private void a(dk8 dk8Var) throws IOException {
        this.b = dk8Var.t();
        this.a = (ou8) ck8.b(dk8Var);
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
        if (!(obj instanceof o50)) {
            return false;
        }
        o50 o50Var = (o50) obj;
        if (this.a.c() == o50Var.a.c() && tr.c(this.a.b(), o50Var.a.b())) {
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
        return this.a.c() + (tr.F(this.a.b()) * 37);
    }
}
