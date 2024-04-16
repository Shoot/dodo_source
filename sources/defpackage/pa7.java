package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
/* renamed from: pa7  reason: default package */
/* loaded from: classes3.dex */
public class pa7 {
    static final byte[] a = a0b.e("openssh-key-v1\u0000");

    private static boolean a(p pVar) {
        for (int i = 0; i < pVar.size(); i++) {
            if (!(pVar.F(i) instanceof i)) {
                return false;
            }
        }
        return true;
    }

    public static byte[] b(ux uxVar) throws IOException {
        if (uxVar != null) {
            if (uxVar instanceof o39) {
                return gk8.a(uxVar).B().f().getEncoded();
            }
            if (uxVar instanceof nb3) {
                return gk8.a(uxVar).B().f().getEncoded();
            }
            if (uxVar instanceof d82) {
                d82 d82Var = (d82) uxVar;
                b82 b = d82Var.b();
                d dVar = new d();
                dVar.a(new i(0L));
                dVar.a(new i(b.b()));
                dVar.a(new i(b.c()));
                dVar.a(new i(b.a()));
                dVar.a(new i(b.a().modPow(d82Var.c(), b.b())));
                dVar.a(new i(d82Var.c()));
                try {
                    return new w0(dVar).getEncoded();
                } catch (Exception e) {
                    throw new IllegalStateException("unable to encode DSAPrivateKeyParameters " + e.getMessage());
                }
            } else if (uxVar instanceof lc3) {
                lc3 lc3Var = (lc3) uxVar;
                mc3 b2 = lc3Var.b();
                js9 js9Var = new js9();
                js9Var.g(a);
                js9Var.h("none");
                js9Var.h("none");
                js9Var.h("");
                js9Var.d(1);
                js9Var.f(ra7.a(b2));
                js9 js9Var2 = new js9();
                int nextInt = b32.b().nextInt();
                js9Var2.d(nextInt);
                js9Var2.d(nextInt);
                js9Var2.h("ssh-ed25519");
                byte[] encoded = b2.getEncoded();
                js9Var2.f(encoded);
                js9Var2.f(tr.p(lc3Var.getEncoded(), encoded));
                js9Var2.h("");
                js9Var.f(js9Var2.b());
                return js9Var.a();
            } else {
                throw new IllegalArgumentException("unable to convert " + uxVar.getClass().getName() + " to openssh private key");
            }
        }
        throw new IllegalArgumentException("param is null");
    }

    public static ux c(byte[] bArr) {
        ux uxVar = null;
        if (bArr[0] == 48) {
            p D = p.D(bArr);
            if (D.size() == 6) {
                if (a(D) && ((i) D.F(0)).F().equals(db0.a)) {
                    uxVar = new d82(((i) D.F(5)).F(), new b82(((i) D.F(1)).F(), ((i) D.F(2)).F(), ((i) D.F(3)).F()));
                }
            } else if (D.size() == 9) {
                if (a(D) && ((i) D.F(0)).F().equals(db0.a)) {
                    p39 w = p39.w(D);
                    uxVar = new o39(w.x(), w.C(), w.B(), w.z(), w.A(), w.u(), w.v(), w.t());
                }
            } else if (D.size() == 4 && (D.F(3) instanceof s) && (D.F(2) instanceof s)) {
                mb3 t = mb3.t(D);
                k kVar = (k) t.w();
                uxVar = new nb3(t.u(), new hb3(kVar, gb3.c(kVar)));
            }
        } else {
            is9 is9Var = new is9(a, bArr);
            if ("none".equals(is9Var.f())) {
                is9Var.h();
                is9Var.h();
                if (is9Var.g() == 1) {
                    ra7.c(is9Var.c());
                    byte[] d = is9Var.d();
                    if (!is9Var.a()) {
                        is9 is9Var2 = new is9(d);
                        if (is9Var2.g() == is9Var2.g()) {
                            String f = is9Var2.f();
                            if ("ssh-ed25519".equals(f)) {
                                is9Var2.c();
                                byte[] c = is9Var2.c();
                                if (c.length == 64) {
                                    uxVar = new lc3(c, 0);
                                } else {
                                    throw new IllegalStateException("private key value of wrong length");
                                }
                            } else if (f.startsWith("ecdsa")) {
                                k b = ks9.b(a0b.b(is9Var2.c()));
                                if (b != null) {
                                    iac c2 = ls6.c(b);
                                    if (c2 != null) {
                                        is9Var2.c();
                                        uxVar = new nb3(new BigInteger(1, is9Var2.c()), new hb3(b, c2));
                                    } else {
                                        throw new IllegalStateException("Curve not found for: " + b);
                                    }
                                } else {
                                    throw new IllegalStateException("OID not found for: " + f);
                                }
                            }
                            is9Var2.h();
                            if (is9Var2.a()) {
                                throw new IllegalArgumentException("private key block has trailing data");
                            }
                        } else {
                            throw new IllegalStateException("private key check values are not the same");
                        }
                    } else {
                        throw new IllegalArgumentException("decoded key has trailing data");
                    }
                } else {
                    throw new IllegalStateException("multiple keys not supported");
                }
            } else {
                throw new IllegalStateException("encrypted keys not supported");
            }
        }
        if (uxVar != null) {
            return uxVar;
        }
        throw new IllegalArgumentException("unable to parse key");
    }
}
