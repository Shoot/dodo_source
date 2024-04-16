package defpackage;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: KeyTemplate.java */
/* renamed from: vf5  reason: default package */
/* loaded from: classes2.dex */
public final class vf5 extends w<vf5, b> implements ai6 {
    private static final vf5 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile dr7<vf5> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private h value_ = h.b;

    /* compiled from: KeyTemplate.java */
    /* renamed from: vf5$a */
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

    /* compiled from: KeyTemplate.java */
    /* renamed from: vf5$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<vf5, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(h hVar) {
            q();
            ((vf5) this.b).W(hVar);
            return this;
        }

        public b y(mm7 mm7Var) {
            q();
            ((vf5) this.b).U(mm7Var);
            return this;
        }

        public b z(String str) {
            q();
            ((vf5) this.b).V(str);
            return this;
        }

        private b() {
            super(vf5.DEFAULT_INSTANCE);
        }
    }

    static {
        vf5 vf5Var = new vf5();
        DEFAULT_INSTANCE = vf5Var;
        w.J(vf5.class, vf5Var);
    }

    private vf5() {
    }

    public static vf5 P() {
        return DEFAULT_INSTANCE;
    }

    public static b T() {
        return DEFAULT_INSTANCE.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(mm7 mm7Var) {
        this.outputPrefixType_ = mm7Var.e();
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

    public mm7 Q() {
        mm7 a2 = mm7.a(this.outputPrefixType_);
        if (a2 == null) {
            return mm7.UNRECOGNIZED;
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
                return new vf5();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<vf5> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (vf5.class) {
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
