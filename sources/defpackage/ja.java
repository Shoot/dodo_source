package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: AesEaxKey.java */
/* renamed from: ja  reason: default package */
/* loaded from: classes2.dex */
public final class ja extends w<ja, b> implements ai6 {
    private static final ja DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile dr7<ja> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_ = h.b;
    private ma params_;
    private int version_;

    /* compiled from: AesEaxKey.java */
    /* renamed from: ja$a */
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

    /* compiled from: AesEaxKey.java */
    /* renamed from: ja$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<ja, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(int i) {
            q();
            ((ja) this.b).W(i);
            return this;
        }

        public b y(h hVar) {
            q();
            ((ja) this.b).U(hVar);
            return this;
        }

        public b z(ma maVar) {
            q();
            ((ja) this.b).V(maVar);
            return this;
        }

        private b() {
            super(ja.DEFAULT_INSTANCE);
        }
    }

    static {
        ja jaVar = new ja();
        DEFAULT_INSTANCE = jaVar;
        w.J(ja.class, jaVar);
    }

    private ja() {
    }

    public static b S() {
        return DEFAULT_INSTANCE.r();
    }

    public static ja T(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (ja) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(h hVar) {
        hVar.getClass();
        this.keyValue_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(ma maVar) {
        maVar.getClass();
        this.params_ = maVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i) {
        this.version_ = i;
    }

    public h P() {
        return this.keyValue_;
    }

    public ma Q() {
        ma maVar = this.params_;
        if (maVar == null) {
            return ma.N();
        }
        return maVar;
    }

    public int R() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new ja();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<ja> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (ja.class) {
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
