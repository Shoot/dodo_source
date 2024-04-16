package com.facebook.flipper.core;
/* loaded from: classes2.dex */
public interface FlipperConnection {
    void receive(String str, FlipperReceiver flipperReceiver);

    void reportError(Throwable th);

    void reportErrorWithMetadata(String str, String str2);

    void send(String str, FlipperArray flipperArray);

    void send(String str, FlipperObject flipperObject);

    void send(String str, String str2);
}
