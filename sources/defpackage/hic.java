package defpackage;

import android.content.Context;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: hic  reason: default package */
/* loaded from: classes.dex */
public class hic extends gic {
    private final Map<String, String> c;
    private final Object d;
    private yhc e;
    private boolean f;
    private final String g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hic(Context context, String str) {
        super(context, str);
        this.c = new HashMap();
        this.d = new Object();
        this.f = true;
        this.g = str;
        try {
            String b = b("/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138");
            String b2 = b("/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C");
            String b3 = b("/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B");
            String b4 = b("/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD");
            if (b != null && b2 != null && b3 != null && b4 != null) {
                this.e = new whc(b, b2, b3, b4);
            } else {
                this.f = false;
            }
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("SecurityResourcesReader", "Exception when reading the 'K&I' for 'Config'.");
            this.e = null;
        }
    }

    private String b(String str) {
        return super.a(str, null);
    }

    @Override // defpackage.gic, defpackage.shc
    public String a(String str, String str2) {
        if (!this.f) {
            String b = b(str);
            if (b != null) {
                return b;
            }
            return str2;
        } else if (this.e == null) {
            Log.e("SecurityResourcesReader", "KEY is null return def directly");
            return str2;
        } else {
            synchronized (this.d) {
                try {
                    String str3 = this.c.get(str);
                    if (str3 != null) {
                        return str3;
                    }
                    String b2 = b(str);
                    if (b2 == null) {
                        return str2;
                    }
                    String a = this.e.a(b2, str2);
                    this.c.put(str, a);
                    return a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public String toString() {
        return "SecurityResourcesReader{mKey=, encrypt=" + this.f + CoreConstants.CURLY_RIGHT;
    }
}
