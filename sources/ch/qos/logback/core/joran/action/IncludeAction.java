package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
/* loaded from: classes.dex */
public class IncludeAction extends AbstractIncludeAction {
    private static final String CONFIG_TAG = "configuration";
    private static final String INCLUDED_TAG = "included";
    private int eventOffset = 2;

    private String getEventName(SaxEvent saxEvent) {
        if (saxEvent.qName.length() > 0) {
            return saxEvent.qName;
        }
        return saxEvent.localName;
    }

    private InputStream openURL(URL url) {
        try {
            return FirebasePerfUrlConnection.openStream(url);
        } catch (IOException e) {
            optionalWarning("Failed to open [" + url.toString() + "]", e);
            return null;
        }
    }

    private void trimHeadAndTail(SaxEventRecorder saxEventRecorder) {
        boolean z;
        boolean z2;
        int i;
        SaxEvent saxEvent;
        List<SaxEvent> saxEventList = saxEventRecorder.getSaxEventList();
        if (saxEventList.size() == 0) {
            return;
        }
        SaxEvent saxEvent2 = saxEventList.get(0);
        if (saxEvent2 != null) {
            String eventName = getEventName(saxEvent2);
            z2 = INCLUDED_TAG.equalsIgnoreCase(eventName);
            z = CONFIG_TAG.equalsIgnoreCase(eventName);
        } else {
            z = false;
            z2 = false;
        }
        if (z2 || z) {
            saxEventList.remove(0);
            int size = saxEventList.size();
            if (size != 0 && (saxEvent = saxEventList.get(size - 1)) != null) {
                String eventName2 = getEventName(saxEvent);
                if ((z2 && INCLUDED_TAG.equalsIgnoreCase(eventName2)) || (z && CONFIG_TAG.equalsIgnoreCase(eventName2))) {
                    saxEventList.remove(i);
                }
            }
        }
    }

    protected SaxEventRecorder createRecorder(InputStream inputStream, URL url) {
        return new SaxEventRecorder(getContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction
    public void processInclude(InterpretationContext interpretationContext, URL url) throws JoranException {
        InputStream openURL = openURL(url);
        try {
            if (openURL != null) {
                try {
                    ConfigurationWatchListUtil.addToWatchList(getContext(), url);
                    SaxEventRecorder createRecorder = createRecorder(openURL, url);
                    createRecorder.setContext(getContext());
                    createRecorder.recordEvents(openURL);
                    trimHeadAndTail(createRecorder);
                    interpretationContext.getJoranInterpreter().getEventPlayer().addEventsDynamically(createRecorder.getSaxEventList(), this.eventOffset);
                } catch (JoranException e) {
                    optionalWarning("Failed processing [" + url.toString() + "]", e);
                }
            }
        } finally {
            close(openURL);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setEventOffset(int i) {
        this.eventOffset = i;
    }
}
