package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class f0 extends b2<f0, a> implements i3d {
    private static final f0 zzc;
    private static volatile v3d<f0> zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private o2d<f0> zzk = b2.D();

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<f0, a> implements i3d {
        private a() {
            super(f0.zzc);
        }

        public final a A() {
            p();
            ((f0) this.b).m0();
            return this;
        }

        public final a B(String str) {
            p();
            ((f0) this.b).V(str);
            return this;
        }

        public final a C() {
            p();
            ((f0) this.b).n0();
            return this;
        }

        public final a D() {
            p();
            ((f0) this.b).o0();
            return this;
        }

        public final a F() {
            p();
            ((f0) this.b).p0();
            return this;
        }

        public final String G() {
            return ((f0) this.b).e0();
        }

        public final String H() {
            return ((f0) this.b).f0();
        }

        public final int s() {
            return ((f0) this.b).X();
        }

        public final a t(double d) {
            p();
            ((f0) this.b).I(d);
            return this;
        }

        public final a v(long j) {
            p();
            ((f0) this.b).J(j);
            return this;
        }

        public final a w(a aVar) {
            p();
            ((f0) this.b).c0((f0) ((b2) aVar.u()));
            return this;
        }

        public final a y(Iterable<? extends f0> iterable) {
            p();
            ((f0) this.b).Q(iterable);
            return this;
        }

        public final a z(String str) {
            p();
            ((f0) this.b).R(str);
            return this;
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        f0 f0Var = new f0();
        zzc = f0Var;
        b2.t(f0.class, f0Var);
    }

    private f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(double d) {
        this.zze |= 16;
        this.zzj = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(long j) {
        this.zze |= 4;
        this.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(Iterable<? extends f0> iterable) {
        q0();
        w0.i(iterable, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a b0() {
        return zzc.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(f0 f0Var) {
        f0Var.getClass();
        q0();
        this.zzk.add(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        this.zze &= -17;
        this.zzj = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0() {
        this.zze &= -5;
        this.zzh = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0() {
        this.zzk = b2.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        this.zze &= -3;
        this.zzg = zzc.zzg;
    }

    private final void q0() {
        o2d<f0> o2dVar = this.zzk;
        if (!o2dVar.c()) {
            this.zzk = b2.r(o2dVar);
        }
    }

    public final double H() {
        return this.zzj;
    }

    public final float S() {
        return this.zzi;
    }

    public final int X() {
        return this.zzk.size();
    }

    public final long Z() {
        return this.zzh;
    }

    public final String e0() {
        return this.zzf;
    }

    public final String f0() {
        return this.zzg;
    }

    public final List<f0> g0() {
        return this.zzk;
    }

    public final boolean h0() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i0() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (y.a[i - 1]) {
            case 1:
                return new f0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", f0.class});
            case 4:
                return zzc;
            case 5:
                v3d<f0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (f0.class) {
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
