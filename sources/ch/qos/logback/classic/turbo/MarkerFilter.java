package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import java.util.List;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
/* loaded from: classes.dex */
public class MarkerFilter extends MatchingFilter {
    Marker markerToMatch;

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(List<Marker> list, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        if (!isStarted()) {
            return FilterReply.NEUTRAL;
        }
        if (list == null) {
            return this.onMismatch;
        }
        for (Marker marker : list) {
            if (marker.contains(this.markerToMatch)) {
                return this.onMatch;
            }
        }
        return this.onMismatch;
    }

    public void setMarker(String str) {
        if (str != null) {
            this.markerToMatch = MarkerFactory.getMarker(str);
        }
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.markerToMatch != null) {
            super.start();
            return;
        }
        addError("The marker property must be set for [" + getName() + "]");
    }
}
