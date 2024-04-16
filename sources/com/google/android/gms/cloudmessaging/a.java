package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes2.dex */
public abstract class a extends BroadcastReceiver {
    private static SoftReference a;

    private final int e(@NonNull Context context, @NonNull Intent intent) {
        y6b c;
        if (intent.getExtras() == null) {
            return 500;
        }
        CloudMessage cloudMessage = new CloudMessage(intent);
        if (TextUtils.isEmpty(cloudMessage.k())) {
            c = o7b.e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", cloudMessage.k());
            Integer p = cloudMessage.p();
            if (p != null) {
                bundle.putInt("google.product_id", p.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            c = r.b(context).c(2, bundle);
        }
        int b = b(context, cloudMessage);
        try {
            o7b.b(c, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
        }
        return b;
    }

    private final int f(@NonNull Context context, @NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        String action = intent.getAction();
        if (action != "com.google.firebase.messaging.NOTIFICATION_DISMISS" && (action == null || !action.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS"))) {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
        c(context, extras);
        return -1;
    }

    @NonNull
    protected Executor a() {
        ExecutorService executorService;
        synchronized (a.class) {
            try {
                SoftReference softReference = a;
                if (softReference != null) {
                    executorService = (ExecutorService) softReference.get();
                } else {
                    executorService = null;
                }
                if (executorService == null) {
                    awc.a();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new rs6("firebase-iid-executor")));
                    a = new SoftReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    protected abstract int b(@NonNull Context context, @NonNull CloudMessage cloudMessage);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        Intent intent2;
        int e;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                intent2 = (Intent) parcelableExtra;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                e = f(context, intent2);
            } else {
                e = e(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(e);
            }
            pendingResult.finish();
        } catch (Throwable th) {
            pendingResult.finish();
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull final Context context, @NonNull final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        a().execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.f
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }

    protected void c(@NonNull Context context, @NonNull Bundle bundle) {
    }
}
