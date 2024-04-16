package defpackage;

import java.util.HashMap;
import java.util.Map;
/* renamed from: rb5  reason: default package */
/* loaded from: classes.dex */
public final class rb5 {
    private static final Map<String, a> a = new HashMap();

    /* renamed from: rb5$a */
    /* loaded from: classes.dex */
    public interface a {
        String a(x xVar);
    }

    public static Map<String, a> a() {
        return a;
    }

    public static void b(String str, a aVar) {
        a.put(str, aVar);
    }
}
