package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: iq9  reason: default package */
/* loaded from: classes3.dex */
public final class iq9 {
    private static final String a = "SHA";
    private static final String[] b = {"SHA-256", "SHA-384", "SHA-512"};

    private static boolean a(String str) {
        for (String str2 : b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str) {
        return c(str, "SHA-256");
    }

    public static String c(String str, String str2) {
        byte[] bArr;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!a(str2)) {
                jec.c(a, "algorithm is not safe or legal");
                return "";
            }
            try {
                bArr = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                bArr = new byte[0];
                jec.c(a, "Error in generate SHA UnsupportedEncodingException");
            }
            return jo4.a(d(bArr, str2));
        }
        jec.c(a, "content or algorithm is null.");
        return "";
    }

    public static byte[] d(byte[] bArr, String str) {
        if (bArr != null && !TextUtils.isEmpty(str)) {
            if (!a(str)) {
                jec.c(a, "algorithm is not safe or legal");
                return new byte[0];
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException unused) {
                jec.c(a, "Error in generate SHA NoSuchAlgorithmException");
                return new byte[0];
            }
        }
        jec.c(a, "content or algorithm is null.");
        return new byte[0];
    }
}
