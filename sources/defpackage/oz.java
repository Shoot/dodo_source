package defpackage;

import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.k1;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
/* renamed from: oz  reason: default package */
/* loaded from: classes3.dex */
public class oz extends i0 {
    private kt1[] a;
    private boolean b;

    private oz(p pVar) {
        this.b = true;
        this.a = new kt1[pVar.size()];
        int i = 0;
        while (true) {
            kt1[] kt1VarArr = this.a;
            if (i == kt1VarArr.length) {
                this.b = pVar instanceof b0;
                return;
            } else {
                kt1VarArr[i] = kt1.v(pVar.F(i));
                i++;
            }
        }
    }

    private kt1[] t(kt1[] kt1VarArr) {
        int length = kt1VarArr.length;
        kt1[] kt1VarArr2 = new kt1[length];
        System.arraycopy(kt1VarArr, 0, kt1VarArr2, 0, length);
        return kt1VarArr2;
    }

    public static oz v(Object obj) {
        if (obj instanceof oz) {
            return (oz) obj;
        }
        if (obj != null) {
            return new oz(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        if (this.b) {
            return new b0(this.a);
        }
        return new k1(this.a);
    }

    public kt1[] u() {
        return t(this.a);
    }

    public oz(kt1[] kt1VarArr) {
        this.b = true;
        this.a = t(kt1VarArr);
    }
}
