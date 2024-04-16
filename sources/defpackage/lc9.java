package defpackage;

import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.y;
/* compiled from: RegistryConfig.java */
@Deprecated
/* renamed from: lc9  reason: default package */
/* loaded from: classes2.dex */
public final class lc9 extends w<lc9, b> implements ai6 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final lc9 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile dr7<lc9> PARSER;
    private String configName_ = "";
    private y.i<xf5> entry_ = w.v();

    /* compiled from: RegistryConfig.java */
    /* renamed from: lc9$a */
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

    /* compiled from: RegistryConfig.java */
    /* renamed from: lc9$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<lc9, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(lc9.DEFAULT_INSTANCE);
        }
    }

    static {
        lc9 lc9Var = new lc9();
        DEFAULT_INSTANCE = lc9Var;
        w.J(lc9.class, lc9Var);
    }

    private lc9() {
    }

    public static lc9 M() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new lc9();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", xf5.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<lc9> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (lc9.class) {
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
