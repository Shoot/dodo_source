package org.jsoup.select;

import org.jsoup.select.d;
/* compiled from: NodeTraversor.java */
/* loaded from: classes3.dex */
public class e {
    public static d.a a(d dVar, kz6 kz6Var) {
        kz6 kz6Var2 = kz6Var;
        int i = 0;
        while (kz6Var2 != null) {
            d.a a = dVar.a(kz6Var2, i);
            if (a == d.a.STOP) {
                return a;
            }
            if (a == d.a.CONTINUE && kz6Var2.j() > 0) {
                kz6Var2 = kz6Var2.i(0);
                i++;
            } else {
                while (kz6Var2.w() == null && i > 0) {
                    d.a aVar = d.a.CONTINUE;
                    if ((a == aVar || a == d.a.SKIP_CHILDREN) && (a = dVar.b(kz6Var2, i)) == d.a.STOP) {
                        return a;
                    }
                    kz6 H = kz6Var2.H();
                    i--;
                    if (a == d.a.REMOVE) {
                        kz6Var2.K();
                    }
                    a = aVar;
                    kz6Var2 = H;
                }
                if ((a == d.a.CONTINUE || a == d.a.SKIP_CHILDREN) && (a = dVar.b(kz6Var2, i)) == d.a.STOP) {
                    return a;
                }
                if (kz6Var2 == kz6Var) {
                    return a;
                }
                kz6 w = kz6Var2.w();
                if (a == d.a.REMOVE) {
                    kz6Var2.K();
                }
                kz6Var2 = w;
            }
        }
        return d.a.CONTINUE;
    }

    public static void b(wz6 wz6Var, kz6 kz6Var) {
        int i;
        vvb.j(wz6Var);
        vvb.j(kz6Var);
        kz6 kz6Var2 = kz6Var;
        int i2 = 0;
        while (kz6Var2 != null) {
            kz6 H = kz6Var2.H();
            if (H != null) {
                i = H.j();
            } else {
                i = 0;
            }
            kz6 w = kz6Var2.w();
            wz6Var.a(kz6Var2, i2);
            if (H != null && !kz6Var2.t()) {
                if (i == H.j()) {
                    kz6Var2 = H.i(kz6Var2.T());
                } else if (w == null) {
                    i2--;
                    kz6Var2 = H;
                } else {
                    kz6Var2 = w;
                }
            }
            if (kz6Var2.j() > 0) {
                kz6Var2 = kz6Var2.i(0);
                i2++;
            } else {
                while (kz6Var2.w() == null && i2 > 0) {
                    wz6Var.b(kz6Var2, i2);
                    kz6Var2 = kz6Var2.H();
                    i2--;
                }
                wz6Var.b(kz6Var2, i2);
                if (kz6Var2 != kz6Var) {
                    kz6Var2 = kz6Var2.w();
                } else {
                    return;
                }
            }
        }
    }
}
