package org.slf4j.impl;

import ch.qos.logback.classic.LoggerContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
/* loaded from: classes3.dex */
public class LoggerFactory implements ILoggerFactory {
    ConcurrentMap<String, Logger> loggerMap = new ConcurrentHashMap();
    LoggerContext loggerContext = new LoggerContext();

    @Override // org.slf4j.ILoggerFactory
    public Logger getLogger(String str) {
        Logger logger = this.loggerMap.get(str);
        if (logger != null) {
            return logger;
        }
        ch.qos.logback.classic.Logger logger2 = this.loggerContext.getLogger(str);
        Logger putIfAbsent = this.loggerMap.putIfAbsent(str, logger2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return logger2;
    }
}
