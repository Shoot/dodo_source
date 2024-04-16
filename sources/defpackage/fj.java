package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: fj  reason: default package */
/* loaded from: classes2.dex */
public class fj {
    @Deprecated
    public static byte[] a(@NonNull Context context, @NonNull String str) throws PackageManager.NameNotFoundException {
        MessageDigest b;
        PackageInfo e = t8c.a(context).e(str, 64);
        Signature[] signatureArr = e.signatures;
        if (signatureArr != null && signatureArr.length == 1 && (b = b("SHA1")) != null) {
            return b.digest(e.signatures[0].toByteArray());
        }
        return null;
    }

    public static MessageDigest b(@NonNull String str) {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
