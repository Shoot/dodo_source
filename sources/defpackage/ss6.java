package defpackage;

import java.io.Serializable;
import java.util.Objects;
/* compiled from: NamedType.java */
/* renamed from: ss6  reason: default package */
/* loaded from: classes2.dex */
public final class ss6 implements Serializable {
    protected final Class<?> a;
    protected final int b;
    protected String c;

    public ss6(Class<?> cls) {
        this(cls, null);
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean b() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public void c(String str) {
        this.c = (str == null || str.isEmpty()) ? null : null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != ss6.class) {
            return false;
        }
        ss6 ss6Var = (ss6) obj;
        if (this.a == ss6Var.a && Objects.equals(this.c, ss6Var.c)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.c;
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[NamedType, class ");
        sb.append(this.a.getName());
        sb.append(", name: ");
        if (this.c == null) {
            str = "null";
        } else {
            str = "'" + this.c + "'";
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public ss6(Class<?> cls, String str) {
        this.a = cls;
        this.b = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        c(str);
    }
}
