package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: qbc  reason: default package */
/* loaded from: classes3.dex */
public class qbc extends i0 {
    private final byte[] a;
    private final byte[] b;

    private qbc(p pVar) {
        if (!i.D(pVar.F(0)).H(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.a = tr.h(l.D(pVar.F(1)).F());
        this.b = tr.h(l.D(pVar.F(2)).F());
    }

    public static qbc t(Object obj) {
        if (obj instanceof qbc) {
            return (qbc) obj;
        }
        if (obj != null) {
            return new qbc(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d();
        dVar.a(new i(0L));
        dVar.a(new s0(this.a));
        dVar.a(new s0(this.b));
        return new w0(dVar);
    }

    public byte[] u() {
        return tr.h(this.a);
    }

    public byte[] v() {
        return tr.h(this.b);
    }

    public qbc(byte[] bArr, byte[] bArr2) {
        this.a = tr.h(bArr);
        this.b = tr.h(bArr2);
    }
}
