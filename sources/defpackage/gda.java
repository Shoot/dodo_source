package defpackage;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
/* compiled from: ServerDateTimeParserImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lgda;", "Lfda;", "", CrashHianalyticsData.TIME, "Ljava/util/TimeZone;", "timeZone", "", "a", "Ljava/lang/String;", "pattern", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gda  reason: default package */
/* loaded from: classes4.dex */
public final class gda implements fda {
    private final String a = "yyyy-MM-dd'T'HH:mm:ss";

    @Override // defpackage.fda
    public long a(String str, TimeZone timeZone) {
        z65.h(str, CrashHianalyticsData.TIME);
        z65.h(timeZone, "timeZone");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.a, Locale.getDefault());
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            return System.currentTimeMillis();
        }
    }
}
