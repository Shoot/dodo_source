package defpackage;

import io.realm.RealmFieldType;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.Property;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ColumnInfo.java */
/* renamed from: sf1  reason: default package */
/* loaded from: classes3.dex */
public abstract class sf1 {
    private final Map<String, a> a;
    private final Map<String, a> b;
    private final Map<String, String> c;
    private final boolean d;

    /* compiled from: ColumnInfo.java */
    /* renamed from: sf1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public final long a;
        public final RealmFieldType b;
        public final String c;

        private a(long j, RealmFieldType realmFieldType, String str) {
            this.a = j;
            this.b = realmFieldType;
            this.c = str;
        }

        public String toString() {
            return "ColumnDetails[" + this.a + ", " + this.b + ", " + this.c + "]";
        }

        a(Property property) {
            this(property.c(), property.e(), property.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public sf1(int i) {
        this(i, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long a(String str, String str2, OsObjectSchemaInfo osObjectSchemaInfo) {
        Property c = osObjectSchemaInfo.c(str2);
        a aVar = new a(c);
        this.a.put(str, aVar);
        this.b.put(str2, aVar);
        this.c.put(str, str2);
        return c.c();
    }

    protected abstract void b(sf1 sf1Var, sf1 sf1Var2);

    public void c(sf1 sf1Var) {
        if (this.d) {
            if (sf1Var != null) {
                this.a.clear();
                this.a.putAll(sf1Var.a);
                this.b.clear();
                this.b.putAll(sf1Var.b);
                this.c.clear();
                this.c.putAll(sf1Var.c);
                b(sf1Var, this);
                return;
            }
            throw new NullPointerException("Attempt to copy null ColumnInfo");
        }
        throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnInfo[");
        sb.append("mutable=" + this.d);
        sb.append(",");
        boolean z = false;
        if (this.a != null) {
            sb.append("JavaFieldNames=[");
            boolean z2 = false;
            for (Map.Entry<String, a> entry : this.a.entrySet()) {
                if (z2) {
                    sb.append(",");
                }
                sb.append(entry.getKey());
                sb.append("->");
                sb.append(entry.getValue());
                z2 = true;
            }
            sb.append("]");
        }
        if (this.b != null) {
            sb.append(", InternalFieldNames=[");
            for (Map.Entry<String, a> entry2 : this.b.entrySet()) {
                if (z) {
                    sb.append(",");
                }
                sb.append(entry2.getKey());
                sb.append("->");
                sb.append(entry2.getValue());
                z = true;
            }
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public sf1(sf1 sf1Var, boolean z) {
        this(sf1Var == null ? 0 : sf1Var.a.size(), z);
        if (sf1Var != null) {
            this.a.putAll(sf1Var.a);
        }
    }

    private sf1(int i, boolean z) {
        this.a = new HashMap(i);
        this.b = new HashMap(i);
        this.c = new HashMap(i);
        this.d = z;
    }
}
