package defpackage;

import android.graphics.PointF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.xb5;
import java.io.IOException;
/* compiled from: CircleShapeParser.java */
/* renamed from: a81  reason: default package */
/* loaded from: classes.dex */
class a81 {
    private static final xb5.a a = xb5.a.a("nm", "p", Image.TYPE_SMALL, "hd", DateTokenConverter.CONVERTER_KEY);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z71 a(xb5 xb5Var, ez5 ez5Var, int i) throws IOException {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        String str = null;
        dk<PointF, PointF> dkVar = null;
        uj ujVar = null;
        boolean z3 = false;
        while (xb5Var.j()) {
            int u = xb5Var.u(a);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        if (u != 3) {
                            if (u != 4) {
                                xb5Var.x();
                                xb5Var.y();
                            } else if (xb5Var.m() == 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z3 = xb5Var.k();
                        }
                    } else {
                        ujVar = ek.i(xb5Var, ez5Var);
                    }
                } else {
                    dkVar = tj.b(xb5Var, ez5Var);
                }
            } else {
                str = xb5Var.o();
            }
        }
        return new z71(str, dkVar, ujVar, z2, z3);
    }
}
