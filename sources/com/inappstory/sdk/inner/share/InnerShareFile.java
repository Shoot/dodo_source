package com.inappstory.sdk.inner.share;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.network.SerializedName;
import im.threads.business.transport.MessageAttributes;
/* loaded from: classes3.dex */
public class InnerShareFile {
    @SerializedName(Action.FILE_ATTRIBUTE)
    public String file;
    @SerializedName(Action.NAME_ATTRIBUTE)
    public String name;
    @SerializedName(MessageAttributes.TYPE)
    public String type;

    public String getFile() {
        return this.file;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }
}
