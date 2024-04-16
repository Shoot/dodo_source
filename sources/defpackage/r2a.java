package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: r2a  reason: default package */
/* loaded from: classes3.dex */
public class r2a extends i0 {
    private final k a;
    private final l b;

    public r2a(k kVar, byte[] bArr) {
        this.a = kVar;
        this.b = new s0(tr.h(bArr));
    }

    public static r2a t(Object obj) {
        if (obj instanceof r2a) {
            return (r2a) obj;
        }
        if (obj != null) {
            return new r2a(p.D(obj));
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

    public k u() {
        return this.a;
    }

    public byte[] v() {
        return tr.h(this.b.F());
    }

    private r2a(p pVar) {
        this.a = k.I(pVar.F(0));
        this.b = l.D(pVar.F(1));
    }
}
