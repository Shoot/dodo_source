package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: p2c  reason: default package */
/* loaded from: classes3.dex */
final class p2c implements mbc {
    private static final Map<String, p2c> c;
    private final int a;
    private final String b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(b("SHA-256", 32, 16, 67), new p2c(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(b("SHA-512", 64, 16, 131), new p2c(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(b("SHAKE128", 32, 16, 67), new p2c(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(b("SHAKE256", 64, 16, 131), new p2c(67108868, "WOTSP_SHAKE256_W16"));
        c = Collections.unmodifiableMap(hashMap);
    }

    private p2c(int i, String str) {
        this.a = i;
        this.b = str;
    }

    private static String b(String str, int i, int i2, int i3) {
        if (str != null) {
            return str + "-" + i + "-" + i2 + "-" + i3;
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static p2c c(String str, int i, int i2, int i3) {
        if (str != null) {
            return c.get(b(str, i, i2, i3));
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
