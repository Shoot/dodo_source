package com.facebook.flipper.android;

import com.facebook.jni.HybridClassBase;
import com.facebook.proguard.annotations.DoNotStrip;
@DoNotStrip
/* loaded from: classes2.dex */
class EventBase extends HybridClassBase {
    static {
        zpa.d("flipper");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EventBase() {
        initHybrid();
    }

    @DoNotStrip
    private native void initHybrid();

    /* JADX INFO: Access modifiers changed from: package-private */
    @DoNotStrip
    public native void loopForever();
}
