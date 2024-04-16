package com.inappstory.sdk.stories.api.models.logs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes3.dex */
public class ApiLogResponse {
    public String body;
    public long contentLength;
    public long duration;
    public String errorBody;
    public String id;
    public int status;
    public long timestamp;
    public boolean isJson = false;
    public boolean isStatic = false;
    public boolean isError = false;
    public List<ApiLogRequestHeader> responseHeaders = new ArrayList();

    private void generateHeaders(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                if (str != null) {
                    this.responseHeaders.add(new ApiLogRequestHeader(str, hashMap.get(str)));
                }
            }
        }
    }

    public void generateError(int i, String str, HashMap<String, String> hashMap) {
        this.isError = true;
        this.status = i;
        this.errorBody = str;
        generateHeaders(hashMap);
    }

    public void generateFile(int i, String str, HashMap<String, String> hashMap) {
        this.isStatic = true;
        this.status = i;
        if (i > 350) {
            this.isError = true;
            this.errorBody = str;
        } else {
            this.body = str;
        }
        generateHeaders(hashMap);
    }

    public void generateJsonResponse(int i, String str, HashMap<String, String> hashMap) {
        this.isJson = true;
        this.isError = false;
        this.status = i;
        this.body = str;
        generateHeaders(hashMap);
    }
}
