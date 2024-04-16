package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class s extends b2<s, a> implements i3d {
    private static final s zzc;
    private static volatile v3d<s> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<s, a> implements i3d {
        private a() {
            super(s.zzc);
        }

        /* synthetic */ a(l lVar) {
            this();
        }
    }

    static {
        s sVar = new s();
        zzc = sVar;
        b2.t(s.class, sVar);
    }

    private s() {
    }

    public final String I() {
        return this.zzf;
    }

    public final String J() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (l.a[i - 1]) {
            case 1:
                return new s();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                v3d<s> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (s.class) {
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
