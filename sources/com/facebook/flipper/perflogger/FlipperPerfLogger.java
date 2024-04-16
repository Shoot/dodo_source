package com.facebook.flipper.perflogger;
/* loaded from: classes2.dex */
public interface FlipperPerfLogger {
    void cancelMarker(String str);

    void endMarker(String str);

    void startMarker(String str);
}
