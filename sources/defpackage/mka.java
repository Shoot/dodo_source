package defpackage;

import java.util.Enumeration;
import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.z0;
/* renamed from: mka  reason: default package */
/* loaded from: classes3.dex */
public class mka extends i0 implements co7 {
    private i a;
    private q b;
    private kt1 c;
    private q d;
    private q e;
    private q f;

    public mka(i iVar, q qVar, kt1 kt1Var, q qVar2, q qVar3, q qVar4) {
        this.a = iVar;
        this.b = qVar;
        this.c = kt1Var;
        this.d = qVar2;
        this.e = qVar3;
        this.f = qVar4;
    }

    public static mka v(Object obj) {
        if (obj instanceof mka) {
            return (mka) obj;
        }
        if (obj != null) {
            return new mka(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(6);
        dVar.a(this.a);
        dVar.a(this.b);
        dVar.a(this.c);
        q qVar = this.d;
        if (qVar != null) {
            dVar.a(new z0(false, 0, qVar));
        }
        q qVar2 = this.e;
        if (qVar2 != null) {
            dVar.a(new z0(false, 1, qVar2));
        }
        dVar.a(this.f);
        return new b0(dVar);
    }

    public q t() {
        return this.e;
    }

    public q u() {
        return this.d;
    }

    public mka(p pVar) {
        Enumeration G = pVar.G();
        this.a = (i) G.nextElement();
        this.b = (q) G.nextElement();
        this.c = kt1.v(G.nextElement());
        while (G.hasMoreElements()) {
            n nVar = (n) G.nextElement();
            if (nVar instanceof s) {
                s sVar = (s) nVar;
                int G2 = sVar.G();
                if (G2 == 0) {
                    this.d = q.F(sVar, false);
                } else if (G2 != 1) {
                    throw new IllegalArgumentException("unknown tag value " + sVar.G());
                } else {
                    this.e = q.F(sVar, false);
                }
            } else {
                this.f = (q) nVar;
            }
        }
    }
}
