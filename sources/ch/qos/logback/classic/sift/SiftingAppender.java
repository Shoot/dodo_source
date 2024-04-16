package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.ClassicConstants;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.joran.spi.DefaultClass;
import ch.qos.logback.core.sift.Discriminator;
import ch.qos.logback.core.sift.SiftingAppenderBase;
import java.util.List;
import org.slf4j.Marker;
/* loaded from: classes.dex */
public class SiftingAppender extends SiftingAppenderBase<ILoggingEvent> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ch.qos.logback.core.sift.SiftingAppenderBase
    public boolean eventMarksEndOfLife(ILoggingEvent iLoggingEvent) {
        List<Marker> markers = iLoggingEvent.getMarkers();
        if (markers == null) {
            return false;
        }
        for (Marker marker : markers) {
            if (marker.contains(ClassicConstants.FINALIZE_SESSION_MARKER)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ch.qos.logback.core.sift.SiftingAppenderBase
    public long getTimestamp(ILoggingEvent iLoggingEvent) {
        return iLoggingEvent.getTimeStamp();
    }

    @Override // ch.qos.logback.core.sift.SiftingAppenderBase
    @DefaultClass(MDCBasedDiscriminator.class)
    public void setDiscriminator(Discriminator<ILoggingEvent> discriminator) {
        super.setDiscriminator(discriminator);
    }
}
