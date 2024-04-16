package defpackage;

import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.x;
import java.util.List;
/* compiled from: PreferencesProto.java */
/* renamed from: ji8  reason: default package */
/* loaded from: classes.dex */
public final class ji8 extends v<ji8, a> implements ci6 {
    private static final ji8 DEFAULT_INSTANCE;
    private static volatile gr7<ji8> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private x.i<String> strings_ = v.w();

    /* compiled from: PreferencesProto.java */
    /* renamed from: ji8$a */
    /* loaded from: classes.dex */
    public static final class a extends v.a<ji8, a> implements ci6 {
        /* synthetic */ a(hi8 hi8Var) {
            this();
        }

        public a y(Iterable<String> iterable) {
            r();
            ((ji8) this.b).M(iterable);
            return this;
        }

        private a() {
            super(ji8.DEFAULT_INSTANCE);
        }
    }

    static {
        ji8 ji8Var = new ji8();
        DEFAULT_INSTANCE = ji8Var;
        v.I(ji8.class, ji8Var);
    }

    private ji8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(Iterable<String> iterable) {
        N();
        androidx.datastore.preferences.protobuf.a.i(iterable, this.strings_);
    }

    private void N() {
        if (!this.strings_.o()) {
            this.strings_ = v.C(this.strings_);
        }
    }

    public static ji8 O() {
        return DEFAULT_INSTANCE;
    }

    public static a Q() {
        return DEFAULT_INSTANCE.s();
    }

    public List<String> P() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.v
    protected final Object v(v.f fVar, Object obj, Object obj2) {
        switch (hi8.a[fVar.ordinal()]) {
            case 1:
                return new ji8();
            case 2:
                return new a(null);
            case 3:
                return v.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gr7<ji8> gr7Var = PARSER;
                if (gr7Var == null) {
                    synchronized (ji8.class) {
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
