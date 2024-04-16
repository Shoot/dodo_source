package com.google.protobuf;

import com.google.protobuf.r;
import com.google.protobuf.w;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: SchemaUtil.java */
/* loaded from: classes.dex */
final class y0 {
    private static final Class<?> a = B();
    private static final c1<?, ?> b = C(false);
    private static final c1<?, ?> c = C(true);
    private static final c1<?, ?> d = new e1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB A(Object obj, int i, List<Integer> list, w.e eVar, UB ub, c1<UT, UB> c1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) L(obj, i, intValue, ub, c1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub = (UB) L(obj, i, intValue2, ub, c1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static c1<?, ?> C(boolean z) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (c1) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends r.b<FT>> void E(n<FT> nVar, T t, T t2) {
        r<FT> c2 = nVar.c(t2);
        if (!c2.n()) {
            nVar.d(t).v(c2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void F(f0 f0Var, T t, T t2, long j) {
        f1.R(t, j, f0Var.a(f1.C(t, j), f1.C(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void G(c1<UT, UB> c1Var, T t, T t2) {
        c1Var.p(t, c1Var.k(c1Var.g(t), c1Var.g(t2)));
    }

    public static c1<?, ?> H() {
        return b;
    }

    public static c1<?, ?> I() {
        return c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!u.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean K(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB L(Object obj, int i, int i2, UB ub, c1<UT, UB> c1Var) {
        if (ub == null) {
            ub = c1Var.f(obj);
        }
        c1Var.e(ub, i, i2);
        return ub;
    }

    public static c1<?, ?> M() {
        return d;
    }

    public static void N(int i, List<Boolean> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.A(i, list, z);
        }
    }

    public static void O(int i, List<f> list, i1 i1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.I(i, list);
        }
    }

    public static void P(int i, List<Double> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.G(i, list, z);
        }
    }

    public static void Q(int i, List<Integer> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.n(i, list, z);
        }
    }

    public static void R(int i, List<Integer> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.j(i, list, z);
        }
    }

    public static void S(int i, List<Long> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.y(i, list, z);
        }
    }

    public static void T(int i, List<Float> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.a(i, list, z);
        }
    }

    public static void U(int i, List<?> list, i1 i1Var, w0 w0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.M(i, list, w0Var);
        }
    }

    public static void V(int i, List<Integer> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.g(i, list, z);
        }
    }

    public static void W(int i, List<Long> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.F(i, list, z);
        }
    }

    public static void X(int i, List<?> list, i1 i1Var, w0 w0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.J(i, list, w0Var);
        }
    }

    public static void Y(int i, List<Integer> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.z(i, list, z);
        }
    }

    public static void Z(int i, List<Long> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.q(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.T(i) + CodedOutputStream.C(size);
        }
        return size * CodedOutputStream.d(i, true);
    }

    public static void a0(int i, List<Integer> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.D(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i, List<Long> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.l(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, List<f> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int T = size * CodedOutputStream.T(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            T += CodedOutputStream.h(list.get(i2));
        }
        return T;
    }

    public static void c0(int i, List<String> list, i1 i1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.d(i, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = e(list);
        if (z) {
            return CodedOutputStream.T(i) + CodedOutputStream.C(e);
        }
        return e + (size * CodedOutputStream.T(i));
    }

    public static void d0(int i, List<Integer> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.k(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v) {
            v vVar = (v) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.l(vVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void e0(int i, List<Long> list, i1 i1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            i1Var.r(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.T(i) + CodedOutputStream.C(size * 4);
        }
        return size * CodedOutputStream.m(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.T(i) + CodedOutputStream.C(size * 8);
        }
        return size * CodedOutputStream.o(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i, List<k0> list, w0 w0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.s(i, list.get(i3), w0Var);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = l(list);
        if (z) {
            return CodedOutputStream.T(i) + CodedOutputStream.C(l);
        }
        return l + (size * CodedOutputStream.T(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v) {
            v vVar = (v) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.w(vVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.w(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = n(list);
        if (z) {
            return CodedOutputStream.T(i) + CodedOutputStream.C(n);
        }
        return n + (list.size() * CodedOutputStream.T(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.y(b0Var.t(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i, Object obj, w0 w0Var) {
        if (obj instanceof y) {
            return CodedOutputStream.A(i, (y) obj);
        }
        return CodedOutputStream.F(i, (k0) obj, w0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i, List<?> list, w0 w0Var) {
        int H;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int T = CodedOutputStream.T(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof y) {
                H = CodedOutputStream.B((y) obj);
            } else {
                H = CodedOutputStream.H((k0) obj, w0Var);
            }
            T += H;
        }
        return T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = r(list);
        if (z) {
            return CodedOutputStream.T(i) + CodedOutputStream.C(r);
        }
        return r + (size * CodedOutputStream.T(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v) {
            v vVar = (v) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.O(vVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.O(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = t(list);
        if (z) {
            return CodedOutputStream.T(i) + CodedOutputStream.C(t);
        }
        return t + (size * CodedOutputStream.T(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.Q(b0Var.t(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.Q(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i, List<?> list) {
        int S;
        int S2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int T = CodedOutputStream.T(i) * size;
        if (list instanceof do5) {
            do5 do5Var = (do5) list;
            while (i2 < size) {
                Object s = do5Var.s(i2);
                if (s instanceof f) {
                    S2 = CodedOutputStream.h((f) s);
                } else {
                    S2 = CodedOutputStream.S((String) s);
                }
                T += S2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof f) {
                    S = CodedOutputStream.h((f) obj);
                } else {
                    S = CodedOutputStream.S((String) obj);
                }
                T += S;
                i2++;
            }
        }
        return T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = w(list);
        if (z) {
            return CodedOutputStream.T(i) + CodedOutputStream.C(w);
        }
        return w + (size * CodedOutputStream.T(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v) {
            v vVar = (v) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.V(vVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.V(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = y(list);
        if (z) {
            return CodedOutputStream.T(i) + CodedOutputStream.C(y);
        }
        return y + (size * CodedOutputStream.T(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.X(b0Var.t(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.X(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB z(Object obj, int i, List<Integer> list, w.d<?> dVar, UB ub, c1<UT, UB> c1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) L(obj, i, intValue, ub, c1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub = (UB) L(obj, i, intValue2, ub, c1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
