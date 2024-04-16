package defpackage;

import android.graphics.PointF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.af8;
import defpackage.tmb;
import defpackage.xb5;
import java.io.IOException;
/* compiled from: PolystarShapeParser.java */
/* renamed from: bf8  reason: default package */
/* loaded from: classes.dex */
class bf8 {
    private static final xb5.a a = xb5.a.a("nm", "sy", "pt", "p", "r", tmb.i.OR_JSON_NAME, "os", "ir", "is", "hd", DateTokenConverter.CONVERTER_KEY);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static af8 a(xb5 xb5Var, ez5 ez5Var, int i) throws IOException {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        String str = null;
        af8.a aVar = null;
        pj pjVar = null;
        dk<PointF, PointF> dkVar = null;
        pj pjVar2 = null;
        pj pjVar3 = null;
        pj pjVar4 = null;
        pj pjVar5 = null;
        pj pjVar6 = null;
        boolean z3 = false;
        while (xb5Var.j()) {
            switch (xb5Var.u(a)) {
                case 0:
                    str = xb5Var.o();
                    break;
                case 1:
                    aVar = af8.a.a(xb5Var.m());
                    break;
                case 2:
                    pjVar = ek.f(xb5Var, ez5Var, false);
                    break;
                case 3:
                    dkVar = tj.b(xb5Var, ez5Var);
                    break;
                case 4:
                    pjVar2 = ek.f(xb5Var, ez5Var, false);
                    break;
                case 5:
                    pjVar4 = ek.e(xb5Var, ez5Var);
                    break;
                case 6:
                    pjVar6 = ek.f(xb5Var, ez5Var, false);
                    break;
                case 7:
                    pjVar3 = ek.e(xb5Var, ez5Var);
                    break;
                case 8:
                    pjVar5 = ek.f(xb5Var, ez5Var, false);
                    break;
                case 9:
                    z3 = xb5Var.k();
                    break;
                case 10:
                    if (xb5Var.m() == 3) {
                        z2 = true;
                        break;
                    } else {
                        z2 = false;
                        break;
                    }
                default:
                    xb5Var.x();
                    xb5Var.y();
                    break;
            }
        }
        return new af8(str, aVar, pjVar, dkVar, pjVar2, pjVar3, pjVar4, pjVar5, pjVar6, z3, z2);
    }
}
