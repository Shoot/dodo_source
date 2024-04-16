package com.facebook.flipper.core;
/* loaded from: classes2.dex */
public interface FlipperResponder {
    void error(FlipperObject flipperObject);

    void success();

    void success(FlipperArray flipperArray);

    void success(FlipperObject flipperObject);
}
