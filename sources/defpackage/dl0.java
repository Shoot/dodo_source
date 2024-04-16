package defpackage;

import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
/* renamed from: dl0  reason: default package */
/* loaded from: classes3.dex */
public class dl0 extends i0 {
    p a;

    private dl0(p pVar) {
        this.a = pVar;
    }

    public static dl0 u(Object obj) {
        if (obj instanceof dl0) {
            return (dl0) obj;
        }
        if (obj != null) {
            return new dl0(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.a;
    }

    public a53[] t() {
        a53[] a53VarArr = new a53[this.a.size()];
        for (int i = 0; i != this.a.size(); i++) {
            a53VarArr[i] = a53.u(this.a.F(i));
        }
        return a53VarArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        stringBuffer.append("CRLDistPoint:");
        stringBuffer.append(d);
        a53[] t = t();
        for (int i = 0; i != t.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(t[i]);
            stringBuffer.append(d);
        }
        return stringBuffer.toString();
    }
}
