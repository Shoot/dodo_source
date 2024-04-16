package defpackage;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.t;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: i5b  reason: default package */
/* loaded from: classes3.dex */
public class i5b extends i0 {
    i a;
    eb b;
    t9c c;
    ggb d;
    ggb e;
    p f;
    rn3 g;

    /* renamed from: i5b$b */
    /* loaded from: classes3.dex */
    public static class b extends i0 {
        p a;
        rn3 b;

        private b(p pVar) {
            if (pVar.size() >= 2 && pVar.size() <= 3) {
                this.a = pVar;
                return;
            }
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }

        public static b u(Object obj) {
            if (obj instanceof b) {
                return (b) obj;
            }
            if (obj != null) {
                return new b(p.D(obj));
            }
            return null;
        }

        @Override // defpackage.i0, defpackage.h0
        public n f() {
            return this.a;
        }

        public rn3 t() {
            if (this.b == null && this.a.size() == 3) {
                this.b = rn3.u(this.a.F(2));
            }
            return this.b;
        }

        public ggb v() {
            return ggb.u(this.a.F(1));
        }

        public i w() {
            return i.D(this.a.F(0));
        }

        public boolean x() {
            if (this.a.size() == 3) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: i5b$c */
    /* loaded from: classes3.dex */
    private class c implements Enumeration {
        private c() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            throw new NoSuchElementException("Empty Enumeration");
        }
    }

    /* renamed from: i5b$d */
    /* loaded from: classes3.dex */
    private class d implements Enumeration {
        private final Enumeration a;

        d(Enumeration enumeration) {
            this.a = enumeration;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.a.hasMoreElements();
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            return b.u(this.a.nextElement());
        }
    }

    public i5b(p pVar) {
        if (pVar.size() >= 3 && pVar.size() <= 7) {
            int i = 0;
            if (pVar.F(0) instanceof i) {
                this.a = i.D(pVar.F(0));
                i = 1;
            } else {
                this.a = null;
            }
            this.b = eb.u(pVar.F(i));
            this.c = t9c.u(pVar.F(i + 1));
            int i2 = i + 3;
            this.d = ggb.u(pVar.F(i + 2));
            if (i2 < pVar.size() && ((pVar.F(i2) instanceof t) || (pVar.F(i2) instanceof g) || (pVar.F(i2) instanceof ggb))) {
                this.e = ggb.u(pVar.F(i2));
                i2 = i + 4;
            }
            if (i2 < pVar.size() && !(pVar.F(i2) instanceof s)) {
                this.f = p.D(pVar.F(i2));
                i2++;
            }
            if (i2 < pVar.size() && (pVar.F(i2) instanceof s)) {
                this.g = rn3.u(p.E((s) pVar.F(i2), true));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static i5b u(Object obj) {
        if (obj instanceof i5b) {
            return (i5b) obj;
        }
        if (obj != null) {
            return new i5b(p.D(obj));
        }
        return null;
    }

    public ggb A() {
        return this.d;
    }

    public int B() {
        i iVar = this.a;
        if (iVar == null) {
            return 1;
        }
        return iVar.P() + 1;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(7);
        i iVar = this.a;
        if (iVar != null) {
            dVar.a(iVar);
        }
        dVar.a(this.b);
        dVar.a(this.c);
        dVar.a(this.d);
        ggb ggbVar = this.e;
        if (ggbVar != null) {
            dVar.a(ggbVar);
        }
        p pVar = this.f;
        if (pVar != null) {
            dVar.a(pVar);
        }
        rn3 rn3Var = this.g;
        if (rn3Var != null) {
            dVar.a(new z0(0, rn3Var));
        }
        return new w0(dVar);
    }

    public rn3 t() {
        return this.g;
    }

    public t9c v() {
        return this.c;
    }

    public ggb w() {
        return this.e;
    }

    public Enumeration x() {
        p pVar = this.f;
        if (pVar == null) {
            return new c();
        }
        return new d(pVar.G());
    }

    public eb z() {
        return this.b;
    }
}
