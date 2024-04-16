package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: x39  reason: default package */
/* loaded from: classes3.dex */
public class x39 extends i0 {
    private i a;
    private k b;
    private i c;
    private byte[][] d;
    private byte[][] e;
    private byte[] f;

    public x39(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.a = new i(0L);
        this.c = new i(i);
        this.d = z39.c(sArr);
        this.e = z39.c(sArr2);
        this.f = z39.a(sArr3);
    }

    public static x39 x(Object obj) {
        if (obj instanceof x39) {
            return (x39) obj;
        }
        if (obj != null) {
            return new x39(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d();
        h0 h0Var = this.a;
        if (h0Var == null) {
            h0Var = this.b;
        }
        dVar.a(h0Var);
        dVar.a(this.c);
        d dVar2 = new d();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.d;
            if (i2 >= bArr.length) {
                break;
            }
            dVar2.a(new s0(bArr[i2]));
            i2++;
        }
        dVar.a(new w0(dVar2));
        d dVar3 = new d();
        while (true) {
            byte[][] bArr2 = this.e;
            if (i < bArr2.length) {
                dVar3.a(new s0(bArr2[i]));
                i++;
            } else {
                dVar.a(new w0(dVar3));
                d dVar4 = new d();
                dVar4.a(new s0(this.f));
                dVar.a(new w0(dVar4));
                return new w0(dVar);
            }
        }
    }

    public short[][] t() {
        return z39.d(this.d);
    }

    public short[] u() {
        return z39.b(this.f);
    }

    public short[][] v() {
        return z39.d(this.e);
    }

    public int w() {
        return this.c.P();
    }

    private x39(p pVar) {
        if (pVar.F(0) instanceof i) {
            this.a = i.D(pVar.F(0));
        } else {
            this.b = k.I(pVar.F(0));
        }
        this.c = i.D(pVar.F(1));
        p D = p.D(pVar.F(2));
        this.d = new byte[D.size()];
        for (int i = 0; i < D.size(); i++) {
            this.d[i] = l.D(D.F(i)).F();
        }
        p pVar2 = (p) pVar.F(3);
        this.e = new byte[pVar2.size()];
        for (int i2 = 0; i2 < pVar2.size(); i2++) {
            this.e[i2] = l.D(pVar2.F(i2)).F();
        }
        this.f = l.D(((p) pVar.F(4)).F(0)).F();
    }
}
