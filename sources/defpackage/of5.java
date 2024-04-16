package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Marker;
/* compiled from: KeyPath.java */
/* renamed from: of5  reason: default package */
/* loaded from: classes.dex */
public class of5 {
    public static final of5 c = new of5("COMPOSITION");
    private final List<String> a;
    private pf5 b;

    public of5(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.a;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public of5 a(String str) {
        of5 of5Var = new of5(this);
        of5Var.a.add(str);
        return of5Var;
    }

    public boolean c(String str, int i) {
        boolean z;
        boolean z2;
        if (i >= this.a.size()) {
            return false;
        }
        if (i == this.a.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.a.get(i);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals(Marker.ANY_MARKER)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((!z && (i != this.a.size() - 2 || !b())) || !z2) {
                return false;
            }
            return true;
        } else if (!z && this.a.get(i + 1).equals(str)) {
            if (i != this.a.size() - 2 && (i != this.a.size() - 3 || !b())) {
                return false;
            }
            return true;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.a.size() - 1) {
                return false;
            }
            return this.a.get(i2).equals(str);
        }
    }

    public pf5 d() {
        return this.b;
    }

    public int e(String str, int i) {
        if (f(str)) {
            return 0;
        }
        if (!this.a.get(i).equals("**")) {
            return 1;
        }
        if (i == this.a.size() - 1 || !this.a.get(i + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        of5 of5Var = (of5) obj;
        if (!this.a.equals(of5Var.a)) {
            return false;
        }
        pf5 pf5Var = this.b;
        pf5 pf5Var2 = of5Var.b;
        if (pf5Var != null) {
            return pf5Var.equals(pf5Var2);
        }
        if (pf5Var2 == null) {
            return true;
        }
        return false;
    }

    public boolean g(String str, int i) {
        if (f(str)) {
            return true;
        }
        if (i >= this.a.size()) {
            return false;
        }
        if (this.a.get(i).equals(str) || this.a.get(i).equals("**") || this.a.get(i).equals(Marker.ANY_MARKER)) {
            return true;
        }
        return false;
    }

    public boolean h(String str, int i) {
        if ("__container".equals(str) || i < this.a.size() - 1 || this.a.get(i).equals("**")) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        pf5 pf5Var = this.b;
        if (pf5Var != null) {
            i = pf5Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public of5 i(pf5 pf5Var) {
        of5 of5Var = new of5(this);
        of5Var.b = pf5Var;
        return of5Var;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    private of5(of5 of5Var) {
        this.a = new ArrayList(of5Var.a);
        this.b = of5Var.b;
    }
}
