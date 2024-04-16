package com.inappstory.sdk.stories.api.models;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.network.SerializedName;
/* loaded from: classes3.dex */
public class ShareObject {
    @SerializedName("description")
    String description;
    @SerializedName("title")
    String title;
    @SerializedName(RemoteMessageConst.Notification.URL)
    String url;

    public String getDescription() {
        return this.description;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }
}
