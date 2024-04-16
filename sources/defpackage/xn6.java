package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: MonitoringAnnotations.java */
/* renamed from: xn6  reason: default package */
/* loaded from: classes2.dex */
public final class xn6 {
    public static final xn6 b = a().a();
    private final Map<String, String> a;

    /* compiled from: MonitoringAnnotations.java */
    /* renamed from: xn6$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private HashMap<String, String> a = new HashMap<>();

        public xn6 a() {
            if (this.a != null) {
                xn6 xn6Var = new xn6(Collections.unmodifiableMap(this.a));
                this.a = null;
                return xn6Var;
            }
            throw new IllegalStateException("cannot call build() twice");
        }
    }

    public static b a() {
        return new b();
    }

    public Map<String, String> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof xn6)) {
            return false;
        }
        return this.a.equals(((xn6) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    private xn6(Map<String, String> map) {
        this.a = map;
    }
}
