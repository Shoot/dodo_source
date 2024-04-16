package defpackage;

import android.graphics.PointF;
import defpackage.xb5;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: AnimatablePathValueParser.java */
/* renamed from: tj  reason: default package */
/* loaded from: classes.dex */
public class tj {
    private static final xb5.a a = xb5.a.a("k", "x", "y");

    public static sj a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (xb5Var.r() == xb5.b.BEGIN_ARRAY) {
            xb5Var.b();
            while (xb5Var.j()) {
                arrayList.add(wr7.a(xb5Var, ez5Var));
            }
            xb5Var.e();
            og5.b(arrayList);
        } else {
            arrayList.add(new lg5(wc5.e(xb5Var, fvb.e())));
        }
        return new sj(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dk<PointF, PointF> b(xb5 xb5Var, ez5 ez5Var) throws IOException {
        xb5Var.c();
        sj sjVar = null;
        pj pjVar = null;
        pj pjVar2 = null;
        boolean z = false;
        while (xb5Var.r() != xb5.b.END_OBJECT) {
            int u = xb5Var.u(a);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        xb5Var.x();
                        xb5Var.y();
                    } else if (xb5Var.r() == xb5.b.STRING) {
                        xb5Var.y();
                        z = true;
                    } else {
                        pjVar2 = ek.e(xb5Var, ez5Var);
                    }
                } else if (xb5Var.r() == xb5.b.STRING) {
                    xb5Var.y();
                    z = true;
                } else {
                    pjVar = ek.e(xb5Var, ez5Var);
                }
            } else {
                sjVar = a(xb5Var, ez5Var);
            }
        }
        xb5Var.i();
        if (z) {
            ez5Var.a("Lottie doesn't support expressions.");
        }
        if (sjVar != null) {
            return sjVar;
        }
        return new xj(pjVar, pjVar2);
    }
}
