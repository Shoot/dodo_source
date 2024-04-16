package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class g extends b2<g, b> implements i3d {
    private static final g zzc;
    private static volatile v3d<g> zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private o2d<String> zzi = b2.D();

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public enum a implements l2d {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        
        private static final k2d<a> i = new k();
        private final int a;

        a(int i2) {
            this.a = i2;
        }

        public static a a(int i2) {
            switch (i2) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static n2d i() {
            return j.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
        }

        @Override // defpackage.l2d
        public final int zza() {
            return this.a;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class b extends b2.b<g, b> implements i3d {
        private b() {
            super(g.zzc);
        }

        /* synthetic */ b(com.google.android.gms.internal.measurement.a aVar) {
            this();
        }
    }

    static {
        g gVar = new g();
        zzc = gVar;
        b2.t(g.class, gVar);
    }

    private g() {
    }

    public static g J() {
        return zzc;
    }

    public final a H() {
        a a2 = a.a(this.zzf);
        if (a2 == null) {
            return a.UNKNOWN_MATCH_TYPE;
        }
        return a2;
    }

    public final String K() {
        return this.zzg;
    }

    public final List<String> L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzh;
    }

    public final boolean N() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
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
        return this.zzi.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (com.google.android.gms.internal.measurement.a.a[i - 1]) {
            case 1:
                return new g();
            case 2:
                return new b(null);
            case 3:
                return b2.q(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", a.i(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                v3d<g> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (g.class) {
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
