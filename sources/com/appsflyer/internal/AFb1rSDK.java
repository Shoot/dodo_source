package com.appsflyer.internal;

import com.appsflyer.AFLogger;
/* loaded from: classes.dex */
public final class AFb1rSDK implements AFa1xSDK {
    private final AFa1xSDK AFKeystoreWrapper = this;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum AFa1wSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");
        
        private final String AFLogger$LogLevel;
        private final String AppsFlyer2dXConversionCallback;

        AFa1wSDK(String str, String str2) {
            this.AFLogger$LogLevel = str;
            this.AppsFlyer2dXConversionCallback = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface AFa1xSDK {
        Class<?> values(String str) throws ClassNotFoundException;
    }

    private boolean AFInAppEventType(String str) {
        try {
            this.AFKeystoreWrapper.values(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException e) {
            StringBuilder sb2 = new StringBuilder("Class: ");
            sb2.append(str);
            sb2.append(" is  not found. (Platform extension)");
            AFLogger.afErrorLogForExcManagerOnly(sb2.toString(), e, true);
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    public final String values() {
        AFa1wSDK[] values;
        for (AFa1wSDK aFa1wSDK : AFa1wSDK.values()) {
            if (AFInAppEventType(aFa1wSDK.AppsFlyer2dXConversionCallback)) {
                return aFa1wSDK.AFLogger$LogLevel;
            }
        }
        return AFa1wSDK.DEFAULT.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFb1rSDK.AFa1xSDK
    public final Class<?> values(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }
}
