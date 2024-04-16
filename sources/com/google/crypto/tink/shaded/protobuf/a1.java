package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.t;
import com.google.crypto.tink.shaded.protobuf.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SchemaUtil.java */
/* loaded from: classes2.dex */
public final class a1 {
    private static final Class<?> a = B();
    private static final e1<?, ?> b = C(false);
    private static final e1<?, ?> c = C(true);
    private static final e1<?, ?> d = new g1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB A(int i, List<Integer> list, y.e eVar, UB ub, e1<UT, UB> e1Var) {
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
                    ub = (UB) L(i, intValue, ub, e1Var);
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
                    ub = (UB) L(i, intValue2, ub, e1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static e1<?, ?> C(boolean z) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (e1) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends t.b<FT>> void E(p<FT> pVar, T t, T t2) {
        t<FT> c2 = pVar.c(t2);
        if (!c2.m()) {
            pVar.d(t).t(c2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void F(h0 h0Var, T t, T t2, long j) {
        h1.R(t, j, h0Var.a(h1.C(t, j), h1.C(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void G(e1<UT, UB> e1Var, T t, T t2) {
        e1Var.p(t, e1Var.k(e1Var.g(t), e1Var.g(t2)));
    }

    public static e1<?, ?> H() {
        return b;
    }

    public static e1<?, ?> I() {
        return c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!w.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
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
    public static <UT, UB> UB L(int i, int i2, UB ub, e1<UT, UB> e1Var) {
        if (ub == null) {
            ub = e1Var.n();
        }
        e1Var.e(ub, i, i2);
        return ub;
    }

    public static e1<?, ?> M() {
        return d;
    }

    public static void N(int i, List<Boolean> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.A(i, list, z);
        }
    }

    public static void O(int i, List<h> list, k1 k1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.I(i, list);
        }
    }

    public static void P(int i, List<Double> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.G(i, list, z);
        }
    }

    public static void Q(int i, List<Integer> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.n(i, list, z);
        }
    }

    public static void R(int i, List<Integer> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.j(i, list, z);
        }
    }

    public static void S(int i, List<Long> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.y(i, list, z);
        }
    }

    public static void T(int i, List<Float> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.a(i, list, z);
        }
    }

    public static void U(int i, List<?> list, k1 k1Var, y0 y0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.O(i, list, y0Var);
        }
    }

    public static void V(int i, List<Integer> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.g(i, list, z);
        }
    }

    public static void W(int i, List<Long> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.F(i, list, z);
        }
    }

    public static void X(int i, List<?> list, k1 k1Var, y0 y0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.L(i, list, y0Var);
        }
    }

    public static void Y(int i, List<Integer> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.z(i, list, z);
        }
    }

    public static void Z(int i, List<Long> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.q(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.U(i) + CodedOutputStream.C(size);
        }
        return size * CodedOutputStream.d(i, true);
    }

    public static void a0(int i, List<Integer> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.D(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i, List<Long> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.l(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, List<h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * CodedOutputStream.U(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            U += CodedOutputStream.h(list.get(i2));
        }
        return U;
    }

    public static void c0(int i, List<String> list, k1 k1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.d(i, list);
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
            return CodedOutputStream.U(i) + CodedOutputStream.C(e);
        }
        return e + (size * CodedOutputStream.U(i));
    }

    public static void d0(int i, List<Integer> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.k(i, list, z);
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
        if (list instanceof x) {
            x xVar = (x) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.l(xVar.getInt(i2));
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

    public static void e0(int i, List<Long> list, k1 k1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k1Var.r(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.U(i) + CodedOutputStream.C(size * 4);
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
            return CodedOutputStream.U(i) + CodedOutputStream.C(size * 8);
        }
        return size * CodedOutputStream.o(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i, List<m0> list, y0 y0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.s(i, list.get(i3), y0Var);
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
            return CodedOutputStream.U(i) + CodedOutputStream.C(l);
        }
        return l + (size * CodedOutputStream.U(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.w(xVar.getInt(i2));
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
            return CodedOutputStream.U(i) + CodedOutputStream.C(n);
        }
        return n + (list.size() * CodedOutputStream.U(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.y(d0Var.t(i2));
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
    public static int o(int i, Object obj, y0 y0Var) {
        if (obj instanceof a0) {
            return CodedOutputStream.A(i, (a0) obj);
        }
        return CodedOutputStream.F(i, (m0) obj, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i, List<?> list, y0 y0Var) {
        int H;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = CodedOutputStream.U(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof a0) {
                H = CodedOutputStream.B((a0) obj);
            } else {
                H = CodedOutputStream.H((m0) obj, y0Var);
            }
            U += H;
        }
        return U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = r(list);
        if (z) {
            return CodedOutputStream.U(i) + CodedOutputStream.C(r);
        }
        return r + (size * CodedOutputStream.U(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.P(xVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.P(list.get(i2).intValue());
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
            return CodedOutputStream.U(i) + CodedOutputStream.C(t);
        }
        return t + (size * CodedOutputStream.U(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.R(d0Var.t(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.R(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i, List<?> list) {
        int T;
        int T2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int U = CodedOutputStream.U(i) * size;
        if (list instanceof co5) {
            co5 co5Var = (co5) list;
            while (i2 < size) {
                Object s = co5Var.s(i2);
                if (s instanceof h) {
                    T2 = CodedOutputStream.h((h) s);
                } else {
                    T2 = CodedOutputStream.T((String) s);
                }
                U += T2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof h) {
                    T = CodedOutputStream.h((h) obj);
                } else {
                    T = CodedOutputStream.T((String) obj);
                }
                U += T;
                i2++;
            }
        }
        return U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = w(list);
        if (z) {
            return CodedOutputStream.U(i) + CodedOutputStream.C(w);
        }
        return w + (size * CodedOutputStream.U(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.W(xVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.W(list.get(i2).intValue());
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
            return CodedOutputStream.U(i) + CodedOutputStream.C(y);
        }
        return y + (size * CodedOutputStream.U(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.Y(d0Var.t(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.Y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB z(int i, List<Integer> list, y.d<?> dVar, UB ub, e1<UT, UB> e1Var) {
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
                    ub = (UB) L(i, intValue, ub, e1Var);
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
                    ub = (UB) L(i, intValue2, ub, e1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
