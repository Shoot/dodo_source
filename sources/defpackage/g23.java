package defpackage;

import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: g23  reason: default package */
/* loaded from: classes3.dex */
public class g23 extends i0 {
    private byte[] a;
    private eb b;

    public g23(eb ebVar, byte[] bArr) {
        this.a = tr.h(bArr);
        this.b = ebVar;
    }

    public static g23 v(Object obj) {
        if (obj instanceof g23) {
            return (g23) obj;
        }
        if (obj != null) {
            return new g23(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.b);
        dVar.a(new s0(this.a));
        return new w0(dVar);
    }

    public eb t() {
        return this.b;
    }

    public byte[] u() {
        return tr.h(this.a);
    }

    public g23(p pVar) {
        Enumeration G = pVar.G();
        this.b = eb.u(G.nextElement());
        this.a = l.D(G.nextElement()).F();
    }
}
