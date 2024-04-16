package com.inappstory.sdk.stories.api.models.logs;
/* loaded from: classes3.dex */
public class WebConsoleLog {
    public String id;
    public int lineNumber;
    public String logType;
    public String message;
    public int slideIndex;
    public String sourceId;
    public String storyId;
    public long timestamp;

    public WebConsoleLog(long j, String str, String str2, int i, String str3, String str4, String str5, int i2) {
        this.timestamp = j;
        this.logType = str;
        this.storyId = str2;
        this.slideIndex = i;
        this.id = str3;
        this.message = str4;
        this.sourceId = str5;
        this.lineNumber = i2;
    }

    public WebConsoleLog() {
    }
}
