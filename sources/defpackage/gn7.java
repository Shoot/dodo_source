package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: gn7  reason: default package */
/* loaded from: classes3.dex */
public class gn7 extends i0 {
    private static final eb e = new eb(co7.D0, q0.a);
    private final l a;
    private final i b;
    private final i c;
    private final eb d;

    private gn7(p pVar) {
        Enumeration G = pVar.G();
        this.a = (l) G.nextElement();
        this.b = (i) G.nextElement();
        if (G.hasMoreElements()) {
            Object nextElement = G.nextElement();
            if (nextElement instanceof i) {
                this.c = i.D(nextElement);
                nextElement = G.hasMoreElements() ? G.nextElement() : null;
            } else {
                this.c = null;
            }
            if (nextElement != null) {
                this.d = eb.u(nextElement);
                return;
            }
        } else {
            this.c = null;
        }
        this.d = null;
    }

    public static gn7 t(Object obj) {
        if (obj instanceof gn7) {
            return (gn7) obj;
        }
        if (obj != null) {
            return new gn7(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(4);
        dVar.a(this.a);
        dVar.a(this.b);
        i iVar = this.c;
        if (iVar != null) {
            dVar.a(iVar);
        }
        eb ebVar = this.d;
        if (ebVar != null && !ebVar.equals(e)) {
            dVar.a(this.d);
        }
        return new w0(dVar);
    }

    public BigInteger u() {
        return this.b.G();
    }

    public BigInteger v() {
        i iVar = this.c;
        if (iVar != null) {
            return iVar.G();
        }
        return null;
    }

    public eb w() {
        eb ebVar = this.d;
        if (ebVar != null) {
            return ebVar;
        }
        return e;
    }

    public byte[] x() {
        return this.a.F();
    }

    public boolean z() {
        eb ebVar = this.d;
        if (ebVar != null && !ebVar.equals(e)) {
            return false;
        }
        return true;
    }

    public gn7(byte[] bArr, int i) {
        this(bArr, i, 0);
    }

    public gn7(byte[] bArr, int i, int i2) {
        this(bArr, i, i2, null);
    }

    public gn7(byte[] bArr, int i, int i2, eb ebVar) {
        this.a = new s0(tr.h(bArr));
        this.b = new i(i);
        this.c = i2 > 0 ? new i(i2) : null;
        this.d = ebVar;
    }
}
