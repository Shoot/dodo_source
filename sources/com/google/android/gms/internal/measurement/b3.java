package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class b3<T> implements j3<T> {
    private final h3d a;
    private final b4<?, ?> b;
    private final boolean c;
    private final t1<?> d;

    private b3(b4<?, ?> b4Var, t1<?> t1Var, h3d h3dVar) {
        this.b = b4Var;
        this.c = t1Var.e(h3dVar);
        this.d = t1Var;
        this.a = h3dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> b3<T> i(b4<?, ?> b4Var, t1<?> t1Var, h3d h3dVar) {
        return new b3<>(b4Var, t1Var, h3dVar);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final int a(T t) {
        b4<?, ?> b4Var = this.b;
        int e = b4Var.e(b4Var.k(t));
        if (this.c) {
            return e + this.d.b(t).a();
        }
        return e;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final boolean b(T t) {
        return this.d.b(t).s();
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void c(T t) {
        this.b.l(t);
        this.d.g(t);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final int d(T t) {
        int hashCode = this.b.k(t).hashCode();
        if (this.c) {
            return (hashCode * 53) + this.d.b(t).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void e(T t, T t2) {
        k3.n(this.b, t, t2);
        if (this.c) {
            k3.l(this.d, t, t2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099 A[EDGE_INSN: B:57:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.j3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.c1 r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.b2 r0 = (com.google.android.gms.internal.measurement.b2) r0
            com.google.android.gms.internal.measurement.a4 r1 = r0.zzb
            com.google.android.gms.internal.measurement.a4 r2 = com.google.android.gms.internal.measurement.a4.k()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.a4 r1 = com.google.android.gms.internal.measurement.a4.l()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.measurement.b2$d r10 = (com.google.android.gms.internal.measurement.b2.d) r10
            r10.H()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.z0.p(r11, r12, r14)
            int r2 = r14.a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.t1<?> r12 = r9.d
            com.google.android.gms.internal.measurement.s1 r0 = r14.d
            h3d r3 = r9.a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.b2$f r0 = (com.google.android.gms.internal.measurement.b2.f) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.z0.c(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.g3.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.z0.b(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.z0.p(r11, r4, r14)
            int r5 = r14.a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.z0.k(r11, r4, r14)
            java.lang.Object r2 = r14.c
            com.google.android.gms.internal.measurement.d1 r2 = (com.google.android.gms.internal.measurement.d1) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.g3.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.z0.p(r11, r4, r14)
            int r12 = r14.a
            com.google.android.gms.internal.measurement.t1<?> r0 = r9.d
            com.google.android.gms.internal.measurement.s1 r5 = r14.d
            h3d r6 = r9.a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            com.google.android.gms.internal.measurement.b2$f r0 = (com.google.android.gms.internal.measurement.b2.f) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.z0.b(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.e(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.zzjq r10 = com.google.android.gms.internal.measurement.zzjq.e()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b3.f(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.c1):void");
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final boolean g(T t, T t2) {
        if (!this.b.k(t).equals(this.b.k(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.b(t).equals(this.d.b(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void h(T t, k4 k4Var) throws IOException {
        Iterator<Map.Entry<?, Object>> p = this.d.b(t).p();
        while (p.hasNext()) {
            Map.Entry<?, Object> next = p.next();
            h2d h2dVar = (h2d) next.getKey();
            if (h2dVar.c() == l5d.MESSAGE && !h2dVar.f() && !h2dVar.d()) {
                if (next instanceof f2) {
                    k4Var.q(h2dVar.zza(), ((f2) next).a().d());
                } else {
                    k4Var.q(h2dVar.zza(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        b4<?, ?> b4Var = this.b;
        b4Var.d(b4Var.k(t), k4Var);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final T zza() {
        h3d h3dVar = this.a;
        if (h3dVar instanceof b2) {
            return (T) ((b2) h3dVar).A();
        }
        return (T) h3dVar.e().x();
    }
}
