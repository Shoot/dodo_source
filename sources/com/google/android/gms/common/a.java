package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.k17;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {yjc.class, dkc.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes2.dex */
public class a extends b {
    private String c;
    private static final Object e = new Object();
    private static final a f = new a();
    public static final int d = b.a;

    @NonNull
    public static a m() {
        return f;
    }

    @Override // com.google.android.gms.common.b
    public Intent b(Context context, int i, String str) {
        return super.b(context, i, str);
    }

    @Override // com.google.android.gms.common.b
    public PendingIntent c(@NonNull Context context, int i, int i2) {
        return super.c(context, i, i2);
    }

    @Override // com.google.android.gms.common.b
    @NonNull
    public final String e(int i) {
        return super.e(i);
    }

    @Override // com.google.android.gms.common.b
    @ResultIgnorabilityUnspecified
    public int g(@NonNull Context context) {
        return super.g(context);
    }

    @Override // com.google.android.gms.common.b
    public int h(@NonNull Context context, int i) {
        return super.h(context, i);
    }

    @Override // com.google.android.gms.common.b
    public final boolean j(int i) {
        return super.j(i);
    }

    public Dialog k(@NonNull Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i, lkc.b(activity, b(activity, i, DateTokenConverter.CONVERTER_KEY), i2), onCancelListener, null);
    }

    public PendingIntent l(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        if (connectionResult.t()) {
            return connectionResult.p();
        }
        return c(context, connectionResult.h(), 0);
    }

    @ResultIgnorabilityUnspecified
    public boolean n(@NonNull Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k = k(activity, i, i2, onCancelListener);
        if (k == null) {
            return false;
        }
        s(activity, k, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(@NonNull Context context, int i) {
        t(context, i, null, d(context, i, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Dialog p(@NonNull Context context, int i, lkc lkcVar, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(cjc.d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = cjc.c(context, i);
        if (c != null) {
            if (lkcVar == null) {
                lkcVar = onClickListener;
            }
            builder.setPositiveButton(c, lkcVar);
        }
        String g = cjc.g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    @NonNull
    public final Dialog q(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(cjc.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @ResultIgnorabilityUnspecified
    public final bjc r(Context context, ajc ajcVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        bjc bjcVar = new bjc(ajcVar);
        zkc.n(context, bjcVar, intentFilter);
        bjcVar.a(context);
        if (!i(context, "com.google.android.gms")) {
            ajcVar.a();
            bjcVar.b();
            return null;
        }
        return bjcVar;
    }

    final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.d) {
                p2b.gh(dialog, onCancelListener).show(((androidx.fragment.app.d) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        hk3.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    final void t(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            u(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String f2 = cjc.f(context, i);
            String e2 = cjc.e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) gh8.j(context.getSystemService(RemoteMessageConst.NOTIFICATION));
            k17.e J = new k17.e(context).B(true).l(true).r(f2).J(new k17.c().q(e2));
            if (z13.c(context)) {
                gh8.m(ad8.e());
                J.H(context.getApplicationInfo().icon).E(2);
                if (z13.d(context)) {
                    J.a(cx8.a, resources.getString(u09.o), pendingIntent);
                } else {
                    J.p(pendingIntent);
                }
            } else {
                J.H(17301642).K(resources.getString(u09.h)).N(System.currentTimeMillis()).p(pendingIntent).q(e2);
            }
            if (ad8.h()) {
                gh8.m(ad8.h());
                synchronized (e) {
                    str2 = this.c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String b = cjc.b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(it8.a("com.google.android.gms.availability", b, 4));
                    } else {
                        name = notificationChannel.getName();
                        if (!b.contentEquals(name)) {
                            notificationChannel.setName(b);
                            notificationManager.createNotificationChannel(notificationChannel);
                        }
                    }
                }
                J.m(str2);
            }
            Notification b2 = J.b();
            if (i != 1 && i != 2 && i != 3) {
                i2 = 39789;
            } else {
                d.b.set(false);
                i2 = 10436;
            }
            notificationManager.notify(i2, b2);
        }
    }

    final void u(Context context) {
        new f(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean v(@NonNull Activity activity, @NonNull kp5 kp5Var, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog p = p(activity, i, lkc.c(kp5Var, b(activity, i, DateTokenConverter.CONVERTER_KEY), 2), onCancelListener, null);
        if (p == null) {
            return false;
        }
        s(activity, p, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(@NonNull Context context, @NonNull ConnectionResult connectionResult, int i) {
        PendingIntent l;
        if (h55.a(context) || (l = l(context, connectionResult)) == null) {
            return false;
        }
        t(context, connectionResult.h(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, l, i, true), clc.a | 134217728));
        return true;
    }
}
