package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.e0;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class j0 extends b2<j0, b> implements i3d {
    private static final j0 zzc;
    private static volatile v3d<j0> zzd;
    private int zze;
    private int zzf = 1;
    private o2d<e0> zzg = b2.D();

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public enum a implements l2d {
        RADS(1),
        PROVISIONING(2);
        
        private static final k2d<a> d = new o0();
        private final int a;

        a(int i) {
            this.a = i;
        }

        public static a a(int i) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return PROVISIONING;
            }
            return RADS;
        }

        public static n2d i() {
            return n0.a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
        }

        @Override // defpackage.l2d
        public final int zza() {
            return this.a;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class b extends b2.b<j0, b> implements i3d {
        private b() {
            super(j0.zzc);
        }

        public final b s(e0.a aVar) {
            p();
            ((j0) this.b).I((e0) ((b2) aVar.u()));
            return this;
        }

        /* synthetic */ b(y yVar) {
            this();
        }
    }

    static {
        j0 j0Var = new j0();
        zzc = j0Var;
        b2.t(j0.class, j0Var);
    }

    private j0() {
    }

    public static b H() {
        return zzc.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(e0 e0Var) {
        e0Var.getClass();
        o2d<e0> o2dVar = this.zzg;
        if (!o2dVar.c()) {
            this.zzg = b2.r(o2dVar);
        }
        this.zzg.add(e0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (y.a[i - 1]) {
            case 1:
                return new j0();
            case 2:
                return new b(null);
            case 3:
                return b2.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", a.i(), "zzg", e0.class});
            case 4:
                return zzc;
            case 5:
                v3d<j0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (j0.class) {
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
