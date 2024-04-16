package com.inappstory.sdk.network.utils;

import android.util.Base64;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class KeyConverter {
    public static String getStringFromKey(String str) {
        byte[] decode;
        byte b;
        if (str != null) {
            try {
                if (str.length() <= 32 || (decode = Base64.decode(str, 8)) == null || decode.length < 14 || (b = decode[13]) < 0) {
                    return null;
                }
                String str2 = "";
                while (str2.length() <= b) {
                    str2 = str2 + "{QQN{xuV?1Dv16j3";
                }
                String xor = xor(Arrays.copyOfRange(decode, 14, b + 14), str2.substring(0, b).getBytes());
                if (!xor.startsWith("http://") && !xor.startsWith("https://")) {
                    xor = "https://" + xor;
                }
                if (!xor.endsWith("/")) {
                    return xor + "/";
                }
                return xor;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static String xor(byte[] bArr, byte[] bArr2) {
        String str = "";
        for (int i = 0; i < bArr.length; i++) {
            str = str + ((char) (bArr[i] ^ bArr2[i]));
        }
        return str;
    }
}
