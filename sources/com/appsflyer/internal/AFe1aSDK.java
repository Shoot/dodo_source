package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class AFe1aSDK extends AFe1jSDK {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AFe1aSDK() {
        this(null, null, null);
    }

    @Override // com.appsflyer.internal.AFa1sSDK
    public final boolean afDebugLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1sSDK
    public final boolean afErrorLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1sSDK
    public final boolean afRDLog() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFe1aSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Context context) {
        super(str, null, Boolean.FALSE, null, bool, context);
    }
}
