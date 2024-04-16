package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: AesCmacKeyFormat.java */
/* renamed from: r9  reason: default package */
/* loaded from: classes2.dex */
public final class r9 extends w<r9, b> implements ai6 {
    private static final r9 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile dr7<r9> PARSER;
    private int keySize_;
    private u9 params_;

    /* compiled from: AesCmacKeyFormat.java */
    /* renamed from: r9$a */
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

    /* compiled from: AesCmacKeyFormat.java */
    /* renamed from: r9$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<r9, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(int i) {
            q();
            ((r9) this.b).S(i);
            return this;
        }

        public b z(u9 u9Var) {
            q();
            ((r9) this.b).T(u9Var);
            return this;
        }

        private b() {
            super(r9.DEFAULT_INSTANCE);
        }
    }

    static {
        r9 r9Var = new r9();
        DEFAULT_INSTANCE = r9Var;
        w.J(r9.class, r9Var);
    }

    private r9() {
    }

    public static b Q() {
        return DEFAULT_INSTANCE.r();
    }

    public static r9 R(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (r9) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i) {
        this.keySize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(u9 u9Var) {
        u9Var.getClass();
        this.params_ = u9Var;
    }

    public int O() {
        return this.keySize_;
    }

    public u9 P() {
        u9 u9Var = this.params_;
        if (u9Var == null) {
            return u9.N();
        }
        return u9Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new r9();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<r9> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (r9.class) {
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
