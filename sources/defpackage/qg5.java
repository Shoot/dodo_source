package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.y;
import java.util.Collections;
import java.util.List;
/* compiled from: Keyset.java */
/* renamed from: qg5  reason: default package */
/* loaded from: classes2.dex */
public final class qg5 extends w<qg5, b> implements ai6 {
    private static final qg5 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile dr7<qg5> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private y.i<c> key_ = w.v();
    private int primaryKeyId_;

    /* compiled from: Keyset.java */
    /* renamed from: qg5$a */
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

    /* compiled from: Keyset.java */
    /* renamed from: qg5$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<qg5, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public int A() {
            return ((qg5) this.b).R();
        }

        public List<c> B() {
            return Collections.unmodifiableList(((qg5) this.b).S());
        }

        public b C(int i) {
            q();
            ((qg5) this.b).W(i);
            return this;
        }

        public b y(c cVar) {
            q();
            ((qg5) this.b).O(cVar);
            return this;
        }

        public c z(int i) {
            return ((qg5) this.b).Q(i);
        }

        private b() {
            super(qg5.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Keyset.java */
    /* renamed from: qg5$c */
    /* loaded from: classes2.dex */
    public static final class c extends w<c, a> implements ai6 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile dr7<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private we5 keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* compiled from: Keyset.java */
        /* renamed from: qg5$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends w.a<c, a> implements ai6 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a A(mm7 mm7Var) {
                q();
                ((c) this.b).Y(mm7Var);
                return this;
            }

            public a B(tf5 tf5Var) {
                q();
                ((c) this.b).Z(tf5Var);
                return this;
            }

            public a y(we5 we5Var) {
                q();
                ((c) this.b).W(we5Var);
                return this;
            }

            public a z(int i) {
                q();
                ((c) this.b).X(i);
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

        public static a V() {
            return DEFAULT_INSTANCE.r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void W(we5 we5Var) {
            we5Var.getClass();
            this.keyData_ = we5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void X(int i) {
            this.keyId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Y(mm7 mm7Var) {
            this.outputPrefixType_ = mm7Var.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z(tf5 tf5Var) {
            this.status_ = tf5Var.e();
        }

        public we5 Q() {
            we5 we5Var = this.keyData_;
            if (we5Var == null) {
                return we5.P();
            }
            return we5Var;
        }

        public int R() {
            return this.keyId_;
        }

        public mm7 S() {
            mm7 a2 = mm7.a(this.outputPrefixType_);
            if (a2 == null) {
                return mm7.UNRECOGNIZED;
            }
            return a2;
        }

        public tf5 T() {
            tf5 a2 = tf5.a(this.status_);
            if (a2 == null) {
                return tf5.UNRECOGNIZED;
            }
            return a2;
        }

        public boolean U() {
            if (this.keyData_ != null) {
                return true;
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.w
        protected final Object u(w.f fVar, Object obj, Object obj2) {
            switch (a.a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return w.D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        qg5 qg5Var = new qg5();
        DEFAULT_INSTANCE = qg5Var;
        w.J(qg5.class, qg5Var);
    }

    private qg5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(c cVar) {
        cVar.getClass();
        P();
        this.key_.add(cVar);
    }

    private void P() {
        y.i<c> iVar = this.key_;
        if (!iVar.o()) {
            this.key_ = w.B(iVar);
        }
    }

    public static b U() {
        return DEFAULT_INSTANCE.r();
    }

    public static qg5 V(byte[] bArr, o oVar) throws InvalidProtocolBufferException {
        return (qg5) w.F(DEFAULT_INSTANCE, bArr, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i) {
        this.primaryKeyId_ = i;
    }

    public c Q(int i) {
        return this.key_.get(i);
    }

    public int R() {
        return this.key_.size();
    }

    public List<c> S() {
        return this.key_;
    }

    public int T() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new qg5();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<qg5> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (qg5.class) {
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
