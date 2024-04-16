package com.inappstory.sdk.stories.cache;

import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public class UrlWithAlter {
    private String alter;
    private String url;

    public UrlWithAlter(@NonNull String str) {
        this.url = str;
    }

    public String getAlter() {
        return this.alter;
    }

    public String getUrl() {
        return this.url;
    }

    public UrlWithAlter(@NonNull String str, String str2) {
        this.url = str;
        this.alter = str2;
    }
}
