package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.LogbackMDCAdapter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.slf4j.helpers.MessageFormatter;
import org.slf4j.spi.MDCAdapter;
/* loaded from: classes.dex */
public class LoggingEvent implements ILoggingEvent {
    private transient Object[] argumentArray;
    private StackTraceElement[] callerDataArray;
    transient String formattedMessage;
    transient String fqnOfLoggerClass;
    private transient Level level;
    private LoggerContext loggerContext;
    private LoggerContextVO loggerContextVO;
    private String loggerName;
    private List<Marker> markers;
    private Map<String, String> mdcPropertyMap;
    private String message;
    private String threadName;
    private ThrowableProxy throwableProxy;
    private long timeStamp;

    public LoggingEvent() {
    }

    public LoggingEvent(String str, Logger logger, Level level, String str2, Throwable th, Object[] objArr) {
        this.fqnOfLoggerClass = str;
        this.loggerName = logger.getName();
        LoggerContext loggerContext = logger.getLoggerContext();
        this.loggerContext = loggerContext;
        this.loggerContextVO = loggerContext.getLoggerContextRemoteView();
        this.level = level;
        this.message = str2;
        this.argumentArray = objArr;
        th = th == null ? extractThrowableAnRearrangeArguments(objArr) : th;
        if (th != null) {
            this.throwableProxy = new ThrowableProxy(th);
            if (logger.getLoggerContext().isPackagingDataEnabled()) {
                this.throwableProxy.calculatePackagingData();
            }
        }
        this.timeStamp = System.currentTimeMillis();
    }

    private Throwable extractThrowableAnRearrangeArguments(Object[] objArr) {
        Throwable extractThrowable = EventArgUtil.extractThrowable(objArr);
        if (EventArgUtil.successfulExtraction(extractThrowable)) {
            this.argumentArray = EventArgUtil.trimmedCopy(objArr);
        }
        return extractThrowable;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        throw new UnsupportedOperationException(getClass() + " does not support serialization. Use LoggerEventVO instance instead. See also LoggerEventVO.build method.");
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Object[] getArgumentArray() {
        return this.argumentArray;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public StackTraceElement[] getCallerData() {
        if (this.callerDataArray == null) {
            this.callerDataArray = CallerData.extract(new Throwable(), this.fqnOfLoggerClass, this.loggerContext.getMaxCallerDataDepth(), this.loggerContext.getFrameworkPackages());
        }
        return this.callerDataArray;
    }

    public long getContextBirthTime() {
        return this.loggerContextVO.getBirthTime();
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getFormattedMessage() {
        String str;
        String str2 = this.formattedMessage;
        if (str2 != null) {
            return str2;
        }
        Object[] objArr = this.argumentArray;
        if (objArr != null) {
            str = MessageFormatter.arrayFormat(this.message, objArr).getMessage();
        } else {
            str = this.message;
        }
        this.formattedMessage = str;
        return this.formattedMessage;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Level getLevel() {
        return this.level;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public LoggerContextVO getLoggerContextVO() {
        return this.loggerContextVO;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getLoggerName() {
        return this.loggerName;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Map<String, String> getMDCPropertyMap() {
        Map<String, String> copyOfContextMap;
        if (this.mdcPropertyMap == null) {
            MDCAdapter mDCAdapter = MDC.getMDCAdapter();
            if (mDCAdapter instanceof LogbackMDCAdapter) {
                copyOfContextMap = ((LogbackMDCAdapter) mDCAdapter).getPropertyMap();
            } else {
                copyOfContextMap = mDCAdapter.getCopyOfContextMap();
            }
            this.mdcPropertyMap = copyOfContextMap;
        }
        if (this.mdcPropertyMap == null) {
            this.mdcPropertyMap = Collections.emptyMap();
        }
        return this.mdcPropertyMap;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public List<Marker> getMarkers() {
        return this.markers;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Map<String, String> getMdc() {
        return getMDCPropertyMap();
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getMessage() {
        return this.message;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getThreadName() {
        if (this.threadName == null) {
            this.threadName = Thread.currentThread().getName();
        }
        return this.threadName;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public IThrowableProxy getThrowableProxy() {
        return this.throwableProxy;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public long getTimeStamp() {
        return this.timeStamp;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public boolean hasCallerData() {
        if (this.callerDataArray != null) {
            return true;
        }
        return false;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent, ch.qos.logback.core.spi.DeferredProcessingAware
    public void prepareForDeferredProcessing() {
        getFormattedMessage();
        getThreadName();
        getMDCPropertyMap();
    }

    public void setArgumentArray(Object[] objArr) {
        if (this.argumentArray == null) {
            this.argumentArray = objArr;
            return;
        }
        throw new IllegalStateException("argArray has been already set");
    }

    public void setCallerData(StackTraceElement[] stackTraceElementArr) {
        this.callerDataArray = stackTraceElementArr;
    }

    public void setLevel(Level level) {
        if (this.level == null) {
            this.level = level;
            return;
        }
        throw new IllegalStateException("The level has been already set for this event.");
    }

    public void setLoggerContextRemoteView(LoggerContextVO loggerContextVO) {
        this.loggerContextVO = loggerContextVO;
    }

    public void setLoggerName(String str) {
        this.loggerName = str;
    }

    public void setMDCPropertyMap(Map<String, String> map) {
        if (this.mdcPropertyMap == null) {
            this.mdcPropertyMap = map;
            return;
        }
        throw new IllegalStateException("The MDCPropertyMap has been already set for this event.");
    }

    public void setMarkers(List<Marker> list) {
        if (this.markers == null) {
            this.markers = list;
            return;
        }
        throw new IllegalStateException("The marker has been already set for this event.");
    }

    public void setMessage(String str) {
        if (this.message == null) {
            this.message = str;
            return;
        }
        throw new IllegalStateException("The message for this event has been set already.");
    }

    public void setThreadName(String str) throws IllegalStateException {
        if (this.threadName == null) {
            this.threadName = str;
            return;
        }
        throw new IllegalStateException("threadName has been already set");
    }

    public void setThrowableProxy(ThrowableProxy throwableProxy) {
        if (this.throwableProxy == null) {
            this.throwableProxy = throwableProxy;
            return;
        }
        throw new IllegalStateException("ThrowableProxy has been already set.");
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public String toString() {
        return '[' + this.level + "] " + getFormattedMessage();
    }
}
