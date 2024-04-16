package org.bouncycastle.asn1;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
/* loaded from: classes3.dex */
public class z0 extends s {
    public z0(int i, defpackage.h0 h0Var) {
        super(true, i, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        if (!this.b && !this.c.f().B().A()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        int i;
        n B = this.c.f().B();
        if (!this.b && !B.A()) {
            i = 128;
        } else {
            i = SyslogConstants.LOG_LOCAL4;
        }
        mVar.v(z, i, this.a);
        if (this.b) {
            mVar.r(B.v());
        }
        B.u(mVar.d(), this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        int b;
        int v = this.c.f().B().v();
        if (this.b) {
            b = v1.b(this.a) + v1.a(v);
        } else {
            v--;
            b = v1.b(this.a);
        }
        return b + v;
    }

    public z0(boolean z, int i, defpackage.h0 h0Var) {
        super(z, i, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public n B() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public n C() {
        return this;
    }
}
