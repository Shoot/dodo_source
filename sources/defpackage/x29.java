package defpackage;

import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.q;
/* renamed from: x29  reason: default package */
/* loaded from: classes3.dex */
public class x29 extends i0 {
    private q a;

    private x29(q qVar) {
        this.a = qVar;
    }

    public static x29 u(Object obj) {
        if (obj instanceof x29) {
            return (x29) obj;
        }
        if (obj != null) {
            return new x29(q.E(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.a;
    }

    public int size() {
        return this.a.size();
    }

    public fz t() {
        if (this.a.size() == 0) {
            return null;
        }
        return fz.t(this.a.G(0));
    }

    public fz[] v() {
        int size = this.a.size();
        fz[] fzVarArr = new fz[size];
        for (int i = 0; i != size; i++) {
            fzVarArr[i] = fz.t(this.a.G(i));
        }
        return fzVarArr;
    }

    public boolean w() {
        if (this.a.size() > 1) {
            return true;
        }
        return false;
    }
}
