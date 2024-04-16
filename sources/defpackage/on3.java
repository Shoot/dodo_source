package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.c;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: on3  reason: default package */
/* loaded from: classes3.dex */
public class on3 extends i0 {
    private k a;
    private boolean b;
    private l c;
    public static final k d = new k("2.5.29.9").O();
    public static final k e = new k("2.5.29.14").O();
    public static final k f = new k("2.5.29.15").O();
    public static final k g = new k("2.5.29.16").O();
    public static final k h = new k("2.5.29.17").O();
    public static final k i = new k("2.5.29.18").O();
    public static final k j = new k("2.5.29.19").O();
    public static final k k = new k("2.5.29.20").O();
    public static final k l = new k("2.5.29.21").O();
    public static final k m = new k("2.5.29.23").O();
    public static final k n = new k("2.5.29.24").O();
    public static final k o = new k("2.5.29.27").O();
    public static final k p = new k("2.5.29.28").O();
    public static final k q = new k("2.5.29.29").O();
    public static final k r = new k("2.5.29.30").O();
    public static final k s = new k("2.5.29.31").O();
    public static final k t = new k("2.5.29.32").O();
    public static final k u = new k("2.5.29.33").O();
    public static final k v = new k("2.5.29.35").O();
    public static final k w = new k("2.5.29.36").O();
    public static final k x = new k("2.5.29.37").O();
    public static final k y = new k("2.5.29.46").O();
    public static final k z = new k("2.5.29.54").O();
    public static final k A = new k("1.3.6.1.5.5.7.1.1").O();
    public static final k B = new k("1.3.6.1.5.5.7.1.11").O();
    public static final k I = new k("1.3.6.1.5.5.7.1.12").O();
    public static final k X = new k("1.3.6.1.5.5.7.1.2").O();
    public static final k Y = new k("1.3.6.1.5.5.7.1.3").O();
    public static final k Z = new k("1.3.6.1.5.5.7.1.4").O();
    public static final k S4 = new k("2.5.29.56").O();
    public static final k T4 = new k("2.5.29.55").O();
    public static final k U4 = new k("2.5.29.60").O();

    private on3(p pVar) {
        h0 F;
        if (pVar.size() == 2) {
            this.a = k.I(pVar.F(0));
            this.b = false;
            F = pVar.F(1);
        } else if (pVar.size() == 3) {
            this.a = k.I(pVar.F(0));
            this.b = c.E(pVar.F(1)).H();
            F = pVar.F(2);
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        this.c = l.D(F);
    }

    private static n t(on3 on3Var) throws IllegalArgumentException {
        try {
            return n.z(on3Var.v().F());
        } catch (IOException e2) {
            throw new IllegalArgumentException("can't convert extension: " + e2);
        }
    }

    public static on3 w(Object obj) {
        if (obj instanceof on3) {
            return (on3) obj;
        }
        if (obj != null) {
            return new on3(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0
    public boolean equals(Object obj) {
        if (!(obj instanceof on3)) {
            return false;
        }
        on3 on3Var = (on3) obj;
        if (!on3Var.u().x(u()) || !on3Var.v().x(v()) || on3Var.z() != z()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        dVar.a(this.a);
        if (this.b) {
            dVar.a(c.G(true));
        }
        dVar.a(this.c);
        return new w0(dVar);
    }

    @Override // defpackage.i0
    public int hashCode() {
        if (z()) {
            return v().hashCode() ^ u().hashCode();
        }
        return ~(v().hashCode() ^ u().hashCode());
    }

    public k u() {
        return this.a;
    }

    public l v() {
        return this.c;
    }

    public h0 x() {
        return t(this);
    }

    public boolean z() {
        return this.b;
    }
}
