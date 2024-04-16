package com.google.android.gms.internal.measurement;

import defpackage.h2d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class x1<T extends h2d<T>> {
    private static final x1 d = new x1(true);
    final n3<T, Object> a;
    private boolean b;
    private boolean c;

    private x1() {
        this.a = n3.c(16);
    }

    private static int b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.c() == l5d.MESSAGE && !key.f() && !key.d()) {
            if (value instanceof q2d) {
                return zzio.g(entry.getKey().zza(), (q2d) value);
            }
            return zzio.B(entry.getKey().zza(), (h3d) value);
        }
        return c(key, value);
    }

    public static int c(h2d<?> h2dVar, Object obj) {
        q4d b = h2dVar.b();
        int zza = h2dVar.zza();
        if (h2dVar.f()) {
            List<Object> list = (List) obj;
            int i = 0;
            if (h2dVar.d()) {
                if (list.isEmpty()) {
                    return 0;
                }
                for (Object obj2 : list) {
                    i += e(b, obj2);
                }
                return zzio.w0(zza) + i + zzio.z0(i);
            }
            for (Object obj3 : list) {
                i += d(b, zza, obj3);
            }
            return i;
        }
        return d(b, zza, obj);
    }

    static int d(q4d q4dVar, int i, Object obj) {
        int w0 = zzio.w0(i);
        if (q4dVar == q4d.l) {
            d2.g((h3d) obj);
            w0 <<= 1;
        }
        return w0 + e(q4dVar, obj);
    }

    private static int e(q4d q4dVar, Object obj) {
        switch (w1.b[q4dVar.ordinal()]) {
            case 1:
                return zzio.c(((Double) obj).doubleValue());
            case 2:
                return zzio.d(((Float) obj).floatValue());
            case 3:
                return zzio.e0(((Long) obj).longValue());
            case 4:
                return zzio.r0(((Long) obj).longValue());
            case 5:
                return zzio.k0(((Integer) obj).intValue());
            case 6:
                return zzio.W(((Long) obj).longValue());
            case 7:
                return zzio.g0(((Integer) obj).intValue());
            case 8:
                return zzio.j(((Boolean) obj).booleanValue());
            case 9:
                return zzio.G((h3d) obj);
            case 10:
                if (obj instanceof q2d) {
                    return zzio.h((q2d) obj);
                }
                return zzio.X((h3d) obj);
            case 11:
                if (obj instanceof d1) {
                    return zzio.E((d1) obj);
                }
                return zzio.F((String) obj);
            case 12:
                if (obj instanceof d1) {
                    return zzio.E((d1) obj);
                }
                return zzio.k((byte[]) obj);
            case 13:
                return zzio.z0(((Integer) obj).intValue());
            case 14:
                return zzio.o0(((Integer) obj).intValue());
            case 15:
                return zzio.j0(((Long) obj).longValue());
            case 16:
                return zzio.s0(((Integer) obj).intValue());
            case 17:
                return zzio.n0(((Long) obj).longValue());
            case 18:
                if (obj instanceof l2d) {
                    return zzio.b0(((l2d) obj).zza());
                }
                return zzio.b0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static Object f(Object obj) {
        if (obj instanceof u3d) {
            return ((u3d) obj).zza();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    private final Object g(T t) {
        Object obj = this.a.get(t);
        if (obj instanceof q2d) {
            q2d q2dVar = (q2d) obj;
            return q2d.e();
        }
        return obj;
    }

    public static <T extends h2d<T>> x1<T> i() {
        return d;
    }

    private final void j(Map.Entry<T, Object> entry) {
        h3d u;
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof q2d;
        if (key.f()) {
            if (!z) {
                Object g = g(key);
                if (g == null) {
                    g = new ArrayList();
                }
                for (Object obj : (List) value) {
                    ((List) g).add(f(obj));
                }
                this.a.put(key, g);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        } else if (key.c() == l5d.MESSAGE) {
            Object g2 = g(key);
            if (g2 == null) {
                this.a.put(key, f(value));
                if (z) {
                    this.c = true;
                    return;
                }
                return;
            }
            if (z) {
                q2d q2dVar = (q2d) value;
                value = q2d.e();
            }
            if (g2 instanceof u3d) {
                u = key.Z((u3d) g2, (u3d) value);
            } else {
                u = key.j0(((h3d) g2).c(), (h3d) value).u();
            }
            this.a.put(key, u);
        } else if (!z) {
            this.a.put(key, f(value));
        } else {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
    }

    private final void k(T t, Object obj) {
        if (t.f()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    n(t, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            n(t, obj);
        }
        if (obj instanceof q2d) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    private static boolean l(Object obj) {
        if (obj instanceof i3d) {
            return ((i3d) obj).g();
        }
        if (obj instanceof q2d) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void n(T r4, java.lang.Object r5) {
        /*
            q4d r0 = r4.b()
            com.google.android.gms.internal.measurement.d2.e(r5)
            int[] r1 = com.google.android.gms.internal.measurement.w1.a
            l5d r0 = r0.a()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L20;
                case 9: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r5 instanceof defpackage.h3d
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof defpackage.q2d
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof defpackage.l2d
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.d1
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r5 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r5 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r5 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r5 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r5 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            q4d r4 = r4.b()
            l5d r4 = r4.a()
            r2 = 1
            r1[r2] = r4
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            r5 = 2
            r1[r5] = r4
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.x1.n(h2d, java.lang.Object):void");
    }

    private static <T extends h2d<T>> boolean o(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.c() == l5d.MESSAGE) {
            if (key.f()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!l(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return l(entry.getValue());
        }
        return true;
    }

    public final int a() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.i(); i2++) {
            i += b(this.a.j(i2));
        }
        for (Map.Entry<T, Object> entry : this.a.l()) {
            i += b(entry);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        x1 x1Var = new x1();
        for (int i = 0; i < this.a.i(); i++) {
            Map.Entry<T, Object> j = this.a.j(i);
            x1Var.k(j.getKey(), j.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.l()) {
            x1Var.k(entry.getKey(), entry.getValue());
        }
        x1Var.c = this.c;
        return x1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        return this.a.equals(((x1) obj).a);
    }

    public final void h(x1<T> x1Var) {
        for (int i = 0; i < x1Var.a.i(); i++) {
            j(x1Var.a.j(i));
        }
        for (Map.Entry<T, Object> entry : x1Var.a.l()) {
            j(entry);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> m() {
        if (this.c) {
            return new h2(this.a.o().iterator());
        }
        return this.a.o().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> p() {
        if (this.c) {
            return new h2(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final void q() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.i(); i++) {
            Map.Entry<T, Object> j = this.a.j(i);
            if (j.getValue() instanceof b2) {
                ((b2) j.getValue()).E();
            }
        }
        this.a.h();
        this.b = true;
    }

    public final boolean r() {
        return this.b;
    }

    public final boolean s() {
        for (int i = 0; i < this.a.i(); i++) {
            if (!o(this.a.j(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.l()) {
            if (!o(entry)) {
                return false;
            }
        }
        return true;
    }

    private x1(n3<T, Object> n3Var) {
        this.a = n3Var;
        q();
    }

    private x1(boolean z) {
        this(n3.c(0));
        q();
    }
}
