package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import defpackage.qg5;
import defpackage.rj8;
import java.io.IOException;
import java.security.GeneralSecurityException;
/* compiled from: KeysetHandle.java */
/* renamed from: rg5  reason: default package */
/* loaded from: classes2.dex */
public final class rg5 {
    private final qg5 a;
    private final xn6 b = xn6.b;

    private rg5(qg5 qg5Var) {
        this.a = qg5Var;
    }

    private static void a(jh3 jh3Var) throws GeneralSecurityException {
        if (jh3Var != null && jh3Var.O().size() != 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    private static void b(qg5 qg5Var) throws GeneralSecurityException {
        if (qg5Var != null && qg5Var.R() > 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    private static qg5 c(jh3 jh3Var, l9 l9Var, byte[] bArr) throws GeneralSecurityException {
        try {
            qg5 V = qg5.V(l9Var.a(jh3Var.O().h0(), bArr), o.b());
            b(V);
            return V;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static jh3 d(qg5 qg5Var, l9 l9Var, byte[] bArr) throws GeneralSecurityException {
        byte[] b = l9Var.b(qg5Var.h(), bArr);
        try {
            if (qg5.V(l9Var.a(b, bArr), o.b()).equals(qg5Var)) {
                return jh3.P().y(h.u(b)).z(wub.b(qg5Var)).a();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final rg5 e(qg5 qg5Var) throws GeneralSecurityException {
        b(qg5Var);
        return new rg5(qg5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <B, P> P i(Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        wub.d(this.a);
        rj8.b j = rj8.j(cls2);
        j.e(this.b);
        for (qg5.c cVar : this.a.S()) {
            if (cVar.T() == tf5.ENABLED) {
                Object d = kc9.d(cVar.Q(), cls2);
                if (cVar.R() == this.a.T()) {
                    j.a(d, cVar);
                } else {
                    j.b(d, cVar);
                }
            }
        }
        return (P) kc9.n(j.d(), cls);
    }

    public static final rg5 j(ug5 ug5Var, l9 l9Var) throws GeneralSecurityException, IOException {
        return k(ug5Var, l9Var, new byte[0]);
    }

    public static final rg5 k(ug5 ug5Var, l9 l9Var, byte[] bArr) throws GeneralSecurityException, IOException {
        jh3 a = ug5Var.a();
        a(a);
        return new rg5(c(a, l9Var, bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public qg5 f() {
        return this.a;
    }

    public sg5 g() {
        return wub.b(this.a);
    }

    public <P> P h(Class<P> cls) throws GeneralSecurityException {
        Class<?> c = kc9.c(cls);
        if (c != null) {
            return (P) i(cls, c);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public void l(vg5 vg5Var, l9 l9Var) throws GeneralSecurityException, IOException {
        m(vg5Var, l9Var, new byte[0]);
    }

    public void m(vg5 vg5Var, l9 l9Var, byte[] bArr) throws GeneralSecurityException, IOException {
        vg5Var.a(d(this.a, l9Var, bArr));
    }

    public String toString() {
        return g().toString();
    }
}
