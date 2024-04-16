package defpackage;
/* renamed from: at6  reason: default package */
/* loaded from: classes3.dex */
public abstract class at6 {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int S;
        ws6.x(iArr, iArr2, iArr3);
        ws6.w(iArr, 6, iArr2, 6, iArr3, 12);
        int d = ws6.d(iArr3, 6, iArr3, 12);
        int c = d + ws6.c(iArr3, 18, iArr3, 12, ws6.c(iArr3, 0, iArr3, 6, 0) + d);
        int[] h = ws6.h();
        int[] h2 = ws6.h();
        if (ws6.l(iArr, 6, iArr, 0, h, 0) != ws6.l(iArr2, 6, iArr2, 0, h2, 0)) {
            z = true;
        } else {
            z = false;
        }
        int[] j = ws6.j();
        ws6.x(h, h2, j);
        if (z) {
            S = et6.d(12, j, 0, iArr3, 6);
        } else {
            S = et6.S(12, j, 0, iArr3, 6);
        }
        et6.f(24, c + S, iArr3, 18);
    }

    public static void b(int[] iArr, int[] iArr2) {
        ws6.D(iArr, iArr2);
        ws6.C(iArr, 6, iArr2, 12);
        int d = ws6.d(iArr2, 6, iArr2, 12);
        int c = d + ws6.c(iArr2, 18, iArr2, 12, ws6.c(iArr2, 0, iArr2, 6, 0) + d);
        int[] h = ws6.h();
        ws6.l(iArr, 6, iArr, 0, h, 0);
        int[] j = ws6.j();
        ws6.D(h, j);
        et6.f(24, c + et6.S(12, j, 0, iArr2, 6), iArr2, 18);
    }
}
