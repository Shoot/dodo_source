package com.facebook.flipper.plugins.network;

import android.util.Base64;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.flipper.core.ErrorReportingRunnable;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.plugins.common.BufferingFlipperPlugin;
import com.facebook.flipper.plugins.network.NetworkReporter;
import com.facebook.flipper.plugins.network.NetworkResponseFormatter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class NetworkFlipperPlugin extends BufferingFlipperPlugin implements NetworkReporter {
    public static final String ID = "Network";
    private static final int MAX_BODY_SIZE_IN_BYTES = 1048576;
    private final List<NetworkResponseFormatter> mFormatters;

    public NetworkFlipperPlugin() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldStripResponseBody(NetworkReporter.ResponseInfo responseInfo) {
        NetworkReporter.Header firstHeader = responseInfo.getFirstHeader("content-type");
        if (firstHeader == null) {
            return false;
        }
        if (!firstHeader.value.contains("video/") && !firstHeader.value.contains("application/zip")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String toBase64(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(Base64.encode(bArr, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FlipperArray toFlipperObject(List<NetworkReporter.Header> list) {
        FlipperArray.Builder builder = new FlipperArray.Builder();
        for (NetworkReporter.Header header : list) {
            builder.put(new FlipperObject.Builder().put(Action.KEY_ATTRIBUTE, header.name).put("value", header.value));
        }
        return builder.build();
    }

    public void addProtobufDefinitions(final String str, final FlipperArray flipperArray) {
        new ErrorReportingRunnable(getConnection()) { // from class: com.facebook.flipper.plugins.network.NetworkFlipperPlugin.4
            @Override // com.facebook.flipper.core.ErrorReportingRunnable
            protected void runOrThrow() throws Exception {
                NetworkFlipperPlugin.this.send("addProtobufDefinitions", new FlipperObject.Builder().put(str, flipperArray).build());
            }
        }.run();
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public String getId() {
        return ID;
    }

    @Override // com.facebook.flipper.plugins.network.NetworkReporter
    public void reportRequest(final NetworkReporter.RequestInfo requestInfo) {
        new ErrorReportingRunnable(getConnection()) { // from class: com.facebook.flipper.plugins.network.NetworkFlipperPlugin.1
            @Override // com.facebook.flipper.core.ErrorReportingRunnable
            protected void runOrThrow() throws Exception {
                NetworkFlipperPlugin.this.send("newRequest", new FlipperObject.Builder().put("id", requestInfo.requestId).put("timestamp", Long.valueOf(requestInfo.timeStamp)).put("method", requestInfo.method).put(RemoteMessageConst.Notification.URL, requestInfo.uri).put("headers", NetworkFlipperPlugin.this.toFlipperObject(requestInfo.headers)).put("data", NetworkFlipperPlugin.this.toBase64(requestInfo.body)).build());
            }
        }.run();
    }

    @Override // com.facebook.flipper.plugins.network.NetworkReporter
    public void reportResponse(final NetworkReporter.ResponseInfo responseInfo) {
        final ErrorReportingRunnable errorReportingRunnable = new ErrorReportingRunnable(getConnection()) { // from class: com.facebook.flipper.plugins.network.NetworkFlipperPlugin.2
            @Override // com.facebook.flipper.core.ErrorReportingRunnable
            protected void runOrThrow() throws Exception {
                byte[] bArr;
                int max;
                byte[] copyOfRange;
                FlipperObject build;
                String str;
                if (NetworkFlipperPlugin.shouldStripResponseBody(responseInfo)) {
                    responseInfo.body = null;
                }
                if (responseInfo.body == null) {
                    max = 1;
                } else {
                    max = Math.max((int) Math.ceil(bArr.length / 1048576.0d), 1);
                }
                for (int i = 0; i < max; i++) {
                    byte[] bArr2 = responseInfo.body;
                    if (bArr2 == null) {
                        copyOfRange = null;
                    } else {
                        copyOfRange = Arrays.copyOfRange(bArr2, i * NetworkFlipperPlugin.MAX_BODY_SIZE_IN_BYTES, Math.min((i + 1) * NetworkFlipperPlugin.MAX_BODY_SIZE_IN_BYTES, bArr2.length));
                    }
                    if (i == 0) {
                        build = new FlipperObject.Builder().put("id", responseInfo.requestId).put("timestamp", Long.valueOf(responseInfo.timeStamp)).put("status", Integer.valueOf(responseInfo.statusCode)).put("reason", responseInfo.statusReason).put("headers", NetworkFlipperPlugin.this.toFlipperObject(responseInfo.headers)).put("isMock", Boolean.valueOf(responseInfo.isMock)).put("data", NetworkFlipperPlugin.this.toBase64(copyOfRange)).put("totalChunks", Integer.valueOf(max)).put("index", Integer.valueOf(i)).build();
                    } else {
                        build = new FlipperObject.Builder().put("id", responseInfo.requestId).put("timestamp", Long.valueOf(responseInfo.timeStamp)).put("totalChunks", Integer.valueOf(max)).put("index", Integer.valueOf(i)).put("data", NetworkFlipperPlugin.this.toBase64(copyOfRange)).build();
                    }
                    NetworkFlipperPlugin networkFlipperPlugin = NetworkFlipperPlugin.this;
                    if (max == 1) {
                        str = "newResponse";
                    } else {
                        str = "partialResponse";
                    }
                    networkFlipperPlugin.send(str, build);
                }
            }
        };
        List<NetworkResponseFormatter> list = this.mFormatters;
        if (list != null) {
            for (NetworkResponseFormatter networkResponseFormatter : list) {
                if (networkResponseFormatter.shouldFormat(responseInfo)) {
                    networkResponseFormatter.format(responseInfo, new NetworkResponseFormatter.OnCompletionListener() { // from class: com.facebook.flipper.plugins.network.NetworkFlipperPlugin.3
                        @Override // com.facebook.flipper.plugins.network.NetworkResponseFormatter.OnCompletionListener
                        public void onCompletion(String str) {
                            responseInfo.body = str.getBytes();
                            errorReportingRunnable.run();
                        }
                    });
                    return;
                }
            }
        }
        errorReportingRunnable.run();
    }

    public NetworkFlipperPlugin(List<NetworkResponseFormatter> list) {
        this.mFormatters = list;
    }
}
