package defpackage;

import org.slf4j.Logger;
import org.slf4j.event.Level;
import org.slf4j.helpers.CheckReturnValue;
import org.slf4j.spi.DefaultLoggingEventBuilder;
import org.slf4j.spi.LoggingEventBuilder;
import org.slf4j.spi.NOPLoggingEventBuilder;
/* compiled from: Logger.java */
/* renamed from: mx5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mx5 {
    @CheckReturnValue
    public static LoggingEventBuilder a(Logger logger) {
        if (logger.isDebugEnabled()) {
            return logger.makeLoggingEventBuilder(Level.DEBUG);
        }
        return NOPLoggingEventBuilder.singleton();
    }

    @CheckReturnValue
    public static LoggingEventBuilder b(Logger logger) {
        if (logger.isErrorEnabled()) {
            return logger.makeLoggingEventBuilder(Level.ERROR);
        }
        return NOPLoggingEventBuilder.singleton();
    }

    @CheckReturnValue
    public static LoggingEventBuilder c(Logger logger) {
        if (logger.isInfoEnabled()) {
            return logger.makeLoggingEventBuilder(Level.INFO);
        }
        return NOPLoggingEventBuilder.singleton();
    }

    @CheckReturnValue
    public static LoggingEventBuilder d(Logger logger, Level level) {
        if (logger.isEnabledForLevel(level)) {
            return logger.makeLoggingEventBuilder(level);
        }
        return NOPLoggingEventBuilder.singleton();
    }

    @CheckReturnValue
    public static LoggingEventBuilder e(Logger logger) {
        if (logger.isTraceEnabled()) {
            return logger.makeLoggingEventBuilder(Level.TRACE);
        }
        return NOPLoggingEventBuilder.singleton();
    }

    @CheckReturnValue
    public static LoggingEventBuilder f(Logger logger) {
        if (logger.isWarnEnabled()) {
            return logger.makeLoggingEventBuilder(Level.WARN);
        }
        return NOPLoggingEventBuilder.singleton();
    }

    public static boolean g(Logger logger, Level level) {
        int i = level.toInt();
        if (i != 0) {
            if (i != 10) {
                if (i != 20) {
                    if (i != 30) {
                        if (i == 40) {
                            return logger.isErrorEnabled();
                        }
                        throw new IllegalArgumentException("Level [" + level + "] not recognized.");
                    }
                    return logger.isWarnEnabled();
                }
                return logger.isInfoEnabled();
            }
            return logger.isDebugEnabled();
        }
        return logger.isTraceEnabled();
    }

    public static LoggingEventBuilder h(Logger logger, Level level) {
        return new DefaultLoggingEventBuilder(logger, level);
    }
}
