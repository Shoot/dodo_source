package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class LifecycleCallback {
    @NonNull
    protected final kp5 a;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(@NonNull kp5 kp5Var) {
        this.a = kp5Var;
    }

    @NonNull
    protected static kp5 c(@NonNull gp5 gp5Var) {
        if (gp5Var.d()) {
            return yuc.ih(gp5Var.b());
        }
        if (gp5Var.c()) {
            return qqc.c(gp5Var.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @NonNull
    public static kp5 d(@NonNull Activity activity) {
        return c(new gp5(activity));
    }

    @Keep
    private static kp5 getChimeraLifecycleFragmentImpl(gp5 gp5Var) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @NonNull
    public Activity b() {
        Activity mc = this.a.mc();
        gh8.j(mc);
        return mc;
    }

    public void g() {
    }

    public void h() {
    }

    public void j() {
    }

    public void k() {
    }

    public void f(Bundle bundle) {
    }

    public void i(@NonNull Bundle bundle) {
    }

    public void e(int i, int i2, @NonNull Intent intent) {
    }

    public void a(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
    }
}
