package defpackage;

import defpackage.xb5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: KeyframesParser.java */
/* renamed from: og5  reason: default package */
/* loaded from: classes.dex */
class og5 {
    static xb5.a a = xb5.a.a("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<lg5<T>> a(xb5 xb5Var, ez5 ez5Var, float f, jwb<T> jwbVar, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (xb5Var.r() == xb5.b.STRING) {
            ez5Var.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        xb5Var.c();
        while (xb5Var.j()) {
            if (xb5Var.u(a) != 0) {
                xb5Var.y();
            } else if (xb5Var.r() == xb5.b.BEGIN_ARRAY) {
                xb5Var.b();
                if (xb5Var.r() == xb5.b.NUMBER) {
                    arrayList.add(ng5.c(xb5Var, ez5Var, f, jwbVar, false, z));
                } else {
                    while (xb5Var.j()) {
                        arrayList.add(ng5.c(xb5Var, ez5Var, f, jwbVar, true, z));
                    }
                }
                xb5Var.e();
            } else {
                arrayList.add(ng5.c(xb5Var, ez5Var, f, jwbVar, false, z));
            }
        }
        xb5Var.i();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends lg5<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            lg5<T> lg5Var = list.get(i2);
            i2++;
            lg5<T> lg5Var2 = list.get(i2);
            lg5Var.h = Float.valueOf(lg5Var2.g);
            if (lg5Var.c == null && (t = lg5Var2.b) != null) {
                lg5Var.c = t;
                if (lg5Var instanceof ur7) {
                    ((ur7) lg5Var).i();
                }
            }
        }
        lg5<T> lg5Var3 = list.get(i);
        if ((lg5Var3.b == null || lg5Var3.c == null) && list.size() > 1) {
            list.remove(lg5Var3);
        }
    }
}
