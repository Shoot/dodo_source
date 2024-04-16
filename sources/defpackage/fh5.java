package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: KmsEnvelopeAeadKey.java */
/* renamed from: fh5  reason: default package */
/* loaded from: classes2.dex */
public final class fh5 extends w<fh5, b> implements ai6 {
    private static final fh5 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile dr7<fh5> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private gh5 params_;
    private int version_;

    /* compiled from: KmsEnvelopeAeadKey.java */
    /* renamed from: fh5$a */
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

    /* compiled from: KmsEnvelopeAeadKey.java */
    /* renamed from: fh5$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<fh5, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(gh5 gh5Var) {
            q();
            ((fh5) this.b).S(gh5Var);
            return this;
        }

        public b z(int i) {
            q();
            ((fh5) this.b).T(i);
            return this;
        }

        private b() {
            super(fh5.DEFAULT_INSTANCE);
        }
    }

    static {
        fh5 fh5Var = new fh5();
        DEFAULT_INSTANCE = fh5Var;
        w.J(fh5.class, fh5Var);
    }

    private fh5() {
    }

    public static b Q() {
        return DEFAULT_INSTANCE.r();
    }

    public static fh5 R(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (fh5) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(gh5 gh5Var) {
        gh5Var.getClass();
        this.params_ = gh5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(int i) {
        this.version_ = i;
    }

    public gh5 O() {
        gh5 gh5Var = this.params_;
        if (gh5Var == null) {
            return gh5.M();
        }
        return gh5Var;
    }

    public int P() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new fh5();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<fh5> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (fh5.class) {
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
