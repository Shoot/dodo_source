package defpackage;

import com.google.protobuf.d0;
import com.google.protobuf.e0;
import com.google.protobuf.h1;
import com.google.protobuf.u;
import com.google.protobuf.w;
import java.util.List;
/* compiled from: NetworkRequestMetric.java */
/* renamed from: fw6  reason: default package */
/* loaded from: classes2.dex */
public final class fw6 extends u<fw6, b> implements bi6 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final fw6 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile er7<fw6> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private e0<String, String> customAttributes_ = e0.e();
    private String url_ = "";
    private String responseContentType_ = "";
    private w.i<zx7> perfSessions_ = u.G();

    /* compiled from: NetworkRequestMetric.java */
    /* renamed from: fw6$a */
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

    /* compiled from: NetworkRequestMetric.java */
    /* renamed from: fw6$b */
    /* loaded from: classes2.dex */
    public static final class b extends u.a<fw6, b> implements bi6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b I(Iterable<? extends zx7> iterable) {
            z();
            ((fw6) this.b).o0(iterable);
            return this;
        }

        public b J() {
            z();
            ((fw6) this.b).p0();
            return this;
        }

        public long K() {
            return ((fw6) this.b).C0();
        }

        public boolean L() {
            return ((fw6) this.b).E0();
        }

        public boolean M() {
            return ((fw6) this.b).G0();
        }

        public boolean N() {
            return ((fw6) this.b).K0();
        }

        public b O(long j) {
            z();
            ((fw6) this.b).N0(j);
            return this;
        }

        public b P(d dVar) {
            z();
            ((fw6) this.b).O0(dVar);
            return this;
        }

        public b Q(int i) {
            z();
            ((fw6) this.b).P0(i);
            return this;
        }

        public b R(e eVar) {
            z();
            ((fw6) this.b).Q0(eVar);
            return this;
        }

        public b S(long j) {
            z();
            ((fw6) this.b).R0(j);
            return this;
        }

        public b T(String str) {
            z();
            ((fw6) this.b).S0(str);
            return this;
        }

        public b U(long j) {
            z();
            ((fw6) this.b).T0(j);
            return this;
        }

        public b V(long j) {
            z();
            ((fw6) this.b).U0(j);
            return this;
        }

        public b X(long j) {
            z();
            ((fw6) this.b).V0(j);
            return this;
        }

        public b Y(long j) {
            z();
            ((fw6) this.b).W0(j);
            return this;
        }

        public b Z(String str) {
            z();
            ((fw6) this.b).X0(str);
            return this;
        }

        private b() {
            super(fw6.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* renamed from: fw6$c */
    /* loaded from: classes2.dex */
    private static final class c {
        static final d0<String, String> a;

        static {
            h1.b bVar = h1.b.k;
            a = d0.d(bVar, "", bVar, "");
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* renamed from: fw6$d */
    /* loaded from: classes2.dex */
    public enum d implements w.c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        
        private static final w.d<d> l = new a();
        private final int a;

        /* compiled from: NetworkRequestMetric.java */
        /* renamed from: fw6$d$a */
        /* loaded from: classes2.dex */
        class a implements w.d<d> {
            a() {
            }

            @Override // com.google.protobuf.w.d
            /* renamed from: b */
            public d a(int i) {
                return d.a(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NetworkRequestMetric.java */
        /* renamed from: fw6$d$b */
        /* loaded from: classes2.dex */
        public static final class b implements w.e {
            static final w.e a = new b();

            private b() {
            }

            @Override // com.google.protobuf.w.e
            public boolean a(int i) {
                if (d.a(i) != null) {
                    return true;
                }
                return false;
            }
        }

        d(int i) {
            this.a = i;
        }

        public static d a(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static w.e i() {
            return b.a;
        }

        @Override // com.google.protobuf.w.c
        public final int e() {
            return this.a;
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* renamed from: fw6$e */
    /* loaded from: classes2.dex */
    public enum e implements w.c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        
        private static final w.d<e> d = new a();
        private final int a;

        /* compiled from: NetworkRequestMetric.java */
        /* renamed from: fw6$e$a */
        /* loaded from: classes2.dex */
        class a implements w.d<e> {
            a() {
            }

            @Override // com.google.protobuf.w.d
            /* renamed from: b */
            public e a(int i) {
                return e.a(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NetworkRequestMetric.java */
        /* renamed from: fw6$e$b */
        /* loaded from: classes2.dex */
        public static final class b implements w.e {
            static final w.e a = new b();

            private b() {
            }

            @Override // com.google.protobuf.w.e
            public boolean a(int i) {
                if (e.a(i) != null) {
                    return true;
                }
                return false;
            }
        }

        e(int i) {
            this.a = i;
        }

        public static e a(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return GENERIC_CLIENT_ERROR;
            }
            return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }

        public static w.e i() {
            return b.a;
        }

        @Override // com.google.protobuf.w.c
        public final int e() {
            return this.a;
        }
    }

    static {
        fw6 fw6Var = new fw6();
        DEFAULT_INSTANCE = fw6Var;
        u.W(fw6.class, fw6Var);
    }

    private fw6() {
    }

    public static b M0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(d dVar) {
        this.httpMethod_ = dVar.e();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(e eVar) {
        this.networkClientErrorReason_ = eVar.e();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0(long j) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(long j) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0(long j) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(Iterable<? extends zx7> iterable) {
        r0();
        com.google.protobuf.a.p(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = t0().y0();
    }

    private void r0() {
        w.i<zx7> iVar = this.perfSessions_;
        if (!iVar.o()) {
            this.perfSessions_ = u.R(iVar);
        }
    }

    public static fw6 t0() {
        return DEFAULT_INSTANCE;
    }

    public long A0() {
        return this.timeToRequestCompletedUs_;
    }

    public long B0() {
        return this.timeToResponseCompletedUs_;
    }

    public long C0() {
        return this.timeToResponseInitiatedUs_;
    }

    public String D0() {
        return this.url_;
    }

    @Override // com.google.protobuf.u
    protected final Object E(u.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new fw6();
            case 2:
                return new b(null);
            case 3:
                return u.T(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.i(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.i(), "customAttributes_", c.a, "perfSessions_", zx7.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                er7<fw6> er7Var = PARSER;
                if (er7Var == null) {
                    synchronized (fw6.class) {
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

    public boolean E0() {
        if ((this.bitField0_ & 128) != 0) {
            return true;
        }
        return false;
    }

    public boolean F0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean G0() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    public boolean H0() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean I0() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean J0() {
        if ((this.bitField0_ & 256) != 0) {
            return true;
        }
        return false;
    }

    public boolean K0() {
        if ((this.bitField0_ & 1024) != 0) {
            return true;
        }
        return false;
    }

    public boolean L0() {
        if ((this.bitField0_ & 512) != 0) {
            return true;
        }
        return false;
    }

    public long s0() {
        return this.clientStartTimeUs_;
    }

    public d u0() {
        d a2 = d.a(this.httpMethod_);
        if (a2 == null) {
            return d.HTTP_METHOD_UNKNOWN;
        }
        return a2;
    }

    public int v0() {
        return this.httpResponseCode_;
    }

    public List<zx7> w0() {
        return this.perfSessions_;
    }

    public long x0() {
        return this.requestPayloadBytes_;
    }

    public String y0() {
        return this.responseContentType_;
    }

    public long z0() {
        return this.responsePayloadBytes_;
    }
}
