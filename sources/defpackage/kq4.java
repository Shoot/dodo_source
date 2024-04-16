package defpackage;

import com.android.volley.a;
import com.android.volley.f;
import com.huawei.hms.framework.common.ContainerUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
/* compiled from: HttpHeaderParser.java */
/* renamed from: kq4  reason: default package */
/* loaded from: classes.dex */
public class kq4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<en4> a(List<en4> list, a.C0093a c0093a) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (en4 en4Var : list) {
                treeSet.add(en4Var.a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<en4> list2 = c0093a.h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (en4 en4Var2 : c0093a.h) {
                    if (!treeSet.contains(en4Var2.a())) {
                        arrayList.add(en4Var2);
                    }
                }
            }
        } else if (!c0093a.g.isEmpty()) {
            for (Map.Entry<String, String> entry : c0093a.g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new en4(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    static String b(long j) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> c(a.C0093a c0093a) {
        if (c0093a == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = c0093a.b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j = c0093a.d;
        if (j > 0) {
            hashMap.put("If-Modified-Since", b(j));
        }
        return hashMap;
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static a.C0093a e(iw6 iw6Var) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = iw6Var.c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        if (str != null) {
            j = h(str);
        } else {
            j = 0;
        }
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = map.get("Expires");
        if (str3 != null) {
            j4 = h(str3);
        } else {
            j4 = 0;
        }
        String str4 = map.get("Last-Modified");
        if (str4 != null) {
            j5 = h(str4);
        } else {
            j5 = 0;
        }
        String str5 = map.get("ETag");
        if (i != 0) {
            j7 = currentTimeMillis + (j2 * 1000);
            if (z) {
                j8 = j7;
            } else {
                Long.signum(j3);
                j8 = (j3 * 1000) + j7;
            }
            j6 = j8;
        } else {
            j6 = 0;
            if (j > 0 && j4 >= j) {
                j7 = currentTimeMillis + (j4 - j);
                j6 = j7;
            } else {
                j7 = 0;
            }
        }
        a.C0093a c0093a = new a.C0093a();
        c0093a.a = iw6Var.b;
        c0093a.b = str5;
        c0093a.f = j7;
        c0093a.e = j6;
        c0093a.c = j;
        c0093a.d = j5;
        c0093a.g = map;
        c0093a.h = iw6Var.d;
        return c0093a;
    }

    public static String f(Map<String, String> map) {
        return g(map, "ISO-8859-1");
    }

    public static String g(Map<String, String> map, String str) {
        if (map == null) {
            return str;
        }
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split(ContainerUtils.KEY_VALUE_DELIMITER, 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static long h(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                f.d(e, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            f.e("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<en4> i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new en4(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> j(List<en4> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (en4 en4Var : list) {
            treeMap.put(en4Var.a(), en4Var.b());
        }
        return treeMap;
    }
}
