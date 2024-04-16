package defpackage;

import defpackage.qg5;
import defpackage.sg5;
import defpackage.we5;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* compiled from: Util.java */
/* renamed from: wub  reason: default package */
/* loaded from: classes2.dex */
final class wub {
    public static final Charset a = Charset.forName("UTF-8");

    public static sg5.c a(qg5.c cVar) {
        return sg5.c.R().B(cVar.Q().R()).A(cVar.T()).z(cVar.S()).y(cVar.R()).a();
    }

    public static sg5 b(qg5 qg5Var) {
        sg5.b z = sg5.R().z(qg5Var.T());
        for (qg5.c cVar : qg5Var.S()) {
            z.y(a(cVar));
        }
        return z.a();
    }

    public static void c(qg5.c cVar) throws GeneralSecurityException {
        if (cVar.U()) {
            if (cVar.S() != mm7.UNKNOWN_PREFIX) {
                if (cVar.T() != tf5.UNKNOWN_STATUS) {
                    return;
                }
                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.R())));
            }
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.R())));
        }
        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.R())));
    }

    public static void d(qg5 qg5Var) throws GeneralSecurityException {
        int T = qg5Var.T();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (qg5.c cVar : qg5Var.S()) {
            if (cVar.T() == tf5.ENABLED) {
                c(cVar);
                if (cVar.R() == T) {
                    if (!z) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                }
                if (cVar.Q().Q() != we5.c.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i != 0) {
            if (!z && !z2) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}
