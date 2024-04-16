package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.p;
/* renamed from: hac  reason: default package */
/* loaded from: classes3.dex */
public class hac extends i0 implements oac {
    private ea3 a;
    private byte[] b;
    private k c;

    public hac(ea3 ea3Var, byte[] bArr) {
        this.c = null;
        this.a = ea3Var;
        this.b = tr.h(bArr);
        v();
    }

    private void v() {
        k kVar;
        if (ca3.n(this.a)) {
            kVar = oac.u3;
        } else if (ca3.l(this.a)) {
            kVar = oac.v3;
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        this.c = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    @Override // defpackage.i0, defpackage.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.bouncycastle.asn1.n f() {
        /*
            r3 = this;
            org.bouncycastle.asn1.d r0 = new org.bouncycastle.asn1.d
            r1 = 3
            r0.<init>(r1)
            org.bouncycastle.asn1.k r1 = r3.c
            org.bouncycastle.asn1.k r2 = defpackage.oac.u3
            boolean r1 = r1.x(r2)
            if (r1 == 0) goto L35
            lac r1 = new lac
            ea3 r2 = r3.a
            na3 r2 = r2.n()
            r1.<init>(r2)
            org.bouncycastle.asn1.n r1 = r1.f()
            r0.a(r1)
            lac r1 = new lac
            ea3 r2 = r3.a
            na3 r2 = r2.o()
            r1.<init>(r2)
        L2d:
            org.bouncycastle.asn1.n r1 = r1.f()
            r0.a(r1)
            goto L5d
        L35:
            org.bouncycastle.asn1.k r1 = r3.c
            org.bouncycastle.asn1.k r2 = defpackage.oac.v3
            boolean r1 = r1.x(r2)
            if (r1 == 0) goto L5d
            lac r1 = new lac
            ea3 r2 = r3.a
            na3 r2 = r2.n()
            r1.<init>(r2)
            org.bouncycastle.asn1.n r1 = r1.f()
            r0.a(r1)
            lac r1 = new lac
            ea3 r2 = r3.a
            na3 r2 = r2.o()
            r1.<init>(r2)
            goto L2d
        L5d:
            byte[] r1 = r3.b
            if (r1 == 0) goto L6b
            org.bouncycastle.asn1.j0 r1 = new org.bouncycastle.asn1.j0
            byte[] r2 = r3.b
            r1.<init>(r2)
            r0.a(r1)
        L6b:
            org.bouncycastle.asn1.w0 r1 = new org.bouncycastle.asn1.w0
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hac.f():org.bouncycastle.asn1.n");
    }

    public ea3 t() {
        return this.a;
    }

    public byte[] u() {
        return tr.h(this.b);
    }

    public hac(mac macVar, BigInteger bigInteger, BigInteger bigInteger2, p pVar) {
        int P;
        int i;
        int i2;
        ea3 eVar;
        this.c = null;
        k t = macVar.t();
        this.c = t;
        if (t.x(oac.u3)) {
            eVar = new ea3.f(((i) macVar.v()).G(), new BigInteger(1, l.D(pVar.F(0)).F()), new BigInteger(1, l.D(pVar.F(1)).F()), bigInteger, bigInteger2);
        } else if (!this.c.x(oac.v3)) {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        } else {
            p D = p.D(macVar.v());
            int P2 = ((i) D.F(0)).P();
            k kVar = (k) D.F(1);
            if (kVar.x(oac.x3)) {
                i = i.D(D.F(2)).P();
                i2 = 0;
                P = 0;
            } else if (!kVar.x(oac.y3)) {
                throw new IllegalArgumentException("This type of EC basis is not implemented");
            } else {
                p D2 = p.D(D.F(2));
                int P3 = i.D(D2.F(0)).P();
                int P4 = i.D(D2.F(1)).P();
                P = i.D(D2.F(2)).P();
                i = P3;
                i2 = P4;
            }
            eVar = new ea3.e(P2, i, i2, P, new BigInteger(1, l.D(pVar.F(0)).F()), new BigInteger(1, l.D(pVar.F(1)).F()), bigInteger, bigInteger2);
        }
        this.a = eVar;
        if (pVar.size() == 3) {
            this.b = ((j0) pVar.F(2)).E();
        }
    }
}
