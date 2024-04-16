package defpackage;

import defpackage.xb5;
import java.io.IOException;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeGroupParser.java */
/* renamed from: dha  reason: default package */
/* loaded from: classes.dex */
public class dha {
    private static final xb5.a a = xb5.a.a("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cha a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (xb5Var.j()) {
            int u = xb5Var.u(a);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        xb5Var.y();
                    } else {
                        xb5Var.b();
                        while (xb5Var.j()) {
                            xt1 a2 = yt1.a(xb5Var, ez5Var);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        xb5Var.e();
                    }
                } else {
                    z = xb5Var.k();
                }
            } else {
                str = xb5Var.o();
            }
        }
        return new cha(str, arrayList, z);
    }
}
