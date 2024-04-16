package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class t extends b2<t, a> implements i3d {
    private static final t zzc;
    private static volatile v3d<t> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<t, a> implements i3d {
        private a() {
            super(t.zzc);
        }

        /* synthetic */ a(l lVar) {
            this();
        }
    }

    static {
        t tVar = new t();
        zzc = tVar;
        b2.t(t.class, tVar);
    }

    private t() {
    }

    public static t I() {
        return zzc;
    }

    public final String J() {
        return this.zzg;
    }

    public final String K() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (l.a[i - 1]) {
            case 1:
                return new t();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                v3d<t> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (t.class) {
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
