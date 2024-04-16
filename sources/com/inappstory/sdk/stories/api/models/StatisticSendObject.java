package com.inappstory.sdk.stories.api.models;

import com.inappstory.sdk.network.SerializedName;
import java.util.List;
/* loaded from: classes3.dex */
public class StatisticSendObject {
    public List<List<Object>> data;
    @SerializedName("session_id")
    public String sessionId;

    public StatisticSendObject(String str, List<List<Object>> list) {
        this.sessionId = str;
        this.data = list;
    }
}
