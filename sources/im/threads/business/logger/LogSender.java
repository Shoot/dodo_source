package im.threads.business.logger;

import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.extensions.BusinessExtensionsKt;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LogSender.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u001b\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002J\"\u0010\f\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J.\u0010\u001d\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lim/threads/business/logger/LogSender;", "", "loggerConfig", "Lim/threads/business/logger/LoggerConfig;", "(Lim/threads/business/logger/LoggerConfig;)V", "currentPackageName", "", "getCurrentTag", RemoteMessageConst.Notification.TAG, "level", "Lim/threads/business/logger/LoggerLevel;", "getErrorString", "log", "throwable", "", "getLineIndex", "", "stackTrace", "", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)I", "getLineName", "isMinLevelDoesNotMatch", "", "config", "", "logToConsole", "currentTag", "logToFile", "send", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogSender {
    private final String currentPackageName;
    private final LoggerConfig loggerConfig;

    /* compiled from: LogSender.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoggerLevel.values().length];
            try {
                iArr[LoggerLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoggerLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoggerLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoggerLevel.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoggerLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LogSender(LoggerConfig loggerConfig) {
        String str;
        this.loggerConfig = loggerConfig;
        Package r1 = LogSender.class.getPackage();
        if (r1 != null) {
            str = r1.getName();
        } else {
            str = null;
        }
        this.currentPackageName = str == null ? "im.threads.internal.domain.logger" : str;
    }

    private final String getCurrentTag(String str, LoggerLevel loggerLevel) {
        boolean y;
        CharSequence R0;
        if (str == null) {
            str = "";
        }
        y = l0b.y(str);
        if (!y) {
            R0 = m0b.R0(str);
            String obj = R0.toString();
            String lineName = getLineName(loggerLevel);
            return obj + " ELog " + lineName;
        }
        String lineName2 = getLineName(loggerLevel);
        return "ELog " + lineName2;
    }

    private final String getErrorString(String str, Throwable th) {
        boolean y;
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            y = l0b.y(str);
            if (!y) {
                sb.append(str);
            }
        }
        if (th != null) {
            sb.append(BusinessExtensionsKt.fullLogString(th));
        }
        String sb2 = sb.toString();
        z65.g(sb2, "stringBuilder.toString()");
        return sb2;
    }

    private final int getLineIndex(StackTraceElement[] stackTraceElementArr) {
        boolean O;
        int length = stackTraceElementArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                String stackTraceElement = stackTraceElementArr[length].toString();
                z65.g(stackTraceElement, "it.toString()");
                O = m0b.O(stackTraceElement, this.currentPackageName, false, 2, null);
                if (O) {
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
        }
        length = -1;
        if (length == stackTraceElementArr.length - 1) {
            return -1;
        }
        return length + 1;
    }

    private final String getLineName(LoggerLevel loggerLevel) {
        List y0;
        int n;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        z65.g(stackTrace, "stackTrace");
        int lineIndex = getLineIndex(stackTrace);
        if (lineIndex > -1) {
            StackTraceElement stackTraceElement = stackTrace[lineIndex];
            String className = stackTraceElement.getClassName();
            z65.g(className, "stackTraceElement.className");
            y0 = m0b.y0(className, new String[]{"."}, false, 0, 6, null);
            n = kc1.n(y0);
            int lineNumber = stackTraceElement.getLineNumber();
            return "[" + ((String) y0.get(n)) + ":" + lineNumber + "]";
        }
        return "Line is undefined";
    }

    private final boolean isMinLevelDoesNotMatch(LoggerConfig loggerConfig, LoggerLevel loggerLevel) {
        if (loggerLevel.compareTo(loggerConfig.getBuilder().getMinLevel$threads_release()) < 0) {
            return true;
        }
        return false;
    }

    private final void log(LoggerLevel loggerLevel, String str, String str2) {
        LoggerConfig loggerConfig = this.loggerConfig;
        if (loggerConfig == null || isMinLevelDoesNotMatch(loggerConfig, loggerLevel)) {
            return;
        }
        String currentTag = getCurrentTag(str, loggerLevel);
        logToConsole(loggerConfig, loggerLevel, currentTag, str2);
        logToFile(loggerConfig, loggerLevel, currentTag, str2);
    }

    private final void logToConsole(LoggerConfig loggerConfig, LoggerLevel loggerLevel, String str, String str2) {
        LogcatLogger logger$threads_release = loggerConfig.getBuilder().getLogger$threads_release();
        int i = WhenMappings.$EnumSwitchMapping$0[loggerLevel.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            logger$threads_release.e(str, str2);
                            return;
                        }
                        return;
                    }
                    logger$threads_release.w(str, str2);
                    return;
                }
                logger$threads_release.i(str, str2);
                return;
            }
            logger$threads_release.d(str, str2);
            return;
        }
        logger$threads_release.v(str, str2);
    }

    private final void logToFile(LoggerConfig loggerConfig, LoggerLevel loggerLevel, String str, String str2) {
        String dirPath$threads_release;
        boolean y;
        boolean z;
        if (loggerConfig.getBuilder().getLogToFile$threads_release() && (dirPath$threads_release = loggerConfig.getBuilder().getDirPath$threads_release()) != null) {
            y = l0b.y(dirPath$threads_release);
            if (!y) {
                long currentTimeMillis = System.currentTimeMillis();
                String fileName$threads_release = loggerConfig.getBuilder().getFileName$threads_release();
                if (fileName$threads_release == null) {
                    fileName$threads_release = loggerConfig.getBuilder().getFormatter$threads_release().formatFileName(currentTimeMillis);
                }
                String formatLine = loggerConfig.getBuilder().getFormatter$threads_release().formatLine(currentTimeMillis, LoggerLevel.Companion.getLevelName(loggerLevel), str, str2);
                if (loggerLevel.compareTo(LoggerLevel.ERROR) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                FileLogger.Companion.instance().logFile(loggerConfig.getBuilder().getContext$threads_release(), fileName$threads_release, loggerConfig.getBuilder().getDirPath$threads_release(), formatLine, currentTimeMillis, loggerConfig.getBuilder().getRetentionPolicy$threads_release(), loggerConfig.getBuilder().getMaxFileCount$threads_release(), loggerConfig.getBuilder().getMaxSize$threads_release(), z);
            }
        }
    }

    public static /* synthetic */ void send$default(LogSender logSender, LoggerLevel loggerLevel, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 8) != 0) {
            th = null;
        }
        logSender.send(loggerLevel, str, str2, th);
    }

    public final void send(LoggerLevel loggerLevel, String str, String str2, Throwable th) {
        z65.h(loggerLevel, "level");
        if (loggerLevel == LoggerLevel.ERROR) {
            log(loggerLevel, str, getErrorString(str2, th));
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        log(loggerLevel, str, str2);
    }
}
