package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: b1b  reason: default package */
/* loaded from: classes3.dex */
public class b1b extends i0 {
    private eb a;
    private j0 b;

    public b1b(eb ebVar, h0 h0Var) throws IOException {
        this.b = new j0(h0Var);
        this.a = ebVar;
    }

    public static b1b u(Object obj) {
        if (obj instanceof b1b) {
            return (b1b) obj;
        }
        if (obj != null) {
            return new b1b(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.a);
        dVar.a(this.b);
        return new w0(dVar);
    }

    public eb t() {
        return this.a;
    }

    public j0 v() {
        return this.b;
    }

    public n w() throws IOException {
        return n.z(this.b.F());
    }

    public b1b(eb ebVar, byte[] bArr) {
        this.b = new j0(bArr);
        this.a = ebVar;
    }

    public b1b(p pVar) {
        if (pVar.size() == 2) {
            Enumeration G = pVar.G();
            this.a = eb.u(G.nextElement());
            this.b = j0.I(G.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }
}
