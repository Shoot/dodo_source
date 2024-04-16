package defpackage;

import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: kka  reason: default package */
/* loaded from: classes3.dex */
public class kka extends i0 {
    private final eb a;
    private final p b;
    private final b c;

    public kka(eb ebVar, byte[] bArr) {
        this.a = ebVar;
        this.b = null;
        this.c = new j0(tr.h(bArr));
    }

    public static kka u(Object obj) {
        if (obj instanceof kka) {
            return (kka) obj;
        }
        if (obj != null) {
            return new kka(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        dVar.a(this.a);
        p pVar = this.b;
        if (pVar != null) {
            dVar.a(new z0(0, pVar));
        }
        dVar.a(this.c);
        return new w0(dVar);
    }

    public bu0[] t() {
        p pVar = this.b;
        if (pVar == null) {
            return null;
        }
        int size = pVar.size();
        bu0[] bu0VarArr = new bu0[size];
        for (int i = 0; i != size; i++) {
            bu0VarArr[i] = bu0.u(this.b.F(i));
        }
        return bu0VarArr;
    }

    public b v() {
        return new j0(this.c.E(), this.c.G());
    }

    public eb w() {
        return this.a;
    }

    public kka(eb ebVar, bu0[] bu0VarArr, byte[] bArr) {
        this.a = ebVar;
        this.b = new w0(bu0VarArr);
        this.c = new j0(tr.h(bArr));
    }

    private kka(p pVar) {
        this.a = eb.u(pVar.F(0));
        int i = 1;
        if (pVar.F(1) instanceof s) {
            this.b = p.D(s.D(pVar.F(1)).F());
            i = 2;
        } else {
            this.b = null;
        }
        this.c = j0.I(pVar.F(i));
    }
}
