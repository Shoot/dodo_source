package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class z2<T> implements j3<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = e4.p();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final h3d e;
    private final boolean f;
    private final boolean g;
    private final w3d h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final c3 m;
    private final k2 n;
    private final b4<?, ?> o;
    private final t1<?> p;
    private final v2 q;

    private z2(int[] iArr, Object[] objArr, int i, int i2, h3d h3dVar, w3d w3dVar, boolean z, int[] iArr2, int i3, int i4, c3 c3Var, k2 k2Var, b4<?, ?> b4Var, t1<?> t1Var, v2 v2Var) {
        boolean z2;
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = h3dVar instanceof b2;
        this.h = w3dVar;
        if (t1Var != null && t1Var.e(h3dVar)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        this.i = false;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = c3Var;
        this.n = k2Var;
        this.o = b4Var;
        this.p = t1Var;
        this.e = h3dVar;
        this.q = v2Var;
    }

    private static <T> float A(T t, long j) {
        return ((Float) e4.B(t, j)).floatValue();
    }

    private final int B(int i) {
        return this.a[i + 2];
    }

    private final void C(T t, int i) {
        int B = B(i);
        long j = 1048575 & B;
        if (j == 1048575) {
            return;
        }
        e4.h(t, j, (1 << (B >>> 20)) | e4.t(t, j));
    }

    private final void D(T t, int i, int i2) {
        e4.h(t, B(i2) & 1048575, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void E(T t, T t2, int i) {
        int i2 = this.a[i];
        if (!I(t2, i2, i)) {
            return;
        }
        long F = F(i) & 1048575;
        Unsafe unsafe = s;
        Object object = unsafe.getObject(t2, F);
        if (object != null) {
            j3 M = M(i);
            if (!I(t, i2, i)) {
                if (!S(object)) {
                    unsafe.putObject(t, F, object);
                } else {
                    Object zza = M.zza();
                    M.e(zza, object);
                    unsafe.putObject(t, F, zza);
                }
                D(t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, F);
            if (!S(object2)) {
                Object zza2 = M.zza();
                M.e(zza2, object2);
                unsafe.putObject(t, F, zza2);
                object2 = zza2;
            }
            M.e(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + String.valueOf(t2));
    }

    private final int F(int i) {
        return this.a[i + 1];
    }

    private static <T> int G(T t, long j) {
        return ((Integer) e4.B(t, j)).intValue();
    }

    private final boolean H(T t, int i) {
        int B = B(i);
        long j = B & 1048575;
        if (j == 1048575) {
            int F = F(i);
            long j2 = F & 1048575;
            switch ((F & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(e4.a(t, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(e4.n(t, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (e4.x(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (e4.x(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (e4.t(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (e4.x(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (e4.t(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return e4.F(t, j2);
                case 8:
                    Object B2 = e4.B(t, j2);
                    if (B2 instanceof String) {
                        if (((String) B2).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (B2 instanceof d1) {
                        if (d1.b.equals(B2)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (e4.B(t, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (d1.b.equals(e4.B(t, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (e4.t(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (e4.t(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (e4.t(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (e4.x(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (e4.t(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (e4.x(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (e4.B(t, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((e4.t(t, j) & (1 << (B >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean I(T t, int i, int i2) {
        if (e4.t(t, B(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private final boolean J(T t, T t2, int i) {
        if (H(t, i) == H(t2, i)) {
            return true;
        }
        return false;
    }

    private static <T> long K(T t, long j) {
        return ((Long) e4.B(t, j)).longValue();
    }

    private final n2d L(int i) {
        return (n2d) this.b[((i / 3) << 1) + 1];
    }

    private final j3 M(int i) {
        int i2 = (i / 3) << 1;
        j3 j3Var = (j3) this.b[i2];
        if (j3Var != null) {
            return j3Var;
        }
        j3<T> b = g3.a().b((Class) this.b[i2 + 1]);
        this.b[i2] = b;
        return b;
    }

    private static a4 N(Object obj) {
        b2 b2Var = (b2) obj;
        a4 a4Var = b2Var.zzb;
        if (a4Var == a4.k()) {
            a4 l = a4.l();
            b2Var.zzb = l;
            return l;
        }
        return a4Var;
    }

    private static <T> boolean O(T t, long j) {
        return ((Boolean) e4.B(t, j)).booleanValue();
    }

    private final Object P(int i) {
        return this.b[(i / 3) << 1];
    }

    private static void Q(Object obj) {
        if (S(obj)) {
            return;
        }
        String valueOf = String.valueOf(obj);
        throw new IllegalArgumentException("Mutating immutable message: " + valueOf);
    }

    private static boolean R(int i) {
        if ((i & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private static boolean S(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof b2) {
            return ((b2) obj).G();
        }
        return true;
    }

    private static <T> double i(T t, long j) {
        return ((Double) e4.B(t, j)).doubleValue();
    }

    private final int j(int i) {
        if (i >= this.c && i <= this.d) {
            return k(i, 0);
        }
        return -1;
    }

    private final int k(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.android.gms.internal.measurement.z2<T> m(java.lang.Class<T> r33, com.google.android.gms.internal.measurement.w2 r34, com.google.android.gms.internal.measurement.c3 r35, com.google.android.gms.internal.measurement.k2 r36, com.google.android.gms.internal.measurement.b4<?, ?> r37, com.google.android.gms.internal.measurement.t1<?> r38, com.google.android.gms.internal.measurement.v2 r39) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.z2.m(java.lang.Class, com.google.android.gms.internal.measurement.w2, com.google.android.gms.internal.measurement.c3, com.google.android.gms.internal.measurement.k2, com.google.android.gms.internal.measurement.b4, com.google.android.gms.internal.measurement.t1, com.google.android.gms.internal.measurement.v2):com.google.android.gms.internal.measurement.z2");
    }

    private final <K, V, UT, UB> UB n(int i, int i2, Map<K, V> map, n2d n2dVar, UB ub, b4<UT, UB> b4Var, Object obj) {
        this.q.a(P(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!n2dVar.e(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = b4Var.i(obj);
                }
                k1 T = d1.T(q2.a(null, next.getKey(), next.getValue()));
                try {
                    q2.b(T.b(), null, next.getKey(), next.getValue());
                    b4Var.c(ub, i2, T.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object o(T t, int i) {
        j3 M = M(i);
        long F = F(i) & 1048575;
        if (!H(t, i)) {
            return M.zza();
        }
        Object object = s.getObject(t, F);
        if (S(object)) {
            return object;
        }
        Object zza = M.zza();
        if (object != null) {
            M.e(zza, object);
        }
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object p(T t, int i, int i2) {
        j3 M = M(i2);
        if (!I(t, i, i2)) {
            return M.zza();
        }
        Object object = s.getObject(t, F(i2) & 1048575);
        if (S(object)) {
            return object;
        }
        Object zza = M.zza();
        if (object != null) {
            M.e(zza, object);
        }
        return zza;
    }

    private final <UT, UB> UB q(Object obj, int i, UB ub, b4<UT, UB> b4Var, Object obj2) {
        int i2 = this.a[i];
        Object B = e4.B(obj, F(i) & 1048575);
        if (B == null) {
            return ub;
        }
        n2d L = L(i);
        if (L == null) {
            return ub;
        }
        return (UB) n(i, i2, this.q.g(B), L, ub, b4Var, obj2);
    }

    private static Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void s(int i, Object obj, k4 k4Var) throws IOException {
        if (obj instanceof String) {
            k4Var.K(i, (String) obj);
        } else {
            k4Var.O(i, (d1) obj);
        }
    }

    private static <UT, UB> void t(b4<UT, UB> b4Var, T t, k4 k4Var) throws IOException {
        b4Var.g(b4Var.k(t), k4Var);
    }

    private final <K, V> void u(k4 k4Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.q.a(P(i2));
            k4Var.x(i, null, this.q.b(obj));
        }
    }

    private final void v(T t, int i, int i2, Object obj) {
        s.putObject(t, F(i2) & 1048575, obj);
        D(t, i, i2);
    }

    private final void w(T t, int i, Object obj) {
        s.putObject(t, F(i) & 1048575, obj);
        C(t, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void x(T t, T t2, int i) {
        if (!H(t2, i)) {
            return;
        }
        long F = F(i) & 1048575;
        Unsafe unsafe = s;
        Object object = unsafe.getObject(t2, F);
        if (object != null) {
            j3 M = M(i);
            if (!H(t, i)) {
                if (!S(object)) {
                    unsafe.putObject(t, F, object);
                } else {
                    Object zza = M.zza();
                    M.e(zza, object);
                    unsafe.putObject(t, F, zza);
                }
                C(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, F);
            if (!S(object2)) {
                Object zza2 = M.zza();
                M.e(zza2, object2);
                unsafe.putObject(t, F, zza2);
                object2 = zza2;
            }
            M.e(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + String.valueOf(t2));
    }

    private final boolean y(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return H(t, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean z(Object obj, int i, j3 j3Var) {
        return j3Var.b(e4.B(obj, i & 1048575));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.j3
    public final int a(T t) {
        int i;
        int i2;
        int i3;
        int e;
        int D;
        int t0;
        int D2;
        int w0;
        int z0;
        Unsafe unsafe = s;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.a.length) {
            int F = F(i7);
            int i9 = (267386880 & F) >>> 20;
            int[] iArr = this.a;
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & i4;
            if (i9 <= 17) {
                if (i12 != i5) {
                    i6 = i12 == i4 ? 0 : unsafe.getInt(t, i12);
                    i5 = i12;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = F & i4;
            if (i9 >= v1d.a5.zza()) {
                v1d.n5.zza();
            }
            switch (i9) {
                case 0:
                    if (y(t, i7, i, i2, i3)) {
                        e = zzio.e(i10, 0.0d);
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (y(t, i7, i, i2, i3)) {
                        e = zzio.f(i10, 0.0f);
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (y(t, i7, i, i2, i3)) {
                        e = zzio.c0(i10, unsafe.getLong(t, j));
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (y(t, i7, i, i2, i3)) {
                        e = zzio.q0(i10, unsafe.getLong(t, j));
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (y(t, i7, i, i2, i3)) {
                        e = zzio.p0(i10, unsafe.getInt(t, j));
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (y(t, i7, i, i2, i3)) {
                        e = zzio.T(i10, 0L);
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (y(t, i7, i, i2, i3)) {
                        e = zzio.l0(i10, 0);
                        i8 += e;
                        break;
                    }
                    break;
                case 7:
                    if (y(t, i7, i, i2, i3)) {
                        D = zzio.D(i10, true);
                        i8 += D;
                    }
                    break;
                case 8:
                    if (y(t, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof d1) {
                            D = zzio.U(i10, (d1) object);
                        } else {
                            D = zzio.A(i10, (String) object);
                        }
                        i8 += D;
                    }
                    break;
                case 9:
                    if (y(t, i7, i, i2, i3)) {
                        D = k3.a(i10, unsafe.getObject(t, j), M(i7));
                        i8 += D;
                    }
                    break;
                case 10:
                    if (y(t, i7, i, i2, i3)) {
                        D = zzio.U(i10, (d1) unsafe.getObject(t, j));
                        i8 += D;
                    }
                    break;
                case 11:
                    if (y(t, i7, i, i2, i3)) {
                        D = zzio.A0(i10, unsafe.getInt(t, j));
                        i8 += D;
                    }
                    break;
                case 12:
                    if (y(t, i7, i, i2, i3)) {
                        D = zzio.h0(i10, unsafe.getInt(t, j));
                        i8 += D;
                    }
                    break;
                case 13:
                    if (y(t, i7, i, i2, i3)) {
                        t0 = zzio.t0(i10, 0);
                        i8 += t0;
                    }
                    break;
                case 14:
                    if (y(t, i7, i, i2, i3)) {
                        D = zzio.i0(i10, 0L);
                        i8 += D;
                    }
                    break;
                case 15:
                    if (y(t, i7, i, i2, i3)) {
                        D = zzio.x0(i10, unsafe.getInt(t, j));
                        i8 += D;
                    }
                    break;
                case 16:
                    if (y(t, i7, i, i2, i3)) {
                        D = zzio.m0(i10, unsafe.getLong(t, j));
                        i8 += D;
                    }
                    break;
                case 17:
                    if (y(t, i7, i, i2, i3)) {
                        D = zzio.C(i10, (h3d) unsafe.getObject(t, j), M(i7));
                        i8 += D;
                    }
                    break;
                case 18:
                    D = k3.C(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 19:
                    D = k3.y(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 20:
                    D = k3.K(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 21:
                    D = k3.W(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 22:
                    D = k3.G(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 23:
                    D = k3.C(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 24:
                    D = k3.y(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 25:
                    D = k3.d(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 26:
                    D = k3.q(i10, (List) unsafe.getObject(t, j));
                    i8 += D;
                    break;
                case 27:
                    D = k3.r(i10, (List) unsafe.getObject(t, j), M(i7));
                    i8 += D;
                    break;
                case 28:
                    D = k3.b(i10, (List) unsafe.getObject(t, j));
                    i8 += D;
                    break;
                case 29:
                    D = k3.T(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 30:
                    D = k3.s(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 31:
                    D = k3.y(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 32:
                    D = k3.C(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 33:
                    D = k3.N(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 34:
                    D = k3.Q(i10, (List) unsafe.getObject(t, j), false);
                    i8 += D;
                    break;
                case 35:
                    D2 = k3.D((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 36:
                    D2 = k3.z((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 37:
                    D2 = k3.L((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 38:
                    D2 = k3.X((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 39:
                    D2 = k3.H((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 40:
                    D2 = k3.D((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 41:
                    D2 = k3.z((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 42:
                    D2 = k3.e((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 43:
                    D2 = k3.U((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 44:
                    D2 = k3.t((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 45:
                    D2 = k3.z((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 46:
                    D2 = k3.D((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 47:
                    D2 = k3.O((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 48:
                    D2 = k3.R((List) unsafe.getObject(t, j));
                    if (D2 > 0) {
                        w0 = zzio.w0(i10);
                        z0 = zzio.z0(D2);
                        t0 = w0 + z0 + D2;
                        i8 += t0;
                    }
                    break;
                case 49:
                    D = k3.c(i10, (List) unsafe.getObject(t, j), M(i7));
                    i8 += D;
                    break;
                case 50:
                    D = this.q.h(i10, unsafe.getObject(t, j), P(i7));
                    i8 += D;
                    break;
                case 51:
                    if (I(t, i10, i7)) {
                        D = zzio.e(i10, 0.0d);
                        i8 += D;
                    }
                    break;
                case 52:
                    if (I(t, i10, i7)) {
                        D = zzio.f(i10, 0.0f);
                        i8 += D;
                    }
                    break;
                case 53:
                    if (I(t, i10, i7)) {
                        D = zzio.c0(i10, K(t, j));
                        i8 += D;
                    }
                    break;
                case 54:
                    if (I(t, i10, i7)) {
                        D = zzio.q0(i10, K(t, j));
                        i8 += D;
                    }
                    break;
                case 55:
                    if (I(t, i10, i7)) {
                        D = zzio.p0(i10, G(t, j));
                        i8 += D;
                    }
                    break;
                case 56:
                    if (I(t, i10, i7)) {
                        D = zzio.T(i10, 0L);
                        i8 += D;
                    }
                    break;
                case 57:
                    if (I(t, i10, i7)) {
                        t0 = zzio.l0(i10, 0);
                        i8 += t0;
                    }
                    break;
                case 58:
                    if (I(t, i10, i7)) {
                        D = zzio.D(i10, true);
                        i8 += D;
                    }
                    break;
                case 59:
                    if (I(t, i10, i7)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof d1) {
                            D = zzio.U(i10, (d1) object2);
                        } else {
                            D = zzio.A(i10, (String) object2);
                        }
                        i8 += D;
                    }
                    break;
                case 60:
                    if (I(t, i10, i7)) {
                        D = k3.a(i10, unsafe.getObject(t, j), M(i7));
                        i8 += D;
                    }
                    break;
                case 61:
                    if (I(t, i10, i7)) {
                        D = zzio.U(i10, (d1) unsafe.getObject(t, j));
                        i8 += D;
                    }
                    break;
                case 62:
                    if (I(t, i10, i7)) {
                        D = zzio.A0(i10, G(t, j));
                        i8 += D;
                    }
                    break;
                case 63:
                    if (I(t, i10, i7)) {
                        D = zzio.h0(i10, G(t, j));
                        i8 += D;
                    }
                    break;
                case 64:
                    if (I(t, i10, i7)) {
                        t0 = zzio.t0(i10, 0);
                        i8 += t0;
                    }
                    break;
                case 65:
                    if (I(t, i10, i7)) {
                        D = zzio.i0(i10, 0L);
                        i8 += D;
                    }
                    break;
                case 66:
                    if (I(t, i10, i7)) {
                        D = zzio.x0(i10, G(t, j));
                        i8 += D;
                    }
                    break;
                case 67:
                    if (I(t, i10, i7)) {
                        D = zzio.m0(i10, K(t, j));
                        i8 += D;
                    }
                    break;
                case 68:
                    if (I(t, i10, i7)) {
                        D = zzio.C(i10, (h3d) unsafe.getObject(t, j), M(i7));
                        i8 += D;
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        int i13 = 0;
        b4<?, ?> b4Var = this.o;
        int a = i8 + b4Var.a(b4Var.k(t));
        if (this.f) {
            x1<?> b = this.p.b(t);
            for (int i14 = 0; i14 < b.a.i(); i14++) {
                Map.Entry<?, Object> j2 = b.a.j(i14);
                i13 += x1.c((h2d) j2.getKey(), j2.getValue());
            }
            for (Map.Entry<?, Object> entry : b.a.l()) {
                i13 += x1.c((h2d) entry.getKey(), entry.getValue());
            }
            return a + i13;
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.j3
    public final boolean b(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.k) {
            int i6 = this.j[i5];
            int i7 = this.a[i6];
            int F = F(i6);
            int i8 = this.a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = s.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & F) != 0 && !y(t, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & F) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 != 60 && i11 != 68) {
                        if (i11 != 49) {
                            if (i11 == 50 && !this.q.b(e4.B(t, F & 1048575)).isEmpty()) {
                                this.q.a(P(i6));
                                throw null;
                            }
                        }
                    } else if (I(t, i7, i6) && !z(t, F, M(i6))) {
                        return false;
                    }
                }
                List list = (List) e4.B(t, F & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    j3 M = M(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!M.b(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (y(t, i6, i, i2, i10) && !z(t, F, M(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f && !this.p.b(t).s()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.j3
    public final void c(T t) {
        if (!S(t)) {
            return;
        }
        if (t instanceof b2) {
            b2 b2Var = (b2) t;
            b2Var.l(Integer.MAX_VALUE);
            b2Var.zza = 0;
            b2Var.F();
        }
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int F = F(i);
            long j = 1048575 & F;
            int i2 = (F & 267386880) >>> 20;
            if (i2 != 9) {
                if (i2 != 60 && i2 != 68) {
                    switch (i2) {
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
                            this.n.d(t, j);
                            break;
                        case 50:
                            Unsafe unsafe = s;
                            Object object = unsafe.getObject(t, j);
                            if (object != null) {
                                unsafe.putObject(t, j, this.q.c(object));
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (I(t, this.a[i], i)) {
                    M(i).c(s.getObject(t, j));
                }
            }
            if (H(t, i)) {
                M(i).c(s.getObject(t, j));
            }
        }
        this.o.l(t);
        if (this.f) {
            this.p.g(t);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final int d(T t) {
        int i;
        int b;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int F = F(i3);
            int i4 = this.a[i3];
            long j = 1048575 & F;
            int i5 = 37;
            switch ((F & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    b = d2.b(Double.doubleToLongBits(e4.a(t, j)));
                    i2 = i + b;
                    break;
                case 1:
                    i = i2 * 53;
                    b = Float.floatToIntBits(e4.n(t, j));
                    i2 = i + b;
                    break;
                case 2:
                    i = i2 * 53;
                    b = d2.b(e4.x(t, j));
                    i2 = i + b;
                    break;
                case 3:
                    i = i2 * 53;
                    b = d2.b(e4.x(t, j));
                    i2 = i + b;
                    break;
                case 4:
                    i = i2 * 53;
                    b = e4.t(t, j);
                    i2 = i + b;
                    break;
                case 5:
                    i = i2 * 53;
                    b = d2.b(e4.x(t, j));
                    i2 = i + b;
                    break;
                case 6:
                    i = i2 * 53;
                    b = e4.t(t, j);
                    i2 = i + b;
                    break;
                case 7:
                    i = i2 * 53;
                    b = d2.c(e4.F(t, j));
                    i2 = i + b;
                    break;
                case 8:
                    i = i2 * 53;
                    b = ((String) e4.B(t, j)).hashCode();
                    i2 = i + b;
                    break;
                case 9:
                    Object B = e4.B(t, j);
                    if (B != null) {
                        i5 = B.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    b = e4.B(t, j).hashCode();
                    i2 = i + b;
                    break;
                case 11:
                    i = i2 * 53;
                    b = e4.t(t, j);
                    i2 = i + b;
                    break;
                case 12:
                    i = i2 * 53;
                    b = e4.t(t, j);
                    i2 = i + b;
                    break;
                case 13:
                    i = i2 * 53;
                    b = e4.t(t, j);
                    i2 = i + b;
                    break;
                case 14:
                    i = i2 * 53;
                    b = d2.b(e4.x(t, j));
                    i2 = i + b;
                    break;
                case 15:
                    i = i2 * 53;
                    b = e4.t(t, j);
                    i2 = i + b;
                    break;
                case 16:
                    i = i2 * 53;
                    b = d2.b(e4.x(t, j));
                    i2 = i + b;
                    break;
                case 17:
                    Object B2 = e4.B(t, j);
                    if (B2 != null) {
                        i5 = B2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
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
                    b = e4.B(t, j).hashCode();
                    i2 = i + b;
                    break;
                case 50:
                    i = i2 * 53;
                    b = e4.B(t, j).hashCode();
                    i2 = i + b;
                    break;
                case 51:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = d2.b(Double.doubleToLongBits(i(t, j)));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = Float.floatToIntBits(A(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = d2.b(K(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = d2.b(K(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = G(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = d2.b(K(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = G(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = d2.c(O(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = ((String) e4.B(t, j)).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = e4.B(t, j).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = e4.B(t, j).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = G(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = G(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = G(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = d2.b(K(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = G(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = d2.b(K(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (I(t, i4, i3)) {
                        i = i2 * 53;
                        b = e4.B(t, j).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.o.k(t).hashCode();
        if (this.f) {
            return (hashCode * 53) + this.p.b(t).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void e(T t, T t2) {
        Q(t);
        t2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int F = F(i);
            long j = 1048575 & F;
            int i2 = this.a[i];
            switch ((F & 267386880) >>> 20) {
                case 0:
                    if (H(t2, i)) {
                        e4.f(t, j, e4.a(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (H(t2, i)) {
                        e4.g(t, j, e4.n(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (H(t2, i)) {
                        e4.i(t, j, e4.x(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (H(t2, i)) {
                        e4.i(t, j, e4.x(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (H(t2, i)) {
                        e4.h(t, j, e4.t(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (H(t2, i)) {
                        e4.i(t, j, e4.x(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (H(t2, i)) {
                        e4.h(t, j, e4.t(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (H(t2, i)) {
                        e4.v(t, j, e4.F(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (H(t2, i)) {
                        e4.j(t, j, e4.B(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    x(t, t2, i);
                    break;
                case 10:
                    if (H(t2, i)) {
                        e4.j(t, j, e4.B(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (H(t2, i)) {
                        e4.h(t, j, e4.t(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (H(t2, i)) {
                        e4.h(t, j, e4.t(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (H(t2, i)) {
                        e4.h(t, j, e4.t(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (H(t2, i)) {
                        e4.i(t, j, e4.x(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (H(t2, i)) {
                        e4.h(t, j, e4.t(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (H(t2, i)) {
                        e4.i(t, j, e4.x(t2, j));
                        C(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    x(t, t2, i);
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
                    this.n.b(t, t2, j);
                    break;
                case 50:
                    k3.m(this.q, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (I(t2, i2, i)) {
                        e4.j(t, j, e4.B(t2, j));
                        D(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    E(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (I(t2, i2, i)) {
                        e4.j(t, j, e4.B(t2, j));
                        D(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    E(t, t2, i);
                    break;
            }
        }
        k3.n(this.o, t, t2);
        if (this.f) {
            k3.l(this.p, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void f(T t, byte[] bArr, int i, int i2, c1 c1Var) throws IOException {
        l(t, bArr, i, i2, 0, c1Var);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final boolean g(T t, T t2) {
        boolean p;
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int F = F(i);
            long j = F & 1048575;
            switch ((F & 267386880) >>> 20) {
                case 0:
                    if (J(t, t2, i) && Double.doubleToLongBits(e4.a(t, j)) == Double.doubleToLongBits(e4.a(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (J(t, t2, i) && Float.floatToIntBits(e4.n(t, j)) == Float.floatToIntBits(e4.n(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (J(t, t2, i) && e4.x(t, j) == e4.x(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (J(t, t2, i) && e4.x(t, j) == e4.x(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (J(t, t2, i) && e4.t(t, j) == e4.t(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (J(t, t2, i) && e4.x(t, j) == e4.x(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (J(t, t2, i) && e4.t(t, j) == e4.t(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (J(t, t2, i) && e4.F(t, j) == e4.F(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (J(t, t2, i) && k3.p(e4.B(t, j), e4.B(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (J(t, t2, i) && k3.p(e4.B(t, j), e4.B(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (J(t, t2, i) && k3.p(e4.B(t, j), e4.B(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (J(t, t2, i) && e4.t(t, j) == e4.t(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (J(t, t2, i) && e4.t(t, j) == e4.t(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (J(t, t2, i) && e4.t(t, j) == e4.t(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (J(t, t2, i) && e4.x(t, j) == e4.x(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (J(t, t2, i) && e4.t(t, j) == e4.t(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (J(t, t2, i) && e4.x(t, j) == e4.x(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (J(t, t2, i) && k3.p(e4.B(t, j), e4.B(t2, j))) {
                        continue;
                    }
                    return false;
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
                    p = k3.p(e4.B(t, j), e4.B(t2, j));
                    break;
                case 50:
                    p = k3.p(e4.B(t, j), e4.B(t2, j));
                    break;
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
                    long B = B(i) & 1048575;
                    if (e4.t(t, B) == e4.t(t2, B) && k3.p(e4.B(t, j), e4.B(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!p) {
                return false;
            }
        }
        if (!this.o.k(t).equals(this.o.k(t2))) {
            return false;
        }
        if (this.f) {
            return this.p.b(t).equals(this.p.b(t2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0b90  */
    @Override // com.google.android.gms.internal.measurement.j3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(T r24, com.google.android.gms.internal.measurement.k4 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.z2.h(java.lang.Object, com.google.android.gms.internal.measurement.k4):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0c0b, code lost:
        if (r14 == 1048575) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0c0d, code lost:
        r29.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0c13, code lost:
        r12 = r31.k;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0c1a, code lost:
        if (r12 >= r31.l) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0c1c, code lost:
        r3 = (com.google.android.gms.internal.measurement.a4) q(r32, r31.j[r12], r3, r31.o, r32);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0c32, code lost:
        if (r3 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0c34, code lost:
        r31.o.h(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0c39, code lost:
        if (r9 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0c3b, code lost:
        if (r8 != r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0c42, code lost:
        throw com.google.android.gms.internal.measurement.zzjq.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0c43, code lost:
        if (r8 > r10) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0c45, code lost:
        if (r11 != r9) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0c47, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0c4c, code lost:
        throw com.google.android.gms.internal.measurement.zzjq.e();
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0668  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x058a -> B:193:0x058b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:224:0x0617 -> B:225:0x0618). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:244:0x0665 -> B:245:0x0666). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.measurement.c1 r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.z2.l(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.c1):int");
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final T zza() {
        return (T) this.m.a(this.e);
    }
}
