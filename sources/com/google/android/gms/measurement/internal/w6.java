package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class w6 {
    public static final w6 c = new w6(null, null, 100);
    private final EnumMap<a, Boolean> a;
    private final int b;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
    /* loaded from: classes2.dex */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");
        
        public final String a;

        a(String str) {
            this.a = str;
        }
    }

    private w6(EnumMap<a, Boolean> enumMap, int i) {
        EnumMap<a, Boolean> enumMap2 = new EnumMap<>(a.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static char a(Boolean bool) {
        if (bool == null) {
            return CoreConstants.DASH_CHAR;
        }
        if (bool.booleanValue()) {
            return '1';
        }
        return '0';
    }

    public static w6 c(Bundle bundle, int i) {
        a[] aVarArr;
        if (bundle == null) {
            return new w6(null, null, i);
        }
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = v6.STORAGE.a;
        for (a aVar : aVarArr) {
            enumMap.put((EnumMap) aVar, (a) q(bundle.getString(aVar.a)));
        }
        return new w6(enumMap, i);
    }

    public static w6 e(String str) {
        return f(str, 100);
    }

    public static w6 f(String str, int i) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str != null) {
            a[] a2 = v6.STORAGE.a();
            for (int i2 = 0; i2 < a2.length; i2++) {
                a aVar = a2[i2];
                int i3 = i2 + 2;
                if (i3 < str.length()) {
                    enumMap.put((EnumMap) aVar, (a) g(str.charAt(i3)));
                }
            }
        }
        return new w6(enumMap, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean g(char c2) {
        if (c2 != '0') {
            if (c2 != '1') {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(int i) {
        if (i != -20) {
            if (i != -10) {
                if (i != 0) {
                    if (i != 30) {
                        if (i != 90) {
                            if (i != 100) {
                                return "OTHER";
                            }
                            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
                        }
                        return "REMOTE_CONFIG";
                    }
                    return "1P_INIT";
                }
                return "1P_API";
            }
            return "MANIFEST";
        }
        return "API";
    }

    public static String i(Bundle bundle) {
        a[] aVarArr;
        String string;
        aVarArr = v6.STORAGE.a;
        for (a aVar : aVarArr) {
            if (bundle.containsKey(aVar.a) && (string = bundle.getString(aVar.a)) != null && q(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j(boolean z) {
        if (z) {
            return "granted";
        }
        return "denied";
    }

    public static boolean k(int i, int i2) {
        if (i <= i2) {
            return true;
        }
        return false;
    }

    private static int n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean q(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (!str.equals("denied")) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final int b() {
        return this.b;
    }

    public final w6 d(w6 w6Var) {
        a[] aVarArr;
        boolean z;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = v6.STORAGE.a;
        for (a aVar : aVarArr) {
            Boolean bool = this.a.get(aVar);
            Boolean bool2 = w6Var.a.get(aVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new w6(enumMap, 100);
    }

    public final boolean equals(Object obj) {
        a[] aVarArr;
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        aVarArr = v6.STORAGE.a;
        for (a aVar : aVarArr) {
            if (n(this.a.get(aVar)) != n(w6Var.a.get(aVar))) {
                return false;
            }
        }
        if (this.b != w6Var.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b * 17;
        for (Boolean bool : this.a.values()) {
            i = (i * 31) + n(bool);
        }
        return i;
    }

    public final boolean l(a aVar) {
        Boolean bool = this.a.get(aVar);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean m(w6 w6Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!w6Var.l(aVar) && l(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry<a, Boolean> entry : this.a.entrySet()) {
            Boolean value = entry.getValue();
            if (value != null) {
                bundle.putString(entry.getKey().a, j(value.booleanValue()));
            }
        }
        return bundle;
    }

    public final w6 p(w6 w6Var) {
        a[] aVarArr;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = v6.STORAGE.a;
        for (a aVar : aVarArr) {
            Boolean bool = this.a.get(aVar);
            if (bool == null) {
                bool = w6Var.a.get(aVar);
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new w6(enumMap, this.b);
    }

    public final boolean r(w6 w6Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            Boolean bool = this.a.get(aVar);
            Boolean bool2 = w6Var.a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final Boolean s() {
        return this.a.get(a.AD_STORAGE);
    }

    public final boolean t(w6 w6Var) {
        return r(w6Var, (a[]) this.a.keySet().toArray(new a[0]));
    }

    public final String toString() {
        a[] aVarArr;
        String str;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(h(this.b));
        aVarArr = v6.STORAGE.a;
        for (a aVar : aVarArr) {
            sb.append(",");
            sb.append(aVar.a);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            Boolean bool = this.a.get(aVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                if (bool.booleanValue()) {
                    str = "granted";
                } else {
                    str = "denied";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public final Boolean u() {
        return this.a.get(a.ANALYTICS_STORAGE);
    }

    public final String v() {
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : v6.STORAGE.a()) {
            sb.append(a(this.a.get(aVar)));
        }
        return sb.toString();
    }

    public final String w() {
        char c2;
        StringBuilder sb = new StringBuilder("G2");
        for (a aVar : v6.STORAGE.a()) {
            Boolean bool = this.a.get(aVar);
            if (bool == null) {
                c2 = 'g';
            } else if (bool.booleanValue()) {
                c2 = 'G';
            } else {
                c2 = 'D';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final boolean x() {
        return l(a.AD_STORAGE);
    }

    public final boolean y() {
        return l(a.ANALYTICS_STORAGE);
    }

    public final boolean z() {
        for (Boolean bool : this.a.values()) {
            if (bool != null) {
                return true;
            }
        }
        return false;
    }

    public w6(Boolean bool, Boolean bool2, int i) {
        EnumMap<a, Boolean> enumMap = new EnumMap<>(a.class);
        this.a = enumMap;
        enumMap.put((EnumMap<a, Boolean>) a.AD_STORAGE, (a) bool);
        enumMap.put((EnumMap<a, Boolean>) a.ANALYTICS_STORAGE, (a) bool2);
        this.b = i;
    }
}
