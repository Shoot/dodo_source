package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class x0 extends q {
    private int c;

    public x0() {
        this.c = -1;
    }

    private static boolean P(boolean z) {
        if (z) {
            return z;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    private int Q() throws IOException {
        if (this.c < 0) {
            int length = this.a.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.a[i2].f().B().v();
            }
            this.c = i;
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.q, org.bouncycastle.asn1.n
    public n B() {
        if (this.b) {
            return this;
        }
        return super.B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        if (z) {
            mVar.f(49);
        }
        u0 d = mVar.d();
        int length = this.a.length;
        int i = 0;
        if (this.c < 0 && length <= 16) {
            n[] nVarArr = new n[length];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                n B = this.a[i3].f().B();
                nVarArr[i3] = B;
                i2 += B.v();
            }
            this.c = i2;
            mVar.r(i2);
            while (i < length) {
                nVarArr[i].u(d, true);
                i++;
            }
            return;
        }
        mVar.r(Q());
        while (i < length) {
            this.a[i].f().B().u(d, true);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        int Q = Q();
        return v1.a(Q) + 1 + Q;
    }

    public x0(defpackage.h0 h0Var) {
        super(h0Var);
        this.c = -1;
    }

    public x0(d dVar) {
        super(dVar, true);
        this.c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(boolean z, defpackage.h0[] h0VarArr) {
        super(P(z), h0VarArr);
        this.c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.q, org.bouncycastle.asn1.n
    public n C() {
        return this;
    }
}
