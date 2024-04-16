package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class m extends b2<m, a> implements i3d {
    private static final m zzc;
    private static volatile v3d<m> zzd;
    private int zze;
    private boolean zzi;
    private o2d<b> zzf = b2.D();
    private o2d<c> zzg = b2.D();
    private o2d<f> zzh = b2.D();
    private o2d<b> zzj = b2.D();

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<m, a> implements i3d {
        private a() {
            super(m.zzc);
        }

        /* synthetic */ a(l lVar) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class b extends b2<b, a> implements i3d {
        private static final b zzc;
        private static volatile v3d<b> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        /* loaded from: classes2.dex */
        public static final class a extends b2.b<b, a> implements i3d {
            private a() {
                super(b.zzc);
            }

            /* synthetic */ a(l lVar) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzc = bVar;
            b2.t(b.class, bVar);
        }

        private b() {
        }

        public final d I() {
            d a2 = d.a(this.zzg);
            if (a2 == null) {
                return d.CONSENT_STATUS_UNSPECIFIED;
            }
            return a2;
        }

        public final e J() {
            e a2 = e.a(this.zzf);
            if (a2 == null) {
                return e.CONSENT_TYPE_UNSPECIFIED;
            }
            return a2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.b2
        public final Object o(int i, Object obj, Object obj2) {
            switch (l.a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(null);
                case 3:
                    return b2.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.i(), "zzg", d.i()});
                case 4:
                    return zzc;
                case 5:
                    v3d<b> v3dVar = zzd;
                    if (v3dVar == null) {
                        synchronized (b.class) {
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

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class c extends b2<c, a> implements i3d {
        private static final c zzc;
        private static volatile v3d<c> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        /* loaded from: classes2.dex */
        public static final class a extends b2.b<c, a> implements i3d {
            private a() {
                super(c.zzc);
            }

            /* synthetic */ a(l lVar) {
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

        public final e I() {
            e a2 = e.a(this.zzg);
            if (a2 == null) {
                return e.CONSENT_TYPE_UNSPECIFIED;
            }
            return a2;
        }

        public final e J() {
            e a2 = e.a(this.zzf);
            if (a2 == null) {
                return e.CONSENT_TYPE_UNSPECIFIED;
            }
            return a2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.b2
        public final Object o(int i, Object obj, Object obj2) {
            switch (l.a[i - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return b2.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.i(), "zzg", e.i()});
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

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public enum d implements l2d {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);
        
        private static final k2d<d> e = new u();
        private final int a;

        d(int i) {
            this.a = i;
        }

        public static d a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return DENIED;
                }
                return GRANTED;
            }
            return CONSENT_STATUS_UNSPECIFIED;
        }

        public static n2d i() {
            return v.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
        }

        @Override // defpackage.l2d
        public final int zza() {
            return this.a;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public enum e implements l2d {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);
        
        private static final k2d<e> g = new x();
        private final int a;

        e(int i) {
            this.a = i;
        }

        public static e a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return AD_PERSONALIZATION;
                        }
                        return AD_USER_DATA;
                    }
                    return ANALYTICS_STORAGE;
                }
                return AD_STORAGE;
            }
            return CONSENT_TYPE_UNSPECIFIED;
        }

        public static n2d i() {
            return w.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
        }

        @Override // defpackage.l2d
        public final int zza() {
            return this.a;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class f extends b2<f, a> implements i3d {
        private static final f zzc;
        private static volatile v3d<f> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
        /* loaded from: classes2.dex */
        public static final class a extends b2.b<f, a> implements i3d {
            private a() {
                super(f.zzc);
            }

            /* synthetic */ a(l lVar) {
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

        public final String I() {
            return this.zzf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.b2
        public final Object o(int i, Object obj, Object obj2) {
            switch (l.a[i - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a(null);
                case 3:
                    return b2.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
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

    static {
        m mVar = new m();
        zzc = mVar;
        b2.t(m.class, mVar);
    }

    private m() {
    }

    public static m I() {
        return zzc;
    }

    public final List<f> J() {
        return this.zzh;
    }

    public final List<b> K() {
        return this.zzf;
    }

    public final List<c> L() {
        return this.zzg;
    }

    public final boolean M() {
        return this.zzi;
    }

    public final boolean N() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (l.a[i - 1]) {
            case 1:
                return new m();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", b.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", b.class});
            case 4:
                return zzc;
            case 5:
                v3d<m> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (m.class) {
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
