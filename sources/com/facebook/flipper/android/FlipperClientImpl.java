package com.facebook.flipper.android;

import com.facebook.flipper.core.FlipperClient;
import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.core.FlipperStateUpdateListener;
import com.facebook.flipper.core.StateSummary;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.HashMap;
import java.util.Map;
@DoNotStrip
/* loaded from: classes2.dex */
class FlipperClientImpl implements FlipperClient {
    private final Map<Class<?>, String> mClassIdentifierMap = new HashMap(8);
    private final HybridData mHybridData;

    static {
        zpa.d("flipper");
    }

    private FlipperClientImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static native FlipperClientImpl getInstance();

    public static native void init(EventBase eventBase, EventBase eventBase2, int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    @Override // com.facebook.flipper.core.FlipperClient
    public void addPlugin(FlipperPlugin flipperPlugin) {
        this.mClassIdentifierMap.put(flipperPlugin.getClass(), flipperPlugin.getId());
        addPluginNative(flipperPlugin);
    }

    public native void addPluginNative(FlipperPlugin flipperPlugin);

    @Override // com.facebook.flipper.core.FlipperClient
    @Deprecated
    public native <T extends FlipperPlugin> T getPlugin(String str);

    @Override // com.facebook.flipper.core.FlipperClient
    public <T extends FlipperPlugin> T getPluginByClass(Class<T> cls) {
        return (T) getPlugin(this.mClassIdentifierMap.get(cls));
    }

    @Override // com.facebook.flipper.core.FlipperClient
    public native String getState();

    @Override // com.facebook.flipper.core.FlipperClient
    public native StateSummary getStateSummary();

    @Override // com.facebook.flipper.core.FlipperClient
    public void removePlugin(FlipperPlugin flipperPlugin) {
        this.mClassIdentifierMap.remove(flipperPlugin.getClass());
        removePluginNative(flipperPlugin);
    }

    public native void removePluginNative(FlipperPlugin flipperPlugin);

    @Override // com.facebook.flipper.core.FlipperClient
    public native void start();

    @Override // com.facebook.flipper.core.FlipperClient
    public native void stop();

    @Override // com.facebook.flipper.core.FlipperClient
    public native void subscribeForUpdates(FlipperStateUpdateListener flipperStateUpdateListener);

    @Override // com.facebook.flipper.core.FlipperClient
    public native void unsubscribe();
}
