package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class e0 extends b2<e0, a> implements i3d {
    private static final e0 zzc;
    private static volatile v3d<e0> zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* loaded from: classes2.dex */
    public static final class a extends b2.b<e0, a> implements i3d {
        private a() {
            super(e0.zzc);
        }

        public final a s(long j) {
            p();
            ((e0) this.b).I(j);
            return this;
        }

        public final a t(String str) {
            p();
            ((e0) this.b).L(str);
            return this;
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        e0 e0Var = new e0();
        zzc = e0Var;
        b2.t(e0.class, e0Var);
    }

    private e0() {
    }

    public static a H() {
        return zzc.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(long j) {
        this.zze |= 2;
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.b2
    public final Object o(int i, Object obj, Object obj2) {
        switch (y.a[i - 1]) {
            case 1:
                return new e0();
            case 2:
                return new a(null);
            case 3:
                return b2.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                v3d<e0> v3dVar = zzd;
                if (v3dVar == null) {
                    synchronized (e0.class) {
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
