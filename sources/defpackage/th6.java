package defpackage;

import defpackage.rh6;
import defpackage.xb5;
import java.io.IOException;
/* compiled from: MergePathsParser.java */
/* renamed from: th6  reason: default package */
/* loaded from: classes.dex */
class th6 {
    private static final xb5.a a = xb5.a.a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static rh6 a(xb5 xb5Var) throws IOException {
        String str = null;
        rh6.a aVar = null;
        boolean z = false;
        while (xb5Var.j()) {
            int u = xb5Var.u(a);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        xb5Var.x();
                        xb5Var.y();
                    } else {
                        z = xb5Var.k();
                    }
                } else {
                    aVar = rh6.a.a(xb5Var.m());
                }
            } else {
                str = xb5Var.o();
            }
        }
        return new rh6(str, aVar, z);
    }
}
