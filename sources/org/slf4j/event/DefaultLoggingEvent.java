package org.slf4j.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.Marker;
/* loaded from: classes3.dex */
public class DefaultLoggingEvent implements LoggingEvent {
    List<Object> arguments;
    String callerBoundary;
    List<KeyValuePair> keyValuePairs;
    Level level;
    Logger logger;
    List<Marker> markers;
    String message;
    String threadName;
    Throwable throwable;
    long timeStamp;

    public DefaultLoggingEvent(Level level, Logger logger) {
        this.logger = logger;
        this.level = level;
    }

    private List<Object> getNonNullArguments() {
        if (this.arguments == null) {
            this.arguments = new ArrayList(3);
        }
        return this.arguments;
    }

    private List<KeyValuePair> getNonnullKeyValuePairs() {
        if (this.keyValuePairs == null) {
            this.keyValuePairs = new ArrayList(4);
        }
        return this.keyValuePairs;
    }

    public void addArgument(Object obj) {
        getNonNullArguments().add(obj);
    }

    public void addArguments(Object... objArr) {
        getNonNullArguments().addAll(Arrays.asList(objArr));
    }

    public void addKeyValue(String str, Object obj) {
        getNonnullKeyValuePairs().add(new KeyValuePair(str, obj));
    }

    public void addMarker(Marker marker) {
        if (this.markers == null) {
            this.markers = new ArrayList(2);
        }
        this.markers.add(marker);
    }

    @Override // org.slf4j.event.LoggingEvent
    public Object[] getArgumentArray() {
        List<Object> list = this.arguments;
        if (list == null) {
            return null;
        }
        return list.toArray();
    }

    @Override // org.slf4j.event.LoggingEvent
    public List<Object> getArguments() {
        return this.arguments;
    }

    @Override // org.slf4j.event.LoggingEvent
    public String getCallerBoundary() {
        return this.callerBoundary;
    }

    @Override // org.slf4j.event.LoggingEvent
    public List<KeyValuePair> getKeyValuePairs() {
        return this.keyValuePairs;
    }

    @Override // org.slf4j.event.LoggingEvent
    public Level getLevel() {
        return this.level;
    }

    @Override // org.slf4j.event.LoggingEvent
    public String getLoggerName() {
        return this.logger.getName();
    }

    @Override // org.slf4j.event.LoggingEvent
    public List<Marker> getMarkers() {
        return this.markers;
    }

    @Override // org.slf4j.event.LoggingEvent
    public String getMessage() {
        return this.message;
    }

    @Override // org.slf4j.event.LoggingEvent
    public String getThreadName() {
        return this.threadName;
    }

    @Override // org.slf4j.event.LoggingEvent
    public Throwable getThrowable() {
        return this.throwable;
    }

    @Override // org.slf4j.event.LoggingEvent
    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setCallerBoundary(String str) {
        this.callerBoundary = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setThrowable(Throwable th) {
        this.throwable = th;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }
}
