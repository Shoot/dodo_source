package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: JsonObject.java */
/* renamed from: mb5  reason: default package */
/* loaded from: classes2.dex */
public final class mb5 extends pa5 {
    private final rq5<String, pa5> a = new rq5<>();

    public Set<Map.Entry<String, pa5>> A() {
        return this.a.entrySet();
    }

    public pa5 B(String str) {
        return this.a.get(str);
    }

    public boolean C(String str) {
        return this.a.containsKey(str);
    }

    public pa5 D(String str) {
        return this.a.remove(str);
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof mb5) || !((mb5) obj).a.equals(this.a))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void v(String str, pa5 pa5Var) {
        rq5<String, pa5> rq5Var = this.a;
        if (pa5Var == null) {
            pa5Var = lb5.a;
        }
        rq5Var.put(str, pa5Var);
    }

    public void w(String str, Boolean bool) {
        pa5 qb5Var;
        if (bool == null) {
            qb5Var = lb5.a;
        } else {
            qb5Var = new qb5(bool);
        }
        v(str, qb5Var);
    }

    public void x(String str, Number number) {
        pa5 qb5Var;
        if (number == null) {
            qb5Var = lb5.a;
        } else {
            qb5Var = new qb5(number);
        }
        v(str, qb5Var);
    }

    public void z(String str, String str2) {
        pa5 qb5Var;
        if (str2 == null) {
            qb5Var = lb5.a;
        } else {
            qb5Var = new qb5(str2);
        }
        v(str, qb5Var);
    }
}
