package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: qk0  reason: default package */
/* loaded from: classes3.dex */
public class qk0 extends i0 {
    i a;
    l b;

    private qk0(p pVar) {
        this.b = (l) pVar.F(0);
        this.a = (i) pVar.F(1);
    }

    public static qk0 u(Object obj) {
        if (obj instanceof qk0) {
            return (qk0) obj;
        }
        if (obj != null) {
            return new qk0(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.b);
        dVar.a(this.a);
        return new w0(dVar);
    }

    public byte[] t() {
        return tr.h(this.b.F());
    }

    public int v() {
        return this.a.P();
    }

    public qk0(byte[] bArr, int i) {
        this.b = new s0(tr.h(bArr));
        this.a = new i(i);
    }
}
