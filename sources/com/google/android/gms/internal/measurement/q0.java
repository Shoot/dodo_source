package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class q0 extends b2<q0, a> implements i3d {
    private static final q0 zzc;
    private static volatile v3d<q0> zzd;
    private o2d<r0> zze = b2.D();

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<q0, a> implements i3d {
        private a() {
            super(q0.zzc);
        }

        /* synthetic */ a(p0 p0Var) {
            this();
        }
    }

    static {
        q0 q0Var = new q0();
        zzc = q0Var;
        b2.t(q0.class, q0Var);
    }

    private q0() {
    }

    public static q0 I() {
        return zzc;
    }

    public final List<r0> J() {
        return this.zze;
    }

    public final int m() {
        return this.zze.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (p0.a[i - 1]) {
            case 1:
                return new q0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", r0.class});
            case 4:
                return zzc;
            case 5:
                v3d<q0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (q0.class) {
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
