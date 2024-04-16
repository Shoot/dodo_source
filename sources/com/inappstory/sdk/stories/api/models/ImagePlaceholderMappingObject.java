package com.inappstory.sdk.stories.api.models;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.network.SerializedName;
import im.threads.business.transport.MessageAttributes;
/* loaded from: classes3.dex */
public class ImagePlaceholderMappingObject {
    @SerializedName("slide_index")
    public Integer index;
    @SerializedName(Action.KEY_ATTRIBUTE)
    public String key;
    @SerializedName(MessageAttributes.TYPE)
    public String type;
    @SerializedName(RemoteMessageConst.Notification.URL)
    public String url;

    public Integer getIndex() {
        return this.index;
    }

    public String getKey() {
        return this.key;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i;
        String str = this.url;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.key;
        if (str2 != null) {
            return i + str2.hashCode();
        }
        return i;
    }
}
