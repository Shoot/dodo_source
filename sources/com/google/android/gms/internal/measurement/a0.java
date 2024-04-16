package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class a0 extends b2<a0, a> implements i3d {
    private static final a0 zzc;
    private static volatile v3d<a0> zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<a0, a> implements i3d {
        private a() {
            super(a0.zzc);
        }

        public final a A(boolean z) {
            p();
            ((a0) this.b).b0(z);
            return this;
        }

        public final a s(boolean z) {
            p();
            ((a0) this.b).J(z);
            return this;
        }

        public final a t(boolean z) {
            p();
            ((a0) this.b).M(z);
            return this;
        }

        public final a v(boolean z) {
            p();
            ((a0) this.b).P(z);
            return this;
        }

        public final a w(boolean z) {
            p();
            ((a0) this.b).R(z);
            return this;
        }

        public final a y(boolean z) {
            p();
            ((a0) this.b).U(z);
            return this;
        }

        public final a z(boolean z) {
            p();
            ((a0) this.b).Y(z);
            return this;
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        a0 a0Var = new a0();
        zzc = a0Var;
        b2.t(a0.class, a0Var);
    }

    private a0() {
    }

    public static a H() {
        return zzc.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(boolean z) {
        this.zze |= 32;
        this.zzk = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(boolean z) {
        this.zze |= 16;
        this.zzj = z;
    }

    public static a0 N() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(boolean z) {
        this.zze |= 1;
        this.zzf = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(boolean z) {
        this.zze |= 64;
        this.zzl = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(boolean z) {
        this.zze |= 2;
        this.zzg = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(boolean z) {
        this.zze |= 4;
        this.zzh = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(boolean z) {
        this.zze |= 8;
        this.zzi = z;
    }

    public final boolean S() {
        return this.zzk;
    }

    public final boolean V() {
        return this.zzj;
    }

    public final boolean Z() {
        return this.zzf;
    }

    public final boolean c0() {
        return this.zzl;
    }

    public final boolean d0() {
        return this.zzg;
    }

    public final boolean e0() {
        return this.zzh;
    }

    public final boolean f0() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (y.a[i - 1]) {
            case 1:
                return new a0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                v3d<a0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (a0.class) {
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
