package com.inappstory.sdk.stories.api.models;
/* loaded from: classes3.dex */
public class ImagePlaceholderValue {
    private ImagePlaceholderType type;
    private String url;

    private ImagePlaceholderValue(ImagePlaceholderType imagePlaceholderType, String str) {
        this.type = imagePlaceholderType;
        this.url = str;
    }

    public static ImagePlaceholderValue createByUrl(String str) {
        return new ImagePlaceholderValue(ImagePlaceholderType.URL, str);
    }

    public ImagePlaceholderType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }
}
