package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: a53  reason: default package */
/* loaded from: classes3.dex */
public class a53 extends i0 {
    b53 a;
    w89 b;
    gd4 c;

    public a53(p pVar) {
        for (int i = 0; i != pVar.size(); i++) {
            s D = s.D(pVar.F(i));
            int G = D.G();
            if (G != 0) {
                if (G != 1) {
                    if (G == 2) {
                        this.c = gd4.v(D, false);
                    } else {
                        throw new IllegalArgumentException("Unknown tag encountered in structure: " + D.G());
                    }
                } else {
                    this.b = new w89(j0.J(D, false));
                }
            } else {
                this.a = b53.v(D, true);
            }
        }
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

    public static a53 u(Object obj) {
        if (obj != null && !(obj instanceof a53)) {
            if (obj instanceof p) {
                return new a53((p) obj);
            }
            throw new IllegalArgumentException("Invalid DistributionPoint: " + obj.getClass().getName());
        }
        return (a53) obj;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        b53 b53Var = this.a;
        if (b53Var != null) {
            dVar.a(new z0(0, b53Var));
        }
        w89 w89Var = this.b;
        if (w89Var != null) {
            dVar.a(new z0(false, 1, w89Var));
        }
        gd4 gd4Var = this.c;
        if (gd4Var != null) {
            dVar.a(new z0(false, 2, gd4Var));
        }
        return new w0(dVar);
    }

    public String toString() {
        String d = a0b.d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(d);
        b53 b53Var = this.a;
        if (b53Var != null) {
            t(stringBuffer, d, "distributionPoint", b53Var.toString());
        }
        w89 w89Var = this.b;
        if (w89Var != null) {
            t(stringBuffer, d, "reasons", w89Var.toString());
        }
        gd4 gd4Var = this.c;
        if (gd4Var != null) {
            t(stringBuffer, d, "cRLIssuer", gd4Var.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(d);
        return stringBuffer.toString();
    }
}
