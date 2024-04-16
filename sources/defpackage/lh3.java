package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: lh3  reason: default package */
/* loaded from: classes3.dex */
public class lh3 extends i0 {
    private final mh3 a;
    private final bu0[] b;

    public lh3(mh3 mh3Var, bu0[] bu0VarArr) {
        this.a = mh3Var;
        bu0[] bu0VarArr2 = new bu0[bu0VarArr.length];
        this.b = bu0VarArr2;
        System.arraycopy(bu0VarArr, 0, bu0VarArr2, 0, bu0VarArr.length);
    }

    public static lh3 v(Object obj) {
        if (obj instanceof lh3) {
            return (lh3) obj;
        }
        if (obj != null) {
            return new lh3(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.a);
        dVar.a(new w0(this.b));
        return new w0(dVar);
    }

    public bu0[] t() {
        bu0[] bu0VarArr = this.b;
        bu0[] bu0VarArr2 = new bu0[bu0VarArr.length];
        System.arraycopy(bu0VarArr, 0, bu0VarArr2, 0, bu0VarArr.length);
        return bu0VarArr2;
    }

    public mh3 u() {
        return this.a;
    }

    private lh3(p pVar) {
        int i = 0;
        this.a = mh3.v(pVar.F(0));
        p D = p.D(pVar.F(1));
        this.b = new bu0[D.size()];
        while (true) {
            bu0[] bu0VarArr = this.b;
            if (i == bu0VarArr.length) {
                return;
            }
            bu0VarArr[i] = bu0.u(D.F(i));
            i++;
        }
    }
}
