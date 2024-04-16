package defpackage;

import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.mha;
import defpackage.xb5;
import java.io.IOException;
/* compiled from: ShapeTrimPathParser.java */
/* renamed from: nha  reason: default package */
/* loaded from: classes.dex */
class nha {
    private static final xb5.a a = xb5.a.a(Image.TYPE_SMALL, e.a, "o", "nm", Image.TYPE_MEDIUM, "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mha a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        String str = null;
        mha.a aVar = null;
        pj pjVar = null;
        pj pjVar2 = null;
        pj pjVar3 = null;
        boolean z = false;
        while (xb5Var.j()) {
            int u = xb5Var.u(a);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        if (u != 3) {
                            if (u != 4) {
                                if (u != 5) {
                                    xb5Var.y();
                                } else {
                                    z = xb5Var.k();
                                }
                            } else {
                                aVar = mha.a.a(xb5Var.m());
                            }
                        } else {
                            str = xb5Var.o();
                        }
                    } else {
                        pjVar3 = ek.f(xb5Var, ez5Var, false);
                    }
                } else {
                    pjVar2 = ek.f(xb5Var, ez5Var, false);
                }
            } else {
                pjVar = ek.f(xb5Var, ez5Var, false);
            }
        }
        return new mha(str, aVar, pjVar, pjVar2, pjVar3, z);
    }
}
