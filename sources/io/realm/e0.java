package io.realm;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* compiled from: RealmAny.java */
/* loaded from: classes3.dex */
public class e0 {
    private final h0 a;

    /* compiled from: RealmAny.java */
    /* loaded from: classes3.dex */
    public enum a {
        INTEGER(RealmFieldType.INTEGER, Long.class),
        BOOLEAN(RealmFieldType.BOOLEAN, Boolean.class),
        STRING(RealmFieldType.STRING, String.class),
        BINARY(RealmFieldType.BINARY, Byte[].class),
        DATE(RealmFieldType.DATE, Date.class),
        FLOAT(RealmFieldType.FLOAT, Float.class),
        DOUBLE(RealmFieldType.DOUBLE, Double.class),
        DECIMAL128(RealmFieldType.DECIMAL128, Decimal128.class),
        OBJECT_ID(RealmFieldType.OBJECT_ID, ObjectId.class),
        OBJECT(RealmFieldType.TYPED_LINK, o89.class),
        UUID(RealmFieldType.UUID, UUID.class),
        NULL(null, null);
        
        private static final a[] o = new a[19];
        private final Class<?> a;
        private final RealmFieldType b;

        static {
            a[] values;
            for (a aVar : values()) {
                if (aVar != NULL) {
                    o[aVar.b.getNativeValue()] = aVar;
                }
            }
            o[RealmFieldType.OBJECT.getNativeValue()] = OBJECT;
        }

        a(RealmFieldType realmFieldType, Class cls) {
            this.b = realmFieldType;
            this.a = cls;
        }

        public static a a(int i) {
            if (i == -1) {
                return NULL;
            }
            return o[i];
        }

        public Class<?> i() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(h0 h0Var) {
        this.a = h0Var;
    }

    public static e0 e(o89 o89Var) {
        h0 m0Var;
        if (o89Var == null) {
            m0Var = new x();
        } else {
            m0Var = new m0(o89Var);
        }
        return new e0(m0Var);
    }

    public static e0 f(String str) {
        h0 s0Var;
        if (str == null) {
            s0Var = new x();
        } else {
            s0Var = new s0(str);
        }
        return new e0(s0Var);
    }

    public <T extends o89> T a(Class<T> cls) {
        return (T) this.a.g(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b() {
        return this.a.c();
    }

    public a c() {
        return this.a.e();
    }

    public Class<?> d() {
        return this.a.f();
    }

    @SuppressFBWarnings({"NP_METHOD_PARAMETER_TIGHTENS_ANNOTATION"})
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        return this.a.equals(((e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
