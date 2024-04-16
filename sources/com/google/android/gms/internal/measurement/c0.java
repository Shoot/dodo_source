package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class c0 extends b2<c0, a> implements i3d {
    private static final c0 zzc;
    private static volatile v3d<c0> zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<c0, a> implements i3d {
        private a() {
            super(c0.zzc);
        }

        public final a s(int i) {
            p();
            ((c0) this.b).H(i);
            return this;
        }

        public final a t(long j) {
            p();
            ((c0) this.b).I(j);
            return this;
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        c0 c0Var = new c0();
        zzc = c0Var;
        b2.t(c0.class, c0Var);
    }

    private c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(int i) {
        this.zze |= 1;
        this.zzf = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(long j) {
        this.zze |= 2;
        this.zzg = j;
    }

    public static a M() {
        return zzc.y();
    }

    public final long L() {
        return this.zzg;
    }

    public final boolean O() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int m() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (y.a[i - 1]) {
            case 1:
                return new c0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                v3d<c0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (c0.class) {
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
