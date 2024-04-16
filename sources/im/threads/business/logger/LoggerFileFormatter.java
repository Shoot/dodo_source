package im.threads.business.logger;

import android.os.Process;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: LoggerFileFormatter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ(\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lim/threads/business/logger/LoggerFileFormatter;", "", "()V", "date", "Ljava/lang/ThreadLocal;", "Ljava/util/Date;", "fileNameFormat", "Ljava/text/SimpleDateFormat;", "lineFormat", "", "timeFormat", "formatFileName", "timeInMillis", "", "formatLine", "level", RemoteMessageConst.Notification.TAG, "log", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggerFileFormatter {
    private final ThreadLocal<SimpleDateFormat> timeFormat = new ThreadLocal<SimpleDateFormat>() { // from class: im.threads.business.logger.LoggerFileFormatter$timeFormat$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("dd-MM HH:mm:ss.SSS", Locale.getDefault());
        }
    };
    private final ThreadLocal<SimpleDateFormat> fileNameFormat = new ThreadLocal<SimpleDateFormat>() { // from class: im.threads.business.logger.LoggerFileFormatter$fileNameFormat$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("dd_MM_HH", Locale.getDefault());
        }
    };
    private final ThreadLocal<Date> date = new ThreadLocal<Date>() { // from class: im.threads.business.logger.LoggerFileFormatter$date$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public Date initialValue() {
            return new Date();
        }
    };
    private final String lineFormat = "%s %d-%d %s/%s: %s";

    public final String formatFileName(long j) {
        String str;
        this.date.set(new Date(j));
        Date date = this.date.get();
        if (date != null) {
            SimpleDateFormat simpleDateFormat = this.fileNameFormat.get();
            if (simpleDateFormat != null) {
                str = simpleDateFormat.format(date);
            } else {
                str = null;
            }
            String str2 = str + "_00.txt";
            if (str2 != null) {
                return str2;
            }
        }
        return "Error when parsing date";
    }

    public final String formatLine(long j, String str, String str2, String str3) {
        String str4;
        z65.h(str, "level");
        z65.h(str3, "log");
        this.date.set(new Date(j));
        Date date = this.date.get();
        if (date != null) {
            SimpleDateFormat simpleDateFormat = this.timeFormat.get();
            if (simpleDateFormat != null) {
                str4 = simpleDateFormat.format(date);
            } else {
                str4 = null;
            }
            int myPid = Process.myPid();
            int myTid = Process.myTid();
            pza pzaVar = pza.a;
            String format = String.format(Locale.getDefault(), this.lineFormat, Arrays.copyOf(new Object[]{str4, Integer.valueOf(myPid), Integer.valueOf(myTid), str, str2, str3}, 6));
            z65.g(format, "format(locale, format, *args)");
            if (format != null) {
                return format;
            }
        }
        return "Error when parsing date";
    }
}
