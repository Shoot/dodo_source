package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
/* loaded from: classes2.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    private final int b;

    public FirebaseRemoteConfigServerException(int i, @NonNull String str) {
        super(str);
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, Throwable th) {
        super(str, th);
        this.b = i;
    }

    public FirebaseRemoteConfigServerException(@NonNull String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.b = -1;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.b = i;
    }
}
