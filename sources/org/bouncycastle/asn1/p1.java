package org.bouncycastle.asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes3.dex */
class p1 {
    private static Long a = c(0);
    private static final Map b = new HashMap();
    static Locale c = b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Date a(Date date) throws ParseException {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = b;
        synchronized (map) {
            try {
                Long l = (Long) map.get(locale);
                if (l == null) {
                    long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                    if (time == 0) {
                        l = a;
                    } else {
                        l = c(time);
                    }
                    map.put(locale, l);
                }
                if (l != a) {
                    return new Date(date.getTime() - l.longValue());
                }
                return date;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Locale b() {
        if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return Locale.getDefault();
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i = 0; i != availableLocales.length; i++) {
            if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                return availableLocales[i];
            }
        }
        return Locale.getDefault();
    }

    private static Long c(long j) {
        return Long.valueOf(j);
    }
}
