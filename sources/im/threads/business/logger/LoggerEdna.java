package im.threads.business.logger;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: LoggerEdna.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\tH\u0007J&\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u001c\u0010\u000b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0007J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\u000f\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\tH\u0007R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0015"}, d2 = {"Lim/threads/business/logger/LoggerEdna;", "", "()V", "logSender", "Lim/threads/business/logger/LogSender;", "getLogSender$annotations", "debug", "", "log", "", RemoteMessageConst.Notification.TAG, "error", "throwable", "", "flushLogs", "info", "init", "config", "Lim/threads/business/logger/LoggerConfig;", "verbose", "warning", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggerEdna {
    public static final LoggerEdna INSTANCE = new LoggerEdna();
    private static volatile LogSender logSender;

    private LoggerEdna() {
    }

    public static final void debug(String str) {
        z65.h(str, "log");
        debug(null, str);
    }

    public static final void error(String str) {
        z65.h(str, "log");
        error((String) null, str);
    }

    public static final void flushLogs() {
        LogSender logSender2 = logSender;
        if (logSender2 != null) {
            logSender2.send(LoggerLevel.FLUSH, null, "Flushing logs into file", null);
        }
    }

    public static final void info(String str) {
        z65.h(str, "log");
        LogSender logSender2 = logSender;
        if (logSender2 != null) {
            LogSender.send$default(logSender2, LoggerLevel.INFO, null, str, null, 8, null);
        }
    }

    public static final void init(LoggerConfig loggerConfig) {
        z65.h(loggerConfig, "config");
        LoggerConfig.Companion.setConfig(loggerConfig);
        logSender = new LogSender(loggerConfig);
    }

    public static final void verbose(String str) {
        z65.h(str, "log");
        verbose(null, str);
    }

    public static final void warning(String str) {
        z65.h(str, "log");
        warning(null, str);
    }

    public static final void debug(String str, String str2) {
        z65.h(str2, "log");
        LogSender logSender2 = logSender;
        if (logSender2 != null) {
            LogSender.send$default(logSender2, LoggerLevel.DEBUG, str, str2, null, 8, null);
        }
    }

    public static final void error(String str, String str2) {
        z65.h(str2, "log");
        LogSender logSender2 = logSender;
        if (logSender2 != null) {
            LogSender.send$default(logSender2, LoggerLevel.ERROR, str, str2, null, 8, null);
        }
    }

    public static final void info(String str, String str2) {
        z65.h(str2, "log");
        LogSender logSender2 = logSender;
        if (logSender2 != null) {
            LogSender.send$default(logSender2, LoggerLevel.INFO, str, str2, null, 8, null);
        }
    }

    public static final void verbose(String str, String str2) {
        z65.h(str2, "log");
        LogSender logSender2 = logSender;
        if (logSender2 != null) {
            LogSender.send$default(logSender2, LoggerLevel.VERBOSE, str, str2, null, 8, null);
        }
    }

    public static final void warning(String str, String str2) {
        z65.h(str2, "log");
        LogSender logSender2 = logSender;
        if (logSender2 != null) {
            LogSender.send$default(logSender2, LoggerLevel.WARNING, str, str2, null, 8, null);
        }
    }

    public static final void error(Throwable th) {
        error((String) null, th);
    }

    public static final void error(String str, Throwable th) {
        error(null, str, th);
    }

    public static final void error(String str, String str2, Throwable th) {
        LogSender logSender2 = logSender;
        if (logSender2 != null) {
            logSender2.send(LoggerLevel.ERROR, str, str2, th);
        }
    }

    private static /* synthetic */ void getLogSender$annotations() {
    }
}
