package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;
/* loaded from: classes2.dex */
public class FirebaseRemoteConfigException extends FirebaseException {
    private final a a;

    /* loaded from: classes2.dex */
    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);
        
        private final int a;

        a(int i) {
            this.a = i;
        }
    }

    public FirebaseRemoteConfigException(@NonNull String str) {
        super(str);
        this.a = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(@NonNull String str, Throwable th) {
        super(str, th);
        this.a = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(@NonNull String str, @NonNull a aVar) {
        super(str);
        this.a = aVar;
    }

    public FirebaseRemoteConfigException(@NonNull String str, Throwable th, @NonNull a aVar) {
        super(str, th);
        this.a = aVar;
    }
}
