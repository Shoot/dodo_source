package defpackage;

import defpackage.tmb;
import org.bouncycastle.asn1.c;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
/* renamed from: x75  reason: default package */
/* loaded from: classes3.dex */
public class x75 extends i0 {
    private b53 a;
    private boolean b;
    private boolean c;
    private w89 d;
    private boolean e;
    private boolean f;
    private p g;

    private x75(p pVar) {
        this.g = pVar;
        for (int i = 0; i != pVar.size(); i++) {
            s D = s.D(pVar.F(i));
            int G = D.G();
            if (G != 0) {
                if (G != 1) {
                    if (G != 2) {
                        if (G != 3) {
                            if (G != 4) {
                                if (G == 5) {
                                    this.f = c.F(D, false).H();
                                } else {
                                    throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                                }
                            } else {
                                this.e = c.F(D, false).H();
                            }
                        } else {
                            this.d = new w89(j0.J(D, false));
                        }
                    } else {
                        this.c = c.F(D, false).H();
                    }
                } else {
                    this.b = c.F(D, false).H();
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

    private String u(boolean z) {
        if (z) {
            return tmb.h.TRUE_JSON_NAME;
        }
        return "false";
    }

    public static x75 v(Object obj) {
        if (obj instanceof x75) {
            return (x75) obj;
        }
        if (obj != null) {
            return new x75(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.g;
    }

    public String toString() {
        String d = a0b.d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(d);
        b53 b53Var = this.a;
        if (b53Var != null) {
            t(stringBuffer, d, "distributionPoint", b53Var.toString());
        }
        boolean z = this.b;
        if (z) {
            t(stringBuffer, d, "onlyContainsUserCerts", u(z));
        }
        boolean z2 = this.c;
        if (z2) {
            t(stringBuffer, d, "onlyContainsCACerts", u(z2));
        }
        w89 w89Var = this.d;
        if (w89Var != null) {
            t(stringBuffer, d, "onlySomeReasons", w89Var.toString());
        }
        boolean z3 = this.f;
        if (z3) {
            t(stringBuffer, d, "onlyContainsAttributeCerts", u(z3));
        }
        boolean z4 = this.e;
        if (z4) {
            t(stringBuffer, d, "indirectCRL", u(z4));
        }
        stringBuffer.append("]");
        stringBuffer.append(d);
        return stringBuffer.toString();
    }

    public boolean w() {
        return this.e;
    }
}
