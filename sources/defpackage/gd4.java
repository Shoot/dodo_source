package defpackage;

import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
/* renamed from: gd4  reason: default package */
/* loaded from: classes3.dex */
public class gd4 extends i0 {
    private final fd4[] a;

    public gd4(fd4 fd4Var) {
        this.a = new fd4[]{fd4Var};
    }

    private static fd4[] t(fd4[] fd4VarArr) {
        fd4[] fd4VarArr2 = new fd4[fd4VarArr.length];
        System.arraycopy(fd4VarArr, 0, fd4VarArr2, 0, fd4VarArr.length);
        return fd4VarArr2;
    }

    public static gd4 u(Object obj) {
        if (obj instanceof gd4) {
            return (gd4) obj;
        }
        if (obj != null) {
            return new gd4(p.D(obj));
        }
        return null;
    }

    public static gd4 v(s sVar, boolean z) {
        return new gd4(p.E(sVar, z));
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return new w0(this.a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d = a0b.d();
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(d);
        for (int i = 0; i != this.a.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(this.a[i]);
            stringBuffer.append(d);
        }
        return stringBuffer.toString();
    }

    public fd4[] w() {
        return t(this.a);
    }

    private gd4(p pVar) {
        this.a = new fd4[pVar.size()];
        for (int i = 0; i != pVar.size(); i++) {
            this.a[i] = fd4.t(pVar.F(i));
        }
    }
}
