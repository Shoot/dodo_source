package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.n;
import org.bouncycastle.cert.CertIOException;
/* renamed from: w9c  reason: default package */
/* loaded from: classes3.dex */
public class w9c implements wg3, Serializable {
    private transient fu0 a;
    private transient boolean b;
    private transient rn3 c;
    private transient gd4 d;

    public w9c(fu0 fu0Var) {
        a(fu0Var);
    }

    private void a(fu0 fu0Var) {
        this.a = fu0Var;
        rn3 t = fu0Var.A().t();
        this.c = t;
        this.b = b(t);
        this.d = new gd4(new fd4(fu0Var.u()));
    }

    private static boolean b(rn3 rn3Var) {
        on3 t;
        if (rn3Var == null || (t = rn3Var.t(on3.p)) == null || !x75.v(t.x()).w()) {
            return false;
        }
        return true;
    }

    private static fu0 c(InputStream inputStream) throws IOException {
        try {
            n l = new h(inputStream, true).l();
            if (l != null) {
                return fu0.t(l);
            }
            throw new IOException("no content found");
        } catch (ClassCastException e) {
            throw new CertIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new CertIOException("malformed data: " + e2.getMessage(), e2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        a(fu0.t(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w9c)) {
            return false;
        }
        return this.a.equals(((w9c) obj).a);
    }

    @Override // defpackage.wg3
    public byte[] getEncoded() throws IOException {
        return this.a.getEncoded();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public w9c(byte[] bArr) throws IOException {
        this(c(new ByteArrayInputStream(bArr)));
    }
}
