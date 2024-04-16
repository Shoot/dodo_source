package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: at4  reason: default package */
/* loaded from: classes3.dex */
public class at4 {
    private static final Map<String, Integer> a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("RIPEMD128", g65.d(13004));
        hashMap.put("RIPEMD160", g65.d(12748));
        hashMap.put("SHA-1", g65.d(13260));
        hashMap.put("SHA-224", g65.d(14540));
        hashMap.put("SHA-256", g65.d(13516));
        hashMap.put("SHA-384", g65.d(14028));
        hashMap.put("SHA-512", g65.d(13772));
        hashMap.put("SHA-512/224", g65.d(14796));
        hashMap.put("SHA-512/256", g65.d(15052));
        hashMap.put("Whirlpool", g65.d(14284));
        a = Collections.unmodifiableMap(hashMap);
    }

    public static Integer a(e23 e23Var) {
        return a.get(e23Var.getAlgorithmName());
    }
}
