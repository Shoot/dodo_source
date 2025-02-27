package com.facebook.flipper.core;
/* loaded from: classes2.dex */
public interface FlipperClient {
    void addPlugin(FlipperPlugin flipperPlugin);

    <T extends FlipperPlugin> T getPlugin(String str);

    <T extends FlipperPlugin> T getPluginByClass(Class<T> cls);

    String getState();

    StateSummary getStateSummary();

    void removePlugin(FlipperPlugin flipperPlugin);

    void start();

    void stop();

    void subscribeForUpdates(FlipperStateUpdateListener flipperStateUpdateListener);

    void unsubscribe();
}
