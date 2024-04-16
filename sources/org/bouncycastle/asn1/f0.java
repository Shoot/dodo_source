package org.bouncycastle.asn1;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class f0 extends s {
    public f0(int i, defpackage.h0 h0Var) {
        super(true, i, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean A() {
        if (!this.b && !this.c.f().A()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void u(m mVar, boolean z) throws IOException {
        Enumeration H;
        mVar.v(z, SyslogConstants.LOG_LOCAL4, this.a);
        mVar.f(128);
        if (!this.b) {
            defpackage.h0 h0Var = this.c;
            if (h0Var instanceof l) {
                if (h0Var instanceof x) {
                    H = ((x) h0Var).J();
                } else {
                    H = new x(((l) h0Var).F()).J();
                }
            } else if (h0Var instanceof p) {
                H = ((p) h0Var).G();
            } else if (h0Var instanceof q) {
                H = ((q) h0Var).H();
            } else {
                throw new ASN1Exception("not implemented: " + this.c.getClass().getName());
            }
            mVar.h(H);
        } else {
            mVar.u(this.c.f(), true);
        }
        mVar.f(0);
        mVar.f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int v() throws IOException {
        int b;
        int v = this.c.f().v();
        if (this.b) {
            b = v1.b(this.a) + v1.a(v);
        } else {
            v--;
            b = v1.b(this.a);
        }
        return b + v;
    }

    public f0(boolean z, int i, defpackage.h0 h0Var) {
        super(z, i, h0Var);
    }
}
