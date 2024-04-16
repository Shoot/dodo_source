package defpackage;

import com.google.protobuf.u;
/* compiled from: CpuMetricReading.java */
/* renamed from: p02  reason: default package */
/* loaded from: classes2.dex */
public final class p02 extends u<p02, b> implements bi6 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final p02 DEFAULT_INSTANCE;
    private static volatile er7<p02> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* compiled from: CpuMetricReading.java */
    /* renamed from: p02$a */
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

    /* compiled from: CpuMetricReading.java */
    /* renamed from: p02$b */
    /* loaded from: classes2.dex */
    public static final class b extends u.a<p02, b> implements bi6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b I(long j) {
            z();
            ((p02) this.b).e0(j);
            return this;
        }

        public b J(long j) {
            z();
            ((p02) this.b).f0(j);
            return this;
        }

        public b K(long j) {
            z();
            ((p02) this.b).g0(j);
            return this;
        }

        private b() {
            super(p02.DEFAULT_INSTANCE);
        }
    }

    static {
        p02 p02Var = new p02();
        DEFAULT_INSTANCE = p02Var;
        u.W(p02.class, p02Var);
    }

    private p02() {
    }

    public static b d0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(long j) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(long j) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j;
    }

    @Override // com.google.protobuf.u
    protected final Object E(u.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new p02();
            case 2:
                return new b(null);
            case 3:
                return u.T(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                er7<p02> er7Var = PARSER;
                if (er7Var == null) {
                    synchronized (p02.class) {
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
}
