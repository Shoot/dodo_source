package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import defpackage.xb5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: JsonUtils.java */
/* renamed from: wc5  reason: default package */
/* loaded from: classes.dex */
class wc5 {
    private static final xb5.a a = xb5.a.a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonUtils.java */
    /* renamed from: wc5$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[xb5.b.values().length];
            a = iArr;
            try {
                iArr[xb5.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[xb5.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[xb5.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(xb5 xb5Var, float f) throws IOException {
        xb5Var.b();
        float l = (float) xb5Var.l();
        float l2 = (float) xb5Var.l();
        while (xb5Var.r() != xb5.b.END_ARRAY) {
            xb5Var.y();
        }
        xb5Var.e();
        return new PointF(l * f, l2 * f);
    }

    private static PointF b(xb5 xb5Var, float f) throws IOException {
        float l = (float) xb5Var.l();
        float l2 = (float) xb5Var.l();
        while (xb5Var.j()) {
            xb5Var.y();
        }
        return new PointF(l * f, l2 * f);
    }

    private static PointF c(xb5 xb5Var, float f) throws IOException {
        xb5Var.c();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (xb5Var.j()) {
            int u = xb5Var.u(a);
            if (u != 0) {
                if (u != 1) {
                    xb5Var.x();
                    xb5Var.y();
                } else {
                    f3 = g(xb5Var);
                }
            } else {
                f2 = g(xb5Var);
            }
        }
        xb5Var.i();
        return new PointF(f2 * f, f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(xb5 xb5Var) throws IOException {
        xb5Var.b();
        int l = (int) (xb5Var.l() * 255.0d);
        int l2 = (int) (xb5Var.l() * 255.0d);
        int l3 = (int) (xb5Var.l() * 255.0d);
        while (xb5Var.j()) {
            xb5Var.y();
        }
        xb5Var.e();
        return Color.argb(255, l, l2, l3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF e(xb5 xb5Var, float f) throws IOException {
        int i = a.a[xb5Var.r().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return c(xb5Var, f);
                }
                throw new IllegalArgumentException("Unknown point starts with " + xb5Var.r());
            }
            return a(xb5Var, f);
        }
        return b(xb5Var, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> f(xb5 xb5Var, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        xb5Var.b();
        while (xb5Var.r() == xb5.b.BEGIN_ARRAY) {
            xb5Var.b();
            arrayList.add(e(xb5Var, f));
            xb5Var.e();
        }
        xb5Var.e();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float g(xb5 xb5Var) throws IOException {
        xb5.b r = xb5Var.r();
        int i = a.a[r.ordinal()];
        if (i != 1) {
            if (i == 2) {
                xb5Var.b();
                float l = (float) xb5Var.l();
                while (xb5Var.j()) {
                    xb5Var.y();
                }
                xb5Var.e();
                return l;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + r);
        }
        return (float) xb5Var.l();
    }
}
