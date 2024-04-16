package defpackage;

import android.graphics.PointF;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.xb5;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RectangleShapeParser.java */
/* renamed from: t99  reason: default package */
/* loaded from: classes.dex */
public class t99 {
    private static final xb5.a a = xb5.a.a("nm", "p", Image.TYPE_SMALL, "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r99 a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        String str = null;
        dk<PointF, PointF> dkVar = null;
        uj ujVar = null;
        pj pjVar = null;
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
                            pjVar = ek.e(xb5Var, ez5Var);
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
        return new r99(str, dkVar, ujVar, pjVar, z);
    }
}
