package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFf1uSDK;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class AFf1vSDK extends AFf1uSDK {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AFf1vSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFInAppEventParameterName(Context context, AFb1lSDK<Map<String, Object>> aFb1lSDK) {
        AFb1zSDK.AFInAppEventType();
        if (AFb1zSDK.AFInAppEventParameterName(AFb1zSDK.AFInAppEventType(context), false) <= 0 && aFb1lSDK.values()) {
            aFb1lSDK.values.AFInAppEventParameterName().execute(aFb1lSDK.valueOf);
            this.afRDLog = System.currentTimeMillis();
            this.afDebugLog = AFf1uSDK.AFa1ySDK.STARTED;
            addObserver(new AFf1uSDK.AnonymousClass2());
        }
    }
}
