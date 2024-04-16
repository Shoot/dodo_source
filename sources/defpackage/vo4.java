package defpackage;

import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: HmacParams.java */
/* renamed from: vo4  reason: default package */
/* loaded from: classes2.dex */
public final class vo4 extends w<vo4, b> implements ai6 {
    private static final vo4 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile dr7<vo4> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* compiled from: HmacParams.java */
    /* renamed from: vo4$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[w.f.values().length];
            a = iArr;
            try {
                iArr[w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: HmacParams.java */
    /* renamed from: vo4$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<vo4, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(bn4 bn4Var) {
            q();
            ((vo4) this.b).S(bn4Var);
            return this;
        }

        public b z(int i) {
            q();
            ((vo4) this.b).T(i);
            return this;
        }

        private b() {
            super(vo4.DEFAULT_INSTANCE);
        }
    }

    static {
        vo4 vo4Var = new vo4();
        DEFAULT_INSTANCE = vo4Var;
        w.J(vo4.class, vo4Var);
    }

    private vo4() {
    }

    public static vo4 O() {
        return DEFAULT_INSTANCE;
    }

    public static b R() {
        return DEFAULT_INSTANCE.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(bn4 bn4Var) {
        this.hash_ = bn4Var.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(int i) {
        this.tagSize_ = i;
    }

    public bn4 P() {
        bn4 a2 = bn4.a(this.hash_);
        if (a2 == null) {
            return bn4.UNRECOGNIZED;
        }
        return a2;
    }

    public int Q() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new vo4();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<vo4> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (vo4.class) {
                        try {
                            dr7Var = PARSER;
                            if (dr7Var == null) {
                                dr7Var = new w.b<>(DEFAULT_INSTANCE);
                                PARSER = dr7Var;
                            }
                        } finally {
                        }
                    }
                }
                return dr7Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
