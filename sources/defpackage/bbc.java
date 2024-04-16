package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: bbc  reason: default package */
/* loaded from: classes3.dex */
public class bbc extends i0 {
    private final i a;
    private final int b;
    private final eb c;

    public bbc(int i, eb ebVar) {
        this.a = new i(0L);
        this.b = i;
        this.c = ebVar;
    }

    public static bbc u(Object obj) {
        if (obj instanceof bbc) {
            return (bbc) obj;
        }
        if (obj != null) {
            return new bbc(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d();
        dVar.a(this.a);
        dVar.a(new i(this.b));
        dVar.a(this.c);
        return new w0(dVar);
    }

    public int t() {
        return this.b;
    }

    public eb v() {
        return this.c;
    }

    private bbc(p pVar) {
        this.a = i.D(pVar.F(0));
        this.b = i.D(pVar.F(1)).P();
        this.c = eb.u(pVar.F(2));
    }
}
