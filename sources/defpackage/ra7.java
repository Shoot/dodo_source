package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.k;
/* renamed from: ra7  reason: default package */
/* loaded from: classes3.dex */
public class ra7 {
    public static byte[] a(ux uxVar) throws IOException {
        if (uxVar != null) {
            if (uxVar instanceof n39) {
                if (!uxVar.a()) {
                    n39 n39Var = (n39) uxVar;
                    js9 js9Var = new js9();
                    js9Var.h("ssh-rsa");
                    js9Var.e(n39Var.b());
                    js9Var.e(n39Var.c());
                    return js9Var.a();
                }
                throw new IllegalArgumentException("RSAKeyParamaters was for encryption");
            } else if (uxVar instanceof qb3) {
                js9 js9Var2 = new js9();
                qb3 qb3Var = (qb3) uxVar;
                String e = ks9.e(qb3Var.b());
                if (e != null) {
                    js9Var2.h("ecdsa-sha2-" + e);
                    js9Var2.h(e);
                    js9Var2.f(qb3Var.c().l(false));
                    return js9Var2.a();
                }
                throw new IllegalArgumentException("unable to derive ssh curve name for " + qb3Var.b().a().getClass().getName());
            } else if (uxVar instanceof e82) {
                e82 e82Var = (e82) uxVar;
                b82 b = e82Var.b();
                js9 js9Var3 = new js9();
                js9Var3.h("ssh-dss");
                js9Var3.e(b.b());
                js9Var3.e(b.c());
                js9Var3.e(b.a());
                js9Var3.e(e82Var.c());
                return js9Var3.a();
            } else if (uxVar instanceof mc3) {
                js9 js9Var4 = new js9();
                js9Var4.h("ssh-ed25519");
                js9Var4.f(((mc3) uxVar).getEncoded());
                return js9Var4.a();
            } else {
                throw new IllegalArgumentException("unable to convert " + uxVar.getClass().getName() + " to private key");
            }
        }
        throw new IllegalArgumentException("cipherParameters was null.");
    }

    public static ux b(is9 is9Var) {
        ux uxVar;
        ux qb3Var;
        String f = is9Var.f();
        if ("ssh-rsa".equals(f)) {
            uxVar = new n39(false, is9Var.b(), is9Var.b());
        } else {
            if ("ssh-dss".equals(f)) {
                qb3Var = new e82(is9Var.b(), new b82(is9Var.b(), is9Var.b(), is9Var.b()));
            } else if (f.startsWith("ecdsa")) {
                String f2 = is9Var.f();
                k b = ks9.b(f2);
                iac f3 = ks9.f(b);
                if (f3 != null) {
                    qb3Var = new qb3(f3.t().j(is9Var.c()), new hb3(b, f3));
                } else {
                    throw new IllegalStateException("unable to find curve for " + f + " using curve name " + f2);
                }
            } else if ("ssh-ed25519".equals(f)) {
                byte[] c = is9Var.c();
                if (c.length == 32) {
                    uxVar = new mc3(c, 0);
                } else {
                    throw new IllegalStateException("public key value of wrong length");
                }
            } else {
                uxVar = null;
            }
            uxVar = qb3Var;
        }
        if (uxVar != null) {
            if (!is9Var.a()) {
                return uxVar;
            }
            throw new IllegalArgumentException("decoded key has trailing data");
        }
        throw new IllegalArgumentException("unable to parse key");
    }

    public static ux c(byte[] bArr) {
        return b(new is9(bArr));
    }
}
