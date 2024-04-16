package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.appsflyer.AFInAppEventType;
/* loaded from: classes.dex */
public final class AFe1dSDK extends AFe1aSDK {
    public AFe1dSDK(@NonNull Context context) {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE, context);
    }

    @Override // com.appsflyer.internal.AFa1sSDK
    public final AFa1sSDK AFInAppEventType(String str) {
        return super.AFInAppEventType(AFInAppEventParameterName(str));
    }

    @Override // com.appsflyer.internal.AFa1sSDK
    public final AFd1wSDK values() {
        return AFd1wSDK.PURCHASE_VALIDATE;
    }
}
