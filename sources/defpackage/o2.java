package defpackage;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import defpackage.jc;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
/* compiled from: AbtExperimentInfo.java */
/* renamed from: o2  reason: default package */
/* loaded from: classes2.dex */
public class o2 {
    private static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    static final DateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    private final String a;
    private final String b;
    private final String c;
    private final Date d;
    private final long e;
    private final long f;

    public o2(String str, String str2, String str3, Date date, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j;
        this.f = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o2 a(jc.c cVar) {
        String str = cVar.d;
        if (str == null) {
            str = "";
        }
        return new o2(cVar.b, String.valueOf(cVar.c), str, new Date(cVar.m), cVar.e, cVar.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o2 b(Map<String, String> map) throws AbtException {
        String str;
        g(map);
        try {
            Date parse = h.parse(map.get("experimentStartTime"));
            long parseLong = Long.parseLong(map.get("triggerTimeoutMillis"));
            long parseLong2 = Long.parseLong(map.get("timeToLiveMillis"));
            String str2 = map.get("experimentId");
            String str3 = map.get("variantId");
            if (map.containsKey("triggerEvent")) {
                str = map.get("triggerEvent");
            } else {
                str = "";
            }
            return new o2(str2, str3, str, parse, parseLong, parseLong2);
        } catch (NumberFormatException e) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    private static void g(Map<String, String> map) throws AbtException {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.a;
    }

    long d() {
        return this.d.getTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public jc.c f(String str) {
        String str2;
        jc.c cVar = new jc.c();
        cVar.a = str;
        cVar.m = d();
        cVar.b = this.a;
        cVar.c = this.b;
        if (TextUtils.isEmpty(this.c)) {
            str2 = null;
        } else {
            str2 = this.c;
        }
        cVar.d = str2;
        cVar.e = this.e;
        cVar.j = this.f;
        return cVar;
    }
}
