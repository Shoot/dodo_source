package com.inappstory.sdk.network;

import java.io.IOException;
/* loaded from: classes3.dex */
public interface Call extends Cloneable {
    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();
}
