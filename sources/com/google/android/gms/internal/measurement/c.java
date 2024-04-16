package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class c extends b2<c, a> implements i3d {
    private static final c zzc;
    private static volatile v3d<c> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private o2d<d> zzh = b2.D();
    private boolean zzi;
    private e zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<c, a> implements i3d {
        private a() {
            super(c.zzc);
        }

        public final int s() {
            return ((c) this.b).m();
        }

        public final a t(int i, d dVar) {
            p();
            ((c) this.b).I(i, dVar);
            return this;
        }

        public final a v(String str) {
            p();
            ((c) this.b).L(str);
            return this;
        }

        public final d w(int i) {
            return ((c) this.b).H(i);
        }

        public final String y() {
            return ((c) this.b).Q();
        }

        /* synthetic */ a(com.google.android.gms.internal.measurement.a aVar) {
            this();
        }
    }

    static {
        c cVar = new c();
        zzc = cVar;
        b2.t(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int i, d dVar) {
        dVar.getClass();
        o2d<d> o2dVar = this.zzh;
        if (!o2dVar.c()) {
            this.zzh = b2.r(o2dVar);
        }
        this.zzh.set(i, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a N() {
        return zzc.y();
    }

    public final d H(int i) {
        return this.zzh.get(i);
    }

    public final int M() {
        return this.zzf;
    }

    public final e P() {
        e eVar = this.zzj;
        if (eVar == null) {
            return e.J();
        }
        return eVar;
    }

    public final String Q() {
        return this.zzg;
    }

    public final List<d> R() {
        return this.zzh;
    }

    public final boolean S() {
        return this.zzk;
    }

    public final boolean T() {
        return this.zzl;
    }

    public final boolean U() {
        return this.zzm;
    }

    public final boolean V() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        if ((this.zze & 64) != 0) {
            return true;
        }
        return false;
    }

    public final int m() {
        return this.zzh.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (com.google.android.gms.internal.measurement.a.a[i - 1]) {
            case 1:
                return new c();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", d.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                v3d<c> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (c.class) {
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
