package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
/* loaded from: classes2.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics b;
    private final jvc a;

    private FirebaseAnalytics(jvc jvcVar) {
        gh8.j(jvcVar);
        this.a = jvcVar;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(jvc.g(context));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Keep
    public static u2d getScionFrontendApiImplementation(Context context, Bundle bundle) {
        jvc h = jvc.h(context, null, null, null, bundle);
        if (h == null) {
            return null;
        }
        return new a(h);
    }

    public final void a(@NonNull String str, Bundle bundle) {
        this.a.m(str, bundle);
    }

    @NonNull
    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) o7b.b(c.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        this.a.j(activity, str, str2);
    }
}
