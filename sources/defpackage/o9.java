package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: o9  reason: default package */
/* loaded from: classes3.dex */
public final class o9 {
    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(0, 6) + str.substring(12, 16) + str.substring(26, 32) + str.substring(48);
        } catch (Exception e) {
            jec.c("CBC", "get encryptword exception : " + e.getMessage());
            return "";
        }
    }

    private static String b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return str2.substring(0, 6) + str.substring(0, 6) + str2.substring(6, 10) + str.substring(6, 16) + str2.substring(10, 16) + str.substring(16) + str2.substring(16);
            } catch (Exception e) {
                jec.c("CBC", "mix exception: " + e.getMessage());
            }
        }
        return "";
    }

    private static byte[] c(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            jec.c("CBC", "encrypt 5 content is null");
            return new byte[0];
        } else if (bArr == null) {
            jec.c("CBC", "encrypt 5 key is null");
            return new byte[0];
        } else if (bArr.length < 16) {
            jec.c("CBC", "encrypt 5 key lengh is not right");
            return new byte[0];
        } else if (bArr2 == null) {
            jec.c("CBC", "encrypt 5 iv is null");
            return new byte[0];
        } else if (bArr2.length < 16) {
            jec.c("CBC", "encrypt 5 iv lengh is not right");
            return new byte[0];
        } else {
            try {
                return m(str.getBytes("UTF-8"), bArr, bArr2);
            } catch (UnsupportedEncodingException e) {
                jec.c("CBC", " cbc encrypt data error" + e.getMessage());
                return new byte[0];
            }
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(6, 12) + str.substring(16, 26) + str.substring(32, 48);
        } catch (Exception e) {
            jec.c("CBC", "getIv exception : " + e.getMessage());
            return "";
        }
    }

    public static String f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            jec.c("CBC", "decrypt 1 content is null");
            return "";
        } else if (TextUtils.isEmpty(str2)) {
            jec.c("CBC", "decrypt 1 key is null");
            return "";
        } else {
            byte[] b = jo4.b(str2);
            if (b.length < 16) {
                jec.c("CBC", "decrypt 1 key length is not right");
                return "";
            }
            return g(str, b);
        }
    }

    public static String g(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            jec.c("CBC", "decrypt 2 content is null");
            return "";
        } else if (bArr == null) {
            jec.c("CBC", "decrypt 2 key is null");
            return "";
        } else if (bArr.length < 16) {
            jec.c("CBC", "decrypt 2 key lengh is not right");
            return "";
        } else {
            String e = e(str);
            String a = a(str);
            if (TextUtils.isEmpty(e)) {
                jec.c("CBC", "decrypt 2 iv is null");
                return "";
            } else if (TextUtils.isEmpty(a)) {
                jec.c("CBC", "decrypt 2 encrypt content is null");
                return "";
            } else {
                return h(a, bArr, jo4.b(e));
            }
        }
    }

    public static String h(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            jec.c("CBC", "decrypt 4 content is null");
            return "";
        } else if (bArr == null) {
            jec.c("CBC", "decrypt 4 key is null");
            return "";
        } else if (bArr.length < 16) {
            jec.c("CBC", "decrypt 4 key lengh is not right");
            return "";
        } else if (bArr2 == null) {
            jec.c("CBC", "decrypt 4 iv is null");
            return "";
        } else if (bArr2.length < 16) {
            jec.c("CBC", "decrypt 4 iv lengh is not right");
            return "";
        } else {
            try {
                return new String(i(jo4.b(str), bArr, bArr2), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                jec.c("CBC", " cbc decrypt data error" + e.getMessage());
                return "";
            }
        }
    }

    public static byte[] i(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            jec.c("CBC", "decrypt 6 content is null");
            return new byte[0];
        } else if (bArr.length == 0) {
            jec.c("CBC", "decrypt 6 content length is 0");
            return new byte[0];
        } else if (bArr2 == null) {
            jec.c("CBC", "decrypt 6 key is null");
            return new byte[0];
        } else if (bArr2.length < 16) {
            jec.c("CBC", "decrypt 6 key length is error");
            return new byte[0];
        } else if (bArr3 == null) {
            jec.c("CBC", "decrypt 6 iv is null");
            return new byte[0];
        } else if (bArr3.length < 16) {
            jec.c("CBC", "decrypt 6 iv length is error");
            return new byte[0];
        } else {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException e) {
                jec.c("CBC", "InvalidAlgorithmParameterException: " + e.getMessage());
                return new byte[0];
            } catch (InvalidKeyException e2) {
                jec.c("CBC", "InvalidKeyException: " + e2.getMessage());
                return new byte[0];
            } catch (NoSuchAlgorithmException e3) {
                jec.c("CBC", "NoSuchAlgorithmException: " + e3.getMessage());
                return new byte[0];
            } catch (BadPaddingException e4) {
                jec.c("CBC", "BadPaddingException: " + e4.getMessage());
                jec.c("CBC", "key is not right");
                return new byte[0];
            } catch (IllegalBlockSizeException e5) {
                jec.c("CBC", "IllegalBlockSizeException: " + e5.getMessage());
                return new byte[0];
            } catch (NoSuchPaddingException e6) {
                jec.c("CBC", "NoSuchPaddingException: " + e6.getMessage());
                return new byte[0];
            }
        }
    }

    public static String j(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            jec.c("CBC", "encrypt 1 content is null");
            return "";
        } else if (TextUtils.isEmpty(str2)) {
            jec.c("CBC", "encrypt 1 key is null");
            return "";
        } else {
            byte[] b = jo4.b(str2);
            if (b.length < 16) {
                jec.c("CBC", "encrypt 1 key length is not right");
                return "";
            }
            return k(str, b);
        }
    }

    public static String k(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            jec.c("CBC", "encrypt 2 content is null");
            return "";
        } else if (bArr == null) {
            jec.c("CBC", "encrypt 2 key is null");
            return "";
        } else if (bArr.length < 16) {
            jec.c("CBC", "encrypt 2 key lengh is not right");
            return "";
        } else {
            byte[] c = hh3.c(16);
            byte[] c2 = c(str, bArr, c);
            if (c2 == null || c2.length == 0) {
                return "";
            }
            return b(jo4.a(c), jo4.a(c2));
        }
    }

    public static byte[] l(byte[] bArr, byte[] bArr2) {
        byte[] c = hh3.c(16);
        return d(c, m(bArr, bArr2, c));
    }

    public static byte[] m(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            jec.c("CBC", "encrypt 6 content is null");
            return new byte[0];
        } else if (bArr.length == 0) {
            jec.c("CBC", "encrypt 6 content length is 0");
            return new byte[0];
        } else if (bArr2 == null) {
            jec.c("CBC", "encrypt 6 key is null");
            return new byte[0];
        } else if (bArr2.length < 16) {
            jec.c("CBC", "encrypt 6 key length is error");
            return new byte[0];
        } else if (bArr3 == null) {
            jec.c("CBC", "encrypt 6 iv is null");
            return new byte[0];
        } else if (bArr3.length < 16) {
            jec.c("CBC", "encrypt 6 iv length is error");
            return new byte[0];
        } else {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException e) {
                jec.c("CBC", "InvalidAlgorithmParameterException: " + e.getMessage());
                return new byte[0];
            } catch (InvalidKeyException e2) {
                jec.c("CBC", "InvalidKeyException: " + e2.getMessage());
                return new byte[0];
            } catch (NoSuchAlgorithmException e3) {
                jec.c("CBC", "NoSuchAlgorithmException: " + e3.getMessage());
                return new byte[0];
            } catch (BadPaddingException e4) {
                jec.c("CBC", "BadPaddingException: " + e4.getMessage());
                return new byte[0];
            } catch (IllegalBlockSizeException e5) {
                jec.c("CBC", "IllegalBlockSizeException: " + e5.getMessage());
                return new byte[0];
            } catch (NoSuchPaddingException e6) {
                jec.c("CBC", "NoSuchPaddingException: " + e6.getMessage());
                return new byte[0];
            }
        }
    }
}
