package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: es2  reason: default package */
/* loaded from: classes3.dex */
public final class es2 implements mbc {
    private static final Map<String, es2> c;
    private final int a;
    private final String b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(b("SHA-256", 32, 16, 67, 10), new es2(1, "XMSS_SHA2_10_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 16), new es2(2, "XMSS_SHA2_16_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 20), new es2(3, "XMSS_SHA2_20_256"));
        hashMap.put(b("SHA-512", 64, 16, 131, 10), new es2(4, "XMSS_SHA2_10_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 16), new es2(5, "XMSS_SHA2_16_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 20), new es2(6, "XMSS_SHA2_20_512"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 10), new es2(7, "XMSS_SHAKE_10_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 16), new es2(8, "XMSS_SHAKE_16_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 20), new es2(9, "XMSS_SHAKE_20_256"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 10), new es2(10, "XMSS_SHAKE_10_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 16), new es2(11, "XMSS_SHAKE_16_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 20), new es2(12, "XMSS_SHAKE_20_512"));
        c = Collections.unmodifiableMap(hashMap);
    }

    private es2(int i, String str) {
        this.a = i;
        this.b = str;
    }

    private static String b(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
        }
        throw new NullPointerException("algorithmName == null");
    }

    public static es2 c(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return c.get(b(str, i, i2, i3, i4));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // defpackage.mbc
    public int a() {
        return this.a;
    }

    public String toString() {
        return this.b;
    }
}
