package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class g0 extends b2<g0, a> implements i3d {
    private static final g0 zzc;
    private static volatile v3d<g0> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private z zzh;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<g0, a> implements i3d {
        private a() {
            super(g0.zzc);
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        g0 g0Var = new g0();
        zzc = g0Var;
        b2.t(g0.class, g0Var);
    }

    private g0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (y.a[i - 1]) {
            case 1:
                return new g0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                v3d<g0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (g0.class) {
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
