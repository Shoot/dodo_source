package defpackage;

import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: AesCtrParams.java */
/* renamed from: ha  reason: default package */
/* loaded from: classes2.dex */
public final class ha extends w<ha, b> implements ai6 {
    private static final ha DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile dr7<ha> PARSER;
    private int ivSize_;

    /* compiled from: AesCtrParams.java */
    /* renamed from: ha$a */
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

    /* compiled from: AesCtrParams.java */
    /* renamed from: ha$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<ha, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(int i) {
            q();
            ((ha) this.b).Q(i);
            return this;
        }

        private b() {
            super(ha.DEFAULT_INSTANCE);
        }
    }

    static {
        ha haVar = new ha();
        DEFAULT_INSTANCE = haVar;
        w.J(ha.class, haVar);
    }

    private ha() {
    }

    public static ha N() {
        return DEFAULT_INSTANCE;
    }

    public static b P() {
        return DEFAULT_INSTANCE.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(int i) {
        this.ivSize_ = i;
    }

    public int O() {
        return this.ivSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new ha();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<ha> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (ha.class) {
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
