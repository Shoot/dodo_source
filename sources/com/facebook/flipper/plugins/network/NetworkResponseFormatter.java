package com.facebook.flipper.plugins.network;

import com.facebook.flipper.plugins.network.NetworkReporter;
/* loaded from: classes2.dex */
public interface NetworkResponseFormatter {

    /* loaded from: classes2.dex */
    public interface OnCompletionListener {
        void onCompletion(String str);
    }

    void format(NetworkReporter.ResponseInfo responseInfo, OnCompletionListener onCompletionListener);

    boolean shouldFormat(NetworkReporter.ResponseInfo responseInfo);
}
