package com.huawei.hms.hatool;

import android.util.Pair;
import java.nio.charset.Charset;
/* loaded from: classes3.dex */
public class d {
    public static final Charset a = Charset.forName("UTF-8");

    public static Pair<byte[], String> a(String str) {
        if (str == null || str.length() < 32) {
            return new Pair<>(new byte[0], str);
        }
        String substring = str.substring(0, 32);
        return new Pair<>(jo4.b(substring), str.substring(32));
    }

    public static String b(String str, String str2) {
        return jo4.a(o9.l(str.getBytes(a), jo4.b(str2)));
    }

    public static String a(String str, String str2) {
        Pair<byte[], String> a2 = a(str);
        return new String(o9.i(jo4.b((String) a2.second), jo4.b(str2), (byte[]) a2.first), a);
    }

    public static String a(byte[] bArr, String str) {
        String str2;
        if (bArr == null || bArr.length == 0 || str == null) {
            str2 = "cbc encrypt(byte) param is not right";
        } else {
            byte[] b = jo4.b(str);
            if (b.length >= 16) {
                return jo4.a(o9.l(bArr, b));
            }
            str2 = "key length is not right";
        }
        y.b("AesCipher", str2);
        return "";
    }
}
