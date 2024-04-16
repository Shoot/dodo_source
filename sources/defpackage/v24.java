package defpackage;

import defpackage.xb5;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: FontCharacterParser.java */
/* renamed from: v24  reason: default package */
/* loaded from: classes.dex */
class v24 {
    private static final xb5.a a = xb5.a.a("ch", "size", "w", "style", "fFamily", "data");
    private static final xb5.a b = xb5.a.a("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u24 a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        xb5Var.c();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        double d2 = 0.0d;
        char c = 0;
        while (xb5Var.j()) {
            int u = xb5Var.u(a);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        if (u != 3) {
                            if (u != 4) {
                                if (u != 5) {
                                    xb5Var.x();
                                    xb5Var.y();
                                } else {
                                    xb5Var.c();
                                    while (xb5Var.j()) {
                                        if (xb5Var.u(b) != 0) {
                                            xb5Var.x();
                                            xb5Var.y();
                                        } else {
                                            xb5Var.b();
                                            while (xb5Var.j()) {
                                                arrayList.add((cha) yt1.a(xb5Var, ez5Var));
                                            }
                                            xb5Var.e();
                                        }
                                    }
                                    xb5Var.i();
                                }
                            } else {
                                str2 = xb5Var.o();
                            }
                        } else {
                            str = xb5Var.o();
                        }
                    } else {
                        d = xb5Var.l();
                    }
                } else {
                    d2 = xb5Var.l();
                }
            } else {
                c = xb5Var.o().charAt(0);
            }
        }
        xb5Var.i();
        return new u24(arrayList, c, d2, d, str, str2);
    }
}
