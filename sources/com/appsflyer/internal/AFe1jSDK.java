package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class AFe1jSDK extends AFa1sSDK {
    private final boolean AFLogger$LogLevel;
    public boolean AFVersionDeclaration;
    private final boolean getLevel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFe1jSDK() {
        this(null, null, null, null, null, null);
    }

    public final boolean AFVersionDeclaration() {
        return this.AFVersionDeclaration;
    }

    public final boolean afErrorLogForExcManagerOnly() {
        return this.AFLogger$LogLevel;
    }

    public final boolean afWarnLog() {
        return this.getLevel;
    }

    public AFe1jSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        this.AFLogger$LogLevel = bool != null ? bool.booleanValue() : true;
        this.getLevel = bool2 != null ? bool2.booleanValue() : true;
    }
}
