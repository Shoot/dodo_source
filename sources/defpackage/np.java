package defpackage;

import com.google.protobuf.d0;
import com.google.protobuf.e0;
import com.google.protobuf.h1;
import com.google.protobuf.u;
import defpackage.ee;
import java.util.Map;
/* compiled from: ApplicationInfo.java */
/* renamed from: np  reason: default package */
/* loaded from: classes2.dex */
public final class np extends u<np, b> implements bi6 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final np DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile er7<np> PARSER;
    private ee androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private e0<String, String> customAttributes_ = e0.e();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* compiled from: ApplicationInfo.java */
    /* renamed from: np$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u.f.values().length];
            a = iArr;
            try {
                iArr[u.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: ApplicationInfo.java */
    /* renamed from: np$b */
    /* loaded from: classes2.dex */
    public static final class b extends u.a<np, b> implements bi6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public boolean I() {
            return ((np) this.b).j0();
        }

        public b J(Map<String, String> map) {
            z();
            ((np) this.b).h0().putAll(map);
            return this;
        }

        public b K(ee.b bVar) {
            z();
            ((np) this.b).p0(bVar.a());
            return this;
        }

        public b L(String str) {
            z();
            ((np) this.b).r0(str);
            return this;
        }

        public b M(tp tpVar) {
            z();
            ((np) this.b).s0(tpVar);
            return this;
        }

        public b N(String str) {
            z();
            ((np) this.b).t0(str);
            return this;
        }

        private b() {
            super(np.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: ApplicationInfo.java */
    /* renamed from: np$c */
    /* loaded from: classes2.dex */
    private static final class c {
        static final d0<String, String> a;

        static {
            h1.b bVar = h1.b.k;
            a = d0.d(bVar, "", bVar, "");
        }
    }

    static {
        np npVar = new np();
        DEFAULT_INSTANCE = npVar;
        u.W(np.class, npVar);
    }

    private np() {
    }

    public static np g0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> h0() {
        return m0();
    }

    private e0<String, String> m0() {
        if (!this.customAttributes_.m()) {
            this.customAttributes_ = this.customAttributes_.q();
        }
        return this.customAttributes_;
    }

    public static b o0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(ee eeVar) {
        eeVar.getClass();
        this.androidAppInfo_ = eeVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(tp tpVar) {
        this.applicationProcessState_ = tpVar.e();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    @Override // com.google.protobuf.u
    protected final Object E(u.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new np();
            case 2:
                return new b(null);
            case 3:
                return u.T(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", tp.i(), "customAttributes_", c.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                er7<np> er7Var = PARSER;
                if (er7Var == null) {
                    synchronized (np.class) {
                        try {
                            er7Var = PARSER;
                            if (er7Var == null) {
                                er7Var = new u.b<>(DEFAULT_INSTANCE);
                                PARSER = er7Var;
                            }
                        } finally {
                        }
                    }
                }
                return er7Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public ee f0() {
        ee eeVar = this.androidAppInfo_;
        if (eeVar == null) {
            return ee.d0();
        }
        return eeVar;
    }

    public boolean i0() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean j0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean k0() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean l0() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }
}
