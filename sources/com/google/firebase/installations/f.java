package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.a;
/* compiled from: InstallationTokenResult.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class f {

    /* compiled from: InstallationTokenResult.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        @NonNull
        public abstract f a();

        @NonNull
        public abstract a b(@NonNull String str);

        @NonNull
        public abstract a c(long j);

        @NonNull
        public abstract a d(long j);
    }

    @NonNull
    public static a a() {
        return new a.b();
    }

    @NonNull
    public abstract String b();

    @NonNull
    public abstract long c();

    @NonNull
    public abstract long d();
}
