package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.d;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public class e {
    @NonNull
    public static <L> d<L> a(@NonNull L l, @NonNull Looper looper, @NonNull String str) {
        gh8.k(l, "Listener must not be null");
        gh8.k(looper, "Looper must not be null");
        gh8.k(str, "Listener type must not be null");
        return new d<>(looper, l, str);
    }

    @NonNull
    public static <L> d.a<L> b(@NonNull L l, @NonNull String str) {
        gh8.k(l, "Listener must not be null");
        gh8.k(str, "Listener type must not be null");
        gh8.g(str, "Listener type must not be empty");
        return new d.a<>(l, str);
    }
}
