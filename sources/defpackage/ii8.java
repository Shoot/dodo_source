package defpackage;

import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.f0;
import androidx.datastore.preferences.protobuf.i1;
import androidx.datastore.preferences.protobuf.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
/* compiled from: PreferencesProto.java */
/* renamed from: ii8  reason: default package */
/* loaded from: classes.dex */
public final class ii8 extends v<ii8, a> implements ci6 {
    private static final ii8 DEFAULT_INSTANCE;
    private static volatile gr7<ii8> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private f0<String, ki8> preferences_ = f0.e();

    /* compiled from: PreferencesProto.java */
    /* renamed from: ii8$a */
    /* loaded from: classes.dex */
    public static final class a extends v.a<ii8, a> implements ci6 {
        /* synthetic */ a(hi8 hi8Var) {
            this();
        }

        public a y(String str, ki8 ki8Var) {
            str.getClass();
            ki8Var.getClass();
            r();
            ((ii8) this.b).M().put(str, ki8Var);
            return this;
        }

        private a() {
            super(ii8.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto.java */
    /* renamed from: ii8$b */
    /* loaded from: classes.dex */
    private static final class b {
        static final e0<String, ki8> a = e0.d(i1.b.k, "", i1.b.m, ki8.T());
    }

    static {
        ii8 ii8Var = new ii8();
        DEFAULT_INSTANCE = ii8Var;
        v.I(ii8.class, ii8Var);
    }

    private ii8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, ki8> M() {
        return O();
    }

    private f0<String, ki8> O() {
        if (!this.preferences_.m()) {
            this.preferences_ = this.preferences_.q();
        }
        return this.preferences_;
    }

    private f0<String, ki8> P() {
        return this.preferences_;
    }

    public static a Q() {
        return DEFAULT_INSTANCE.s();
    }

    public static ii8 R(InputStream inputStream) throws IOException {
        return (ii8) v.G(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, ki8> N() {
        return Collections.unmodifiableMap(P());
    }

    @Override // androidx.datastore.preferences.protobuf.v
    protected final Object v(v.f fVar, Object obj, Object obj2) {
        switch (hi8.a[fVar.ordinal()]) {
            case 1:
                return new ii8();
            case 2:
                return new a(null);
            case 3:
                return v.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gr7<ii8> gr7Var = PARSER;
                if (gr7Var == null) {
                    synchronized (ii8.class) {
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
