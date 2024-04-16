package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class l0 extends b2<l0, a> implements i3d {
    private static final l0 zzc;
    private static volatile v3d<l0> zzd;
    private int zze;
    private int zzf;
    private p2d zzg = b2.C();

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<l0, a> implements i3d {
        private a() {
            super(l0.zzc);
        }

        public final a s(int i) {
            p();
            ((l0) this.b).M(i);
            return this;
        }

        public final a t(Iterable<? extends Long> iterable) {
            p();
            ((l0) this.b).K(iterable);
            return this;
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        l0 l0Var = new l0();
        zzc = l0Var;
        b2.t(l0.class, l0Var);
    }

    private l0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Iterable<? extends Long> iterable) {
        p2d p2dVar = this.zzg;
        if (!p2dVar.c()) {
            this.zzg = b2.s(p2dVar);
        }
        w0.i(iterable, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int i) {
        this.zze |= 1;
        this.zzf = i;
    }

    public static a N() {
        return zzc.y();
    }

    public final long H(int i) {
        return this.zzg.j(i);
    }

    public final int L() {
        return this.zzf;
    }

    public final List<Long> P() {
        return this.zzg;
    }

    public final boolean Q() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int m() {
        return this.zzg.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (y.a[i - 1]) {
            case 1:
                return new l0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                v3d<l0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (l0.class) {
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
