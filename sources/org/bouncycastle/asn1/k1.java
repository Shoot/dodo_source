package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class k1 extends p {
    private int b;

    public k1() {
        this.b = -1;
    }

    private int I() throws IOException {
        if (this.b < 0) {
            int length = this.a.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.a[i2].f().C().v();
            }
            this.b = i;
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        if (z) {
            mVar.f(48);
        }
        m e = mVar.e();
        int length = this.a.length;
        int i = 0;
        if (this.b < 0 && length <= 16) {
            n[] nVarArr = new n[length];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                n C = this.a[i3].f().C();
                nVarArr[i3] = C;
                i2 += C.v();
            }
            this.b = i2;
            mVar.r(i2);
            while (i < length) {
                e.u(nVarArr[i], true);
                i++;
            }
            return;
        }
        mVar.r(I());
        while (i < length) {
            e.u(this.a[i].f(), true);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        int I = I();
        return v1.a(I) + 1 + I;
    }

    public k1(defpackage.h0 h0Var) {
        super(h0Var);
        this.b = -1;
    }

    public k1(d dVar) {
        super(dVar);
        this.b = -1;
    }

    public k1(defpackage.h0[] h0VarArr) {
        super(h0VarArr);
        this.b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k1(defpackage.h0[] h0VarArr, boolean z) {
        super(h0VarArr, z);
        this.b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.n
    public n C() {
        return this;
    }
}
