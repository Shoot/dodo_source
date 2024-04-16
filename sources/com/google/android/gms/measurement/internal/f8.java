package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class f8 implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ z6 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f8(z6 z6Var) {
        this.a = z6Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8 A[Catch: RuntimeException -> 0x0028, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0028, blocks: (B:3:0x000b, B:5:0x0018, B:11:0x002c, B:13:0x0032, B:17:0x0043, B:47:0x00c8, B:49:0x00d4, B:53:0x00e5, B:55:0x00eb, B:59:0x0100, B:61:0x0106, B:64:0x0113, B:66:0x0119, B:67:0x012e, B:68:0x013a, B:71:0x0141, B:75:0x0164, B:77:0x0180, B:76:0x0171, B:79:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x0199, B:87:0x019f, B:89:0x01a7, B:91:0x01af, B:93:0x01b5, B:95:0x01bb, B:21:0x0057, B:24:0x005f, B:26:0x0067, B:28:0x006d, B:30:0x0073, B:32:0x0079, B:34:0x0081, B:36:0x0089, B:39:0x0093, B:41:0x009b, B:42:0x00a7, B:44:0x00bf), top: B:99:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0141 A[Catch: RuntimeException -> 0x0028, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0028, blocks: (B:3:0x000b, B:5:0x0018, B:11:0x002c, B:13:0x0032, B:17:0x0043, B:47:0x00c8, B:49:0x00d4, B:53:0x00e5, B:55:0x00eb, B:59:0x0100, B:61:0x0106, B:64:0x0113, B:66:0x0119, B:67:0x012e, B:68:0x013a, B:71:0x0141, B:75:0x0164, B:77:0x0180, B:76:0x0171, B:79:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x0199, B:87:0x019f, B:89:0x01a7, B:91:0x01af, B:93:0x01b5, B:95:0x01bb, B:21:0x0057, B:24:0x005f, B:26:0x0067, B:28:0x006d, B:30:0x0073, B:32:0x0079, B:34:0x0081, B:36:0x0089, B:39:0x0093, B:41:0x009b, B:42:0x00a7, B:44:0x00bf), top: B:99:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.google.android.gms.measurement.internal.f8 r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f8.a(com.google.android.gms.measurement.internal.f8, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        boolean z;
        try {
            try {
                this.a.n().J().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    this.a.r().E(activity, bundle);
                    return;
                }
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                        }
                    }
                    data = null;
                }
                Uri uri = data;
                if (uri != null && uri.isHierarchical()) {
                    this.a.h();
                    if (jb.e0(intent)) {
                        str = "gs";
                    } else {
                        str = "auto";
                    }
                    String str2 = str;
                    String queryParameter = uri.getQueryParameter("referrer");
                    if (bundle == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.a.k().C(new i8(this, z, uri, str2, queryParameter));
                    this.a.r().E(activity, bundle);
                }
            } catch (RuntimeException e) {
                this.a.n().F().b("Throwable caught in onActivityCreated", e);
                this.a.r().E(activity, bundle);
            }
        } finally {
            this.a.r().E(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.r().D(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.a.r().P(activity);
        ea t = this.a.t();
        t.k().C(new ha(t, t.b().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ea t = this.a.t();
        t.k().C(new da(t, t.b().b()));
        this.a.r().R(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.a.r().Q(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
