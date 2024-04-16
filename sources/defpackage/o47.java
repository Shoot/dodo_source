package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.o89;
/* compiled from: ObjectChange.java */
/* renamed from: o47  reason: default package */
/* loaded from: classes3.dex */
public class o47<E extends o89> {
    private final E a;
    private final p47 b;

    public o47(E e, p47 p47Var) {
        this.a = e;
        this.b = p47Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o47 o47Var = (o47) obj;
        if (!this.a.equals(o47Var.a)) {
            return false;
        }
        p47 p47Var = this.b;
        p47 p47Var2 = o47Var.b;
        if (p47Var != null) {
            return p47Var.equals(p47Var2);
        }
        if (p47Var2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        p47 p47Var = this.b;
        if (p47Var != null) {
            i = p47Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "ObjectChange{object=" + this.a + ", changeset=" + this.b + CoreConstants.CURLY_RIGHT;
    }
}
