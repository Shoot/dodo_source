package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.w6;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class ma {
    private static final String[] b = {"TcfDataEnabled", "GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};
    private final Map<String, String> a;

    private ma(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.putAll(map);
    }

    private static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static ma c(SharedPreferences sharedPreferences, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("TcfDataEnabled", str);
        String f = f(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(f) && f.length() > 754) {
            hashMap.put("GoogleConsent", String.valueOf(f.charAt(754)));
        }
        int a = a(sharedPreferences, "IABTCF_gdprApplies");
        if (a != -1) {
            hashMap.put("gdprApplies", String.valueOf(a));
        }
        int a2 = a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (a2 != -1) {
            hashMap.put("EnableAdvertiserConsentMode", String.valueOf(a2));
        }
        int a3 = a(sharedPreferences, "IABTCF_PolicyVersion");
        if (a3 != -1) {
            hashMap.put("PolicyVersion", String.valueOf(a3));
        }
        String f2 = f(sharedPreferences, "IABTCF_PurposeConsents");
        if (!"\u0000".equals(f2)) {
            hashMap.put("PurposeConsents", f2);
        }
        int a4 = a(sharedPreferences, "IABTCF_CmpSdkID");
        if (a4 != -1) {
            hashMap.put("CmpSdkID", String.valueOf(a4));
        }
        return new ma(hashMap);
    }

    public static String d(String str, boolean z) {
        if (z && str.length() > 4) {
            char[] charArray = str.toCharArray();
            int i = 1;
            while (true) {
                if (i < 64) {
                    if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i)) {
                        break;
                    }
                    i++;
                } else {
                    i = 0;
                    break;
                }
            }
            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i);
            return String.valueOf(charArray);
        }
        return str;
    }

    private static String f(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (ClassCastException unused) {
            return "\u0000";
        }
    }

    private final int h() {
        try {
            String str = this.a.get("CmpSdkID");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final int i() {
        try {
            String str = this.a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle b() {
        String str;
        String str2;
        if ("1".equals(this.a.get("TcfDataEnabled")) && "1".equals(this.a.get("GoogleConsent")) && "1".equals(this.a.get("gdprApplies")) && "1".equals(this.a.get("EnableAdvertiserConsentMode"))) {
            int i = i();
            if (i < 0) {
                return Bundle.EMPTY;
            }
            String str3 = this.a.get("PurposeConsents");
            if (TextUtils.isEmpty(str3)) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            String str4 = "denied";
            if (str3.length() > 0) {
                String str5 = w6.a.AD_STORAGE.a;
                if (str3.charAt(0) != '1') {
                    str2 = "denied";
                } else {
                    str2 = "granted";
                }
                bundle.putString(str5, str2);
            }
            if (str3.length() > 3) {
                String str6 = w6.a.AD_PERSONALIZATION.a;
                if (str3.charAt(2) != '1' || str3.charAt(3) != '1') {
                    str = "denied";
                } else {
                    str = "granted";
                }
                bundle.putString(str6, str);
            }
            if (str3.length() > 6 && i >= 4) {
                String str7 = w6.a.AD_USER_DATA.a;
                if (str3.charAt(0) == '1' && str3.charAt(6) == '1') {
                    str4 = "granted";
                }
                bundle.putString(str7, str4);
            }
            return bundle;
        }
        return Bundle.EMPTY;
    }

    public final String e() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        int h = h();
        if (h >= 0 && h <= 4095) {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((h >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(h & 63));
        } else {
            sb.append("00");
        }
        int i2 = i();
        if (i2 >= 0 && i2 <= 63) {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i2));
        } else {
            sb.append("0");
        }
        gh8.a(true);
        if ("1".equals(this.a.get("gdprApplies"))) {
            i = 2;
        } else {
            i = 0;
        }
        if ("1".equals(this.a.get("TcfDataEnabled"))) {
            i |= 4;
        }
        if ("1".equals(this.a.get("EnableAdvertiserConsentMode"))) {
            i |= 8;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ma)) {
            return false;
        }
        return g().equalsIgnoreCase(((ma) obj).g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String g() {
        String[] strArr;
        StringBuilder sb = new StringBuilder();
        for (String str : b) {
            if (this.a.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(this.a.get(str));
            }
        }
        return sb.toString();
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final String toString() {
        return g();
    }
}
