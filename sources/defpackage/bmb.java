package defpackage;

import com.google.protobuf.u;
import com.google.protobuf.w;
/* compiled from: TransportInfo.java */
/* renamed from: bmb  reason: default package */
/* loaded from: classes2.dex */
public final class bmb extends u<bmb, b> implements bi6 {
    private static final bmb DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile er7<bmb> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* compiled from: TransportInfo.java */
    /* renamed from: bmb$a */
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

    /* compiled from: TransportInfo.java */
    /* renamed from: bmb$b */
    /* loaded from: classes2.dex */
    public static final class b extends u.a<bmb, b> implements bi6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(bmb.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: TransportInfo.java */
    /* renamed from: bmb$c */
    /* loaded from: classes2.dex */
    public enum c implements w.c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);
        
        private static final w.d<c> d = new a();
        private final int a;

        /* compiled from: TransportInfo.java */
        /* renamed from: bmb$c$a */
        /* loaded from: classes2.dex */
        class a implements w.d<c> {
            a() {
            }

            @Override // com.google.protobuf.w.d
            /* renamed from: b */
            public c a(int i) {
                return c.a(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: TransportInfo.java */
        /* renamed from: bmb$c$b */
        /* loaded from: classes2.dex */
        public static final class b implements w.e {
            static final w.e a = new b();

            private b() {
            }

            @Override // com.google.protobuf.w.e
            public boolean a(int i) {
                if (c.a(i) != null) {
                    return true;
                }
                return false;
            }
        }

        c(int i) {
            this.a = i;
        }

        public static c a(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return FL_LEGACY_V1;
            }
            return SOURCE_UNKNOWN;
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
        bmb bmbVar = new bmb();
        DEFAULT_INSTANCE = bmbVar;
        u.W(bmb.class, bmbVar);
    }

    private bmb() {
    }

    @Override // com.google.protobuf.u
    protected final Object E(u.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new bmb();
            case 2:
                return new b(null);
            case 3:
                return u.T(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", c.i()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                er7<bmb> er7Var = PARSER;
                if (er7Var == null) {
                    synchronized (bmb.class) {
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
