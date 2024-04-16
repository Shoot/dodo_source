package defpackage;

import com.google.protobuf.u;
import defpackage.np;
/* compiled from: PerfMetric.java */
/* renamed from: wx7  reason: default package */
/* loaded from: classes2.dex */
public final class wx7 extends u<wx7, b> implements xx7 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final wx7 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile er7<wx7> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private np applicationInfo_;
    private int bitField0_;
    private dd4 gaugeMetric_;
    private fw6 networkRequestMetric_;
    private wjb traceMetric_;
    private bmb transportInfo_;

    /* compiled from: PerfMetric.java */
    /* renamed from: wx7$a */
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

    /* compiled from: PerfMetric.java */
    /* renamed from: wx7$b */
    /* loaded from: classes2.dex */
    public static final class b extends u.a<wx7, b> implements xx7 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b I(np.b bVar) {
            z();
            ((wx7) this.b).h0(bVar.a());
            return this;
        }

        public b J(dd4 dd4Var) {
            z();
            ((wx7) this.b).i0(dd4Var);
            return this;
        }

        public b K(fw6 fw6Var) {
            z();
            ((wx7) this.b).j0(fw6Var);
            return this;
        }

        public b L(wjb wjbVar) {
            z();
            ((wx7) this.b).k0(wjbVar);
            return this;
        }

        @Override // defpackage.xx7
        public boolean h() {
            return ((wx7) this.b).h();
        }

        @Override // defpackage.xx7
        public boolean i() {
            return ((wx7) this.b).i();
        }

        @Override // defpackage.xx7
        public fw6 j() {
            return ((wx7) this.b).j();
        }

        @Override // defpackage.xx7
        public boolean m() {
            return ((wx7) this.b).m();
        }

        @Override // defpackage.xx7
        public wjb n() {
            return ((wx7) this.b).n();
        }

        @Override // defpackage.xx7
        public dd4 o() {
            return ((wx7) this.b).o();
        }

        private b() {
            super(wx7.DEFAULT_INSTANCE);
        }
    }

    static {
        wx7 wx7Var = new wx7();
        DEFAULT_INSTANCE = wx7Var;
        u.W(wx7.class, wx7Var);
    }

    private wx7() {
    }

    public static b g0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(np npVar) {
        npVar.getClass();
        this.applicationInfo_ = npVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(dd4 dd4Var) {
        dd4Var.getClass();
        this.gaugeMetric_ = dd4Var;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(fw6 fw6Var) {
        fw6Var.getClass();
        this.networkRequestMetric_ = fw6Var;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(wjb wjbVar) {
        wjbVar.getClass();
        this.traceMetric_ = wjbVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.u
    protected final Object E(u.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new wx7();
            case 2:
                return new b(null);
            case 3:
                return u.T(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                er7<wx7> er7Var = PARSER;
                if (er7Var == null) {
                    synchronized (wx7.class) {
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

    public np e0() {
        np npVar = this.applicationInfo_;
        if (npVar == null) {
            return np.g0();
        }
        return npVar;
    }

    public boolean f0() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xx7
    public boolean h() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xx7
    public boolean i() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xx7
    public fw6 j() {
        fw6 fw6Var = this.networkRequestMetric_;
        if (fw6Var == null) {
            return fw6.t0();
        }
        return fw6Var;
    }

    @Override // defpackage.xx7
    public boolean m() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xx7
    public wjb n() {
        wjb wjbVar = this.traceMetric_;
        if (wjbVar == null) {
            return wjb.v0();
        }
        return wjbVar;
    }

    @Override // defpackage.xx7
    public dd4 o() {
        dd4 dd4Var = this.gaugeMetric_;
        if (dd4Var == null) {
            return dd4.k0();
        }
        return dd4Var;
    }
}
