package defpackage;

import ch.qos.logback.classic.Level;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
/* renamed from: whc  reason: default package */
/* loaded from: classes.dex */
class whc implements yhc {
    private SecretKey a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public whc(String str, String str2, String str3, String str4) throws InvalidKeySpecException, NoSuchAlgorithmException, IllegalArgumentException {
        if (str != null && str2 != null && str3 != null && str4 != null) {
            this.a = eic.a(ho4.b(str), ho4.b(str2), ho4.b(str3), ho4.b(str4), Level.TRACE_INT);
        }
    }

    @Override // defpackage.yhc
    public String a(String str, String str2) {
        SecretKey secretKey = this.a;
        if (secretKey == null) {
            return str;
        }
        try {
            return new String(eic.b(secretKey, ho4.b(str)), "UTF-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused) {
            return str2;
        }
    }
}
