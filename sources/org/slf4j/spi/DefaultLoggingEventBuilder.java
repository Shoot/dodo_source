package org.slf4j.spi;

import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.DefaultLoggingEvent;
import org.slf4j.event.KeyValuePair;
import org.slf4j.event.Level;
import org.slf4j.event.LoggingEvent;
/* loaded from: classes3.dex */
public class DefaultLoggingEventBuilder implements LoggingEventBuilder, CallerBoundaryAware {
    static String DLEB_FQCN = "org.slf4j.spi.DefaultLoggingEventBuilder";
    protected Logger logger;
    protected DefaultLoggingEvent loggingEvent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.slf4j.spi.DefaultLoggingEventBuilder$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$slf4j$event$Level;

        static {
            int[] iArr = new int[Level.values().length];
            $SwitchMap$org$slf4j$event$Level = iArr;
            try {
                iArr[Level.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$slf4j$event$Level[Level.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$slf4j$event$Level[Level.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$slf4j$event$Level[Level.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$slf4j$event$Level[Level.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public DefaultLoggingEventBuilder(Logger logger, Level level) {
        this.logger = logger;
        this.loggingEvent = new DefaultLoggingEvent(level, logger);
    }

    private void logViaPublicSLF4JLoggerAPI(LoggingEvent loggingEvent) {
        int length;
        int i;
        Object[] argumentArray = loggingEvent.getArgumentArray();
        if (argumentArray == null) {
            length = 0;
        } else {
            length = argumentArray.length;
        }
        Throwable throwable = loggingEvent.getThrowable();
        if (throwable == null) {
            i = 0;
        } else {
            i = 1;
        }
        String message = loggingEvent.getMessage();
        Object[] objArr = new Object[i + length];
        if (argumentArray != null) {
            System.arraycopy(argumentArray, 0, objArr, 0, length);
        }
        if (throwable != null) {
            objArr[length] = throwable;
        }
        String mergeMarkersAndKeyValuePairs = mergeMarkersAndKeyValuePairs(loggingEvent, message);
        int i2 = AnonymousClass1.$SwitchMap$org$slf4j$event$Level[loggingEvent.getLevel().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            this.logger.error(mergeMarkersAndKeyValuePairs, objArr);
                            return;
                        }
                        return;
                    }
                    this.logger.warn(mergeMarkersAndKeyValuePairs, objArr);
                    return;
                }
                this.logger.info(mergeMarkersAndKeyValuePairs, objArr);
                return;
            }
            this.logger.debug(mergeMarkersAndKeyValuePairs, objArr);
            return;
        }
        this.logger.trace(mergeMarkersAndKeyValuePairs, objArr);
    }

    private String mergeMarkersAndKeyValuePairs(LoggingEvent loggingEvent, String str) {
        StringBuilder sb;
        if (loggingEvent.getMarkers() != null) {
            sb = new StringBuilder();
            for (Marker marker : loggingEvent.getMarkers()) {
                sb.append(marker);
                sb.append(' ');
            }
        } else {
            sb = null;
        }
        if (loggingEvent.getKeyValuePairs() != null) {
            if (sb == null) {
                sb = new StringBuilder();
            }
            for (KeyValuePair keyValuePair : loggingEvent.getKeyValuePairs()) {
                sb.append(keyValuePair.key);
                sb.append('=');
                sb.append(keyValuePair.value);
                sb.append(' ');
            }
        }
        if (sb != null) {
            sb.append(str);
            return sb.toString();
        }
        return str;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addArgument(Object obj) {
        this.loggingEvent.addArgument(obj);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addKeyValue(String str, Object obj) {
        this.loggingEvent.addKeyValue(str, obj);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addMarker(Marker marker) {
        this.loggingEvent.addMarker(marker);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log() {
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.CallerBoundaryAware
    public void setCallerBoundary(String str) {
        this.loggingEvent.setCallerBoundary(str);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder setCause(Throwable th) {
        this.loggingEvent.setThrowable(th);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder setMessage(String str) {
        this.loggingEvent.setMessage(str);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addArgument(Supplier<?> supplier) {
        Object obj;
        DefaultLoggingEvent defaultLoggingEvent = this.loggingEvent;
        obj = supplier.get();
        defaultLoggingEvent.addArgument(obj);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder addKeyValue(String str, Supplier<Object> supplier) {
        Object obj;
        DefaultLoggingEvent defaultLoggingEvent = this.loggingEvent;
        obj = supplier.get();
        defaultLoggingEvent.addKeyValue(str, obj);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(String str) {
        this.loggingEvent.setMessage(str);
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public LoggingEventBuilder setMessage(Supplier<String> supplier) {
        Object obj;
        DefaultLoggingEvent defaultLoggingEvent = this.loggingEvent;
        obj = supplier.get();
        defaultLoggingEvent.setMessage((String) obj);
        return this;
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(String str, Object obj) {
        this.loggingEvent.setMessage(str);
        this.loggingEvent.addArgument(obj);
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(String str, Object obj, Object obj2) {
        this.loggingEvent.setMessage(str);
        this.loggingEvent.addArgument(obj);
        this.loggingEvent.addArgument(obj2);
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(String str, Object... objArr) {
        this.loggingEvent.setMessage(str);
        this.loggingEvent.addArguments(objArr);
        log(this.loggingEvent);
    }

    @Override // org.slf4j.spi.LoggingEventBuilder
    public void log(Supplier<String> supplier) {
        Object obj;
        if (supplier != null) {
            obj = supplier.get();
            log((String) obj);
            return;
        }
        log((String) null);
    }

    protected void log(LoggingEvent loggingEvent) {
        setCallerBoundary(DLEB_FQCN);
        Logger logger = this.logger;
        if (logger instanceof LoggingEventAware) {
            ((LoggingEventAware) logger).log(loggingEvent);
        } else {
            logViaPublicSLF4JLoggerAPI(loggingEvent);
        }
    }
}
