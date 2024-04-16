package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;
/* loaded from: classes2.dex */
public class FirebaseInstallationsException extends FirebaseException {
    @NonNull
    private final a a;

    /* loaded from: classes2.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(@NonNull a aVar) {
        this.a = aVar;
    }

    public FirebaseInstallationsException(@NonNull String str, @NonNull a aVar) {
        super(str);
        this.a = aVar;
    }
}
