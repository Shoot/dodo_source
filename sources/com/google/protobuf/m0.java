package com.google.protobuf;

import com.google.protobuf.d0;
import com.google.protobuf.f;
import com.google.protobuf.h1;
import com.google.protobuf.i1;
import com.google.protobuf.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* compiled from: MessageSchema.java */
/* loaded from: classes.dex */
final class m0<T> implements w0<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = f1.D();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final k0 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final o0 m;
    private final a0 n;
    private final c1<?, ?> o;
    private final n<?> p;
    private final f0 q;

    private m0(int[] iArr, Object[] objArr, int i, int i2, k0 k0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, o0 o0Var, a0 a0Var, c1<?, ?> c1Var, n<?> nVar, f0 f0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = k0Var instanceof u;
        this.h = z;
        this.f = nVar != null && nVar.e(k0Var);
        this.i = z2;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = o0Var;
        this.n = a0Var;
        this.o = c1Var;
        this.p = nVar;
        this.e = k0Var;
        this.q = f0Var;
    }

    private boolean A(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return z(t, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean B(Object obj, int i, w0 w0Var) {
        return w0Var.c(f1.C(obj, V(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean C(Object obj, int i, int i2) {
        List list = (List) f1.C(obj, V(i));
        if (list.isEmpty()) {
            return true;
        }
        w0 t = t(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!t.c(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.w0] */
    private boolean D(T t, int i, int i2) {
        Map<?, ?> e = this.q.e(f1.C(t, V(i)));
        if (e.isEmpty()) {
            return true;
        }
        if (this.q.b(s(i2)).c.i() != h1.c.MESSAGE) {
            return true;
        }
        w0<T> w0Var = 0;
        for (Object obj : e.values()) {
            if (w0Var == null) {
                w0Var = s0.a().c(obj.getClass());
            }
            boolean c = w0Var.c(obj);
            w0Var = w0Var;
            if (!c) {
                return false;
            }
        }
        return true;
    }

    private static boolean E(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof u) {
            return ((u) obj).N();
        }
        return true;
    }

    private boolean F(T t, T t2, int i) {
        long c0 = c0(i) & 1048575;
        if (f1.z(t, c0) == f1.z(t2, c0)) {
            return true;
        }
        return false;
    }

    private boolean G(T t, int i, int i2) {
        if (f1.z(t, c0(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean H(int i) {
        if ((i & 268435456) != 0) {
            return true;
        }
        return false;
    }

    private static List<?> I(Object obj, long j) {
        return (List) f1.C(obj, j);
    }

    private static <T> long J(T t, long j) {
        return f1.A(t, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
        r0 = r18.k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r0 >= r18.l) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r4 = (UB) o(r21, r18.j[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
        if (r4 == null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
        r7.o(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x064f A[Catch: all -> 0x0675, TRY_LEAVE, TryCatch #6 {all -> 0x0675, blocks: (B:170:0x0649, B:172:0x064f, B:184:0x0679, B:185:0x067e), top: B:214:0x0649 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06b5 A[LOOP:4: B:198:0x06b1->B:200:0x06b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06ca  */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.protobuf.c1] */
    /* JADX WARN: Type inference failed for: r14v4, types: [com.google.protobuf.c1] */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.protobuf.v0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.protobuf.r.b<ET>> void K(com.google.protobuf.c1<UT, UB> r19, com.google.protobuf.n<ET> r20, T r21, com.google.protobuf.v0 r22, com.google.protobuf.m r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.m0.K(com.google.protobuf.c1, com.google.protobuf.n, java.lang.Object, com.google.protobuf.v0, com.google.protobuf.m):void");
    }

    private final <K, V> void L(Object obj, int i, Object obj2, m mVar, v0 v0Var) throws IOException {
        long V = V(o0(i));
        Object C = f1.C(obj, V);
        if (C == null) {
            C = this.q.d(obj2);
            f1.R(obj, V, C);
        } else if (this.q.h(C)) {
            Object d = this.q.d(obj2);
            this.q.a(d, C);
            f1.R(obj, V, d);
            C = d;
        }
        v0Var.M(this.q.c(C), this.q.b(obj2), mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void M(T t, T t2, int i) {
        if (!z(t2, i)) {
            return;
        }
        long V = V(o0(i));
        Unsafe unsafe = s;
        Object object = unsafe.getObject(t2, V);
        if (object != null) {
            w0 t3 = t(i);
            if (!z(t, i)) {
                if (!E(object)) {
                    unsafe.putObject(t, V, object);
                } else {
                    Object e = t3.e();
                    t3.a(e, object);
                    unsafe.putObject(t, V, e);
                }
                i0(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, V);
            if (!E(object2)) {
                Object e2 = t3.e();
                t3.a(e2, object2);
                unsafe.putObject(t, V, e2);
                object2 = e2;
            }
            t3.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + U(i) + " is present but null: " + t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(T t, T t2, int i) {
        int U = U(i);
        if (!G(t2, U, i)) {
            return;
        }
        long V = V(o0(i));
        Unsafe unsafe = s;
        Object object = unsafe.getObject(t2, V);
        if (object != null) {
            w0 t3 = t(i);
            if (!G(t, U, i)) {
                if (!E(object)) {
                    unsafe.putObject(t, V, object);
                } else {
                    Object e = t3.e();
                    t3.a(e, object);
                    unsafe.putObject(t, V, e);
                }
                j0(t, U, i);
                return;
            }
            Object object2 = unsafe.getObject(t, V);
            if (!E(object2)) {
                Object e2 = t3.e();
                t3.a(e2, object2);
                unsafe.putObject(t, V, e2);
                object2 = e2;
            }
            t3.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + U(i) + " is present but null: " + t2);
    }

    private void O(T t, T t2, int i) {
        int o0 = o0(i);
        long V = V(o0);
        int U = U(i);
        switch (n0(o0)) {
            case 0:
                if (z(t2, i)) {
                    f1.N(t, V, f1.x(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 1:
                if (z(t2, i)) {
                    f1.O(t, V, f1.y(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 2:
                if (z(t2, i)) {
                    f1.Q(t, V, f1.A(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 3:
                if (z(t2, i)) {
                    f1.Q(t, V, f1.A(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 4:
                if (z(t2, i)) {
                    f1.P(t, V, f1.z(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 5:
                if (z(t2, i)) {
                    f1.Q(t, V, f1.A(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 6:
                if (z(t2, i)) {
                    f1.P(t, V, f1.z(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 7:
                if (z(t2, i)) {
                    f1.H(t, V, f1.r(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 8:
                if (z(t2, i)) {
                    f1.R(t, V, f1.C(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 9:
                M(t, t2, i);
                return;
            case 10:
                if (z(t2, i)) {
                    f1.R(t, V, f1.C(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 11:
                if (z(t2, i)) {
                    f1.P(t, V, f1.z(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 12:
                if (z(t2, i)) {
                    f1.P(t, V, f1.z(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 13:
                if (z(t2, i)) {
                    f1.P(t, V, f1.z(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 14:
                if (z(t2, i)) {
                    f1.Q(t, V, f1.A(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 15:
                if (z(t2, i)) {
                    f1.P(t, V, f1.z(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 16:
                if (z(t2, i)) {
                    f1.Q(t, V, f1.A(t2, V));
                    i0(t, i);
                    return;
                }
                return;
            case 17:
                M(t, t2, i);
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
                this.n.d(t, t2, V);
                return;
            case 50:
                y0.F(this.q, t, t2, V);
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
                if (G(t2, U, i)) {
                    f1.R(t, V, f1.C(t2, V));
                    j0(t, U, i);
                    return;
                }
                return;
            case 60:
                N(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (G(t2, U, i)) {
                    f1.R(t, V, f1.C(t2, V));
                    j0(t, U, i);
                    return;
                }
                return;
            case 68:
                N(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object P(T t, int i) {
        w0 t2 = t(i);
        long V = V(o0(i));
        if (!z(t, i)) {
            return t2.e();
        }
        Object object = s.getObject(t, V);
        if (E(object)) {
            return object;
        }
        Object e = t2.e();
        if (object != null) {
            t2.a(e, object);
        }
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object Q(T t, int i, int i2) {
        w0 t2 = t(i2);
        if (!G(t, i, i2)) {
            return t2.e();
        }
        Object object = s.getObject(t, V(o0(i2)));
        if (E(object)) {
            return object;
        }
        Object e = t2.e();
        if (object != null) {
            t2.a(e, object);
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> m0<T> R(Class<T> cls, i0 i0Var, o0 o0Var, a0 a0Var, c1<?, ?> c1Var, n<?> nVar, f0 f0Var) {
        if (i0Var instanceof u0) {
            return T((u0) i0Var, o0Var, a0Var, c1Var, nVar, f0Var);
        }
        return S((a1) i0Var, o0Var, a0Var, c1Var, nVar, f0Var);
    }

    static <T> m0<T> S(a1 a1Var, o0 o0Var, a0 a0Var, c1<?, ?> c1Var, n<?> nVar, f0 f0Var) {
        boolean z;
        if (a1Var.c() == nr8.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        q[] e = a1Var.e();
        if (e.length == 0) {
            int length = e.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (e.length <= 0) {
                int[] d = a1Var.d();
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
                    return new m0<>(iArr, objArr, 0, 0, a1Var.b(), z, true, iArr4, d.length, d.length + iArr2.length, o0Var, a0Var, c1Var, nVar, f0Var);
                }
                q qVar = e[0];
                throw null;
            }
            q qVar2 = e[0];
            throw null;
        }
        q qVar3 = e[0];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.protobuf.m0<T> T(com.google.protobuf.u0 r33, com.google.protobuf.o0 r34, com.google.protobuf.a0 r35, com.google.protobuf.c1<?, ?> r36, com.google.protobuf.n<?> r37, com.google.protobuf.f0 r38) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.m0.T(com.google.protobuf.u0, com.google.protobuf.o0, com.google.protobuf.a0, com.google.protobuf.c1, com.google.protobuf.n, com.google.protobuf.f0):com.google.protobuf.m0");
    }

    private int U(int i) {
        return this.a[i];
    }

    private static long V(int i) {
        return i & 1048575;
    }

    private static <T> boolean W(T t, long j) {
        return ((Boolean) f1.C(t, j)).booleanValue();
    }

    private static <T> double X(T t, long j) {
        return ((Double) f1.C(t, j)).doubleValue();
    }

    private static <T> float Y(T t, long j) {
        return ((Float) f1.C(t, j)).floatValue();
    }

    private static <T> int Z(T t, long j) {
        return ((Integer) f1.C(t, j)).intValue();
    }

    private static <T> long a0(T t, long j) {
        return ((Long) f1.C(t, j)).longValue();
    }

    private int b0(int i) {
        if (i >= this.c && i <= this.d) {
            return k0(i, 0);
        }
        return -1;
    }

    private int c0(int i) {
        return this.a[i + 2];
    }

    private <E> void d0(Object obj, long j, v0 v0Var, w0<E> w0Var, m mVar) throws IOException {
        v0Var.J(this.n.e(obj, j), w0Var, mVar);
    }

    private <E> void e0(Object obj, int i, v0 v0Var, w0<E> w0Var, m mVar) throws IOException {
        v0Var.K(this.n.e(obj, V(i)), w0Var, mVar);
    }

    private void f0(Object obj, int i, v0 v0Var) throws IOException {
        if (y(i)) {
            f1.R(obj, V(i), v0Var.I());
        } else if (this.g) {
            f1.R(obj, V(i), v0Var.z());
        } else {
            f1.R(obj, V(i), v0Var.o());
        }
    }

    private void g0(Object obj, int i, v0 v0Var) throws IOException {
        if (y(i)) {
            v0Var.n(this.n.e(obj, V(i)));
        } else {
            v0Var.B(this.n.e(obj, V(i)));
        }
    }

    private static Field h0(Class<?> cls, String str) {
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

    private void i0(T t, int i) {
        int c0 = c0(i);
        long j = 1048575 & c0;
        if (j == 1048575) {
            return;
        }
        f1.P(t, j, (1 << (c0 >>> 20)) | f1.z(t, j));
    }

    private boolean j(T t, T t2, int i) {
        if (z(t, i) == z(t2, i)) {
            return true;
        }
        return false;
    }

    private void j0(T t, int i, int i2) {
        f1.P(t, c0(i2) & 1048575, i);
    }

    private static <T> boolean k(T t, long j) {
        return f1.r(t, j);
    }

    private int k0(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int U = U(i4);
            if (i == U) {
                return i4;
            }
            if (i < U) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static void l(Object obj) {
        if (E(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private void l0(T t, int i, Object obj) {
        s.putObject(t, V(o0(i)), obj);
        i0(t, i);
    }

    private static <T> double m(T t, long j) {
        return f1.x(t, j);
    }

    private void m0(T t, int i, int i2, Object obj) {
        s.putObject(t, V(o0(i2)), obj);
        j0(t, i, i2);
    }

    private boolean n(T t, T t2, int i) {
        int o0 = o0(i);
        long V = V(o0);
        switch (n0(o0)) {
            case 0:
                if (!j(t, t2, i) || Double.doubleToLongBits(f1.x(t, V)) != Double.doubleToLongBits(f1.x(t2, V))) {
                    return false;
                }
                return true;
            case 1:
                if (!j(t, t2, i) || Float.floatToIntBits(f1.y(t, V)) != Float.floatToIntBits(f1.y(t2, V))) {
                    return false;
                }
                return true;
            case 2:
                if (!j(t, t2, i) || f1.A(t, V) != f1.A(t2, V)) {
                    return false;
                }
                return true;
            case 3:
                if (!j(t, t2, i) || f1.A(t, V) != f1.A(t2, V)) {
                    return false;
                }
                return true;
            case 4:
                if (!j(t, t2, i) || f1.z(t, V) != f1.z(t2, V)) {
                    return false;
                }
                return true;
            case 5:
                if (!j(t, t2, i) || f1.A(t, V) != f1.A(t2, V)) {
                    return false;
                }
                return true;
            case 6:
                if (!j(t, t2, i) || f1.z(t, V) != f1.z(t2, V)) {
                    return false;
                }
                return true;
            case 7:
                if (!j(t, t2, i) || f1.r(t, V) != f1.r(t2, V)) {
                    return false;
                }
                return true;
            case 8:
                if (!j(t, t2, i) || !y0.K(f1.C(t, V), f1.C(t2, V))) {
                    return false;
                }
                return true;
            case 9:
                if (!j(t, t2, i) || !y0.K(f1.C(t, V), f1.C(t2, V))) {
                    return false;
                }
                return true;
            case 10:
                if (!j(t, t2, i) || !y0.K(f1.C(t, V), f1.C(t2, V))) {
                    return false;
                }
                return true;
            case 11:
                if (!j(t, t2, i) || f1.z(t, V) != f1.z(t2, V)) {
                    return false;
                }
                return true;
            case 12:
                if (!j(t, t2, i) || f1.z(t, V) != f1.z(t2, V)) {
                    return false;
                }
                return true;
            case 13:
                if (!j(t, t2, i) || f1.z(t, V) != f1.z(t2, V)) {
                    return false;
                }
                return true;
            case 14:
                if (!j(t, t2, i) || f1.A(t, V) != f1.A(t2, V)) {
                    return false;
                }
                return true;
            case 15:
                if (!j(t, t2, i) || f1.z(t, V) != f1.z(t2, V)) {
                    return false;
                }
                return true;
            case 16:
                if (!j(t, t2, i) || f1.A(t, V) != f1.A(t2, V)) {
                    return false;
                }
                return true;
            case 17:
                if (!j(t, t2, i) || !y0.K(f1.C(t, V), f1.C(t2, V))) {
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
                return y0.K(f1.C(t, V), f1.C(t2, V));
            case 50:
                return y0.K(f1.C(t, V), f1.C(t2, V));
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
                if (!F(t, t2, i) || !y0.K(f1.C(t, V), f1.C(t2, V))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    private static int n0(int i) {
        return (i & 267386880) >>> 20;
    }

    private <UT, UB> UB o(Object obj, int i, UB ub, c1<UT, UB> c1Var, Object obj2) {
        int U = U(i);
        Object C = f1.C(obj, V(o0(i)));
        if (C == null) {
            return ub;
        }
        w.e r2 = r(i);
        if (r2 == null) {
            return ub;
        }
        return (UB) p(i, U, this.q.c(C), r2, ub, c1Var, obj2);
    }

    private int o0(int i) {
        return this.a[i + 1];
    }

    private <K, V, UT, UB> UB p(int i, int i2, Map<K, V> map, w.e eVar, UB ub, c1<UT, UB> c1Var, Object obj) {
        d0.a<?, ?> b = this.q.b(s(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = c1Var.f(obj);
                }
                f.h P = f.P(d0.b(b, next.getKey(), next.getValue()));
                try {
                    d0.e(P.b(), b, next.getKey(), next.getValue());
                    c1Var.d(ub, i2, P.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0491  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p0(T r18, com.google.protobuf.i1 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.m0.p0(java.lang.Object, com.google.protobuf.i1):void");
    }

    private static <T> float q(T t, long j) {
        return f1.y(t, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q0(T r13, com.google.protobuf.i1 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.m0.q0(java.lang.Object, com.google.protobuf.i1):void");
    }

    private w.e r(int i) {
        return (w.e) this.b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r0(T r11, com.google.protobuf.i1 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.m0.r0(java.lang.Object, com.google.protobuf.i1):void");
    }

    private Object s(int i) {
        return this.b[(i / 3) * 2];
    }

    private <K, V> void s0(i1 i1Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            i1Var.O(i, this.q.b(s(i2)), this.q.e(obj));
        }
    }

    private w0 t(int i) {
        int i2 = (i / 3) * 2;
        w0 w0Var = (w0) this.b[i2];
        if (w0Var != null) {
            return w0Var;
        }
        w0<T> c = s0.a().c((Class) this.b[i2 + 1]);
        this.b[i2] = c;
        return c;
    }

    private void t0(int i, Object obj, i1 i1Var) throws IOException {
        if (obj instanceof String) {
            i1Var.e(i, (String) obj);
        } else {
            i1Var.L(i, (f) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int u(T t) {
        int i;
        int i2;
        int i3;
        int d;
        int J;
        int i4;
        int T;
        int V;
        Unsafe unsafe = s;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        int i9 = 0;
        while (i6 < this.a.length) {
            int o0 = o0(i6);
            int U = U(i6);
            int n0 = n0(o0);
            if (n0 <= 17) {
                i = this.a[i6 + 2];
                int i10 = i & i5;
                i2 = 1 << (i >>> 20);
                if (i10 != i8) {
                    i9 = unsafe.getInt(t, i10);
                    i8 = i10;
                }
            } else {
                if (this.i && n0 >= rs3.a5.i() && n0 <= rs3.n5.i()) {
                    i = this.a[i6 + 2] & i5;
                } else {
                    i = 0;
                }
                i2 = 0;
            }
            long V2 = V(o0);
            switch (n0) {
                case 0:
                    if ((i9 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.i(U, 0.0d);
                        i7 += i3;
                        break;
                    }
                case 1:
                    if ((i9 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.q(U, 0.0f);
                        i7 += i3;
                        break;
                    }
                case 2:
                    if ((i9 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.x(U, unsafe.getLong(t, V2));
                        i7 += i3;
                        break;
                    }
                case 3:
                    if ((i9 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.W(U, unsafe.getLong(t, V2));
                        i7 += i3;
                        break;
                    }
                case 4:
                    if ((i9 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.v(U, unsafe.getInt(t, V2));
                        i7 += i3;
                        break;
                    }
                case 5:
                    if ((i9 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.o(U, 0L);
                        i7 += i3;
                        break;
                    }
                case 6:
                    if ((i9 & i2) != 0) {
                        i3 = CodedOutputStream.m(U, 0);
                        i7 += i3;
                        break;
                    }
                    break;
                case 7:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.d(U, true);
                        i7 += d;
                    }
                    break;
                case 8:
                    if ((i9 & i2) != 0) {
                        Object object = unsafe.getObject(t, V2);
                        if (object instanceof f) {
                            d = CodedOutputStream.g(U, (f) object);
                        } else {
                            d = CodedOutputStream.R(U, (String) object);
                        }
                        i7 += d;
                    }
                    break;
                case 9:
                    if ((i9 & i2) != 0) {
                        d = y0.o(U, unsafe.getObject(t, V2), t(i6));
                        i7 += d;
                    }
                    break;
                case 10:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.g(U, (f) unsafe.getObject(t, V2));
                        i7 += d;
                    }
                    break;
                case 11:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.U(U, unsafe.getInt(t, V2));
                        i7 += d;
                    }
                    break;
                case 12:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.k(U, unsafe.getInt(t, V2));
                        i7 += d;
                    }
                    break;
                case 13:
                    if ((i9 & i2) != 0) {
                        J = CodedOutputStream.J(U, 0);
                        i7 += J;
                    }
                    break;
                case 14:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.L(U, 0L);
                        i7 += d;
                    }
                    break;
                case 15:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.N(U, unsafe.getInt(t, V2));
                        i7 += d;
                    }
                    break;
                case 16:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.P(U, unsafe.getLong(t, V2));
                        i7 += d;
                    }
                    break;
                case 17:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.s(U, (k0) unsafe.getObject(t, V2), t(i6));
                        i7 += d;
                    }
                    break;
                case 18:
                    d = y0.h(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 19:
                    d = y0.f(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 20:
                    d = y0.m(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 21:
                    d = y0.x(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 22:
                    d = y0.k(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 23:
                    d = y0.h(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 24:
                    d = y0.f(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 25:
                    d = y0.a(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 26:
                    d = y0.u(U, (List) unsafe.getObject(t, V2));
                    i7 += d;
                    break;
                case 27:
                    d = y0.p(U, (List) unsafe.getObject(t, V2), t(i6));
                    i7 += d;
                    break;
                case 28:
                    d = y0.c(U, (List) unsafe.getObject(t, V2));
                    i7 += d;
                    break;
                case 29:
                    d = y0.v(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 30:
                    d = y0.d(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 31:
                    d = y0.f(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 32:
                    d = y0.h(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 33:
                    d = y0.q(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 34:
                    d = y0.s(U, (List) unsafe.getObject(t, V2), false);
                    i7 += d;
                    break;
                case 35:
                    i4 = y0.i((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 36:
                    i4 = y0.g((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 37:
                    i4 = y0.n((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 38:
                    i4 = y0.y((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 39:
                    i4 = y0.l((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 40:
                    i4 = y0.i((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 41:
                    i4 = y0.g((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 42:
                    i4 = y0.b((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 43:
                    i4 = y0.w((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 44:
                    i4 = y0.e((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 45:
                    i4 = y0.g((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 46:
                    i4 = y0.i((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 47:
                    i4 = y0.r((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 48:
                    i4 = y0.t((List) unsafe.getObject(t, V2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i4);
                        J = T + V + i4;
                        i7 += J;
                    }
                    break;
                case 49:
                    d = y0.j(U, (List) unsafe.getObject(t, V2), t(i6));
                    i7 += d;
                    break;
                case 50:
                    d = this.q.g(U, unsafe.getObject(t, V2), s(i6));
                    i7 += d;
                    break;
                case 51:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.i(U, 0.0d);
                        i7 += d;
                    }
                    break;
                case 52:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.q(U, 0.0f);
                        i7 += d;
                    }
                    break;
                case 53:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.x(U, a0(t, V2));
                        i7 += d;
                    }
                    break;
                case 54:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.W(U, a0(t, V2));
                        i7 += d;
                    }
                    break;
                case 55:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.v(U, Z(t, V2));
                        i7 += d;
                    }
                    break;
                case 56:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.o(U, 0L);
                        i7 += d;
                    }
                    break;
                case 57:
                    if (G(t, U, i6)) {
                        J = CodedOutputStream.m(U, 0);
                        i7 += J;
                    }
                    break;
                case 58:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.d(U, true);
                        i7 += d;
                    }
                    break;
                case 59:
                    if (G(t, U, i6)) {
                        Object object2 = unsafe.getObject(t, V2);
                        if (object2 instanceof f) {
                            d = CodedOutputStream.g(U, (f) object2);
                        } else {
                            d = CodedOutputStream.R(U, (String) object2);
                        }
                        i7 += d;
                    }
                    break;
                case 60:
                    if (G(t, U, i6)) {
                        d = y0.o(U, unsafe.getObject(t, V2), t(i6));
                        i7 += d;
                    }
                    break;
                case 61:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.g(U, (f) unsafe.getObject(t, V2));
                        i7 += d;
                    }
                    break;
                case 62:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.U(U, Z(t, V2));
                        i7 += d;
                    }
                    break;
                case 63:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.k(U, Z(t, V2));
                        i7 += d;
                    }
                    break;
                case 64:
                    if (G(t, U, i6)) {
                        J = CodedOutputStream.J(U, 0);
                        i7 += J;
                    }
                    break;
                case 65:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.L(U, 0L);
                        i7 += d;
                    }
                    break;
                case 66:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.N(U, Z(t, V2));
                        i7 += d;
                    }
                    break;
                case 67:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.P(U, a0(t, V2));
                        i7 += d;
                    }
                    break;
                case 68:
                    if (G(t, U, i6)) {
                        d = CodedOutputStream.s(U, (k0) unsafe.getObject(t, V2), t(i6));
                        i7 += d;
                    }
                    break;
            }
            i6 += 3;
            i5 = 1048575;
        }
        int w = i7 + w(this.o, t);
        if (this.f) {
            return w + this.p.c(t).l();
        }
        return w;
    }

    private <UT, UB> void u0(c1<UT, UB> c1Var, T t, i1 i1Var) throws IOException {
        c1Var.t(c1Var.g(t), i1Var);
    }

    private int v(T t) {
        int i;
        int i2;
        int i3;
        int T;
        int V;
        Unsafe unsafe = s;
        int i4 = 0;
        for (int i5 = 0; i5 < this.a.length; i5 += 3) {
            int o0 = o0(i5);
            int n0 = n0(o0);
            int U = U(i5);
            long V2 = V(o0);
            if (n0 >= rs3.a5.i() && n0 <= rs3.n5.i()) {
                i = this.a[i5 + 2] & 1048575;
            } else {
                i = 0;
            }
            switch (n0) {
                case 0:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.i(U, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.q(U, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.x(U, f1.A(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.W(U, f1.A(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.v(U, f1.z(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.o(U, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.m(U, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.d(U, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (z(t, i5)) {
                        Object C = f1.C(t, V2);
                        if (C instanceof f) {
                            i2 = CodedOutputStream.g(U, (f) C);
                            break;
                        } else {
                            i2 = CodedOutputStream.R(U, (String) C);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (z(t, i5)) {
                        i2 = y0.o(U, f1.C(t, V2), t(i5));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.g(U, (f) f1.C(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.U(U, f1.z(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.k(U, f1.z(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.J(U, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.L(U, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.N(U, f1.z(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.P(U, f1.A(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (z(t, i5)) {
                        i2 = CodedOutputStream.s(U, (k0) f1.C(t, V2), t(i5));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i2 = y0.h(U, I(t, V2), false);
                    break;
                case 19:
                    i2 = y0.f(U, I(t, V2), false);
                    break;
                case 20:
                    i2 = y0.m(U, I(t, V2), false);
                    break;
                case 21:
                    i2 = y0.x(U, I(t, V2), false);
                    break;
                case 22:
                    i2 = y0.k(U, I(t, V2), false);
                    break;
                case 23:
                    i2 = y0.h(U, I(t, V2), false);
                    break;
                case 24:
                    i2 = y0.f(U, I(t, V2), false);
                    break;
                case 25:
                    i2 = y0.a(U, I(t, V2), false);
                    break;
                case 26:
                    i2 = y0.u(U, I(t, V2));
                    break;
                case 27:
                    i2 = y0.p(U, I(t, V2), t(i5));
                    break;
                case 28:
                    i2 = y0.c(U, I(t, V2));
                    break;
                case 29:
                    i2 = y0.v(U, I(t, V2), false);
                    break;
                case 30:
                    i2 = y0.d(U, I(t, V2), false);
                    break;
                case 31:
                    i2 = y0.f(U, I(t, V2), false);
                    break;
                case 32:
                    i2 = y0.h(U, I(t, V2), false);
                    break;
                case 33:
                    i2 = y0.q(U, I(t, V2), false);
                    break;
                case 34:
                    i2 = y0.s(U, I(t, V2), false);
                    break;
                case 35:
                    i3 = y0.i((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    i3 = y0.g((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    i3 = y0.n((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    i3 = y0.y((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    i3 = y0.l((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    i3 = y0.i((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    i3 = y0.g((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    i3 = y0.b((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    i3 = y0.w((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    i3 = y0.e((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    i3 = y0.g((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    i3 = y0.i((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    i3 = y0.r((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    i3 = y0.t((List) unsafe.getObject(t, V2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        T = CodedOutputStream.T(U);
                        V = CodedOutputStream.V(i3);
                        i2 = T + V + i3;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    i2 = y0.j(U, I(t, V2), t(i5));
                    break;
                case 50:
                    i2 = this.q.g(U, f1.C(t, V2), s(i5));
                    break;
                case 51:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.i(U, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.q(U, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.x(U, a0(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.W(U, a0(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.v(U, Z(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.o(U, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.m(U, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.d(U, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (G(t, U, i5)) {
                        Object C2 = f1.C(t, V2);
                        if (C2 instanceof f) {
                            i2 = CodedOutputStream.g(U, (f) C2);
                            break;
                        } else {
                            i2 = CodedOutputStream.R(U, (String) C2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (G(t, U, i5)) {
                        i2 = y0.o(U, f1.C(t, V2), t(i5));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.g(U, (f) f1.C(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.U(U, Z(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.k(U, Z(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.J(U, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.L(U, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.N(U, Z(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.P(U, a0(t, V2));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (G(t, U, i5)) {
                        i2 = CodedOutputStream.s(U, (k0) f1.C(t, V2), t(i5));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i4 += i2;
        }
        return i4 + w(this.o, t);
    }

    private <UT, UB> int w(c1<UT, UB> c1Var, T t) {
        return c1Var.h(c1Var.g(t));
    }

    private static <T> int x(T t, long j) {
        return f1.z(t, j);
    }

    private static boolean y(int i) {
        if ((i & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private boolean z(T t, int i) {
        int c0 = c0(i);
        long j = 1048575 & c0;
        if (j == 1048575) {
            int o0 = o0(i);
            long V = V(o0);
            switch (n0(o0)) {
                case 0:
                    if (Double.doubleToRawLongBits(f1.x(t, V)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(f1.y(t, V)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (f1.A(t, V) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (f1.A(t, V) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (f1.z(t, V) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (f1.A(t, V) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (f1.z(t, V) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return f1.r(t, V);
                case 8:
                    Object C = f1.C(t, V);
                    if (C instanceof String) {
                        return !((String) C).isEmpty();
                    }
                    if (C instanceof f) {
                        return !f.b.equals(C);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (f1.C(t, V) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !f.b.equals(f1.C(t, V));
                case 11:
                    if (f1.z(t, V) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (f1.z(t, V) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (f1.z(t, V) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (f1.A(t, V) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (f1.z(t, V) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (f1.A(t, V) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (f1.C(t, V) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((f1.z(t, j) & (1 << (c0 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.w0
    public void a(T t, T t2) {
        l(t);
        t2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            O(t, t2, i);
        }
        y0.G(this.o, t, t2);
        if (this.f) {
            y0.E(this.p, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.w0
    public void b(T t) {
        if (!E(t)) {
            return;
        }
        if (t instanceof u) {
            u uVar = (u) t;
            uVar.y();
            uVar.x();
            uVar.P();
        }
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int o0 = o0(i);
            long V = V(o0);
            int n0 = n0(o0);
            if (n0 != 9) {
                switch (n0) {
                    case 17:
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
                        this.n.c(t, V);
                        continue;
                    case 50:
                        Unsafe unsafe = s;
                        Object object = unsafe.getObject(t, V);
                        if (object != null) {
                            unsafe.putObject(t, V, this.q.f(object));
                        } else {
                            continue;
                        }
                    default:
                }
            }
            if (z(t, i)) {
                t(i).b(s.getObject(t, V));
            }
        }
        this.o.j(t);
        if (this.f) {
            this.p.f(t);
        }
    }

    @Override // com.google.protobuf.w0
    public final boolean c(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.k) {
            int i6 = this.j[i5];
            int U = U(i6);
            int o0 = o0(i6);
            int i7 = this.a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = s.getInt(t, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (H(o0) && !A(t, i6, i, i2, i9)) {
                return false;
            }
            int n0 = n0(o0);
            if (n0 != 9 && n0 != 17) {
                if (n0 != 27) {
                    if (n0 != 60 && n0 != 68) {
                        if (n0 != 49) {
                            if (n0 == 50 && !D(t, o0, i6)) {
                                return false;
                            }
                        }
                    } else if (G(t, U, i6) && !B(t, o0, t(i6))) {
                        return false;
                    }
                }
                if (!C(t, o0, i6)) {
                    return false;
                }
            } else if (A(t, i6, i, i2, i9) && !B(t, o0, t(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f && !this.p.c(t).p()) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.w0
    public int d(T t) {
        if (this.h) {
            return v(t);
        }
        return u(t);
    }

    @Override // com.google.protobuf.w0
    public T e() {
        return (T) this.m.a(this.e);
    }

    @Override // com.google.protobuf.w0
    public int f(T t) {
        int i;
        int f;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int o0 = o0(i3);
            int U = U(i3);
            long V = V(o0);
            int i4 = 37;
            switch (n0(o0)) {
                case 0:
                    i = i2 * 53;
                    f = w.f(Double.doubleToLongBits(f1.x(t, V)));
                    i2 = i + f;
                    break;
                case 1:
                    i = i2 * 53;
                    f = Float.floatToIntBits(f1.y(t, V));
                    i2 = i + f;
                    break;
                case 2:
                    i = i2 * 53;
                    f = w.f(f1.A(t, V));
                    i2 = i + f;
                    break;
                case 3:
                    i = i2 * 53;
                    f = w.f(f1.A(t, V));
                    i2 = i + f;
                    break;
                case 4:
                    i = i2 * 53;
                    f = f1.z(t, V);
                    i2 = i + f;
                    break;
                case 5:
                    i = i2 * 53;
                    f = w.f(f1.A(t, V));
                    i2 = i + f;
                    break;
                case 6:
                    i = i2 * 53;
                    f = f1.z(t, V);
                    i2 = i + f;
                    break;
                case 7:
                    i = i2 * 53;
                    f = w.c(f1.r(t, V));
                    i2 = i + f;
                    break;
                case 8:
                    i = i2 * 53;
                    f = ((String) f1.C(t, V)).hashCode();
                    i2 = i + f;
                    break;
                case 9:
                    Object C = f1.C(t, V);
                    if (C != null) {
                        i4 = C.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    f = f1.C(t, V).hashCode();
                    i2 = i + f;
                    break;
                case 11:
                    i = i2 * 53;
                    f = f1.z(t, V);
                    i2 = i + f;
                    break;
                case 12:
                    i = i2 * 53;
                    f = f1.z(t, V);
                    i2 = i + f;
                    break;
                case 13:
                    i = i2 * 53;
                    f = f1.z(t, V);
                    i2 = i + f;
                    break;
                case 14:
                    i = i2 * 53;
                    f = w.f(f1.A(t, V));
                    i2 = i + f;
                    break;
                case 15:
                    i = i2 * 53;
                    f = f1.z(t, V);
                    i2 = i + f;
                    break;
                case 16:
                    i = i2 * 53;
                    f = w.f(f1.A(t, V));
                    i2 = i + f;
                    break;
                case 17:
                    Object C2 = f1.C(t, V);
                    if (C2 != null) {
                        i4 = C2.hashCode();
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
                    f = f1.C(t, V).hashCode();
                    i2 = i + f;
                    break;
                case 50:
                    i = i2 * 53;
                    f = f1.C(t, V).hashCode();
                    i2 = i + f;
                    break;
                case 51:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = w.f(Double.doubleToLongBits(X(t, V)));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = Float.floatToIntBits(Y(t, V));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = w.f(a0(t, V));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = w.f(a0(t, V));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = Z(t, V);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = w.f(a0(t, V));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = Z(t, V);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = w.c(W(t, V));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = ((String) f1.C(t, V)).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = f1.C(t, V).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = f1.C(t, V).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = Z(t, V);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = Z(t, V);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = Z(t, V);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = w.f(a0(t, V));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = Z(t, V);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = w.f(a0(t, V));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (G(t, U, i3)) {
                        i = i2 * 53;
                        f = f1.C(t, V).hashCode();
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

    @Override // com.google.protobuf.w0
    public boolean g(T t, T t2) {
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            if (!n(t, t2, i)) {
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

    @Override // com.google.protobuf.w0
    public void h(T t, i1 i1Var) throws IOException {
        if (i1Var.t() == i1.a.DESCENDING) {
            r0(t, i1Var);
        } else if (this.h) {
            q0(t, i1Var);
        } else {
            p0(t, i1Var);
        }
    }

    @Override // com.google.protobuf.w0
    public void i(T t, v0 v0Var, m mVar) throws IOException {
        mVar.getClass();
        l(t);
        K(this.o, this.p, t, v0Var, mVar);
    }
}
