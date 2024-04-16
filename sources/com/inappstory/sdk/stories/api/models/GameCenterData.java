package com.inappstory.sdk.stories.api.models;

import com.inappstory.sdk.game.reader.GameScreenOptions;
import com.inappstory.sdk.network.Required;
import com.inappstory.sdk.network.SerializedName;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class GameCenterData {
    @SerializedName("archiveSha1")
    public String archiveSha1;
    @SerializedName("archiveSize")
    public Long archiveSize;
    @SerializedName("archiveUncompressedSize")
    public Long archiveUncompressedSize;
    @SerializedName("id")
    public String id;
    @SerializedName("initCode")
    @Required
    public String initCode;
    @SerializedName("instanceUserData")
    public Map<String, Object> instanceUserData;
    @SerializedName("options")
    public GameScreenOptions options;
    @SerializedName("resources")
    public List<WebResource> resources;
    @SerializedName("splashScreen")
    public GameSplashScreen splashScreen;
    @SerializedName("downloadUrl")
    @Required
    public String url;

    public long getTotalSize() {
        Long l;
        Long l2;
        Long l3 = this.archiveUncompressedSize;
        if (l3 == null || l3.longValue() <= 0 || (l = this.archiveSize) == null || l.longValue() <= 0) {
            return 0L;
        }
        long longValue = this.archiveUncompressedSize.longValue() + this.archiveSize.longValue();
        GameSplashScreen gameSplashScreen = this.splashScreen;
        if (gameSplashScreen != null && (l2 = gameSplashScreen.size) != null) {
            longValue += l2.longValue();
        }
        List<WebResource> list = this.resources;
        if (list != null) {
            for (WebResource webResource : list) {
                longValue += webResource.size;
            }
        }
        return longValue;
    }
}
