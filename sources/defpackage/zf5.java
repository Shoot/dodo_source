package defpackage;

import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
/* renamed from: zf5  reason: default package */
/* loaded from: classes3.dex */
public class zf5 extends i0 {
    private j0 a;

    private zf5(j0 j0Var) {
        this.a = j0Var;
    }

    public static zf5 t(Object obj) {
        if (obj instanceof zf5) {
            return (zf5) obj;
        }
        if (obj != null) {
            return new zf5(j0.I(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        byte[] E = this.a.E();
        if (E.length == 1) {
            sb = new StringBuilder();
            sb.append("KeyUsage: 0x");
            i = E[0] & 255;
        } else {
            sb = new StringBuilder();
            sb.append("KeyUsage: 0x");
            i = (E[0] & 255) | ((E[1] & 255) << 8);
        }
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }
}
