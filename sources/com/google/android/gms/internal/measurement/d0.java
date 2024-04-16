package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.f0;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class d0 extends b2<d0, a> implements i3d {
    private static final d0 zzc;
    private static volatile v3d<d0> zzd;
    private int zze;
    private o2d<f0> zzf = b2.D();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<d0, a> implements i3d {
        private a() {
            super(d0.zzc);
        }

        public final a A(f0 f0Var) {
            p();
            ((d0) this.b).R(f0Var);
            return this;
        }

        public final a B(Iterable<? extends f0> iterable) {
            p();
            ((d0) this.b).S(iterable);
            return this;
        }

        public final a C(String str) {
            p();
            ((d0) this.b).T(str);
            return this;
        }

        public final long D() {
            return ((d0) this.b).Z();
        }

        public final a F(long j) {
            p();
            ((d0) this.b).X(j);
            return this;
        }

        public final f0 G(int i) {
            return ((d0) this.b).H(i);
        }

        public final long H() {
            return ((d0) this.b).a0();
        }

        public final a I() {
            p();
            ((d0) this.b).i0();
            return this;
        }

        public final String J() {
            return ((d0) this.b).d0();
        }

        public final List<f0> K() {
            return Collections.unmodifiableList(((d0) this.b).e0());
        }

        public final boolean L() {
            return ((d0) this.b).h0();
        }

        public final int s() {
            return ((d0) this.b).U();
        }

        public final a t(int i) {
            p();
            ((d0) this.b).V(i);
            return this;
        }

        public final a v(int i, f0.a aVar) {
            p();
            ((d0) this.b).I(i, (f0) ((b2) aVar.u()));
            return this;
        }

        public final a w(int i, f0 f0Var) {
            p();
            ((d0) this.b).I(i, f0Var);
            return this;
        }

        public final a y(long j) {
            p();
            ((d0) this.b).J(j);
            return this;
        }

        public final a z(f0.a aVar) {
            p();
            ((d0) this.b).R((f0) ((b2) aVar.u()));
            return this;
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        d0 d0Var = new d0();
        zzc = d0Var;
        b2.t(d0.class, d0Var);
    }

    private d0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int i, f0 f0Var) {
        f0Var.getClass();
        j0();
        this.zzf.set(i, f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(long j) {
        this.zze |= 4;
        this.zzi = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(f0 f0Var) {
        f0Var.getClass();
        j0();
        this.zzf.add(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(Iterable<? extends f0> iterable) {
        j0();
        w0.i(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(int i) {
        j0();
        this.zzf.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(long j) {
        this.zze |= 2;
        this.zzh = j;
    }

    public static a b0() {
        return zzc.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        this.zzf = b2.D();
    }

    private final void j0() {
        o2d<f0> o2dVar = this.zzf;
        if (!o2dVar.c()) {
            this.zzf = b2.r(o2dVar);
        }
    }

    public final f0 H(int i) {
        return this.zzf.get(i);
    }

    public final int U() {
        return this.zzf.size();
    }

    public final long Z() {
        return this.zzi;
    }

    public final long a0() {
        return this.zzh;
    }

    public final String d0() {
        return this.zzg;
    }

    public final List<f0> e0() {
        return this.zzf;
    }

    public final boolean f0() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final int m() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (y.a[i - 1]) {
            case 1:
                return new d0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", f0.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                v3d<d0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (d0.class) {
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
