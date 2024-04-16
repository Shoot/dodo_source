package com.facebook.flipper.android;

import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperSocketEventHandler;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
@DoNotStrip
/* loaded from: classes2.dex */
class FlipperSocketEventHandlerImpl implements FlipperSocketEventHandler {
    private final HybridData mHybridData;

    private FlipperSocketEventHandlerImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native FlipperObject reportAuthenticationChallengeReceived();

    private native void reportConnectionEvent(int i);

    private native void reportMessageReceived(String str);

    @Override // com.facebook.flipper.core.FlipperSocketEventHandler
    public FlipperObject onAuthenticationChallengeReceived() {
        return reportAuthenticationChallengeReceived();
    }

    @Override // com.facebook.flipper.core.FlipperSocketEventHandler
    public void onConnectionEvent(FlipperSocketEventHandler.SocketEvent socketEvent) {
        reportConnectionEvent(socketEvent.ordinal());
    }

    @Override // com.facebook.flipper.core.FlipperSocketEventHandler
    public void onMessageReceived(String str) {
        reportMessageReceived(str);
    }
}
