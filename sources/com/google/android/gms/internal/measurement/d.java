package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class d extends b2<d, a> implements i3d {
    private static final d zzc;
    private static volatile v3d<d> zzd;
    private int zze;
    private g zzf;
    private e zzg;
    private boolean zzh;
    private String zzi = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<d, a> implements i3d {
        private a() {
            super(d.zzc);
        }

        public final a s(String str) {
            p();
            ((d) this.b).J(str);
            return this;
        }

        /* synthetic */ a(com.google.android.gms.internal.measurement.a aVar) {
            this();
        }
    }

    static {
        d dVar = new d();
        zzc = dVar;
        b2.t(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(String str) {
        str.getClass();
        this.zze |= 8;
        this.zzi = str;
    }

    public static d K() {
        return zzc;
    }

    public final e L() {
        e eVar = this.zzg;
        if (eVar == null) {
            return e.J();
        }
        return eVar;
    }

    public final g M() {
        g gVar = this.zzf;
        if (gVar == null) {
            return g.J();
        }
        return gVar;
    }

    public final String N() {
        return this.zzi;
    }

    public final boolean O() {
        return this.zzh;
    }

    public final boolean P() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (com.google.android.gms.internal.measurement.a.a[i - 1]) {
            case 1:
                return new d();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                v3d<d> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (d.class) {
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
