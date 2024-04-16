package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: nh3  reason: default package */
/* loaded from: classes3.dex */
public class nh3 extends i0 {
    private final eb a;
    private final l b;

    public nh3(eb ebVar, byte[] bArr) {
        this.a = ebVar;
        this.b = new s0(tr.h(bArr));
    }

    public static nh3 u(Object obj) {
        if (obj instanceof nh3) {
            return (nh3) obj;
        }
        if (obj != null) {
            return new nh3(p.D(obj));
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

    public byte[] t() {
        return tr.h(this.b.F());
    }

    public eb v() {
        return this.a;
    }

    private nh3(p pVar) {
        this.a = eb.u(pVar.F(0));
        this.b = l.D(pVar.F(1));
    }
}
