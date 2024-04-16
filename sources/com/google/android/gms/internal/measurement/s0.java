package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class s0 extends b2<s0, a> implements i3d {
    private static final s0 zzc;
    private static volatile v3d<s0> zzd;
    private int zze;
    private o2d<t0> zzf = b2.D();
    private q0 zzg;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<s0, a> implements i3d {
        private a() {
            super(s0.zzc);
        }

        /* synthetic */ a(p0 p0Var) {
            this();
        }
    }

    static {
        s0 s0Var = new s0();
        zzc = s0Var;
        b2.t(s0.class, s0Var);
    }

    private s0() {
    }

    public final q0 H() {
        q0 q0Var = this.zzg;
        if (q0Var == null) {
            return q0.I();
        }
        return q0Var;
    }

    public final List<t0> J() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (p0.a[i - 1]) {
            case 1:
                return new s0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", t0.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                v3d<s0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (s0.class) {
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
