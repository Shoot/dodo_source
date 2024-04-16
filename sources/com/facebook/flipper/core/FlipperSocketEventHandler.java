package com.facebook.flipper.core;
/* loaded from: classes2.dex */
public interface FlipperSocketEventHandler {

    /* loaded from: classes2.dex */
    public enum SocketEvent {
        OPEN(0),
        CLOSE(1),
        ERROR(2),
        SSL_ERROR(3);
        
        private final int mCode;

        SocketEvent(int i) {
            this.mCode = i;
        }

        public int getCode() {
            return this.mCode;
        }
    }

    FlipperObject onAuthenticationChallengeReceived();

    void onConnectionEvent(SocketEvent socketEvent);

    void onMessageReceived(String str);
}
