package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CartItemMixin.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¨\u0006\u0006"}, d2 = {"Lvq0;", "", "b", "cartItemMixin", "", "a", "cart"}, k = 2, mv = {1, 9, 0})
/* renamed from: wq0  reason: default package */
/* loaded from: classes.dex */
public final class wq0 {
    public static final boolean a(vq0 vq0Var, vq0 vq0Var2) {
        z65.h(vq0Var, "<this>");
        z65.h(vq0Var2, "cartItemMixin");
        return z65.c(b(vq0Var2), b(vq0Var));
    }

    public static final String b(vq0 vq0Var) {
        int w;
        List x0;
        int w2;
        List x02;
        int w3;
        List x03;
        int w4;
        List x04;
        z65.h(vq0Var, "<this>");
        ht4 ht4Var = ht4.a;
        Object[] objArr = new Object[7];
        objArr[0] = vq0Var.X();
        objArr[1] = Boolean.valueOf(vq0Var.v0());
        objArr[2] = vq0Var.h();
        List<mr0> z = vq0Var.z();
        w = lc1.w(z, 10);
        ArrayList arrayList = new ArrayList(w);
        for (mr0 mr0Var : z) {
            arrayList.add(mr0Var.getId());
        }
        x0 = sc1.x0(arrayList);
        objArr[3] = x0;
        List<dq0> w0 = vq0Var.w0();
        w2 = lc1.w(w0, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (dq0 dq0Var : w0) {
            arrayList2.add(dq0Var.getId());
        }
        x02 = sc1.x0(arrayList2);
        objArr[4] = x02;
        Collection<xq0> a = vq0Var.I().a();
        w3 = lc1.w(a, 10);
        ArrayList arrayList3 = new ArrayList(w3);
        for (xq0 xq0Var : a) {
            arrayList3.add(xq0Var.getId());
        }
        x03 = sc1.x0(arrayList3);
        objArr[5] = x03;
        Collection<xq0> b = vq0Var.I().b();
        w4 = lc1.w(b, 10);
        ArrayList arrayList4 = new ArrayList(w4);
        for (xq0 xq0Var2 : b) {
            arrayList4.add(xq0Var2.getId());
        }
        x04 = sc1.x0(arrayList4);
        objArr[6] = x04;
        return ht4Var.b(objArr);
    }
}
