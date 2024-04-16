package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: ebc  reason: default package */
/* loaded from: classes3.dex */
public class ebc extends i0 {
    private final i a;
    private final int b;
    private final int c;
    private final eb d;

    public ebc(int i, int i2, eb ebVar) {
        this.a = new i(0L);
        this.b = i;
        this.c = i2;
        this.d = ebVar;
    }

    public static ebc u(Object obj) {
        if (obj instanceof ebc) {
            return (ebc) obj;
        }
        if (obj != null) {
            return new ebc(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d();
        dVar.a(this.a);
        dVar.a(new i(this.b));
        dVar.a(new i(this.c));
        dVar.a(this.d);
        return new w0(dVar);
    }

    public int t() {
        return this.b;
    }

    public int v() {
        return this.c;
    }

    public eb w() {
        return this.d;
    }

    private ebc(p pVar) {
        this.a = i.D(pVar.F(0));
        this.b = i.D(pVar.F(1)).P();
        this.c = i.D(pVar.F(2)).P();
        this.d = eb.u(pVar.F(3));
    }
}
