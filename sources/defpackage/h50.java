package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s0;
/* renamed from: h50  reason: default package */
/* loaded from: classes3.dex */
public class h50 implements PrivateKey, Key {
    private transient k a;
    private transient br9 b;
    private transient q c;

    public h50(dk8 dk8Var) throws IOException {
        a(dk8Var);
    }

    private void a(dk8 dk8Var) throws IOException {
        this.c = dk8Var.t();
        this.a = zq9.t(dk8Var.w().w()).u().t();
        this.b = (br9) ck8.b(dk8Var);
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
        if (!(obj instanceof h50)) {
            return false;
        }
        h50 h50Var = (h50) obj;
        if (this.a.x(h50Var.a) && tr.c(this.b.c(), h50Var.b.c())) {
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
        dk8 dk8Var;
        try {
            if (this.b.b() != null) {
                dk8Var = fk8.a(this.b, this.c);
            } else {
                dk8Var = new dk8(new eb(ko7.r, new zq9(new eb(this.a))), new s0(this.b.c()), this.c);
            }
            return dk8Var.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.a.hashCode() + (tr.F(this.b.c()) * 37);
    }
}
