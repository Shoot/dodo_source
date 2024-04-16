package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class t0 extends b2<t0, a> implements i3d {
    private static final t0 zzc;
    private static volatile v3d<t0> zzd;
    private int zze;
    private int zzf;
    private o2d<t0> zzg = b2.D();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<t0, a> implements i3d {
        private a() {
            super(t0.zzc);
        }

        /* synthetic */ a(p0 p0Var) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public enum b implements l2d {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);
        
        private static final k2d<b> g = new u0();
        private final int a;

        b(int i) {
            this.a = i;
        }

        public static b a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return STATEMENT;
                        }
                        return BOOLEAN;
                    }
                    return NUMBER;
                }
                return STRING;
            }
            return UNKNOWN;
        }

        public static n2d i() {
            return v0.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
        }

        @Override // defpackage.l2d
        public final int zza() {
            return this.a;
        }
    }

    static {
        t0 t0Var = new t0();
        zzc = t0Var;
        b2.t(t0.class, t0Var);
    }

    private t0() {
    }

    public final double H() {
        return this.zzk;
    }

    public final b I() {
        b a2 = b.a(this.zzf);
        if (a2 == null) {
            return b.UNKNOWN;
        }
        return a2;
    }

    public final String K() {
        return this.zzh;
    }

    public final String L() {
        return this.zzi;
    }

    public final List<t0> M() {
        return this.zzg;
    }

    public final boolean N() {
        return this.zzj;
    }

    public final boolean O() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (p0.a[i - 1]) {
            case 1:
                return new t0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", b.i(), "zzg", t0.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                v3d<t0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (t0.class) {
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
