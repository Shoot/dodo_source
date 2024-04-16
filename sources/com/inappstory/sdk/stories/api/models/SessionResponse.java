package com.inappstory.sdk.stories.api.models;

import com.inappstory.sdk.network.SerializedName;
import java.util.List;
/* loaded from: classes3.dex */
public class SessionResponse {
    @SerializedName("cache")
    public List<CacheFontObject> cachedFonts;
    public SessionEditor editor;
    @SerializedName("image_placeholders")
    public List<StoryPlaceholder> imagePlaceholders;
    @SerializedName("is_allow_crash")
    public Boolean isAllowCrash;
    @SerializedName("is_allow_profiling")
    public boolean isAllowProfiling;
    @SerializedName("is_allow_statistic_v1")
    public Boolean isAllowStatV1;
    @SerializedName("is_allow_statistic_v2")
    public Boolean isAllowStatV2;
    @SerializedName("placeholders")
    public List<StoryPlaceholder> placeholders;
    @SerializedName("preview_aspect_ratio")
    public float previewAspectRatio;
    @SerializedName("server_timestamp")
    public Long serverTimestamp;
    public Session session;

    public float getPreviewAspectRatio() {
        float f = this.previewAspectRatio;
        if (f > 0.0f) {
            return f;
        }
        return 1.0f;
    }
}
