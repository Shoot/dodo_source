package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: Challenge.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR%\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\u000e8G¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0011\u0010\u0017\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u001a"}, d2 = {"Lxu0;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "scheme", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "authParams", c.a, "realm", "Ljava/nio/charset/Charset;", "()Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: xu0  reason: default package */
/* loaded from: classes3.dex */
public final class xu0 {
    private final String a;
    private final Map<String, String> b;

    public xu0(String str, Map<String, String> map) {
        String str2;
        z65.h(str, "scheme");
        z65.h(map, "authParams");
        this.a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                z65.g(locale, "US");
                str2 = key.toLowerCase(locale);
                z65.g(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        z65.g(unmodifiableMap, "unmodifiableMap(...)");
        this.b = unmodifiableMap;
    }

    public final Map<String, String> a() {
        return this.b;
    }

    public final Charset b() {
        String str = this.b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                z65.g(forName, "forName(...)");
                return forName;
            } catch (Exception unused) {
            }
        }
        return rw0.g;
    }

    public final String c() {
        return this.b.get("realm");
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return pdc.a(this, obj);
    }

    public int hashCode() {
        return pdc.b(this);
    }

    public String toString() {
        return pdc.c(this);
    }
}
