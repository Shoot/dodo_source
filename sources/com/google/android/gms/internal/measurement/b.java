package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.f;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class b extends b2<b, a> implements i3d {
    private static final b zzc;
    private static volatile v3d<b> zzd;
    private int zze;
    private int zzf;
    private o2d<f> zzg = b2.D();
    private o2d<c> zzh = b2.D();
    private boolean zzi;
    private boolean zzj;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<b, a> implements i3d {
        private a() {
            super(b.zzc);
        }

        public final int s() {
            return ((b) this.b).M();
        }

        public final a t(int i, c.a aVar) {
            p();
            ((b) this.b).I(i, (c) ((b2) aVar.u()));
            return this;
        }

        public final a v(int i, f.a aVar) {
            p();
            ((b) this.b).J(i, (f) ((b2) aVar.u()));
            return this;
        }

        public final c w(int i) {
            return ((b) this.b).H(i);
        }

        public final int y() {
            return ((b) this.b).O();
        }

        public final f z(int i) {
            return ((b) this.b).N(i);
        }

        /* synthetic */ a(com.google.android.gms.internal.measurement.a aVar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int i, c cVar) {
        cVar.getClass();
        o2d<c> o2dVar = this.zzh;
        if (!o2dVar.c()) {
            this.zzh = b2.r(o2dVar);
        }
        this.zzh.set(i, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(int i, f fVar) {
        fVar.getClass();
        o2d<f> o2dVar = this.zzg;
        if (!o2dVar.c()) {
            this.zzg = b2.r(o2dVar);
        }
        this.zzg.set(i, fVar);
    }

    public final c H(int i) {
        return this.zzh.get(i);
    }

    public final int M() {
        return this.zzh.size();
    }

    public final f N(int i) {
        return this.zzg.get(i);
    }

    public final int O() {
        return this.zzg.size();
    }

    public final List<c> Q() {
        return this.zzh;
    }

    public final List<f> R() {
        return this.zzg;
    }

    public final boolean S() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int m() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (com.google.android.gms.internal.measurement.a.a[i - 1]) {
            case 1:
                return new b();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", f.class, "zzh", c.class, "zzi", "zzj"});
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
