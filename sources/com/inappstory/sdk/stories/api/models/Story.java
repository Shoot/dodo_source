package com.inappstory.sdk.stories.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.network.Required;
import com.inappstory.sdk.network.SerializedName;
import com.inappstory.sdk.stories.api.models.slidestructure.SlideStructure;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class Story implements Parcelable {
    public static final Parcelable.Creator<Story> CREATOR = new a();
    @SerializedName("background_color")
    public String backgroundColor;
    @SerializedName("deeplink")
    public String deeplink;
    @SerializedName("disable_close")
    public boolean disableClose;
    @SerializedName("slides_duration")
    public List<Integer> durations;
    @SerializedName(StatisticManager.FAVORITE)
    public boolean favorite;
    @SerializedName("game_instance")
    public GameInstance gameInstance;
    @SerializedName("has_audio")
    public Boolean hasAudio;
    @SerializedName("favorite_functional")
    public Boolean hasFavorite;
    @SerializedName("like_functional")
    public Boolean hasLike;
    @SerializedName("share_functional")
    public Boolean hasShare;
    @SerializedName("has_swipe_up")
    public Boolean hasSwipeUp;
    @SerializedName("hide_in_reader")
    public Boolean hideInReader;
    @Required
    public int id;
    @SerializedName(ElementGenerator.TYPE_IMAGE)
    public List<Image> image;
    @SerializedName("img_placeholder_src_list")
    public List<ImagePlaceholderMappingObject> imagePlaceholdersList;
    @SerializedName("is_opened")
    public boolean isOpened;
    public int lastIndex;
    @SerializedName("layout")
    public String layout;
    @SerializedName("like")
    public Integer like;
    public List<Boolean> loadedPages = new ArrayList();
    @SerializedName("slides_html")
    public List<String> pages;
    @SerializedName("slides_count")
    public int slidesCount;
    @SerializedName("slides_payload")
    public List<PayloadObject> slidesPayload;
    @SerializedName("slides_screenshot_share")
    public List<Integer> slidesShare;
    @SerializedName("slides_structure")
    public List<SlideStructure> slidesStructure;
    public String source;
    @SerializedName("src_list")
    public List<ResourceMappingObject> srcList;
    @SerializedName("stat_title")
    public String statTitle;
    public String tags;
    public String title;
    @SerializedName("title_color")
    public String titleColor;
    @SerializedName("video_cover")
    public List<Image> videoUrl;

    /* loaded from: classes3.dex */
    public enum StoryType {
        COMMON,
        UGC
    }

    /* loaded from: classes3.dex */
    static class a implements Parcelable.Creator<Story> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Story createFromParcel(Parcel parcel) {
            return new Story(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Story[] newArray(int i) {
            return new Story[i];
        }
    }

    public Story() {
    }

    private String getReplacedField(String str) {
        if (InAppStoryService.getInstance() == null) {
            return str;
        }
        Map<String, String> placeholders = InAppStoryService.getInstance().getPlaceholders();
        for (String str2 : placeholders.keySet()) {
            String str3 = "%" + str2 + "%";
            String str4 = placeholders.get(str2);
            if (str4 != null) {
                str = str.replace(str3, str4);
            }
        }
        return str;
    }

    public static String nameFromStoryType(StoryType storyType) {
        return storyType.name();
    }

    public static StoryType storyTypeFromName(String str) {
        StoryType storyType = StoryType.UGC;
        if (str.equals(storyType.name())) {
            return storyType;
        }
        return StoryType.COMMON;
    }

    public boolean checkIfEmpty() {
        List<SlideStructure> list;
        List<String> list2;
        if ((getLayout() != null && (list2 = this.pages) != null && !list2.isEmpty()) || ((list = this.slidesStructure) != null && !list.isEmpty())) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean disliked() {
        if (getLike() == -1) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Story) && this.id == ((Story) obj).id) {
            return true;
        }
        return false;
    }

    public String getBackgroundColor() {
        String str = this.backgroundColor;
        if (str == null) {
            return "#FFFFFF";
        }
        return str;
    }

    public String getDeeplink() {
        return this.deeplink;
    }

    public List<Integer> getDurations() {
        return this.durations;
    }

    public String getGameInstanceId() {
        GameInstance gameInstance = this.gameInstance;
        if (gameInstance != null) {
            return gameInstance.id;
        }
        return null;
    }

    public List<Image> getImage() {
        return this.image;
    }

    public List<ImagePlaceholderMappingObject> getImagePlaceholdersList() {
        if (this.imagePlaceholdersList == null) {
            this.imagePlaceholdersList = new ArrayList();
        }
        return this.imagePlaceholdersList;
    }

    public String getLayout() {
        return this.layout;
    }

    public int getLike() {
        Integer num = this.like;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public List<String> getPages() {
        return this.pages;
    }

    public Map<String, String> getPlaceholdersList(int i, String str) {
        HashMap hashMap = new HashMap();
        for (ImagePlaceholderMappingObject imagePlaceholderMappingObject : getImagePlaceholdersList()) {
            if (imagePlaceholderMappingObject.getIndex().intValue() == i && imagePlaceholderMappingObject.getType().equals("image-placeholder")) {
                hashMap.put(imagePlaceholderMappingObject.getKey(), imagePlaceholderMappingObject.getUrl());
            }
        }
        return hashMap;
    }

    public List<String> getPlaceholdersListNames(int i) {
        String url;
        ArrayList arrayList = new ArrayList();
        for (ImagePlaceholderMappingObject imagePlaceholderMappingObject : getImagePlaceholdersList()) {
            if (imagePlaceholderMappingObject.getIndex().intValue() == i && imagePlaceholderMappingObject.getType().equals("image-placeholder") && (url = imagePlaceholderMappingObject.getUrl()) != null) {
                arrayList.add(url);
            }
        }
        return arrayList;
    }

    public Image getProperImage(int i) {
        String str;
        List<Image> list = this.image;
        if (list != null && !list.isEmpty()) {
            if (i != 2) {
                str = Image.TYPE_MEDIUM;
            } else {
                str = Image.TYPE_HIGH;
            }
            for (Image image : this.image) {
                if (image.getType().equals(str)) {
                    return image;
                }
            }
            return this.image.get(0);
        }
        return null;
    }

    public Story getSimpleCopy() {
        Story story = new Story();
        story.id = this.id;
        story.lastIndex = this.lastIndex;
        story.title = this.title;
        story.statTitle = this.statTitle;
        story.source = this.source;
        story.backgroundColor = this.backgroundColor;
        story.image = this.image;
        story.like = this.like;
        story.hasAudio = this.hasAudio;
        story.slidesCount = this.slidesCount;
        story.titleColor = this.titleColor;
        story.isOpened = this.isOpened;
        ArrayList arrayList = new ArrayList();
        story.durations = arrayList;
        List<Integer> list = this.durations;
        if (list != null) {
            arrayList.addAll(list);
            story.slidesCount = this.durations.size();
        }
        List<Integer> list2 = this.slidesShare;
        if (list2 != null) {
            story.slidesShare.addAll(list2);
        }
        story.favorite = this.favorite;
        return story;
    }

    public String getSlideEventPayload(int i) {
        List<PayloadObject> list = this.slidesPayload;
        if (list == null) {
            return null;
        }
        for (PayloadObject payloadObject : list) {
            if (i == payloadObject.slideIndex) {
                return payloadObject.getPayload();
            }
        }
        return null;
    }

    public int getSlidesCount() {
        List<Integer> list;
        int i = this.slidesCount;
        if (i == 0 && (list = this.durations) != null) {
            return list.size();
        }
        return i;
    }

    public List<Integer> getSlidesShare() {
        if (this.slidesShare == null) {
            this.slidesShare = new ArrayList();
        }
        return this.slidesShare;
    }

    public String getSource() {
        String str = this.source;
        if (str == null) {
            str = "";
        }
        return getReplacedField(str);
    }

    public List<ResourceMappingObject> getSrcList() {
        if (this.srcList == null) {
            this.srcList = new ArrayList();
        }
        return this.srcList;
    }

    public List<String> getSrcListKeys(int i, String str) {
        ArrayList arrayList = new ArrayList();
        for (ResourceMappingObject resourceMappingObject : getSrcList()) {
            String type = resourceMappingObject.getType();
            if (resourceMappingObject.getIndex().intValue() == i && ((str == null && (type == null || type.equals(ElementGenerator.TYPE_IMAGE))) || (resourceMappingObject.getType() != null && resourceMappingObject.getType().equals(str)))) {
                arrayList.add(resourceMappingObject.getKey());
            }
        }
        return arrayList;
    }

    public List<String> getSrcListUrls(int i, String str) {
        ArrayList arrayList = new ArrayList();
        for (ResourceMappingObject resourceMappingObject : getSrcList()) {
            String type = resourceMappingObject.getType();
            if (resourceMappingObject.getIndex().intValue() == i && ((str == null && (type == null || type.equals(ElementGenerator.TYPE_IMAGE))) || (resourceMappingObject.getType() != null && resourceMappingObject.getType().equals(str)))) {
                arrayList.add(resourceMappingObject.getUrl());
            }
        }
        return arrayList;
    }

    public String getTitle() {
        String str = this.title;
        if (str == null) {
            str = "";
        }
        return getReplacedField(str);
    }

    public String getTitleColor() {
        return this.titleColor;
    }

    public String getVideoUrl() {
        List<Image> list = this.videoUrl;
        if (list != null && !list.isEmpty()) {
            return this.videoUrl.get(0).getUrl();
        }
        return null;
    }

    public Boolean hasAudio() {
        boolean z;
        Boolean bool = this.hasAudio;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public Boolean hasFavorite() {
        boolean z;
        Boolean bool = this.hasFavorite;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public Boolean hasLike() {
        boolean z;
        Boolean bool = this.hasLike;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public Boolean hasShare() {
        boolean z;
        Boolean bool = this.hasShare;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public boolean hasSwipeUp() {
        Boolean bool = this.hasSwipeUp;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public int hashCode() {
        return 31 + this.id;
    }

    public boolean isFavorite() {
        return this.favorite;
    }

    public boolean isHideInReader() {
        Boolean bool = this.hideInReader;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean isOpened() {
        return this.isOpened;
    }

    public boolean isScreenshotShare(int i) {
        if (shareType(i) == 1) {
            return true;
        }
        return false;
    }

    public boolean liked() {
        if (getLike() == 1) {
            return true;
        }
        return false;
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        if (this.durations == null) {
            this.durations = new ArrayList();
        }
        if (this.slidesShare == null) {
            this.slidesShare = new ArrayList();
        }
        if (this.pages == null) {
            this.pages = new ArrayList();
        }
        this.id = parcel.readInt();
        this.lastIndex = parcel.readInt();
        this.title = parcel.readString();
        this.source = parcel.readString();
        this.backgroundColor = parcel.readString();
        this.image = parcel.createTypedArrayList(Image.CREATOR);
        this.like = Integer.valueOf(parcel.readInt());
        this.slidesCount = parcel.readInt();
        this.titleColor = parcel.readString();
        boolean z2 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.isOpened = z;
        parcel.readList(this.durations, Integer.class.getClassLoader());
        List<Integer> list = this.durations;
        if (list != null || !list.isEmpty()) {
            this.slidesCount = this.durations.size();
        }
        parcel.readList(this.pages, String.class.getClassLoader());
        if (parcel.readInt() == 1) {
            z2 = true;
        }
        this.favorite = z2;
        this.layout = parcel.readString();
        parcel.readList(this.slidesShare, Boolean.class.getClassLoader());
    }

    public void saveStoryOpened(StoryType storyType) {
        if (InAppStoryService.isNotNull()) {
            InAppStoryService.getInstance().saveStoryOpened(this.id, storyType);
        }
    }

    public void setLastIndex(int i, StoryType storyType) {
        this.lastIndex = i;
        try {
            InAppStoryService.getInstance().getDownloadManager().getStoryById(this.id, storyType).lastIndex = i;
        } catch (Exception unused) {
        }
    }

    public void setSlidesCount(int i) {
        this.slidesCount = i;
    }

    public int shareType(int i) {
        List<Integer> list = this.slidesShare;
        if (list == null || list.size() <= i || this.slidesShare.get(i) == null) {
            return 0;
        }
        return this.slidesShare.get(i).intValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        if (this.durations == null) {
            this.durations = new ArrayList();
        }
        if (this.slidesShare == null) {
            this.slidesShare = new ArrayList();
        }
        if (this.pages == null) {
            this.pages = new ArrayList();
        }
        parcel.writeInt(this.id);
        parcel.writeInt(this.lastIndex);
        parcel.writeString(this.title);
        parcel.writeString(this.statTitle);
        parcel.writeString(this.source);
        parcel.writeString(this.backgroundColor);
        parcel.writeTypedList(this.image);
        parcel.writeInt(this.like.intValue());
        List<Integer> list = this.durations;
        if (list != null && !list.isEmpty()) {
            i2 = this.durations.size();
        } else {
            i2 = this.slidesCount;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.titleColor);
        parcel.writeInt(this.isOpened ? 1 : 0);
        parcel.writeList(this.durations);
        parcel.writeList(this.pages);
        parcel.writeInt(this.favorite ? 1 : 0);
        parcel.writeString(this.layout);
        parcel.writeList(this.slidesShare);
    }

    public Story(Parcel parcel) {
        readFromParcel(parcel);
    }
}
