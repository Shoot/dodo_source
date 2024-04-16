package com.inappstory.sdk.stories.api.models;

import android.content.Context;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.statistic.SharedPreferencesAPI;
import java.util.List;
/* loaded from: classes3.dex */
public class CachedSessionData {
    public static final String CACHED_SESSION_DATA = "cached_session_data";
    private static CachedSessionData INSTANCE;
    public List<StoryPlaceholder> placeholders;
    public float previewAspectRatio;
    public String sessionId;
    public String tags;
    public String testKey;
    public String token;
    public String userId;

    public static CachedSessionData getInstance(Context context) {
        if (!SharedPreferencesAPI.hasContext()) {
            SharedPreferencesAPI.setContext(context);
        }
        if (INSTANCE == null) {
            INSTANCE = (CachedSessionData) JsonParser.fromJson(SharedPreferencesAPI.getString(CACHED_SESSION_DATA), CachedSessionData.class);
        }
        return INSTANCE;
    }

    public static void setInstance(CachedSessionData cachedSessionData) {
        INSTANCE = cachedSessionData;
        try {
            SharedPreferencesAPI.saveString(CACHED_SESSION_DATA, JsonParser.getJson(cachedSessionData));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
