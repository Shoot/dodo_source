package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.classic.spi.ILoggingEvent;
/* loaded from: classes.dex */
public class ClassOfCallerConverter extends NamedConverter {
    @Override // ch.qos.logback.classic.pattern.NamedConverter
    protected String getFullyQualifiedName(ILoggingEvent iLoggingEvent) {
        StackTraceElement[] callerData = iLoggingEvent.getCallerData();
        if (callerData != null && callerData.length > 0) {
            return callerData[0].getClassName();
        }
        return CallerData.NA;
    }
}
