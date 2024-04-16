package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.bouncycastle.cert.CertIOException;
/* renamed from: v9c  reason: default package */
/* loaded from: classes3.dex */
public class v9c implements wg3, Serializable {
    private static zy[] c = new zy[0];
    private transient cz a;
    private transient rn3 b;

    public v9c(cz czVar) {
        a(czVar);
    }

    private void a(cz czVar) {
        this.a = czVar;
        this.b = czVar.t().t();
    }

    private static cz b(byte[] bArr) throws IOException {
        try {
            return cz.u(au0.a(bArr));
        } catch (ClassCastException e) {
            throw new CertIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new CertIOException("malformed data: " + e2.getMessage(), e2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        a(cz.u(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v9c)) {
            return false;
        }
        return this.a.equals(((v9c) obj).a);
    }

    @Override // defpackage.wg3
    public byte[] getEncoded() throws IOException {
        return this.a.getEncoded();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public v9c(byte[] bArr) throws IOException {
        this(b(bArr));
    }
}
