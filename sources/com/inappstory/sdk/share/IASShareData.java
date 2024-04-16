package com.inappstory.sdk.share;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class IASShareData {
    public List<String> files;
    String payload;
    String url;

    public IASShareData() {
    }

    public IASShareData(List<String> list) {
        this.files = list;
    }

    @NonNull
    public List<String> getFiles() {
        List<String> list = this.files;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public String getPayload() {
        return this.payload;
    }

    public String getUrl() {
        return this.url;
    }

    public IASShareData(String str) {
        this.url = str;
    }

    public IASShareData(String str, List<String> list) {
        this.url = str;
        this.files = list;
    }

    public IASShareData(String str, String str2) {
        this.url = str;
        this.payload = str2;
    }

    public IASShareData(String str, List<String> list, String str2) {
        this.url = str;
        this.files = list;
        this.payload = str2;
    }
}
