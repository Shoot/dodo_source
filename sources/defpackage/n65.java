package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: InternCache.java */
/* renamed from: n65  reason: default package */
/* loaded from: classes2.dex */
public final class n65 extends ConcurrentHashMap<String, String> {
    public static final n65 b = new n65();
    private final Object a;

    private n65() {
        super(180, 0.8f, 4);
        this.a = new Object();
    }

    public String b(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.a) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } finally {
                }
            }
        }
        String intern = str.intern();
        put(intern, intern);
        return intern;
    }
}
