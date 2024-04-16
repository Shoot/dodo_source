package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: AesCtrHmacAeadKey.java */
/* renamed from: aa  reason: default package */
/* loaded from: classes2.dex */
public final class aa extends w<aa, b> implements ai6 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final aa DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile dr7<aa> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ea aesCtrKey_;
    private so4 hmacKey_;
    private int version_;

    /* compiled from: AesCtrHmacAeadKey.java */
    /* renamed from: aa$a */
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

    /* compiled from: AesCtrHmacAeadKey.java */
    /* renamed from: aa$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<aa, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(int i) {
            q();
            ((aa) this.b).W(i);
            return this;
        }

        public b y(ea eaVar) {
            q();
            ((aa) this.b).U(eaVar);
            return this;
        }

        public b z(so4 so4Var) {
            q();
            ((aa) this.b).V(so4Var);
            return this;
        }

        private b() {
            super(aa.DEFAULT_INSTANCE);
        }
    }

    static {
        aa aaVar = new aa();
        DEFAULT_INSTANCE = aaVar;
        w.J(aa.class, aaVar);
    }

    private aa() {
    }

    public static b S() {
        return DEFAULT_INSTANCE.r();
    }

    public static aa T(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (aa) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(ea eaVar) {
        eaVar.getClass();
        this.aesCtrKey_ = eaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(so4 so4Var) {
        so4Var.getClass();
        this.hmacKey_ = so4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i) {
        this.version_ = i;
    }

    public ea P() {
        ea eaVar = this.aesCtrKey_;
        if (eaVar == null) {
            return ea.P();
        }
        return eaVar;
    }

    public so4 Q() {
        so4 so4Var = this.hmacKey_;
        if (so4Var == null) {
            return so4.P();
        }
        return so4Var;
    }

    public int R() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new aa();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<aa> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (aa.class) {
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
