package com.inappstory.sdk.inner.share;

import com.inappstory.sdk.network.SerializedName;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class InnerShareData {
    @SerializedName("files")
    public ArrayList<InnerShareFile> files;
    @SerializedName("payload")
    public String payload;
    @SerializedName("text")
    public String text;
    @SerializedName("title")
    public String title;

    public ArrayList<InnerShareFile> getFiles() {
        ArrayList<InnerShareFile> arrayList = this.files;
        if (arrayList == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    public String getPayload() {
        return this.payload;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }
}
