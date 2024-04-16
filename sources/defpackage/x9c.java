package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.bouncycastle.cert.CertIOException;
/* renamed from: x9c  reason: default package */
/* loaded from: classes3.dex */
public class x9c implements wg3, Serializable {
    private transient bu0 a;
    private transient rn3 b;

    public x9c(bu0 bu0Var) {
        a(bu0Var);
    }

    private void a(bu0 bu0Var) {
        this.a = bu0Var;
        this.b = bu0Var.D().u();
    }

    private static bu0 b(byte[] bArr) throws IOException {
        try {
            return bu0.u(au0.a(bArr));
        } catch (ClassCastException e) {
            throw new CertIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new CertIOException("malformed data: " + e2.getMessage(), e2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        a(bu0.u(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x9c)) {
            return false;
        }
        return this.a.equals(((x9c) obj).a);
    }

    @Override // defpackage.wg3
    public byte[] getEncoded() throws IOException {
        return this.a.getEncoded();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public x9c(byte[] bArr) throws IOException {
        this(b(bArr));
    }
}
