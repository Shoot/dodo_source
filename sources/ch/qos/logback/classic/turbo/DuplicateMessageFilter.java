package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import java.util.List;
import org.slf4j.Marker;
/* loaded from: classes.dex */
public class DuplicateMessageFilter extends TurboFilter {
    public static final int DEFAULT_ALLOWED_REPETITIONS = 5;
    public static final int DEFAULT_CACHE_SIZE = 100;
    public int allowedRepetitions = 5;
    public int cacheSize = 100;
    private LRUMessageCache msgCache;

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(List<Marker> list, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        if (this.msgCache.getMessageCountAndThenIncrement(str) <= this.allowedRepetitions) {
            return FilterReply.NEUTRAL;
        }
        return FilterReply.DENY;
    }

    public int getAllowedRepetitions() {
        return this.allowedRepetitions;
    }

    public int getCacheSize() {
        return this.cacheSize;
    }

    public void setAllowedRepetitions(int i) {
        this.allowedRepetitions = i;
    }

    public void setCacheSize(int i) {
        this.cacheSize = i;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.msgCache = new LRUMessageCache(this.cacheSize);
        super.start();
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.msgCache.clear();
        this.msgCache = null;
        super.stop();
    }
}
