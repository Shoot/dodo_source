package im.threads.business.logger;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: LogcatLogger.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lim/threads/business/logger/LogcatLogger;", "", "()V", DateTokenConverter.CONVERTER_KEY, "", RemoteMessageConst.Notification.TAG, "", "log", e.a, "tr", "", "i", "v", "w", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogcatLogger {
    public final void d(String str, String str2) {
        z65.h(str2, "log");
        Log.d(str, str2);
    }

    public final void e(String str, String str2) {
        z65.h(str2, "log");
        Log.e(str, str2);
    }

    public final void i(String str, String str2) {
        z65.h(str2, "log");
        Log.i(str, str2);
    }

    public final void v(String str, String str2) {
        z65.h(str2, "log");
        Log.v(str, str2);
    }

    public final void w(String str, String str2) {
        z65.h(str2, "log");
        Log.w(str, str2);
    }

    public final void e(String str, String str2, Throwable th) {
        z65.h(str2, "log");
        Log.e(str, str2, th);
    }
}
