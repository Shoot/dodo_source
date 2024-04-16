package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: kh3  reason: default package */
/* loaded from: classes3.dex */
public class kh3 extends i0 {
    private final eb a;
    private final l b;

    public kh3(eb ebVar, byte[] bArr) {
        this.a = ebVar;
        this.b = new s0(bArr);
    }

    public static kh3 v(Object obj) {
        if (obj instanceof kh3) {
            return (kh3) obj;
        }
        if (obj != null) {
            return new kh3(p.D(obj));
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

    public l t() {
        return this.b;
    }

    public eb u() {
        return this.a;
    }

    private kh3(p pVar) {
        this.a = eb.u(pVar.F(0));
        this.b = l.D(pVar.F(1));
    }
}
