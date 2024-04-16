package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: wk0  reason: default package */
/* loaded from: classes3.dex */
public class wk0 extends i0 {
    private byte[] a;
    private int b;

    private wk0(p pVar) {
        this.a = l.D(pVar.F(0)).F();
        this.b = pVar.size() == 2 ? i.D(pVar.F(1)).P() : 12;
    }

    public static wk0 u(Object obj) {
        if (obj instanceof wk0) {
            return (wk0) obj;
        }
        if (obj != null) {
            return new wk0(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(new s0(this.a));
        int i = this.b;
        if (i != 12) {
            dVar.a(new i(i));
        }
        return new w0(dVar);
    }

    public int t() {
        return this.b;
    }

    public byte[] v() {
        return tr.h(this.a);
    }

    public wk0(byte[] bArr, int i) {
        this.a = tr.h(bArr);
        this.b = i;
    }
}
