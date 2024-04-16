package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.i1;
import androidx.datastore.preferences.protobuf.j1;
import androidx.datastore.preferences.protobuf.x;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* compiled from: MessageSchema.java */
/* loaded from: classes.dex */
final class n0<T> implements x0<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = g1.B();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final l0 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final p0 m;
    private final b0 n;
    private final d1<?, ?> o;
    private final o<?> p;
    private final g0 q;

    private n0(int[] iArr, Object[] objArr, int i, int i2, l0 l0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, p0 p0Var, b0 b0Var, d1<?, ?> d1Var, o<?> oVar, g0 g0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = l0Var instanceof v;
        this.h = z;
        this.f = oVar != null && oVar.e(l0Var);
        this.i = z2;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = p0Var;
        this.n = b0Var;
        this.o = d1Var;
        this.p = oVar;
        this.e = l0Var;
        this.q = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean A(Object obj, int i, x0 x0Var) {
        return x0Var.c(g1.A(obj, R(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean B(Object obj, int i, int i2) {
        List list = (List) g1.A(obj, R(i));
        if (list.isEmpty()) {
            return true;
        }
        x0 s2 = s(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!s2.c(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.x0] */
    private boolean C(T t, int i, int i2) {
        Map<?, ?> e = this.q.e(g1.A(t, R(i)));
        if (e.isEmpty()) {
            return true;
        }
        if (this.q.b(r(i2)).c.a() != i1.c.MESSAGE) {
            return true;
        }
        x0<T> x0Var = 0;
        for (Object obj : e.values()) {
            if (x0Var == null) {
                x0Var = t0.a().d(obj.getClass());
            }
            boolean c = x0Var.c(obj);
            x0Var = x0Var;
            if (!c) {
                return false;
            }
        }
        return true;
    }

    private boolean D(T t, T t2, int i) {
        long Y = Y(i) & 1048575;
        if (g1.x(t, Y) == g1.x(t2, Y)) {
            return true;
        }
        return false;
    }

    private boolean E(T t, int i, int i2) {
        if (g1.x(t, Y(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean F(int i) {
        if ((i & 268435456) != 0) {
            return true;
        }
        return false;
    }

    private static List<?> G(Object obj, long j) {
        return (List) g1.A(obj, j);
    }

    private static <T> long H(T t, long j) {
        return g1.y(t, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        r0 = r16.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        if (r0 >= r16.l) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
        r13 = n(r19, r16.j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
        if (r13 == null) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.s.b<ET>> void I(androidx.datastore.preferences.protobuf.d1<UT, UB> r17, androidx.datastore.preferences.protobuf.o<ET> r18, T r19, androidx.datastore.preferences.protobuf.w0 r20, androidx.datastore.preferences.protobuf.n r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.I(androidx.datastore.preferences.protobuf.d1, androidx.datastore.preferences.protobuf.o, java.lang.Object, androidx.datastore.preferences.protobuf.w0, androidx.datastore.preferences.protobuf.n):void");
    }

    private final <K, V> void J(Object obj, int i, Object obj2, n nVar, w0 w0Var) throws IOException {
        long R = R(i0(i));
        Object A = g1.A(obj, R);
        if (A == null) {
            A = this.q.d(obj2);
            g1.O(obj, R, A);
        } else if (this.q.h(A)) {
            Object d = this.q.d(obj2);
            this.q.a(d, A);
            g1.O(obj, R, d);
            A = d;
        }
        w0Var.O(this.q.c(A), this.q.b(obj2), nVar);
    }

    private void K(T t, T t2, int i) {
        long R = R(i0(i));
        if (!y(t2, i)) {
            return;
        }
        Object A = g1.A(t, R);
        Object A2 = g1.A(t2, R);
        if (A != null && A2 != null) {
            g1.O(t, R, x.h(A, A2));
            e0(t, i);
        } else if (A2 != null) {
            g1.O(t, R, A2);
            e0(t, i);
        }
    }

    private void L(T t, T t2, int i) {
        int i0 = i0(i);
        int Q = Q(i);
        long R = R(i0);
        if (!E(t2, Q, i)) {
            return;
        }
        Object A = g1.A(t, R);
        Object A2 = g1.A(t2, R);
        if (A != null && A2 != null) {
            g1.O(t, R, x.h(A, A2));
            f0(t, Q, i);
        } else if (A2 != null) {
            g1.O(t, R, A2);
            f0(t, Q, i);
        }
    }

    private void M(T t, T t2, int i) {
        int i0 = i0(i);
        long R = R(i0);
        int Q = Q(i);
        switch (h0(i0)) {
            case 0:
                if (y(t2, i)) {
                    g1.K(t, R, g1.v(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 1:
                if (y(t2, i)) {
                    g1.L(t, R, g1.w(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 2:
                if (y(t2, i)) {
                    g1.N(t, R, g1.y(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 3:
                if (y(t2, i)) {
                    g1.N(t, R, g1.y(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 4:
                if (y(t2, i)) {
                    g1.M(t, R, g1.x(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 5:
                if (y(t2, i)) {
                    g1.N(t, R, g1.y(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 6:
                if (y(t2, i)) {
                    g1.M(t, R, g1.x(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 7:
                if (y(t2, i)) {
                    g1.E(t, R, g1.p(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 8:
                if (y(t2, i)) {
                    g1.O(t, R, g1.A(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 9:
                K(t, t2, i);
                return;
            case 10:
                if (y(t2, i)) {
                    g1.O(t, R, g1.A(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 11:
                if (y(t2, i)) {
                    g1.M(t, R, g1.x(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 12:
                if (y(t2, i)) {
                    g1.M(t, R, g1.x(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 13:
                if (y(t2, i)) {
                    g1.M(t, R, g1.x(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 14:
                if (y(t2, i)) {
                    g1.N(t, R, g1.y(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 15:
                if (y(t2, i)) {
                    g1.M(t, R, g1.x(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 16:
                if (y(t2, i)) {
                    g1.N(t, R, g1.y(t2, R));
                    e0(t, i);
                    return;
                }
                return;
            case 17:
                K(t, t2, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.n.d(t, t2, R);
                return;
            case 50:
                z0.F(this.q, t, t2, R);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (E(t2, Q, i)) {
                    g1.O(t, R, g1.A(t2, R));
                    f0(t, Q, i);
                    return;
                }
                return;
            case 60:
                L(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (E(t2, Q, i)) {
                    g1.O(t, R, g1.A(t2, R));
                    f0(t, Q, i);
                    return;
                }
                return;
            case 68:
                L(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> n0<T> N(Class<T> cls, j0 j0Var, p0 p0Var, b0 b0Var, d1<?, ?> d1Var, o<?> oVar, g0 g0Var) {
        if (j0Var instanceof v0) {
            return P((v0) j0Var, p0Var, b0Var, d1Var, oVar, g0Var);
        }
        return O((b1) j0Var, p0Var, b0Var, d1Var, oVar, g0Var);
    }

    static <T> n0<T> O(b1 b1Var, p0 p0Var, b0 b0Var, d1<?, ?> d1Var, o<?> oVar, g0 g0Var) {
        boolean z;
        if (b1Var.c() == or8.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        r[] e = b1Var.e();
        if (e.length == 0) {
            int length = e.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (e.length <= 0) {
                int[] d = b1Var.d();
                if (d == null) {
                    d = r;
                }
                if (e.length <= 0) {
                    int[] iArr2 = r;
                    int[] iArr3 = r;
                    int[] iArr4 = new int[d.length + iArr2.length + iArr3.length];
                    System.arraycopy(d, 0, iArr4, 0, d.length);
                    System.arraycopy(iArr2, 0, iArr4, d.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d.length + iArr2.length, iArr3.length);
                    return new n0<>(iArr, objArr, 0, 0, b1Var.b(), z, true, iArr4, d.length, d.length + iArr2.length, p0Var, b0Var, d1Var, oVar, g0Var);
                }
                r rVar = e[0];
                throw null;
            }
            r rVar2 = e[0];
            throw null;
        }
        r rVar3 = e[0];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> androidx.datastore.preferences.protobuf.n0<T> P(androidx.datastore.preferences.protobuf.v0 r36, androidx.datastore.preferences.protobuf.p0 r37, androidx.datastore.preferences.protobuf.b0 r38, androidx.datastore.preferences.protobuf.d1<?, ?> r39, androidx.datastore.preferences.protobuf.o<?> r40, androidx.datastore.preferences.protobuf.g0 r41) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.P(androidx.datastore.preferences.protobuf.v0, androidx.datastore.preferences.protobuf.p0, androidx.datastore.preferences.protobuf.b0, androidx.datastore.preferences.protobuf.d1, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.g0):androidx.datastore.preferences.protobuf.n0");
    }

    private int Q(int i) {
        return this.a[i];
    }

    private static long R(int i) {
        return i & 1048575;
    }

    private static <T> boolean S(T t, long j) {
        return ((Boolean) g1.A(t, j)).booleanValue();
    }

    private static <T> double T(T t, long j) {
        return ((Double) g1.A(t, j)).doubleValue();
    }

    private static <T> float U(T t, long j) {
        return ((Float) g1.A(t, j)).floatValue();
    }

    private static <T> int V(T t, long j) {
        return ((Integer) g1.A(t, j)).intValue();
    }

    private static <T> long W(T t, long j) {
        return ((Long) g1.A(t, j)).longValue();
    }

    private int X(int i) {
        if (i >= this.c && i <= this.d) {
            return g0(i, 0);
        }
        return -1;
    }

    private int Y(int i) {
        return this.a[i + 2];
    }

    private <E> void Z(Object obj, long j, w0 w0Var, x0<E> x0Var, n nVar) throws IOException {
        w0Var.P(this.n.e(obj, j), x0Var, nVar);
    }

    private <E> void a0(Object obj, int i, w0 w0Var, x0<E> x0Var, n nVar) throws IOException {
        w0Var.K(this.n.e(obj, R(i)), x0Var, nVar);
    }

    private void b0(Object obj, int i, w0 w0Var) throws IOException {
        if (x(i)) {
            g1.O(obj, R(i), w0Var.I());
        } else if (this.g) {
            g1.O(obj, R(i), w0Var.z());
        } else {
            g1.O(obj, R(i), w0Var.o());
        }
    }

    private void c0(Object obj, int i, w0 w0Var) throws IOException {
        if (x(i)) {
            w0Var.n(this.n.e(obj, R(i)));
        } else {
            w0Var.B(this.n.e(obj, R(i)));
        }
    }

    private static Field d0(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void e0(T t, int i) {
        if (this.h) {
            return;
        }
        int Y = Y(i);
        long j = Y & 1048575;
        g1.M(t, j, g1.x(t, j) | (1 << (Y >>> 20)));
    }

    private void f0(T t, int i, int i2) {
        g1.M(t, Y(i2) & 1048575, i);
    }

    private int g0(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int Q = Q(i4);
            if (i == Q) {
                return i4;
            }
            if (i < Q) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int h0(int i) {
        return (i & 267386880) >>> 20;
    }

    private int i0(int i) {
        return this.a[i + 1];
    }

    private boolean j(T t, T t2, int i) {
        if (y(t, i) == y(t2, i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x049e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j0(T r18, androidx.datastore.preferences.protobuf.j1 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.j0(java.lang.Object, androidx.datastore.preferences.protobuf.j1):void");
    }

    private static <T> boolean k(T t, long j) {
        return g1.p(t, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(T r13, androidx.datastore.preferences.protobuf.j1 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.k0(java.lang.Object, androidx.datastore.preferences.protobuf.j1):void");
    }

    private static <T> double l(T t, long j) {
        return g1.v(t, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l0(T r11, androidx.datastore.preferences.protobuf.j1 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.l0(java.lang.Object, androidx.datastore.preferences.protobuf.j1):void");
    }

    private boolean m(T t, T t2, int i) {
        int i0 = i0(i);
        long R = R(i0);
        switch (h0(i0)) {
            case 0:
                if (!j(t, t2, i) || Double.doubleToLongBits(g1.v(t, R)) != Double.doubleToLongBits(g1.v(t2, R))) {
                    return false;
                }
                return true;
            case 1:
                if (!j(t, t2, i) || Float.floatToIntBits(g1.w(t, R)) != Float.floatToIntBits(g1.w(t2, R))) {
                    return false;
                }
                return true;
            case 2:
                if (!j(t, t2, i) || g1.y(t, R) != g1.y(t2, R)) {
                    return false;
                }
                return true;
            case 3:
                if (!j(t, t2, i) || g1.y(t, R) != g1.y(t2, R)) {
                    return false;
                }
                return true;
            case 4:
                if (!j(t, t2, i) || g1.x(t, R) != g1.x(t2, R)) {
                    return false;
                }
                return true;
            case 5:
                if (!j(t, t2, i) || g1.y(t, R) != g1.y(t2, R)) {
                    return false;
                }
                return true;
            case 6:
                if (!j(t, t2, i) || g1.x(t, R) != g1.x(t2, R)) {
                    return false;
                }
                return true;
            case 7:
                if (!j(t, t2, i) || g1.p(t, R) != g1.p(t2, R)) {
                    return false;
                }
                return true;
            case 8:
                if (!j(t, t2, i) || !z0.K(g1.A(t, R), g1.A(t2, R))) {
                    return false;
                }
                return true;
            case 9:
                if (!j(t, t2, i) || !z0.K(g1.A(t, R), g1.A(t2, R))) {
                    return false;
                }
                return true;
            case 10:
                if (!j(t, t2, i) || !z0.K(g1.A(t, R), g1.A(t2, R))) {
                    return false;
                }
                return true;
            case 11:
                if (!j(t, t2, i) || g1.x(t, R) != g1.x(t2, R)) {
                    return false;
                }
                return true;
            case 12:
                if (!j(t, t2, i) || g1.x(t, R) != g1.x(t2, R)) {
                    return false;
                }
                return true;
            case 13:
                if (!j(t, t2, i) || g1.x(t, R) != g1.x(t2, R)) {
                    return false;
                }
                return true;
            case 14:
                if (!j(t, t2, i) || g1.y(t, R) != g1.y(t2, R)) {
                    return false;
                }
                return true;
            case 15:
                if (!j(t, t2, i) || g1.x(t, R) != g1.x(t2, R)) {
                    return false;
                }
                return true;
            case 16:
                if (!j(t, t2, i) || g1.y(t, R) != g1.y(t2, R)) {
                    return false;
                }
                return true;
            case 17:
                if (!j(t, t2, i) || !z0.K(g1.A(t, R), g1.A(t2, R))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return z0.K(g1.A(t, R), g1.A(t2, R));
            case 50:
                return z0.K(g1.A(t, R), g1.A(t2, R));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!D(t, t2, i) || !z0.K(g1.A(t, R), g1.A(t2, R))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    private <K, V> void m0(j1 j1Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            j1Var.M(i, this.q.b(r(i2)), this.q.e(obj));
        }
    }

    private final <UT, UB> UB n(Object obj, int i, UB ub, d1<UT, UB> d1Var) {
        int Q = Q(i);
        Object A = g1.A(obj, R(i0(i)));
        if (A == null) {
            return ub;
        }
        x.e q = q(i);
        if (q == null) {
            return ub;
        }
        return (UB) o(i, Q, this.q.c(A), q, ub, d1Var);
    }

    private void n0(int i, Object obj, j1 j1Var) throws IOException {
        if (obj instanceof String) {
            j1Var.e(i, (String) obj);
        } else {
            j1Var.K(i, (g) obj);
        }
    }

    private final <K, V, UT, UB> UB o(int i, int i2, Map<K, V> map, x.e eVar, UB ub, d1<UT, UB> d1Var) {
        e0.a<?, ?> b = this.q.b(r(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = d1Var.n();
                }
                g.h Q = g.Q(e0.b(b, next.getKey(), next.getValue()));
                try {
                    e0.e(Q.b(), b, next.getKey(), next.getValue());
                    d1Var.d(ub, i2, Q.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private <UT, UB> void o0(d1<UT, UB> d1Var, T t, j1 j1Var) throws IOException {
        d1Var.t(d1Var.g(t), j1Var);
    }

    private static <T> float p(T t, long j) {
        return g1.w(t, j);
    }

    private x.e q(int i) {
        return (x.e) this.b[((i / 3) * 2) + 1];
    }

    private Object r(int i) {
        return this.b[(i / 3) * 2];
    }

    private x0 s(int i) {
        int i2 = (i / 3) * 2;
        x0 x0Var = (x0) this.b[i2];
        if (x0Var != null) {
            return x0Var;
        }
        x0<T> d = t0.a().d((Class) this.b[i2 + 1]);
        this.b[i2] = d;
        return d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int t(T t) {
        int i;
        int i2;
        int i3;
        int d;
        int L;
        int i4;
        int V;
        int X;
        Unsafe unsafe = s;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < this.a.length) {
            int i0 = i0(i6);
            int Q = Q(i6);
            int h0 = h0(i0);
            if (h0 <= 17) {
                i = this.a[i6 + 2];
                int i9 = 1048575 & i;
                int i10 = 1 << (i >>> 20);
                if (i9 != i5) {
                    i8 = unsafe.getInt(t, i9);
                    i5 = i9;
                }
                i2 = i10;
            } else {
                if (this.i && h0 >= ps3.a5.a() && h0 <= ps3.n5.a()) {
                    i = this.a[i6 + 2] & 1048575;
                } else {
                    i = 0;
                }
                i2 = 0;
            }
            long R = R(i0);
            int i11 = i5;
            switch (h0) {
                case 0:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.i(Q, 0.0d);
                        i7 += i3;
                        break;
                    }
                case 1:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.q(Q, 0.0f);
                        i7 += i3;
                        break;
                    }
                case 2:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.x(Q, unsafe.getLong(t, R));
                        i7 += i3;
                        break;
                    }
                case 3:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.Y(Q, unsafe.getLong(t, R));
                        i7 += i3;
                        break;
                    }
                case 4:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.v(Q, unsafe.getInt(t, R));
                        i7 += i3;
                        break;
                    }
                case 5:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.o(Q, 0L);
                        i7 += i3;
                        break;
                    }
                case 6:
                    if ((i8 & i2) != 0) {
                        i3 = CodedOutputStream.m(Q, 0);
                        i7 += i3;
                        break;
                    }
                    break;
                case 7:
                    if ((i8 & i2) != 0) {
                        d = CodedOutputStream.d(Q, true);
                        i7 += d;
                    }
                    break;
                case 8:
                    if ((i8 & i2) != 0) {
                        Object object = unsafe.getObject(t, R);
                        if (object instanceof g) {
                            d = CodedOutputStream.g(Q, (g) object);
                        } else {
                            d = CodedOutputStream.T(Q, (String) object);
                        }
                        i7 += d;
                    }
                    break;
                case 9:
                    if ((i8 & i2) != 0) {
                        d = z0.o(Q, unsafe.getObject(t, R), s(i6));
                        i7 += d;
                    }
                    break;
                case 10:
                    if ((i8 & i2) != 0) {
                        d = CodedOutputStream.g(Q, (g) unsafe.getObject(t, R));
                        i7 += d;
                    }
                    break;
                case 11:
                    if ((i8 & i2) != 0) {
                        d = CodedOutputStream.W(Q, unsafe.getInt(t, R));
                        i7 += d;
                    }
                    break;
                case 12:
                    if ((i8 & i2) != 0) {
                        d = CodedOutputStream.k(Q, unsafe.getInt(t, R));
                        i7 += d;
                    }
                    break;
                case 13:
                    if ((i8 & i2) != 0) {
                        L = CodedOutputStream.L(Q, 0);
                        i7 += L;
                    }
                    break;
                case 14:
                    if ((i8 & i2) != 0) {
                        d = CodedOutputStream.N(Q, 0L);
                        i7 += d;
                    }
                    break;
                case 15:
                    if ((i8 & i2) != 0) {
                        d = CodedOutputStream.P(Q, unsafe.getInt(t, R));
                        i7 += d;
                    }
                    break;
                case 16:
                    if ((i8 & i2) != 0) {
                        d = CodedOutputStream.R(Q, unsafe.getLong(t, R));
                        i7 += d;
                    }
                    break;
                case 17:
                    if ((i8 & i2) != 0) {
                        d = CodedOutputStream.s(Q, (l0) unsafe.getObject(t, R), s(i6));
                        i7 += d;
                    }
                    break;
                case 18:
                    d = z0.h(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 19:
                    d = z0.f(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 20:
                    d = z0.m(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 21:
                    d = z0.x(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 22:
                    d = z0.k(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 23:
                    d = z0.h(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 24:
                    d = z0.f(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 25:
                    d = z0.a(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 26:
                    d = z0.u(Q, (List) unsafe.getObject(t, R));
                    i7 += d;
                    break;
                case 27:
                    d = z0.p(Q, (List) unsafe.getObject(t, R), s(i6));
                    i7 += d;
                    break;
                case 28:
                    d = z0.c(Q, (List) unsafe.getObject(t, R));
                    i7 += d;
                    break;
                case 29:
                    d = z0.v(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 30:
                    d = z0.d(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 31:
                    d = z0.f(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 32:
                    d = z0.h(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 33:
                    d = z0.q(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 34:
                    d = z0.s(Q, (List) unsafe.getObject(t, R), false);
                    i7 += d;
                    break;
                case 35:
                    i4 = z0.i((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 36:
                    i4 = z0.g((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 37:
                    i4 = z0.n((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 38:
                    i4 = z0.y((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 39:
                    i4 = z0.l((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 40:
                    i4 = z0.i((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 41:
                    i4 = z0.g((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 42:
                    i4 = z0.b((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 43:
                    i4 = z0.w((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 44:
                    i4 = z0.e((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 45:
                    i4 = z0.g((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 46:
                    i4 = z0.i((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 47:
                    i4 = z0.r((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 48:
                    i4 = z0.t((List) unsafe.getObject(t, R));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i4);
                        L = V + X + i4;
                        i7 += L;
                    }
                    break;
                case 49:
                    d = z0.j(Q, (List) unsafe.getObject(t, R), s(i6));
                    i7 += d;
                    break;
                case 50:
                    d = this.q.g(Q, unsafe.getObject(t, R), r(i6));
                    i7 += d;
                    break;
                case 51:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.i(Q, 0.0d);
                        i7 += d;
                    }
                    break;
                case 52:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.q(Q, 0.0f);
                        i7 += d;
                    }
                    break;
                case 53:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.x(Q, W(t, R));
                        i7 += d;
                    }
                    break;
                case 54:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.Y(Q, W(t, R));
                        i7 += d;
                    }
                    break;
                case 55:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.v(Q, V(t, R));
                        i7 += d;
                    }
                    break;
                case 56:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.o(Q, 0L);
                        i7 += d;
                    }
                    break;
                case 57:
                    if (E(t, Q, i6)) {
                        L = CodedOutputStream.m(Q, 0);
                        i7 += L;
                    }
                    break;
                case 58:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.d(Q, true);
                        i7 += d;
                    }
                    break;
                case 59:
                    if (E(t, Q, i6)) {
                        Object object2 = unsafe.getObject(t, R);
                        if (object2 instanceof g) {
                            d = CodedOutputStream.g(Q, (g) object2);
                        } else {
                            d = CodedOutputStream.T(Q, (String) object2);
                        }
                        i7 += d;
                    }
                    break;
                case 60:
                    if (E(t, Q, i6)) {
                        d = z0.o(Q, unsafe.getObject(t, R), s(i6));
                        i7 += d;
                    }
                    break;
                case 61:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.g(Q, (g) unsafe.getObject(t, R));
                        i7 += d;
                    }
                    break;
                case 62:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.W(Q, V(t, R));
                        i7 += d;
                    }
                    break;
                case 63:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.k(Q, V(t, R));
                        i7 += d;
                    }
                    break;
                case 64:
                    if (E(t, Q, i6)) {
                        L = CodedOutputStream.L(Q, 0);
                        i7 += L;
                    }
                    break;
                case 65:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.N(Q, 0L);
                        i7 += d;
                    }
                    break;
                case 66:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.P(Q, V(t, R));
                        i7 += d;
                    }
                    break;
                case 67:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.R(Q, W(t, R));
                        i7 += d;
                    }
                    break;
                case 68:
                    if (E(t, Q, i6)) {
                        d = CodedOutputStream.s(Q, (l0) unsafe.getObject(t, R), s(i6));
                        i7 += d;
                    }
                    break;
            }
            i6 += 3;
            i5 = i11;
        }
        int v = i7 + v(this.o, t);
        if (this.f) {
            return v + this.p.c(t).l();
        }
        return v;
    }

    private int u(T t) {
        int i;
        int i2;
        int i3;
        int V;
        int X;
        Unsafe unsafe = s;
        int i4 = 0;
        for (int i5 = 0; i5 < this.a.length; i5 += 3) {
            int i0 = i0(i5);
            int h0 = h0(i0);
            int Q = Q(i5);
            long R = R(i0);
            if (h0 >= ps3.a5.a() && h0 <= ps3.n5.a()) {
                i = this.a[i5 + 2] & 1048575;
            } else {
                i = 0;
            }
            switch (h0) {
                case 0:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.i(Q, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.q(Q, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.x(Q, g1.y(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.Y(Q, g1.y(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.v(Q, g1.x(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.o(Q, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.m(Q, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.d(Q, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (y(t, i5)) {
                        Object A = g1.A(t, R);
                        if (A instanceof g) {
                            i2 = CodedOutputStream.g(Q, (g) A);
                            break;
                        } else {
                            i2 = CodedOutputStream.T(Q, (String) A);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (y(t, i5)) {
                        i2 = z0.o(Q, g1.A(t, R), s(i5));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.g(Q, (g) g1.A(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.W(Q, g1.x(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.k(Q, g1.x(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.L(Q, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.N(Q, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.P(Q, g1.x(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.R(Q, g1.y(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (y(t, i5)) {
                        i2 = CodedOutputStream.s(Q, (l0) g1.A(t, R), s(i5));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i2 = z0.h(Q, G(t, R), false);
                    break;
                case 19:
                    i2 = z0.f(Q, G(t, R), false);
                    break;
                case 20:
                    i2 = z0.m(Q, G(t, R), false);
                    break;
                case 21:
                    i2 = z0.x(Q, G(t, R), false);
                    break;
                case 22:
                    i2 = z0.k(Q, G(t, R), false);
                    break;
                case 23:
                    i2 = z0.h(Q, G(t, R), false);
                    break;
                case 24:
                    i2 = z0.f(Q, G(t, R), false);
                    break;
                case 25:
                    i2 = z0.a(Q, G(t, R), false);
                    break;
                case 26:
                    i2 = z0.u(Q, G(t, R));
                    break;
                case 27:
                    i2 = z0.p(Q, G(t, R), s(i5));
                    break;
                case 28:
                    i2 = z0.c(Q, G(t, R));
                    break;
                case 29:
                    i2 = z0.v(Q, G(t, R), false);
                    break;
                case 30:
                    i2 = z0.d(Q, G(t, R), false);
                    break;
                case 31:
                    i2 = z0.f(Q, G(t, R), false);
                    break;
                case 32:
                    i2 = z0.h(Q, G(t, R), false);
                    break;
                case 33:
                    i2 = z0.q(Q, G(t, R), false);
                    break;
                case 34:
                    i2 = z0.s(Q, G(t, R), false);
                    break;
                case 35:
                    i3 = z0.i((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    i3 = z0.g((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    i3 = z0.n((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    i3 = z0.y((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    i3 = z0.l((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    i3 = z0.i((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    i3 = z0.g((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    i3 = z0.b((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    i3 = z0.w((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    i3 = z0.e((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    i3 = z0.g((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    i3 = z0.i((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    i3 = z0.r((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    i3 = z0.t((List) unsafe.getObject(t, R));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        V = CodedOutputStream.V(Q);
                        X = CodedOutputStream.X(i3);
                        i2 = V + X + i3;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    i2 = z0.j(Q, G(t, R), s(i5));
                    break;
                case 50:
                    i2 = this.q.g(Q, g1.A(t, R), r(i5));
                    break;
                case 51:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.i(Q, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.q(Q, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.x(Q, W(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.Y(Q, W(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.v(Q, V(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.o(Q, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.m(Q, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.d(Q, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (E(t, Q, i5)) {
                        Object A2 = g1.A(t, R);
                        if (A2 instanceof g) {
                            i2 = CodedOutputStream.g(Q, (g) A2);
                            break;
                        } else {
                            i2 = CodedOutputStream.T(Q, (String) A2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (E(t, Q, i5)) {
                        i2 = z0.o(Q, g1.A(t, R), s(i5));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.g(Q, (g) g1.A(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.W(Q, V(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.k(Q, V(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.L(Q, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.N(Q, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.P(Q, V(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.R(Q, W(t, R));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (E(t, Q, i5)) {
                        i2 = CodedOutputStream.s(Q, (l0) g1.A(t, R), s(i5));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i4 += i2;
        }
        return i4 + v(this.o, t);
    }

    private <UT, UB> int v(d1<UT, UB> d1Var, T t) {
        return d1Var.h(d1Var.g(t));
    }

    private static <T> int w(T t, long j) {
        return g1.x(t, j);
    }

    private static boolean x(int i) {
        if ((i & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private boolean y(T t, int i) {
        if (this.h) {
            int i0 = i0(i);
            long R = R(i0);
            switch (h0(i0)) {
                case 0:
                    if (g1.v(t, R) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (g1.w(t, R) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (g1.y(t, R) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (g1.y(t, R) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (g1.x(t, R) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (g1.y(t, R) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (g1.x(t, R) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return g1.p(t, R);
                case 8:
                    Object A = g1.A(t, R);
                    if (A instanceof String) {
                        return !((String) A).isEmpty();
                    }
                    if (A instanceof g) {
                        return !g.b.equals(A);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (g1.A(t, R) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !g.b.equals(g1.A(t, R));
                case 11:
                    if (g1.x(t, R) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (g1.x(t, R) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (g1.x(t, R) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (g1.y(t, R) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (g1.x(t, R) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (g1.y(t, R) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (g1.A(t, R) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int Y = Y(i);
        if ((g1.x(t, Y & 1048575) & (1 << (Y >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private boolean z(T t, int i, int i2, int i3) {
        if (this.h) {
            return y(t, i);
        }
        if ((i2 & i3) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public void a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            M(t, t2, i);
        }
        if (!this.h) {
            z0.G(this.o, t, t2);
            if (this.f) {
                z0.E(this.p, t, t2);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public void b(T t) {
        int i;
        int i2 = this.k;
        while (true) {
            i = this.l;
            if (i2 >= i) {
                break;
            }
            long R = R(i0(this.j[i2]));
            Object A = g1.A(t, R);
            if (A != null) {
                g1.O(t, R, this.q.f(A));
            }
            i2++;
        }
        int length = this.j.length;
        while (i < length) {
            this.n.c(t, this.j[i]);
            i++;
        }
        this.o.j(t);
        if (this.f) {
            this.p.f(t);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean c(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.k; i4++) {
            int i5 = this.j[i4];
            int Q = Q(i5);
            int i0 = i0(i5);
            if (!this.h) {
                int i6 = this.a[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = s.getInt(t, i7);
                    i2 = i7;
                }
            } else {
                i = 0;
            }
            if (F(i0) && !z(t, i5, i3, i)) {
                return false;
            }
            int h0 = h0(i0);
            if (h0 != 9 && h0 != 17) {
                if (h0 != 27) {
                    if (h0 != 60 && h0 != 68) {
                        if (h0 != 49) {
                            if (h0 == 50 && !C(t, i0, i5)) {
                                return false;
                            }
                        }
                    } else if (E(t, Q, i5) && !A(t, i0, s(i5))) {
                        return false;
                    }
                }
                if (!B(t, i0, i5)) {
                    return false;
                }
            } else if (z(t, i5, i3, i) && !A(t, i0, s(i5))) {
                return false;
            }
        }
        if (this.f && !this.p.c(t).p()) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public int d(T t) {
        if (this.h) {
            return u(t);
        }
        return t(t);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public T e() {
        return (T) this.m.a(this.e);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public int f(T t) {
        int i;
        int f;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i0 = i0(i3);
            int Q = Q(i3);
            long R = R(i0);
            int i4 = 37;
            switch (h0(i0)) {
                case 0:
                    i = i2 * 53;
                    f = x.f(Double.doubleToLongBits(g1.v(t, R)));
                    i2 = i + f;
                    break;
                case 1:
                    i = i2 * 53;
                    f = Float.floatToIntBits(g1.w(t, R));
                    i2 = i + f;
                    break;
                case 2:
                    i = i2 * 53;
                    f = x.f(g1.y(t, R));
                    i2 = i + f;
                    break;
                case 3:
                    i = i2 * 53;
                    f = x.f(g1.y(t, R));
                    i2 = i + f;
                    break;
                case 4:
                    i = i2 * 53;
                    f = g1.x(t, R);
                    i2 = i + f;
                    break;
                case 5:
                    i = i2 * 53;
                    f = x.f(g1.y(t, R));
                    i2 = i + f;
                    break;
                case 6:
                    i = i2 * 53;
                    f = g1.x(t, R);
                    i2 = i + f;
                    break;
                case 7:
                    i = i2 * 53;
                    f = x.c(g1.p(t, R));
                    i2 = i + f;
                    break;
                case 8:
                    i = i2 * 53;
                    f = ((String) g1.A(t, R)).hashCode();
                    i2 = i + f;
                    break;
                case 9:
                    Object A = g1.A(t, R);
                    if (A != null) {
                        i4 = A.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    f = g1.A(t, R).hashCode();
                    i2 = i + f;
                    break;
                case 11:
                    i = i2 * 53;
                    f = g1.x(t, R);
                    i2 = i + f;
                    break;
                case 12:
                    i = i2 * 53;
                    f = g1.x(t, R);
                    i2 = i + f;
                    break;
                case 13:
                    i = i2 * 53;
                    f = g1.x(t, R);
                    i2 = i + f;
                    break;
                case 14:
                    i = i2 * 53;
                    f = x.f(g1.y(t, R));
                    i2 = i + f;
                    break;
                case 15:
                    i = i2 * 53;
                    f = g1.x(t, R);
                    i2 = i + f;
                    break;
                case 16:
                    i = i2 * 53;
                    f = x.f(g1.y(t, R));
                    i2 = i + f;
                    break;
                case 17:
                    Object A2 = g1.A(t, R);
                    if (A2 != null) {
                        i4 = A2.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    f = g1.A(t, R).hashCode();
                    i2 = i + f;
                    break;
                case 50:
                    i = i2 * 53;
                    f = g1.A(t, R).hashCode();
                    i2 = i + f;
                    break;
                case 51:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = x.f(Double.doubleToLongBits(T(t, R)));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = Float.floatToIntBits(U(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = x.f(W(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = x.f(W(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = V(t, R);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = x.f(W(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = V(t, R);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = x.c(S(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = ((String) g1.A(t, R)).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = g1.A(t, R).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = g1.A(t, R).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = V(t, R);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = V(t, R);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = V(t, R);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = x.f(W(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = V(t, R);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = x.f(W(t, R));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (E(t, Q, i3)) {
                        i = i2 * 53;
                        f = g1.A(t, R).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.o.g(t).hashCode();
        if (this.f) {
            return (hashCode * 53) + this.p.c(t).hashCode();
        }
        return hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public boolean g(T t, T t2) {
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m(t, t2, i)) {
                return false;
            }
        }
        if (!this.o.g(t).equals(this.o.g(t2))) {
            return false;
        }
        if (this.f) {
            return this.p.c(t).equals(this.p.c(t2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public void h(T t, w0 w0Var, n nVar) throws IOException {
        nVar.getClass();
        I(this.o, this.p, t, w0Var, nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public void i(T t, j1 j1Var) throws IOException {
        if (j1Var.t() == j1.a.DESCENDING) {
            l0(t, j1Var);
        } else if (this.h) {
            k0(t, j1Var);
        } else {
            j0(t, j1Var);
        }
    }
}
