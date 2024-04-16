package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.n;
import org.bouncycastle.pkcs.PKCSIOException;
/* renamed from: qn7  reason: default package */
/* loaded from: classes3.dex */
public class qn7 {
    private static bz[] b = new bz[0];
    private ju0 a;

    public qn7(ju0 ju0Var) {
        if (ju0Var == null) {
            throw new NullPointerException("certificationRequest cannot be null");
        }
        this.a = ju0Var;
    }

    private static ju0 a(byte[] bArr) throws IOException {
        try {
            ju0 t = ju0.t(n.z(bArr));
            if (t != null) {
                return t;
            }
            throw new PKCSIOException("empty data passed to constructor");
        } catch (ClassCastException e) {
            throw new PKCSIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new PKCSIOException("malformed data: " + e2.getMessage(), e2);
        }
    }

    public ju0 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qn7)) {
            return false;
        }
        return b().equals(((qn7) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public qn7(byte[] bArr) throws IOException {
        this(a(bArr));
    }
}
