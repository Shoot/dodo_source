package com.facebook.flipper.android;

import android.os.Process;
/* loaded from: classes2.dex */
class FlipperThread extends Thread {
    private EventBase mEventBase;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlipperThread(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized EventBase getEventBase() {
        EventBase eventBase;
        while (true) {
            eventBase = this.mEventBase;
            if (eventBase == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return eventBase;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        synchronized (this) {
            this.mEventBase = new EventBase();
            notifyAll();
        }
        this.mEventBase.loopForever();
    }
}
