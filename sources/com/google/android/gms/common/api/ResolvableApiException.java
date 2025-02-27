package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@NonNull Status status) {
        super(status);
    }

    @NonNull
    public PendingIntent c() {
        return a().k();
    }

    public void d(@NonNull Activity activity, int i) throws IntentSender.SendIntentException {
        a().w(activity, i);
    }
}
