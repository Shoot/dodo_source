package ch.qos.logback.classic.boolex;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluatorBase;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Marker;
/* loaded from: classes.dex */
public class OnMarkerEvaluator extends EventEvaluatorBase<ILoggingEvent> {
    List<String> markerList = new ArrayList();

    public void addMarker(String str) {
        this.markerList.add(str);
    }

    @Override // ch.qos.logback.core.boolex.EventEvaluator
    public boolean evaluate(ILoggingEvent iLoggingEvent) throws NullPointerException, EvaluationException {
        List<Marker> markers = iLoggingEvent.getMarkers();
        if (markers != null && !markers.isEmpty()) {
            for (String str : this.markerList) {
                for (Marker marker : markers) {
                    if (marker.contains(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
