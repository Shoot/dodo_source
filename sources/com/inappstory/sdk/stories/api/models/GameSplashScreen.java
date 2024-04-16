package com.inappstory.sdk.stories.api.models;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.network.SerializedName;
/* loaded from: classes3.dex */
public class GameSplashScreen {
    @SerializedName("sha1")
    public String sha1;
    @SerializedName("size")
    public Long size;
    @SerializedName(RemoteMessageConst.Notification.URL)
    public String url;
}
