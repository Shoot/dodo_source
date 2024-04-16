package defpackage;

import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.z0;
/* renamed from: xy  reason: default package */
/* loaded from: classes3.dex */
public class xy extends i0 implements f0 {
    h0 a;
    n b;

    public xy(gd4 gd4Var) {
        this.a = gd4Var;
        this.b = gd4Var.f();
    }

    public static xy t(Object obj) {
        if (obj != null && !(obj instanceof xy)) {
            if (obj instanceof qvb) {
                return new xy(qvb.t(obj));
            }
            if (obj instanceof gd4) {
                return new xy((gd4) obj);
            }
            if (obj instanceof s) {
                return new xy(qvb.u((s) obj, false));
            }
            if (obj instanceof p) {
                return new xy(gd4.u(obj));
            }
            throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
        }
        return (xy) obj;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.b;
    }

    public xy(qvb qvbVar) {
        this.a = qvbVar;
        this.b = new z0(false, 0, qvbVar);
    }
}
