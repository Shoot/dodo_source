package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.util.LoggerNameUtil;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import ch.qos.logback.core.spi.FilterReply;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.spi.LocationAwareLogger;
import org.slf4j.spi.LoggingEventBuilder;
/* loaded from: classes.dex */
public final class Logger implements org.slf4j.Logger, LocationAwareLogger, AppenderAttachable<ILoggingEvent>, Serializable {
    public static final String FQCN = "ch.qos.logback.classic.Logger";
    private static final long serialVersionUID = 5454405123156820674L;
    private transient AppenderAttachableImpl<ILoggingEvent> aai;
    private transient boolean additive = true;
    private transient List<Logger> childrenList;
    private transient int effectiveLevelInt;
    private transient Level level;
    final transient LoggerContext loggerContext;
    private String name;
    private transient Logger parent;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Logger(String str, Logger logger, LoggerContext loggerContext) {
        this.name = str;
        this.parent = logger;
        this.loggerContext = loggerContext;
    }

    private int appendLoopOnAppenders(ILoggingEvent iLoggingEvent) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl != null) {
            return appenderAttachableImpl.appendLoopOnAppenders(iLoggingEvent);
        }
        return 0;
    }

    private void buildLoggingEventAndAppend(String str, List<Marker> list, Level level, String str2, Object[] objArr, Throwable th) {
        LoggingEvent loggingEvent = new LoggingEvent(str, this, level, str2, th, objArr);
        loggingEvent.setMarkers(list);
        callAppenders(loggingEvent);
    }

    private FilterReply callTurboFilters(List<Marker> list, Level level) {
        return this.loggerContext.getTurboFilterChainDecision_0_3OrMore(list, this, level, null, null, null);
    }

    private void filterAndLog_0_Or3Plus(String str, List<Marker> list, Level level, String str2, Object[] objArr, Throwable th) {
        FilterReply turboFilterChainDecision_0_3OrMore = this.loggerContext.getTurboFilterChainDecision_0_3OrMore(list, this, level, str2, objArr, th);
        if (turboFilterChainDecision_0_3OrMore == FilterReply.NEUTRAL) {
            if (this.effectiveLevelInt > level.levelInt) {
                return;
            }
        } else if (turboFilterChainDecision_0_3OrMore == FilterReply.DENY) {
            return;
        }
        buildLoggingEventAndAppend(str, list, level, str2, objArr, th);
    }

    private void filterAndLog_1(String str, List<Marker> list, Level level, String str2, Object obj, Throwable th) {
        FilterReply turboFilterChainDecision_1 = this.loggerContext.getTurboFilterChainDecision_1(list, this, level, str2, obj, th);
        if (turboFilterChainDecision_1 == FilterReply.NEUTRAL) {
            if (this.effectiveLevelInt > level.levelInt) {
                return;
            }
        } else if (turboFilterChainDecision_1 == FilterReply.DENY) {
            return;
        }
        buildLoggingEventAndAppend(str, list, level, str2, new Object[]{obj}, th);
    }

    private void filterAndLog_2(String str, List<Marker> list, Level level, String str2, Object obj, Object obj2, Throwable th) {
        FilterReply turboFilterChainDecision_2 = this.loggerContext.getTurboFilterChainDecision_2(list, this, level, str2, obj, obj2, th);
        if (turboFilterChainDecision_2 == FilterReply.NEUTRAL) {
            if (this.effectiveLevelInt > level.levelInt) {
                return;
            }
        } else if (turboFilterChainDecision_2 == FilterReply.DENY) {
            return;
        }
        buildLoggingEventAndAppend(str, list, level, str2, new Object[]{obj, obj2}, th);
    }

    private synchronized void handleParentLevelChange(int i) {
        if (this.level == null) {
            this.effectiveLevelInt = i;
            List<Logger> list = this.childrenList;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.childrenList.get(i2).handleParentLevelChange(i);
                }
            }
        }
    }

    private boolean isRootLogger() {
        if (this.parent == null) {
            return true;
        }
        return false;
    }

    private void localLevelReset() {
        Level level;
        this.effectiveLevelInt = 10000;
        if (isRootLogger()) {
            level = Level.DEBUG;
        } else {
            level = null;
        }
        this.level = level;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public synchronized void addAppender(Appender<ILoggingEvent> appender) {
        try {
            if (this.aai == null) {
                this.aai = new AppenderAttachableImpl<>();
            }
            this.aai.addAppender(appender);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ LoggingEventBuilder atDebug() {
        return mx5.a(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ LoggingEventBuilder atError() {
        return mx5.b(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ LoggingEventBuilder atInfo() {
        return mx5.c(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ LoggingEventBuilder atLevel(org.slf4j.event.Level level) {
        return mx5.d(this, level);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ LoggingEventBuilder atTrace() {
        return mx5.e(this);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ LoggingEventBuilder atWarn() {
        return mx5.f(this);
    }

    public void callAppenders(ILoggingEvent iLoggingEvent) {
        int i = 0;
        for (Logger logger = this; logger != null; logger = logger.parent) {
            i += logger.appendLoopOnAppenders(iLoggingEvent);
            if (!logger.additive) {
                break;
            }
        }
        if (i == 0) {
            this.loggerContext.noAppenderDefinedWarning(this);
        }
    }

    Logger createChildByLastNamePart(String str) {
        Logger logger;
        if (LoggerNameUtil.getFirstSeparatorIndexOf(str) == -1) {
            if (this.childrenList == null) {
                this.childrenList = new CopyOnWriteArrayList();
            }
            if (isRootLogger()) {
                logger = new Logger(str, this, this.loggerContext);
            } else {
                logger = new Logger(this.name + CoreConstants.DOT + str, this, this.loggerContext);
            }
            this.childrenList.add(logger);
            logger.effectiveLevelInt = this.effectiveLevelInt;
            return logger;
        }
        throw new IllegalArgumentException("Child name [" + str + " passed as parameter, may not include [" + CoreConstants.DOT + "]");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Logger createChildByName(String str) {
        if (LoggerNameUtil.getSeparatorIndexOf(str, this.name.length() + 1) == -1) {
            if (this.childrenList == null) {
                this.childrenList = new CopyOnWriteArrayList();
            }
            Logger logger = new Logger(str, this, this.loggerContext);
            this.childrenList.add(logger);
            logger.effectiveLevelInt = this.effectiveLevelInt;
            return logger;
        }
        throw new IllegalArgumentException("For logger [" + this.name + "] child name [" + str + " passed as parameter, may not include '.' after index" + (this.name.length() + 1));
    }

    @Override // org.slf4j.Logger
    public void debug(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.DEBUG, str, null, null);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl != null) {
            appenderAttachableImpl.detachAndStopAllAppenders();
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<ILoggingEvent> appender) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return false;
        }
        return appenderAttachableImpl.detachAppender(appender);
    }

    @Override // org.slf4j.Logger
    public void error(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.ERROR, str, null, null);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<ILoggingEvent> getAppender(String str) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return null;
        }
        return appenderAttachableImpl.getAppender(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Logger getChildByName(String str) {
        List<Logger> list = this.childrenList;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Logger logger = this.childrenList.get(i);
            if (str.equals(logger.getName())) {
                return logger;
            }
        }
        return null;
    }

    public Level getEffectiveLevel() {
        return Level.toLevel(this.effectiveLevelInt);
    }

    int getEffectiveLevelInt() {
        return this.effectiveLevelInt;
    }

    public Level getLevel() {
        return this.level;
    }

    public LoggerContext getLoggerContext() {
        return this.loggerContext;
    }

    @Override // org.slf4j.Logger
    public String getName() {
        return this.name;
    }

    @Override // org.slf4j.Logger
    public void info(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.INFO, str, null, null);
    }

    public boolean isAdditive() {
        return this.additive;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<ILoggingEvent> appender) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return false;
        }
        return appenderAttachableImpl.isAttached(appender);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled() {
        return isDebugEnabled(Collections.emptyList());
    }

    public boolean isEnabledFor(Level level) {
        return isEnabledFor(null, level);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ boolean isEnabledForLevel(org.slf4j.event.Level level) {
        return mx5.g(this, level);
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled() {
        return isErrorEnabled(Collections.emptyList());
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled() {
        return isInfoEnabled(Collections.emptyList());
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled() {
        return isTraceEnabled(Collections.emptyList());
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled() {
        return isWarnEnabled(Collections.emptyList());
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<ILoggingEvent>> iteratorForAppenders() {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return Collections.EMPTY_LIST.iterator();
        }
        return appenderAttachableImpl.iteratorForAppenders();
    }

    public void log(List<Marker> list, String str, int i, String str2, Object[] objArr, Throwable th) {
        filterAndLog_0_Or3Plus(str, list, Level.fromLocationAwareLoggerInteger(i), str2, objArr, th);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ LoggingEventBuilder makeLoggingEventBuilder(org.slf4j.event.Level level) {
        return mx5.h(this, level);
    }

    protected Object readResolve() throws ObjectStreamException {
        return LoggerFactory.getLogger(getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void recursiveReset() {
        detachAndStopAllAppenders();
        localLevelReset();
        this.additive = true;
        if (this.childrenList == null) {
            return;
        }
        Iterator it = new CopyOnWriteArrayList(this.childrenList).iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).recursiveReset();
        }
    }

    public void setAdditive(boolean z) {
        this.additive = z;
    }

    public synchronized void setLevel(Level level) {
        try {
            if (this.level == level) {
                return;
            }
            if (level == null && isRootLogger()) {
                throw new IllegalArgumentException("The level of the root logger cannot be set to null");
            }
            this.level = level;
            if (level == null) {
                Logger logger = this.parent;
                this.effectiveLevelInt = logger.effectiveLevelInt;
                level = logger.getEffectiveLevel();
            } else {
                this.effectiveLevelInt = level.levelInt;
            }
            List<Logger> list = this.childrenList;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.childrenList.get(i).handleParentLevelChange(this.effectiveLevelInt);
                }
            }
            this.loggerContext.fireOnLevelChange(this, level);
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        return "Logger[" + this.name + "]";
    }

    @Override // org.slf4j.Logger
    public void trace(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.TRACE, str, null, null);
    }

    @Override // org.slf4j.Logger
    public void warn(String str) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.WARN, str, null, null);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.DEBUG, str, obj, null);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        AppenderAttachableImpl<ILoggingEvent> appenderAttachableImpl = this.aai;
        if (appenderAttachableImpl == null) {
            return false;
        }
        return appenderAttachableImpl.detachAppender(str);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.ERROR, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.INFO, str, obj, null);
    }

    public boolean isDebugEnabled(List<Marker> list) {
        FilterReply callTurboFilters = callTurboFilters(list, Level.DEBUG);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 10000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    public boolean isEnabledFor(List<Marker> list, Level level) {
        FilterReply callTurboFilters = callTurboFilters(list, level);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= level.levelInt;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    public boolean isErrorEnabled(List<Marker> list) {
        FilterReply callTurboFilters = callTurboFilters(list, Level.ERROR);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 40000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    public boolean isInfoEnabled(List<Marker> list) {
        FilterReply callTurboFilters = callTurboFilters(list, Level.INFO);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 20000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    public boolean isTraceEnabled(List<Marker> list) {
        FilterReply callTurboFilters = callTurboFilters(list, Level.TRACE);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 5000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    public boolean isWarnEnabled(List<Marker> list) {
        FilterReply callTurboFilters = callTurboFilters(list, Level.WARN);
        if (callTurboFilters == FilterReply.NEUTRAL) {
            return this.effectiveLevelInt <= 30000;
        } else if (callTurboFilters == FilterReply.DENY) {
            return false;
        } else {
            if (callTurboFilters == FilterReply.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + callTurboFilters);
        }
    }

    @Override // org.slf4j.spi.LocationAwareLogger
    public void log(Marker marker, String str, int i, String str2, Object[] objArr, Throwable th) {
        Level fromLocationAwareLoggerInteger = Level.fromLocationAwareLoggerInteger(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(marker);
        filterAndLog_0_Or3Plus(str, arrayList, fromLocationAwareLoggerInteger, str2, objArr, th);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.TRACE, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj) {
        filterAndLog_1(FQCN, null, Level.WARN, str, obj, null);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.DEBUG, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.ERROR, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.INFO, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled(Collections.singletonList(marker));
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled(Marker marker) {
        return isErrorEnabled(Collections.singletonList(marker));
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled(Marker marker) {
        return isInfoEnabled(Collections.singletonList(marker));
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled(Collections.singletonList(marker));
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled(Marker marker) {
        return isWarnEnabled(Collections.singletonList(marker));
    }

    public void log(org.slf4j.event.LoggingEvent loggingEvent) {
        filterAndLog_0_Or3Plus(FQCN, loggingEvent.getMarkers(), Level.fromLocationAwareLoggerInteger(loggingEvent.getLevel().toInt()), loggingEvent.getMessage(), loggingEvent.getArgumentArray(), loggingEvent.getThrowable());
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.TRACE, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, null, Level.WARN, str, obj, obj2, null);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.DEBUG, str, null, th);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.ERROR, str, null, th);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.INFO, str, null, th);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.TRACE, str, null, th);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.WARN, str, null, th);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.DEBUG, str, objArr, null);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.ERROR, str, objArr, null);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.INFO, str, objArr, null);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.TRACE, str, objArr, null);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, null, Level.WARN, str, objArr, null);
    }

    public void debug(List<Marker> list, String str) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.DEBUG, str, null, null);
    }

    public void error(List<Marker> list, String str) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.ERROR, str, null, null);
    }

    public void info(List<Marker> list, String str) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.INFO, str, null, null);
    }

    public void trace(List<Marker> list, String str) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.TRACE, str, null, null);
    }

    public void warn(List<Marker> list, String str) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.WARN, str, null, null);
    }

    public void debug(List<Marker> list, String str, Object obj) {
        filterAndLog_1(FQCN, list, Level.DEBUG, str, obj, null);
    }

    public void error(List<Marker> list, String str, Object obj) {
        filterAndLog_1(FQCN, list, Level.ERROR, str, obj, null);
    }

    public void info(List<Marker> list, String str, Object obj) {
        filterAndLog_1(FQCN, list, Level.INFO, str, obj, null);
    }

    public void trace(List<Marker> list, String str, Object obj) {
        filterAndLog_1(FQCN, list, Level.TRACE, str, obj, null);
    }

    public void warn(List<Marker> list, String str, Object obj) {
        filterAndLog_1(FQCN, list, Level.WARN, str, obj, null);
    }

    public void debug(List<Marker> list, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, list, Level.DEBUG, str, obj, obj2, null);
    }

    public void error(List<Marker> list, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, list, Level.ERROR, str, obj, obj2, null);
    }

    public void info(List<Marker> list, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, list, Level.INFO, str, obj, obj2, null);
    }

    public void trace(List<Marker> list, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, list, Level.TRACE, str, obj, obj2, null);
    }

    public void warn(List<Marker> list, String str, Object obj, Object obj2) {
        filterAndLog_2(FQCN, list, Level.WARN, str, obj, obj2, null);
    }

    public void debug(List<Marker> list, String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.DEBUG, str, null, th);
    }

    public void error(List<Marker> list, String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.ERROR, str, null, th);
    }

    public void info(List<Marker> list, String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.INFO, str, null, th);
    }

    public void trace(List<Marker> list, String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.TRACE, str, null, th);
    }

    public void warn(List<Marker> list, String str, Throwable th) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.WARN, str, null, th);
    }

    public void debug(List<Marker> list, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.DEBUG, str, objArr, null);
    }

    public void error(List<Marker> list, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.ERROR, str, objArr, null);
    }

    public void info(List<Marker> list, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.INFO, str, objArr, null);
    }

    public void trace(List<Marker> list, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.TRACE, str, objArr, null);
    }

    public void warn(List<Marker> list, String str, Object... objArr) {
        filterAndLog_0_Or3Plus(FQCN, list, Level.WARN, str, objArr, null);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str) {
        debug(Collections.singletonList(marker), str);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str) {
        error(Collections.singletonList(marker), str);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str) {
        info(Collections.singletonList(marker), str);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str) {
        trace(Collections.singletonList(marker), str);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str) {
        warn(Collections.singletonList(marker), str);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj) {
        debug(Collections.singletonList(marker), str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj) {
        error(Collections.singletonList(marker), str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj) {
        info(Collections.singletonList(marker), str, obj);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj) {
        trace(Collections.singletonList(marker), str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj) {
        warn(Collections.singletonList(marker), str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj, Object obj2) {
        debug(Collections.singletonList(marker), str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj, Object obj2) {
        error(Collections.singletonList(marker), str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj, Object obj2) {
        info(Collections.singletonList(marker), str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj, Object obj2) {
        trace(Collections.singletonList(marker), str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj, Object obj2) {
        warn(Collections.singletonList(marker), str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Throwable th) {
        debug(Collections.singletonList(marker), str, th);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Throwable th) {
        error(Collections.singletonList(marker), str, th);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Throwable th) {
        info(Collections.singletonList(marker), str, th);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Throwable th) {
        trace(Collections.singletonList(marker), str, th);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Throwable th) {
        warn(Collections.singletonList(marker), str, th);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object... objArr) {
        debug(Collections.singletonList(marker), str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object... objArr) {
        error(Collections.singletonList(marker), str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object... objArr) {
        info(Collections.singletonList(marker), str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object... objArr) {
        trace(Collections.singletonList(marker), str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object... objArr) {
        warn(Collections.singletonList(marker), str, objArr);
    }
}
