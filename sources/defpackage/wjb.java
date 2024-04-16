package defpackage;

import com.google.protobuf.d0;
import com.google.protobuf.e0;
import com.google.protobuf.h1;
import com.google.protobuf.u;
import com.google.protobuf.w;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: TraceMetric.java */
/* renamed from: wjb  reason: default package */
/* loaded from: classes2.dex */
public final class wjb extends u<wjb, b> implements bi6 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final wjb DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile er7<wjb> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private e0<String, Long> counters_ = e0.e();
    private e0<String, String> customAttributes_ = e0.e();
    private String name_ = "";
    private w.i<wjb> subtraces_ = u.G();
    private w.i<zx7> perfSessions_ = u.G();

    /* compiled from: TraceMetric.java */
    /* renamed from: wjb$a */
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

    /* compiled from: TraceMetric.java */
    /* renamed from: wjb$b */
    /* loaded from: classes2.dex */
    public static final class b extends u.a<wjb, b> implements bi6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b I(Iterable<? extends zx7> iterable) {
            z();
            ((wjb) this.b).j0(iterable);
            return this;
        }

        public b J(Iterable<? extends wjb> iterable) {
            z();
            ((wjb) this.b).k0(iterable);
            return this;
        }

        public b K(zx7 zx7Var) {
            z();
            ((wjb) this.b).l0(zx7Var);
            return this;
        }

        public b L(wjb wjbVar) {
            z();
            ((wjb) this.b).m0(wjbVar);
            return this;
        }

        public b M(Map<String, Long> map) {
            z();
            ((wjb) this.b).x0().putAll(map);
            return this;
        }

        public b N(Map<String, String> map) {
            z();
            ((wjb) this.b).y0().putAll(map);
            return this;
        }

        public b O(String str, long j) {
            str.getClass();
            z();
            ((wjb) this.b).x0().put(str, Long.valueOf(j));
            return this;
        }

        public b P(String str, String str2) {
            str.getClass();
            str2.getClass();
            z();
            ((wjb) this.b).y0().put(str, str2);
            return this;
        }

        public b Q(long j) {
            z();
            ((wjb) this.b).I0(j);
            return this;
        }

        public b R(long j) {
            z();
            ((wjb) this.b).J0(j);
            return this;
        }

        public b S(String str) {
            z();
            ((wjb) this.b).K0(str);
            return this;
        }

        private b() {
            super(wjb.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: TraceMetric.java */
    /* renamed from: wjb$c */
    /* loaded from: classes2.dex */
    private static final class c {
        static final d0<String, Long> a = d0.d(h1.b.k, "", h1.b.e, 0L);
    }

    /* compiled from: TraceMetric.java */
    /* renamed from: wjb$d */
    /* loaded from: classes2.dex */
    private static final class d {
        static final d0<String, String> a;

        static {
            h1.b bVar = h1.b.k;
            a = d0.d(bVar, "", bVar, "");
        }
    }

    static {
        wjb wjbVar = new wjb();
        DEFAULT_INSTANCE = wjbVar;
        u.W(wjb.class, wjbVar);
    }

    private wjb() {
    }

    private e0<String, Long> D0() {
        return this.counters_;
    }

    private e0<String, String> E0() {
        return this.customAttributes_;
    }

    private e0<String, Long> F0() {
        if (!this.counters_.m()) {
            this.counters_ = this.counters_.q();
        }
        return this.counters_;
    }

    private e0<String, String> G0() {
        if (!this.customAttributes_.m()) {
            this.customAttributes_ = this.customAttributes_.q();
        }
        return this.customAttributes_;
    }

    public static b H0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(Iterable<? extends zx7> iterable) {
        p0();
        com.google.protobuf.a.p(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(Iterable<? extends wjb> iterable) {
        r0();
        com.google.protobuf.a.p(iterable, this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(zx7 zx7Var) {
        zx7Var.getClass();
        p0();
        this.perfSessions_.add(zx7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(wjb wjbVar) {
        wjbVar.getClass();
        r0();
        this.subtraces_.add(wjbVar);
    }

    private void p0() {
        w.i<zx7> iVar = this.perfSessions_;
        if (!iVar.o()) {
            this.perfSessions_ = u.R(iVar);
        }
    }

    private void r0() {
        w.i<wjb> iVar = this.subtraces_;
        if (!iVar.o()) {
            this.subtraces_ = u.R(iVar);
        }
    }

    public static wjb v0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> x0() {
        return F0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> y0() {
        return G0();
    }

    public List<zx7> A0() {
        return this.perfSessions_;
    }

    public List<wjb> B0() {
        return this.subtraces_;
    }

    public boolean C0() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.u
    protected final Object E(u.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new wjb();
            case 2:
                return new b(null);
            case 3:
                return u.T(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.a, "subtraces_", wjb.class, "customAttributes_", d.a, "perfSessions_", zx7.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                er7<wjb> er7Var = PARSER;
                if (er7Var == null) {
                    synchronized (wjb.class) {
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

    public boolean o0(String str) {
        str.getClass();
        return E0().containsKey(str);
    }

    public int s0() {
        return D0().size();
    }

    public Map<String, Long> t0() {
        return Collections.unmodifiableMap(D0());
    }

    public Map<String, String> u0() {
        return Collections.unmodifiableMap(E0());
    }

    public long w0() {
        return this.durationUs_;
    }

    public String z0() {
        return this.name_;
    }
}
