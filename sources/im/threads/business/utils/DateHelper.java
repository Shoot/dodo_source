package im.threads.business.utils;

import im.threads.business.logger.LoggerEdna;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
/* compiled from: DateHelper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lim/threads/business/utils/DateHelper;", "", "()V", "SERVER_DATE_FORMAT", "", "SERVER_DATE_TIMEZONE", "sdf", "Ljava/text/SimpleDateFormat;", "getMessageDateStringFromTimestamp", "timestamp", "", "getMessageTimestampFromDateString", "dateString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DateHelper {
    public static final DateHelper INSTANCE = new DateHelper();
    private static final String SERVER_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final String SERVER_DATE_TIMEZONE = "UTC";
    private static final SimpleDateFormat sdf;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
        sdf = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(SERVER_DATE_TIMEZONE));
    }

    private DateHelper() {
    }

    public final synchronized String getMessageDateStringFromTimestamp(long j) {
        String format;
        format = sdf.format(new Date(j));
        z65.g(format, "sdf.format(Date(timestamp))");
        return format;
    }

    public final synchronized long getMessageTimestampFromDateString(String str) {
        Date date;
        date = new Date();
        if (str != null) {
            try {
                Date parse = sdf.parse(str);
                if (parse != null) {
                    date = parse;
                }
            } catch (ParseException e) {
                LoggerEdna.error("getMessageTimestampFromDateString", e);
            }
        }
        return date.getTime();
    }
}
