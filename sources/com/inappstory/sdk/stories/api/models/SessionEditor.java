package com.inappstory.sdk.stories.api.models;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.network.SerializedName;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes3.dex */
public class SessionEditor {
    public HashMap<String, Object> config;
    public HashMap<String, String> messages;
    @SerializedName(RemoteMessageConst.Notification.URL)
    public String url;
    @SerializedName("urlTemplate")
    public String urlTemplate;
    @SerializedName("versionTemplate")
    public String versionTemplate;
    @SerializedName("versionsMap")
    public List<UGCVersionToSDKBuild> versionsMap;
}
