package defpackage;

import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.z0;
/* renamed from: b53  reason: default package */
/* loaded from: classes3.dex */
public class b53 extends i0 implements f0 {
    h0 a;
    int b;

    public b53(s sVar) {
        h0 F;
        int G = sVar.G();
        this.b = G;
        if (G == 0) {
            F = gd4.v(sVar, false);
        } else {
            F = q.F(sVar, false);
        }
        this.a = F;
    }

    private void t(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public static b53 u(Object obj) {
        if (obj != null && !(obj instanceof b53)) {
            if (obj instanceof s) {
                return new b53((s) obj);
            }
            throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
        }
        return (b53) obj;
    }

    public static b53 v(s sVar, boolean z) {
        return u(s.E(sVar, true));
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return new z0(false, this.b, this.a);
    }

    public String toString() {
        String obj;
        String str;
        String d = a0b.d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(d);
        if (this.b == 0) {
            obj = this.a.toString();
            str = "fullName";
        } else {
            obj = this.a.toString();
            str = "nameRelativeToCRLIssuer";
        }
        t(stringBuffer, d, str, obj);
        stringBuffer.append("]");
        stringBuffer.append(d);
        return stringBuffer.toString();
    }
}
