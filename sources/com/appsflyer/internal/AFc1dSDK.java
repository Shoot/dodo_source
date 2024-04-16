package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class AFc1dSDK<Body> implements ResponseNetwork<Body> {
    final int AFInAppEventParameterName;
    @NonNull
    public final AFc1jSDK AFInAppEventType;
    @NonNull
    private final Body AFKeystoreWrapper;
    @NonNull
    final Map<String, List<String>> valueOf;
    final boolean values;

    public AFc1dSDK(@NonNull Body body, int i, boolean z, Map<String, List<String>> map, @NonNull AFc1jSDK aFc1jSDK) {
        this.AFKeystoreWrapper = body;
        this.AFInAppEventParameterName = i;
        this.values = z;
        this.valueOf = new HashMap(map);
        this.AFInAppEventType = aFc1jSDK;
    }

    @Nullable
    public final String AFInAppEventType(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField != null && !headerField.isEmpty()) {
            Iterator<String> it = headerField.iterator();
            StringBuilder sb = new StringBuilder(it.next());
            while (it.hasNext()) {
                sb.append(", ");
                sb.append(it.next());
            }
            return sb.toString();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFc1dSDK aFc1dSDK = (AFc1dSDK) obj;
        if (this.AFInAppEventParameterName != aFc1dSDK.AFInAppEventParameterName || this.values != aFc1dSDK.values || !this.AFKeystoreWrapper.equals(aFc1dSDK.AFKeystoreWrapper) || !this.valueOf.equals(aFc1dSDK.valueOf)) {
            return false;
        }
        return this.AFInAppEventType.equals(aFc1dSDK.AFInAppEventType);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @Nullable
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.valueOf.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.valueOf.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.AFInAppEventParameterName;
    }

    public int hashCode() {
        return (((((((this.AFKeystoreWrapper.hashCode() * 31) + this.AFInAppEventParameterName) * 31) + (this.values ? 1 : 0)) * 31) + this.valueOf.hashCode()) * 31) + this.AFInAppEventType.hashCode();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.values;
    }
}
