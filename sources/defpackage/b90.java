package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.c;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: b90  reason: default package */
/* loaded from: classes3.dex */
public class b90 extends i0 {
    c a;
    i b;

    private b90(p pVar) {
        this.a = c.G(false);
        this.b = null;
        if (pVar.size() == 0) {
            this.a = null;
            this.b = null;
            return;
        }
        if (pVar.F(0) instanceof c) {
            this.a = c.E(pVar.F(0));
        } else {
            this.a = null;
            this.b = i.D(pVar.F(0));
        }
        if (pVar.size() > 1) {
            if (this.a != null) {
                this.b = i.D(pVar.F(1));
                return;
            }
            throw new IllegalArgumentException("wrong sequence in constructor");
        }
    }

    public static b90 t(Object obj) {
        if (obj instanceof b90) {
            return (b90) obj;
        }
        if (obj instanceof y9c) {
            return t(y9c.a((y9c) obj));
        }
        if (obj != null) {
            return new b90(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        c cVar = this.a;
        if (cVar != null) {
            dVar.a(cVar);
        }
        i iVar = this.b;
        if (iVar != null) {
            dVar.a(iVar);
        }
        return new w0(dVar);
    }

    public String toString() {
        StringBuilder sb;
        if (this.b == null) {
            sb = new StringBuilder();
            sb.append("BasicConstraints: isCa(");
            sb.append(v());
            sb.append(")");
        } else {
            sb = new StringBuilder();
            sb.append("BasicConstraints: isCa(");
            sb.append(v());
            sb.append("), pathLenConstraint = ");
            sb.append(this.b.G());
        }
        return sb.toString();
    }

    public BigInteger u() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.G();
        }
        return null;
    }

    public boolean v() {
        c cVar = this.a;
        if (cVar != null && cVar.H()) {
            return true;
        }
        return false;
    }
}
