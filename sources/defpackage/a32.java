package defpackage;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;
/* renamed from: a32  reason: default package */
/* loaded from: classes3.dex */
public class a32 extends Permission {
    private final Set<String> a;

    public a32(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(str);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof a32) && this.a.equals(((a32) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // java.security.Permission
    public String getActions() {
        return this.a.toString();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Permission
    public boolean implies(Permission permission) {
        if (permission instanceof a32) {
            a32 a32Var = (a32) permission;
            if (getName().equals(a32Var.getName()) || this.a.containsAll(a32Var.a)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
