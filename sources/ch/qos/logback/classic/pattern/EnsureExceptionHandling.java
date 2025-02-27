package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.PostCompileProcessor;
/* loaded from: classes.dex */
public class EnsureExceptionHandling implements PostCompileProcessor<ILoggingEvent> {
    public boolean chainHandlesThrowable(Converter<ILoggingEvent> converter) {
        while (converter != null) {
            if (converter instanceof ThrowableHandlingConverter) {
                return true;
            }
            converter = converter.getNext();
        }
        return false;
    }

    @Override // ch.qos.logback.core.pattern.PostCompileProcessor
    public void process(Context context, Converter<ILoggingEvent> converter) {
        Converter throwableProxyConverter;
        if (converter != null) {
            if (!chainHandlesThrowable(converter)) {
                Converter findTail = ConverterUtil.findTail(converter);
                if (((LoggerContext) context).isPackagingDataEnabled()) {
                    throwableProxyConverter = new ExtendedThrowableProxyConverter();
                } else {
                    throwableProxyConverter = new ThrowableProxyConverter();
                }
                findTail.setNext(throwableProxyConverter);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("cannot process empty chain");
    }
}
