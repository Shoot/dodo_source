package com.appsflyer.internal.components.network.http.exceptions;

import android.support.annotation.NonNull;
import com.appsflyer.internal.AFc1dSDK;
import java.io.IOException;
/* loaded from: classes.dex */
public class ParsingException extends IOException {
    @NonNull
    private final AFc1dSDK<String> values;

    public ParsingException(String str, Throwable th, @NonNull AFc1dSDK<String> aFc1dSDK) {
        super(str, th);
        this.values = aFc1dSDK;
    }

    @NonNull
    public AFc1dSDK<String> getRawResponse() {
        return this.values;
    }
}
