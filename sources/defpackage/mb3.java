package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: mb3  reason: default package */
/* loaded from: classes3.dex */
public class mb3 extends i0 {
    private p a;

    public mb3(int i, BigInteger bigInteger, h0 h0Var) {
        this(i, bigInteger, null, h0Var);
    }

    public static mb3 t(Object obj) {
        if (obj instanceof mb3) {
            return (mb3) obj;
        }
        if (obj != null) {
            return new mb3(p.D(obj));
        }
        return null;
    }

    private n v(int i) {
        Enumeration G = this.a.G();
        while (G.hasMoreElements()) {
            h0 h0Var = (h0) G.nextElement();
            if (h0Var instanceof s) {
                s sVar = (s) h0Var;
                if (sVar.G() == i) {
                    return sVar.F().f();
                }
            }
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.a;
    }

    public BigInteger u() {
        return new BigInteger(1, ((l) this.a.F(1)).F());
    }

    public n w() {
        return v(0);
    }

    public j0 x() {
        return (j0) v(1);
    }

    public mb3(int i, BigInteger bigInteger, j0 j0Var, h0 h0Var) {
        byte[] b = db0.b((i + 7) / 8, bigInteger);
        d dVar = new d(4);
        dVar.a(new i(1L));
        dVar.a(new s0(b));
        if (h0Var != null) {
            dVar.a(new z0(true, 0, h0Var));
        }
        if (j0Var != null) {
            dVar.a(new z0(true, 1, j0Var));
        }
        this.a = new w0(dVar);
    }

    private mb3(p pVar) {
        this.a = pVar;
    }
}
