package com.inappstory.sdk.stories.statistic;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes3.dex */
public class ProfilingTask {
    long endTime;
    boolean isAllowToForceSend;
    boolean isReady;
    String name;
    String sessionId;
    long startTime;
    String uniqueHash;
    String userId;

    public String toString() {
        return "ProfilingTask{uniqueHash='" + this.uniqueHash + CoreConstants.SINGLE_QUOTE_CHAR + ", name='" + this.name + CoreConstants.SINGLE_QUOTE_CHAR + ", endTime=" + this.endTime + CoreConstants.CURLY_RIGHT;
    }
}
