package com.inappstory.sdk.stories.api.models.logs;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class ApiLogRequest {
    public String body;
    public String bodyRaw;
    public String bodyUrlEncoded;
    public List<ApiLogRequestHeader> headers = new ArrayList();
    public String id;
    public boolean isStatic;
    public String method;
    public long timestamp;
    public String url;
}
