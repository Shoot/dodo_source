package defpackage;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: KeysMap.java */
/* renamed from: pg5  reason: default package */
/* loaded from: classes2.dex */
class pg5 {
    private final Map<String, String> a = new HashMap();
    private final int b;
    private final int c;

    public pg5(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i) {
                return trim.substring(0, i);
            }
            return trim;
        }
        return str;
    }

    @NonNull
    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }

    public synchronized boolean d(String str, String str2) {
        String b = b(str);
        if (this.a.size() >= this.b && !this.a.containsKey(b)) {
            rx5 f = rx5.f();
            f.k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.b);
            return false;
        }
        String c = c(str2, this.c);
        if (ek1.y(this.a.get(b), c)) {
            return false;
        }
        Map<String, String> map = this.a;
        if (str2 == null) {
            c = "";
        }
        map.put(b, c);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        String c;
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String b = b(entry.getKey());
                if (this.a.size() >= this.b && !this.a.containsKey(b)) {
                    i++;
                }
                String value = entry.getValue();
                Map<String, String> map2 = this.a;
                if (value == null) {
                    c = "";
                } else {
                    c = c(value, this.c);
                }
                map2.put(b, c);
            }
            if (i > 0) {
                rx5 f = rx5.f();
                f.k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
