package ch.qos.logback.classic.net;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
/* loaded from: classes.dex */
public abstract class ReceiverBase extends ContextAwareBase implements LifeCycle {
    private boolean started;

    protected abstract Runnable getRunnableTask();

    @Override // ch.qos.logback.core.spi.LifeCycle
    public final boolean isStarted() {
        return this.started;
    }

    protected abstract void onStop();

    protected abstract boolean shouldStart();

    @Override // ch.qos.logback.core.spi.LifeCycle
    public final void start() {
        if (isStarted()) {
            return;
        }
        if (getContext() != null) {
            if (shouldStart()) {
                getContext().getScheduledExecutorService().execute(getRunnableTask());
                this.started = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("context not set");
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public final void stop() {
        if (!isStarted()) {
            return;
        }
        try {
            onStop();
        } catch (RuntimeException e) {
            addError("on stop: " + e, e);
        }
        this.started = false;
    }
}
