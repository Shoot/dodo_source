package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class h extends FilterInputStream {
    private final int a;
    private final boolean b;
    private final byte[][] c;

    public h(InputStream inputStream) {
        this(inputStream, v1.c(inputStream));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n b(int i, q1 q1Var, byte[][] bArr) throws IOException {
        if (i != 10) {
            if (i != 12) {
                if (i != 30) {
                    switch (i) {
                        case 1:
                            return c.D(e(q1Var, bArr));
                        case 2:
                            return new i(q1Var.i(), false);
                        case 3:
                            return b.D(q1Var.c(), q1Var);
                        case 4:
                            return new s0(q1Var.i());
                        case 5:
                            return q0.a;
                        case 6:
                            return k.F(e(q1Var, bArr));
                        default:
                            switch (i) {
                                case 18:
                                    return new r0(q1Var.i());
                                case 19:
                                    return new v0(q1Var.i());
                                case 20:
                                    return new y0(q1Var.i());
                                case 21:
                                    return new c1(q1Var.i());
                                case 22:
                                    return new p0(q1Var.i());
                                case 23:
                                    return new t(q1Var.i());
                                case 24:
                                    return new g(q1Var.i());
                                case 25:
                                    return new o0(q1Var.i());
                                case 26:
                                    return new d1(q1Var.i());
                                case 27:
                                    return new m0(q1Var.i());
                                case 28:
                                    return new b1(q1Var.i());
                                default:
                                    throw new IOException("unknown tag " + i + " encountered");
                            }
                    }
                }
                return new i0(c(q1Var));
            }
            return new a1(q1Var.i());
        }
        return e.D(e(q1Var, bArr));
    }

    private static char[] c(q1 q1Var) throws IOException {
        int c = q1Var.c();
        if ((c & 1) == 0) {
            int i = c / 2;
            char[] cArr = new char[i];
            byte[] bArr = new byte[8];
            int i2 = 0;
            int i3 = 0;
            while (c >= 8) {
                if (aza.d(q1Var, bArr, 0, 8) == 8) {
                    cArr[i3] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
                    cArr[i3 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
                    cArr[i3 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
                    cArr[i3 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
                    i3 += 4;
                    c -= 8;
                } else {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
            }
            if (c > 0) {
                if (aza.d(q1Var, bArr, 0, c) == c) {
                    do {
                        int i4 = i2 + 1;
                        i2 += 2;
                        cArr[i3] = (char) ((bArr[i4] & 255) | (bArr[i2] << 8));
                        i3++;
                    } while (i2 < c);
                    if (q1Var.c() != 0) {
                    }
                    throw new IllegalStateException();
                }
                throw new EOFException("EOF encountered in middle of BMPString");
            } else if (q1Var.c() != 0 && i == i3) {
                return cArr;
            } else {
                throw new IllegalStateException();
            }
        }
        throw new IOException("malformed BMPString encoding encountered");
    }

    private static byte[] e(q1 q1Var, byte[][] bArr) throws IOException {
        int c = q1Var.c();
        if (c >= bArr.length) {
            return q1Var.i();
        }
        byte[] bArr2 = bArr[c];
        if (bArr2 == null) {
            bArr2 = new byte[c];
            bArr[c] = bArr2;
        }
        q1Var.e(bArr2);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(InputStream inputStream, int i, boolean z) throws IOException {
        int read = inputStream.read();
        if (read >= 0) {
            if (read == 128) {
                return -1;
            }
            if (read > 127) {
                int i2 = read & 127;
                if (i2 <= 4) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            i3 = (i3 << 8) + read2;
                        } else {
                            throw new EOFException("EOF found reading length");
                        }
                    }
                    if (i3 >= 0) {
                        if (i3 >= i && !z) {
                            throw new IOException("corrupted stream - out of bounds length found: " + i3 + " >= " + i);
                        }
                        return i3;
                    }
                    throw new IOException("corrupted stream - negative length found");
                }
                throw new IOException("DER length more than 4 bytes: " + i2);
            }
            return read;
        }
        throw new EOFException("EOF found when length expected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 == 31) {
            int read = inputStream.read();
            if ((read & 127) != 0) {
                int i3 = 0;
                while (read >= 0 && (read & 128) != 0) {
                    i3 = ((read & 127) | i3) << 7;
                    read = inputStream.read();
                }
                if (read >= 0) {
                    return i3 | (read & 127);
                }
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        return i2;
    }

    protected n a(int i, int i2, int i3) throws IOException {
        boolean z;
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        q1 q1Var = new q1(this, i3, this.a);
        if ((i & 192) == 192) {
            return new j1(z, i2, q1Var.i());
        }
        if ((i & 64) != 0) {
            return new e1(z, i2, q1Var.i());
        }
        if ((i & 128) != 0) {
            return new r(q1Var).c(z, i2);
        }
        if (z) {
            if (i2 != 4) {
                if (i2 != 8) {
                    if (i2 != 16) {
                        if (i2 == 17) {
                            return h1.b(n(q1Var));
                        }
                        throw new IOException("unknown tag " + i2 + " encountered");
                    } else if (this.b) {
                        return new t1(q1Var.i());
                    } else {
                        return h1.a(n(q1Var));
                    }
                }
                return new g1(n(q1Var));
            }
            d n = n(q1Var);
            int f = n.f();
            l[] lVarArr = new l[f];
            for (int i4 = 0; i4 != f; i4++) {
                defpackage.h0 d = n.d(i4);
                if (d instanceof l) {
                    lVarArr[i4] = (l) d;
                } else {
                    throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: " + d.getClass());
                }
            }
            return new x(lVarArr);
        }
        return b(i2, q1Var, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.a;
    }

    protected int j() throws IOException {
        return k(this, this.a, false);
    }

    public n l() throws IOException {
        boolean z;
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int m = m(this, read);
        if ((read & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        int j = j();
        if (j < 0) {
            if (z) {
                r rVar = new r(new r1(this, this.a), this.a);
                if ((read & 192) == 192) {
                    return new a0(m, rVar).d();
                }
                if ((read & 64) != 0) {
                    return new v(m, rVar).d();
                }
                if ((read & 128) != 0) {
                    return new g0(true, m, rVar).d();
                }
                if (m != 4) {
                    if (m != 8) {
                        if (m != 16) {
                            if (m == 17) {
                                return new e0(rVar).d();
                            }
                            throw new IOException("unknown BER object encountered");
                        }
                        return new c0(rVar).d();
                    }
                    return new l0(rVar).d();
                }
                return new y(rVar).d();
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        try {
            return a(read, m, j);
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception("corrupted stream detected", e);
        }
    }

    d n(q1 q1Var) throws IOException {
        if (q1Var.c() < 1) {
            return new d(0);
        }
        h hVar = new h(q1Var);
        d dVar = new d();
        while (true) {
            n l = hVar.l();
            if (l != null) {
                dVar.a(l);
            } else {
                return dVar;
            }
        }
    }

    public h(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public h(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.a = i;
        this.b = z;
        this.c = new byte[11];
    }

    public h(InputStream inputStream, boolean z) {
        this(inputStream, v1.c(inputStream), z);
    }

    public h(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public h(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }
}
