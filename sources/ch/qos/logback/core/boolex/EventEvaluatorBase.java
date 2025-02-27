package ch.qos.logback.core.boolex;

import ch.qos.logback.core.spi.ContextAwareBase;
/* loaded from: classes.dex */
public abstract class EventEvaluatorBase<E> extends ContextAwareBase implements EventEvaluator<E> {
    String name;
    boolean started;

    @Override // ch.qos.logback.core.boolex.EventEvaluator
    public String getName() {
        return this.name;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.boolex.EventEvaluator
    public void setName(String str) {
        if (this.name == null) {
            this.name = str;
            return;
        }
        throw new IllegalStateException("name has been already set");
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.started = true;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.started = false;
    }
}
