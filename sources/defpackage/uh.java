package defpackage;

import com.google.protobuf.u;
/* compiled from: AndroidMemoryReading.java */
/* renamed from: uh  reason: default package */
/* loaded from: classes2.dex */
public final class uh extends u<uh, b> implements bi6 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final uh DEFAULT_INSTANCE;
    private static volatile er7<uh> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* compiled from: AndroidMemoryReading.java */
    /* renamed from: uh$a */
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

    /* compiled from: AndroidMemoryReading.java */
    /* renamed from: uh$b */
    /* loaded from: classes2.dex */
    public static final class b extends u.a<uh, b> implements bi6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b I(long j) {
            z();
            ((uh) this.b).d0(j);
            return this;
        }

        public b J(int i) {
            z();
            ((uh) this.b).e0(i);
            return this;
        }

        private b() {
            super(uh.DEFAULT_INSTANCE);
        }
    }

    static {
        uh uhVar = new uh();
        DEFAULT_INSTANCE = uhVar;
        u.W(uh.class, uhVar);
    }

    private uh() {
    }

    public static b c0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i;
    }

    @Override // com.google.protobuf.u
    protected final Object E(u.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new uh();
            case 2:
                return new b(null);
            case 3:
                return u.T(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                er7<uh> er7Var = PARSER;
                if (er7Var == null) {
                    synchronized (uh.class) {
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
