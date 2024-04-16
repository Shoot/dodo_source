package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: EncryptedKeyset.java */
/* renamed from: jh3  reason: default package */
/* loaded from: classes2.dex */
public final class jh3 extends w<jh3, b> implements ai6 {
    private static final jh3 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile dr7<jh3> PARSER;
    private h encryptedKeyset_ = h.b;
    private sg5 keysetInfo_;

    /* compiled from: EncryptedKeyset.java */
    /* renamed from: jh3$a */
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

    /* compiled from: EncryptedKeyset.java */
    /* renamed from: jh3$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<jh3, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(h hVar) {
            q();
            ((jh3) this.b).R(hVar);
            return this;
        }

        public b z(sg5 sg5Var) {
            q();
            ((jh3) this.b).S(sg5Var);
            return this;
        }

        private b() {
            super(jh3.DEFAULT_INSTANCE);
        }
    }

    static {
        jh3 jh3Var = new jh3();
        DEFAULT_INSTANCE = jh3Var;
        w.J(jh3.class, jh3Var);
    }

    private jh3() {
    }

    public static b P() {
        return DEFAULT_INSTANCE.r();
    }

    public static jh3 Q(byte[] bArr, o oVar) throws InvalidProtocolBufferException {
        return (jh3) w.F(DEFAULT_INSTANCE, bArr, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(h hVar) {
        hVar.getClass();
        this.encryptedKeyset_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(sg5 sg5Var) {
        sg5Var.getClass();
        this.keysetInfo_ = sg5Var;
    }

    public h O() {
        return this.encryptedKeyset_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new jh3();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<jh3> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (jh3.class) {
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
