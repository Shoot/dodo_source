package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: gic  reason: default package */
/* loaded from: classes.dex */
class gic implements shc {
    private final Context a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gic(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    private static String b(String str) {
        try {
            return "agc_" + ho4.c(c(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static byte[] c(byte[] bArr) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256").digest(bArr);
    }

    @Override // defpackage.shc
    public String a(String str, String str2) {
        String b = b(str);
        if (TextUtils.isEmpty(b)) {
            return str2;
        }
        int identifier = this.a.getResources().getIdentifier(b, "string", this.b);
        if (identifier == 0) {
            return str2;
        }
        try {
            return this.a.getResources().getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return str2;
        }
    }
}
