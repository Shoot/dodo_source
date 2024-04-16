package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class m0 extends b2<m0, a> implements i3d {
    private static final m0 zzc;
    private static volatile v3d<m0> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<m0, a> implements i3d {
        private a() {
            super(m0.zzc);
        }

        public final a A(String str) {
            p();
            ((m0) this.b).U(str);
            return this;
        }

        public final a B() {
            p();
            ((m0) this.b).k0();
            return this;
        }

        public final a s() {
            p();
            ((m0) this.b).i0();
            return this;
        }

        public final a t(double d) {
            p();
            ((m0) this.b).I(d);
            return this;
        }

        public final a v(long j) {
            p();
            ((m0) this.b).J(j);
            return this;
        }

        public final a w(String str) {
            p();
            ((m0) this.b).O(str);
            return this;
        }

        public final a y() {
            p();
            ((m0) this.b).j0();
            return this;
        }

        public final a z(long j) {
            p();
            ((m0) this.b).Q(j);
            return this;
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        m0 m0Var = new m0();
        zzc = m0Var;
        b2.t(m0.class, m0Var);
    }

    private m0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(double d) {
        this.zze |= 32;
        this.zzk = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(long j) {
        this.zze |= 8;
        this.zzi = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(long j) {
        this.zze |= 1;
        this.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(String str) {
        str.getClass();
        this.zze |= 4;
        this.zzh = str;
    }

    public static a Z() {
        return zzc.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        this.zze &= -33;
        this.zzk = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        this.zze &= -9;
        this.zzi = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        this.zze &= -5;
        this.zzh = zzc.zzh;
    }

    public final double H() {
        return this.zzk;
    }

    public final float P() {
        return this.zzj;
    }

    public final long V() {
        return this.zzi;
    }

    public final long Y() {
        return this.zzf;
    }

    public final String b0() {
        return this.zzg;
    }

    public final String c0() {
        return this.zzh;
    }

    public final boolean d0() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean e0() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f0() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (y.a[i - 1]) {
            case 1:
                return new m0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                v3d<m0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (m0.class) {
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
