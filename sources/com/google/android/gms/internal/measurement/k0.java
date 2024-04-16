package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class k0 extends b2<k0, a> implements i3d {
    private static final k0 zzc;
    private static volatile v3d<k0> zzd;
    private p2d zze = b2.C();
    private p2d zzf = b2.C();
    private o2d<c0> zzg = b2.D();
    private o2d<l0> zzh = b2.D();

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<k0, a> implements i3d {
        private a() {
            super(k0.zzc);
        }

        public final a A() {
            p();
            ((k0) this.b).h0();
            return this;
        }

        public final a B(Iterable<? extends Long> iterable) {
            p();
            ((k0) this.b).V(iterable);
            return this;
        }

        public final a s() {
            p();
            ((k0) this.b).e0();
            return this;
        }

        public final a t(Iterable<? extends c0> iterable) {
            p();
            ((k0) this.b).J(iterable);
            return this;
        }

        public final a v() {
            p();
            ((k0) this.b).f0();
            return this;
        }

        public final a w(Iterable<? extends Long> iterable) {
            p();
            ((k0) this.b).N(iterable);
            return this;
        }

        public final a y() {
            p();
            ((k0) this.b).g0();
            return this;
        }

        public final a z(Iterable<? extends l0> iterable) {
            p();
            ((k0) this.b).R(iterable);
            return this;
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        k0 k0Var = new k0();
        zzc = k0Var;
        b2.t(k0.class, k0Var);
    }

    private k0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Iterable<? extends c0> iterable) {
        o2d<c0> o2dVar = this.zzg;
        if (!o2dVar.c()) {
            this.zzg = b2.r(o2dVar);
        }
        w0.i(iterable, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(Iterable<? extends Long> iterable) {
        p2d p2dVar = this.zzf;
        if (!p2dVar.c()) {
            this.zzf = b2.s(p2dVar);
        }
        w0.i(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(Iterable<? extends l0> iterable) {
        o2d<l0> o2dVar = this.zzh;
        if (!o2dVar.c()) {
            this.zzh = b2.r(o2dVar);
        }
        w0.i(iterable, this.zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(Iterable<? extends Long> iterable) {
        p2d p2dVar = this.zze;
        if (!p2dVar.c()) {
            this.zze = b2.s(p2dVar);
        }
        w0.i(iterable, this.zze);
    }

    public static a X() {
        return zzc.y();
    }

    public static k0 Z() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0() {
        this.zzg = b2.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        this.zzf = b2.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        this.zzh = b2.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        this.zze = b2.C();
    }

    public final int K() {
        return this.zzf.size();
    }

    public final int O() {
        return this.zzh.size();
    }

    public final int S() {
        return this.zze.size();
    }

    public final List<c0> a0() {
        return this.zzg;
    }

    public final List<Long> b0() {
        return this.zzf;
    }

    public final List<l0> c0() {
        return this.zzh;
    }

    public final List<Long> d0() {
        return this.zze;
    }

    public final int m() {
        return this.zzg.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (y.a[i - 1]) {
            case 1:
                return new k0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", c0.class, "zzh", l0.class});
            case 4:
                return zzc;
            case 5:
                v3d<k0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (k0.class) {
                        try {
                            v3dVar = zzd;
                            if (v3dVar == null) {
                                v3dVar = new b2.a<>(zzc);
                                zzd = v3dVar;
                            }
                        } finally {
                        }
                    }
                }
                return v3dVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
