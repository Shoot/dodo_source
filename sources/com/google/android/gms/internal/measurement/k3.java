package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class k3 {
    private static final Class<?> a = E();
    private static final b4<?, ?> b = A();
    private static final b4<?, ?> c = new c4();

    private static b4<?, ?> A() {
        try {
            Class<?> I = I();
            if (I == null) {
                return null;
            }
            return (b4) I.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void B(int i, List<Integer> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.r(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzio.T(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D(List<?> list) {
        return list.size() << 3;
    }

    private static Class<?> E() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void F(int i, List<Integer> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.P(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * zzio.w0(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e2) {
            e2 e2Var = (e2) list;
            i = 0;
            while (i2 < size) {
                i += zzio.k0(e2Var.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzio.k0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> I() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void J(int i, List<Long> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.N(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return L(list) + (list.size() * zzio.w0(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n2) {
            n2 n2Var = (n2) list;
            i = 0;
            while (i2 < size) {
                i += zzio.e0(n2Var.j(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzio.e0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void M(int i, List<Float> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.U(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return O(list) + (size * zzio.w0(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e2) {
            e2 e2Var = (e2) list;
            i = 0;
            while (i2 < size) {
                i += zzio.s0(e2Var.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzio.s0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void P(int i, List<Integer> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.R(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Q(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return R(list) + (size * zzio.w0(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int R(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n2) {
            n2 n2Var = (n2) list;
            i = 0;
            while (i2 < size) {
                i += zzio.n0(n2Var.j(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzio.n0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void S(int i, List<Long> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.I(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int T(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return U(list) + (size * zzio.w0(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int U(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e2) {
            e2 e2Var = (e2) list;
            i = 0;
            while (i2 < size) {
                i += zzio.z0(e2Var.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzio.z0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void V(int i, List<Integer> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.H(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int W(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return X(list) + (size * zzio.w0(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int X(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n2) {
            n2 n2Var = (n2) list;
            i = 0;
            while (i2 < size) {
                i += zzio.r0(n2Var.j(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzio.r0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void Y(int i, List<Long> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.L(i, list, z);
        }
    }

    public static void Z(int i, List<Integer> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.M(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, Object obj, j3 j3Var) {
        if (obj instanceof g2) {
            return zzio.z(i, (g2) obj);
        }
        return zzio.V(i, (h3d) obj, j3Var);
    }

    public static void a0(int i, List<Long> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.J(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<d1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w0 = size * zzio.w0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            w0 += zzio.E(list.get(i2));
        }
        return w0;
    }

    public static void b0(int i, List<Integer> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.A(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, List<h3d> list, j3 j3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzio.C(i, list.get(i3), j3Var);
        }
        return i2;
    }

    public static void c0(int i, List<Long> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.z(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzio.D(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<?> list) {
        return list.size();
    }

    public static b4<?, ?> f() {
        return b;
    }

    static <UT, UB> UB g(Object obj, int i, int i2, UB ub, b4<UT, UB> b4Var) {
        if (ub == null) {
            ub = b4Var.i(obj);
        }
        b4Var.f(ub, i, i2);
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB h(Object obj, int i, List<Integer> list, n2d n2dVar, UB ub, b4<UT, UB> b4Var) {
        if (n2dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (n2dVar.e(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) g(obj, i, intValue, ub, b4Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!n2dVar.e(intValue2)) {
                    ub = (UB) g(obj, i, intValue2, ub, b4Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void i(int i, List<d1> list, k4 k4Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.G(i, list);
        }
    }

    public static void j(int i, List<?> list, k4 k4Var, j3 j3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.T(i, list, j3Var);
        }
    }

    public static void k(int i, List<Boolean> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.n(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends h2d<FT>> void l(t1<FT> t1Var, T t, T t2) {
        x1<FT> b2 = t1Var.b(t2);
        if (!b2.a.isEmpty()) {
            t1Var.f(t).h(b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void m(v2 v2Var, T t, T t2, long j) {
        e4.j(t, j, v2Var.e(e4.B(t, j), e4.B(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void n(b4<UT, UB> b4Var, T t, T t2) {
        b4Var.j(t, b4Var.b(b4Var.k(t), b4Var.k(t2)));
    }

    public static void o(Class<?> cls) {
        Class<?> cls2;
        if (!b2.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i, List<?> list) {
        int F;
        int F2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int w0 = zzio.w0(i) * size;
        if (list instanceof t2d) {
            t2d t2dVar = (t2d) list;
            while (i2 < size) {
                Object j = t2dVar.j(i2);
                if (j instanceof d1) {
                    F2 = zzio.E((d1) j);
                } else {
                    F2 = zzio.F((String) j);
                }
                w0 += F2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof d1) {
                    F = zzio.E((d1) obj);
                } else {
                    F = zzio.F((String) obj);
                }
                w0 += F;
                i2++;
            }
        }
        return w0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(int i, List<?> list, j3 j3Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w0 = zzio.w0(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof g2) {
                i2 = zzio.h((g2) obj);
            } else {
                i2 = zzio.i((h3d) obj, j3Var);
            }
            w0 += i2;
        }
        return w0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * zzio.w0(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e2) {
            e2 e2Var = (e2) list;
            i = 0;
            while (i2 < size) {
                i += zzio.b0(e2Var.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzio.b0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static b4<?, ?> u() {
        return c;
    }

    public static void v(int i, List<String> list, k4 k4Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.B(i, list);
        }
    }

    public static void w(int i, List<?> list, k4 k4Var, j3 j3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.Q(i, list, j3Var);
        }
    }

    public static void x(int i, List<Double> list, k4 k4Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k4Var.s(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzio.l0(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(List<?> list) {
        return list.size() << 2;
    }
}
