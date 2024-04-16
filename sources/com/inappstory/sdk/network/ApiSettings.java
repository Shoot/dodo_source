package com.inappstory.sdk.network;
/* loaded from: classes3.dex */
public class ApiSettings {
    private static ApiSettings INSTANCE;
    private String apiKey;
    private String cacheDirPath;
    private String cmsId;
    private String cmsUrl;
    private String testKey;
    private String webUrl;

    public static ApiSettings getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApiSettings();
        }
        return INSTANCE;
    }

    public ApiSettings apiKey(String str) {
        String str2 = this.apiKey;
        if (str2 != null && str != null && !str2.equals(str)) {
            NetworkClient.clear();
        }
        this.apiKey = str;
        return this;
    }

    public ApiSettings cacheDirPath(String str) {
        this.cacheDirPath = str;
        return this;
    }

    public ApiSettings cmsId(String str) {
        this.cmsId = str;
        return this;
    }

    public ApiSettings cmsUrl(String str) {
        String str2 = this.cmsUrl;
        if (str2 != null && str != null && !str2.equals(str)) {
            NetworkClient.clear();
        }
        this.cmsUrl = str;
        return this;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getCacheDirPath() {
        return this.cacheDirPath;
    }

    public String getCmsId() {
        return this.cmsId;
    }

    public String getCmsUrl() {
        return this.cmsUrl;
    }

    public String getTestKey() {
        return this.testKey;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public ApiSettings setWebUrl(String str) {
        this.webUrl = str;
        return this;
    }

    public ApiSettings testKey(String str) {
        this.testKey = str;
        return this;
    }
}
