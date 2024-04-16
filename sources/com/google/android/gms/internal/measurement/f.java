package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class f extends b2<f, a> implements i3d {
    private static final f zzc;
    private static volatile v3d<f> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private d zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<f, a> implements i3d {
        private a() {
            super(f.zzc);
        }

        public final a s(String str) {
            p();
            ((f) this.b).I(str);
            return this;
        }

        /* synthetic */ a(com.google.android.gms.internal.measurement.a aVar) {
            this();
        }
    }

    static {
        f fVar = new f();
        zzc = fVar;
        b2.t(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a K() {
        return zzc.y();
    }

    public final d J() {
        d dVar = this.zzh;
        if (dVar == null) {
            return d.K();
        }
        return dVar;
    }

    public final String M() {
        return this.zzg;
    }

    public final boolean N() {
        return this.zzi;
    }

    public final boolean O() {
        return this.zzj;
    }

    public final boolean P() {
        return this.zzk;
    }

    public final boolean Q() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if ((this.zze & 32) != 0) {
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
        switch (com.google.android.gms.internal.measurement.a.a[i - 1]) {
            case 1:
                return new f();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                v3d<f> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (f.class) {
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
