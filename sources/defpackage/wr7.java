package defpackage;

import defpackage.xb5;
import java.io.IOException;
/* compiled from: PathKeyframeParser.java */
/* renamed from: wr7  reason: default package */
/* loaded from: classes.dex */
class wr7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ur7 a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        boolean z;
        if (xb5Var.r() == xb5.b.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        return new ur7(ez5Var, ng5.c(xb5Var, ez5Var, fvb.e(), ds7.a, z, false));
    }
}
