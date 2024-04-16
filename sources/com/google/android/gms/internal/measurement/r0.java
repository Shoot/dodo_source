package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class r0 extends b2<r0, a> implements i3d {
    private static final r0 zzc;
    private static volatile v3d<r0> zzd;
    private int zze;
    private String zzf = "";
    private o2d<t0> zzg = b2.D();

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<r0, a> implements i3d {
        private a() {
            super(r0.zzc);
        }

        /* synthetic */ a(p0 p0Var) {
            this();
        }
    }

    static {
        r0 r0Var = new r0();
        zzc = r0Var;
        b2.t(r0.class, r0Var);
    }

    private r0() {
    }

    public final String I() {
        return this.zzf;
    }

    public final List<t0> J() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (p0.a[i - 1]) {
            case 1:
                return new r0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", t0.class});
            case 4:
                return zzc;
            case 5:
                v3d<r0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (r0.class) {
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
