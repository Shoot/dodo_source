package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.Status;
import java.util.List;
/* loaded from: classes.dex */
public abstract class DynamicConverter<E> extends FormattingConverter<E> implements LifeCycle, ContextAware {
    private List<String> optionList;
    ContextAwareBase cab = new ContextAwareBase(this);
    protected boolean started = false;

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str) {
        this.cab.addError(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str) {
        this.cab.addInfo(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addStatus(Status status) {
        this.cab.addStatus(status);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str) {
        this.cab.addWarn(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public Context getContext() {
        return this.cab.getContext();
    }

    public String getFirstOption() {
        List<String> list = this.optionList;
        if (list != null && list.size() != 0) {
            return this.optionList.get(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<String> getOptionList() {
        return this.optionList;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void setContext(Context context) {
        this.cab.setContext(context);
    }

    public void setOptionList(List<String> list) {
        this.optionList = list;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str, Throwable th) {
        this.cab.addError(str, th);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str, Throwable th) {
        this.cab.addInfo(str, th);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str, Throwable th) {
        this.cab.addWarn(str, th);
    }
}
