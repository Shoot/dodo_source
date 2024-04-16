package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.slf4j.spi.LoggingEventBuilder;
/* loaded from: classes3.dex */
abstract class NamedLoggerBase implements Logger, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

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
    public /* synthetic */ LoggingEventBuilder atLevel(Level level) {
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

    @Override // org.slf4j.Logger
    public String getName() {
        return this.name;
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ boolean isEnabledForLevel(Level level) {
        return mx5.g(this, level);
    }

    @Override // org.slf4j.Logger
    public /* synthetic */ LoggingEventBuilder makeLoggingEventBuilder(Level level) {
        return mx5.h(this, level);
    }

    protected Object readResolve() throws ObjectStreamException {
        return LoggerFactory.getLogger(getName());
    }
}
