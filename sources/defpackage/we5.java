package defpackage;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.y;
/* compiled from: KeyData.java */
/* renamed from: we5  reason: default package */
/* loaded from: classes2.dex */
public final class we5 extends w<we5, b> implements ai6 {
    private static final we5 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile dr7<we5> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private h value_ = h.b;

    /* compiled from: KeyData.java */
    /* renamed from: we5$a */
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

    /* compiled from: KeyData.java */
    /* renamed from: we5$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<we5, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(h hVar) {
            q();
            ((we5) this.b).W(hVar);
            return this;
        }

        public b y(c cVar) {
            q();
            ((we5) this.b).U(cVar);
            return this;
        }

        public b z(String str) {
            q();
            ((we5) this.b).V(str);
            return this;
        }

        private b() {
            super(we5.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: KeyData.java */
    /* renamed from: we5$c */
    /* loaded from: classes2.dex */
    public enum c implements y.c {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final y.d<c> h = new a();
        private final int a;

        /* compiled from: KeyData.java */
        /* renamed from: we5$c$a */
        /* loaded from: classes2.dex */
        class a implements y.d<c> {
            a() {
            }

            @Override // com.google.crypto.tink.shaded.protobuf.y.d
            /* renamed from: b */
            public c a(int i) {
                return c.a(i);
            }
        }

        c(int i2) {
            this.a = i2;
        }

        public static c a(int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                return null;
                            }
                            return REMOTE;
                        }
                        return ASYMMETRIC_PUBLIC;
                    }
                    return ASYMMETRIC_PRIVATE;
                }
                return SYMMETRIC;
            }
            return UNKNOWN_KEYMATERIAL;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.c
        public final int e() {
            if (this != UNRECOGNIZED) {
                return this.a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        we5 we5Var = new we5();
        DEFAULT_INSTANCE = we5Var;
        w.J(we5.class, we5Var);
    }

    private we5() {
    }

    public static we5 P() {
        return DEFAULT_INSTANCE;
    }

    public static b T() {
        return DEFAULT_INSTANCE.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(c cVar) {
        this.keyMaterialType_ = cVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(h hVar) {
        hVar.getClass();
        this.value_ = hVar;
    }

    public c Q() {
        c a2 = c.a(this.keyMaterialType_);
        if (a2 == null) {
            return c.UNRECOGNIZED;
        }
        return a2;
    }

    public String R() {
        return this.typeUrl_;
    }

    public h S() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new we5();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<we5> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (we5.class) {
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
