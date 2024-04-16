package com.inappstory.sdk.stories.statistic;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.network.SerializedName;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.api.models.PhoneAppData;
/* loaded from: classes3.dex */
public class StatisticTask {
    public PhoneAppData app;
    @SerializedName(c.a)
    public String cause;
    @SerializedName(DateTokenConverter.CONVERTER_KEY)
    public Long durationMs;
    public String event;
    @SerializedName("f")
    public String feedId;
    public boolean isFake;
    @SerializedName("li")
    public Integer layoutIndex;
    @SerializedName(Image.TYPE_MEDIUM)
    public Integer mode;
    @SerializedName(Image.TYPE_SMALL)
    public String sessionId;
    @SerializedName("si")
    public Integer slideIndex;
    @SerializedName("st")
    public Integer slideTotal;
    @SerializedName("i")
    public String storyId;
    @SerializedName("t")
    public String target;
    @SerializedName("ts")
    public Long timestamp;
    @SerializedName("u")
    public String userId;
    @SerializedName("w")
    public String whence;
    @SerializedName("wa")
    public Integer widgetAnswer;
    @SerializedName("wal")
    public String widgetAnswerLabel;
    @SerializedName("was")
    public Integer widgetAnswerScore;
    @SerializedName("wi")
    public String widgetId;
    @SerializedName("wl")
    public String widgetLabel;
    @SerializedName("wv")
    public String widgetValue;
}
