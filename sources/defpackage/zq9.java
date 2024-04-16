package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: zq9  reason: default package */
/* loaded from: classes3.dex */
public class zq9 extends i0 {
    private final i a;
    private final eb b;

    public zq9(eb ebVar) {
        this.a = new i(0L);
        this.b = ebVar;
    }

    public static final zq9 t(Object obj) {
        if (obj instanceof zq9) {
            return (zq9) obj;
        }
        if (obj != null) {
            return new zq9(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d();
        dVar.a(this.a);
        dVar.a(this.b);
        return new w0(dVar);
    }

    public eb u() {
        return this.b;
    }

    private zq9(p pVar) {
        this.a = i.D(pVar.F(0));
        this.b = eb.u(pVar.F(1));
    }
}
