package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.n;
/* renamed from: i0  reason: default package */
/* loaded from: classes3.dex */
public abstract class i0 implements h0, wg3 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        return f().x(((h0) obj).f());
    }

    @Override // defpackage.h0
    public abstract n f();

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        h(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public void h(OutputStream outputStream) throws IOException {
        m.a(outputStream).s(this);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public void k(OutputStream outputStream, String str) throws IOException {
        m.b(outputStream, str).s(this);
    }

    public byte[] p(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
