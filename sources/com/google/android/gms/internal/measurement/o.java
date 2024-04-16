package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class o extends b2<o, a> implements i3d {
    private static final o zzc;
    private static volatile v3d<o> zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<o, a> implements i3d {
        private a() {
            super(o.zzc);
        }

        public final boolean A() {
            return ((o) this.b).O();
        }

        public final boolean B() {
            return ((o) this.b).P();
        }

        public final int s() {
            return ((o) this.b).m();
        }

        public final a t(String str) {
            p();
            ((o) this.b).I(str);
            return this;
        }

        public final String v() {
            return ((o) this.b).K();
        }

        public final boolean w() {
            return ((o) this.b).L();
        }

        public final boolean y() {
            return ((o) this.b).M();
        }

        public final boolean z() {
            return ((o) this.b).N();
        }

        /* synthetic */ a(l lVar) {
            this();
        }
    }

    static {
        o oVar = new o();
        zzc = oVar;
        b2.t(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    public final String K() {
        return this.zzf;
    }

    public final boolean L() {
        return this.zzg;
    }

    public final boolean M() {
        return this.zzh;
    }

    public final boolean N() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int m() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (l.a[i - 1]) {
            case 1:
                return new o();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                v3d<o> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (o.class) {
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
