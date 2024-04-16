package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: eic  reason: default package */
/* loaded from: classes.dex */
class eic {
    public static SecretKey a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) throws NoSuchAlgorithmException, InvalidKeySpecException {
        if (bArr.length == 16 && bArr2.length == 16 && bArr3.length == 16) {
            return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(ho4.c(e(bArr, bArr2, bArr3)).toCharArray(), bArr4, i, 128)).getEncoded(), "AES");
        }
        throw new IllegalArgumentException("invalid data for generating the key.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b(SecretKey secretKey, byte[] bArr) throws GeneralSecurityException {
        if (secretKey != null && bArr != null) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, 17);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKey, new IvParameterSpec(copyOfRange));
            return cipher.doFinal(bArr, copyOfRange.length + 1, (bArr.length - copyOfRange.length) - 1);
        }
        throw new NullPointerException("key or cipherText must not be null.");
    }

    private static byte[] c(byte[] bArr, int i) {
        if (bArr != null) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                if (i < 0) {
                    bArr[i2] = (byte) (bArr[i2] << (-i));
                } else {
                    bArr[i2] = (byte) (bArr[i2] >> i);
                }
            }
            return bArr;
        }
        throw new NullPointerException("bytes must not be null.");
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            if (bArr.length == bArr2.length) {
                byte[] bArr3 = new byte[bArr.length];
                for (int i = 0; i < bArr.length; i++) {
                    bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
                }
                return bArr3;
            }
            throw new IllegalArgumentException("left and right must be the same length.");
        }
        throw new NullPointerException("left or right must not be null.");
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return d(c(d(c(bArr, -4), bArr2), 6), bArr3);
    }
}
