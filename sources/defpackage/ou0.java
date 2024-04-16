package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: ChaCha20Poly1305KeyFormat.java */
/* renamed from: ou0  reason: default package */
/* loaded from: classes2.dex */
public final class ou0 extends w<ou0, b> implements ai6 {
    private static final ou0 DEFAULT_INSTANCE;
    private static volatile dr7<ou0> PARSER;

    /* compiled from: ChaCha20Poly1305KeyFormat.java */
    /* renamed from: ou0$a */
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

    /* compiled from: ChaCha20Poly1305KeyFormat.java */
    /* renamed from: ou0$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<ou0, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(ou0.DEFAULT_INSTANCE);
        }
    }

    static {
        ou0 ou0Var = new ou0();
        DEFAULT_INSTANCE = ou0Var;
        w.J(ou0.class, ou0Var);
    }

    private ou0() {
    }

    public static ou0 M() {
        return DEFAULT_INSTANCE;
    }

    public static ou0 N(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (ou0) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new ou0();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<ou0> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (ou0.class) {
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
