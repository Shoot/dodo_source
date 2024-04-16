package defpackage;

import android.graphics.PointF;
import defpackage.xb5;
import java.io.IOException;
/* compiled from: PointFParser.java */
/* renamed from: ed8  reason: default package */
/* loaded from: classes.dex */
public class ed8 implements jwb<PointF> {
    public static final ed8 a = new ed8();

    private ed8() {
    }

    @Override // defpackage.jwb
    /* renamed from: b */
    public PointF a(xb5 xb5Var, float f) throws IOException {
        xb5.b r = xb5Var.r();
        if (r == xb5.b.BEGIN_ARRAY) {
            return wc5.e(xb5Var, f);
        }
        if (r == xb5.b.BEGIN_OBJECT) {
            return wc5.e(xb5Var, f);
        }
        if (r == xb5.b.NUMBER) {
            PointF pointF = new PointF(((float) xb5Var.l()) * f, ((float) xb5Var.l()) * f);
            while (xb5Var.j()) {
                xb5Var.y();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + r);
    }
}
