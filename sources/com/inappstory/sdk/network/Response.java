package com.inappstory.sdk.network;

import java.util.HashMap;
/* loaded from: classes3.dex */
public final class Response {
    public String body;
    public int code;
    public long contentLength;
    public String errorBody;
    public HashMap<String, String> headers;
    public String logId;

    /* loaded from: classes3.dex */
    public static class Builder {
        public String body;
        public int code;
        public long contentLength;
        public String errorBody;
        public HashMap<String, String> headers;
        public String logId;

        public Builder apiLog(String str) {
            this.logId = str;
            return this;
        }

        public Builder body(String str) {
            this.body = str;
            return this;
        }

        public Response build() {
            return new Response(this);
        }

        public Builder code(int i) {
            this.code = i;
            return this;
        }

        public Builder contentLength(long j) {
            this.contentLength = j;
            return this;
        }

        public Builder errorBody(String str) {
            this.errorBody = str;
            return this;
        }

        public Builder header(String str, String str2) {
            if (this.headers == null) {
                this.headers = new HashMap<>();
            }
            this.headers.put(str, str2);
            return this;
        }

        public Builder headers(HashMap<String, String> hashMap) {
            this.headers = hashMap;
            return this;
        }
    }

    Response(Builder builder) {
        this.code = builder.code;
        this.errorBody = builder.errorBody;
        this.headers = builder.headers;
        this.body = builder.body;
        this.logId = builder.logId;
        this.contentLength = builder.contentLength;
    }
}
