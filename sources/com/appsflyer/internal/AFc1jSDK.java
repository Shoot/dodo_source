package com.appsflyer.internal;
/* loaded from: classes.dex */
public class AFc1jSDK {
    public final long values;

    public AFc1jSDK(long j) {
        this.values = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.values == ((AFc1jSDK) obj).values) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.values;
        return (int) (j ^ (j >>> 32));
    }
}
