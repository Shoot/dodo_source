package com.appsflyer.internal;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes.dex */
public final class AFc1eSDK {
    final String AFKeystoreWrapper;
    final String valueOf;

    public AFc1eSDK(String str, String str2) {
        z65.h(str, "");
        z65.h(str2, "");
        this.valueOf = str;
        this.AFKeystoreWrapper = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1eSDK)) {
            return false;
        }
        AFc1eSDK aFc1eSDK = (AFc1eSDK) obj;
        if (z65.c(this.valueOf, aFc1eSDK.valueOf) && z65.c(this.AFKeystoreWrapper, aFc1eSDK.AFKeystoreWrapper)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.valueOf.hashCode() * 31) + this.AFKeystoreWrapper.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostConfig(prefix=");
        sb.append(this.valueOf);
        sb.append(", host=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}
