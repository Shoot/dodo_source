package com.facebook.flipper.core;
/* loaded from: classes2.dex */
public interface FlipperPlugin {
    String getId();

    void onConnect(FlipperConnection flipperConnection) throws Exception;

    void onDisconnect() throws Exception;

    boolean runInBackground();
}
