package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: h82  reason: default package */
/* loaded from: classes3.dex */
public class h82 extends i0 {
    private int a;
    private int b;
    private int c;
    private int d;

    private h82(p pVar) {
        this.a = i.D(pVar.F(0)).J();
        if (pVar.F(1) instanceof i) {
            this.b = ((i) pVar.F(1)).J();
        } else if (pVar.F(1) instanceof p) {
            p D = p.D(pVar.F(1));
            this.b = i.D(D.F(0)).J();
            this.c = i.D(D.F(1)).J();
            this.d = i.D(D.F(2)).J();
        } else {
            throw new IllegalArgumentException("object parse error");
        }
    }

    public static h82 t(Object obj) {
        if (obj instanceof h82) {
            return (h82) obj;
        }
        if (obj != null) {
            return new h82(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(new i(this.a));
        if (this.c == 0) {
            dVar.a(new i(this.b));
        } else {
            d dVar2 = new d(3);
            dVar2.a(new i(this.b));
            dVar2.a(new i(this.c));
            dVar2.a(new i(this.d));
            dVar.a(new w0(dVar2));
        }
        return new w0(dVar);
    }

    public int u() {
        return this.b;
    }

    public int v() {
        return this.c;
    }

    public int w() {
        return this.d;
    }

    public int x() {
        return this.a;
    }
}
