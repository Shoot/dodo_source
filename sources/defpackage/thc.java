package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;
/* renamed from: thc  reason: default package */
/* loaded from: classes.dex */
public class thc implements yhc {
    private final shc a;
    private SecretKey b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public thc(shc shcVar) {
        this.a = shcVar;
        b();
    }

    private SecretKey b() {
        try {
            String a = this.a.a("/code/code1", null);
            String a2 = this.a.a("/code/code2", null);
            String a3 = this.a.a("/code/code3", null);
            String a4 = this.a.a("/code/code4", null);
            if (a != null && a2 != null && a3 != null && a4 != null) {
                this.b = eic.a(ho4.b(a), ho4.b(a2), ho4.b(a3), ho4.b(a4), 10000);
            }
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("ExclamationMark", "Exception when reading the 'K&I' for 'Config'.");
            this.b = null;
        }
        return this.b;
    }

    public static boolean c(String str) {
        if (!TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str)) {
            return true;
        }
        return false;
    }

    static String d(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            if (!matcher.find()) {
                return "";
            }
            return matcher.group(1);
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("ExclamationMark", "getRawString exception");
            return "";
        }
    }

    @Override // defpackage.yhc
    public String a(String str, String str2) {
        String str3;
        if (this.b == null) {
            str3 = "mKey is null, return default value";
        } else if (c(str)) {
            try {
                return new String(eic.b(this.b, ho4.b(d(str))), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused) {
                str3 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
            }
        } else {
            return str2;
        }
        Log.e("ExclamationMark", str3);
        return str2;
    }
}
