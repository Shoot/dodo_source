package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    @NonNull
    public static IllegalStateException a(@NonNull y6b<?> y6bVar) {
        String str;
        if (!y6bVar.p()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception l = y6bVar.l();
        if (l != null) {
            str = "failure";
        } else if (y6bVar.q()) {
            str = "result ".concat(String.valueOf(y6bVar.m()));
        } else if (y6bVar.o()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), l);
    }
}
