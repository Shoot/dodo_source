package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: TimeParser.java */
/* renamed from: pgb  reason: default package */
/* loaded from: classes3.dex */
public class pgb {
    private final SimpleDateFormat b;
    private final Logger c = LoggerFactory.getLogger("DodoTimeFormatter");
    private final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());

    public pgb() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
        this.b = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public synchronized long a(String str) {
        try {
        } catch (ParseException e) {
            Logger logger = this.c;
            logger.warn("Failed to parse " + str, (Throwable) e);
            return 0L;
        }
        return this.a.parse(str).getTime();
    }

    public synchronized long b(String str) {
        try {
        } catch (ParseException e) {
            Logger logger = this.c;
            logger.warn("Failed to parse " + str, (Throwable) e);
            return 0L;
        }
        return this.b.parse(str).getTime();
    }
}
