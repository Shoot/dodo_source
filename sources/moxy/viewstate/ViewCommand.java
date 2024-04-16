package moxy.viewstate;

import moxy.MvpView;
import moxy.viewstate.strategy.StateStrategy;
/* loaded from: classes3.dex */
public abstract class ViewCommand<View extends MvpView> {
    private final Class<? extends StateStrategy> stateStrategyType;
    private final String tag;

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewCommand(String str, Class<? extends StateStrategy> cls) {
        this.tag = str;
        this.stateStrategyType = cls;
    }

    public abstract void apply(View view);

    public Class<? extends StateStrategy> getStrategyType() {
        return this.stateStrategyType;
    }

    public String getTag() {
        return this.tag;
    }
}
