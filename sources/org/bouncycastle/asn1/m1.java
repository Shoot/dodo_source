package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class m1 extends q {
    private int c;

    public m1() {
        this.c = -1;
    }

    private int P() throws IOException {
        if (this.c < 0) {
            int length = this.a.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.a[i2].f().C().v();
            }
            this.c = i;
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        if (z) {
            mVar.f(49);
        }
        m e = mVar.e();
        int length = this.a.length;
        int i = 0;
        if (this.c < 0 && length <= 16) {
            n[] nVarArr = new n[length];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                n C = this.a[i3].f().C();
                nVarArr[i3] = C;
                i2 += C.v();
            }
            this.c = i2;
            mVar.r(i2);
            while (i < length) {
                e.u(nVarArr[i], true);
                i++;
            }
            return;
        }
        mVar.r(P());
        while (i < length) {
            e.u(this.a[i].f(), true);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        int P = P();
        return v1.a(P) + 1 + P;
    }

    public m1(defpackage.h0 h0Var) {
        super(h0Var);
        this.c = -1;
    }

    public m1(d dVar) {
        super(dVar, false);
        this.c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m1(boolean z, defpackage.h0[] h0VarArr) {
        super(z, h0VarArr);
        this.c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.q, org.bouncycastle.asn1.n
    public n C() {
        return this;
    }
}
