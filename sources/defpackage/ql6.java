package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
/* compiled from: MiscUtils.java */
/* renamed from: ql6  reason: default package */
/* loaded from: classes.dex */
public class ql6 {
    private static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static boolean d(float f, float f2, float f3) {
        if (f >= f2 && f <= f3) {
            return true;
        }
        return false;
    }

    private static int e(int i, int i2) {
        boolean z;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            return i3 - 1;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(float f, float f2) {
        return g((int) f, (int) f2);
    }

    private static int g(int i, int i2) {
        return i - (i2 * e(i, i2));
    }

    public static void h(yga ygaVar, Path path) {
        path.reset();
        PointF b = ygaVar.b();
        path.moveTo(b.x, b.y);
        a.set(b.x, b.y);
        for (int i = 0; i < ygaVar.a().size(); i++) {
            c32 c32Var = ygaVar.a().get(i);
            PointF a2 = c32Var.a();
            PointF b2 = c32Var.b();
            PointF c = c32Var.c();
            PointF pointF = a;
            if (a2.equals(pointF) && b2.equals(c)) {
                path.lineTo(c.x, c.y);
            } else {
                path.cubicTo(a2.x, a2.y, b2.x, b2.y, c.x, c.y);
            }
            pointF.set(c.x, c.y);
        }
        if (ygaVar.d()) {
            path.close();
        }
    }

    public static float i(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int j(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static void k(of5 of5Var, int i, List<of5> list, of5 of5Var2, qf5 qf5Var) {
        if (of5Var.c(qf5Var.getName(), i)) {
            list.add(of5Var2.a(qf5Var.getName()).i(qf5Var));
        }
    }
}
