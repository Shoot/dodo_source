package defpackage;

import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
import org.bouncycastle.util.encoders.b;
/* renamed from: qz  reason: default package */
/* loaded from: classes3.dex */
public class qz extends i0 {
    l a;
    gd4 b;
    i c;

    protected qz(p pVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        Enumeration G = pVar.G();
        while (G.hasMoreElements()) {
            s D = s.D(G.nextElement());
            int G2 = D.G();
            if (G2 != 0) {
                if (G2 != 1) {
                    if (G2 == 2) {
                        this.c = i.E(D, false);
                    } else {
                        throw new IllegalArgumentException("illegal tag");
                    }
                } else {
                    this.b = gd4.v(D, false);
                }
            } else {
                this.a = l.E(D, false);
            }
        }
    }

    public static qz t(Object obj) {
        if (obj instanceof qz) {
            return (qz) obj;
        }
        if (obj != null) {
            return new qz(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        l lVar = this.a;
        if (lVar != null) {
            dVar.a(new z0(false, 0, lVar));
        }
        gd4 gd4Var = this.b;
        if (gd4Var != null) {
            dVar.a(new z0(false, 1, gd4Var));
        }
        i iVar = this.c;
        if (iVar != null) {
            dVar.a(new z0(false, 2, iVar));
        }
        return new w0(dVar);
    }

    public String toString() {
        String str;
        l lVar = this.a;
        if (lVar != null) {
            str = b.f(lVar.F());
        } else {
            str = "null";
        }
        return "AuthorityKeyIdentifier: KeyID(" + str + ")";
    }

    public byte[] u() {
        l lVar = this.a;
        if (lVar != null) {
            return lVar.F();
        }
        return null;
    }
}
