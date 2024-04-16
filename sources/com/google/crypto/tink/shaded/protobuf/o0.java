package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.f0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k1;
import com.google.crypto.tink.shaded.protobuf.y;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MessageSchema.java */
/* loaded from: classes2.dex */
public final class o0<T> implements y0<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = h1.D();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final m0 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final q0 m;
    private final c0 n;
    private final e1<?, ?> o;
    private final p<?> p;
    private final h0 q;

    private o0(int[] iArr, Object[] objArr, int i, int i2, m0 m0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, q0 q0Var, c0 c0Var, e1<?, ?> e1Var, p<?> pVar, h0 h0Var) {
        boolean z3;
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = m0Var instanceof w;
        this.h = z;
        if (pVar != null && pVar.e(m0Var)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f = z3;
        this.i = z2;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = q0Var;
        this.n = c0Var;
        this.o = e1Var;
        this.p = pVar;
        this.e = m0Var;
        this.q = h0Var;
    }

    private static boolean A(int i) {
        if ((i & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private boolean B(T t, int i) {
        int h0 = h0(i);
        long j = 1048575 & h0;
        if (j == 1048575) {
            int r0 = r0(i);
            long U = U(r0);
            switch (q0(r0)) {
                case 0:
                    if (Double.doubleToRawLongBits(h1.x(t, U)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(h1.y(t, U)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (h1.A(t, U) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (h1.A(t, U) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (h1.z(t, U) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (h1.A(t, U) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (h1.z(t, U) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return h1.r(t, U);
                case 8:
                    Object C = h1.C(t, U);
                    if (C instanceof String) {
                        return !((String) C).isEmpty();
                    }
                    if (C instanceof h) {
                        return !h.b.equals(C);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (h1.C(t, U) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !h.b.equals(h1.C(t, U));
                case 11:
                    if (h1.z(t, U) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (h1.z(t, U) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (h1.z(t, U) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (h1.A(t, U) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (h1.z(t, U) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (h1.A(t, U) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (h1.C(t, U) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((h1.z(t, j) & (1 << (h0 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private boolean C(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return B(t, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean D(Object obj, int i, y0 y0Var) {
        return y0Var.c(h1.C(obj, U(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean E(Object obj, int i, int i2) {
        List list = (List) h1.C(obj, U(i));
        if (list.isEmpty()) {
            return true;
        }
        y0 u = u(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!u.c(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    private boolean F(T t, int i, int i2) {
        if (this.q.e(h1.C(t, U(i))).isEmpty()) {
            return true;
        }
        this.q.b(t(i2));
        throw null;
    }

    private boolean G(T t, T t2, int i) {
        long h0 = h0(i) & 1048575;
        if (h1.z(t, h0) == h1.z(t2, h0)) {
            return true;
        }
        return false;
    }

    private boolean H(T t, int i, int i2) {
        if (h1.z(t, h0(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean I(int i) {
        if ((i & 268435456) != 0) {
            return true;
        }
        return false;
    }

    private static List<?> J(Object obj, long j) {
        return (List) h1.C(obj, j);
    }

    private static <T> long K(T t, long j) {
        return h1.A(t, j);
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
        r13 = p(r19, r16.j[r0], r13, r17);
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
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.t.b<ET>> void L(com.google.crypto.tink.shaded.protobuf.e1<UT, UB> r17, com.google.crypto.tink.shaded.protobuf.p<ET> r18, T r19, com.google.crypto.tink.shaded.protobuf.x0 r20, com.google.crypto.tink.shaded.protobuf.o r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o0.L(com.google.crypto.tink.shaded.protobuf.e1, com.google.crypto.tink.shaded.protobuf.p, java.lang.Object, com.google.crypto.tink.shaded.protobuf.x0, com.google.crypto.tink.shaded.protobuf.o):void");
    }

    private final <K, V> void M(Object obj, int i, Object obj2, o oVar, x0 x0Var) throws IOException {
        long U = U(r0(i));
        Object C = h1.C(obj, U);
        if (C == null) {
            C = this.q.d(obj2);
            h1.R(obj, U, C);
        } else if (this.q.h(C)) {
            Object d = this.q.d(obj2);
            this.q.a(d, C);
            h1.R(obj, U, d);
            C = d;
        }
        Map<?, ?> c = this.q.c(C);
        this.q.b(obj2);
        x0Var.L(c, null, oVar);
    }

    private void N(T t, T t2, int i) {
        long U = U(r0(i));
        if (!B(t2, i)) {
            return;
        }
        Object C = h1.C(t, U);
        Object C2 = h1.C(t2, U);
        if (C != null && C2 != null) {
            h1.R(t, U, y.h(C, C2));
            n0(t, i);
        } else if (C2 != null) {
            h1.R(t, U, C2);
            n0(t, i);
        }
    }

    private void O(T t, T t2, int i) {
        Object obj;
        int r0 = r0(i);
        int T = T(i);
        long U = U(r0);
        if (!H(t2, T, i)) {
            return;
        }
        if (H(t, T, i)) {
            obj = h1.C(t, U);
        } else {
            obj = null;
        }
        Object C = h1.C(t2, U);
        if (obj != null && C != null) {
            h1.R(t, U, y.h(obj, C));
            o0(t, T, i);
        } else if (C != null) {
            h1.R(t, U, C);
            o0(t, T, i);
        }
    }

    private void P(T t, T t2, int i) {
        int r0 = r0(i);
        long U = U(r0);
        int T = T(i);
        switch (q0(r0)) {
            case 0:
                if (B(t2, i)) {
                    h1.N(t, U, h1.x(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 1:
                if (B(t2, i)) {
                    h1.O(t, U, h1.y(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 2:
                if (B(t2, i)) {
                    h1.Q(t, U, h1.A(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 3:
                if (B(t2, i)) {
                    h1.Q(t, U, h1.A(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 4:
                if (B(t2, i)) {
                    h1.P(t, U, h1.z(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 5:
                if (B(t2, i)) {
                    h1.Q(t, U, h1.A(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 6:
                if (B(t2, i)) {
                    h1.P(t, U, h1.z(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 7:
                if (B(t2, i)) {
                    h1.H(t, U, h1.r(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 8:
                if (B(t2, i)) {
                    h1.R(t, U, h1.C(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 9:
                N(t, t2, i);
                return;
            case 10:
                if (B(t2, i)) {
                    h1.R(t, U, h1.C(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 11:
                if (B(t2, i)) {
                    h1.P(t, U, h1.z(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 12:
                if (B(t2, i)) {
                    h1.P(t, U, h1.z(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 13:
                if (B(t2, i)) {
                    h1.P(t, U, h1.z(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 14:
                if (B(t2, i)) {
                    h1.Q(t, U, h1.A(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 15:
                if (B(t2, i)) {
                    h1.P(t, U, h1.z(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 16:
                if (B(t2, i)) {
                    h1.Q(t, U, h1.A(t2, U));
                    n0(t, i);
                    return;
                }
                return;
            case 17:
                N(t, t2, i);
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
                this.n.d(t, t2, U);
                return;
            case 50:
                a1.F(this.q, t, t2, U);
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
                if (H(t2, T, i)) {
                    h1.R(t, U, h1.C(t2, U));
                    o0(t, T, i);
                    return;
                }
                return;
            case 60:
                O(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (H(t2, T, i)) {
                    h1.R(t, U, h1.C(t2, U));
                    o0(t, T, i);
                    return;
                }
                return;
            case 68:
                O(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> o0<T> Q(Class<T> cls, k0 k0Var, q0 q0Var, c0 c0Var, e1<?, ?> e1Var, p<?> pVar, h0 h0Var) {
        if (k0Var instanceof w0) {
            return S((w0) k0Var, q0Var, c0Var, e1Var, pVar, h0Var);
        }
        return R((c1) k0Var, q0Var, c0Var, e1Var, pVar, h0Var);
    }

    static <T> o0<T> R(c1 c1Var, q0 q0Var, c0 c0Var, e1<?, ?> e1Var, p<?> pVar, h0 h0Var) {
        boolean z;
        if (c1Var.c() == mr8.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        s[] e = c1Var.e();
        if (e.length == 0) {
            int length = e.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (e.length <= 0) {
                int[] d = c1Var.d();
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
                    return new o0<>(iArr, objArr, 0, 0, c1Var.b(), z, true, iArr4, d.length, d.length + iArr2.length, q0Var, c0Var, e1Var, pVar, h0Var);
                }
                s sVar = e[0];
                throw null;
            }
            s sVar2 = e[0];
            throw null;
        }
        s sVar3 = e[0];
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
    static <T> com.google.crypto.tink.shaded.protobuf.o0<T> S(com.google.crypto.tink.shaded.protobuf.w0 r33, com.google.crypto.tink.shaded.protobuf.q0 r34, com.google.crypto.tink.shaded.protobuf.c0 r35, com.google.crypto.tink.shaded.protobuf.e1<?, ?> r36, com.google.crypto.tink.shaded.protobuf.p<?> r37, com.google.crypto.tink.shaded.protobuf.h0 r38) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o0.S(com.google.crypto.tink.shaded.protobuf.w0, com.google.crypto.tink.shaded.protobuf.q0, com.google.crypto.tink.shaded.protobuf.c0, com.google.crypto.tink.shaded.protobuf.e1, com.google.crypto.tink.shaded.protobuf.p, com.google.crypto.tink.shaded.protobuf.h0):com.google.crypto.tink.shaded.protobuf.o0");
    }

    private int T(int i) {
        return this.a[i];
    }

    private static long U(int i) {
        return i & 1048575;
    }

    private static <T> boolean V(T t, long j) {
        return ((Boolean) h1.C(t, j)).booleanValue();
    }

    private static <T> double W(T t, long j) {
        return ((Double) h1.C(t, j)).doubleValue();
    }

    private static <T> float X(T t, long j) {
        return ((Float) h1.C(t, j)).floatValue();
    }

    private static <T> int Y(T t, long j) {
        return ((Integer) h1.C(t, j)).intValue();
    }

    private static <T> long Z(T t, long j) {
        return ((Long) h1.C(t, j)).longValue();
    }

    private <K, V> int a0(T t, byte[] bArr, int i, int i2, int i3, long j, e.b bVar) throws IOException {
        Unsafe unsafe = s;
        Object t2 = t(i3);
        Object object = unsafe.getObject(t, j);
        if (this.q.h(object)) {
            Object d = this.q.d(t2);
            this.q.a(d, object);
            unsafe.putObject(t, j, d);
            object = d;
        }
        this.q.b(t2);
        return m(bArr, i, i2, null, this.q.c(object), bVar);
    }

    private int b0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, e.b bVar) throws IOException {
        Unsafe unsafe = s;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(e.d(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(e.l(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int L = e.L(bArr, i, bVar);
                    unsafe.putObject(t, j, Long.valueOf(bVar.b));
                    unsafe.putInt(t, j2, i4);
                    return L;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int I = e.I(bArr, i, bVar);
                    unsafe.putObject(t, j, Integer.valueOf(bVar.a));
                    unsafe.putInt(t, j2, i4);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(e.j(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(e.h(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int L2 = e.L(bArr, i, bVar);
                    unsafe.putObject(t, j, Boolean.valueOf(bVar.b != 0));
                    unsafe.putInt(t, j2, i4);
                    return L2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int I2 = e.I(bArr, i, bVar);
                    int i13 = bVar.a;
                    if (i13 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !i1.n(bArr, I2, I2 + i13)) {
                        throw InvalidProtocolBufferException.d();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, I2, i13, y.b));
                        I2 += i13;
                    }
                    unsafe.putInt(t, j2, i4);
                    return I2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int p = e.p(u(i8), bArr, i, i2, bVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, bVar.c);
                    } else {
                        unsafe.putObject(t, j, y.h(object, bVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return p;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int b = e.b(bArr, i, bVar);
                    unsafe.putObject(t, j, bVar.c);
                    unsafe.putInt(t, j2, i4);
                    return b;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int I3 = e.I(bArr, i, bVar);
                    int i14 = bVar.a;
                    y.e s2 = s(i8);
                    if (s2 != null && !s2.a(i14)) {
                        v(t).m(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(t, j, Integer.valueOf(i14));
                        unsafe.putInt(t, j2, i4);
                    }
                    return I3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int I4 = e.I(bArr, i, bVar);
                    unsafe.putObject(t, j, Integer.valueOf(i.b(bVar.a)));
                    unsafe.putInt(t, j2, i4);
                    return I4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int L3 = e.L(bArr, i, bVar);
                    unsafe.putObject(t, j, Long.valueOf(i.c(bVar.b)));
                    unsafe.putInt(t, j2, i4);
                    return L3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int n = e.n(u(i8), bArr, i, i2, (i3 & (-8)) | 4, bVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, bVar.c);
                    } else {
                        unsafe.putObject(t, j, y.h(object2, bVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return n;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0295, code lost:
        if (r0 != r15) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0297, code lost:
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r6 = r23;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ad, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02e3, code lost:
        if (r0 != r15) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0302, code lost:
        if (r0 != r15) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int d0(T r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.e.b r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o0.d0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    private int e0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, e.b bVar) throws IOException {
        int J;
        Unsafe unsafe = s;
        y.i iVar = (y.i) unsafe.getObject(t, j2);
        if (!iVar.o()) {
            int size = iVar.size();
            iVar = iVar.i(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, iVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return e.s(bArr, i, iVar, bVar);
                }
                if (i5 == 1) {
                    return e.e(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return e.v(bArr, i, iVar, bVar);
                }
                if (i5 == 5) {
                    return e.m(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return e.z(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return e.M(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return e.y(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return e.J(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return e.u(bArr, i, iVar, bVar);
                }
                if (i5 == 1) {
                    return e.k(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return e.t(bArr, i, iVar, bVar);
                }
                if (i5 == 5) {
                    return e.i(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return e.r(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return e.a(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        return e.D(i3, bArr, i, i2, iVar, bVar);
                    }
                    return e.E(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return e.q(u(i6), i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    return e.c(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    J = e.y(bArr, i, iVar, bVar);
                } else if (i5 == 0) {
                    J = e.J(i3, bArr, i, i2, iVar, bVar);
                }
                w wVar = (w) t;
                f1 f1Var = wVar.unknownFields;
                if (f1Var == f1.c()) {
                    f1Var = null;
                }
                f1 f1Var2 = (f1) a1.A(i4, iVar, s(i6), f1Var, this.o);
                if (f1Var2 != null) {
                    wVar.unknownFields = f1Var2;
                }
                return J;
            case 33:
            case 47:
                if (i5 == 2) {
                    return e.w(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return e.A(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return e.x(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return e.B(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return e.o(u(i6), i3, bArr, i, i2, iVar, bVar);
                }
                break;
        }
        return i;
    }

    private int f0(int i) {
        if (i >= this.c && i <= this.d) {
            return p0(i, 0);
        }
        return -1;
    }

    private int g0(int i, int i2) {
        if (i >= this.c && i <= this.d) {
            return p0(i, i2);
        }
        return -1;
    }

    private int h0(int i) {
        return this.a[i + 2];
    }

    private <E> void i0(Object obj, long j, x0 x0Var, y0<E> y0Var, o oVar) throws IOException {
        x0Var.P(this.n.e(obj, j), y0Var, oVar);
    }

    private <E> void j0(Object obj, int i, x0 x0Var, y0<E> y0Var, o oVar) throws IOException {
        x0Var.M(this.n.e(obj, U(i)), y0Var, oVar);
    }

    private boolean k(T t, T t2, int i) {
        if (B(t, i) == B(t2, i)) {
            return true;
        }
        return false;
    }

    private void k0(Object obj, int i, x0 x0Var) throws IOException {
        if (A(i)) {
            h1.R(obj, U(i), x0Var.I());
        } else if (this.g) {
            h1.R(obj, U(i), x0Var.z());
        } else {
            h1.R(obj, U(i), x0Var.o());
        }
    }

    private static <T> boolean l(T t, long j) {
        return h1.r(t, j);
    }

    private void l0(Object obj, int i, x0 x0Var) throws IOException {
        if (A(i)) {
            x0Var.n(this.n.e(obj, U(i)));
        } else {
            x0Var.B(this.n.e(obj, U(i)));
        }
    }

    private <K, V> int m(byte[] bArr, int i, int i2, f0.a<K, V> aVar, Map<K, V> map, e.b bVar) throws IOException {
        int I = e.I(bArr, i, bVar);
        int i3 = bVar.a;
        if (i3 >= 0 && i3 <= i2 - I) {
            throw null;
        }
        throw InvalidProtocolBufferException.m();
    }

    private static Field m0(Class<?> cls, String str) {
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

    private static <T> double n(T t, long j) {
        return h1.x(t, j);
    }

    private void n0(T t, int i) {
        int h0 = h0(i);
        long j = 1048575 & h0;
        if (j == 1048575) {
            return;
        }
        h1.P(t, j, (1 << (h0 >>> 20)) | h1.z(t, j));
    }

    private boolean o(T t, T t2, int i) {
        int r0 = r0(i);
        long U = U(r0);
        switch (q0(r0)) {
            case 0:
                if (!k(t, t2, i) || Double.doubleToLongBits(h1.x(t, U)) != Double.doubleToLongBits(h1.x(t2, U))) {
                    return false;
                }
                return true;
            case 1:
                if (!k(t, t2, i) || Float.floatToIntBits(h1.y(t, U)) != Float.floatToIntBits(h1.y(t2, U))) {
                    return false;
                }
                return true;
            case 2:
                if (!k(t, t2, i) || h1.A(t, U) != h1.A(t2, U)) {
                    return false;
                }
                return true;
            case 3:
                if (!k(t, t2, i) || h1.A(t, U) != h1.A(t2, U)) {
                    return false;
                }
                return true;
            case 4:
                if (!k(t, t2, i) || h1.z(t, U) != h1.z(t2, U)) {
                    return false;
                }
                return true;
            case 5:
                if (!k(t, t2, i) || h1.A(t, U) != h1.A(t2, U)) {
                    return false;
                }
                return true;
            case 6:
                if (!k(t, t2, i) || h1.z(t, U) != h1.z(t2, U)) {
                    return false;
                }
                return true;
            case 7:
                if (!k(t, t2, i) || h1.r(t, U) != h1.r(t2, U)) {
                    return false;
                }
                return true;
            case 8:
                if (!k(t, t2, i) || !a1.K(h1.C(t, U), h1.C(t2, U))) {
                    return false;
                }
                return true;
            case 9:
                if (!k(t, t2, i) || !a1.K(h1.C(t, U), h1.C(t2, U))) {
                    return false;
                }
                return true;
            case 10:
                if (!k(t, t2, i) || !a1.K(h1.C(t, U), h1.C(t2, U))) {
                    return false;
                }
                return true;
            case 11:
                if (!k(t, t2, i) || h1.z(t, U) != h1.z(t2, U)) {
                    return false;
                }
                return true;
            case 12:
                if (!k(t, t2, i) || h1.z(t, U) != h1.z(t2, U)) {
                    return false;
                }
                return true;
            case 13:
                if (!k(t, t2, i) || h1.z(t, U) != h1.z(t2, U)) {
                    return false;
                }
                return true;
            case 14:
                if (!k(t, t2, i) || h1.A(t, U) != h1.A(t2, U)) {
                    return false;
                }
                return true;
            case 15:
                if (!k(t, t2, i) || h1.z(t, U) != h1.z(t2, U)) {
                    return false;
                }
                return true;
            case 16:
                if (!k(t, t2, i) || h1.A(t, U) != h1.A(t2, U)) {
                    return false;
                }
                return true;
            case 17:
                if (!k(t, t2, i) || !a1.K(h1.C(t, U), h1.C(t2, U))) {
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
                return a1.K(h1.C(t, U), h1.C(t2, U));
            case 50:
                return a1.K(h1.C(t, U), h1.C(t2, U));
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
                if (!G(t, t2, i) || !a1.K(h1.C(t, U), h1.C(t2, U))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    private void o0(T t, int i, int i2) {
        h1.P(t, h0(i2) & 1048575, i);
    }

    private final <UT, UB> UB p(Object obj, int i, UB ub, e1<UT, UB> e1Var) {
        int T = T(i);
        Object C = h1.C(obj, U(r0(i)));
        if (C == null) {
            return ub;
        }
        y.e s2 = s(i);
        if (s2 == null) {
            return ub;
        }
        return (UB) q(i, T, this.q.c(C), s2, ub, e1Var);
    }

    private int p0(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int T = T(i4);
            if (i == T) {
                return i4;
            }
            if (i < T) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final <K, V, UT, UB> UB q(int i, int i2, Map<K, V> map, y.e eVar, UB ub, e1<UT, UB> e1Var) {
        this.q.b(t(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = e1Var.n();
                }
                h.C0239h Q = h.Q(f0.b(null, next.getKey(), next.getValue()));
                try {
                    f0.d(Q.b(), null, next.getKey(), next.getValue());
                    e1Var.d(ub, i2, Q.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static int q0(int i) {
        return (i & 267386880) >>> 20;
    }

    private static <T> float r(T t, long j) {
        return h1.y(t, j);
    }

    private int r0(int i) {
        return this.a[i + 1];
    }

    private y.e s(int i) {
        return (y.e) this.b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0491  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void s0(T r18, com.google.crypto.tink.shaded.protobuf.k1 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o0.s0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.k1):void");
    }

    private Object t(int i) {
        return this.b[(i / 3) * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t0(T r13, com.google.crypto.tink.shaded.protobuf.k1 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o0.t0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.k1):void");
    }

    private y0 u(int i) {
        int i2 = (i / 3) * 2;
        y0 y0Var = (y0) this.b[i2];
        if (y0Var != null) {
            return y0Var;
        }
        y0<T> d = u0.a().d((Class) this.b[i2 + 1]);
        this.b[i2] = d;
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void u0(T r11, com.google.crypto.tink.shaded.protobuf.k1 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o0.u0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.k1):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f1 v(Object obj) {
        w wVar = (w) obj;
        f1 f1Var = wVar.unknownFields;
        if (f1Var == f1.c()) {
            f1 j = f1.j();
            wVar.unknownFields = j;
            return j;
        }
        return f1Var;
    }

    private <K, V> void v0(k1 k1Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.q.b(t(i2));
            k1Var.J(i, null, this.q.e(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int w(T t) {
        int i;
        int i2;
        int i3;
        int d;
        int K;
        int i4;
        int U;
        int W;
        Unsafe unsafe = s;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        int i9 = 0;
        while (i6 < this.a.length) {
            int r0 = r0(i6);
            int T = T(i6);
            int q0 = q0(r0);
            if (q0 <= 17) {
                i = this.a[i6 + 2];
                int i10 = i & i5;
                i2 = 1 << (i >>> 20);
                if (i10 != i8) {
                    i9 = unsafe.getInt(t, i10);
                    i8 = i10;
                }
            } else {
                i = (!this.i || q0 < qs3.a5.a() || q0 > qs3.n5.a()) ? 0 : this.a[i6 + 2] & i5;
                i2 = 0;
            }
            long U2 = U(r0);
            switch (q0) {
                case 0:
                    if ((i9 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.i(T, 0.0d);
                        i7 += i3;
                        break;
                    }
                case 1:
                    if ((i9 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.q(T, 0.0f);
                        i7 += i3;
                        break;
                    }
                case 2:
                    if ((i9 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.x(T, unsafe.getLong(t, U2));
                        i7 += i3;
                        break;
                    }
                case 3:
                    if ((i9 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.X(T, unsafe.getLong(t, U2));
                        i7 += i3;
                        break;
                    }
                case 4:
                    if ((i9 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.v(T, unsafe.getInt(t, U2));
                        i7 += i3;
                        break;
                    }
                case 5:
                    if ((i9 & i2) == 0) {
                        break;
                    } else {
                        i3 = CodedOutputStream.o(T, 0L);
                        i7 += i3;
                        break;
                    }
                case 6:
                    if ((i9 & i2) != 0) {
                        i3 = CodedOutputStream.m(T, 0);
                        i7 += i3;
                        break;
                    }
                    break;
                case 7:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.d(T, true);
                        i7 += d;
                    }
                    break;
                case 8:
                    if ((i9 & i2) != 0) {
                        Object object = unsafe.getObject(t, U2);
                        if (object instanceof h) {
                            d = CodedOutputStream.g(T, (h) object);
                        } else {
                            d = CodedOutputStream.S(T, (String) object);
                        }
                        i7 += d;
                    }
                    break;
                case 9:
                    if ((i9 & i2) != 0) {
                        d = a1.o(T, unsafe.getObject(t, U2), u(i6));
                        i7 += d;
                    }
                    break;
                case 10:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.g(T, (h) unsafe.getObject(t, U2));
                        i7 += d;
                    }
                    break;
                case 11:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.V(T, unsafe.getInt(t, U2));
                        i7 += d;
                    }
                    break;
                case 12:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.k(T, unsafe.getInt(t, U2));
                        i7 += d;
                    }
                    break;
                case 13:
                    if ((i9 & i2) != 0) {
                        K = CodedOutputStream.K(T, 0);
                        i7 += K;
                    }
                    break;
                case 14:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.M(T, 0L);
                        i7 += d;
                    }
                    break;
                case 15:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.O(T, unsafe.getInt(t, U2));
                        i7 += d;
                    }
                    break;
                case 16:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.Q(T, unsafe.getLong(t, U2));
                        i7 += d;
                    }
                    break;
                case 17:
                    if ((i9 & i2) != 0) {
                        d = CodedOutputStream.s(T, (m0) unsafe.getObject(t, U2), u(i6));
                        i7 += d;
                    }
                    break;
                case 18:
                    d = a1.h(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 19:
                    d = a1.f(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 20:
                    d = a1.m(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 21:
                    d = a1.x(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 22:
                    d = a1.k(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 23:
                    d = a1.h(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 24:
                    d = a1.f(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 25:
                    d = a1.a(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 26:
                    d = a1.u(T, (List) unsafe.getObject(t, U2));
                    i7 += d;
                    break;
                case 27:
                    d = a1.p(T, (List) unsafe.getObject(t, U2), u(i6));
                    i7 += d;
                    break;
                case 28:
                    d = a1.c(T, (List) unsafe.getObject(t, U2));
                    i7 += d;
                    break;
                case 29:
                    d = a1.v(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 30:
                    d = a1.d(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 31:
                    d = a1.f(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 32:
                    d = a1.h(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 33:
                    d = a1.q(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 34:
                    d = a1.s(T, (List) unsafe.getObject(t, U2), false);
                    i7 += d;
                    break;
                case 35:
                    i4 = a1.i((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 36:
                    i4 = a1.g((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 37:
                    i4 = a1.n((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 38:
                    i4 = a1.y((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 39:
                    i4 = a1.l((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 40:
                    i4 = a1.i((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 41:
                    i4 = a1.g((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 42:
                    i4 = a1.b((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 43:
                    i4 = a1.w((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 44:
                    i4 = a1.e((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 45:
                    i4 = a1.g((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 46:
                    i4 = a1.i((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 47:
                    i4 = a1.r((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 48:
                    i4 = a1.t((List) unsafe.getObject(t, U2));
                    if (i4 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i4);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i4);
                        K = U + W + i4;
                        i7 += K;
                    }
                    break;
                case 49:
                    d = a1.j(T, (List) unsafe.getObject(t, U2), u(i6));
                    i7 += d;
                    break;
                case 50:
                    d = this.q.g(T, unsafe.getObject(t, U2), t(i6));
                    i7 += d;
                    break;
                case 51:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.i(T, 0.0d);
                        i7 += d;
                    }
                    break;
                case 52:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.q(T, 0.0f);
                        i7 += d;
                    }
                    break;
                case 53:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.x(T, Z(t, U2));
                        i7 += d;
                    }
                    break;
                case 54:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.X(T, Z(t, U2));
                        i7 += d;
                    }
                    break;
                case 55:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.v(T, Y(t, U2));
                        i7 += d;
                    }
                    break;
                case 56:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.o(T, 0L);
                        i7 += d;
                    }
                    break;
                case 57:
                    if (H(t, T, i6)) {
                        K = CodedOutputStream.m(T, 0);
                        i7 += K;
                    }
                    break;
                case 58:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.d(T, true);
                        i7 += d;
                    }
                    break;
                case 59:
                    if (H(t, T, i6)) {
                        Object object2 = unsafe.getObject(t, U2);
                        if (object2 instanceof h) {
                            d = CodedOutputStream.g(T, (h) object2);
                        } else {
                            d = CodedOutputStream.S(T, (String) object2);
                        }
                        i7 += d;
                    }
                    break;
                case 60:
                    if (H(t, T, i6)) {
                        d = a1.o(T, unsafe.getObject(t, U2), u(i6));
                        i7 += d;
                    }
                    break;
                case 61:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.g(T, (h) unsafe.getObject(t, U2));
                        i7 += d;
                    }
                    break;
                case 62:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.V(T, Y(t, U2));
                        i7 += d;
                    }
                    break;
                case 63:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.k(T, Y(t, U2));
                        i7 += d;
                    }
                    break;
                case 64:
                    if (H(t, T, i6)) {
                        K = CodedOutputStream.K(T, 0);
                        i7 += K;
                    }
                    break;
                case 65:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.M(T, 0L);
                        i7 += d;
                    }
                    break;
                case 66:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.O(T, Y(t, U2));
                        i7 += d;
                    }
                    break;
                case 67:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.Q(T, Z(t, U2));
                        i7 += d;
                    }
                    break;
                case 68:
                    if (H(t, T, i6)) {
                        d = CodedOutputStream.s(T, (m0) unsafe.getObject(t, U2), u(i6));
                        i7 += d;
                    }
                    break;
            }
            i6 += 3;
            i5 = 1048575;
        }
        int y = i7 + y(this.o, t);
        return this.f ? y + this.p.c(t).l() : y;
    }

    private void w0(int i, Object obj, k1 k1Var) throws IOException {
        if (obj instanceof String) {
            k1Var.e(i, (String) obj);
        } else {
            k1Var.M(i, (h) obj);
        }
    }

    private int x(T t) {
        int i;
        int i2;
        int i3;
        int U;
        int W;
        Unsafe unsafe = s;
        int i4 = 0;
        for (int i5 = 0; i5 < this.a.length; i5 += 3) {
            int r0 = r0(i5);
            int q0 = q0(r0);
            int T = T(i5);
            long U2 = U(r0);
            if (q0 >= qs3.a5.a() && q0 <= qs3.n5.a()) {
                i = this.a[i5 + 2] & 1048575;
            } else {
                i = 0;
            }
            switch (q0) {
                case 0:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.i(T, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.q(T, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.x(T, h1.A(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.X(T, h1.A(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.v(T, h1.z(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.o(T, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.m(T, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.d(T, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (B(t, i5)) {
                        Object C = h1.C(t, U2);
                        if (C instanceof h) {
                            i2 = CodedOutputStream.g(T, (h) C);
                            break;
                        } else {
                            i2 = CodedOutputStream.S(T, (String) C);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (B(t, i5)) {
                        i2 = a1.o(T, h1.C(t, U2), u(i5));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.g(T, (h) h1.C(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.V(T, h1.z(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.k(T, h1.z(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.K(T, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.M(T, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.O(T, h1.z(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.Q(T, h1.A(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (B(t, i5)) {
                        i2 = CodedOutputStream.s(T, (m0) h1.C(t, U2), u(i5));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i2 = a1.h(T, J(t, U2), false);
                    break;
                case 19:
                    i2 = a1.f(T, J(t, U2), false);
                    break;
                case 20:
                    i2 = a1.m(T, J(t, U2), false);
                    break;
                case 21:
                    i2 = a1.x(T, J(t, U2), false);
                    break;
                case 22:
                    i2 = a1.k(T, J(t, U2), false);
                    break;
                case 23:
                    i2 = a1.h(T, J(t, U2), false);
                    break;
                case 24:
                    i2 = a1.f(T, J(t, U2), false);
                    break;
                case 25:
                    i2 = a1.a(T, J(t, U2), false);
                    break;
                case 26:
                    i2 = a1.u(T, J(t, U2));
                    break;
                case 27:
                    i2 = a1.p(T, J(t, U2), u(i5));
                    break;
                case 28:
                    i2 = a1.c(T, J(t, U2));
                    break;
                case 29:
                    i2 = a1.v(T, J(t, U2), false);
                    break;
                case 30:
                    i2 = a1.d(T, J(t, U2), false);
                    break;
                case 31:
                    i2 = a1.f(T, J(t, U2), false);
                    break;
                case 32:
                    i2 = a1.h(T, J(t, U2), false);
                    break;
                case 33:
                    i2 = a1.q(T, J(t, U2), false);
                    break;
                case 34:
                    i2 = a1.s(T, J(t, U2), false);
                    break;
                case 35:
                    i3 = a1.i((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    i3 = a1.g((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    i3 = a1.n((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    i3 = a1.y((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    i3 = a1.l((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    i3 = a1.i((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    i3 = a1.g((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    i3 = a1.b((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    i3 = a1.w((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    i3 = a1.e((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    i3 = a1.g((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    i3 = a1.i((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    i3 = a1.r((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    i3 = a1.t((List) unsafe.getObject(t, U2));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        U = CodedOutputStream.U(T);
                        W = CodedOutputStream.W(i3);
                        i2 = U + W + i3;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    i2 = a1.j(T, J(t, U2), u(i5));
                    break;
                case 50:
                    i2 = this.q.g(T, h1.C(t, U2), t(i5));
                    break;
                case 51:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.i(T, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.q(T, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.x(T, Z(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.X(T, Z(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.v(T, Y(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.o(T, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.m(T, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.d(T, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (H(t, T, i5)) {
                        Object C2 = h1.C(t, U2);
                        if (C2 instanceof h) {
                            i2 = CodedOutputStream.g(T, (h) C2);
                            break;
                        } else {
                            i2 = CodedOutputStream.S(T, (String) C2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (H(t, T, i5)) {
                        i2 = a1.o(T, h1.C(t, U2), u(i5));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.g(T, (h) h1.C(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.V(T, Y(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.k(T, Y(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.K(T, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.M(T, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.O(T, Y(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.Q(T, Z(t, U2));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (H(t, T, i5)) {
                        i2 = CodedOutputStream.s(T, (m0) h1.C(t, U2), u(i5));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i4 += i2;
        }
        return i4 + y(this.o, t);
    }

    private <UT, UB> void x0(e1<UT, UB> e1Var, T t, k1 k1Var) throws IOException {
        e1Var.t(e1Var.g(t), k1Var);
    }

    private <UT, UB> int y(e1<UT, UB> e1Var, T t) {
        return e1Var.h(e1Var.g(t));
    }

    private static <T> int z(T t, long j) {
        return h1.z(t, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public void a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            P(t, t2, i);
        }
        a1.G(this.o, t, t2);
        if (this.f) {
            a1.E(this.p, t, t2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public void b(T t) {
        int i;
        int i2 = this.k;
        while (true) {
            i = this.l;
            if (i2 >= i) {
                break;
            }
            long U = U(r0(this.j[i2]));
            Object C = h1.C(t, U);
            if (C != null) {
                h1.R(t, U, this.q.f(C));
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

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public final boolean c(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.k) {
            int i6 = this.j[i5];
            int T = T(i6);
            int r0 = r0(i6);
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
            if (I(r0) && !C(t, i6, i, i2, i9)) {
                return false;
            }
            int q0 = q0(r0);
            if (q0 != 9 && q0 != 17) {
                if (q0 != 27) {
                    if (q0 != 60 && q0 != 68) {
                        if (q0 != 49) {
                            if (q0 == 50 && !F(t, r0, i6)) {
                                return false;
                            }
                        }
                    } else if (H(t, T, i6) && !D(t, r0, u(i6))) {
                        return false;
                    }
                }
                if (!E(t, r0, i6)) {
                    return false;
                }
            } else if (C(t, i6, i, i2, i9) && !D(t, r0, u(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f && !this.p.c(t).o()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c0(T t, byte[] bArr, int i, int i2, int i3, e.b bVar) throws IOException {
        Unsafe unsafe;
        int i4;
        o0<T> o0Var;
        int i5;
        T t2;
        byte b;
        int f0;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        T t3;
        T t4;
        int i15;
        T t5;
        int i16;
        int i17;
        o0<T> o0Var2 = this;
        T t6 = t;
        byte[] bArr2 = bArr;
        int i18 = i2;
        int i19 = i3;
        e.b bVar2 = bVar;
        Unsafe unsafe2 = s;
        int i20 = i;
        int i21 = -1;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1048575;
        while (true) {
            if (i20 < i18) {
                int i26 = i20 + 1;
                byte b2 = bArr2[i20];
                if (b2 < 0) {
                    int H = e.H(b2, bArr2, i26, bVar2);
                    b = bVar2.a;
                    i26 = H;
                } else {
                    b = b2;
                }
                int i27 = b >>> 3;
                int i28 = b & 7;
                if (i27 > i21) {
                    f0 = o0Var2.g0(i27, i22 / 3);
                } else {
                    f0 = o0Var2.f0(i27);
                }
                int i29 = f0;
                if (i29 == -1) {
                    i6 = i27;
                    i7 = i26;
                    i8 = b;
                    i9 = i24;
                    i10 = i25;
                    unsafe = unsafe2;
                    i4 = i19;
                    i11 = 0;
                } else {
                    int i30 = o0Var2.a[i29 + 1];
                    int q0 = q0(i30);
                    long U = U(i30);
                    int i31 = b;
                    if (q0 <= 17) {
                        int i32 = o0Var2.a[i29 + 2];
                        int i33 = 1 << (i32 >>> 20);
                        int i34 = i32 & 1048575;
                        if (i34 != i25) {
                            if (i25 != 1048575) {
                                unsafe2.putInt(t6, i25, i24);
                            }
                            i12 = unsafe2.getInt(t6, i34);
                            i10 = i34;
                        } else {
                            i10 = i25;
                            i12 = i24;
                        }
                        switch (q0) {
                            case 0:
                                t3 = t6;
                                i13 = i29;
                                i6 = i27;
                                i14 = i31;
                                bArr2 = bArr;
                                if (i28 == 1) {
                                    h1.N(t3, U, e.d(bArr2, i26));
                                    i20 = i26 + 8;
                                    i24 = i12 | i33;
                                    i18 = i2;
                                    t6 = t3;
                                    i22 = i13;
                                    i23 = i14;
                                    i21 = i6;
                                    i25 = i10;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            case 1:
                                t3 = t6;
                                i13 = i29;
                                i6 = i27;
                                i14 = i31;
                                bArr2 = bArr;
                                if (i28 == 5) {
                                    h1.O(t3, U, e.l(bArr2, i26));
                                    i20 = i26 + 4;
                                    i24 = i12 | i33;
                                    i18 = i2;
                                    t6 = t3;
                                    i22 = i13;
                                    i23 = i14;
                                    i21 = i6;
                                    i25 = i10;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            case 2:
                            case 3:
                                T t7 = t6;
                                i13 = i29;
                                i6 = i27;
                                i14 = i31;
                                bArr2 = bArr;
                                if (i28 == 0) {
                                    int L = e.L(bArr2, i26, bVar2);
                                    t4 = t7;
                                    unsafe2.putLong(t, U, bVar2.b);
                                    i24 = i12 | i33;
                                    i22 = i13;
                                    i20 = L;
                                    i23 = i14;
                                    t6 = t4;
                                    i21 = i6;
                                    i25 = i10;
                                    i18 = i2;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            case 4:
                            case 11:
                                t3 = t6;
                                i13 = i29;
                                i6 = i27;
                                i14 = i31;
                                bArr2 = bArr;
                                if (i28 == 0) {
                                    i20 = e.I(bArr2, i26, bVar2);
                                    unsafe2.putInt(t3, U, bVar2.a);
                                    i24 = i12 | i33;
                                    i18 = i2;
                                    t6 = t3;
                                    i22 = i13;
                                    i23 = i14;
                                    i21 = i6;
                                    i25 = i10;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            case 5:
                            case 14:
                                T t8 = t6;
                                i13 = i29;
                                i6 = i27;
                                i14 = i31;
                                bArr2 = bArr;
                                if (i28 == 1) {
                                    t4 = t8;
                                    unsafe2.putLong(t, U, e.j(bArr2, i26));
                                    i20 = i26 + 8;
                                    i24 = i12 | i33;
                                    i22 = i13;
                                    i23 = i14;
                                    t6 = t4;
                                    i21 = i6;
                                    i25 = i10;
                                    i18 = i2;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            case 6:
                            case 13:
                                i15 = i2;
                                t5 = t6;
                                i13 = i29;
                                i6 = i27;
                                i14 = i31;
                                bArr2 = bArr;
                                if (i28 == 5) {
                                    unsafe2.putInt(t5, U, e.h(bArr2, i26));
                                    i20 = i26 + 4;
                                    int i35 = i12 | i33;
                                    t6 = t5;
                                    i18 = i15;
                                    i22 = i13;
                                    i23 = i14;
                                    i25 = i10;
                                    i19 = i3;
                                    i24 = i35;
                                    i21 = i6;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            case 7:
                                i15 = i2;
                                t5 = t6;
                                i13 = i29;
                                i6 = i27;
                                i14 = i31;
                                bArr2 = bArr;
                                if (i28 == 0) {
                                    i20 = e.L(bArr2, i26, bVar2);
                                    h1.H(t5, U, bVar2.b != 0);
                                    int i352 = i12 | i33;
                                    t6 = t5;
                                    i18 = i15;
                                    i22 = i13;
                                    i23 = i14;
                                    i25 = i10;
                                    i19 = i3;
                                    i24 = i352;
                                    i21 = i6;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            case 8:
                                i15 = i2;
                                t5 = t6;
                                i13 = i29;
                                i6 = i27;
                                i14 = i31;
                                bArr2 = bArr;
                                if (i28 == 2) {
                                    if ((i30 & 536870912) == 0) {
                                        i20 = e.C(bArr2, i26, bVar2);
                                    } else {
                                        i20 = e.F(bArr2, i26, bVar2);
                                    }
                                    unsafe2.putObject(t5, U, bVar2.c);
                                    int i3522 = i12 | i33;
                                    t6 = t5;
                                    i18 = i15;
                                    i22 = i13;
                                    i23 = i14;
                                    i25 = i10;
                                    i19 = i3;
                                    i24 = i3522;
                                    i21 = i6;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            case 9:
                                t5 = t6;
                                i13 = i29;
                                i6 = i27;
                                i14 = i31;
                                bArr2 = bArr;
                                if (i28 == 2) {
                                    i15 = i2;
                                    i20 = e.p(o0Var2.u(i13), bArr2, i26, i15, bVar2);
                                    if ((i12 & i33) == 0) {
                                        unsafe2.putObject(t5, U, bVar2.c);
                                    } else {
                                        unsafe2.putObject(t5, U, y.h(unsafe2.getObject(t5, U), bVar2.c));
                                    }
                                    int i35222 = i12 | i33;
                                    t6 = t5;
                                    i18 = i15;
                                    i22 = i13;
                                    i23 = i14;
                                    i25 = i10;
                                    i19 = i3;
                                    i24 = i35222;
                                    i21 = i6;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            case 10:
                                t3 = t6;
                                i13 = i29;
                                i6 = i27;
                                i14 = i31;
                                bArr2 = bArr;
                                if (i28 == 2) {
                                    i20 = e.b(bArr2, i26, bVar2);
                                    unsafe2.putObject(t3, U, bVar2.c);
                                    i24 = i12 | i33;
                                    i18 = i2;
                                    t6 = t3;
                                    i22 = i13;
                                    i23 = i14;
                                    i21 = i6;
                                    i25 = i10;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            case 12:
                                t3 = t6;
                                i13 = i29;
                                i6 = i27;
                                i14 = i31;
                                bArr2 = bArr;
                                if (i28 == 0) {
                                    i20 = e.I(bArr2, i26, bVar2);
                                    int i36 = bVar2.a;
                                    y.e s2 = o0Var2.s(i13);
                                    if (s2 != null && !s2.a(i36)) {
                                        v(t).m(i14, Long.valueOf(i36));
                                        i18 = i2;
                                        t6 = t3;
                                        i24 = i12;
                                        i22 = i13;
                                        i23 = i14;
                                        i21 = i6;
                                        i25 = i10;
                                        i19 = i3;
                                    } else {
                                        unsafe2.putInt(t3, U, i36);
                                        i24 = i12 | i33;
                                        i18 = i2;
                                        t6 = t3;
                                        i22 = i13;
                                        i23 = i14;
                                        i21 = i6;
                                        i25 = i10;
                                        i19 = i3;
                                        break;
                                    }
                                } else {
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                                break;
                            case 15:
                                i13 = i29;
                                i14 = i31;
                                bArr2 = bArr;
                                i6 = i27;
                                if (i28 == 0) {
                                    i20 = e.I(bArr2, i26, bVar2);
                                    t3 = t;
                                    unsafe2.putInt(t3, U, i.b(bVar2.a));
                                    i24 = i12 | i33;
                                    i18 = i2;
                                    t6 = t3;
                                    i22 = i13;
                                    i23 = i14;
                                    i21 = i6;
                                    i25 = i10;
                                    i19 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            case 16:
                                i13 = i29;
                                i6 = i27;
                                if (i28 == 0) {
                                    bArr2 = bArr;
                                    int L2 = e.L(bArr2, i26, bVar2);
                                    i14 = i31;
                                    unsafe2.putLong(t, U, i.c(bVar2.b));
                                    i24 = i12 | i33;
                                    t6 = t;
                                    i18 = i2;
                                    i22 = i13;
                                    i20 = L2;
                                    i23 = i14;
                                    i21 = i6;
                                    i25 = i10;
                                    i19 = i3;
                                    break;
                                } else {
                                    i14 = i31;
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            case 17:
                                if (i28 == 3) {
                                    i20 = e.n(o0Var2.u(i29), bArr, i26, i2, (i27 << 3) | 4, bVar);
                                    if ((i12 & i33) == 0) {
                                        unsafe2.putObject(t6, U, bVar2.c);
                                    } else {
                                        unsafe2.putObject(t6, U, y.h(unsafe2.getObject(t6, U), bVar2.c));
                                    }
                                    i24 = i12 | i33;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i3;
                                    i22 = i29;
                                    i23 = i31;
                                    i21 = i27;
                                    i25 = i10;
                                    break;
                                } else {
                                    i13 = i29;
                                    i6 = i27;
                                    i14 = i31;
                                    i4 = i3;
                                    i7 = i26;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                    break;
                                }
                            default:
                                i13 = i29;
                                i14 = i31;
                                i6 = i27;
                                i4 = i3;
                                i7 = i26;
                                i9 = i12;
                                i11 = i13;
                                unsafe = unsafe2;
                                i8 = i14;
                                break;
                        }
                    } else {
                        i6 = i27;
                        T t9 = t6;
                        bArr2 = bArr;
                        if (q0 != 27) {
                            i11 = i29;
                            i9 = i24;
                            i10 = i25;
                            if (q0 <= 49) {
                                int i37 = i26;
                                unsafe = unsafe2;
                                i17 = i31;
                                i20 = e0(t, bArr, i26, i2, i31, i6, i28, i11, i30, q0, U, bVar);
                                if (i20 != i37) {
                                    o0Var2 = this;
                                    t6 = t;
                                    bArr2 = bArr;
                                    i18 = i2;
                                    i19 = i3;
                                    bVar2 = bVar;
                                    i21 = i6;
                                    i23 = i17;
                                    i22 = i11;
                                    i24 = i9;
                                    i25 = i10;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i7 = i20;
                                    i8 = i17;
                                }
                            } else {
                                i16 = i26;
                                unsafe = unsafe2;
                                i17 = i31;
                                if (q0 != 50) {
                                    i20 = b0(t, bArr, i16, i2, i17, i6, i28, i30, q0, U, i11, bVar);
                                    if (i20 != i16) {
                                        o0Var2 = this;
                                        t6 = t;
                                        bArr2 = bArr;
                                        i18 = i2;
                                        i19 = i3;
                                        bVar2 = bVar;
                                        i21 = i6;
                                        i23 = i17;
                                        i22 = i11;
                                        i24 = i9;
                                        i25 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i7 = i20;
                                        i8 = i17;
                                    }
                                } else if (i28 == 2) {
                                    i20 = a0(t, bArr, i16, i2, i11, U, bVar);
                                    if (i20 != i16) {
                                        o0Var2 = this;
                                        t6 = t;
                                        bArr2 = bArr;
                                        i18 = i2;
                                        i19 = i3;
                                        bVar2 = bVar;
                                        i21 = i6;
                                        i23 = i17;
                                        i22 = i11;
                                        i24 = i9;
                                        i25 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i7 = i20;
                                        i8 = i17;
                                    }
                                }
                            }
                        } else if (i28 == 2) {
                            y.i iVar = (y.i) unsafe2.getObject(t9, U);
                            if (!iVar.o()) {
                                int size = iVar.size();
                                iVar = iVar.i(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t9, U, iVar);
                            }
                            i10 = i25;
                            i20 = e.q(o0Var2.u(i29), i31, bArr, i26, i2, iVar, bVar);
                            t6 = t;
                            i18 = i2;
                            i23 = i31;
                            i21 = i6;
                            i22 = i29;
                            i24 = i24;
                            i25 = i10;
                            i19 = i3;
                        } else {
                            i11 = i29;
                            i9 = i24;
                            i10 = i25;
                            i16 = i26;
                            unsafe = unsafe2;
                            i17 = i31;
                        }
                        i4 = i3;
                        i7 = i16;
                        i8 = i17;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (this.f && bVar.d != o.b()) {
                        i20 = e.g(i8, bArr, i7, i2, t, this.e, this.o, bVar);
                    } else {
                        i20 = e.G(i8, bArr, i7, i2, v(t), bVar);
                    }
                    t6 = t;
                    bArr2 = bArr;
                    i18 = i2;
                    i23 = i8;
                    o0Var2 = this;
                    bVar2 = bVar;
                    i21 = i6;
                    i22 = i11;
                    i24 = i9;
                    i25 = i10;
                    unsafe2 = unsafe;
                    i19 = i4;
                } else {
                    i5 = 1048575;
                    o0Var = this;
                    i20 = i7;
                    i23 = i8;
                    i24 = i9;
                    i25 = i10;
                }
            } else {
                unsafe = unsafe2;
                i4 = i19;
                o0Var = o0Var2;
                i5 = 1048575;
            }
        }
        if (i25 != i5) {
            t2 = t;
            unsafe.putInt(t2, i25, i24);
        } else {
            t2 = t;
        }
        f1 f1Var = null;
        for (int i38 = o0Var.k; i38 < o0Var.l; i38++) {
            f1Var = (f1) o0Var.p(t2, o0Var.j[i38], f1Var, o0Var.o);
        }
        if (f1Var != null) {
            o0Var.o.o(t2, f1Var);
        }
        if (i4 == 0) {
            if (i20 != i2) {
                throw InvalidProtocolBufferException.j();
            }
        } else if (i20 > i2 || i23 != i4) {
            throw InvalidProtocolBufferException.j();
        }
        return i20;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public int d(T t) {
        if (this.h) {
            return x(t);
        }
        return w(t);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public T e() {
        return (T) this.m.a(this.e);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public int f(T t) {
        int i;
        int f;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int r0 = r0(i3);
            int T = T(i3);
            long U = U(r0);
            int i4 = 37;
            switch (q0(r0)) {
                case 0:
                    i = i2 * 53;
                    f = y.f(Double.doubleToLongBits(h1.x(t, U)));
                    i2 = i + f;
                    break;
                case 1:
                    i = i2 * 53;
                    f = Float.floatToIntBits(h1.y(t, U));
                    i2 = i + f;
                    break;
                case 2:
                    i = i2 * 53;
                    f = y.f(h1.A(t, U));
                    i2 = i + f;
                    break;
                case 3:
                    i = i2 * 53;
                    f = y.f(h1.A(t, U));
                    i2 = i + f;
                    break;
                case 4:
                    i = i2 * 53;
                    f = h1.z(t, U);
                    i2 = i + f;
                    break;
                case 5:
                    i = i2 * 53;
                    f = y.f(h1.A(t, U));
                    i2 = i + f;
                    break;
                case 6:
                    i = i2 * 53;
                    f = h1.z(t, U);
                    i2 = i + f;
                    break;
                case 7:
                    i = i2 * 53;
                    f = y.c(h1.r(t, U));
                    i2 = i + f;
                    break;
                case 8:
                    i = i2 * 53;
                    f = ((String) h1.C(t, U)).hashCode();
                    i2 = i + f;
                    break;
                case 9:
                    Object C = h1.C(t, U);
                    if (C != null) {
                        i4 = C.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    f = h1.C(t, U).hashCode();
                    i2 = i + f;
                    break;
                case 11:
                    i = i2 * 53;
                    f = h1.z(t, U);
                    i2 = i + f;
                    break;
                case 12:
                    i = i2 * 53;
                    f = h1.z(t, U);
                    i2 = i + f;
                    break;
                case 13:
                    i = i2 * 53;
                    f = h1.z(t, U);
                    i2 = i + f;
                    break;
                case 14:
                    i = i2 * 53;
                    f = y.f(h1.A(t, U));
                    i2 = i + f;
                    break;
                case 15:
                    i = i2 * 53;
                    f = h1.z(t, U);
                    i2 = i + f;
                    break;
                case 16:
                    i = i2 * 53;
                    f = y.f(h1.A(t, U));
                    i2 = i + f;
                    break;
                case 17:
                    Object C2 = h1.C(t, U);
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
                    f = h1.C(t, U).hashCode();
                    i2 = i + f;
                    break;
                case 50:
                    i = i2 * 53;
                    f = h1.C(t, U).hashCode();
                    i2 = i + f;
                    break;
                case 51:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = y.f(Double.doubleToLongBits(W(t, U)));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = Float.floatToIntBits(X(t, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = y.f(Z(t, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = y.f(Z(t, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = Y(t, U);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = y.f(Z(t, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = Y(t, U);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = y.c(V(t, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = ((String) h1.C(t, U)).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = h1.C(t, U).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = h1.C(t, U).hashCode();
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = Y(t, U);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = Y(t, U);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = Y(t, U);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = y.f(Z(t, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = Y(t, U);
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = y.f(Z(t, U));
                        i2 = i + f;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (H(t, T, i3)) {
                        i = i2 * 53;
                        f = h1.C(t, U).hashCode();
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

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public boolean g(T t, T t2) {
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            if (!o(t, t2, i)) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public void h(T t, byte[] bArr, int i, int i2, e.b bVar) throws IOException {
        if (this.h) {
            d0(t, bArr, i, i2, bVar);
        } else {
            c0(t, bArr, i, i2, 0, bVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public void i(T t, x0 x0Var, o oVar) throws IOException {
        oVar.getClass();
        L(this.o, this.p, t, x0Var, oVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public void j(T t, k1 k1Var) throws IOException {
        if (k1Var.t() == k1.a.DESCENDING) {
            u0(t, k1Var);
        } else if (this.h) {
            t0(t, k1Var);
        } else {
            s0(t, k1Var);
        }
    }
}
