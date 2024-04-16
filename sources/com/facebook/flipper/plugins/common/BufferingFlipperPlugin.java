package com.facebook.flipper.plugins.common;

import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
/* loaded from: classes2.dex */
public abstract class BufferingFlipperPlugin implements FlipperPlugin {
    private static final int BUFFER_SIZE = 500;
    private FlipperConnection mConnection;
    private RingBuffer<CachedFlipperEvent> mEventQueue;
    private MockResponseConnectionListener mMockResponseConnectionListenerConnectionListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class CachedFlipperEvent {
        final FlipperObject flipperObject;
        final String method;

        private CachedFlipperEvent(String str, FlipperObject flipperObject) {
            this.method = str;
            this.flipperObject = flipperObject;
        }
    }

    /* loaded from: classes2.dex */
    public interface MockResponseConnectionListener {
        void onConnect(FlipperConnection flipperConnection);

        void onDisconnect();
    }

    private synchronized void sendBufferedEvents() {
        try {
            RingBuffer<CachedFlipperEvent> ringBuffer = this.mEventQueue;
            if (ringBuffer != null && this.mConnection != null) {
                for (CachedFlipperEvent cachedFlipperEvent : ringBuffer.asList()) {
                    this.mConnection.send(cachedFlipperEvent.method, cachedFlipperEvent.flipperObject);
                }
                this.mEventQueue.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized FlipperConnection getConnection() {
        return this.mConnection;
    }

    public synchronized boolean isConnected() {
        boolean z;
        if (this.mConnection != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public synchronized void onConnect(FlipperConnection flipperConnection) {
        this.mConnection = flipperConnection;
        sendBufferedEvents();
        MockResponseConnectionListener mockResponseConnectionListener = this.mMockResponseConnectionListenerConnectionListener;
        if (mockResponseConnectionListener != null) {
            mockResponseConnectionListener.onConnect(flipperConnection);
        }
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public synchronized void onDisconnect() {
        this.mConnection = null;
        MockResponseConnectionListener mockResponseConnectionListener = this.mMockResponseConnectionListenerConnectionListener;
        if (mockResponseConnectionListener != null) {
            mockResponseConnectionListener.onDisconnect();
        }
    }

    public synchronized void removeConnectionListener() {
        this.mMockResponseConnectionListenerConnectionListener = null;
    }

    @Override // com.facebook.flipper.core.FlipperPlugin
    public boolean runInBackground() {
        return true;
    }

    public synchronized void send(String str, FlipperObject flipperObject) {
        try {
            if (this.mEventQueue == null) {
                this.mEventQueue = new RingBuffer<>(BUFFER_SIZE);
            }
            FlipperConnection flipperConnection = this.mConnection;
            if (flipperConnection != null) {
                flipperConnection.send(str, flipperObject);
            } else {
                this.mEventQueue.enqueue(new CachedFlipperEvent(str, flipperObject));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setConnectionListener(MockResponseConnectionListener mockResponseConnectionListener) {
        this.mMockResponseConnectionListenerConnectionListener = mockResponseConnectionListener;
    }
}
