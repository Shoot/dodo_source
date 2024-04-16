package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class AFb1wSDK {
    @VisibleForTesting
    public static long AFInAppEventType = 500;
    public static AFa1xSDK values;

    /* loaded from: classes.dex */
    public interface AFa1xSDK {
        void valueOf(Activity activity);

        void values(Context context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void values(Context context, AFa1xSDK aFa1xSDK, Executor executor) {
        values = aFa1xSDK;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(executor);
        if (context instanceof Activity) {
            anonymousClass5.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(anonymousClass5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.AFb1wSDK$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass5 implements Application.ActivityLifecycleCallbacks {
        boolean AFInAppEventParameterName;
        private /* synthetic */ Executor valueOf;
        boolean values = true;

        AnonymousClass5(Executor executor) {
            this.valueOf = executor;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NonNull final Activity activity, Bundle bundle) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1wSDK.5.1
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1qSDK.AFInAppEventParameterName();
                    Intent intent = activity.getIntent();
                    if (AFa1qSDK.valueOf(intent) != null && intent != AFa1qSDK.values) {
                        AFa1qSDK.values = intent;
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NonNull final Activity activity) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1wSDK.5.2
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass5.this.values = true;
                    final Context applicationContext = activity.getApplicationContext();
                    try {
                        new Timer().schedule(new TimerTask() { // from class: com.appsflyer.internal.AFb1wSDK.5.2.2
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public final void run() {
                                AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                if (anonymousClass5.AFInAppEventParameterName && anonymousClass5.values) {
                                    anonymousClass5.AFInAppEventParameterName = false;
                                    try {
                                        AFb1wSDK.values.values(applicationContext);
                                    } catch (Exception e) {
                                        AFLogger.afErrorLog("Listener threw exception! ", e);
                                    }
                                }
                            }
                        }, AFb1wSDK.AFInAppEventType);
                    } catch (Throwable th) {
                        AFLogger.afErrorLog("Background task failed with a throwable: ", th);
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1wSDK.5.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (!AnonymousClass5.this.AFInAppEventParameterName) {
                        try {
                            AFb1wSDK.values.valueOf(activity);
                        } catch (Exception e) {
                            AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
                        }
                    }
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    anonymousClass5.values = false;
                    anonymousClass5.AFInAppEventParameterName = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
