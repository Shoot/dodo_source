package defpackage;

import android.graphics.Color;
import defpackage.xb5;
import java.io.IOException;
/* compiled from: ColorParser.java */
/* renamed from: bd1  reason: default package */
/* loaded from: classes.dex */
public class bd1 implements jwb<Integer> {
    public static final bd1 a = new bd1();

    private bd1() {
    }

    @Override // defpackage.jwb
    /* renamed from: b */
    public Integer a(xb5 xb5Var, float f) throws IOException {
        boolean z;
        double d;
        if (xb5Var.r() == xb5.b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            xb5Var.b();
        }
        double l = xb5Var.l();
        double l2 = xb5Var.l();
        double l3 = xb5Var.l();
        if (xb5Var.r() == xb5.b.NUMBER) {
            d = xb5Var.l();
        } else {
            d = 1.0d;
        }
        if (z) {
            xb5Var.e();
        }
        if (l <= 1.0d && l2 <= 1.0d && l3 <= 1.0d) {
            l *= 255.0d;
            l2 *= 255.0d;
            l3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) l, (int) l2, (int) l3));
    }
}
