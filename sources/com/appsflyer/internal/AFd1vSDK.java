package com.appsflyer.internal;

import java.util.TimerTask;
/* loaded from: classes.dex */
public final class AFd1vSDK extends TimerTask {
    private final Thread AFInAppEventParameterName;

    public AFd1vSDK(Thread thread) {
        this.AFInAppEventParameterName = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.AFInAppEventParameterName.interrupt();
    }
}
