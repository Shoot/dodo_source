package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.spi.DeferredProcessingAware;
import java.util.List;
import java.util.Map;
import org.slf4j.Marker;
/* loaded from: classes.dex */
public interface ILoggingEvent extends DeferredProcessingAware {
    Object[] getArgumentArray();

    StackTraceElement[] getCallerData();

    String getFormattedMessage();

    Level getLevel();

    LoggerContextVO getLoggerContextVO();

    String getLoggerName();

    Map<String, String> getMDCPropertyMap();

    List<Marker> getMarkers();

    Map<String, String> getMdc();

    String getMessage();

    String getThreadName();

    IThrowableProxy getThrowableProxy();

    long getTimeStamp();

    boolean hasCallerData();

    @Override // ch.qos.logback.core.spi.DeferredProcessingAware
    void prepareForDeferredProcessing();
}
