package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: AesCtrKey.java */
/* renamed from: ea  reason: default package */
/* loaded from: classes2.dex */
public final class ea extends w<ea, b> implements ai6 {
    private static final ea DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile dr7<ea> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_ = h.b;
    private ha params_;
    private int version_;

    /* compiled from: AesCtrKey.java */
    /* renamed from: ea$a */
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

    /* compiled from: AesCtrKey.java */
    /* renamed from: ea$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<ea, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(int i) {
            q();
            ((ea) this.b).X(i);
            return this;
        }

        public b y(h hVar) {
            q();
            ((ea) this.b).V(hVar);
            return this;
        }

        public b z(ha haVar) {
            q();
            ((ea) this.b).W(haVar);
            return this;
        }

        private b() {
            super(ea.DEFAULT_INSTANCE);
        }
    }

    static {
        ea eaVar = new ea();
        DEFAULT_INSTANCE = eaVar;
        w.J(ea.class, eaVar);
    }

    private ea() {
    }

    public static ea P() {
        return DEFAULT_INSTANCE;
    }

    public static b T() {
        return DEFAULT_INSTANCE.r();
    }

    public static ea U(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (ea) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(h hVar) {
        hVar.getClass();
        this.keyValue_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(ha haVar) {
        haVar.getClass();
        this.params_ = haVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(int i) {
        this.version_ = i;
    }

    public h Q() {
        return this.keyValue_;
    }

    public ha R() {
        ha haVar = this.params_;
        if (haVar == null) {
            return ha.N();
        }
        return haVar;
    }

    public int S() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new ea();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<ea> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (ea.class) {
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
