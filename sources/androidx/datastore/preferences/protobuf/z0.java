package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: SchemaUtil.java */
/* loaded from: classes.dex */
final class z0 {
    private static final Class<?> a = B();
    private static final d1<?, ?> b = C(false);
    private static final d1<?, ?> c = C(true);
    private static final d1<?, ?> d = new f1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB A(int i, List<Integer> list, x.e eVar, UB ub, d1<UT, UB> d1Var) {
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
                    ub = (UB) L(i, intValue, ub, d1Var);
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
                    ub = (UB) L(i, intValue2, ub, d1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static d1<?, ?> C(boolean z) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (d1) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends s.b<FT>> void E(o<FT> oVar, T t, T t2) {
        s<FT> c2 = oVar.c(t2);
        if (!c2.n()) {
            oVar.d(t).u(c2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void F(g0 g0Var, T t, T t2, long j) {
        g1.O(t, j, g0Var.a(g1.A(t, j), g1.A(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void G(d1<UT, UB> d1Var, T t, T t2) {
        d1Var.p(t, d1Var.k(d1Var.g(t), d1Var.g(t2)));
    }

    public static d1<?, ?> H() {
        return b;
    }

    public static d1<?, ?> I() {
        return c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!v.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
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
    public static <UT, UB> UB L(int i, int i2, UB ub, d1<UT, UB> d1Var) {
        if (ub == null) {
            ub = d1Var.n();
        }
        d1Var.e(ub, i, i2);
        return ub;
    }

    public static d1<?, ?> M() {
        return d;
    }

    public static void N(int i, List<Boolean> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.A(i, list, z);
        }
    }

    public static void O(int i, List<g> list, j1 j1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.I(i, list);
        }
    }

    public static void P(int i, List<Double> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.G(i, list, z);
        }
    }

    public static void Q(int i, List<Integer> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.n(i, list, z);
        }
    }

    public static void R(int i, List<Integer> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.j(i, list, z);
        }
    }

    public static void S(int i, List<Long> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.y(i, list, z);
        }
    }

    public static void T(int i, List<Float> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.a(i, list, z);
        }
    }

    public static void U(int i, List<?> list, j1 j1Var, x0 x0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.J(i, list, x0Var);
        }
    }

    public static void V(int i, List<Integer> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.g(i, list, z);
        }
    }

    public static void W(int i, List<Long> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.F(i, list, z);
        }
    }

    public static void X(int i, List<?> list, j1 j1Var, x0 x0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.O(i, list, x0Var);
        }
    }

    public static void Y(int i, List<Integer> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.z(i, list, z);
        }
    }

    public static void Z(int i, List<Long> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.q(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.V(i) + CodedOutputStream.C(size);
        }
        return size * CodedOutputStream.d(i, true);
    }

    public static void a0(int i, List<Integer> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.D(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i, List<Long> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.l(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, List<g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = size * CodedOutputStream.V(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            V += CodedOutputStream.h(list.get(i2));
        }
        return V;
    }

    public static void c0(int i, List<String> list, j1 j1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.d(i, list);
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
            return CodedOutputStream.V(i) + CodedOutputStream.C(e);
        }
        return e + (size * CodedOutputStream.V(i));
    }

    public static void d0(int i, List<Integer> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.k(i, list, z);
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
        if (list instanceof w) {
            w wVar = (w) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.l(wVar.getInt(i2));
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

    public static void e0(int i, List<Long> list, j1 j1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            j1Var.r(i, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.V(i) + CodedOutputStream.C(size * 4);
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
            return CodedOutputStream.V(i) + CodedOutputStream.C(size * 8);
        }
        return size * CodedOutputStream.o(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i, List<l0> list, x0 x0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.s(i, list.get(i3), x0Var);
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
            return CodedOutputStream.V(i) + CodedOutputStream.C(l);
        }
        return l + (size * CodedOutputStream.V(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            w wVar = (w) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.w(wVar.getInt(i2));
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
            return CodedOutputStream.V(i) + CodedOutputStream.C(n);
        }
        return n + (list.size() * CodedOutputStream.V(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.y(c0Var.t(i2));
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
    public static int o(int i, Object obj, x0 x0Var) {
        if (obj instanceof z) {
            return CodedOutputStream.A(i, (z) obj);
        }
        return CodedOutputStream.F(i, (l0) obj, x0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i, List<?> list, x0 x0Var) {
        int H;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.V(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof z) {
                H = CodedOutputStream.B((z) obj);
            } else {
                H = CodedOutputStream.H((l0) obj, x0Var);
            }
            V += H;
        }
        return V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = r(list);
        if (z) {
            return CodedOutputStream.V(i) + CodedOutputStream.C(r);
        }
        return r + (size * CodedOutputStream.V(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            w wVar = (w) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.Q(wVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.Q(list.get(i2).intValue());
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
            return CodedOutputStream.V(i) + CodedOutputStream.C(t);
        }
        return t + (size * CodedOutputStream.V(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.S(c0Var.t(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.S(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i, List<?> list) {
        int U;
        int U2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.V(i) * size;
        if (list instanceof eo5) {
            eo5 eo5Var = (eo5) list;
            while (i2 < size) {
                Object s = eo5Var.s(i2);
                if (s instanceof g) {
                    U2 = CodedOutputStream.h((g) s);
                } else {
                    U2 = CodedOutputStream.U((String) s);
                }
                V += U2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof g) {
                    U = CodedOutputStream.h((g) obj);
                } else {
                    U = CodedOutputStream.U((String) obj);
                }
                V += U;
                i2++;
            }
        }
        return V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = w(list);
        if (z) {
            return CodedOutputStream.V(i) + CodedOutputStream.C(w);
        }
        return w + (size * CodedOutputStream.V(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            w wVar = (w) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.X(wVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.X(list.get(i2).intValue());
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
            return CodedOutputStream.V(i) + CodedOutputStream.C(y);
        }
        return y + (size * CodedOutputStream.V(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.Z(c0Var.t(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.Z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB z(int i, List<Integer> list, x.d<?> dVar, UB ub, d1<UT, UB> d1Var) {
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
                    ub = (UB) L(i, intValue, ub, d1Var);
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
                    ub = (UB) L(i, intValue2, ub, d1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
