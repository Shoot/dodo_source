package defpackage;

import defpackage.xb5;
import java.io.IOException;
/* compiled from: ShapePathParser.java */
/* renamed from: jha  reason: default package */
/* loaded from: classes.dex */
class jha {
    static xb5.a a = xb5.a.a("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static iha a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        String str = null;
        wj wjVar = null;
        int i = 0;
        boolean z = false;
        while (xb5Var.j()) {
            int u = xb5Var.u(a);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        if (u != 3) {
                            xb5Var.y();
                        } else {
                            z = xb5Var.k();
                        }
                    } else {
                        wjVar = ek.k(xb5Var, ez5Var);
                    }
                } else {
                    i = xb5Var.m();
                }
            } else {
                str = xb5Var.o();
            }
        }
        return new iha(str, i, wjVar, z);
    }
}
