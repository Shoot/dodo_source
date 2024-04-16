package defpackage;

import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.y;
/* compiled from: KeysetInfo.java */
/* renamed from: sg5  reason: default package */
/* loaded from: classes2.dex */
public final class sg5 extends w<sg5, b> implements ai6 {
    private static final sg5 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile dr7<sg5> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private y.i<c> keyInfo_ = w.v();
    private int primaryKeyId_;

    /* compiled from: KeysetInfo.java */
    /* renamed from: sg5$a */
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

    /* compiled from: KeysetInfo.java */
    /* renamed from: sg5$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<sg5, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(c cVar) {
            q();
            ((sg5) this.b).O(cVar);
            return this;
        }

        public b z(int i) {
            q();
            ((sg5) this.b).S(i);
            return this;
        }

        private b() {
            super(sg5.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: KeysetInfo.java */
    /* renamed from: sg5$c */
    /* loaded from: classes2.dex */
    public static final class c extends w<c, a> implements ai6 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile dr7<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* compiled from: KeysetInfo.java */
        /* renamed from: sg5$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends w.a<c, a> implements ai6 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A(tf5 tf5Var) {
                q();
                ((c) this.b).U(tf5Var);
                return this;
            }

            public a B(String str) {
                q();
                ((c) this.b).V(str);
                return this;
            }

            public a y(int i) {
                q();
                ((c) this.b).S(i);
                return this;
            }

            public a z(mm7 mm7Var) {
                q();
                ((c) this.b).T(mm7Var);
                return this;
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            w.J(c.class, cVar);
        }

        private c() {
        }

        public static a R() {
            return DEFAULT_INSTANCE.r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void S(int i) {
            this.keyId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void T(mm7 mm7Var) {
            this.outputPrefixType_ = mm7Var.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void U(tf5 tf5Var) {
            this.status_ = tf5Var.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void V(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int Q() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.w
        protected final Object u(w.f fVar, Object obj, Object obj2) {
            switch (a.a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return w.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    dr7<c> dr7Var = PARSER;
                    if (dr7Var == null) {
                        synchronized (c.class) {
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

    static {
        sg5 sg5Var = new sg5();
        DEFAULT_INSTANCE = sg5Var;
        w.J(sg5.class, sg5Var);
    }

    private sg5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(c cVar) {
        cVar.getClass();
        P();
        this.keyInfo_.add(cVar);
    }

    private void P() {
        y.i<c> iVar = this.keyInfo_;
        if (!iVar.o()) {
            this.keyInfo_ = w.B(iVar);
        }
    }

    public static b R() {
        return DEFAULT_INSTANCE.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i) {
        this.primaryKeyId_ = i;
    }

    public c Q(int i) {
        return this.keyInfo_.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new sg5();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<sg5> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (sg5.class) {
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
