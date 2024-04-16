package defpackage;

import defpackage.xb5;
import java.io.IOException;
/* compiled from: RoundedCornersParser.java */
/* renamed from: po9  reason: default package */
/* loaded from: classes.dex */
public class po9 {
    private static final xb5.a a = xb5.a.a("nm", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static no9 a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        boolean z = false;
        String str = null;
        pj pjVar = null;
        while (xb5Var.j()) {
            int u = xb5Var.u(a);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        xb5Var.y();
                    } else {
                        z = xb5Var.k();
                    }
                } else {
                    pjVar = ek.f(xb5Var, ez5Var, true);
                }
            } else {
                str = xb5Var.o();
            }
        }
        if (z) {
            return null;
        }
        return new no9(str, pjVar);
    }
}
