package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: HmacKey.java */
/* renamed from: so4  reason: default package */
/* loaded from: classes2.dex */
public final class so4 extends w<so4, b> implements ai6 {
    private static final so4 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile dr7<so4> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_ = h.b;
    private vo4 params_;
    private int version_;

    /* compiled from: HmacKey.java */
    /* renamed from: so4$a */
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

    /* compiled from: HmacKey.java */
    /* renamed from: so4$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<so4, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(int i) {
            q();
            ((so4) this.b).X(i);
            return this;
        }

        public b y(h hVar) {
            q();
            ((so4) this.b).V(hVar);
            return this;
        }

        public b z(vo4 vo4Var) {
            q();
            ((so4) this.b).W(vo4Var);
            return this;
        }

        private b() {
            super(so4.DEFAULT_INSTANCE);
        }
    }

    static {
        so4 so4Var = new so4();
        DEFAULT_INSTANCE = so4Var;
        w.J(so4.class, so4Var);
    }

    private so4() {
    }

    public static so4 P() {
        return DEFAULT_INSTANCE;
    }

    public static b T() {
        return DEFAULT_INSTANCE.r();
    }

    public static so4 U(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (so4) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(h hVar) {
        hVar.getClass();
        this.keyValue_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(vo4 vo4Var) {
        vo4Var.getClass();
        this.params_ = vo4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(int i) {
        this.version_ = i;
    }

    public h Q() {
        return this.keyValue_;
    }

    public vo4 R() {
        vo4 vo4Var = this.params_;
        if (vo4Var == null) {
            return vo4.O();
        }
        return vo4Var;
    }

    public int S() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new so4();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<so4> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (so4.class) {
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
