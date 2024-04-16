package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;
/* compiled from: IidStore.java */
/* renamed from: zt4  reason: default package */
/* loaded from: classes2.dex */
public class zt4 {
    private static final String[] c = {Marker.ANY_MARKER, "FCM", "GCM", ""};
    private final SharedPreferences a;
    private final String b;

    public zt4(@NonNull qv3 qv3Var) {
        this.a = qv3Var.k().getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = b(qv3Var);
    }

    private String a(@NonNull String str, @NonNull String str2) {
        return "|T|" + str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2;
    }

    private static String b(qv3 qv3Var) {
        String d = qv3Var.n().d();
        if (d != null) {
            return d;
        }
        String c2 = qv3Var.n().c();
        if (!c2.startsWith("1:") && !c2.startsWith("2:")) {
            return c2;
        }
        String[] split = c2.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(@NonNull PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.a) {
            string = this.a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.a) {
            try {
                String string = this.a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey e = e(string);
                if (e == null) {
                    return null;
                }
                return c(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String f() {
        synchronized (this.a) {
            try {
                String g = g();
                if (g != null) {
                    return g;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        synchronized (this.a) {
            try {
                for (String str : c) {
                    String string = this.a.getString(a(this.b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
