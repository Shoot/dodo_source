package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class r {
    private final InputStream a;
    private final int b;
    private final byte[][] c;

    public r(InputStream inputStream) {
        this(inputStream, v1.c(inputStream));
    }

    private void e(boolean z) {
        InputStream inputStream = this.a;
        if (inputStream instanceof r1) {
            ((r1) inputStream).e(z);
        }
    }

    defpackage.h0 a(int i) throws IOException {
        if (i != 4) {
            if (i != 8) {
                if (i != 16) {
                    if (i == 17) {
                        return new e0(this);
                    }
                    throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i));
                }
                return new c0(this);
            }
            return new l0(this);
        }
        return new y(this);
    }

    public defpackage.h0 b() throws IOException {
        boolean z;
        int read = this.a.read();
        if (read == -1) {
            return null;
        }
        boolean z2 = false;
        e(false);
        int m = h.m(this.a, read);
        if ((read & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        int k = h.k(this.a, this.b, (m == 4 || m == 16 || m == 17 || m == 8) ? true : true);
        if (k < 0) {
            if (z) {
                r rVar = new r(new r1(this.a, this.b), this.b);
                if ((read & 192) == 192) {
                    return new a0(m, rVar);
                }
                if ((read & 64) != 0) {
                    return new v(m, rVar);
                }
                if ((read & 128) != 0) {
                    return new g0(true, m, rVar);
                }
                return rVar.a(m);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        q1 q1Var = new q1(this.a, k, this.b);
        if ((read & 192) == 192) {
            return new j1(z, m, q1Var.i());
        }
        if ((read & 64) != 0) {
            return new e1(z, m, q1Var.i());
        }
        if ((read & 128) != 0) {
            return new g0(z, m, new r(q1Var));
        }
        if (z) {
            if (m != 4) {
                if (m != 8) {
                    if (m != 16) {
                        if (m == 17) {
                            return new n1(new r(q1Var));
                        }
                        throw new IOException("unknown tag " + m + " encountered");
                    }
                    return new l1(new r(q1Var));
                }
                return new l0(new r(q1Var));
            }
            return new y(new r(q1Var));
        } else if (m != 4) {
            try {
                return h.b(m, q1Var, this.c);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception("corrupted stream detected", e);
            }
        } else {
            return new t0(q1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n c(boolean z, int i) throws IOException {
        if (!z) {
            return new o1(false, i, new s0(((q1) this.a).i()));
        }
        d d = d();
        if (this.a instanceof r1) {
            if (d.f() == 1) {
                return new f0(true, i, d.d(0));
            }
            return new f0(false, i, w.a(d));
        } else if (d.f() == 1) {
            return new o1(true, i, d.d(0));
        } else {
            return new o1(false, i, h1.a(d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d d() throws IOException {
        n f;
        defpackage.h0 b = b();
        if (b == null) {
            return new d(0);
        }
        d dVar = new d();
        do {
            if (b instanceof yz4) {
                f = ((yz4) b).d();
            } else {
                f = b.f();
            }
            dVar.a(f);
            b = b();
        } while (b != null);
        return dVar;
    }

    public r(InputStream inputStream, int i) {
        this.a = inputStream;
        this.b = i;
        this.c = new byte[11];
    }
}
