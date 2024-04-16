package defpackage;

import android.content.Context;
import android.text.BidiFormatter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.models.CampaignMessageKt;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
/* compiled from: DefaultTimeFormatter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0014\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lzr2;", "Ljgb;", "", CrashHianalyticsData.TIME, "", "a", c.a, "b", "Ljava/lang/String;", "utcPattern", "pattern", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "format", DateTokenConverter.CONVERTER_KEY, "utcFormat", "Ljava/text/DateFormat;", "kotlin.jvm.PlatformType", e.a, "Ljava/text/DateFormat;", "shortFormat", "", "f", "Z", "isShortFormat24Hour", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zr2  reason: default package */
/* loaded from: classes4.dex */
public final class zr2 implements jgb {
    private final String a;
    private final String b;
    private SimpleDateFormat c;
    private SimpleDateFormat d;
    private DateFormat e;
    private final boolean f;

    public zr2(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = CampaignMessageKt.CAMPAIGN_DATE_FORMAT;
        this.b = "yyyy-MM-dd'T'HH:mm:ss";
        this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
        this.d = new SimpleDateFormat(CampaignMessageKt.CAMPAIGN_DATE_FORMAT, Locale.getDefault());
        this.e = android.text.format.DateFormat.getTimeFormat(context);
        this.f = android.text.format.DateFormat.is24HourFormat(context);
    }

    @Override // defpackage.jgb
    public String a(long j) {
        String format;
        synchronized (this) {
            format = this.c.format(Long.valueOf(j));
            z65.g(format, "format(...)");
        }
        return format;
    }

    @Override // defpackage.jgb
    public String b(long j) {
        String format;
        synchronized (this) {
            this.d.setTimeZone(TimeZone.getTimeZone("UTC"));
            format = this.d.format(Long.valueOf(j));
            z65.g(format, "format(...)");
        }
        return format;
    }

    @Override // defpackage.jgb
    public String c(long j) {
        String format;
        synchronized (this) {
            try {
                format = this.e.format(Long.valueOf(j));
                if (this.f) {
                    z65.e(format);
                } else {
                    format = BidiFormatter.getInstance().unicodeWrap(format);
                    z65.e(format);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return format;
    }
}
