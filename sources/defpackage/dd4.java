package defpackage;

import com.google.protobuf.u;
import com.google.protobuf.w;
/* compiled from: GaugeMetric.java */
/* renamed from: dd4  reason: default package */
/* loaded from: classes2.dex */
public final class dd4 extends u<dd4, b> implements bi6 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final dd4 DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile er7<dd4> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private cd4 gaugeMetadata_;
    private String sessionId_ = "";
    private w.i<p02> cpuMetricReadings_ = u.G();
    private w.i<uh> androidMemoryReadings_ = u.G();

    /* compiled from: GaugeMetric.java */
    /* renamed from: dd4$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u.f.values().length];
            a = iArr;
            try {
                iArr[u.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: GaugeMetric.java */
    /* renamed from: dd4$b */
    /* loaded from: classes2.dex */
    public static final class b extends u.a<dd4, b> implements bi6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b I(uh uhVar) {
            z();
            ((dd4) this.b).e0(uhVar);
            return this;
        }

        public b J(p02 p02Var) {
            z();
            ((dd4) this.b).f0(p02Var);
            return this;
        }

        public b K(cd4 cd4Var) {
            z();
            ((dd4) this.b).r0(cd4Var);
            return this;
        }

        public b L(String str) {
            z();
            ((dd4) this.b).s0(str);
            return this;
        }

        private b() {
            super(dd4.DEFAULT_INSTANCE);
        }
    }

    static {
        dd4 dd4Var = new dd4();
        DEFAULT_INSTANCE = dd4Var;
        u.W(dd4.class, dd4Var);
    }

    private dd4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(uh uhVar) {
        uhVar.getClass();
        g0();
        this.androidMemoryReadings_.add(uhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(p02 p02Var) {
        p02Var.getClass();
        h0();
        this.cpuMetricReadings_.add(p02Var);
    }

    private void g0() {
        w.i<uh> iVar = this.androidMemoryReadings_;
        if (!iVar.o()) {
            this.androidMemoryReadings_ = u.R(iVar);
        }
    }

    private void h0() {
        w.i<p02> iVar = this.cpuMetricReadings_;
        if (!iVar.o()) {
            this.cpuMetricReadings_ = u.R(iVar);
        }
    }

    public static dd4 k0() {
        return DEFAULT_INSTANCE;
    }

    public static b p0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(cd4 cd4Var) {
        cd4Var.getClass();
        this.gaugeMetadata_ = cd4Var;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.u
    protected final Object E(u.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new dd4();
            case 2:
                return new b(null);
            case 3:
                return u.T(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", p02.class, "gaugeMetadata_", "androidMemoryReadings_", uh.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                er7<dd4> er7Var = PARSER;
                if (er7Var == null) {
                    synchronized (dd4.class) {
                        try {
                            er7Var = PARSER;
                            if (er7Var == null) {
                                er7Var = new u.b<>(DEFAULT_INSTANCE);
                                PARSER = er7Var;
                            }
                        } finally {
                        }
                    }
                }
                return er7Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int i0() {
        return this.androidMemoryReadings_.size();
    }

    public int j0() {
        return this.cpuMetricReadings_.size();
    }

    public cd4 l0() {
        cd4 cd4Var = this.gaugeMetadata_;
        if (cd4Var == null) {
            return cd4.d0();
        }
        return cd4Var;
    }

    public boolean m0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean o0() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }
}
