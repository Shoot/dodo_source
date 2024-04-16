package defpackage;
/* renamed from: ct6  reason: default package */
/* loaded from: classes3.dex */
public abstract class ct6 {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int S;
        ys6.y(iArr, iArr2, iArr3);
        ys6.x(iArr, 8, iArr2, 8, iArr3, 16);
        int e = ys6.e(iArr3, 8, iArr3, 16);
        int c = e + ys6.c(iArr3, 24, iArr3, 16, ys6.c(iArr3, 0, iArr3, 8, 0) + e);
        int[] i = ys6.i();
        int[] i2 = ys6.i();
        if (ys6.m(iArr, 8, iArr, 0, i, 0) != ys6.m(iArr2, 8, iArr2, 0, i2, 0)) {
            z = true;
        } else {
            z = false;
        }
        int[] k = ys6.k();
        ys6.y(i, i2, k);
        if (z) {
            S = et6.d(16, k, 0, iArr3, 8);
        } else {
            S = et6.S(16, k, 0, iArr3, 8);
        }
        et6.f(32, c + S, iArr3, 24);
    }

    public static void b(int[] iArr, int[] iArr2) {
        ys6.F(iArr, iArr2);
        ys6.E(iArr, 8, iArr2, 16);
        int e = ys6.e(iArr2, 8, iArr2, 16);
        int c = e + ys6.c(iArr2, 24, iArr2, 16, ys6.c(iArr2, 0, iArr2, 8, 0) + e);
        int[] i = ys6.i();
        ys6.m(iArr, 8, iArr, 0, i, 0);
        int[] k = ys6.k();
        ys6.F(i, k);
        et6.f(32, c + et6.S(16, k, 0, iArr2, 8), iArr2, 24);
    }
}
