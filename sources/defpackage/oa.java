package defpackage;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.appsflyer.f;
import com.appsflyer.g;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
/* renamed from: oa  reason: default package */
/* loaded from: classes3.dex */
public class oa {
    private static Map<String, SecretKey> a = new HashMap();

    private static SecretKey a(String str) {
        KeyGenParameterSpec.Builder blockModes;
        KeyGenParameterSpec.Builder encryptionPaddings;
        KeyGenParameterSpec.Builder keySize;
        KeyGenParameterSpec build;
        jec.d("GCMKS", "load key");
        SecretKey secretKey = null;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key instanceof SecretKey) {
                secretKey = (SecretKey) key;
            } else {
                jec.d("GCMKS", "generate key");
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                g.a();
                blockModes = f.a(str, 3).setBlockModes("GCM");
                encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
                keySize = encryptionPaddings.setKeySize(256);
                build = keySize.build();
                keyGenerator.init(build);
                secretKey = keyGenerator.generateKey();
            }
        } catch (IOException e) {
            jec.c("GCMKS", "IOException : " + e.getMessage());
        } catch (InvalidAlgorithmParameterException e2) {
            jec.c("GCMKS", "InvalidAlgorithmParameterException : " + e2.getMessage());
        } catch (KeyStoreException e3) {
            jec.c("GCMKS", "KeyStoreException : " + e3.getMessage());
        } catch (NoSuchAlgorithmException e4) {
            jec.c("GCMKS", "NoSuchAlgorithmException : " + e4.getMessage());
        } catch (NoSuchProviderException e5) {
            jec.c("GCMKS", "NoSuchProviderException : " + e5.getMessage());
        } catch (UnrecoverableKeyException e6) {
            jec.c("GCMKS", "UnrecoverableKeyException : " + e6.getMessage());
        } catch (CertificateException e7) {
            jec.c("GCMKS", "CertificateException : " + e7.getMessage());
        } catch (Exception e8) {
            jec.c("GCMKS", "Exception: " + e8.getMessage());
        }
        a.put(str, secretKey);
        return secretKey;
    }

    private static boolean b() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    private static SecretKey c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (a.get(str) == null) {
            a(str);
        }
        return a.get(str);
    }

    public static String d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new String(e(str, jo4.b(str2)), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                jec.c("GCMKS", "decrypt: UnsupportedEncodingException : " + e.getMessage());
                return "";
            }
        }
        jec.c("GCMKS", "alias or encrypt content is null");
        return "";
    }

    public static byte[] e(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str) && bArr != null) {
            if (!b()) {
                jec.c("GCMKS", "sdk version is too low");
                return bArr2;
            } else if (bArr.length <= 12) {
                jec.c("GCMKS", "Decrypt source data is invalid.");
                return bArr2;
            } else {
                return f(c(str), bArr);
            }
        }
        jec.c("GCMKS", "alias or encrypt content is null");
        return bArr2;
    }

    public static byte[] f(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (secretKey == null) {
            jec.c("GCMKS", "Decrypt secret key is null");
            return bArr2;
        } else if (bArr == null) {
            jec.c("GCMKS", "content is null");
            return bArr2;
        } else if (!b()) {
            jec.c("GCMKS", "sdk version is too low");
            return bArr2;
        } else if (bArr.length <= 12) {
            jec.c("GCMKS", "Decrypt source data is invalid.");
            return bArr2;
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, secretKey, new GCMParameterSpec(128, copyOf));
                return cipher.doFinal(bArr, 12, bArr.length - 12);
            } catch (InvalidAlgorithmParameterException e) {
                jec.c("GCMKS", "InvalidAlgorithmParameterException : " + e.getMessage());
                return bArr2;
            } catch (InvalidKeyException e2) {
                jec.c("GCMKS", "InvalidKeyException : " + e2.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e3) {
                jec.c("GCMKS", "NoSuchAlgorithmException : " + e3.getMessage());
                return bArr2;
            } catch (BadPaddingException e4) {
                jec.c("GCMKS", "BadPaddingException : " + e4.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e5) {
                jec.c("GCMKS", "IllegalBlockSizeException : " + e5.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e6) {
                jec.c("GCMKS", "NoSuchPaddingException : " + e6.getMessage());
                return bArr2;
            } catch (Exception e7) {
                jec.c("GCMKS", "Exception: " + e7.getMessage());
                return bArr2;
            }
        }
    }

    public static String g(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return jo4.a(h(str, str2.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException e) {
                jec.c("GCMKS", "encrypt: UnsupportedEncodingException : " + e.getMessage());
                return "";
            }
        }
        jec.c("GCMKS", "alias or encrypt content is null");
        return "";
    }

    public static byte[] h(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (!TextUtils.isEmpty(str) && bArr != null) {
            if (!b()) {
                jec.c("GCMKS", "sdk version is too low");
                return bArr2;
            }
            return i(c(str), bArr);
        }
        jec.c("GCMKS", "alias or encrypt content is null");
        return bArr2;
    }

    public static byte[] i(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null) {
            jec.c("GCMKS", "content is null");
            return bArr2;
        } else if (secretKey == null) {
            jec.c("GCMKS", "secret key is null");
            return bArr2;
        } else if (!b()) {
            jec.c("GCMKS", "sdk version is too low");
            return bArr2;
        } else {
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKey);
                byte[] doFinal = cipher.doFinal(bArr);
                byte[] iv = cipher.getIV();
                if (iv != null && iv.length == 12) {
                    byte[] copyOf = Arrays.copyOf(iv, iv.length + doFinal.length);
                    System.arraycopy(doFinal, 0, copyOf, iv.length, doFinal.length);
                    return copyOf;
                }
                jec.c("GCMKS", "IV is invalid.");
                return bArr2;
            } catch (InvalidKeyException e) {
                jec.c("GCMKS", "InvalidKeyException : " + e.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e2) {
                jec.c("GCMKS", "NoSuchAlgorithmException : " + e2.getMessage());
                return bArr2;
            } catch (BadPaddingException e3) {
                jec.c("GCMKS", "BadPaddingException : " + e3.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e4) {
                jec.c("GCMKS", "IllegalBlockSizeException : " + e4.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e5) {
                jec.c("GCMKS", "NoSuchPaddingException : " + e5.getMessage());
                return bArr2;
            } catch (Exception e6) {
                jec.c("GCMKS", "Exception: " + e6.getMessage());
                return bArr2;
            }
        }
    }
}
