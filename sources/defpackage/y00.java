package defpackage;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: y00  reason: default package */
/* loaded from: classes2.dex */
public class y00 {
    private static final long a = TimeUnit.MINUTES.toMillis(10);
    static long b = SystemClock.elapsedRealtime();

    @RecentlyNullable
    public static Status a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void b(@RecentlyNonNull Intent intent, Status status) {
        if (status == null) {
            intent.removeExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        } else {
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", status);
        }
    }

    public static <TResult extends x00> void c(@RecentlyNonNull y6b<TResult> y6bVar, @RecentlyNonNull Activity activity, int i) {
        btc b2 = btc.b(y6bVar);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i2 = b2.a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i2);
        bundle.putInt("requestCode", i);
        bundle.putLong("initializationElapsedRealtime", b);
        suc sucVar = new suc();
        sucVar.setArguments(bundle);
        int i3 = b2.a;
        StringBuilder sb = new StringBuilder(58);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i3);
        beginTransaction.add(sucVar, sb.toString()).commit();
    }

    public static <TResult> void g(@RecentlyNonNull Status status, TResult tresult, @RecentlyNonNull a7b<TResult> a7bVar) {
        if (status.v()) {
            a7bVar.c(tresult);
        } else {
            a7bVar.b(jm.a(status));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Activity activity, int i, int i2, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i, intent, 1073741824);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
                return;
            }
            return;
        }
        try {
            createPendingResult.send(i2);
        } catch (PendingIntent.CanceledException e) {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Exception sending pending result", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Activity activity, int i, y6b<? extends x00> y6bVar) {
        int i2;
        if (activity.isFinishing()) {
            if (Log.isLoggable("AutoResolveHelper", 3)) {
                Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                return;
            }
            return;
        }
        Exception l = y6bVar.l();
        if (l instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) l).d(activity, i);
                return;
            } catch (IntentSender.SendIntentException e) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Error starting pending intent!", e);
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        if (y6bVar.q()) {
            y6bVar.m().a(intent);
            i2 = -1;
        } else {
            if (l instanceof ApiException) {
                ApiException apiException = (ApiException) l;
                b(intent, new Status(apiException.b(), apiException.getMessage(), (PendingIntent) null));
            } else {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Unexpected non API exception!", l);
                }
                b(intent, new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
            }
            i2 = 1;
        }
        h(activity, i, i2, intent);
    }
}
