package defpackage;

import com.google.protobuf.u;
import com.google.protobuf.w;
/* compiled from: PerfSession.java */
/* renamed from: zx7  reason: default package */
/* loaded from: classes2.dex */
public final class zx7 extends u<zx7, c> implements bi6 {
    private static final zx7 DEFAULT_INSTANCE;
    private static volatile er7<zx7> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final o65<Integer, efa> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private w.g sessionVerbosity_ = u.F();

    /* compiled from: PerfSession.java */
    /* renamed from: zx7$a */
    /* loaded from: classes2.dex */
    class a implements o65<Integer, efa> {
        a() {
        }
    }

    /* compiled from: PerfSession.java */
    /* renamed from: zx7$b */
    /* loaded from: classes2.dex */
    static /* synthetic */ class b {
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

    /* compiled from: PerfSession.java */
    /* renamed from: zx7$c */
    /* loaded from: classes2.dex */
    public static final class c extends u.a<zx7, c> implements bi6 {
        /* synthetic */ c(a aVar) {
            this();
        }

        public c I(efa efaVar) {
            z();
            ((zx7) this.b).c0(efaVar);
            return this;
        }

        public c J(String str) {
            z();
            ((zx7) this.b).h0(str);
            return this;
        }

        private c() {
            super(zx7.DEFAULT_INSTANCE);
        }
    }

    static {
        zx7 zx7Var = new zx7();
        DEFAULT_INSTANCE = zx7Var;
        u.W(zx7.class, zx7Var);
    }

    private zx7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(efa efaVar) {
        efaVar.getClass();
        d0();
        this.sessionVerbosity_.S0(efaVar.e());
    }

    private void d0() {
        w.g gVar = this.sessionVerbosity_;
        if (!gVar.o()) {
            this.sessionVerbosity_ = u.Q(gVar);
        }
    }

    public static c g0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.u
    protected final Object E(u.f fVar, Object obj, Object obj2) {
        switch (b.a[fVar.ordinal()]) {
            case 1:
                return new zx7();
            case 2:
                return new c(null);
            case 3:
                return u.T(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", efa.i()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                er7<zx7> er7Var = PARSER;
                if (er7Var == null) {
                    synchronized (zx7.class) {
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

    public efa e0(int i) {
        efa a2 = efa.a(this.sessionVerbosity_.getInt(i));
        if (a2 == null) {
            return efa.SESSION_VERBOSITY_NONE;
        }
        return a2;
    }

    public int f0() {
        return this.sessionVerbosity_.size();
    }
}
