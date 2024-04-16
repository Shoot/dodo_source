package com.inappstory.sdk.stories.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.network.SerializedName;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
/* loaded from: classes3.dex */
public class Image implements Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new a();
    public static final int QUALITY_HIGH = 2;
    public static final int QUALITY_MEDIUM = 1;
    public static final String TEMP_IMAGE = "";
    public static final String TYPE_HIGH = "h";
    public static final String TYPE_MEDIUM = "m";
    public static final String TYPE_SMALL = "s";
    @SerializedName("expire")
    private int expire;
    @SerializedName("height")
    private int height;
    @SerializedName(MessageAttributes.TYPE)
    private String type;
    @SerializedName(RemoteMessageConst.Notification.URL)
    private String url;
    @SerializedName("width")
    private int width;

    /* loaded from: classes3.dex */
    static class a implements Parcelable.Creator<Image> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Image createFromParcel(Parcel parcel) {
            return new Image(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Image[] newArray(int i) {
            return new Image[i];
        }
    }

    protected Image(Parcel parcel) {
        this.url = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.expire = parcel.readInt();
        this.type = parcel.readString();
    }

    public static String getImage(List<Image> list, String str) {
        for (Image image : list) {
            if (image.type.equals(str)) {
                int i = image.width;
                int i2 = image.height;
                if (i / i2 < 3.0f && i / i2 > 1.1d) {
                    return image.url;
                }
            }
        }
        return "";
    }

    public static String getLargeImage(List<Image> list) {
        for (Image image : list) {
            if (image.type.equals(TYPE_HIGH)) {
                int i = image.width;
                int i2 = image.height;
                if (i / i2 > 1.1d && i / i2 < 3.0f) {
                    return image.getUrl();
                }
            }
        }
        return "";
    }

    public static String getProperTabletImage(List<Image> list) {
        if (list != null && list.size() > 0) {
            return getTabletImage(list);
        }
        return "";
    }

    public static String getSquareImage(List<Image> list) {
        for (Image image : list) {
            if (image.height == image.width) {
                return image.url;
            }
        }
        return "";
    }

    private static String getTabletImage(List<Image> list) {
        for (Image image : list) {
            if (image.type.equals(TYPE_HIGH) && image.width / image.height > 3.0f) {
                return image.url;
            }
        }
        return "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getExpire() {
        return this.expire;
    }

    public int getHeight() {
        return this.height;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.expire);
        parcel.writeString(this.type);
    }

    public Image() {
    }
}
