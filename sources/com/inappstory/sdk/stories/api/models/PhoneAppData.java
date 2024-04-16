package com.inappstory.sdk.stories.api.models;

import com.inappstory.sdk.network.SerializedName;
/* loaded from: classes3.dex */
public class PhoneAppData {
    @SerializedName("app_build")
    public int appBuild;
    @SerializedName("app_package_id")
    public String appPackageId;
    @SerializedName("app_version")
    public String appVersion;
    public String brand;
    public String manufacturer;
    public String model;
    @SerializedName("os_sdk_version")
    public int osSdkVersion;
    @SerializedName("os_version")
    public String osVersion;
    public String platform;
    @SerializedName("screen_dpi")
    public int screenDpi;
    @SerializedName("screen_height")
    public int screenHeight;
    @SerializedName("screen_width")
    public int screenWidth;
}
