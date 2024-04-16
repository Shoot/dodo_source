package com.facebook.flipper.android;

import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperReceiver;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
@DoNotStrip
/* loaded from: classes2.dex */
class FlipperConnectionImpl implements FlipperConnection {
    private final HybridData mHybridData;

    static {
        zpa.d("flipper");
    }

    private FlipperConnectionImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.flipper.core.FlipperConnection
    public native void receive(String str, FlipperReceiver flipperReceiver);

    @Override // com.facebook.flipper.core.FlipperConnection
    public native void reportError(Throwable th);

    @Override // com.facebook.flipper.core.FlipperConnection
    public native void reportErrorWithMetadata(String str, String str2);

    @Override // com.facebook.flipper.core.FlipperConnection
    public void send(String str, FlipperObject flipperObject) {
        sendObject(str, flipperObject);
    }

    public native void sendArray(String str, FlipperArray flipperArray);

    public native void sendObject(String str, FlipperObject flipperObject);

    public native void sendString(String str, String str2);

    @Override // com.facebook.flipper.core.FlipperConnection
    public void send(String str, FlipperArray flipperArray) {
        sendArray(str, flipperArray);
    }

    @Override // com.facebook.flipper.core.FlipperConnection
    public void send(String str, String str2) {
        sendString(str, str2);
    }
}
