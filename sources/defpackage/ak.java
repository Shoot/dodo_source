package defpackage;

import defpackage.xb5;
import java.io.IOException;
/* compiled from: AnimatableTextPropertiesParser.java */
/* renamed from: ak  reason: default package */
/* loaded from: classes.dex */
public class ak {
    private static final xb5.a a = xb5.a.a("a");
    private static final xb5.a b = xb5.a.a("fc", "sc", "sw", "t");

    public static zj a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        xb5Var.c();
        zj zjVar = null;
        while (xb5Var.j()) {
            if (xb5Var.u(a) != 0) {
                xb5Var.x();
                xb5Var.y();
            } else {
                zjVar = b(xb5Var, ez5Var);
            }
        }
        xb5Var.i();
        if (zjVar == null) {
            return new zj(null, null, null, null);
        }
        return zjVar;
    }

    private static zj b(xb5 xb5Var, ez5 ez5Var) throws IOException {
        xb5Var.c();
        oj ojVar = null;
        oj ojVar2 = null;
        pj pjVar = null;
        pj pjVar2 = null;
        while (xb5Var.j()) {
            int u = xb5Var.u(b);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        if (u != 3) {
                            xb5Var.x();
                            xb5Var.y();
                        } else {
                            pjVar2 = ek.e(xb5Var, ez5Var);
                        }
                    } else {
                        pjVar = ek.e(xb5Var, ez5Var);
                    }
                } else {
                    ojVar2 = ek.c(xb5Var, ez5Var);
                }
            } else {
                ojVar = ek.c(xb5Var, ez5Var);
            }
        }
        xb5Var.i();
        return new zj(ojVar, ojVar2, pjVar, pjVar2);
    }
}
