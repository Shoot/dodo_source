package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: KmsAeadKeyFormat.java */
/* renamed from: ah5  reason: default package */
/* loaded from: classes2.dex */
public final class ah5 extends w<ah5, b> implements ai6 {
    private static final ah5 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile dr7<ah5> PARSER;
    private String keyUri_ = "";

    /* compiled from: KmsAeadKeyFormat.java */
    /* renamed from: ah5$a */
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

    /* compiled from: KmsAeadKeyFormat.java */
    /* renamed from: ah5$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<ah5, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(ah5.DEFAULT_INSTANCE);
        }
    }

    static {
        ah5 ah5Var = new ah5();
        DEFAULT_INSTANCE = ah5Var;
        w.J(ah5.class, ah5Var);
    }

    private ah5() {
    }

    public static ah5 M() {
        return DEFAULT_INSTANCE;
    }

    public static ah5 O(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (ah5) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    public String N() {
        return this.keyUri_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new ah5();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<ah5> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (ah5.class) {
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
