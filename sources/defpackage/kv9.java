package defpackage;

import defpackage.xb5;
import java.io.IOException;
/* compiled from: ScaleXYParser.java */
/* renamed from: kv9  reason: default package */
/* loaded from: classes.dex */
public class kv9 implements jwb<jv9> {
    public static final kv9 a = new kv9();

    private kv9() {
    }

    @Override // defpackage.jwb
    /* renamed from: b */
    public jv9 a(xb5 xb5Var, float f) throws IOException {
        boolean z;
        if (xb5Var.r() == xb5.b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            xb5Var.b();
        }
        float l = (float) xb5Var.l();
        float l2 = (float) xb5Var.l();
        while (xb5Var.j()) {
            xb5Var.y();
        }
        if (z) {
            xb5Var.e();
        }
        return new jv9((l / 100.0f) * f, (l2 / 100.0f) * f);
    }
}
