package com.facebook.flipper.plugins.network;

import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperReceiver;
import com.facebook.flipper.core.FlipperResponder;
import com.facebook.flipper.plugins.common.BufferingFlipperPlugin;
import com.facebook.flipper.plugins.network.NetworkReporter;
import defpackage.hi9;
import defpackage.ik9;
import defpackage.k65;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes2.dex */
public class FlipperOkhttpInterceptor implements k65, BufferingFlipperPlugin.MockResponseConnectionListener {
    private static final long DEFAULT_MAX_BODY_BYTES = 1048576;
    private boolean mIsMockResponseSupported;
    private final long mMaxBodyBytes;
    private Map<PartialRequestInfo, NetworkReporter.ResponseInfo> mMockResponseMap;
    private final NetworkFlipperPlugin mPlugin;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class PartialRequestInfo extends Pair<String, String> {
        PartialRequestInfo(String str, String str2) {
            super(str, str2);
        }
    }

    public FlipperOkhttpInterceptor(NetworkFlipperPlugin networkFlipperPlugin) {
        this(networkFlipperPlugin, 1048576L, false);
    }

    private static byte[] bodyBufferToByteArray(yg0 yg0Var, long j) throws IOException {
        return yg0Var.u0(Math.min(yg0Var.P(), j));
    }

    private static Pair<hi9, yg0> cloneBodyAndInvalidateRequest(hi9 hi9Var) throws IOException {
        if (hi9Var.a() != null) {
            hi9.a i = hi9Var.i();
            qc6 contentType = hi9Var.a().contentType();
            yg0 yg0Var = new yg0();
            hi9Var.a().writeTo(yg0Var);
            return new Pair<>(i.l(hi9Var.h(), ji9.create(contentType, yg0Var.v1())).b(), yg0Var.clone());
        }
        return new Pair<>(hi9Var, null);
    }

    private static yg0 cloneBodyForResponse(ik9 ik9Var, long j) throws IOException {
        if (ik9Var.b() != null && ik9Var.b().source() != null && ik9Var.b().source().D() != null) {
            fh0 source = ik9Var.b().source();
            source.w(j);
            return source.D().clone();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NetworkReporter.ResponseInfo convertFlipperObjectRouteToResponseInfo(FlipperObject flipperObject) {
        String string = flipperObject.getString("data");
        String string2 = flipperObject.getString("requestUrl");
        String string3 = flipperObject.getString("method");
        FlipperArray array = flipperObject.getArray("headers");
        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
            int i = flipperObject.getInt("status");
            NetworkReporter.ResponseInfo responseInfo = new NetworkReporter.ResponseInfo();
            responseInfo.body = string.getBytes();
            responseInfo.statusCode = i;
            responseInfo.statusReason = "OK";
            if (array != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < array.length(); i2++) {
                    FlipperObject object = array.getObject(i2);
                    arrayList.add(new NetworkReporter.Header(object.getString(Action.KEY_ATTRIBUTE), object.getString("value")));
                }
                responseInfo.headers = arrayList;
            }
            return responseInfo;
        }
        return null;
    }

    private static List<NetworkReporter.Header> convertHeader(gn4 gn4Var) {
        ArrayList arrayList = new ArrayList(gn4Var.size());
        for (String str : gn4Var.k()) {
            arrayList.add(new NetworkReporter.Header(str, gn4Var.d(str)));
        }
        return arrayList;
    }

    private NetworkReporter.RequestInfo convertRequest(hi9 hi9Var, yg0 yg0Var, String str) throws IOException {
        List<NetworkReporter.Header> convertHeader = convertHeader(hi9Var.e());
        NetworkReporter.RequestInfo requestInfo = new NetworkReporter.RequestInfo();
        requestInfo.requestId = str;
        requestInfo.timeStamp = System.currentTimeMillis();
        requestInfo.headers = convertHeader;
        requestInfo.method = hi9Var.h();
        requestInfo.uri = hi9Var.l().toString();
        if (yg0Var != null) {
            requestInfo.body = bodyBufferToByteArray(yg0Var, this.mMaxBodyBytes);
            yg0Var.close();
        }
        return requestInfo;
    }

    private NetworkReporter.ResponseInfo convertResponse(ik9 ik9Var, yg0 yg0Var, String str, boolean z) throws IOException {
        List<NetworkReporter.Header> convertHeader = convertHeader(ik9Var.q());
        NetworkReporter.ResponseInfo responseInfo = new NetworkReporter.ResponseInfo();
        responseInfo.requestId = str;
        responseInfo.timeStamp = ik9Var.H();
        responseInfo.statusCode = ik9Var.j();
        responseInfo.headers = convertHeader;
        responseInfo.isMock = z;
        if (yg0Var != null) {
            responseInfo.body = bodyBufferToByteArray(yg0Var, this.mMaxBodyBytes);
            yg0Var.close();
        }
        return responseInfo;
    }

    private ik9 getMockResponse(hi9 hi9Var) {
        NetworkReporter.ResponseInfo mockResponse = getMockResponse(new PartialRequestInfo(hi9Var.l().toString(), hi9Var.h()));
        if (mockResponse == null) {
            return null;
        }
        ik9.a aVar = new ik9.a();
        aVar.r(hi9Var).o(vr8.d).e(mockResponse.statusCode).l(mockResponse.statusReason).p(System.currentTimeMillis()).b(kk9.create(qc6.g("application/text"), mockResponse.body));
        List<NetworkReporter.Header> list = mockResponse.headers;
        if (list != null && !list.isEmpty()) {
            for (NetworkReporter.Header header : mockResponse.headers) {
                if (!TextUtils.isEmpty(header.name) && !TextUtils.isEmpty(header.value)) {
                    aVar.i(header.name, header.value);
                }
            }
        }
        return aVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerMockResponse(PartialRequestInfo partialRequestInfo, NetworkReporter.ResponseInfo responseInfo) {
        if (!this.mMockResponseMap.containsKey(partialRequestInfo)) {
            this.mMockResponseMap.put(partialRequestInfo, responseInfo);
        }
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) throws IOException {
        ik9 ik9Var;
        ik9 b;
        boolean z;
        Pair<hi9, yg0> cloneBodyAndInvalidateRequest = cloneBodyAndInvalidateRequest(aVar.request());
        hi9 hi9Var = (hi9) cloneBodyAndInvalidateRequest.first;
        String uuid = UUID.randomUUID().toString();
        this.mPlugin.reportRequest(convertRequest(hi9Var, (yg0) cloneBodyAndInvalidateRequest.second, uuid));
        if (this.mIsMockResponseSupported) {
            ik9Var = getMockResponse(hi9Var);
        } else {
            ik9Var = null;
        }
        if (ik9Var != null) {
            b = ik9Var;
        } else {
            b = aVar.b(hi9Var);
        }
        yg0 cloneBodyForResponse = cloneBodyForResponse(b, this.mMaxBodyBytes);
        if (ik9Var != null) {
            z = true;
        } else {
            z = false;
        }
        this.mPlugin.reportResponse(convertResponse(b, cloneBodyForResponse, uuid, z));
        return b;
    }

    @Override // com.facebook.flipper.plugins.common.BufferingFlipperPlugin.MockResponseConnectionListener
    public void onConnect(FlipperConnection flipperConnection) {
        flipperConnection.receive("mockResponses", new FlipperReceiver() { // from class: com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor.1
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) throws Exception {
                FlipperArray array = flipperObject.getArray("routes");
                FlipperOkhttpInterceptor.this.mMockResponseMap.clear();
                for (int i = 0; i < array.length(); i++) {
                    FlipperObject object = array.getObject(i);
                    String string = object.getString("requestUrl");
                    String string2 = object.getString("method");
                    NetworkReporter.ResponseInfo convertFlipperObjectRouteToResponseInfo = FlipperOkhttpInterceptor.this.convertFlipperObjectRouteToResponseInfo(object);
                    if (convertFlipperObjectRouteToResponseInfo != null) {
                        FlipperOkhttpInterceptor.this.registerMockResponse(new PartialRequestInfo(string, string2), convertFlipperObjectRouteToResponseInfo);
                    }
                }
                flipperResponder.success();
            }
        });
    }

    @Override // com.facebook.flipper.plugins.common.BufferingFlipperPlugin.MockResponseConnectionListener
    public void onDisconnect() {
        this.mMockResponseMap.clear();
    }

    public FlipperOkhttpInterceptor(NetworkFlipperPlugin networkFlipperPlugin, long j) {
        this(networkFlipperPlugin, j, false);
    }

    public FlipperOkhttpInterceptor(NetworkFlipperPlugin networkFlipperPlugin, boolean z) {
        this(networkFlipperPlugin, 1048576L, z);
    }

    public FlipperOkhttpInterceptor(NetworkFlipperPlugin networkFlipperPlugin, long j, boolean z) {
        this.mMockResponseMap = new HashMap(0);
        this.mPlugin = networkFlipperPlugin;
        this.mMaxBodyBytes = j;
        this.mIsMockResponseSupported = z;
        if (z) {
            networkFlipperPlugin.setConnectionListener(this);
        }
    }

    private NetworkReporter.ResponseInfo getMockResponse(PartialRequestInfo partialRequestInfo) {
        for (Map.Entry<PartialRequestInfo, NetworkReporter.ResponseInfo> entry : this.mMockResponseMap.entrySet()) {
            PartialRequestInfo key = entry.getKey();
            if (((String) ((Pair) partialRequestInfo).first).contains((CharSequence) ((Pair) key).first) && Objects.equals(((Pair) partialRequestInfo).second, ((Pair) key).second)) {
                return entry.getValue();
            }
        }
        return null;
    }
}
