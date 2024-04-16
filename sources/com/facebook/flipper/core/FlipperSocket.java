package com.facebook.flipper.core;
/* loaded from: classes2.dex */
public interface FlipperSocket {
    public static final int SOCKET_TAG = 589824;

    void flipperConnect();

    void flipperDisconnect();

    void flipperSend(String str);

    void flipperSetEventHandler(FlipperSocketEventHandler flipperSocketEventHandler);
}
