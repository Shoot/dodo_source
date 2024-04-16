package defpackage;

import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.slf4j.Marker;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.zone.ZoneRulesException;
/* compiled from: ZoneId.java */
/* renamed from: vcc  reason: default package */
/* loaded from: classes3.dex */
public abstract class vcc implements Serializable {
    public static final w8b<vcc> a = new a();
    public static final Map<String, String> b;

    /* compiled from: ZoneId.java */
    /* renamed from: vcc$a */
    /* loaded from: classes3.dex */
    class a implements w8b<vcc> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public vcc a(q8b q8bVar) {
            return vcc.a(q8bVar);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        b = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vcc() {
        if (getClass() != wcc.class && getClass() != zcc.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static vcc E(String str) {
        g95.i(str, "zoneId");
        if (str.equals("Z")) {
            return wcc.h;
        }
        if (str.length() != 1) {
            if (!str.startsWith(Marker.ANY_NON_NULL_MARKER) && !str.startsWith("-")) {
                if (!str.equals("UTC") && !str.equals("GMT") && !str.equals("UT")) {
                    if (!str.startsWith("UTC+") && !str.startsWith("GMT+") && !str.startsWith("UTC-") && !str.startsWith("GMT-")) {
                        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                            return zcc.Q(str, true);
                        }
                        wcc e0 = wcc.e0(str.substring(2));
                        if (e0.b0() == 0) {
                            return new zcc("UT", e0.u());
                        }
                        return new zcc("UT" + e0.getId(), e0.u());
                    }
                    wcc e02 = wcc.e0(str.substring(3));
                    if (e02.b0() == 0) {
                        return new zcc(str.substring(0, 3), e02.u());
                    }
                    return new zcc(str.substring(0, 3) + e02.getId(), e02.u());
                }
                return new zcc(str, wcc.h.u());
            }
            return wcc.e0(str);
        }
        throw new DateTimeException("Invalid zone: " + str);
    }

    public static vcc N(String str, wcc wccVar) {
        g95.i(str, "prefix");
        g95.i(wccVar, "offset");
        if (str.length() == 0) {
            return wccVar;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("Invalid prefix, must be GMT, UTC or UT: " + str);
        } else if (wccVar.b0() == 0) {
            return new zcc(str, wccVar.u());
        } else {
            return new zcc(str + wccVar.getId(), wccVar.u());
        }
    }

    public static vcc a(q8b q8bVar) {
        vcc vccVar = (vcc) q8bVar.M(v8b.f());
        if (vccVar != null) {
            return vccVar;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName());
    }

    public static Set<String> k() {
        return new HashSet(cdc.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void P(DataOutput dataOutput) throws IOException;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vcc) {
            return getId().equals(((vcc) obj).getId());
        }
        return false;
    }

    public abstract String getId();

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString() {
        return getId();
    }

    public abstract adc u();

    public vcc x() {
        try {
            adc u = u();
            if (u.e()) {
                return u.a(b55.c);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }
}
