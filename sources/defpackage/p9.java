package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: AesCmacKey.java */
/* renamed from: p9  reason: default package */
/* loaded from: classes2.dex */
public final class p9 extends w<p9, b> implements ai6 {
    private static final p9 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile dr7<p9> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_ = h.b;
    private u9 params_;
    private int version_;

    /* compiled from: AesCmacKey.java */
    /* renamed from: p9$a */
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

    /* compiled from: AesCmacKey.java */
    /* renamed from: p9$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<p9, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(int i) {
            q();
            ((p9) this.b).W(i);
            return this;
        }

        public b y(h hVar) {
            q();
            ((p9) this.b).U(hVar);
            return this;
        }

        public b z(u9 u9Var) {
            q();
            ((p9) this.b).V(u9Var);
            return this;
        }

        private b() {
            super(p9.DEFAULT_INSTANCE);
        }
    }

    static {
        p9 p9Var = new p9();
        DEFAULT_INSTANCE = p9Var;
        w.J(p9.class, p9Var);
    }

    private p9() {
    }

    public static b S() {
        return DEFAULT_INSTANCE.r();
    }

    public static p9 T(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (p9) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(h hVar) {
        hVar.getClass();
        this.keyValue_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(u9 u9Var) {
        u9Var.getClass();
        this.params_ = u9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i) {
        this.version_ = i;
    }

    public h P() {
        return this.keyValue_;
    }

    public u9 Q() {
        u9 u9Var = this.params_;
        if (u9Var == null) {
            return u9.N();
        }
        return u9Var;
    }

    public int R() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new p9();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<p9> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (p9.class) {
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
