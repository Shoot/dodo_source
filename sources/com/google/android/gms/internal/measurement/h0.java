package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.i0;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class h0 extends b2<h0, a> implements i3d {
    private static final h0 zzc;
    private static volatile v3d<h0> zzd;
    private int zze;
    private o2d<i0> zzf = b2.D();
    private String zzg = "";
    private String zzh = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<h0, a> implements i3d {
        private a() {
            super(h0.zzc);
        }

        public final int s() {
            return ((h0) this.b).m();
        }

        public final a t(i0.a aVar) {
            p();
            ((h0) this.b).J((i0) ((b2) aVar.u()));
            return this;
        }

        public final i0 v(int i) {
            return ((h0) this.b).H(0);
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        h0 h0Var = new h0();
        zzc = h0Var;
        b2.t(h0.class, h0Var);
    }

    private h0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(i0 i0Var) {
        i0Var.getClass();
        o2d<i0> o2dVar = this.zzf;
        if (!o2dVar.c()) {
            this.zzf = b2.r(o2dVar);
        }
        this.zzf.add(i0Var);
    }

    public static a K() {
        return zzc.y();
    }

    public final i0 H(int i) {
        return this.zzf.get(0);
    }

    public final List<i0> M() {
        return this.zzf;
    }

    public final int m() {
        return this.zzf.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (y.a[i - 1]) {
            case 1:
                return new h0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001", new Object[]{"zze", "zzf", i0.class, "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                v3d<h0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (h0.class) {
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
