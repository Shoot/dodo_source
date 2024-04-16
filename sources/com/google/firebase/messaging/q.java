package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: NotificationParams.java */
/* loaded from: classes2.dex */
public class q {
    @NonNull
    private final Bundle a;

    public q(@NonNull Bundle bundle) {
        if (bundle != null) {
            this.a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    private static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean s(String str) {
        if (!str.startsWith("google.c.a.") && !str.equals(RemoteMessageConst.FROM)) {
            return false;
        }
        return true;
    }

    public static boolean t(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString(v("gcm.n.e")))) {
            return false;
        }
        return true;
    }

    private static boolean u(String str) {
        if (!str.startsWith("google.c.") && !str.startsWith("gcm.n.") && !str.startsWith("gcm.notification.")) {
            return false;
        }
        return true;
    }

    private static String v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    private String w(String str) {
        if (!this.a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v = v(str);
            if (this.a.containsKey(v)) {
                return v;
            }
        }
        return str;
    }

    private static String z(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public boolean a(String str) {
        String p = p(str);
        if (!"1".equals(p) && !Boolean.parseBoolean(p)) {
            return false;
        }
        return true;
    }

    public Integer b(String str) {
        String p = p(str);
        if (!TextUtils.isEmpty(p)) {
            try {
                return Integer.valueOf(Integer.parseInt(p));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray c(String str) {
        String p = p(str);
        if (!TextUtils.isEmpty(p)) {
            try {
                return new JSONArray(p);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + z(str) + ": " + p + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] e() {
        JSONArray c = c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Uri f() {
        String p = p("gcm.n.link_android");
        if (TextUtils.isEmpty(p)) {
            p = p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    public Object[] g(String str) {
        JSONArray c = c(str + "_loc_args");
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    public String h(String str) {
        return p(str + "_loc_key");
    }

    public String i(Resources resources, String str, String str2) {
        String h = h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g = g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + z(str2) + ": " + Arrays.toString(g) + " Default value will be used.", e);
            return null;
        }
    }

    public Long j(String str) {
        String p = p(str);
        if (!TextUtils.isEmpty(p)) {
            try {
                return Long.valueOf(Long.parseLong(p));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p + ") into a long");
                return null;
            }
        }
        return null;
    }

    public String k() {
        return p("gcm.n.android_channel_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer l() {
        Integer b = b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + b + ". Skipping setting notificationCount.");
            return null;
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer m() {
        Integer b = b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b + ". Skipping setting notificationPriority.");
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String p = p(str2);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return i(resources, str, str2);
    }

    public String o() {
        String p = p("gcm.n.sound2");
        if (TextUtils.isEmpty(p)) {
            return p("gcm.n.sound");
        }
        return p;
    }

    public String p(String str) {
        return this.a.getString(w(str));
    }

    public long[] q() {
        JSONArray c = c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer r() {
        Integer b = b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + b + ". Skipping setting visibility.");
        return null;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
