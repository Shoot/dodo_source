package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class n extends b2<n, a> implements i3d {
    private static final n zzc;
    private static volatile v3d<n> zzd;
    private int zze;
    private String zzf = "";
    private o2d<r> zzg = b2.D();
    private boolean zzh;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<n, a> implements i3d {
        private a() {
            super(n.zzc);
        }

        /* synthetic */ a(l lVar) {
            this();
        }
    }

    static {
        n nVar = new n();
        zzc = nVar;
        b2.t(n.class, nVar);
    }

    private n() {
    }

    public final String I() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (l.a[i - 1]) {
            case 1:
                return new n();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", r.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                v3d<n> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (n.class) {
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
