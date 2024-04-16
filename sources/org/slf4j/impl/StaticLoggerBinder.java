package org.slf4j.impl;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.classic.util.ContextSelectorStaticBinder;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.StatusUtil;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;
/* loaded from: classes3.dex */
public class StaticLoggerBinder implements SLF4JServiceProvider {
    private static Object KEY = null;
    static final String NULL_CS_URL = "http://logback.qos.ch/codes.html#null_CS";
    private static StaticLoggerBinder SINGLETON;
    private boolean initialized = false;
    private LoggerContext defaultLoggerContext = new LoggerContext();
    private final ContextSelectorStaticBinder contextSelectorBinder = ContextSelectorStaticBinder.getSingleton();

    static {
        StaticLoggerBinder staticLoggerBinder = new StaticLoggerBinder();
        SINGLETON = staticLoggerBinder;
        KEY = new Object();
        staticLoggerBinder.initialize();
    }

    private StaticLoggerBinder() {
        this.defaultLoggerContext.setName("default");
    }

    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    static void reset() {
        StaticLoggerBinder staticLoggerBinder = new StaticLoggerBinder();
        SINGLETON = staticLoggerBinder;
        staticLoggerBinder.initialize();
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public ILoggerFactory getLoggerFactory() {
        if (!this.initialized) {
            return this.defaultLoggerContext;
        }
        if (this.contextSelectorBinder.getContextSelector() != null) {
            return this.contextSelectorBinder.getContextSelector().getLoggerContext();
        }
        throw new IllegalStateException("contextSelector cannot be null. See also http://logback.qos.ch/codes.html#null_CS");
    }

    public String getLoggerFactoryClassStr() {
        return this.contextSelectorBinder.getClass().getName();
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public MDCAdapter getMDCAdapter() {
        return StaticMDCBinder.SINGLETON.getMDCA();
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public IMarkerFactory getMarkerFactory() {
        return StaticMarkerBinder.SINGLETON.getMarkerFactory();
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public String getRequestedApiVersion() {
        return LoggerServiceProvider.REQUESTED_API_VERSION;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public void initialize() {
        try {
            try {
                new ContextInitializer(this.defaultLoggerContext).autoConfig();
            } catch (JoranException e) {
                Util.report("Failed to auto configure default logger context", e);
            }
            if (!StatusUtil.contextHasStatusListener(this.defaultLoggerContext)) {
                StatusPrinter.printInCaseOfErrorsOrWarnings(this.defaultLoggerContext);
            }
            this.contextSelectorBinder.init(this.defaultLoggerContext, KEY);
            this.initialized = true;
        } catch (Exception e2) {
            Util.report("Failed to instantiate [" + LoggerContext.class.getName() + "]", e2);
        }
    }
}
