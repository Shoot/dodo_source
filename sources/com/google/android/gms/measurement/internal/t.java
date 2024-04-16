package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.w6;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class t {
    public static final t f = new t((Boolean) null, 100);
    private final int a;
    private final String b;
    private final Boolean c;
    private final String d;
    private final EnumMap<w6.a, Boolean> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Boolean bool, int i) {
        this(bool, i, (Boolean) null, (String) null);
    }

    public static t b(Bundle bundle, int i) {
        w6.a[] a;
        Boolean bool = null;
        if (bundle == null) {
            return new t((Boolean) null, i);
        }
        EnumMap enumMap = new EnumMap(w6.a.class);
        for (w6.a aVar : v6.DMA.a()) {
            enumMap.put((EnumMap) aVar, (w6.a) w6.q(bundle.getString(aVar.a)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new t(enumMap, i, bool, bundle.getString("cps_display_str"));
    }

    public static t c(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(w6.a.class);
            w6.a[] a = v6.DMA.a();
            int length = a.length;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                enumMap.put((EnumMap) a[i2], (w6.a) w6.g(split[i].charAt(0)));
                i2++;
                i++;
            }
            return new t(enumMap, parseInt);
        }
        return f;
    }

    public static Boolean d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return w6.q(bundle.getString("ad_personalization"));
    }

    private final String k() {
        w6.a[] a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (w6.a aVar : v6.DMA.a()) {
            sb.append(":");
            sb.append(w6.a(this.e.get(aVar)));
        }
        return sb.toString();
    }

    public final int a() {
        return this.a;
    }

    public final Bundle e() {
        Bundle bundle = new Bundle();
        for (Map.Entry<w6.a, Boolean> entry : this.e.entrySet()) {
            Boolean value = entry.getValue();
            if (value != null) {
                bundle.putString(entry.getKey().a, w6.j(value.booleanValue()));
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.b.equalsIgnoreCase(tVar.b) || !Objects.equals(this.c, tVar.c)) {
            return false;
        }
        return Objects.equals(this.d, tVar.d);
    }

    public final Boolean f() {
        return this.e.get(w6.a.AD_USER_DATA);
    }

    public final Boolean g() {
        return this.c;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else if (bool == Boolean.TRUE) {
            i = 7;
        } else {
            i = 13;
        }
        String str = this.d;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return this.b.hashCode() + (i * 29) + (hashCode * 137);
    }

    public final String i() {
        return this.b;
    }

    public final boolean j() {
        for (Boolean bool : this.e.values()) {
            if (bool != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        w6.a[] a;
        String str;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(w6.h(this.a));
        for (w6.a aVar : v6.DMA.a()) {
            sb.append(",");
            sb.append(aVar.a);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            Boolean bool = this.e.get(aVar);
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
        if (this.c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.d);
        }
        return sb.toString();
    }

    private t(EnumMap<w6.a, Boolean> enumMap, int i) {
        this(enumMap, i, (Boolean) null, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<w6.a, Boolean> enumMap = new EnumMap<>(w6.a.class);
        this.e = enumMap;
        enumMap.put((EnumMap<w6.a, Boolean>) w6.a.AD_USER_DATA, (w6.a) bool);
        this.a = i;
        this.b = k();
        this.c = bool2;
        this.d = str;
    }

    private t(EnumMap<w6.a, Boolean> enumMap, int i, Boolean bool, String str) {
        EnumMap<w6.a, Boolean> enumMap2 = new EnumMap<>(w6.a.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = k();
        this.c = bool;
        this.d = str;
    }
}
