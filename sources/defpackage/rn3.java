package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: rn3  reason: default package */
/* loaded from: classes3.dex */
public class rn3 extends i0 {
    private Hashtable a = new Hashtable();
    private Vector b = new Vector();

    private rn3(p pVar) {
        Enumeration G = pVar.G();
        while (G.hasMoreElements()) {
            on3 w = on3.w(G.nextElement());
            if (!this.a.containsKey(w.u())) {
                this.a.put(w.u(), w);
                this.b.addElement(w.u());
            } else {
                throw new IllegalArgumentException("repeated extension found: " + w.u());
            }
        }
    }

    public static rn3 u(Object obj) {
        if (obj instanceof rn3) {
            return (rn3) obj;
        }
        if (obj != null) {
            return new rn3(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(this.b.size());
        Enumeration elements = this.b.elements();
        while (elements.hasMoreElements()) {
            dVar.a((on3) this.a.get((k) elements.nextElement()));
        }
        return new w0(dVar);
    }

    public on3 t(k kVar) {
        return (on3) this.a.get(kVar);
    }

    public Enumeration v() {
        return this.b.elements();
    }
}
