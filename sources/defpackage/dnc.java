package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: dnc  reason: default package */
/* loaded from: classes2.dex */
public final class dnc {
    private static final zw4<String> d = zw4.l0("_syn", "_err", "_el");
    private String a;
    private long b;
    private Map<String, Object> c;

    public dnc(String str, long j, Map<String, Object> map) {
        this.a = str;
        this.b = j;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        if (d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
            return obj2;
        } else if (obj instanceof Double) {
            return obj2;
        } else {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
            return obj2;
        }
    }

    public final long a() {
        return this.b;
    }

    public final Object b(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new dnc(this.a, this.b, new HashMap(this.c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.c.remove(str);
            return;
        }
        this.c.put(str, c(str, this.c.get(str), obj));
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnc)) {
            return false;
        }
        dnc dncVar = (dnc) obj;
        if (this.b != dncVar.b || !this.a.equals(dncVar.a)) {
            return false;
        }
        return this.c.equals(dncVar.c);
    }

    public final void f(String str) {
        this.a = str;
    }

    public final Map<String, Object> g() {
        return this.c;
    }

    public final int hashCode() {
        long j = this.b;
        return (((this.a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        String valueOf = String.valueOf(this.c);
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + valueOf + "}";
    }
}
