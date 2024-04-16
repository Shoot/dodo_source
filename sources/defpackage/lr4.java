package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: lr4  reason: default package */
/* loaded from: classes3.dex */
public class lr4 extends i0 {
    l a;

    private lr4(p pVar) {
        this.a = pVar.size() == 1 ? (l) pVar.F(0) : null;
    }

    public static lr4 u(Object obj) {
        if (obj instanceof lr4) {
            return (lr4) obj;
        }
        if (obj != null) {
            return new lr4(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(1);
        l lVar = this.a;
        if (lVar != null) {
            dVar.a(lVar);
        }
        return new w0(dVar);
    }

    public byte[] t() {
        l lVar = this.a;
        if (lVar != null) {
            return tr.h(lVar.F());
        }
        return null;
    }

    public lr4(byte[] bArr) {
        this.a = new s0(bArr);
    }
}
