package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class h<E> extends e64 {
    private final Activity a;
    @NonNull
    private final Context b;
    @NonNull
    private final Handler c;
    private final int d;
    final FragmentManager e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(@NonNull d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // defpackage.e64
    public View c(int i) {
        return null;
    }

    @Override // defpackage.e64
    public boolean d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Context f() {
        return this.b;
    }

    @NonNull
    public Handler g() {
        return this.c;
    }

    public abstract E i();

    @NonNull
    public LayoutInflater j() {
        return LayoutInflater.from(this.b);
    }

    public boolean l(@NonNull String str) {
        return false;
    }

    public void m(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            iu1.l(this.b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void n(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            l5.y(this.a, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    h(Activity activity, @NonNull Context context, @NonNull Handler handler, int i) {
        this.e = new k();
        this.a = activity;
        this.b = (Context) kh8.g(context, "context == null");
        this.c = (Handler) kh8.g(handler, "handler == null");
        this.d = i;
    }

    public void o() {
    }

    @Deprecated
    public void k(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
    }

    public void h(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
    }
}
