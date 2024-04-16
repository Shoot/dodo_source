package defpackage;

import io.realm.exceptions.RealmException;
import io.realm.internal.OsSchemaInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ColumnIndices.java */
/* renamed from: rf1  reason: default package */
/* loaded from: classes3.dex */
public final class rf1 {
    private final Map<Class<? extends o89>, sf1> a = new ConcurrentHashMap();
    private final Map<String, sf1> b = new HashMap();
    private final t89 c;
    private final OsSchemaInfo d;

    public rf1(t89 t89Var, OsSchemaInfo osSchemaInfo) {
        this.c = t89Var;
        this.d = osSchemaInfo;
    }

    public sf1 a(Class<? extends o89> cls) {
        sf1 sf1Var = this.a.get(cls);
        if (sf1Var == null) {
            sf1 d = this.c.d(cls, this.d);
            this.a.put(cls, d);
            return d;
        }
        return sf1Var;
    }

    public sf1 b(String str) {
        sf1 sf1Var = this.b.get(str);
        if (sf1Var == null) {
            Iterator<Class<? extends o89>> it = this.c.k().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class<? extends o89> next = it.next();
                if (this.c.m(next).equals(str)) {
                    sf1Var = a(next);
                    this.b.put(str, sf1Var);
                    break;
                }
            }
        }
        if (sf1Var != null) {
            return sf1Var;
        }
        throw new RealmException(String.format(Locale.US, "'%s' doesn't exist in current schema.", str));
    }

    public void c() {
        for (Map.Entry<Class<? extends o89>, sf1> entry : this.a.entrySet()) {
            entry.getValue().c(this.c.d(entry.getKey(), this.d));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnIndices[");
        boolean z = false;
        for (Map.Entry<Class<? extends o89>, sf1> entry : this.a.entrySet()) {
            if (z) {
                sb.append(",");
            }
            sb.append(entry.getKey().getSimpleName());
            sb.append("->");
            sb.append(entry.getValue());
            z = true;
        }
        sb.append("]");
        return sb.toString();
    }
}
