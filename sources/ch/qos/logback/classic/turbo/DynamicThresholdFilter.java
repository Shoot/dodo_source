package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.MDC;
import org.slf4j.Marker;
/* loaded from: classes.dex */
public class DynamicThresholdFilter extends TurboFilter {
    private String key;
    private Map<String, Level> valueLevelMap = new HashMap();
    private Level defaultThreshold = Level.ERROR;
    private FilterReply onHigherOrEqual = FilterReply.NEUTRAL;
    private FilterReply onLower = FilterReply.DENY;

    public void addMDCValueLevelPair(MDCValueLevelPair mDCValueLevelPair) {
        if (this.valueLevelMap.containsKey(mDCValueLevelPair.getValue())) {
            addError(mDCValueLevelPair.getValue() + " has been already set");
            return;
        }
        this.valueLevelMap.put(mDCValueLevelPair.getValue(), mDCValueLevelPair.getLevel());
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(List<Marker> list, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        Level level2;
        String str2 = MDC.get(this.key);
        if (!isStarted()) {
            return FilterReply.NEUTRAL;
        }
        if (str2 != null) {
            level2 = this.valueLevelMap.get(str2);
        } else {
            level2 = null;
        }
        if (level2 == null) {
            level2 = this.defaultThreshold;
        }
        if (level.isGreaterOrEqual(level2)) {
            return this.onHigherOrEqual;
        }
        return this.onLower;
    }

    public Level getDefaultThreshold() {
        return this.defaultThreshold;
    }

    public String getKey() {
        return this.key;
    }

    public FilterReply getOnHigherOrEqual() {
        return this.onHigherOrEqual;
    }

    public FilterReply getOnLower() {
        return this.onLower;
    }

    public void setDefaultThreshold(Level level) {
        this.defaultThreshold = level;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setOnHigherOrEqual(FilterReply filterReply) {
        this.onHigherOrEqual = filterReply;
    }

    public void setOnLower(FilterReply filterReply) {
        this.onLower = filterReply;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.key == null) {
            addError("No key name was specified");
        }
        super.start();
    }
}
