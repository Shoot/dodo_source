package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.w0;
/* renamed from: bz  reason: default package */
/* loaded from: classes3.dex */
public class bz extends i0 {
    private k a;
    private q b;

    public bz(p pVar) {
        this.a = (k) pVar.F(0);
        this.b = (q) pVar.F(1);
    }

    public static bz v(Object obj) {
        if (obj != null && !(obj instanceof bz)) {
            if (obj instanceof p) {
                return new bz((p) obj);
            }
            throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
        }
        return (bz) obj;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.a);
        dVar.a(this.b);
        return new w0(dVar);
    }

    public k t() {
        return this.a;
    }

    public q u() {
        return this.b;
    }
}
