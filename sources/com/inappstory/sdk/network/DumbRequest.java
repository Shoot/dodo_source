package com.inappstory.sdk.network;

import com.inappstory.sdk.network.Request;
import com.inappstory.sdk.network.Response;
/* loaded from: classes3.dex */
public class DumbRequest<T> extends Request<T> {
    DumbRequest(Request.Builder builder) {
        super(builder);
    }

    @Override // com.inappstory.sdk.network.Request
    public Response execute() {
        return new Response.Builder().code(-99).errorBody("").build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DumbRequest() {
        super(new Request.Builder());
    }

    @Override // com.inappstory.sdk.network.Request
    public void enqueue(Callback callback) {
    }
}
