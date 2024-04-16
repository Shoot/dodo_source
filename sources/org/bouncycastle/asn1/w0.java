package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes3.dex */
public class w0 extends p {
    private int b;

    public w0() {
        this.b = -1;
    }

    public static w0 I(p pVar) {
        return (w0) pVar.B();
    }

    private int J() throws IOException {
        if (this.b < 0) {
            int length = this.a.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.a[i2].f().B().v();
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
        u0 d = mVar.d();
        int length = this.a.length;
        int i = 0;
        if (this.b < 0 && length <= 16) {
            n[] nVarArr = new n[length];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                n B = this.a[i3].f().B();
                nVarArr[i3] = B;
                i2 += B.v();
            }
            this.b = i2;
            mVar.r(i2);
            while (i < length) {
                nVarArr[i].u(d, true);
                i++;
            }
            return;
        }
        mVar.r(J());
        while (i < length) {
            this.a[i].f().B().u(d, true);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        int J = J();
        return v1.a(J) + 1 + J;
    }

    public w0(defpackage.h0 h0Var) {
        super(h0Var);
        this.b = -1;
    }

    public w0(d dVar) {
        super(dVar);
        this.b = -1;
    }

    public w0(defpackage.h0[] h0VarArr) {
        super(h0VarArr);
        this.b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(defpackage.h0[] h0VarArr, boolean z) {
        super(h0VarArr, z);
        this.b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.n
    public n B() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.n
    public n C() {
        return this;
    }
}
