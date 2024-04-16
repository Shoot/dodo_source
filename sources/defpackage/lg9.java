package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.xb5;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RepeaterParser.java */
/* renamed from: lg9  reason: default package */
/* loaded from: classes.dex */
public class lg9 {
    private static final xb5.a a = xb5.a.a("nm", c.a, "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jg9 a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        String str = null;
        pj pjVar = null;
        pj pjVar2 = null;
        bk bkVar = null;
        boolean z = false;
        while (xb5Var.j()) {
            int u = xb5Var.u(a);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        if (u != 3) {
                            if (u != 4) {
                                xb5Var.y();
                            } else {
                                z = xb5Var.k();
                            }
                        } else {
                            bkVar = ck.g(xb5Var, ez5Var);
                        }
                    } else {
                        pjVar2 = ek.f(xb5Var, ez5Var, false);
                    }
                } else {
                    pjVar = ek.f(xb5Var, ez5Var, false);
                }
            } else {
                str = xb5Var.o();
            }
        }
        return new jg9(str, pjVar, pjVar2, bkVar, z);
    }
}
