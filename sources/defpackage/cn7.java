package defpackage;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
/* renamed from: cn7  reason: default package */
/* loaded from: classes3.dex */
public abstract class cn7 {
    private static final String a = "PBKDF2";

    private static byte[] a(char[] cArr, byte[] bArr, int i, int i2, boolean z) {
        SecretKeyFactory secretKeyFactory;
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr, bArr, i, i2);
            if (z) {
                secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            } else {
                secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            }
            return secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
        } catch (NoSuchAlgorithmException e) {
            e = e;
            String str = a;
            jec.c(str, "pbkdf exception : " + e.getMessage());
            return new byte[0];
        } catch (InvalidKeySpecException e2) {
            e = e2;
            String str2 = a;
            jec.c(str2, "pbkdf exception : " + e.getMessage());
            return new byte[0];
        }
    }

    public static byte[] b(char[] cArr, byte[] bArr, int i, int i2) {
        return a(cArr, bArr, i, i2, false);
    }

    public static byte[] c(char[] cArr, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[0];
        if (Build.VERSION.SDK_INT < 26) {
            jec.c(a, "system version not high than 26");
            return bArr2;
        }
        return a(cArr, bArr, i, i2, true);
    }
}
