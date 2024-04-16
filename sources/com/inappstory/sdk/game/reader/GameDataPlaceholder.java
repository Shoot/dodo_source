package com.inappstory.sdk.game.reader;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.network.SerializedName;
import im.threads.business.transport.MessageAttributes;
/* loaded from: classes3.dex */
public class GameDataPlaceholder {
    @SerializedName(Action.NAME_ATTRIBUTE)
    public String name;
    @SerializedName(MessageAttributes.TYPE)
    public String type;
    @SerializedName("value")
    public String value;

    public GameDataPlaceholder(String str, String str2, String str3) {
        this.name = str2;
        this.type = str;
        this.value = str3;
    }

    public GameDataPlaceholder() {
    }
}
