package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: AesCtrHmacAeadKeyFormat.java */
/* renamed from: ba  reason: default package */
/* loaded from: classes2.dex */
public final class ba extends w<ba, b> implements ai6 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final ba DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile dr7<ba> PARSER;
    private fa aesCtrKeyFormat_;
    private to4 hmacKeyFormat_;

    /* compiled from: AesCtrHmacAeadKeyFormat.java */
    /* renamed from: ba$a */
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

    /* compiled from: AesCtrHmacAeadKeyFormat.java */
    /* renamed from: ba$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<ba, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(fa faVar) {
            q();
            ((ba) this.b).S(faVar);
            return this;
        }

        public b z(to4 to4Var) {
            q();
            ((ba) this.b).T(to4Var);
            return this;
        }

        private b() {
            super(ba.DEFAULT_INSTANCE);
        }
    }

    static {
        ba baVar = new ba();
        DEFAULT_INSTANCE = baVar;
        w.J(ba.class, baVar);
    }

    private ba() {
    }

    public static b Q() {
        return DEFAULT_INSTANCE.r();
    }

    public static ba R(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (ba) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(fa faVar) {
        faVar.getClass();
        this.aesCtrKeyFormat_ = faVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(to4 to4Var) {
        to4Var.getClass();
        this.hmacKeyFormat_ = to4Var;
    }

    public fa O() {
        fa faVar = this.aesCtrKeyFormat_;
        if (faVar == null) {
            return fa.O();
        }
        return faVar;
    }

    public to4 P() {
        to4 to4Var = this.hmacKeyFormat_;
        if (to4Var == null) {
            return to4.O();
        }
        return to4Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new ba();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<ba> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (ba.class) {
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
