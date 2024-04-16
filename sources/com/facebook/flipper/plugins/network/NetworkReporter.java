package com.facebook.flipper.plugins.network;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public interface NetworkReporter {

    /* loaded from: classes2.dex */
    public static class Header {
        public final String name;
        public final String value;

        public Header(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public String toString() {
            return "Header{" + this.name + ": " + this.value + "}";
        }
    }

    /* loaded from: classes2.dex */
    public static class RequestInfo {
        public byte[] body;
        public List<Header> headers = new ArrayList();
        public String method;
        public String requestId;
        public long timeStamp;
        public String uri;

        public Header getFirstHeader(String str) {
            for (Header header : this.headers) {
                if (str.equalsIgnoreCase(header.name)) {
                    return header;
                }
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static class ResponseInfo {
        public byte[] body;
        public List<Header> headers = new ArrayList();
        public boolean isMock = false;
        public String requestId;
        public int statusCode;
        public String statusReason;
        public long timeStamp;

        public Header getFirstHeader(String str) {
            for (Header header : this.headers) {
                if (str.equalsIgnoreCase(header.name)) {
                    return header;
                }
            }
            return null;
        }
    }

    void reportRequest(RequestInfo requestInfo);

    void reportResponse(ResponseInfo responseInfo);
}
