package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes3.dex */
public abstract class n extends defpackage.i0 {
    public static n z(byte[] bArr) throws IOException {
        h hVar = new h(bArr);
        try {
            n l = hVar.l();
            if (hVar.available() == 0) {
                return l;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean A();

    @Override // defpackage.i0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof defpackage.h0) && t(((defpackage.h0) obj).f())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i0
    public void h(OutputStream outputStream) throws IOException {
        m.a(outputStream).t(this);
    }

    @Override // defpackage.i0
    public abstract int hashCode();

    @Override // defpackage.i0
    public void k(OutputStream outputStream, String str) throws IOException {
        m.b(outputStream, str).t(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean t(n nVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void u(m mVar, boolean z) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int v() throws IOException;

    public final boolean w(defpackage.h0 h0Var) {
        if (this != h0Var && (h0Var == null || !t(h0Var.f()))) {
            return false;
        }
        return true;
    }

    public final boolean x(n nVar) {
        if (this != nVar && !t(nVar)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n B() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n C() {
        return this;
    }

    @Override // defpackage.i0, defpackage.h0
    public final n f() {
        return this;
    }
}
