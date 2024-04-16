package com.huawei.hms.push.utils;

import com.huawei.hms.support.log.HMSLog;
import im.threads.business.models.CampaignMessageKt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes3.dex */
public class DateUtil {
    public static String parseMilliSecondToString(Long l) {
        if (l == null) {
            return null;
        }
        try {
            return new SimpleDateFormat(CampaignMessageKt.CAMPAIGN_DATE_FORMAT).format(l);
        } catch (Exception e) {
            HMSLog.e("DateUtil", "parseMilliSecondToString Exception.", e);
            return null;
        }
    }

    public static long parseUtcToMillisecond(String str) throws ParseException, StringIndexOutOfBoundsException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(CampaignMessageKt.CAMPAIGN_DATE_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String substring = str.substring(0, str.indexOf("."));
        String substring2 = str.substring(str.indexOf("."));
        return simpleDateFormat.parse(substring + (substring2.substring(0, 4) + "Z")).getTime();
    }
}
