package defpackage;

import defpackage.tr;
import java.util.Iterator;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: t47  reason: default package */
/* loaded from: classes3.dex */
public class t47 extends i0 implements Iterable {
    private final h0[] a;

    private t47(p pVar) {
        this.a = new h0[pVar.size()];
        int i = 0;
        while (true) {
            h0[] h0VarArr = this.a;
            if (i == h0VarArr.length) {
                return;
            }
            h0VarArr[i] = s47.w(pVar.F(i));
            i++;
        }
    }

    public static t47 t(Object obj) {
        if (obj instanceof t47) {
            return (t47) obj;
        }
        if (obj != null) {
            return new t47(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return new w0(this.a);
    }

    @Override // java.lang.Iterable
    public Iterator<h0> iterator() {
        return new tr.a(this.a);
    }

    public t47(s47[] s47VarArr) {
        h0[] h0VarArr = new h0[s47VarArr.length];
        this.a = h0VarArr;
        System.arraycopy(s47VarArr, 0, h0VarArr, 0, s47VarArr.length);
    }
}
