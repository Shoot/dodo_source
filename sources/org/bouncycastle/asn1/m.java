package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class m {
    private OutputStream a;

    public m(OutputStream outputStream) {
        this.a = outputStream;
    }

    public static m a(OutputStream outputStream) {
        return new m(outputStream);
    }

    public static m b(OutputStream outputStream, String str) {
        if (str.equals("DER")) {
            return new u0(outputStream);
        }
        if (str.equals("DL")) {
            return new i1(outputStream);
        }
        return new m(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0 d() {
        return new u0(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m e() {
        return new i1(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i) throws IOException {
        this.a.write(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(Enumeration enumeration) throws IOException {
        while (enumeration.hasMoreElements()) {
            u(((defpackage.h0) enumeration.nextElement()).f(), true);
        }
    }

    final void i(defpackage.h0[] h0VarArr) throws IOException {
        for (defpackage.h0 h0Var : h0VarArr) {
            u(h0Var.f(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z, int i, byte b) throws IOException {
        if (z) {
            f(i);
        }
        r(1);
        f(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(boolean z, int i, byte b, byte[] bArr) throws IOException {
        if (z) {
            f(i);
        }
        r(bArr.length + 1);
        f(b);
        g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(boolean z, int i, byte b, byte[] bArr, int i2, int i3, byte b2) throws IOException {
        if (z) {
            f(i);
        }
        r(i3 + 2);
        f(b);
        g(bArr, i2, i3);
        f(b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z, int i, int i2, byte[] bArr) throws IOException {
        v(z, i, i2);
        r(bArr.length);
        g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(boolean z, int i, byte[] bArr) throws IOException {
        if (z) {
            f(i);
        }
        r(bArr.length);
        g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(boolean z, int i, int i2, byte[] bArr) throws IOException {
        v(z, i, i2);
        f(128);
        g(bArr, 0, bArr.length);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(boolean z, int i, Enumeration enumeration) throws IOException {
        if (z) {
            f(i);
        }
        f(128);
        h(enumeration);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(boolean z, int i, defpackage.h0[] h0VarArr) throws IOException {
        if (z) {
            f(i);
        }
        f(128);
        i(h0VarArr);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(int i) throws IOException {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            f((byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                f((byte) (i >> i4));
            }
            return;
        }
        f((byte) i);
    }

    public void s(defpackage.h0 h0Var) throws IOException {
        if (h0Var != null) {
            u(h0Var.f(), true);
            c();
            return;
        }
        throw new IOException("null object detected");
    }

    public void t(n nVar) throws IOException {
        if (nVar != null) {
            u(nVar, true);
            c();
            return;
        }
        throw new IOException("null object detected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(n nVar, boolean z) throws IOException {
        nVar.u(this, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(boolean z, int i, int i2) throws IOException {
        if (!z) {
            return;
        }
        if (i2 < 31) {
            f(i | i2);
            return;
        }
        f(31 | i);
        if (i2 < 128) {
            f(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        g(bArr, i3, 5 - i3);
    }

    void c() throws IOException {
    }
}
