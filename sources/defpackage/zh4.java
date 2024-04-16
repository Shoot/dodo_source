package defpackage;

import android.graphics.Path;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.xb5;
import java.io.IOException;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientFillParser.java */
/* renamed from: zh4  reason: default package */
/* loaded from: classes.dex */
public class zh4 {
    private static final xb5.a a = xb5.a.a("nm", "g", "o", "t", Image.TYPE_SMALL, e.a, "r", "hd");
    private static final xb5.a b = xb5.a.a("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xh4 a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        rj rjVar;
        di4 di4Var;
        Path.FillType fillType;
        rj rjVar2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        di4 di4Var2 = null;
        qj qjVar = null;
        uj ujVar = null;
        uj ujVar2 = null;
        boolean z = false;
        while (xb5Var.j()) {
            switch (xb5Var.u(a)) {
                case 0:
                    str = xb5Var.o();
                    break;
                case 1:
                    xb5Var.c();
                    int i = -1;
                    while (xb5Var.j()) {
                        int u = xb5Var.u(b);
                        if (u != 0) {
                            if (u != 1) {
                                xb5Var.x();
                                xb5Var.y();
                            } else {
                                qjVar = ek.g(xb5Var, ez5Var, i);
                            }
                        } else {
                            i = xb5Var.m();
                        }
                    }
                    xb5Var.i();
                    break;
                case 2:
                    rjVar2 = ek.h(xb5Var, ez5Var);
                    break;
                case 3:
                    if (xb5Var.m() == 1) {
                        di4Var = di4.LINEAR;
                    } else {
                        di4Var = di4.RADIAL;
                    }
                    di4Var2 = di4Var;
                    break;
                case 4:
                    ujVar = ek.i(xb5Var, ez5Var);
                    break;
                case 5:
                    ujVar2 = ek.i(xb5Var, ez5Var);
                    break;
                case 6:
                    if (xb5Var.m() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 7:
                    z = xb5Var.k();
                    break;
                default:
                    xb5Var.x();
                    xb5Var.y();
                    break;
            }
        }
        if (rjVar2 == null) {
            rjVar = new rj(Collections.singletonList(new lg5(100)));
        } else {
            rjVar = rjVar2;
        }
        return new xh4(str, di4Var2, fillType2, qjVar, rjVar, ujVar, ujVar2, null, null, z);
    }
}
