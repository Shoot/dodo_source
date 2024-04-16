package com.facebook.flipper.android;

import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperResponder;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
@DoNotStrip
/* loaded from: classes2.dex */
class FlipperResponderImpl implements FlipperResponder {
    private final HybridData mHybridData;

    static {
        zpa.d("flipper");
    }

    private FlipperResponderImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.flipper.core.FlipperResponder
    public native void error(FlipperObject flipperObject);

    @Override // com.facebook.flipper.core.FlipperResponder
    public void success(FlipperObject flipperObject) {
        successObject(flipperObject);
    }

    public native void successArray(FlipperArray flipperArray);

    public native void successObject(FlipperObject flipperObject);

    @Override // com.facebook.flipper.core.FlipperResponder
    public void success(FlipperArray flipperArray) {
        successArray(flipperArray);
    }

    @Override // com.facebook.flipper.core.FlipperResponder
    public void success() {
        successObject(new FlipperObject.Builder().build());
    }
}
