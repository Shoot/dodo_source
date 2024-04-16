package defpackage;

import defpackage.xb5;
import java.io.IOException;
/* compiled from: BlurEffectParser.java */
/* renamed from: be0  reason: default package */
/* loaded from: classes.dex */
class be0 {
    private static final xb5.a a = xb5.a.a("ef");
    private static final xb5.a b = xb5.a.a("ty", "v");

    private static ae0 a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        xb5Var.c();
        ae0 ae0Var = null;
        while (true) {
            boolean z = false;
            while (xb5Var.j()) {
                int u = xb5Var.u(b);
                if (u != 0) {
                    if (u != 1) {
                        xb5Var.x();
                        xb5Var.y();
                    } else if (z) {
                        ae0Var = new ae0(ek.e(xb5Var, ez5Var));
                    } else {
                        xb5Var.y();
                    }
                } else if (xb5Var.m() == 0) {
                    z = true;
                }
            }
            xb5Var.i();
            return ae0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ae0 b(xb5 xb5Var, ez5 ez5Var) throws IOException {
        ae0 ae0Var = null;
        while (xb5Var.j()) {
            if (xb5Var.u(a) != 0) {
                xb5Var.x();
                xb5Var.y();
            } else {
                xb5Var.b();
                while (xb5Var.j()) {
                    ae0 a2 = a(xb5Var, ez5Var);
                    if (a2 != null) {
                        ae0Var = a2;
                    }
                }
                xb5Var.e();
            }
        }
        return ae0Var;
    }
}
