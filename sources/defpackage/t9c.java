package defpackage;

import java.util.Enumeration;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
/* renamed from: t9c  reason: default package */
/* loaded from: classes3.dex */
public class t9c extends i0 implements f0 {
    private static u9c f = j50.Q;
    private boolean a;
    private int b;
    private u9c c;
    private x29[] d;
    private w0 e;

    public t9c(u9c u9cVar, t9c t9cVar) {
        this.c = u9cVar;
        this.d = t9cVar.d;
        this.e = t9cVar.e;
    }

    public static t9c t(u9c u9cVar, Object obj) {
        if (obj instanceof t9c) {
            return new t9c(u9cVar, (t9c) obj);
        }
        if (obj != null) {
            return new t9c(u9cVar, p.D(obj));
        }
        return null;
    }

    public static t9c u(Object obj) {
        if (obj instanceof t9c) {
            return (t9c) obj;
        }
        if (obj != null) {
            return new t9c(p.D(obj));
        }
        return null;
    }

    public static t9c v(s sVar, boolean z) {
        return u(p.E(sVar, true));
    }

    @Override // defpackage.i0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t9c) && !(obj instanceof p)) {
            return false;
        }
        if (f().x(((h0) obj).f())) {
            return true;
        }
        try {
            return this.c.c(this, new t9c(p.D(((h0) obj).f())));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.e;
    }

    @Override // defpackage.i0
    public int hashCode() {
        if (this.a) {
            return this.b;
        }
        this.a = true;
        int a = this.c.a(this);
        this.b = a;
        return a;
    }

    public String toString() {
        return this.c.b(this);
    }

    public x29[] w() {
        return (x29[]) this.d.clone();
    }

    private t9c(u9c u9cVar, p pVar) {
        this.c = u9cVar;
        this.d = new x29[pVar.size()];
        Enumeration G = pVar.G();
        boolean z = true;
        int i = 0;
        while (G.hasMoreElements()) {
            Object nextElement = G.nextElement();
            x29 u = x29.u(nextElement);
            z &= u == nextElement;
            this.d[i] = u;
            i++;
        }
        this.e = z ? w0.I(pVar) : new w0(this.d);
    }

    private t9c(p pVar) {
        this(f, pVar);
    }
}
