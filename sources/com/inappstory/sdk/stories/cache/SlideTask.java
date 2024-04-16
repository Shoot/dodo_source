package com.inappstory.sdk.stories.cache;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class SlideTask {
    int priority = 0;
    List<String> urls = new ArrayList();
    List<UrlWithAlter> urlsWithAlter = new ArrayList();
    List<String> videoUrls = new ArrayList();
    int loadType = 0;

    public String toString() {
        return "SlideTask{, loadType=" + this.loadType + CoreConstants.CURLY_RIGHT;
    }
}
