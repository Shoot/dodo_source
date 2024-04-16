package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ep5;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        int i;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
            i = applicationInfo.minSdkVersion;
            return String.valueOf(i);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return i(installerPackageName);
        }
        return "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bm1<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bs2.c());
        arrayList.add(eq2.g());
        arrayList.add(ep5.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(ep5.b("fire-core", "20.4.2"));
        arrayList.add(ep5.b("device-name", i(Build.PRODUCT)));
        arrayList.add(ep5.b("device-model", i(Build.DEVICE)));
        arrayList.add(ep5.b("device-brand", i(Build.BRAND)));
        arrayList.add(ep5.c("android-target-sdk", new ep5.a() { // from class: tv3
            @Override // defpackage.ep5.a
            public final String a(Object obj) {
                String e;
                e = FirebaseCommonRegistrar.e((Context) obj);
                return e;
            }
        }));
        arrayList.add(ep5.c("android-min-sdk", new ep5.a() { // from class: uv3
            @Override // defpackage.ep5.a
            public final String a(Object obj) {
                String f;
                f = FirebaseCommonRegistrar.f((Context) obj);
                return f;
            }
        }));
        arrayList.add(ep5.c("android-platform", new ep5.a() { // from class: vv3
            @Override // defpackage.ep5.a
            public final String a(Object obj) {
                String g;
                g = FirebaseCommonRegistrar.g((Context) obj);
                return g;
            }
        }));
        arrayList.add(ep5.c("android-installer", new ep5.a() { // from class: wv3
            @Override // defpackage.ep5.a
            public final String a(Object obj) {
                String h;
                h = FirebaseCommonRegistrar.h((Context) obj);
                return h;
            }
        }));
        String a = ih5.a();
        if (a != null) {
            arrayList.add(ep5.b("kotlin", a));
        }
        return arrayList;
    }
}
