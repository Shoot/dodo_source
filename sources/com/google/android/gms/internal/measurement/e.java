package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class e extends b2<e, a> implements i3d {
    private static final e zzc;
    private static volatile v3d<e> zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<e, a> implements i3d {
        private a() {
            super(e.zzc);
        }

        /* synthetic */ a(com.google.android.gms.internal.measurement.a aVar) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public enum b implements l2d {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        
        private static final k2d<b> g = new h();
        private final int a;

        b(int i) {
            this.a = i;
        }

        public static b a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return BETWEEN;
                        }
                        return EQUAL;
                    }
                    return GREATER_THAN;
                }
                return LESS_THAN;
            }
            return UNKNOWN_COMPARISON_TYPE;
        }

        public static n2d i() {
            return i.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
        }

        @Override // defpackage.l2d
        public final int zza() {
            return this.a;
        }
    }

    static {
        e eVar = new e();
        zzc = eVar;
        b2.t(e.class, eVar);
    }

    private e() {
    }

    public static e J() {
        return zzc;
    }

    public final b H() {
        b a2 = b.a(this.zzf);
        if (a2 == null) {
            return b.UNKNOWN_COMPARISON_TYPE;
        }
        return a2;
    }

    public final String K() {
        return this.zzh;
    }

    public final String L() {
        return this.zzj;
    }

    public final String M() {
        return this.zzi;
    }

    public final boolean N() {
        return this.zzg;
    }

    public final boolean O() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
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
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (com.google.android.gms.internal.measurement.a.a[i - 1]) {
            case 1:
                return new e();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", b.i(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                v3d<e> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (e.class) {
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
