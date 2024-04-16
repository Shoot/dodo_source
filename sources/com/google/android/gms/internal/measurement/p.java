package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.o;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class p extends b2<p, a> implements i3d {
    private static final p zzc;
    private static volatile v3d<p> zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private m zzr;
    private q zzs;
    private t zzt;
    private String zzg = "";
    private o2d<s> zzi = b2.D();
    private o2d<o> zzj = b2.D();
    private o2d<b> zzk = b2.D();
    private String zzl = "";
    private o2d<s0> zzn = b2.D();
    private o2d<n> zzo = b2.D();
    private String zzp = "";
    private String zzq = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<p, a> implements i3d {
        private a() {
            super(p.zzc);
        }

        public final List<n> A() {
            return Collections.unmodifiableList(((p) this.b).V());
        }

        public final int s() {
            return ((p) this.b).L();
        }

        public final o t(int i) {
            return ((p) this.b).H(i);
        }

        public final a v(int i, o.a aVar) {
            p();
            ((p) this.b).I(i, (o) ((b2) aVar.u()));
            return this;
        }

        public final a w() {
            p();
            ((p) this.b).e0();
            return this;
        }

        public final String y() {
            return ((p) this.b).T();
        }

        public final List<b> z() {
            return Collections.unmodifiableList(((p) this.b).U());
        }

        /* synthetic */ a(l lVar) {
            this();
        }
    }

    static {
        p pVar = new p();
        zzc = pVar;
        b2.t(p.class, pVar);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int i, o oVar) {
        oVar.getClass();
        o2d<o> o2dVar = this.zzj;
        if (!o2dVar.c()) {
            this.zzj = b2.r(o2dVar);
        }
        this.zzj.set(i, oVar);
    }

    public static a O() {
        return zzc.y();
    }

    public static p Q() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0() {
        this.zzk = b2.D();
    }

    public final o H(int i) {
        return this.zzj.get(i);
    }

    public final int L() {
        return this.zzj.size();
    }

    public final long M() {
        return this.zzf;
    }

    public final m N() {
        m mVar = this.zzr;
        if (mVar == null) {
            return m.I();
        }
        return mVar;
    }

    public final t R() {
        t tVar = this.zzt;
        if (tVar == null) {
            return t.I();
        }
        return tVar;
    }

    public final String S() {
        return this.zzg;
    }

    public final String T() {
        return this.zzp;
    }

    public final List<b> U() {
        return this.zzk;
    }

    public final List<n> V() {
        return this.zzo;
    }

    public final List<s0> X() {
        return this.zzn;
    }

    public final List<s> Y() {
        return this.zzi;
    }

    public final boolean Z() {
        return this.zzm;
    }

    public final boolean a0() {
        if ((this.zze & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c0() {
        if ((this.zze & 512) != 0) {
            return true;
        }
        return false;
    }

    public final boolean d0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int m() {
        return this.zzn.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (l.a[i - 1]) {
            case 1:
                return new p();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", s.class, "zzj", o.class, "zzk", b.class, "zzl", "zzm", "zzn", s0.class, "zzo", n.class, "zzp", "zzq", "zzr", "zzs", "zzt"});
            case 4:
                return zzc;
            case 5:
                v3d<p> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (p.class) {
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
