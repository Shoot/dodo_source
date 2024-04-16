package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: ChaCha20Poly1305Key.java */
/* renamed from: nu0  reason: default package */
/* loaded from: classes2.dex */
public final class nu0 extends w<nu0, b> implements ai6 {
    private static final nu0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile dr7<nu0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_ = h.b;
    private int version_;

    /* compiled from: ChaCha20Poly1305Key.java */
    /* renamed from: nu0$a */
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

    /* compiled from: ChaCha20Poly1305Key.java */
    /* renamed from: nu0$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<nu0, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(h hVar) {
            q();
            ((nu0) this.b).S(hVar);
            return this;
        }

        public b z(int i) {
            q();
            ((nu0) this.b).T(i);
            return this;
        }

        private b() {
            super(nu0.DEFAULT_INSTANCE);
        }
    }

    static {
        nu0 nu0Var = new nu0();
        DEFAULT_INSTANCE = nu0Var;
        w.J(nu0.class, nu0Var);
    }

    private nu0() {
    }

    public static b Q() {
        return DEFAULT_INSTANCE.r();
    }

    public static nu0 R(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (nu0) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(h hVar) {
        hVar.getClass();
        this.keyValue_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(int i) {
        this.version_ = i;
    }

    public h O() {
        return this.keyValue_;
    }

    public int P() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new nu0();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<nu0> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (nu0.class) {
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
