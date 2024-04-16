package com.inappstory.sdk.stories.api.models;

import com.inappstory.sdk.network.SerializedName;
/* loaded from: classes3.dex */
public class PayloadObject {
    @SerializedName("event_type")
    public String eventType;
    public String payload;
    @SerializedName("slide_index")
    public int slideIndex;

    String getEventType() {
        String str = this.eventType;
        if (str != null) {
            return str;
        }
        return "";
    }

    public String getPayload() {
        return this.payload;
    }
}
