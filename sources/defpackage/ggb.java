package defpackage;

import java.text.ParseException;
import java.util.Date;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.t;
/* renamed from: ggb  reason: default package */
/* loaded from: classes3.dex */
public class ggb extends i0 implements f0 {
    n a;

    public ggb(n nVar) {
        if (!(nVar instanceof t) && !(nVar instanceof g)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.a = nVar;
    }

    public static ggb u(Object obj) {
        if (obj != null && !(obj instanceof ggb)) {
            if (obj instanceof t) {
                return new ggb((t) obj);
            }
            if (obj instanceof g) {
                return new ggb((g) obj);
            }
            throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
        }
        return (ggb) obj;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.a;
    }

    public Date t() {
        try {
            n nVar = this.a;
            if (nVar instanceof t) {
                return ((t) nVar).D();
            }
            return ((g) nVar).G();
        } catch (ParseException e) {
            throw new IllegalStateException("invalid date string: " + e.getMessage());
        }
    }

    public String toString() {
        return v();
    }

    public String v() {
        n nVar = this.a;
        if (nVar instanceof t) {
            return ((t) nVar).E();
        }
        return ((g) nVar).I();
    }
}
