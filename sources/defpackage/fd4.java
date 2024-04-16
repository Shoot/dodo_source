package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.p0;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.z0;
/* renamed from: fd4  reason: default package */
/* loaded from: classes3.dex */
public class fd4 extends i0 implements f0 {
    private h0 a;
    private int b;

    public fd4(int i, h0 h0Var) {
        this.a = h0Var;
        this.b = i;
    }

    public static fd4 t(Object obj) {
        if (obj != null && !(obj instanceof fd4)) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                int G = sVar.G();
                switch (G) {
                    case 0:
                    case 3:
                    case 5:
                        return new fd4(G, p.E(sVar, false));
                    case 1:
                    case 2:
                    case 6:
                        return new fd4(G, p0.E(sVar, false));
                    case 4:
                        return new fd4(G, t9c.v(sVar, true));
                    case 7:
                        return new fd4(G, l.E(sVar, false));
                    case 8:
                        return new fd4(G, k.J(sVar, false));
                    default:
                        throw new IllegalArgumentException("unknown tag: " + G);
                }
            } else if (obj instanceof byte[]) {
                try {
                    return t(n.z((byte[]) obj));
                } catch (IOException unused) {
                    throw new IllegalArgumentException("unable to parse encoded general name");
                }
            } else {
                throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
            }
        }
        return (fd4) obj;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        boolean z;
        int i = this.b;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        return new z0(z, i, this.a);
    }

    public String toString() {
        String g;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.b);
        stringBuffer.append(": ");
        int i = this.b;
        if (i != 1 && i != 2) {
            if (i != 4) {
                if (i != 6) {
                    g = this.a.toString();
                }
            } else {
                g = t9c.u(this.a).toString();
            }
            stringBuffer.append(g);
            return stringBuffer.toString();
        }
        g = p0.D(this.a).g();
        stringBuffer.append(g);
        return stringBuffer.toString();
    }

    public h0 u() {
        return this.a;
    }

    public int v() {
        return this.b;
    }

    public fd4(t9c t9cVar) {
        this.a = t9cVar;
        this.b = 4;
    }
}
