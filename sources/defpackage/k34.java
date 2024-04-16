package defpackage;

import defpackage.xb5;
import java.io.IOException;
/* compiled from: FontParser.java */
/* renamed from: k34  reason: default package */
/* loaded from: classes.dex */
class k34 {
    private static final xb5.a a = xb5.a.a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r24 a(xb5 xb5Var) throws IOException {
        xb5Var.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (xb5Var.j()) {
            int u = xb5Var.u(a);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        if (u != 3) {
                            xb5Var.x();
                            xb5Var.y();
                        } else {
                            f = (float) xb5Var.l();
                        }
                    } else {
                        str3 = xb5Var.o();
                    }
                } else {
                    str2 = xb5Var.o();
                }
            } else {
                str = xb5Var.o();
            }
        }
        xb5Var.i();
        return new r24(str, str2, str3, f);
    }
}
