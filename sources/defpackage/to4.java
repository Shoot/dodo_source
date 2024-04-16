package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: HmacKeyFormat.java */
/* renamed from: to4  reason: default package */
/* loaded from: classes2.dex */
public final class to4 extends w<to4, b> implements ai6 {
    private static final to4 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile dr7<to4> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private vo4 params_;
    private int version_;

    /* compiled from: HmacKeyFormat.java */
    /* renamed from: to4$a */
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

    /* compiled from: HmacKeyFormat.java */
    /* renamed from: to4$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<to4, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(int i) {
            q();
            ((to4) this.b).T(i);
            return this;
        }

        public b z(vo4 vo4Var) {
            q();
            ((to4) this.b).U(vo4Var);
            return this;
        }

        private b() {
            super(to4.DEFAULT_INSTANCE);
        }
    }

    static {
        to4 to4Var = new to4();
        DEFAULT_INSTANCE = to4Var;
        w.J(to4.class, to4Var);
    }

    private to4() {
    }

    public static to4 O() {
        return DEFAULT_INSTANCE;
    }

    public static b R() {
        return DEFAULT_INSTANCE.r();
    }

    public static to4 S(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (to4) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(int i) {
        this.keySize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(vo4 vo4Var) {
        vo4Var.getClass();
        this.params_ = vo4Var;
    }

    public int P() {
        return this.keySize_;
    }

    public vo4 Q() {
        vo4 vo4Var = this.params_;
        if (vo4Var == null) {
            return vo4.O();
        }
        return vo4Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new to4();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<to4> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (to4.class) {
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
