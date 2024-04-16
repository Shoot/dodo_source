package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
/* loaded from: classes2.dex */
public class FirebaseRemoteConfigClientException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigClientException(@NonNull String str) {
        super(str);
    }

    public FirebaseRemoteConfigClientException(@NonNull String str, Throwable th) {
        super(str, th);
    }

    public FirebaseRemoteConfigClientException(@NonNull String str, @NonNull FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
    }

    public FirebaseRemoteConfigClientException(@NonNull String str, Throwable th, @NonNull FirebaseRemoteConfigException.a aVar) {
        super(str, th, aVar);
    }
}
