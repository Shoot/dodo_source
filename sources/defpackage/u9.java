package defpackage;

import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: AesCmacParams.java */
/* renamed from: u9  reason: default package */
/* loaded from: classes2.dex */
public final class u9 extends w<u9, b> implements ai6 {
    private static final u9 DEFAULT_INSTANCE;
    private static volatile dr7<u9> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    /* compiled from: AesCmacParams.java */
    /* renamed from: u9$a */
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

    /* compiled from: AesCmacParams.java */
    /* renamed from: u9$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<u9, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(int i) {
            q();
            ((u9) this.b).Q(i);
            return this;
        }

        private b() {
            super(u9.DEFAULT_INSTANCE);
        }
    }

    static {
        u9 u9Var = new u9();
        DEFAULT_INSTANCE = u9Var;
        w.J(u9.class, u9Var);
    }

    private u9() {
    }

    public static u9 N() {
        return DEFAULT_INSTANCE;
    }

    public static b P() {
        return DEFAULT_INSTANCE.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(int i) {
        this.tagSize_ = i;
    }

    public int O() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new u9();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<u9> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (u9.class) {
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
