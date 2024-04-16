package ch.qos.logback.core.rolling.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DateParser implements FilenameParser<Date> {
    private final SimpleDateFormat dateFormatter;
    private final Pattern pathPattern;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateParser(FileNamePattern fileNamePattern) {
        this.dateFormatter = getDateFormatter(fileNamePattern);
        this.pathPattern = Pattern.compile(fileNamePattern.toRegex(true, false));
    }

    private String findToken(String str) {
        Matcher matcher = this.pathPattern.matcher(str);
        if (matcher.find() && matcher.groupCount() >= 1) {
            return matcher.group(1);
        }
        return "";
    }

    private SimpleDateFormat getDateFormatter(FileNamePattern fileNamePattern) {
        String str;
        TimeZone timeZone;
        DateTokenConverter<Object> primaryDateTokenConverter = fileNamePattern.getPrimaryDateTokenConverter();
        if (primaryDateTokenConverter != null) {
            str = primaryDateTokenConverter.getDatePattern();
        } else {
            str = "yyyy-MM-dd";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        if (primaryDateTokenConverter != null) {
            timeZone = primaryDateTokenConverter.getTimeZone();
        } else {
            timeZone = TimeZone.getDefault();
        }
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat;
    }

    Date parseDate(String str) throws ParseException {
        return this.dateFormatter.parse(str);
    }

    @Override // ch.qos.logback.core.rolling.helper.FilenameParser
    public Date parseFilename(String str) {
        try {
            return parseDate(findToken(str));
        } catch (ParseException unused) {
            return null;
        }
    }
}
