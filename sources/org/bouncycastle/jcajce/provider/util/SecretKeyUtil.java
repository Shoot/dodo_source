package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
/* loaded from: classes3.dex */
public class SecretKeyUtil {
    private static Map keySizes;

    static {
        HashMap hashMap = new HashMap();
        keySizes = hashMap;
        hashMap.put(co7.w0.H(), g65.d(192));
        keySizes.put(ms6.y, g65.d(128));
        keySizes.put(ms6.G, g65.d(192));
        keySizes.put(ms6.O, g65.d(256));
        keySizes.put(os6.a, g65.d(128));
        keySizes.put(os6.b, g65.d(192));
        keySizes.put(os6.c, g65.d(256));
    }

    public static int getKeySize(k kVar) {
        Integer num = (Integer) keySizes.get(kVar);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
