package defpackage;

import android.graphics.Path;
import com.huawei.hms.opendevice.c;
import defpackage.xb5;
import java.io.IOException;
import java.util.Collections;
/* compiled from: ShapeFillParser.java */
/* renamed from: bha  reason: default package */
/* loaded from: classes.dex */
class bha {
    private static final xb5.a a = xb5.a.a("nm", c.a, "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aha a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        Path.FillType fillType;
        rj rjVar = null;
        String str = null;
        oj ojVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (xb5Var.j()) {
            int u = xb5Var.u(a);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        if (u != 3) {
                            if (u != 4) {
                                if (u != 5) {
                                    xb5Var.x();
                                    xb5Var.y();
                                } else {
                                    z2 = xb5Var.k();
                                }
                            } else {
                                i = xb5Var.m();
                            }
                        } else {
                            z = xb5Var.k();
                        }
                    } else {
                        rjVar = ek.h(xb5Var, ez5Var);
                    }
                } else {
                    ojVar = ek.c(xb5Var, ez5Var);
                }
            } else {
                str = xb5Var.o();
            }
        }
        if (rjVar == null) {
            rjVar = new rj(Collections.singletonList(new lg5(100)));
        }
        rj rjVar2 = rjVar;
        if (i == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new aha(str, z, fillType, ojVar, rjVar2, z2);
    }
}
