package defpackage;

import androidx.datastore.preferences.protobuf.v;
import defpackage.ji8;
/* compiled from: PreferencesProto.java */
/* renamed from: ki8  reason: default package */
/* loaded from: classes.dex */
public final class ki8 extends v<ki8, a> implements ci6 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final ki8 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile gr7<ki8> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* compiled from: PreferencesProto.java */
    /* renamed from: ki8$a */
    /* loaded from: classes.dex */
    public static final class a extends v.a<ki8, a> implements ci6 {
        /* synthetic */ a(hi8 hi8Var) {
            this();
        }

        public a A(float f) {
            r();
            ((ki8) this.b).e0(f);
            return this;
        }

        public a B(int i) {
            r();
            ((ki8) this.b).f0(i);
            return this;
        }

        public a C(long j) {
            r();
            ((ki8) this.b).g0(j);
            return this;
        }

        public a D(String str) {
            r();
            ((ki8) this.b).h0(str);
            return this;
        }

        public a F(ji8.a aVar) {
            r();
            ((ki8) this.b).i0(aVar);
            return this;
        }

        public a y(boolean z) {
            r();
            ((ki8) this.b).c0(z);
            return this;
        }

        public a z(double d) {
            r();
            ((ki8) this.b).d0(d);
            return this;
        }

        private a() {
            super(ki8.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto.java */
    /* renamed from: ki8$b */
    /* loaded from: classes.dex */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);
        
        private final int a;

        b(int i) {
            this.a = i;
        }

        public static b a(int i) {
            switch (i) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        ki8 ki8Var = new ki8();
        DEFAULT_INSTANCE = ki8Var;
        v.I(ki8.class, ki8Var);
    }

    private ki8() {
    }

    public static ki8 T() {
        return DEFAULT_INSTANCE;
    }

    public static a b0() {
        return DEFAULT_INSTANCE.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(ji8.a aVar) {
        this.value_ = aVar.a();
        this.valueCase_ = 6;
    }

    public boolean S() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double U() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float V() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int W() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long X() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String Y() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public ji8 Z() {
        if (this.valueCase_ == 6) {
            return (ji8) this.value_;
        }
        return ji8.O();
    }

    public b a0() {
        return b.a(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.v
    protected final Object v(v.f fVar, Object obj, Object obj2) {
        switch (hi8.a[fVar.ordinal()]) {
            case 1:
                return new ki8();
            case 2:
                return new a(null);
            case 3:
                return v.F(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", ji8.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gr7<ki8> gr7Var = PARSER;
                if (gr7Var == null) {
                    synchronized (ki8.class) {
                        try {
                            gr7Var = PARSER;
                            if (gr7Var == null) {
                                gr7Var = new v.b<>(DEFAULT_INSTANCE);
                                PARSER = gr7Var;
                            }
                        } finally {
                        }
                    }
                }
                return gr7Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
