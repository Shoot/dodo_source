package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: ds2  reason: default package */
/* loaded from: classes3.dex */
public final class ds2 implements mbc {
    private static final Map<String, ds2> c;
    private final int a;
    private final String b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(b("SHA-256", 32, 16, 67, 20, 2), new ds2(1, "XMSSMT_SHA2_20/2_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 20, 4), new ds2(2, "XMSSMT_SHA2_20/4_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 40, 2), new ds2(3, "XMSSMT_SHA2_40/2_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 40, 2), new ds2(4, "XMSSMT_SHA2_40/4_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 40, 4), new ds2(5, "XMSSMT_SHA2_40/8_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 60, 8), new ds2(6, "XMSSMT_SHA2_60/3_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 60, 6), new ds2(7, "XMSSMT_SHA2_60/6_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 60, 12), new ds2(8, "XMSSMT_SHA2_60/12_256"));
        hashMap.put(b("SHA-512", 64, 16, 131, 20, 2), new ds2(9, "XMSSMT_SHA2_20/2_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 20, 4), new ds2(10, "XMSSMT_SHA2_20/4_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 40, 2), new ds2(11, "XMSSMT_SHA2_40/2_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 40, 4), new ds2(12, "XMSSMT_SHA2_40/4_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 40, 8), new ds2(13, "XMSSMT_SHA2_40/8_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 60, 3), new ds2(14, "XMSSMT_SHA2_60/3_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 60, 6), new ds2(15, "XMSSMT_SHA2_60/6_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 60, 12), new ds2(16, "XMSSMT_SHA2_60/12_512"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 20, 2), new ds2(17, "XMSSMT_SHAKE_20/2_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 20, 4), new ds2(18, "XMSSMT_SHAKE_20/4_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 40, 2), new ds2(19, "XMSSMT_SHAKE_40/2_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 40, 4), new ds2(20, "XMSSMT_SHAKE_40/4_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 40, 8), new ds2(21, "XMSSMT_SHAKE_40/8_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 60, 3), new ds2(22, "XMSSMT_SHAKE_60/3_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 60, 6), new ds2(23, "XMSSMT_SHAKE_60/6_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 60, 12), new ds2(24, "XMSSMT_SHAKE_60/12_256"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 20, 2), new ds2(25, "XMSSMT_SHAKE_20/2_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 20, 4), new ds2(26, "XMSSMT_SHAKE_20/4_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 40, 2), new ds2(27, "XMSSMT_SHAKE_40/2_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 40, 4), new ds2(28, "XMSSMT_SHAKE_40/4_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 40, 8), new ds2(29, "XMSSMT_SHAKE_40/8_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 60, 3), new ds2(30, "XMSSMT_SHAKE_60/3_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 60, 6), new ds2(31, "XMSSMT_SHAKE_60/6_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 60, 12), new ds2(32, "XMSSMT_SHAKE_60/12_512"));
        c = Collections.unmodifiableMap(hashMap);
    }

    private ds2(int i, String str) {
        this.a = i;
        this.b = str;
    }

    private static String b(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4 + "-" + i5;
        }
        throw new NullPointerException("algorithmName == null");
    }

    public static ds2 c(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return c.get(b(str, i, i2, i3, i4, i5));
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
