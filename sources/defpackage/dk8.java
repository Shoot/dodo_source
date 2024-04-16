package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: dk8  reason: default package */
/* loaded from: classes3.dex */
public class dk8 extends i0 {
    private i a;
    private eb b;
    private l c;
    private q d;
    private b e;

    public dk8(eb ebVar, h0 h0Var) throws IOException {
        this(ebVar, h0Var, null, null);
    }

    public static dk8 u(Object obj) {
        if (obj instanceof dk8) {
            return (dk8) obj;
        }
        if (obj != null) {
            return new dk8(p.D(obj));
        }
        return null;
    }

    private static int z(i iVar) {
        int P = iVar.P();
        if (P >= 0 && P <= 1) {
            return P;
        }
        throw new IllegalArgumentException("invalid version for private key info");
    }

    public boolean A() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public h0 B() throws IOException {
        return n.z(this.c.F());
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(5);
        dVar.a(this.a);
        dVar.a(this.b);
        dVar.a(this.c);
        q qVar = this.d;
        if (qVar != null) {
            dVar.a(new z0(false, 0, qVar));
        }
        b bVar = this.e;
        if (bVar != null) {
            dVar.a(new z0(false, 1, bVar));
        }
        return new w0(dVar);
    }

    public q t() {
        return this.d;
    }

    public l v() {
        return new s0(this.c.F());
    }

    public eb w() {
        return this.b;
    }

    public b x() {
        return this.e;
    }

    public dk8(eb ebVar, h0 h0Var, q qVar) throws IOException {
        this(ebVar, h0Var, qVar, null);
    }

    public dk8(eb ebVar, h0 h0Var, q qVar, byte[] bArr) throws IOException {
        this.a = new i(bArr != null ? db0.b : db0.a);
        this.b = ebVar;
        this.c = new s0(h0Var);
        this.d = qVar;
        this.e = bArr == null ? null : new j0(bArr);
    }

    private dk8(p pVar) {
        Enumeration G = pVar.G();
        i D = i.D(G.nextElement());
        this.a = D;
        int z = z(D);
        this.b = eb.u(G.nextElement());
        this.c = l.D(G.nextElement());
        int i = -1;
        while (G.hasMoreElements()) {
            s sVar = (s) G.nextElement();
            int G2 = sVar.G();
            if (G2 <= i) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (G2 == 0) {
                this.d = q.F(sVar, false);
            } else if (G2 != 1) {
                throw new IllegalArgumentException("unknown optional field in private key info");
            } else {
                if (z < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.e = j0.J(sVar, false);
            }
            i = G2;
        }
    }
}
