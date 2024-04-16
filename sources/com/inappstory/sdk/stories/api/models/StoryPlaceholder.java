package com.inappstory.sdk.stories.api.models;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.network.SerializedName;
/* loaded from: classes3.dex */
public class StoryPlaceholder {
    @SerializedName("default_value")
    public String defaultVal;
    @SerializedName(Action.NAME_ATTRIBUTE)
    public String name;
}
