package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.k0;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class b0 extends b2<b0, a> implements i3d {
    private static final b0 zzc;
    private static volatile v3d<b0> zzd;
    private int zze;
    private int zzf;
    private k0 zzg;
    private k0 zzh;
    private boolean zzi;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<b0, a> implements i3d {
        private a() {
            super(b0.zzc);
        }

        public final a s(int i) {
            p();
            ((b0) this.b).H(i);
            return this;
        }

        public final a t(k0.a aVar) {
            p();
            ((b0) this.b).L((k0) ((b2) aVar.u()));
            return this;
        }

        public final a v(k0 k0Var) {
            p();
            ((b0) this.b).P(k0Var);
            return this;
        }

        public final a w(boolean z) {
            p();
            ((b0) this.b).M(z);
            return this;
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        b0 b0Var = new b0();
        zzc = b0Var;
        b2.t(b0.class, b0Var);
    }

    private b0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(int i) {
        this.zze |= 1;
        this.zzf = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(k0 k0Var) {
        k0Var.getClass();
        this.zzg = k0Var;
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(boolean z) {
        this.zze |= 8;
        this.zzi = z;
    }

    public static a N() {
        return zzc.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(k0 k0Var) {
        k0Var.getClass();
        this.zzh = k0Var;
        this.zze |= 4;
    }

    public final k0 R() {
        k0 k0Var = this.zzg;
        if (k0Var == null) {
            return k0.Z();
        }
        return k0Var;
    }

    public final k0 S() {
        k0 k0Var = this.zzh;
        if (k0Var == null) {
            return k0.Z();
        }
        return k0Var;
    }

    public final boolean T() {
        return this.zzi;
    }

    public final boolean U() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        if ((this.zze & 4) != 0) {
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
                return new b0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                v3d<b0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (b0.class) {
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
