package com.inappstory.sdk.stories.api.models;

import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.network.SerializedName;
import java.util.List;
/* loaded from: classes3.dex */
public class Feed {
    @SerializedName("id")
    public Integer feedId;
    @SerializedName(AppearanceManager.CS_HAS_FAVORITE)
    public Boolean hasFavorite;
    @SerializedName("stories")
    public List<Story> stories;

    public String getFeedId() {
        Integer num = this.feedId;
        if (num != null) {
            return Integer.toString(num.intValue());
        }
        return null;
    }

    public boolean hasFavorite() {
        Boolean bool = this.hasFavorite;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
