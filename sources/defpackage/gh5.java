package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: KmsEnvelopeAeadKeyFormat.java */
/* renamed from: gh5  reason: default package */
/* loaded from: classes2.dex */
public final class gh5 extends w<gh5, b> implements ai6 {
    private static final gh5 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile dr7<gh5> PARSER;
    private vf5 dekTemplate_;
    private String kekUri_ = "";

    /* compiled from: KmsEnvelopeAeadKeyFormat.java */
    /* renamed from: gh5$a */
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

    /* compiled from: KmsEnvelopeAeadKeyFormat.java */
    /* renamed from: gh5$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<gh5, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(gh5.DEFAULT_INSTANCE);
        }
    }

    static {
        gh5 gh5Var = new gh5();
        DEFAULT_INSTANCE = gh5Var;
        w.J(gh5.class, gh5Var);
    }

    private gh5() {
    }

    public static gh5 M() {
        return DEFAULT_INSTANCE;
    }

    public static gh5 Q(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (gh5) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    public vf5 N() {
        vf5 vf5Var = this.dekTemplate_;
        if (vf5Var == null) {
            return vf5.P();
        }
        return vf5Var;
    }

    public String O() {
        return this.kekUri_;
    }

    public boolean P() {
        if (this.dekTemplate_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new gh5();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<gh5> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (gh5.class) {
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
