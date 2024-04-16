package org.bouncycastle.asn1;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
/* loaded from: classes3.dex */
public class o1 extends s {
    public o1(boolean z, int i, defpackage.h0 h0Var) {
        super(z, i, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        if (!this.b && !this.c.f().C().A()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        int i;
        n C = this.c.f().C();
        if (!this.b && !C.A()) {
            i = 128;
        } else {
            i = SyslogConstants.LOG_LOCAL4;
        }
        mVar.v(z, i, this.a);
        if (this.b) {
            mVar.r(C.v());
        }
        mVar.e().u(C, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        int b;
        int v = this.c.f().C().v();
        if (this.b) {
            b = v1.b(this.a) + v1.a(v);
        } else {
            v--;
            b = v1.b(this.a);
        }
        return b + v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public n C() {
        return this;
    }
}
