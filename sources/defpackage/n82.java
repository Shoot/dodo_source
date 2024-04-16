package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: n82  reason: default package */
/* loaded from: classes3.dex */
public class n82 extends i0 {
    private static final byte[] d = {-87, -42, -21, 69, -15, 60, 112, -126, Byte.MIN_VALUE, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};
    private k a;
    private i82 b;
    private byte[] c = d;

    public n82(i82 i82Var) {
        this.b = i82Var;
    }

    public static byte[] u() {
        return tr.h(d);
    }

    public static n82 w(Object obj) {
        n82 n82Var;
        if (obj instanceof n82) {
            return (n82) obj;
        }
        if (obj != null) {
            p D = p.D(obj);
            if (D.F(0) instanceof k) {
                n82Var = new n82(k.I(D.F(0)));
            } else {
                n82Var = new n82(i82.x(D.F(0)));
            }
            if (D.size() == 2) {
                byte[] F = l.D(D.F(1)).F();
                n82Var.c = F;
                if (F.length != d.length) {
                    throw new IllegalArgumentException("object parse error");
                }
            }
            return n82Var;
        }
        throw new IllegalArgumentException("object parse error");
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        h0 h0Var = this.a;
        if (h0Var == null) {
            h0Var = this.b;
        }
        dVar.a(h0Var);
        if (!tr.c(this.c, d)) {
            dVar.a(new s0(this.c));
        }
        return new w0(dVar);
    }

    public byte[] t() {
        return tr.h(this.c);
    }

    public i82 v() {
        return this.b;
    }

    public k x() {
        return this.a;
    }

    public boolean z() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public n82(k kVar) {
        this.a = kVar;
    }
}
